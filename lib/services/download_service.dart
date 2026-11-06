import 'dart:io';
import 'package:path_provider/path_provider.dart';
import 'package:permission_handler/permission_handler.dart';
import 'package:http/http.dart' as http;
import '../models/social_status.dart';
import 'notification_service.dart';

class DownloadService {
  static final DownloadService _instance = DownloadService._internal();
  factory DownloadService() => _instance;
  DownloadService._internal();

  String? _statusSaverPath;

  /// Obtener la ruta de la carpeta principal de la app
  String getStatusSaverPath() {
    return _statusSaverPath ?? '/storage/emulated/0/StatusKeep';
  }

  Future<bool> _ensureDownloadPermission() async {
    if (!Platform.isAndroid) return true;

    final storageStatus = await Permission.storage.status;
    if (storageStatus.isGranted) return true;

    final manageStatus = await Permission.manageExternalStorage.status;
    if (manageStatus.isGranted) return true;

    final requestedStorage = await Permission.storage.request();
    if (requestedStorage.isGranted) return true;

    final requestedManage = await Permission.manageExternalStorage.request();
    if (requestedManage.isGranted) return true;

    return false;
  }

  /// Crear la estructura de carpetas para WhatsApp
  Future<void> _createStatusSaverStructure({bool usePublicStorage = true}) async {
    try {
      if (usePublicStorage) {
        final rootPath = '/storage/emulated/0/StatusKeep';
        final whatsappPath = '$rootPath/WhatsApp';
        final rootDir = Directory(rootPath);
        final whatsappDir = Directory(whatsappPath);

        if (!await rootDir.exists()) {
          await rootDir.create(recursive: true);
          print('✅ Carpeta creada: $rootPath');
        }

        if (!await whatsappDir.exists()) {
          await whatsappDir.create(recursive: true);
          print('✅ Carpeta creada: $whatsappPath');
        }

        _statusSaverPath = rootPath;
        return;
      }
    } catch (e) {
      print('❌ Error al crear carpeta en raíz: $e');
    }

    try {
      final appDir = await getApplicationDocumentsDirectory();
      final fallbackPath = '${appDir.path}/StatusKeep/WhatsApp';
      final fallbackDir = Directory(fallbackPath);

      if (!await fallbackDir.exists()) {
        await fallbackDir.create(recursive: true);
        print('✅ Carpeta creada (fallback): $fallbackPath');
      }

      _statusSaverPath = '${appDir.path}/StatusKeep';
    } catch (fallbackError) {
      print('❌ Error al crear carpeta fallback: $fallbackError');
      throw Exception('No se pudo crear la carpeta de descargas');
    }
  }

  /// Descargar un estado de WhatsApp
  Future<String?> downloadStatus(SocialStatus status) async {
    try {
      final canUsePublicStorage = await _ensureDownloadPermission();
      await _createStatusSaverStructure(usePublicStorage: canUsePublicStorage);

      // Obtener la ruta de destino
      final destinationPath = await _getDestinationPath(status);
      
      // Si el archivo ya existe localmente, copiarlo
      if (status.localPath != null && await File(status.localPath!).exists()) {
        final sourceFile = File(status.localPath!);
        final destinationFile = File(destinationPath);
        
        await sourceFile.copy(destinationPath);
        print('✅ Estado copiado: $destinationPath');
        
        // Notificar que se ha descargado un estado
        NotificationService().notifyDownload();
        
        return destinationPath;
      }
      
      // Si no existe localmente, intentar descargar desde URL
      if (status.mediaUrl.startsWith('http')) {
        final result = await _downloadFromUrl(status, destinationPath);
        
        // Notificar que se ha descargado un estado
        if (result != null) {
          NotificationService().notifyDownload();
        }
        
        return result;
      }
      
      throw Exception('No se pudo descargar el estado');
      
    } catch (e) {
      print('❌ Error al descargar estado: $e');
      throw Exception('Error al descargar: $e');
    }
  }

  /// Obtener la ruta de destino para el archivo
  Future<String> _getDestinationPath(SocialStatus status) async {
    final basePath = getStatusSaverPath();
    final fileName = _generateFileName(status);
    return '$basePath/WhatsApp/$fileName';
  }

  /// Generar nombre de archivo único
  String _generateFileName(SocialStatus status) {
    final timestamp = DateTime.now().millisecondsSinceEpoch;
    final extension = _getFileExtension(status.mediaType);
    final originalName = status.title.replaceAll(RegExp(r'[^\w\s-]'), '');
    return '${originalName}_$timestamp.$extension';
  }

  /// Obtener extensión de archivo según el tipo de medio
  String _getFileExtension(MediaType mediaType) {
    switch (mediaType) {
      case MediaType.image:
        return 'jpg';
      case MediaType.video:
        return 'mp4';
      case MediaType.audio:
        return 'mp3';
    }
  }

  /// Descargar archivo desde URL
  Future<String?> _downloadFromUrl(SocialStatus status, String destinationPath) async {
    try {
      final response = await http.get(Uri.parse(status.mediaUrl));
      
      if (response.statusCode == 200) {
        final file = File(destinationPath);
        await file.writeAsBytes(response.bodyBytes);
        print('✅ Estado descargado: $destinationPath');
        return destinationPath;
      } else {
        throw Exception('Error HTTP: ${response.statusCode}');
      }
    } catch (e) {
      print('❌ Error al descargar desde URL: $e');
      throw Exception('Error al descargar desde URL: $e');
    }
  }

  /// Obtener estadísticas de descargas
  Future<Map<String, int>> getDownloadStats() async {
    try {
      final basePath = getStatusSaverPath();
      final whatsappDir = Directory('$basePath/WhatsApp');
      
      if (!await whatsappDir.exists()) {
        return {'WhatsApp': 0};
      }

      int count = 0;
      await for (final entity in whatsappDir.list()) {
        if (entity is File) {
          count++;
        }
      }

      return {'WhatsApp': count};
    } catch (e) {
      print('❌ Error al obtener estadísticas: $e');
      return {'WhatsApp': 0};
    }
  }

  /// Obtener lista de archivos descargados
  Future<List<File>> getDownloadedFiles() async {
    try {
      final basePath = getStatusSaverPath();
      final whatsappDir = Directory('$basePath/WhatsApp');
      
      if (!await whatsappDir.exists()) {
        return [];
      }

      List<File> files = [];
      await for (final entity in whatsappDir.list()) {
        if (entity is File) {
          files.add(entity);
        }
      }

      return files;
    } catch (e) {
      print('❌ Error al obtener archivos descargados: $e');
      return [];
    }
  }

  /// Eliminar archivo descargado
  Future<bool> deleteDownloadedFile(String filePath) async {
    try {
      final file = File(filePath);
      if (await file.exists()) {
        await file.delete();
        print('✅ Archivo eliminado: $filePath');
        return true;
      }
      return false;
    } catch (e) {
      print('❌ Error al eliminar archivo: $e');
      return false;
    }
  }

  /// Abrir carpeta de descargas
  Future<void> openDownloadsFolder() async {
    try {
      final basePath = getStatusSaverPath();
      final whatsappDir = Directory('$basePath/WhatsApp');
      
      if (await whatsappDir.exists()) {
        // En Android, podemos intentar abrir con un intent
        // Por ahora, solo mostramos la ruta
        print('📁 Carpeta de descargas: ${whatsappDir.path}');
      }
    } catch (e) {
      print('❌ Error al abrir carpeta: $e');
    }
  }

  /// Obtener estados descargados como SocialStatus
  Future<List<SocialStatus>> getDownloadedStatuses() async {
    try {
      final basePath = getStatusSaverPath();
      final whatsappDir = Directory('$basePath/WhatsApp');
      
      print('🔍 Buscando archivos en: ${whatsappDir.path}');
      
      if (!await whatsappDir.exists()) {
        print('❌ La carpeta WhatsApp no existe: ${whatsappDir.path}');
        return [];
      }

      List<SocialStatus> statuses = [];
      int totalFiles = 0;
      int processedFiles = 0;

      await for (final entity in whatsappDir.list()) {
        if (entity is File) {
          totalFiles++;
          try {
            final fileName = entity.path.split('/').last;
            final extension = fileName.split('.').last.toLowerCase();
            
            print('📁 Procesando archivo: $fileName (extensión: $extension)');
            
            // Determinar tipo de medio por extensión
            MediaType? mediaType;
            switch (extension) {
              case 'jpg':
              case 'jpeg':
              case 'png':
              case 'gif':
              case 'webp':
                mediaType = MediaType.image;
                break;
              case 'mp4':
              case 'avi':
              case 'mov':
              case 'mkv':
                mediaType = MediaType.video;
                break;
              case 'mp3':
              case 'wav':
              case 'aac':
                mediaType = MediaType.audio;
                break;
              default:
                print('⚠️ Extensión no reconocida: $extension');
                continue; // Saltar archivos no reconocidos
            }

            // Obtener información del archivo
            final stat = await entity.stat();
            
            final status = SocialStatus(
              id: entity.path.hashCode.toString(),
              title: fileName,
              description: 'Estado guardado - ${_formatFileSize(stat.size)}',
              mediaUrl: entity.path,
              mediaType: mediaType,
              platform: SocialPlatform.whatsapp,
              createdAt: stat.modified,
              isDownloaded: true,
              localPath: entity.path,
            );
            
            statuses.add(status);
            processedFiles++;
            print('✅ Archivo procesado: $fileName (${mediaType.name})');
            
          } catch (e) {
            print('❌ Error procesando archivo ${entity.path}: $e');
          }
        }
      }

      print('📊 Resumen: $processedFiles de $totalFiles archivos procesados exitosamente');
      print('📊 Estados encontrados: ${statuses.length}');
      
      // Contar por tipo
      final imageCount = statuses.where((s) => s.mediaType == MediaType.image).length;
      final videoCount = statuses.where((s) => s.mediaType == MediaType.video).length;
      print('📊 Imágenes: $imageCount, Videos: $videoCount');

      return statuses;
    } catch (e) {
      print('❌ Error al obtener estados descargados: $e');
      return [];
    }
  }

  /// Formatear tamaño de archivo
  String _formatFileSize(int bytes) {
    if (bytes < 1024) return '$bytes B';
    if (bytes < 1024 * 1024) return '${(bytes / 1024).toStringAsFixed(1)} KB';
    return '${(bytes / (1024 * 1024)).toStringAsFixed(1)} MB';
  }
} 
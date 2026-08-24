import 'dart:async';
import 'dart:io';
import 'package:path_provider/path_provider.dart';
import '../models/social_status.dart';
import 'directory_access_service.dart';
import 'download_service.dart';
import 'notification_service.dart';

class AutoSaveService {
  static final AutoSaveService _instance = AutoSaveService._internal();
  factory AutoSaveService() => _instance;
  AutoSaveService._internal();

  final DirectoryAccessService _directoryService = DirectoryAccessService();
  final DownloadService _downloadService = DownloadService();
  final NotificationService _notificationService = NotificationService();
  
  Timer? _monitoringTimer;
  bool _isAutoSaveEnabled = false;
  bool _notificationsEnabled = false;
  Set<String> _processedFiles = <String>{};
  String? _lastScanPath;
  
  // Stream para notificar sobre nuevos estados
  final StreamController<List<SocialStatus>> _newStatusesController = 
      StreamController<List<SocialStatus>>.broadcast();
  
  Stream<List<SocialStatus>> get newStatusesStream => _newStatusesController.stream;

  bool get isAutoSaveEnabled => _isAutoSaveEnabled;
  bool get notificationsEnabled => _notificationsEnabled;

  /// Activa o desactiva el guardado automático
  Future<void> setAutoSaveEnabled(bool enabled) async {
    print('⚙️ Configurando auto-guardado: ${enabled ? "ACTIVADO" : "DESACTIVADO"}');
    _isAutoSaveEnabled = enabled;
    
    if (enabled) {
      print('🔄 Activando monitoreo...');
      await _startMonitoring();
    } else {
      print('⏹️ Desactivando monitoreo...');
      await _stopMonitoring();
    }
    print('✅ Auto-guardado configurado: ${enabled ? "ACTIVADO" : "DESACTIVADO"}');
  }

  /// Activa o desactiva las notificaciones
  Future<void> setNotificationsEnabled(bool enabled) async {
    _notificationsEnabled = enabled;
    
    if (enabled) {
      // Inicializar el servicio de notificaciones
      await _notificationService.initialize();
    }
    
    print('${enabled ? '✅' : '⏹️'} Notificaciones ${enabled ? 'activadas' : 'desactivadas'}');
  }

  /// Inicia el monitoreo de la carpeta de WhatsApp
  Future<void> _startMonitoring() async {
    print('🚀 Iniciando monitoreo de auto-guardado...');
    if (!_directoryService.hasAccess) {
      print('❌ No hay acceso al directorio de WhatsApp');
      return;
    }
    print('✅ Acceso al directorio confirmado');

    // Escanear archivos existentes para establecer la línea base
    print('📋 Escaneando archivos existentes...');
    await _scanExistingFiles();
    
    // Iniciar timer para monitorear cada 2 segundos
    print('⏰ Configurando timer de monitoreo cada 2 segundos...');
    _monitoringTimer = Timer.periodic(const Duration(seconds: 2), (timer) {
      print('🔄 Ejecutando verificación de archivos nuevos...');
      _checkForNewFiles();
    });
    
    print('✅ Guardado automático activado - Monitoreando cada 2 segundos');
  }

  /// Detiene el monitoreo
  Future<void> _stopMonitoring() async {
    _monitoringTimer?.cancel();
    _monitoringTimer = null;
    print('⏹️ Guardado automático desactivado');
  }

  /// Escanea archivos existentes para establecer la línea base
  Future<void> _scanExistingFiles() async {
    try {
      final statuses = await _directoryService.extractStatusesFromWhatsAppDirectory();
      _processedFiles.clear();
      
      for (final status in statuses) {
        if (status.localPath != null) {
          final fileName = _getFileName(status.localPath!);
          _processedFiles.add(fileName);
        }
      }
      
      _lastScanPath = await _directoryService.getWhatsAppStatusesPath();
      print('📋 Línea base establecida: ${_processedFiles.length} archivos existentes');
    } catch (e) {
      print('❌ Error al escanear archivos existentes: $e');
    }
  }

  /// Verifica si hay archivos nuevos
  Future<void> _checkForNewFiles() async {
    print('🔍 === INICIO VERIFICACIÓN DE ARCHIVOS NUEVOS ===');
    print('🔍 Auto-guardado habilitado: $_isAutoSaveEnabled');
    print('🔍 Acceso al directorio: ${_directoryService.hasAccess}');
    
    if (!_isAutoSaveEnabled || !_directoryService.hasAccess) {
      print('❌ Verificación cancelada: auto-guardado=${_isAutoSaveEnabled}, acceso=${_directoryService.hasAccess}');
      return;
    }

    try {
      final currentPath = await _directoryService.getWhatsAppStatusesPath();
      print('🔍 Ruta de estados: $currentPath');
      if (currentPath == null) {
        print('❌ No se pudo obtener la ruta de estados');
        return;
      }

      final directory = Directory(currentPath);
      print('🔍 Verificando si existe el directorio: ${directory.path}');
      if (!await directory.exists()) {
        print('❌ El directorio no existe: ${directory.path}');
        return;
      }
      print('✅ Directorio existe');

      final files = await directory.list().toList();
      final newFiles = <SocialStatus>[];

      print('🔍 Verificando ${files.length} archivos en la carpeta de estados...');

      for (final file in files) {
        if (file is File) {
          final fileName = _getFileName(file.path);
          
          print('📄 Verificando archivo: $fileName');
          
          // Verificar si es un archivo nuevo
          if (!_processedFiles.contains(fileName)) {
            print('🆕 Archivo nuevo detectado: $fileName');
            final status = await _createStatusFromFile(file);
            if (status != null) {
              newFiles.add(status);
              _processedFiles.add(fileName);
              
              print('⬇️ Iniciando descarga automática de: $fileName');
              // Descargar automáticamente el nuevo archivo
              await _autoDownloadStatus(status);
              print('✅ Descarga completada para: $fileName');
            }
          } else {
            print('📄 Archivo ya procesado: $fileName');
          }
        }
      }

      if (newFiles.isNotEmpty) {
        print('�� ${newFiles.length} nuevos estados encontrados y descargados automáticamente');
        _newStatusesController.add(newFiles);
        
        // Enviar notificación si está habilitada
        if (_notificationsEnabled) {
          if (newFiles.length == 1) {
            // Notificación individual
            final status = newFiles.first;
            final fileName = _getFileName(status.localPath ?? '');
            final mediaType = status.mediaType == MediaType.image ? 'image' : 'video';
            
            await _notificationService.showSingleStatusNotification(
              fileName: fileName,
              mediaType: mediaType,
              payload: 'new_status_${status.id}',
              contactName: status.author ?? 'Alguien',
            );
          } else {
            // Notificación múltiple
            await _notificationService.showMultipleStatusNotification(
              count: newFiles.length,
              payload: 'multiple_new_statuses',
            );
          }
        }
      } else {
        print('📄 No se encontraron archivos nuevos');
      }
      print('🔍 === FIN VERIFICACIÓN DE ARCHIVOS NUEVOS ===');
    } catch (e) {
      print('❌ Error al verificar archivos nuevos: $e');
      print('❌ Stack trace: ${StackTrace.current}');
    }
  }

  /// Crea un objeto SocialStatus desde un archivo
  Future<SocialStatus?> _createStatusFromFile(File file) async {
    try {
      final fileName = file.path.split('/').last;
      final extension = fileName.split('.').last.toLowerCase();
      
      // Usar nombre simple para el author
      final contactName = 'WhatsApp';
      
      MediaType mediaType;
      if (['jpg', 'jpeg', 'png', 'gif', 'webp'].contains(extension)) {
        mediaType = MediaType.image;
      } else if (['mp4', 'avi', 'mov', 'mkv'].contains(extension)) {
        mediaType = MediaType.video;
      } else {
        return null; // Tipo de archivo no soportado
      }

      final fileSize = await file.length();
      final lastModified = await file.lastModified();

      return SocialStatus(
        id: fileName,
        title: fileName,
        description: 'Estado de WhatsApp',
        mediaUrl: file.path,
        mediaType: mediaType,
        platform: SocialPlatform.whatsapp,
        createdAt: lastModified,
        author: contactName,
        isDownloaded: false,
        localPath: file.path,
      );
    } catch (e) {
      print('❌ Error al crear status desde archivo: $e');
      return null;
    }
  }

  /// Descarga automáticamente un estado
  Future<void> _autoDownloadStatus(SocialStatus status) async {
    try {
      print('🚀 Iniciando descarga automática...');
      if (status.localPath == null) {
        print('❌ Error: localPath es null');
        return;
      }
      
      final downloadsDir = await getExternalStorageDirectory();
      if (downloadsDir == null) {
        print('❌ Error: No se pudo obtener el directorio de descargas');
        return;
      }

      final statusSaverDir = Directory('${downloadsDir.path}/StatusSaver/WhatsApp');
      print('📁 Directorio de destino: ${statusSaverDir.path}');
      
      if (!await statusSaverDir.exists()) {
        print('📁 Creando directorio de destino...');
        await statusSaverDir.create(recursive: true);
      }

      final fileName = _getFileName(status.localPath!);
      final destinationPath = '${statusSaverDir.path}/$fileName';
      print('📄 Archivo origen: ${status.localPath}');
      print('📄 Archivo destino: $destinationPath');

      // Copiar archivo
      final sourceFile = File(status.localPath!);
      final destinationFile = File(destinationPath);
      
      print('📋 Copiando archivo...');
      await sourceFile.copy(destinationPath);
      
      print('✅ Estado descargado automáticamente: $fileName');
      
      // Actualizar el status como descargado usando copyWith
      final updatedStatus = status.copyWith(
        isDownloaded: true,
        localPath: destinationPath,
      );
      
      print('🔔 Notificando descarga completada...');
      // Notificar que se ha descargado un nuevo estado para recargar la app
      _notificationService.notifyDownload();
      
      // Reemplazar el status en la lista si es necesario
      // (esto se manejará en el UI cuando se actualice la lista)
      
    } catch (e) {
      print('❌ Error al descargar automáticamente: $e');
      print('❌ Stack trace: ${StackTrace.current}');
    }
  }

  /// Obtiene el nombre del archivo desde la ruta
  String _getFileName(String path) {
    return path.split('/').last;
  }

  /// Limpia recursos
  void dispose() {
    _stopMonitoring();
    _newStatusesController.close();
  }
} 
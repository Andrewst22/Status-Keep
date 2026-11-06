import 'dart:io';
import 'dart:async';
import 'package:file_picker/file_picker.dart';
import 'package:path_provider/path_provider.dart';
import 'package:permission_handler/permission_handler.dart';
import 'package:shared_preferences/shared_preferences.dart';
import '../models/social_status.dart';

class DirectoryAccessService {
  static final DirectoryAccessService _instance = DirectoryAccessService._internal();
  factory DirectoryAccessService() => _instance;
  DirectoryAccessService._internal();

  String? _whatsappDirectoryPath;
  bool _hasDirectoryAccess = false;
  List<SocialStatus> _cachedStatuses = [];
  static const String _prefsKeyDirectoryPath = 'whatsapp_directory_path';
  static const String _prefsKeyPermissionsGranted = 'permissions_granted';
  
  // Stream para notificar cambios en los permisos
  final StreamController<void> _permissionsResetController = StreamController<void>.broadcast();
  Stream<void> get permissionsResetStream => _permissionsResetController.stream;

  /// Verificar si ya tenemos acceso al directorio de WhatsApp
  bool get hasAccess => _hasDirectoryAccess && _whatsappDirectoryPath != null;

  /// Obtener la ruta del directorio de WhatsApp
  String? get whatsappDirectoryPath => _whatsappDirectoryPath;

  /// Inicializar y restaurar acceso si existe
  Future<void> init() async {
    try {
      final prefs = await SharedPreferences.getInstance();
      final savedPath = prefs.getString(_prefsKeyDirectoryPath);
      final permissionsGranted = prefs.getBool(_prefsKeyPermissionsGranted) ?? false;
      
      if (savedPath != null && permissionsGranted) {
        final dir = Directory(savedPath);
        if (await dir.exists()) {
          _whatsappDirectoryPath = savedPath;
          _hasDirectoryAccess = true;
          print('✅ Acceso restaurado a: $savedPath');
          
          // Hacer escaneo automático al restaurar
          await _scanWhatsAppAutomatically();
        } else {
          print('❌ Directorio guardado ya no existe: $savedPath');
          await prefs.remove(_prefsKeyDirectoryPath);
          await prefs.setBool(_prefsKeyPermissionsGranted, false);
        }
      }
    } catch (e) {
      print('❌ Error al restaurar acceso: $e');
    }
  }

  /// Obtener la ruta específica de los estados de WhatsApp
  Future<String?> getWhatsAppStatusesPath() async {
    if (!hasAccess) return null;
    
    try {
      // Intentar múltiples rutas posibles
      List<String> possiblePaths = [
        '$_whatsappDirectoryPath/com.whatsapp/WhatsApp/Media/.Statuses',
        '$_whatsappDirectoryPath/WhatsApp/Media/.Statuses',
        '$_whatsappDirectoryPath/.Statuses',
        '/storage/emulated/0/Android/media/com.whatsapp/WhatsApp/Media/.Statuses',
        '/storage/emulated/0/WhatsApp/Media/.Statuses',
      ];
      
      for (String path in possiblePaths) {
        final statusDir = Directory(path);
        if (await statusDir.exists()) {
          print('✅ Ruta de estados encontrada: $path');
          return statusDir.path;
        }
      }
      
      print('❌ No se encontró la carpeta .Statuses en ninguna ruta conocida');
      return null;
    } catch (e) {
      print('❌ Error al obtener ruta de estados: $e');
      return null;
    }
  }

  /// Solicitar acceso a Android/media usando file_picker
  Future<bool> requestWhatsAppDirectoryAccess() async {
    try {
      print('🔍 Solicitando acceso a la carpeta de WhatsApp...');
      
      // Verificar y solicitar permisos básicos primero
      if (Platform.isAndroid) {
        print('🔐 Verificando permisos básicos...');
        final storageStatus = await Permission.storage.status;
        final externalStorageStatus = await Permission.manageExternalStorage.status;

        print('📊 Estado de permisos:');
        print('   - Storage: ${storageStatus.name}');
        print('   - ManageExternalStorage: ${externalStorageStatus.name}');

        if (!storageStatus.isGranted && !externalStorageStatus.isGranted) {
          final requestedStorage = await Permission.storage.request();
          final requestedManage = await Permission.manageExternalStorage.request();

          if (!requestedStorage.isGranted && !requestedManage.isGranted) {
            print('❌ No se concedieron permisos de almacenamiento');
            print('🔧 Abriendo configuración de la app...');
            await openAppSettings();
            return false;
          }
        }
      }
      
      // Verificar si ya tenemos permisos
      final prefs = await SharedPreferences.getInstance();
      final permissionsGranted = prefs.getBool(_prefsKeyPermissionsGranted) ?? false;
      
      if (permissionsGranted && _whatsappDirectoryPath != null) {
        print('✅ Permisos ya concedidos anteriormente');
        return true;
      }
      
      // Usar file_picker para seleccionar la carpeta
      print('📁 Abriendo selector de carpetas...');
      String? selectedDirectory = await FilePicker.platform.getDirectoryPath(
        dialogTitle: 'Selecciona la carpeta Android/media',
        initialDirectory: Platform.isAndroid ? '/storage/emulated/0/Android/media' : null,
        lockParentWindow: true,
      );

      if (selectedDirectory != null) {
        print('✅ Directorio seleccionado: $selectedDirectory');
        
        // Verificar que sea la carpeta Android/media
        if (selectedDirectory.contains('Android/media')) {
          _whatsappDirectoryPath = selectedDirectory;
          _hasDirectoryAccess = true;
          
          // Guardar la ruta seleccionada
          await prefs.setString(_prefsKeyDirectoryPath, selectedDirectory);
          await prefs.setBool(_prefsKeyPermissionsGranted, true);
          
          print('✅ Acceso concedido a: $selectedDirectory');
          print('🔍 Iniciando escaneo automático...');
          
          // Hacer escaneo automático inmediatamente
          await _scanWhatsAppAutomatically();
          
          return true;
        } else {
          print('❌ Por favor selecciona la carpeta Android/media');
          print('💡 Navega a /storage/emulated/0/Android/media');
          return false;
        }
      } else {
        print('❌ No se seleccionó ningún directorio');
        return false;
      }
    } catch (e) {
      print('❌ Error al solicitar acceso al directorio: $e');
      return false;
    }
  }

  /// Buscar la ruta de WhatsApp directamente sin file_picker
  Future<String?> _findWhatsAppPathDirectly() async {
    try {
      List<String> possiblePaths = [
        '/storage/emulated/0/Android/media/com.whatsapp',
        '/storage/emulated/0/Android/media',
        '/storage/emulated/0/WhatsApp',
      ];
      
      for (String path in possiblePaths) {
        final dir = Directory(path);
        if (await dir.exists()) {
          print('✅ Ruta de WhatsApp encontrada directamente: $path');
          return path;
        }
      }
      
      return null;
    } catch (e) {
      print('❌ Error al buscar ruta directa: $e');
      return null;
    }
  }

  /// Extraer estados de WhatsApp desde Android/media
  Future<List<SocialStatus>> extractStatusesFromWhatsAppDirectory() async {
    if (!hasAccess) {
      print('❌ No hay acceso a Android/media');
      return [];
    }

    // Si ya tenemos estados cacheados del escaneo automático, usarlos
    if (_cachedStatuses.isNotEmpty) {
      print('📄 Usando ${_cachedStatuses.length} estados encontrados en escaneo automático');
      return _cachedStatuses;
    }

    List<SocialStatus> statuses = [];
    
    try {
      print('🔍 Buscando carpetas de WhatsApp en Android/media...');
      print('📍 Directorio base: $_whatsappDirectoryPath');
      
      // Buscar automáticamente las carpetas de WhatsApp
      final whatsappPaths = await _findWhatsAppDirectories();
      
      if (whatsappPaths.isEmpty) {
        print('❌ No se encontraron carpetas de WhatsApp en Android/media');
        print('💡 Asegúrate de que WhatsApp esté instalado');
        return [];
      }
      
      print('✅ Carpetas de WhatsApp encontradas: ${whatsappPaths.length}');
      
      // Buscar estados en cada carpeta de WhatsApp encontrada
      for (String whatsappPath in whatsappPaths) {
        print('🔍 Buscando estados en: $whatsappPath');
        
        final statusFiles = await _findStatusFiles(whatsappPath);
        statuses.addAll(statusFiles);
        
        print('📄 ${statusFiles.length} estados encontrados en $whatsappPath');
      }

      print('🎉 Total de estados encontrados: ${statuses.length}');
      
      if (statuses.isEmpty) {
        print('💡 Sugerencias:');
        print('   - Asegúrate de tener estados guardados en WhatsApp');
        print('   - Los estados se eliminan automáticamente después de 24 horas');
        print('   - Intenta crear un estado nuevo en WhatsApp y guardarlo');
      }
      
      return statuses;
      
    } catch (e) {
      print('❌ Error al extraer estados: $e');
      return [];
    }
  }

  /// Escaneo automático usando la ruta seleccionada por el usuario
  Future<void> _scanWhatsAppAutomatically() async {
    try {
      print('🔍 Escaneando automáticamente estados de WhatsApp...');
      
      // Limpiar cache anterior
      _cachedStatuses.clear();
      
      if (_whatsappDirectoryPath == null) {
        print('❌ No hay ruta de directorio configurada');
        return;
      }
      
      // Buscar la carpeta .Statuses en la ruta seleccionada
      String statusPath = '$_whatsappDirectoryPath/com.whatsapp/WhatsApp/Media/.Statuses';
      print('🔍 Escaneando: $statusPath');
      
      try {
        final dir = Directory(statusPath);
        if (await dir.exists()) {
          print('✅ Carpeta .Statuses encontrada: $statusPath');
          
          // Escanear solo archivos dentro de .Statuses
          final statusFiles = await _scanStatusDirectory(dir, SocialPlatform.whatsapp);
          print('📄 ${statusFiles.length} estados encontrados en $statusPath');
          _cachedStatuses.addAll(statusFiles);
        } else {
          print('❌ Carpeta .Statuses no encontrada en: $statusPath');
          print('💡 Asegúrate de que WhatsApp esté instalado y tenga estados guardados');
        }
      } catch (e) {
        print('⚠️ Error al verificar $statusPath: $e');
      }
      
      // Eliminar duplicados basados en la ruta del archivo
      final uniqueStatuses = <String, SocialStatus>{};
      for (final status in _cachedStatuses) {
        if (status.localPath != null) {
          uniqueStatuses[status.localPath!] = status;
        }
      }
      _cachedStatuses = uniqueStatuses.values.toList();
      
      print('🎉 Escaneo automático completado: ${_cachedStatuses.length} estados únicos encontrados');
      
      // Si no se encontró nada, mostrar información de diagnóstico
      if (_cachedStatuses.isEmpty) {
        print('❌ No se encontraron estados en .Statuses. Información de diagnóstico:');
        print('   - Verifica que WhatsApp esté instalado');
        print('   - Asegúrate de tener estados guardados en WhatsApp');
        print('   - Los estados se eliminan automáticamente después de 24 horas');
        print('   - Intenta crear un estado nuevo en WhatsApp');
        
        // Mostrar información sobre el directorio base
        if (_whatsappDirectoryPath != null) {
          print('   - Directorio base configurado: $_whatsappDirectoryPath');
          try {
            final baseDir = Directory(_whatsappDirectoryPath!);
            if (await baseDir.exists()) {
              final entities = await baseDir.list().toList();
              print('   - Contenido del directorio base: ${entities.length} elementos');
              for (final entity in entities.take(5)) {
                print('     - ${entity.path.split('/').last}');
              }
            }
          } catch (e) {
            print('   - Error al verificar directorio base: $e');
          }
        }
      }
      
    } catch (e) {
      print('❌ Error en escaneo automático: $e');
    }
  }

  /// Búsqueda específica de archivos con nombres de hash
  Future<void> _searchForHashFiles() async {
    try {
      List<String> searchPaths = [
        '/storage/emulated/0/Android/media',
        '/storage/emulated/0/Android/data',
        '/storage/emulated/0',
      ];
      
      for (String searchPath in searchPaths) {
        try {
          final dir = Directory(searchPath);
          if (await dir.exists()) {
            print('🔍 Buscando archivos con hash en: $searchPath');
            await _searchHashFilesRecursive(dir);
          }
        } catch (e) {
          print('⚠️ Error al buscar en $searchPath: $e');
        }
      }
    } catch (e) {
      print('❌ Error en búsqueda de archivos con hash: $e');
    }
  }

  /// Búsqueda recursiva de archivos con hash
  Future<void> _searchHashFilesRecursive(Directory dir) async {
    try {
      final entities = await dir.list().toList();
      
      for (final entity in entities) {
        if (entity is File) {
          final fileName = entity.path.split('/').last;
          // Los archivos de estados de WhatsApp suelen tener nombres como: 0bd4f78c6eb34b0da58c62a74a9cfb61.jpg
          if (fileName.length > 20 && fileName.contains('.') && !fileName.contains(' ')) {
            final ext = fileName.split('.').last.toLowerCase();
            if (['jpg', 'jpeg', 'png', 'mp4', 'avi', 'mov'].contains(ext)) {
              print('🔍 Archivo con posible hash encontrado: $fileName');
              
              try {
                final stat = await entity.stat();
                MediaType? mediaType = _getMediaType(ext);
                
                if (mediaType != null) {
                  print('✅ Agregando archivo con hash: $fileName (${mediaType.name})');
                  
                  _cachedStatuses.add(SocialStatus(
                    id: entity.path.hashCode.toString(),
                    title: fileName,
                    description: 'Estado de WhatsApp - ${_formatFileSize(stat.size)}',
                    mediaUrl: entity.path,
                    mediaType: mediaType,
                    platform: SocialPlatform.whatsapp,
                    createdAt: stat.modified,
                    isDownloaded: true,
                    localPath: entity.path,
                  ));
                }
              } catch (e) {
                print('⚠️ Error al procesar archivo con hash ${entity.path}: $e');
              }
            }
          }
        } else if (entity is Directory) {
          final dirName = entity.path.split('/').last;
          // Evitar buscar en directorios del sistema
          if (!dirName.startsWith('.') && 
              !['system', 'sys', 'proc', 'dev', 'tmp'].contains(dirName.toLowerCase())) {
            await _searchHashFilesRecursive(entity);
          }
        }
      }
    } catch (e) {
      print('⚠️ Error al buscar recursivamente en ${dir.path}: $e');
    }
  }

  /// Buscar carpetas de WhatsApp en Android/media
  Future<List<String>> _findWhatsAppDirectories() async {
    List<String> whatsappPaths = [];
    
    try {
      final mediaDir = Directory(_whatsappDirectoryPath!);
      final entities = await mediaDir.list().toList();
      
      print('📁 Escaneando Android/media (${entities.length} elementos)...');
      
      for (final entity in entities) {
        if (entity is Directory) {
          final dirName = entity.path.split('/').last;
          print('  📁 Carpeta encontrada: $dirName');
          
          // Buscar carpetas que contengan "whatsapp" o "com.whatsapp"
          if (dirName.toLowerCase().contains('whatsapp') || dirName.contains('com.whatsapp')) {
            print('    ✅ Carpeta de WhatsApp encontrada: $dirName');
            whatsappPaths.add(entity.path);
          }
        }
      }
    } catch (e) {
      print('❌ Error al buscar carpetas de WhatsApp: $e');
    }
    
    return whatsappPaths;
  }
  
  /// Buscar archivos de estados en una carpeta de WhatsApp
  Future<List<SocialStatus>> _findStatusFiles(String whatsappPath) async {
    List<SocialStatus> statuses = [];
    
    try {
      // Buscar la carpeta .Statuses en diferentes ubicaciones
      List<String> possibleStatusPaths = [
        '$whatsappPath/.Statuses',
        '$whatsappPath/Media/.Statuses',
        '$whatsappPath/WhatsApp/Media/.Statuses',
      ];
      
      for (String statusPath in possibleStatusPaths) {
        print('    🔍 Verificando: $statusPath');
        final statusDir = Directory(statusPath);
        
        if (await statusDir.exists()) {
          print('      ✅ Carpeta .Statuses encontrada: $statusPath');
          
          // Escanear archivos de estados
          final files = await _scanDirectory(statusDir, SocialPlatform.whatsapp);
          statuses.addAll(files);
          
          print('      📄 ${files.length} archivos encontrados en $statusPath');
          break; // Solo usar la primera carpeta .Statuses encontrada
        }
      }
    } catch (e) {
      print('❌ Error al buscar archivos de estados en $whatsappPath: $e');
    }
    
    return statuses;
  }

  /// Escanear únicamente la carpeta .Statuses de WhatsApp - ESCANEO AGRESIVO
  Future<List<SocialStatus>> _scanStatusDirectory(Directory dir, SocialPlatform platform) async {
    List<SocialStatus> statuses = [];
    
    try {
      print('    🔍 ESCANEO AGRESIVO de carpeta .Statuses...');
      print('    📍 Ruta completa: ${dir.path}');
      
      // Verificar si el directorio existe
      if (!await dir.exists()) {
        print('    ❌ El directorio no existe');
        return statuses;
      }
      
      // Verificar permisos antes de escanear
      print('    🔐 Verificando permisos de acceso...');
      
      // Diagnóstico detallado del directorio
      try {
        final stat = await dir.stat();
        print('    📊 Información del directorio:');
        print('      - Existe: ✅');
        print('      - Es directorio: ${stat.type == FileSystemEntityType.directory}');
        print('      - Permisos: ${stat.mode}');
        print('      - Última modificación: ${stat.modified}');
      } catch (e) {
        print('    ⚠️ Error al obtener información del directorio: $e');
      }
      
      // Método 1: Usar listSync() para archivos ocultos
      try {
        final entities = dir.listSync();
        print('      📋 Método listSync: ${entities.length} elementos encontrados');
        
        for (final entity in entities) {
          if (entity is File) {
            final fileName = entity.path.split('/').last;
            print('        📄 Archivo encontrado: $fileName');
            
            try {
              final stat = await entity.stat();
              print('          📊 Tamaño: ${_formatFileSize(stat.size)}');
              
              // Determinar tipo de medio por extensión
              final ext = fileName.split('.').last.toLowerCase();
              MediaType? mediaType = _getMediaType(ext);
              
              if (mediaType != null) {
                print('          ✅ Agregando archivo: $fileName (${mediaType.name})');
                
                statuses.add(SocialStatus(
                  id: entity.path.hashCode.toString(),
                  title: fileName,
                  description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                  mediaUrl: entity.path,
                  mediaType: mediaType,
                  platform: platform,
                  createdAt: stat.modified,
                  isDownloaded: true,
                  localPath: entity.path,
                ));
              }
            } catch (e) {
              print('          ⚠️ Error al procesar archivo ${entity.path}: $e');
            }
          }
        }
      } catch (e) {
        print('      ❌ Error con listSync: $e');
        
        // Método 2: Usar list() como respaldo
        try {
          print('      🔄 Intentando método list() como respaldo...');
          final entities = await dir.list().toList();
          print('      📋 Método list: ${entities.length} elementos encontrados');
          
          for (final entity in entities) {
            if (entity is File) {
              final fileName = entity.path.split('/').last;
              print('        📄 Archivo encontrado: $fileName');
              
              try {
                final stat = await entity.stat();
                final ext = fileName.split('.').last.toLowerCase();
                MediaType? mediaType = _getMediaType(ext);
                
                if (mediaType != null) {
                  print('          ✅ Agregando archivo: $fileName (${mediaType.name})');
                  
                  statuses.add(SocialStatus(
                    id: entity.path.hashCode.toString(),
                    title: fileName,
                    description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                    mediaUrl: entity.path,
                    mediaType: mediaType,
                    platform: platform,
                    createdAt: stat.modified,
                    isDownloaded: true,
                    localPath: entity.path,
                  ));
                }
              } catch (e) {
                print('          ⚠️ Error al procesar archivo ${entity.path}: $e');
              }
            }
          }
        } catch (e) {
          print('      ❌ Error con método list: $e');
        }
      }
      
      // Método 3: Búsqueda específica de archivos con hash (archivos ocultos típicos de WhatsApp)
      if (statuses.isEmpty) {
        print('      🔍 Búsqueda específica de archivos con hash...');
        try {
          final entities = dir.listSync();
          for (final entity in entities) {
            if (entity is File) {
              final fileName = entity.path.split('/').last;
              // Los archivos de estados de WhatsApp suelen tener nombres como: 0bd4f78c6eb34b0da58c62a74a9cfb61.jpg
              if (fileName.length > 20 && fileName.contains('.') && !fileName.contains(' ')) {
                final ext = fileName.split('.').last.toLowerCase();
                if (['jpg', 'jpeg', 'png', 'mp4', 'avi', 'mov'].contains(ext)) {
                  print('        🔍 Archivo con posible hash encontrado: $fileName');
                  
                  try {
                    final stat = await entity.stat();
                    MediaType? mediaType = _getMediaType(ext);
                    
                    if (mediaType != null) {
                      print('          ✅ Agregando archivo con hash: $fileName (${mediaType.name})');
                      
                      statuses.add(SocialStatus(
                        id: entity.path.hashCode.toString(),
                        title: fileName,
                        description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                        mediaUrl: entity.path,
                        mediaType: mediaType,
                        platform: platform,
                        createdAt: stat.modified,
                        isDownloaded: true,
                        localPath: entity.path,
                      ));
                    }
                  } catch (e) {
                    print('          ⚠️ Error al procesar archivo con hash ${entity.path}: $e');
                  }
                }
              }
            }
          }
        } catch (e) {
          print('      ❌ Error en búsqueda de archivos con hash: $e');
        }
      }
      
      // Método 4: Intentar acceso directo con rutas absolutas
      if (statuses.isEmpty) {
        print('      🔧 Intentando acceso directo con rutas absolutas...');
        try {
          List<String> possibleExtensions = ['jpg', 'jpeg', 'png', 'mp4', 'avi', 'mov'];
          
          for (String ext in possibleExtensions) {
            try {
              // Buscar archivos con extensión específica
              final files = dir.listSync().where((entity) => 
                entity is File && entity.path.toLowerCase().endsWith('.$ext')
              ).toList();
              
              print('        🔍 Archivos .$ext encontrados: ${files.length}');
              
              for (final file in files) {
                if (file is File) {
                  final fileName = file.path.split('/').last;
                  print('          📄 Archivo directo encontrado: $fileName');
                  
                  try {
                    final stat = await file.stat();
                    MediaType? mediaType = _getMediaType(ext);
                    
                    if (mediaType != null) {
                      print('            ✅ Agregando archivo directo: $fileName (${mediaType.name})');
                      
                      statuses.add(SocialStatus(
                        id: file.path.hashCode.toString(),
                        title: fileName,
                        description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                        mediaUrl: file.path,
                        mediaType: mediaType,
                        platform: platform,
                        createdAt: stat.modified,
                        isDownloaded: true,
                        localPath: file.path,
                      ));
                    }
                  } catch (e) {
                    print('            ⚠️ Error al procesar archivo directo ${file.path}: $e');
                  }
                }
              }
            } catch (e) {
              print('        ⚠️ Error al buscar archivos .$ext: $e');
            }
          }
        } catch (e) {
          print('      ❌ Error en acceso directo: $e');
        }
      }
      
      // Método 5: Intentar listar todos los archivos y mostrar información detallada
      if (statuses.isEmpty) {
        print('      🔍 Diagnóstico detallado: listando todos los archivos...');
        try {
          final allEntities = dir.listSync();
          print('      📋 Total de entidades encontradas: ${allEntities.length}');
          
          for (int i = 0; i < allEntities.length; i++) {
            final entity = allEntities[i];
            final entityName = entity.path.split('/').last;
            print('      📄 Entidad $i: $entityName (${entity.runtimeType})');
            
            if (entity is File) {
              try {
                final stat = await entity.stat();
                print('        📊 Tamaño: ${_formatFileSize(stat.size)}');
                print('        📅 Modificado: ${stat.modified}');
                print('        🔐 Permisos: ${stat.mode}');
              } catch (e) {
                print('        ⚠️ Error al obtener info: $e');
              }
            }
          }
        } catch (e) {
          print('      ❌ Error en diagnóstico detallado: $e');
        }
      }
      
      // MÉTODO 6: ESCANEO AGRESIVO - Intentar acceso directo con Process.run
      if (statuses.isEmpty) {
        print('      🔥 ESCANEO AGRESIVO: Usando comando ls...');
        try {
          final result = await Process.run('ls', ['-la', dir.path]);
          print('      📋 Comando ls ejecutado:');
          print('      stdout: ${result.stdout}');
          print('      stderr: ${result.stderr}');
          print('      exitCode: ${result.exitCode}');
          
          if (result.exitCode == 0) {
            final lines = result.stdout.toString().split('\n');
            for (final line in lines) {
              if (line.trim().isNotEmpty && !line.startsWith('total') && !line.startsWith('d')) {
                final parts = line.split(RegExp(r'\s+'));
                if (parts.length >= 9) {
                  final fileName = parts[8];
                  if (fileName.isNotEmpty && fileName != '.' && fileName != '..') {
                    print('        🔍 Archivo encontrado por ls: $fileName');
                    
                    // Verificar si es un archivo de estado
                    final ext = fileName.split('.').last.toLowerCase();
                    if (['jpg', 'jpeg', 'png', 'mp4', 'avi', 'mov'].contains(ext)) {
                      final filePath = '${dir.path}/$fileName';
                      final file = File(filePath);
                      
                      try {
                        final stat = await file.stat();
                        MediaType? mediaType = _getMediaType(ext);
                        
                        if (mediaType != null) {
                          print('          ✅ Agregando archivo por ls: $fileName (${mediaType.name})');
                          
                          statuses.add(SocialStatus(
                            id: filePath.hashCode.toString(),
                            title: fileName,
                            description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                            mediaUrl: filePath,
                            mediaType: mediaType,
                            platform: platform,
                            createdAt: stat.modified,
                            isDownloaded: true,
                            localPath: filePath,
                          ));
                        }
                      } catch (e) {
                        print('          ⚠️ Error al procesar archivo por ls $filePath: $e');
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (e) {
          print('      ❌ Error en escaneo agresivo con ls: $e');
        }
      }
      
      // MÉTODO 7: ESCANEO AGRESIVO - Intentar con find
      if (statuses.isEmpty) {
        print('      🔥 ESCANEO AGRESIVO: Usando comando find...');
        try {
          final result = await Process.run('find', [dir.path, '-type', 'f', '-name', '*']);
          print('      📋 Comando find ejecutado:');
          print('      stdout: ${result.stdout}');
          print('      stderr: ${result.stderr}');
          print('      exitCode: ${result.exitCode}');
          
          if (result.exitCode == 0) {
            final lines = result.stdout.toString().split('\n');
            for (final line in lines) {
              if (line.trim().isNotEmpty) {
                final fileName = line.split('/').last;
                print('        🔍 Archivo encontrado por find: $fileName');
                
                // Verificar si es un archivo de estado
                final ext = fileName.split('.').last.toLowerCase();
                if (['jpg', 'jpeg', 'png', 'mp4', 'avi', 'mov'].contains(ext)) {
                  final file = File(line);
                  
                  try {
                    final stat = await file.stat();
                    MediaType? mediaType = _getMediaType(ext);
                    
                    if (mediaType != null) {
                      print('          ✅ Agregando archivo por find: $fileName (${mediaType.name})');
                      
                      statuses.add(SocialStatus(
                        id: line.hashCode.toString(),
                        title: fileName,
                        description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                        mediaUrl: line,
                        mediaType: mediaType,
                        platform: platform,
                        createdAt: stat.modified,
                        isDownloaded: true,
                        localPath: line,
                      ));
                    }
                  } catch (e) {
                    print('          ⚠️ Error al procesar archivo por find $line: $e');
                  }
                }
              }
            }
          }
        } catch (e) {
          print('      ❌ Error en escaneo agresivo con find: $e');
        }
      }
      
      // MÉTODO 8: ESCANEO AGRESIVO - Intentar acceso directo con rutas conocidas
      if (statuses.isEmpty) {
        print('      🔥 ESCANEO AGRESIVO: Intentando rutas directas...');
        try {
          // Intentar acceder directamente a archivos con nombres típicos de WhatsApp
          List<String> possibleFileNames = [
            '0bd4f78c6eb34b0da58c62a74a9cfb61.jpg',
            '1a2b3c4d5e6f7890abcdef1234567890.jpg',
            'status_001.jpg',
            'status_002.jpg',
            'status_003.jpg',
            'status_001.mp4',
            'status_002.mp4',
          ];
          
          for (final fileName in possibleFileNames) {
            final filePath = '${dir.path}/$fileName';
            final file = File(filePath);
            
            if (await file.exists()) {
              print('        🔍 Archivo directo encontrado: $fileName');
              
              try {
                final stat = await file.stat();
                final ext = fileName.split('.').last.toLowerCase();
                MediaType? mediaType = _getMediaType(ext);
                
                if (mediaType != null) {
                  print('          ✅ Agregando archivo directo: $fileName (${mediaType.name})');
                  
                  statuses.add(SocialStatus(
                    id: filePath.hashCode.toString(),
                    title: fileName,
                    description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                    mediaUrl: filePath,
                    mediaType: mediaType,
                    platform: platform,
                    createdAt: stat.modified,
                    isDownloaded: true,
                    localPath: filePath,
                  ));
                }
              } catch (e) {
                print('          ⚠️ Error al procesar archivo directo $filePath: $e');
              }
            }
          }
        } catch (e) {
          print('      ❌ Error en escaneo agresivo con rutas directas: $e');
        }
      }
      
    } catch (e) {
      print('❌ Error general al escanear .Statuses: $e');
    }
    
    print('    🎯 Total de archivos procesados: ${statuses.length}');
    return statuses;
  }

  /// Escanear un directorio en busca de archivos de estados (incluyendo ocultos y subcarpetas)
  Future<List<SocialStatus>> _scanDirectory(Directory dir, SocialPlatform platform) async {
    List<SocialStatus> statuses = [];
    
    try {
      print('    🔍 Escaneando directorio y subcarpetas...');
      
      // Escanear recursivamente todas las subcarpetas
      await _scanDirectoryRecursive(dir, statuses, platform);
      
    } catch (e) {
      print('❌ Error general al listar directorio ${dir.path}: $e');
    }
    
    print('    🎯 Total de archivos procesados: ${statuses.length}');
    return statuses;
  }
  
  /// Escanear recursivamente un directorio y sus subcarpetas (incluyendo archivos ocultos)
  Future<void> _scanDirectoryRecursive(Directory dir, List<SocialStatus> statuses, SocialPlatform platform) async {
    try {
      print('    📁 Escaneando: ${dir.path}');
      
      // Verificar permisos antes de escanear
      print('    🔐 Verificando permisos de acceso...');
      
      // Método 1: Usar listSync() para archivos ocultos
      try {
        final entities = dir.listSync();
        print('      📋 Método listSync: ${entities.length} elementos encontrados');
        
        for (final entity in entities) {
        if (entity is File) {
            final fileName = entity.path.split('/').last;
            print('        📄 Archivo encontrado: $fileName');
            
            try {
              final stat = await entity.stat();
              print('          📊 Tamaño: ${_formatFileSize(stat.size)}');
              
              // Determinar tipo de medio por extensión
              final ext = fileName.split('.').last.toLowerCase();
              MediaType? mediaType = _getMediaType(ext);
              
              if (mediaType != null) {
                print('          ✅ Agregando archivo: $fileName (${mediaType.name})');
                
                statuses.add(SocialStatus(
                  id: entity.path.hashCode.toString(),
                  title: fileName,
                  description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                  mediaUrl: entity.path,
                  mediaType: mediaType,
                  platform: platform,
                  createdAt: stat.modified,
                  isDownloaded: true,
                  localPath: entity.path,
                ));
              }
            } catch (e) {
              print('          ⚠️ Error al procesar archivo ${entity.path}: $e');
            }
          } else if (entity is Directory) {
            final dirName = entity.path.split('/').last;
            print('        📁 Subcarpeta encontrada: $dirName');
            // Escanear recursivamente la subcarpeta
            await _scanDirectoryRecursive(entity, statuses, platform);
          }
        }
      } catch (e) {
        print('      ❌ Error con listSync: $e');
      }
      
      // Método 2: Usar list() como respaldo si listSync falla
      if (statuses.isEmpty) {
        try {
          print('      🔄 Intentando método list() como respaldo...');
          await for (final entity in dir.list()) {
            if (entity is File) {
              final fileName = entity.path.split('/').last;
              print('        📄 Archivo encontrado (list): $fileName');
              
              try {
                final stat = await entity.stat();
                final ext = fileName.split('.').last.toLowerCase();
                MediaType? mediaType = _getMediaType(ext);
                
                if (mediaType != null) {
                  print('          ✅ Agregando archivo: $fileName (${mediaType.name})');
                  
                  statuses.add(SocialStatus(
                    id: entity.path.hashCode.toString(),
                    title: fileName,
                    description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                    mediaUrl: entity.path,
                    mediaType: mediaType,
                    platform: platform,
                    createdAt: stat.modified,
                    isDownloaded: true,
                    localPath: entity.path,
                  ));
                }
              } catch (e) {
                print('          ⚠️ Error al procesar archivo ${entity.path}: $e');
              }
            } else if (entity is Directory) {
              final dirName = entity.path.split('/').last;
              print('        📁 Subcarpeta encontrada (list): $dirName');
              await _scanDirectoryRecursive(entity, statuses, platform);
            }
          }
        } catch (e) {
          print('      ❌ Error con list(): $e');
        }
      }
      
      // Método 3: Búsqueda específica de archivos con hash (nombres de estados de WhatsApp)
      if (statuses.isEmpty) {
        try {
          print('      🔍 Búsqueda específica de archivos con hash...');
          final entities = dir.listSync();
          
          for (final entity in entities) {
            if (entity is File) {
              final fileName = entity.path.split('/').last;
              // Los archivos de estados de WhatsApp suelen tener nombres como: 0bd4f78c6eb34b0da58c62a74a9cfb61.jpg
              if (fileName.length > 20 && fileName.contains('.')) {
                print('        🔍 Archivo con posible hash encontrado: $fileName');
                
                try {
                  final stat = await entity.stat();
                  final ext = fileName.split('.').last.toLowerCase();
                  MediaType? mediaType = _getMediaType(ext);
                  
                  if (mediaType != null) {
                    print('          ✅ Agregando archivo con hash: $fileName (${mediaType.name})');
              
              statuses.add(SocialStatus(
                id: entity.path.hashCode.toString(),
                title: fileName,
                description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                mediaUrl: entity.path,
                mediaType: mediaType,
                platform: platform,
                createdAt: stat.modified,
                isDownloaded: true,
                localPath: entity.path,
              ));
                  }
                } catch (e) {
                  print('          ⚠️ Error al procesar archivo con hash ${entity.path}: $e');
                }
              }
            }
          }
        } catch (e) {
          print('      ❌ Error en búsqueda específica: $e');
        }
      }
      
      // Método 4: Intentar acceso directo usando rutas absolutas
      if (statuses.isEmpty) {
        try {
          print('      🔧 Intentando acceso directo con rutas absolutas...');
          
          // Intentar acceder directamente a archivos conocidos
          List<String> possibleExtensions = ['jpg', 'jpeg', 'png', 'mp4', 'avi', 'mov'];
          
          for (String ext in possibleExtensions) {
            try {
              // Buscar archivos con extensión específica
              final files = dir.listSync().where((entity) => 
                entity is File && entity.path.toLowerCase().endsWith('.$ext')
              ).toList();
              
              print('        🔍 Archivos .$ext encontrados: ${files.length}');
              
              for (final file in files) {
                if (file is File) {
                  final fileName = file.path.split('/').last;
                  print('          📄 Archivo directo encontrado: $fileName');
                  
                  try {
                    final stat = await file.stat();
                    MediaType? mediaType = _getMediaType(ext);
                    
                    if (mediaType != null) {
                      print('            ✅ Agregando archivo directo: $fileName (${mediaType.name})');
                      
                      statuses.add(SocialStatus(
                        id: file.path.hashCode.toString(),
                        title: fileName,
                        description: 'Estado de ${platform.name} - ${_formatFileSize(stat.size)}',
                        mediaUrl: file.path,
                        mediaType: mediaType,
                        platform: platform,
                        createdAt: stat.modified,
                        isDownloaded: true,
                        localPath: file.path,
                      ));
                    }
                  } catch (e) {
                    print('            ⚠️ Error al procesar archivo directo ${file.path}: $e');
                  }
                }
              }
            } catch (e) {
              print('        ⚠️ Error al buscar archivos .$ext: $e');
            }
          }
        } catch (e) {
          print('      ❌ Error en acceso directo: $e');
        }
      }
      
    } catch (e) {
      print('    ❌ Error general al escanear ${dir.path}: $e');
    }
  }

  /// Formatear tamaño de archivo
  String _formatFileSize(int bytes) {
    if (bytes < 1024) return '$bytes B';
    if (bytes < 1024 * 1024) return '${(bytes / 1024).toStringAsFixed(1)} KB';
    return '${(bytes / (1024 * 1024)).toStringAsFixed(1)} MB';
  }

  /// Obtener tipo de medio basado en extensión
  MediaType? _getMediaType(String ext) {
    if (["jpg", "jpeg", "png", "gif", "webp"].contains(ext)) return MediaType.image;
    if (["mp4", "avi", "mov", "mkv"].contains(ext)) return MediaType.video;
    if (["mp3", "wav", "aac"].contains(ext)) return MediaType.audio;
    return null;
  }

  /// Limpiar acceso al directorio
  Future<void> clearAccess() async {
    try {
      final prefs = await SharedPreferences.getInstance();
      await prefs.remove(_prefsKeyDirectoryPath);
      await prefs.remove(_prefsKeyPermissionsGranted);
      _whatsappDirectoryPath = null;
      _hasDirectoryAccess = false;
      _cachedStatuses.clear();
      print('✅ Acceso al directorio limpiado');
    } catch (e) {
      print('❌ Error al limpiar acceso: $e');
    }
  }

  /// Verificar si los permisos están concedidos
  Future<bool> checkPermissions() async {
    try {
      final prefs = await SharedPreferences.getInstance();
      return prefs.getBool(_prefsKeyPermissionsGranted) ?? false;
    } catch (e) {
      print('❌ Error al verificar permisos: $e');
      return false;
    }
  }

  /// Función de diagnóstico para verificar el estado del sistema
  Future<Map<String, dynamic>> diagnoseSystem() async {
    Map<String, dynamic> diagnosis = {
      'whatsappInstalled': false,
      'permissionsGranted': false,
      'accessGranted': false,
      'possiblePaths': [],
      'errors': [],
      'recommendations': [],
    };

    try {
      print('🔍 Iniciando diagnóstico del sistema...');

      // Verificar permisos
      diagnosis['permissionsGranted'] = await checkPermissions();
      print('📊 Permisos concedidos: ${diagnosis['permissionsGranted']}');

      // Verificar acceso al directorio
      diagnosis['accessGranted'] = hasAccess;
      print('📊 Acceso al directorio: ${diagnosis['accessGranted']}');

      // Verificar rutas posibles
      List<String> possiblePaths = [
        '/storage/emulated/0/Android/media/com.whatsapp',
        '/storage/emulated/0/Android/data/com.whatsapp',
        '/storage/emulated/0/WhatsApp',
        '/storage/emulated/0/Android/media',
        '/storage/emulated/0/Android/data',
      ];

      for (String path in possiblePaths) {
        try {
          final dir = Directory(path);
          if (await dir.exists()) {
            diagnosis['possiblePaths'].add({
              'path': path,
              'exists': true,
              'readable': true,
            });
            print('✅ Ruta accesible: $path');
          }
        } catch (e) {
          diagnosis['possiblePaths'].add({
            'path': path,
            'exists': false,
            'error': e.toString(),
          });
          print('❌ Ruta no accesible: $path - $e');
        }
      }

      // Verificar si WhatsApp está instalado (buscar carpetas relacionadas)
      bool whatsappFound = false;
      for (var pathInfo in diagnosis['possiblePaths']) {
        if (pathInfo['exists'] && 
            (pathInfo['path'].contains('com.whatsapp') || pathInfo['path'].contains('WhatsApp'))) {
          whatsappFound = true;
          break;
        }
      }
      diagnosis['whatsappInstalled'] = whatsappFound;

      // Generar recomendaciones
      if (!diagnosis['permissionsGranted']) {
        diagnosis['recommendations'].add('Conceder permisos de almacenamiento');
      }
      if (!diagnosis['whatsappInstalled']) {
        diagnosis['recommendations'].add('Verificar que WhatsApp esté instalado');
      }
      if (diagnosis['possiblePaths'].isEmpty) {
        diagnosis['recommendations'].add('Verificar permisos de acceso a archivos');
      }
      if (diagnosis['possiblePaths'].isNotEmpty && !whatsappFound) {
        diagnosis['recommendations'].add('WhatsApp puede estar en una ubicación diferente');
      }

      print('🎉 Diagnóstico completado');
      return diagnosis;

    } catch (e) {
      diagnosis['errors'].add(e.toString());
      print('❌ Error en diagnóstico: $e');
      return diagnosis;
    }
  }

  /// Forzar un nuevo escaneo completo
  Future<List<SocialStatus>> forceRescan() async {
    try {
      print('🔄 Forzando nuevo escaneo completo...');
      
      // Limpiar cache
      _cachedStatuses.clear();
      
      // Realizar escaneo automático
      await _scanWhatsAppAutomatically();
      
      print('✅ Escaneo forzado completado: ${_cachedStatuses.length} estados encontrados');
      return _cachedStatuses;
      
    } catch (e) {
      print('❌ Error en escaneo forzado: $e');
      return [];
    }
  }

  /// Reiniciar permisos y acceso guardado
  Future<void> resetPermissions() async {
    try {
      print('🔄 Reiniciando permisos...');
      
      // Limpiar acceso guardado
      await clearAccess();
      
      // Limpiar permisos de SharedPreferences
      final prefs = await SharedPreferences.getInstance();
      await prefs.remove(_prefsKeyDirectoryPath);
      await prefs.remove(_prefsKeyPermissionsGranted);
      
      // Notificar que se reiniciaron los permisos
      _permissionsResetController.add(null);
      
      print('✅ Permisos reiniciados correctamente');
      
    } catch (e) {
      print('❌ Error al reiniciar permisos: $e');
      throw e;
    }
  }

  /// Disposer del servicio
  void dispose() {
    _permissionsResetController.close();
  }

  // Detectar si el dispositivo es Android 11 o superior
  Future<bool> _isAndroid11orAbove() async {
    if (!Platform.isAndroid) return false;
    try {
      final version = await File('/system/build.prop').readAsString();
      if (version.contains('ro.build.version.release=11') ||
          version.contains('ro.build.version.release=12') ||
          version.contains('ro.build.version.release=13') ||
          version.contains('ro.build.version.release=14')) {
        return true;
      }
    } catch (_) {}
    // Fallback usando Platform.version
    try {
      final v = Platform.operatingSystemVersion;
      if (v.contains('Android 11') || v.contains('Android 12') || v.contains('Android 13') || v.contains('Android 14')) {
        return true;
      }
    } catch (_) {}
    return false;
  }
} 
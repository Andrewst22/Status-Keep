import 'dart:io';
import '../models/social_status.dart';
import 'package:path_provider/path_provider.dart';

class SocialExtractorService {
  static final SocialExtractorService _instance = SocialExtractorService._internal();
  factory SocialExtractorService() => _instance;
  SocialExtractorService._internal();

  /// Busca archivos multimedia en la carpeta específica de estados de WhatsApp
  Future<List<SocialStatus>> extractStatusesFromDevice() async {
    print('🔍 Iniciando búsqueda de estados de WhatsApp...');
    final whatsappStatuses = await _extractWhatsAppStatusesFromDevice();
    print('✅ WhatsApp: ${whatsappStatuses.length} estados encontrados');
    print('🎉 Total de estados encontrados: ${whatsappStatuses.length}');
    return whatsappStatuses;
  }

  /// Extraer estados de WhatsApp desde la ruta específica
  Future<List<SocialStatus>> _extractWhatsAppStatusesFromDevice() async {
    List<SocialStatus> statuses = [];
    
    // Ruta específica de WhatsApp
    final String whatsappStatusPath = '/storage/emulated/0/Android/media/com.whatsapp/WhatsApp/Media/.Statuses';
    
    print('  🔍 Verificando ruta específica de WhatsApp: $whatsappStatusPath');
    final dir = Directory(whatsappStatusPath);
    
    if (await dir.exists()) {
      print('    ✅ Carpeta encontrada: $whatsappStatusPath');
      try {
        final files = await _scanDirectory(dir, SocialPlatform.whatsapp);
        statuses.addAll(files);
        print('    📄 ${files.length} archivos encontrados en $whatsappStatusPath');
      } catch (e) {
        print('    ❌ Error al escanear $whatsappStatusPath: $e');
      }
    } else {
      print('    ❌ Carpeta no encontrada: $whatsappStatusPath');
      print('    💡 Asegúrate de que WhatsApp esté instalado y tengas estados guardados');
    }

    return statuses;
  }

  /// Escanear un directorio en busca de archivos multimedia
  Future<List<SocialStatus>> _scanDirectory(Directory dir, SocialPlatform platform) async {
    List<SocialStatus> statuses = [];
    
    try {
      await for (final entity in dir.list()) {
        if (entity is File) {
          final ext = entity.path.split('.').last.toLowerCase();
          final mediaType = _getMediaType(ext);
          if (mediaType != null) {
            try {
              final stat = await entity.stat();
              final fileName = entity.uri.pathSegments.last;
              
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
            } catch (e) {
              print('    ⚠️ Error al procesar archivo ${entity.path}: $e');
            }
          }
        }
      }
    } catch (e) {
      print('    ❌ Error al listar directorio ${dir.path}: $e');
    }
    
    return statuses;
  }

  /// Formatear tamaño de archivo
  String _formatFileSize(int bytes) {
    if (bytes < 1024) return '$bytes B';
    if (bytes < 1024 * 1024) return '${(bytes / 1024).toStringAsFixed(1)} KB';
    return '${(bytes / (1024 * 1024)).toStringAsFixed(1)} MB';
  }

  // Extraer estados de WhatsApp (método simulado para compatibilidad)
  Future<List<SocialStatus>> extractWhatsAppStatuses() async {
    return await _extractWhatsAppStatusesFromDevice();
  }

  // Extraer todos los estados de una plataforma específica
  Future<List<SocialStatus>> extractAllFromPlatform(SocialPlatform platform) async {
    if (platform == SocialPlatform.whatsapp) {
      return await extractWhatsAppStatuses();
    }
    return [];
  }

  // Extraer todos los estados de todas las plataformas
  Future<List<SocialStatus>> extractAllStatuses() async {
    return await extractWhatsAppStatuses();
  }

  // Buscar estados por texto
  Future<List<SocialStatus>> searchStatuses(String query) async {
    List<SocialStatus> allStatuses = await extractAllStatuses();
    
    return allStatuses.where((status) {
      return status.title.toLowerCase().contains(query.toLowerCase()) ||
             status.description.toLowerCase().contains(query.toLowerCase()) ||
             (status.author?.toLowerCase().contains(query.toLowerCase()) ?? false);
    }).toList();
  }

  // Filtrar estados por tipo de medio
  Future<List<SocialStatus>> filterByMediaType(MediaType mediaType) async {
    List<SocialStatus> allStatuses = await extractAllStatuses();
    
    return allStatuses.where((status) => status.mediaType == mediaType).toList();
  }

  // Filtrar estados por plataforma
  Future<List<SocialStatus>> filterByPlatform(SocialPlatform platform) async {
    return await extractAllFromPlatform(platform);
  }
}

MediaType? _getMediaType(String ext) {
  if (["jpg", "jpeg", "png", "gif", "webp"].contains(ext)) return MediaType.image;
  if (["mp4", "avi", "mov", "mkv"].contains(ext)) return MediaType.video;
  if (["mp3", "wav", "aac"].contains(ext)) return MediaType.audio;
  return null;
} 
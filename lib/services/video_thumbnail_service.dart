import 'dart:io';
import 'package:video_thumbnail/video_thumbnail.dart';
import 'package:path_provider/path_provider.dart';

class VideoThumbnailService {
  static final VideoThumbnailService _instance = VideoThumbnailService._internal();
  factory VideoThumbnailService() => _instance;
  VideoThumbnailService._internal();

  // Cache para miniaturas generadas
  final Map<String, String> _thumbnailCache = {};

  /// Generar miniatura de un video
  Future<String?> generateThumbnail(String videoPath) async {
    try {
      // Verificar si ya tenemos la miniatura en cache
      if (_thumbnailCache.containsKey(videoPath)) {
        return _thumbnailCache[videoPath];
      }

      // Obtener directorio temporal para guardar la miniatura
      final tempDir = await getTemporaryDirectory();
      final thumbnailPath = '${tempDir.path}/thumbnails';
      
      // Crear directorio si no existe
      final thumbnailDir = Directory(thumbnailPath);
      if (!await thumbnailDir.exists()) {
        await thumbnailDir.create(recursive: true);
      }

      // Generar nombre único para la miniatura
      final fileName = videoPath.split('/').last.replaceAll('.mp4', '_thumb.jpg');
      final outputPath = '$thumbnailPath/$fileName';

      // Generar miniatura
      final thumbnail = await VideoThumbnail.thumbnailFile(
        video: videoPath,
        thumbnailPath: thumbnailPath,
        imageFormat: ImageFormat.JPEG,
        quality: 75,
        maxWidth: 300,
        maxHeight: 300,
        timeMs: 1000, // Tomar frame a 1 segundo
      );

      if (thumbnail != null) {
        // Guardar en cache
        _thumbnailCache[videoPath] = thumbnail;
        return thumbnail;
      }

      return null;
    } catch (e) {
      print('Error generando miniatura para $videoPath: $e');
      return null;
    }
  }

  /// Obtener miniatura de cache o generar nueva
  Future<String?> getThumbnail(String videoPath) async {
    if (_thumbnailCache.containsKey(videoPath)) {
      return _thumbnailCache[videoPath];
    }
    return await generateThumbnail(videoPath);
  }

  /// Limpiar cache de miniaturas
  void clearCache() {
    _thumbnailCache.clear();
  }

  /// Verificar si existe miniatura para un video
  bool hasThumbnail(String videoPath) {
    return _thumbnailCache.containsKey(videoPath);
  }
} 
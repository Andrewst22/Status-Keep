import 'package:flutter/material.dart';
import 'dart:io';
import '../models/social_status.dart';
import '../services/video_thumbnail_service.dart';

class StatusThumbnail extends StatefulWidget {
  final SocialStatus status;
  final VoidCallback onDownload;
  final VoidCallback onTap;
  final bool showShareButton;
  final bool hideActionButton;
  final VoidCallback? onDelete;

  const StatusThumbnail({
    super.key,
    required this.status,
    required this.onDownload,
    required this.onTap,
    this.showShareButton = false,
    this.hideActionButton = false,
    this.onDelete,
  });

  @override
  State<StatusThumbnail> createState() => _StatusThumbnailState();
}

class _StatusThumbnailState extends State<StatusThumbnail> {
  final VideoThumbnailService _thumbnailService = VideoThumbnailService();
  String? _thumbnailPath;
  bool _isLoadingThumbnail = false;

  @override
  void initState() {
    super.initState();
    _loadThumbnail();
  }

  Future<void> _loadThumbnail() async {
    if (widget.status.mediaType == MediaType.video && widget.status.localPath != null) {
      setState(() {
        _isLoadingThumbnail = true;
      });

      try {
        final thumbnail = await _thumbnailService.getThumbnail(widget.status.localPath!);
        if (mounted) {
          setState(() {
            _thumbnailPath = thumbnail;
            _isLoadingThumbnail = false;
          });
        }
      } catch (e) {
        if (mounted) {
          setState(() {
            _isLoadingThumbnail = false;
          });
        }
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: widget.onTap,
      child: Container(
        decoration: BoxDecoration(
          borderRadius: BorderRadius.circular(8),
          boxShadow: [
            BoxShadow(
              color: Colors.black.withOpacity(0.1),
              blurRadius: 4,
              offset: const Offset(0, 2),
            ),
          ],
        ),
        child: ClipRRect(
          borderRadius: BorderRadius.circular(8),
          child: Stack(
            children: [
              // Imagen o video de fondo
              _buildMediaWidget(),
              
              // Mini botón de compartir en la esquina inferior derecha
              if (widget.showShareButton && !widget.hideActionButton)
                Positioned(
                  bottom: 6,
                  right: 6,
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.green,
                      borderRadius: BorderRadius.circular(16),
                      boxShadow: [
                        BoxShadow(
                          color: Colors.black.withOpacity(0.3),
                          blurRadius: 4,
                          offset: const Offset(0, 2),
                        ),
                      ],
                    ),
                    child: Material(
                      color: Colors.transparent,
                      child: InkWell(
                        onTap: widget.onDownload,
                        borderRadius: BorderRadius.circular(16),
                        child: Container(
                          padding: const EdgeInsets.all(6),
                          child: const Icon(
                            Icons.share,
                            color: Colors.white,
                            size: 14,
                          ),
                        ),
                      ),
                    ),
                  ),
                ),
              
              // Mini botón de descarga en la esquina inferior derecha
              if (!widget.showShareButton && !widget.hideActionButton)
                Positioned(
                  bottom: 6,
                  right: 6,
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.green,
                      borderRadius: BorderRadius.circular(16),
                      boxShadow: [
                        BoxShadow(
                          color: Colors.black.withOpacity(0.3),
                          blurRadius: 4,
                          offset: const Offset(0, 2),
                        ),
                      ],
                    ),
                    child: Material(
                      color: Colors.transparent,
                      child: InkWell(
                        onTap: widget.onDownload,
                        borderRadius: BorderRadius.circular(16),
                        child: Container(
                          padding: const EdgeInsets.all(6),
                          child: const Icon(
                            Icons.download,
                            color: Colors.white,
                            size: 14,
                          ),
                        ),
                      ),
                    ),
                  ),
                ),
              
              // Mini botón de papelera en la esquina inferior izquierda
              if (widget.onDelete != null && !widget.hideActionButton)
                Positioned(
                  bottom: 6,
                  left: 6,
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.red,
                      borderRadius: BorderRadius.circular(16),
                      boxShadow: [
                        BoxShadow(
                          color: Colors.black.withOpacity(0.3),
                          blurRadius: 4,
                          offset: const Offset(0, 2),
                        ),
                      ],
                    ),
                    child: Material(
                      color: Colors.transparent,
                      child: InkWell(
                        onTap: widget.onDelete,
                        borderRadius: BorderRadius.circular(16),
                        child: Container(
                          padding: const EdgeInsets.all(6),
                          child: const Icon(
                            Icons.delete,
                            color: Colors.white,
                            size: 14,
                          ),
                        ),
                      ),
                    ),
                  ),
                ),
              
              // Indicador de video (si es video)
              if (widget.status.mediaType == MediaType.video)
                Positioned(
                  top: 8,
                  left: 8,
                  child: Container(
                    padding: const EdgeInsets.symmetric(horizontal: 8, vertical: 4),
                    decoration: BoxDecoration(
                      color: Colors.black.withOpacity(0.7),
                      borderRadius: BorderRadius.circular(12),
                    ),
                    child: Row(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        const Icon(
                          Icons.play_arrow,
                          color: Colors.white,
                          size: 16,
                        ),
                        const SizedBox(width: 4),
                        Text(
                          widget.status.formattedDuration ?? '0:00',
                          style: const TextStyle(
                            color: Colors.white,
                            fontSize: 12,
                            fontWeight: FontWeight.w500,
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
            ],
          ),
        ),
      ),
    );
  }

  Widget _buildMediaWidget() {
    // Verificar si localPath es null
    if (widget.status.localPath == null) {
      return Container(
        color: Colors.grey.shade300,
        child: Icon(
          widget.status.mediaType == MediaType.video ? Icons.video_library : Icons.image,
          color: Colors.grey,
          size: 40,
        ),
      );
    }

    if (widget.status.mediaType == MediaType.video) {
      // Mostrar miniatura de video si está disponible
      if (_thumbnailPath != null) {
        return Stack(
          children: [
            // Miniatura del video
            Image.file(
              File(_thumbnailPath!),
              width: double.infinity,
              height: double.infinity,
              fit: BoxFit.cover,
              errorBuilder: (context, error, stackTrace) {
                return _buildVideoPlaceholder();
              },
            ),
            // Overlay para indicar que es video
            Container(
              color: Colors.black.withOpacity(0.1),
            ),
          ],
        );
      } else if (_isLoadingThumbnail) {
        // Mostrar loading mientras se genera la miniatura
        return Container(
          color: Colors.grey.shade300,
          child: const Center(
            child: CircularProgressIndicator(
              strokeWidth: 2,
              valueColor: AlwaysStoppedAnimation<Color>(Colors.grey),
            ),
          ),
        );
      } else {
        // Fallback si no se puede generar miniatura
        return _buildVideoPlaceholder();
      }
    } else {
      // Imagen normal
      return Image.file(
        File(widget.status.localPath!),
        width: double.infinity,
        height: double.infinity,
        fit: BoxFit.cover,
        errorBuilder: (context, error, stackTrace) {
          return Container(
            color: Colors.grey.shade300,
            child: const Icon(
              Icons.image,
              color: Colors.grey,
              size: 40,
            ),
          );
        },
      );
    }
  }

  Widget _buildVideoPlaceholder() {
    return Container(
      color: Colors.grey.shade300,
      child: const Icon(
        Icons.video_library,
        color: Colors.grey,
        size: 40,
      ),
    );
  }
} 
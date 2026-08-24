import 'dart:async';
import 'package:flutter/material.dart';
import 'package:share_plus/share_plus.dart';
import '../models/social_status.dart';
import '../services/download_service.dart';
import '../services/notification_service.dart';
import '../widgets/status_thumbnail.dart';
import '../widgets/full_screen_viewer.dart';

class SavedScreen extends StatefulWidget {
  const SavedScreen({super.key});

  @override
  State<SavedScreen> createState() => _SavedScreenState();
}

class _SavedScreenState extends State<SavedScreen> with TickerProviderStateMixin {
  final DownloadService _downloadService = DownloadService();
  final NotificationService _notificationService = NotificationService();
  
  List<SocialStatus> _savedStatuses = [];
  bool _isLoading = false;
  
  // Controladores para la navegación por pestañas
  late TabController _tabController;
  
  // Stream subscription para escuchar notificaciones de descarga
  StreamSubscription? _downloadSubscription;
  
  // Listas separadas por tipo de medio
  List<SocialStatus> get _savedImageStatuses => _savedStatuses.where((s) => s.mediaType == MediaType.image).toList();
  List<SocialStatus> get _savedVideoStatuses => _savedStatuses.where((s) => s.mediaType == MediaType.video).toList();

  Set<SocialStatus> _selectedStatuses = {};
  bool get _isSelectionMode => _selectedStatuses.isNotEmpty;

  void _onStatusLongPress(SocialStatus status) {
    setState(() {
      if (_selectedStatuses.contains(status)) {
        _selectedStatuses.remove(status);
      } else {
        _selectedStatuses.add(status);
      }
    });
  }

  void _onStatusTap(SocialStatus status) {
    if (_isSelectionMode) {
      _onStatusLongPress(status);
    } else {
      Navigator.push(
        context,
        MaterialPageRoute(
          builder: (context) => FullScreenViewer(
            status: status,
            showDownloadIcon: false,
            onDownload: () async {
              if (status.localPath != null) {
                await Share.shareXFiles([
                  XFile(status.localPath!)
                ],
                  text: 'Compartido desde StatusKeep');
              }
            },
          ),
        ),
      );
    }
  }

  void _clearSelection() {
    setState(() {
      _selectedStatuses.clear();
    });
  }

  Future<void> _shareSelectedStatuses() async {
    final statuses = _selectedStatuses.toList();
    _clearSelection();
    int success = 0;
    final files = <XFile>[];
    for (final status in statuses) {
      if (status.localPath != null) {
        files.add(XFile(status.localPath!));
        success++;
      }
    }
    if (files.isNotEmpty) {
      await Share.shareXFiles(files, text: 'Compartido desde StatusKeep');
    }
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text('Compartidos $success de ${statuses.length} archivos'),
        backgroundColor: Colors.green,
      ),
    );
  }

  Future<bool> _showDeleteConfirmation({required int count}) async {
    return await showDialog<bool>(
      context: context,
      builder: (context) => AlertDialog(
        backgroundColor: const Color(0xFF1E1E1E),
        title: const Text('Confirmar eliminación', style: TextStyle(color: Colors.white)),
        content: Text(
          count == 1
              ? '¿Seguro que deseas eliminar este archivo?'
              : '¿Seguro que deseas eliminar $count archivos?',
          style: const TextStyle(color: Colors.white70),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(context).pop(false),
            child: const Text('Cancelar', style: TextStyle(color: Colors.green)),
          ),
          TextButton(
            onPressed: () => Navigator.of(context).pop(true),
            child: const Text('Eliminar', style: TextStyle(color: Colors.red)),
          ),
        ],
      ),
    ) ?? false;
  }

  Future<void> _deleteStatus(SocialStatus status) async {
    final confirm = await _showDeleteConfirmation(count: 1);
    if (!confirm) return;
    if (status.localPath != null) {
      final deleted = await _downloadService.deleteDownloadedFile(status.localPath!);
      if (deleted) {
        setState(() {
          _savedStatuses.removeWhere((s) => s.localPath == status.localPath);
        });
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text('Archivo eliminado'),
            backgroundColor: Colors.red,
          ),
        );
      }
    }
  }

  Future<void> _deleteSelectedStatuses() async {
    final count = _selectedStatuses.length;
    final confirm = await _showDeleteConfirmation(count: count);
    if (!confirm) return;
    final statuses = _selectedStatuses.toList();
    _clearSelection();
    int success = 0;
    for (final status in statuses) {
      if (status.localPath != null) {
        final deleted = await _downloadService.deleteDownloadedFile(status.localPath!);
        if (deleted) {
          setState(() {
            _savedStatuses.removeWhere((s) => s.localPath == status.localPath);
          });
          success++;
        }
      }
    }
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text('Eliminados $success de ${statuses.length} archivos'),
        backgroundColor: Colors.red,
      ),
    );
  }

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 2, vsync: this);
    _loadSavedStatuses();
    
    // Escuchar notificaciones de descarga
    _downloadSubscription = _notificationService.downloadStream.listen((_) {
      // Actualizar la lista de estados guardados cuando se descarga uno nuevo
      _loadSavedStatuses();
    });
  }

  @override
  void dispose() {
    _tabController.dispose();
    _downloadSubscription?.cancel();
    super.dispose();
  }

  Future<void> _loadSavedStatuses() async {
    setState(() {
      _isLoading = true;
    });

    try {
      // Obtener estados guardados del servicio de descargas
      final savedStatuses = await _downloadService.getDownloadedStatuses();
      
      setState(() {
        _savedStatuses = savedStatuses;
        _isLoading = false;
      });
    } catch (e) {
      setState(() {
        _isLoading = false;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Stack(
      children: [
        Column(
          children: [
            // Panel superior con navegación por pestañas
            if (_savedStatuses.isNotEmpty) ...[
              Container(
                margin: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
                decoration: BoxDecoration(
                  color: const Color(0xFF1A1A1A),
                  borderRadius: BorderRadius.circular(12),
                  border: Border.all(
                    color: const Color(0xFF2A2A2A),
                    width: 1,
                  ),
                  boxShadow: [
                    BoxShadow(
                      color: Colors.black.withAlpha(40),
                      blurRadius: 8,
                      offset: const Offset(0, 2),
                    ),
                  ],
                ),
                child: TabBar(
                  controller: _tabController,
                  labelColor: Colors.green.shade400,
                  unselectedLabelColor: Colors.grey.shade500,
                  indicatorColor: Colors.green.shade400,
                  indicatorWeight: 2,
                  dividerColor: Colors.transparent,
                  indicatorSize: TabBarIndicatorSize.tab,
                  labelStyle: const TextStyle(
                    fontSize: 13,
                    fontWeight: FontWeight.w600,
                  ),
                  unselectedLabelStyle: const TextStyle(
                    fontSize: 13,
                    fontWeight: FontWeight.w500,
                  ),
                  tabs: [
                    Tab(
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          Icon(
                            Icons.image_outlined, 
                            size: 18, 
                            color: _tabController.index == 0 ? Colors.green.shade400 : Colors.grey.shade500
                          ),
                          const SizedBox(width: 6),
                          Text(
                            'Imágenes (${_savedImageStatuses.length})',
                          ),
                        ],
                      ),
                    ),
                    Tab(
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          Icon(
                            Icons.video_library_outlined, 
                            size: 18, 
                            color: _tabController.index == 1 ? Colors.green.shade400 : Colors.grey.shade500
                          ),
                          const SizedBox(width: 6),
                          Text(
                            'Videos (${_savedVideoStatuses.length})',
                          ),
                        ],
                      ),
                    ),
                  ],
                ),
              ),
            ],
            
            // Contenido de las pestañas
            Expanded(
              child: _isLoading
                  ? const Center(child: CircularProgressIndicator())
                  : _savedStatuses.isEmpty
                      ? Center(
                          child: Column(
                            mainAxisAlignment: MainAxisAlignment.center,
                            children: [
                              Icon(
                                Icons.download_done,
                                size: 64,
                                color: Colors.grey.shade400,
                              ),
                              const SizedBox(height: 16),
                              Text(
                                'No hay estados guardados',
                                style: TextStyle(
                                  fontSize: 16,
                                  color: Colors.grey.shade600,
                                ),
                              ),
                              const SizedBox(height: 8),
                              Text(
                                'Los estados que descargues aparecerán aquí',
                                style: TextStyle(
                                  fontSize: 14,
                                  color: Colors.grey.shade500,
                                ),
                              ),
                            ],
                          ),
                        )
                      : TabBarView(
                          controller: _tabController,
                          children: [
                            // Pestaña de Imágenes guardadas
                            _buildStatusGrid(_savedImageStatuses),
                            // Pestaña de Videos guardados
                            _buildStatusGrid(_savedVideoStatuses),
                          ],
                        ),
            ),
          ],
        ),
        if (_isSelectionMode)
          Positioned(
            bottom: 24,
            right: 24,
            child: Row(
              mainAxisSize: MainAxisSize.min,
              children: [
                FloatingActionButton(
                  heroTag: 'shareFab',
                  onPressed: _shareSelectedStatuses,
                  child: const Icon(Icons.share),
                  tooltip: 'Compartir seleccionados',
                ),
                const SizedBox(width: 16),
                FloatingActionButton(
                  heroTag: 'deleteFab',
                  onPressed: _deleteSelectedStatuses,
                  backgroundColor: Colors.red,
                  child: const Icon(Icons.delete),
                  tooltip: 'Eliminar seleccionados',
                ),
              ],
            ),
          ),
        if (_isSelectionMode)
          Positioned(
            top: 0,
            right: 0,
            child: SafeArea(
              child: IconButton(
                icon: const Icon(Icons.close, color: Colors.white),
                onPressed: _clearSelection,
                tooltip: 'Cancelar selección',
              ),
            ),
          ),
      ],
    );
  }

  Widget _buildStatusGrid(List<SocialStatus> statuses) {
    if (statuses.isEmpty) {
      return Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(
              _tabController.index == 0 ? Icons.image : Icons.video_library,
              size: 64,
              color: Colors.grey.shade400,
            ),
            const SizedBox(height: 16),
            Text(
              _tabController.index == 0 
                  ? 'No hay imágenes guardadas'
                  : 'No hay videos guardados',
              style: TextStyle(
                fontSize: 16,
                color: Colors.grey.shade600,
              ),
            ),
          ],
        ),
      );
    }

    return GridView.builder(
      padding: const EdgeInsets.all(12),
      gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
        crossAxisCount: 3,
        crossAxisSpacing: 8,
        mainAxisSpacing: 8,
        childAspectRatio: 0.75,
      ),
      itemCount: statuses.length,
      itemBuilder: (context, index) {
        final status = statuses[index];
        final isSelected = _selectedStatuses.contains(status);
        return GestureDetector(
          onLongPress: () => _onStatusLongPress(status),
          onTap: () => _onStatusTap(status),
          child: Stack(
            children: [
              StatusThumbnail(
                status: status,
                showShareButton: true,
                onDownload: () async {
                  if (status.localPath != null) {
                    await Share.shareXFiles([
                      XFile(status.localPath!)
                    ],
                      text: 'Compartido desde StatusKeep');
                  }
                },
                onTap: () => _onStatusTap(status),
                hideActionButton: _isSelectionMode,
                onDelete: () => _deleteStatus(status),
              ),
              if (isSelected)
                Positioned(
                  top: 8,
                  right: 8,
                  child: CircleAvatar(
                    radius: 14,
                    backgroundColor: Colors.green.withOpacity(0.8),
                    child: const Icon(Icons.check, color: Colors.white, size: 18),
                  ),
                ),
            ],
          ),
        );
      },
    );
  }
} 
/* 
 * Creado por: Andrewst22
 * Proyecto: Status-Keep
 * Todos los derechos reservados © 2026
 */

import 'dart:async';
import 'package:flutter/material.dart';
import 'package:share_plus/share_plus.dart';
import '../models/social_status.dart';
import '../services/directory_access_service.dart';
import '../services/download_service.dart';
import '../widgets/status_thumbnail.dart';
import '../widgets/full_screen_viewer.dart';
import 'saved_screen.dart';
import 'settings_screen.dart';
import '../services/auto_save_service.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({super.key});

  @override
  State<HomeScreen> createState() => _HomeScreenState();
}

class _HomeScreenState extends State<HomeScreen> with TickerProviderStateMixin {
  final DirectoryAccessService _directoryService = DirectoryAccessService();
  final DownloadService _downloadService = DownloadService();
  final AutoSaveService _autoSaveService = AutoSaveService();
  
  List<SocialStatus> _statuses = [];
  bool _isLoading = false;
  bool _isFirstTime = true;
  String? _errorMessage;
  
  // Controladores para la navegación por pestañas
  late TabController _tabController;
  
  // Índice de la página actual
  int _currentIndex = 0;
  
  // Listas separadas por tipo de medio
  List<SocialStatus> get _imageStatuses => _statuses.where((s) => s.mediaType == MediaType.image).toList();
  List<SocialStatus> get _videoStatuses => _statuses.where((s) => s.mediaType == MediaType.video).toList();

  Set<SocialStatus> _selectedStatuses = {};
  bool get _isSelectionMode => _selectedStatuses.isNotEmpty;

  // Stream subscription para escuchar reinicio de permisos
  StreamSubscription? _permissionsResetSubscription;

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 2, vsync: this);
    DirectoryAccessService().init().then((_) {
      _checkDirectoryAccessAndLoadStatuses();
    });
    _listenToNewStatuses();
    _listenToPermissionsReset();
  }

  @override
  void dispose() {
    _tabController.dispose();
    _permissionsResetSubscription?.cancel();
    super.dispose();
  }

  void _listenToPermissionsReset() {
    _permissionsResetSubscription = _directoryService.permissionsResetStream.listen((_) {
      if (mounted) {
        _resetToInitialState();
      }
    });
  }

  void _listenToNewStatuses() {
    _autoSaveService.newStatusesStream.listen((newStatuses) {
      if (mounted) {
        setState(() {
          // Agregar nuevos estados a la lista existente
          _statuses.addAll(newStatuses);
        });
        
        // Mostrar notificación de nuevos estados
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text('🆕 ${newStatuses.length} nuevos estados descargados automáticamente'),
            backgroundColor: Colors.green.shade600,
            duration: const Duration(seconds: 3),
            action: SnackBarAction(
              label: 'Ver',
              textColor: Colors.white,
              onPressed: () {
                // Opcional: navegar a la sección de guardados
                setState(() {
                  _currentIndex = 1; // Cambiar a sección Guardado
                });
              },
            ),
          ),
        );
      }
    });
  }

  Future<void> _checkDirectoryAccessAndLoadStatuses() async {
    if (_directoryService.hasAccess) {
      await _loadStatuses();
    } else {
      setState(() {
        _isLoading = false;
        _isFirstTime = true;
        _errorMessage = null;
      });
    }
  }

  void _resetToInitialState() {
    setState(() {
      _isFirstTime = true;
      _isLoading = false;
      _errorMessage = null;
      _statuses = [];
      _selectedStatuses.clear();
    });
    
    // Después de resetear, intentar restaurar el acceso automáticamente
    _checkDirectoryAccessAndLoadStatuses();
  }

  Future<void> _requestDirectoryAccessAndLoadStatuses() async {
    setState(() {
      _isLoading = true;
      _errorMessage = null;
    });

    try {
      print('🔐 Solicitando acceso al directorio de WhatsApp...');
      
      // Solicitar acceso al directorio de WhatsApp
      final hasAccess = await _directoryService.requestWhatsAppDirectoryAccess();
      
      if (hasAccess) {
        print('✅ Acceso concedido, cargando estados...');
        setState(() {
          _isFirstTime = false;
        });
        
        // Cargar estados de WhatsApp
        await _loadStatuses();
      } else {
        print('❌ Acceso denegado');
        setState(() {
          _isLoading = false;
          _errorMessage = 'Se requiere acceso a la carpeta de WhatsApp para cargar los estados. La app intentará acceder automáticamente a la carpeta de WhatsApp.';
        });
      }
    } catch (e) {
      print('❌ Error al solicitar acceso: $e');
      setState(() {
        _isLoading = false;
        _errorMessage = 'Error al solicitar acceso: $e';
      });
    }
  }

  Future<void> _loadStatuses() async {
    setState(() {
      _isLoading = true;
      _errorMessage = null;
    });

    try {
      print('🔄 Iniciando carga de estados...');
      final statuses = await _directoryService.extractStatusesFromWhatsAppDirectory();
      
      print('📊 Estados encontrados: ${statuses.length}');
      
      setState(() {
        _statuses = statuses;
        _isLoading = false;
      });
      
      if (statuses.isEmpty) {
        setState(() {
          _errorMessage = 'No se encontraron estados de WhatsApp. Asegúrate de tener estados guardados en WhatsApp.';
        });
        print('💡 Sugerencias para el usuario:');
        print('   - Verifica que WhatsApp esté instalado');
        print('   - Asegúrate de tener estados guardados');
        print('   - Los estados se eliminan automáticamente después de 24 horas');
      } else {
        print('✅ Estados cargados exitosamente');
      }
    } catch (e) {
      print('❌ Error al cargar estados: $e');
      setState(() {
        _isLoading = false;
        _errorMessage = 'Error al cargar estados: $e';
      });
    }
  }

  Widget _buildFolderGuideCard() {
    return Container(
      width: 360,
      padding: const EdgeInsets.all(16),
      margin: const EdgeInsets.only(bottom: 12),
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(18),
        border: Border.all(color: Colors.green.shade200),
        boxShadow: [
          BoxShadow(
            color: Colors.green.withOpacity(0.08),
            blurRadius: 12,
            offset: const Offset(0, 6),
          ),
        ],
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Row(
            children: [
              Icon(Icons.folder_open_rounded, color: Colors.green.shade700),
              const SizedBox(width: 8),
              Text(
                'Carpeta que debes permitir',
                style: TextStyle(
                  fontSize: 16,
                  fontWeight: FontWeight.bold,
                  color: Colors.green.shade800,
                ),
              ),
            ],
          ),
          const SizedBox(height: 12),
          Container(
            width: double.infinity,
            padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 10),
            decoration: BoxDecoration(
              color: Colors.green.shade50,
              borderRadius: BorderRadius.circular(12),
              border: Border.all(color: Colors.green.shade200),
            ),
            child: SelectableText(
              '/storage/emulated/0/Android/media',
              style: TextStyle(
                fontSize: 12,
                fontWeight: FontWeight.w600,
                color: Colors.green.shade900,
              ),
            ),
          ),
          const SizedBox(height: 12),
          Text(
            '1. Abre el explorador de archivos.\n2. Ve a Android > media.\n3. Selecciona la carpeta Android/media y acepta el permiso.',
            style: TextStyle(
              fontSize: 12,
              color: Colors.grey.shade700,
              height: 1.5,
            ),
          ),
        ],
      ),
    );
  }

  void _shareApp() {
    Share.share(
      '¡Mira esta increíble app para guardar estados de WhatsApp! 📱✨\n\nStatusKeep - Guarda y organiza todos tus estados favoritos de WhatsApp de forma fácil y rápida.\n\nDescárgala ahora: [Link de la app]',
      subject: 'StatusKeep - Guarda tus estados favoritos',
    );
  }

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
            onDownload: () async {
              try {
                await _downloadService.downloadStatus(status);
                ScaffoldMessenger.of(context).showSnackBar(
                  SnackBar(
                    content: Text('Estado descargado exitosamente'),
                    backgroundColor: Colors.green,
                  ),
                );
              } catch (e) {
                ScaffoldMessenger.of(context).showSnackBar(
                  SnackBar(
                    content: Text('Error al descargar: $e'),
                    backgroundColor: Colors.red,
                  ),
                );
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

  Future<void> _downloadSelectedStatuses() async {
    final statuses = _selectedStatuses.toList();
    _clearSelection();
    int success = 0;
    for (final status in statuses) {
      try {
        await _downloadService.downloadStatus(status);
        success++;
      } catch (_) {}
    }
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text('Descargados $success de ${statuses.length} estados'),
        backgroundColor: Colors.green,
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
              appBar: AppBar(
          title: const Text('StatusKeep'),
        actions: [
          if (_isSelectionMode)
            IconButton(
              icon: const Icon(Icons.close),
              onPressed: _clearSelection,
              tooltip: 'Cancelar selección',
            ),
          IconButton(
            icon: const Icon(Icons.settings),
            onPressed: () {
              Navigator.push(
                context,
                MaterialPageRoute(
                  builder: (context) => const SettingsScreen(),
                ),
              );
            },
          ),
          IconButton(
            icon: const Icon(Icons.share),
            onPressed: () {
              // Función para compartir la app
              _shareApp();
            },
          ),
        ],
      ),
      bottomNavigationBar: _directoryService.hasAccess
          ? Container(
              decoration: BoxDecoration(
                color: const Color(0xFF1A1A1A),
                border: Border(
                  top: BorderSide(
                    color: Colors.grey.shade800,
                    width: 0.5,
                  ),
                ),
              ),
              child: SafeArea(
                child: Padding(
                  padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
                  child: Row(
                    children: [
                      Expanded(
                        child: _buildNavItem(
                          index: 0,
                          icon: Icons.home_outlined,
                          activeIcon: Icons.home,
                          label: 'Estados',
                          isSelected: _currentIndex == 0,
                        ),
                      ),
                      Expanded(
                        child: _buildNavItem(
                          index: 1,
                          icon: Icons.folder_outlined,
                          activeIcon: Icons.folder,
                          label: 'Guardado',
                          isSelected: _currentIndex == 1,
                        ),
                      ),
                    ],
                  ),
                ),
              ),
            )
          : null,
      body: IndexedStack(
        index: _currentIndex,
        children: [
          // Página de Estados (pantalla principal actual)
          if (_isFirstTime && !_directoryService.hasAccess)
            Center(
              child: Padding(
                padding: const EdgeInsets.symmetric(horizontal: 20),
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    _buildFolderGuideCard(),
                    const SizedBox(height: 16),
                    ElevatedButton.icon(
                      onPressed: _isLoading ? null : _requestDirectoryAccessAndLoadStatuses,
                      icon: _isLoading
                          ? const SizedBox(
                              width: 16,
                              height: 16,
                              child: CircularProgressIndicator(strokeWidth: 2),
                            )
                          : const Icon(Icons.folder_open),
                      label: Text(_isLoading ? 'Verificando acceso...' : 'Solicitar permisos'),
                      style: ElevatedButton.styleFrom(
                        backgroundColor: Colors.green,
                        foregroundColor: Colors.white,
                        padding: const EdgeInsets.symmetric(vertical: 16, horizontal: 24),
                      ),
                    ),
                    const SizedBox(height: 16),
                    SizedBox(
                      width: 300,
                      child: Text(
                        'La app necesita acceso a la carpeta de WhatsApp para leer tus estados. Selecciona la carpeta Android/media cuando el sistema te lo pida.',
                        style: TextStyle(
                          fontSize: 12,
                          color: Colors.grey.shade600,
                        ),
                        textAlign: TextAlign.center,
                      ),
                    ),
                  ],
                ),
              ),
            )
          else
            Column(
              children: [
                if (_statuses.isNotEmpty) ...[
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
                                color: _tabController.index == 0
                                    ? Colors.green.shade400
                                    : Colors.grey.shade500,
                              ),
                              const SizedBox(width: 6),
                              Text('Imágenes (${_imageStatuses.length})'),
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
                                color: _tabController.index == 1
                                    ? Colors.green.shade400
                                    : Colors.grey.shade500,
                              ),
                              const SizedBox(width: 6),
                              Text('Videos (${_videoStatuses.length})'),
                            ],
                          ),
                        ),
                      ],
                    ),
                  ),
                ],
                if (_errorMessage != null)
                  Container(
                    width: double.infinity,
                    margin: const EdgeInsets.all(16),
                    padding: const EdgeInsets.all(16),
                    decoration: BoxDecoration(
                      color: Colors.red.shade50,
                      borderRadius: BorderRadius.circular(8),
                      border: Border.all(color: Colors.red.shade200),
                    ),
                    child: Row(
                      children: [
                        Icon(Icons.error, color: Colors.red.shade700),
                        const SizedBox(width: 8),
                        Expanded(
                          child: Text(
                            _errorMessage!,
                            style: TextStyle(color: Colors.red.shade700),
                          ),
                        ),
                      ],
                    ),
                  ),
                Expanded(
                  child: _isLoading && _statuses.isEmpty
                      ? const Center(child: CircularProgressIndicator())
                      : _statuses.isEmpty
                          ? const SizedBox.shrink()
                          : TabBarView(
                              controller: _tabController,
                              children: [
                                _buildStatusGrid(_imageStatuses),
                                _buildStatusGrid(_videoStatuses),
                              ],
                            ),
                ),
              ],
            ),
          // Página de Estados Guardados
          const SavedScreen(),
        ],
      ),
      floatingActionButton: _isSelectionMode
          ? FloatingActionButton(
              onPressed: _downloadSelectedStatuses,
              child: const Icon(Icons.download),
              tooltip: 'Descargar seleccionados',
            )
          : null,
    );
  }

  Widget _buildNavItem({
    required int index,
    required IconData icon,
    required IconData activeIcon,
    required String label,
    required bool isSelected,
  }) {
    return Material(
      color: Colors.transparent,
      child: InkWell(
        onTap: () {
          setState(() {
            _currentIndex = index;
          });
        },
        borderRadius: BorderRadius.circular(16),
        child: Container(
          padding: const EdgeInsets.symmetric(vertical: 4),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              AnimatedContainer(
                duration: const Duration(milliseconds: 300),
                padding: EdgeInsets.all(isSelected ? 6 : 0),
                decoration: BoxDecoration(
                  color: isSelected 
                      ? Colors.green.withAlpha(38)
                      : Colors.transparent,
                  borderRadius: BorderRadius.circular(10),
                ),
                child: AnimatedSwitcher(
                  duration: const Duration(milliseconds: 300),
                  child: Icon(
                    isSelected ? activeIcon : icon,
                    key: ValueKey(isSelected),
                    size: 20,
                    color: isSelected 
                        ? Colors.green.shade400
                        : Colors.grey.shade400,
                  ),
                ),
              ),
              const SizedBox(height: 4),
              AnimatedDefaultTextStyle(
                duration: const Duration(milliseconds: 300),
                style: TextStyle(
                  fontSize: 11,
                  fontWeight: isSelected ? FontWeight.w600 : FontWeight.w500,
                  color: isSelected 
                      ? Colors.green.shade400
                      : Colors.grey.shade400,
                ),
                child: Text(label),
              ),
            ],
          ),
        ),
      ),
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
                  ? 'No hay imágenes disponibles'
                  : 'No hay videos disponibles',
                              style: TextStyle(
                                fontSize: 16,
                                color: Colors.grey.shade600,
                              ),
                            ),
                          ],
                        ),
      );
    }

    return RefreshIndicator(
                        onRefresh: _loadStatuses,
                        child: GridView.builder(
        padding: const EdgeInsets.all(4),
                          gridDelegate: const SliverGridDelegateWithFixedCrossAxisCount(
          crossAxisCount: 3,
          crossAxisSpacing: 4,
          mainAxisSpacing: 4,
          childAspectRatio: 1.0,
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
                              onDownload: () async {
                                try {
                                  await _downloadService.downloadStatus(status);
                                  ScaffoldMessenger.of(context).showSnackBar(
                                    SnackBar(
                                      content: Text('Estado descargado exitosamente'),
                                      backgroundColor: Colors.green,
                                    ),
                                  );
                                } catch (e) {
                                  ScaffoldMessenger.of(context).showSnackBar(
                                    SnackBar(
                                      content: Text('Error al descargar: $e'),
                                      backgroundColor: Colors.red,
                                    ),
                                  );
                                }
                              },
                  onTap: () => _onStatusTap(status),
                  hideActionButton: _isSelectionMode,
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
      ),
    );
  }
}
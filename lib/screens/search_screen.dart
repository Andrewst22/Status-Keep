import 'package:flutter/material.dart';
import '../models/social_status.dart';
import '../widgets/status_card.dart';
import '../services/download_service.dart';

class SearchScreen extends StatefulWidget {
  final List<SocialStatus> statuses;

  const SearchScreen({
    super.key,
    required this.statuses,
  });

  @override
  State<SearchScreen> createState() => _SearchScreenState();
}

class _SearchScreenState extends State<SearchScreen> {
  final TextEditingController _searchController = TextEditingController();
  final DownloadService _downloadService = DownloadService();
  
  List<SocialStatus> _filteredStatuses = [];
  String _searchQuery = '';
  MediaType? _selectedMediaType;

  @override
  void initState() {
    super.initState();
    _filteredStatuses = widget.statuses;
  }

  void _performSearch() {
    setState(() {
      _searchQuery = _searchController.text.toLowerCase();
      _filteredStatuses = widget.statuses.where((status) {
        // Filtro por búsqueda
        final matchesSearch = status.title.toLowerCase().contains(_searchQuery) ||
                             status.description.toLowerCase().contains(_searchQuery);
        
        // Filtro por tipo de medio
        final matchesMediaType = _selectedMediaType == null || 
                                status.mediaType == _selectedMediaType;
        
        return matchesSearch && matchesMediaType;
      }).toList();
    });
  }

  void _clearFilters() {
    setState(() {
      _searchController.clear();
      _searchQuery = '';
      _selectedMediaType = null;
      _filteredStatuses = widget.statuses;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Buscar Estados de WhatsApp'),
        backgroundColor: Colors.green,
        foregroundColor: Colors.white,
      ),
      body: Column(
        children: [
          // Barra de búsqueda
          Container(
            padding: const EdgeInsets.all(16),
            child: TextField(
              controller: _searchController,
              decoration: InputDecoration(
                hintText: 'Buscar estados de WhatsApp...',
                prefixIcon: const Icon(Icons.search),
                suffixIcon: _searchQuery.isNotEmpty
                    ? IconButton(
                        icon: const Icon(Icons.clear),
                        onPressed: () {
                          _searchController.clear();
                          _performSearch();
                        },
                      )
                    : null,
                border: const OutlineInputBorder(
                  borderRadius: BorderRadius.all(Radius.circular(12)),
                ),
                filled: true,
                fillColor: Colors.grey.shade50,
              ),
              onChanged: (value) => _performSearch(),
            ),
          ),
          
          // Filtros
          Container(
            padding: const EdgeInsets.symmetric(horizontal: 16),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Row(
                  children: [
                    const Text(
                      'Filtrar por tipo:',
                      style: TextStyle(
                        fontWeight: FontWeight.bold,
                        fontSize: 16,
                      ),
                    ),
                    const Spacer(),
                    TextButton.icon(
                      onPressed: _clearFilters,
                      icon: const Icon(Icons.clear, size: 16),
                      label: const Text('Limpiar'),
                    ),
                  ],
                ),
                const SizedBox(height: 8),
                Wrap(
                  spacing: 8,
                  children: [
                    FilterChip(
                      label: const Text('Todos'),
                      selected: _selectedMediaType == null,
                      onSelected: (selected) {
                        setState(() {
                          _selectedMediaType = null;
                        });
                        _performSearch();
                      },
                    ),
                    FilterChip(
                      label: const Row(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          Icon(Icons.image, size: 16),
                          SizedBox(width: 4),
                          Text('Imágenes'),
                        ],
                      ),
                      selected: _selectedMediaType == MediaType.image,
                      onSelected: (selected) {
                        setState(() {
                          _selectedMediaType = selected ? MediaType.image : null;
                        });
                        _performSearch();
                      },
                    ),
                    FilterChip(
                      label: const Row(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          Icon(Icons.video_library, size: 16),
                          SizedBox(width: 4),
                          Text('Videos'),
                        ],
                      ),
                      selected: _selectedMediaType == MediaType.video,
                      onSelected: (selected) {
                        setState(() {
                          _selectedMediaType = selected ? MediaType.video : null;
                        });
                        _performSearch();
                      },
                    ),
                    FilterChip(
                      label: const Row(
                        mainAxisSize: MainAxisSize.min,
                        children: [
                          Icon(Icons.audiotrack, size: 16),
                          SizedBox(width: 4),
                          Text('Audio'),
                        ],
                      ),
                      selected: _selectedMediaType == MediaType.audio,
                      onSelected: (selected) {
                        setState(() {
                          _selectedMediaType = selected ? MediaType.audio : null;
                        });
                        _performSearch();
                      },
                    ),
                  ],
                ),
              ],
            ),
          ),
          
          // Resultados
          Expanded(
            child: _filteredStatuses.isEmpty
                ? Center(
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Icon(
                          Icons.search_off,
                          size: 64,
                          color: Colors.grey.shade400,
                        ),
                        const SizedBox(height: 16),
                        Text(
                          _searchQuery.isEmpty
                              ? 'No hay estados de WhatsApp disponibles'
                              : 'No se encontraron resultados para "$_searchQuery"',
                          style: TextStyle(
                            fontSize: 16,
                            color: Colors.grey.shade600,
                          ),
                          textAlign: TextAlign.center,
                        ),
                        if (_searchQuery.isNotEmpty) ...[
                          const SizedBox(height: 8),
                          Text(
                            'Intenta con otros términos de búsqueda',
                            style: TextStyle(
                              fontSize: 14,
                              color: Colors.grey.shade500,
                            ),
                          ),
                        ],
                      ],
                    ),
                  )
                : ListView.builder(
                    padding: const EdgeInsets.all(16),
                    itemCount: _filteredStatuses.length,
                    itemBuilder: (context, index) {
                      final status = _filteredStatuses[index];
                      return Padding(
                        padding: const EdgeInsets.only(bottom: 16),
                        child: StatusCard(
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
                      );
                    },
                  ),
          ),
        ],
      ),
    );
  }

  @override
  void dispose() {
    _searchController.dispose();
    super.dispose();
  }
} 
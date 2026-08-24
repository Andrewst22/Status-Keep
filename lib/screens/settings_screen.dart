import 'dart:async';
import 'package:flutter/material.dart';
import 'package:share_plus/share_plus.dart';
import 'package:url_launcher/url_launcher.dart';
import '../services/auto_save_service.dart';
import '../services/language_service.dart';
import '../utils/app_localizations.dart';

class SettingsScreen extends StatefulWidget {
  const SettingsScreen({super.key});

  @override
  State<SettingsScreen> createState() => _SettingsScreenState();
}

class _SettingsScreenState extends State<SettingsScreen> with SingleTickerProviderStateMixin {
  final AutoSaveService _autoSaveService = AutoSaveService();
  final LanguageService _languageService = LanguageService();
  
  bool _notifyNewStatuses = false;
  bool _autoSaveStatuses = false;
  String _selectedLanguage = 'Español';

  // Animación para el botón de eliminar anuncios
  late AnimationController _removeAdsController;
  late Animation<double> _removeAdsScale;

  // Stream subscription para escuchar cambios de idioma
  StreamSubscription? _languageSubscription;

  @override
  void initState() {
    super.initState();
    _loadAutoSaveState();
    _loadLanguageState();
    
    // Escuchar cambios de idioma
    _languageSubscription = _languageService.languageStream.listen((_) {
      setState(() {
        // Reconstruir la UI cuando cambie el idioma
      });
    });

    // Inicializar animación de palpitación
    _removeAdsController = AnimationController(
      vsync: this,
      duration: const Duration(milliseconds: 900),
    )..repeat(reverse: true);
    _removeAdsScale = Tween<double>(begin: 0.97, end: 1.08).animate(
      CurvedAnimation(
        parent: _removeAdsController,
        curve: Curves.easeInOut,
      ),
    );
  }

  @override
  void dispose() {
    _languageSubscription?.cancel();
    _removeAdsController.dispose();
    super.dispose();
  }

  Future<void> _loadLanguageState() async {
    await _languageService.initialize();
    setState(() {
      _selectedLanguage = _languageService.currentLanguageName;
    });
  }

  Future<void> _loadAutoSaveState() async {
    final isEnabled = _autoSaveService.isAutoSaveEnabled;
    final notificationsEnabled = _autoSaveService.notificationsEnabled;
    setState(() {
      _autoSaveStatuses = isEnabled;
      _notifyNewStatuses = notificationsEnabled;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xFF121212),
      appBar: AppBar(
        backgroundColor: const Color(0xFF1A1A1A),
        foregroundColor: Colors.white,
        title: Text(
          AppLocalizations.get('configuracion'),
          style: const TextStyle(
            fontSize: 18,
            fontWeight: FontWeight.w600,
          ),
        ),
        elevation: 0,
        centerTitle: true,
      ),
      body: Container(
        decoration: const BoxDecoration(
          gradient: LinearGradient(
            begin: Alignment.topCenter,
            end: Alignment.bottomCenter,
            colors: [
              Color(0xFF1A1A1A),
              Color(0xFF121212),
            ],
          ),
        ),
        child: ListView(
          padding: const EdgeInsets.all(16),
          children: [
            // Opción Eliminar anuncios (primera opción)
            _buildRemoveAdsTile(),
            const SizedBox(height: 24),
            // Sección de Notificaciones
            _buildSection(
              title: AppLocalizations.get('notificaciones'),
              icon: Icons.notifications_outlined,
              children: [
                _buildSwitchTile(
                  title: AppLocalizations.get('notificar_nuevos_estados'),
                  subtitle: AppLocalizations.get('notificar_nuevos_estados_desc'),
                  value: _notifyNewStatuses,
                  onChanged: (value) async {
                    setState(() {
                      _notifyNewStatuses = value;
                    });
                    
                    // Activar/desactivar notificaciones
                    await _autoSaveService.setNotificationsEnabled(value);
                    
                    // Mostrar mensaje de confirmación
                    if (mounted) {
                      ScaffoldMessenger.of(context).showSnackBar(
                        SnackBar(
                          content: Text(
                            value 
                              ? AppLocalizations.get('notificaciones_activadas')
                              : AppLocalizations.get('notificaciones_desactivadas'),
                          ),
                          backgroundColor: value ? Colors.blue.shade600 : Colors.grey.shade600,
                          duration: const Duration(seconds: 2),
                        ),
                      );
                    }
                  },
                ),
              ],
            ),
            
            const SizedBox(height: 24),
            
            // Sección de Guardado Automático
            _buildSection(
              title: AppLocalizations.get('guardado_automatico'),
              icon: Icons.auto_awesome_outlined,
              children: [
                _buildSwitchTile(
                  title: AppLocalizations.get('guardar_automaticamente'),
                  subtitle: AppLocalizations.get('guardar_automaticamente_desc'),
                  value: _autoSaveStatuses,
                  onChanged: (value) async {
                    setState(() {
                      _autoSaveStatuses = value;
                    });
                    
                    // Activar/desactivar guardado automático
                    await _autoSaveService.setAutoSaveEnabled(value);
                    
                    // Mostrar mensaje de confirmación
                    if (mounted) {
                      ScaffoldMessenger.of(context).showSnackBar(
                        SnackBar(
                          content: Text(
                            value 
                              ? AppLocalizations.get('guardado_automatico_activado')
                              : AppLocalizations.get('guardado_automatico_desactivado'),
                          ),
                          backgroundColor: value ? Colors.green.shade600 : Colors.grey.shade600,
                          duration: const Duration(seconds: 2),
                        ),
                      );
                    }
                  },
                ),
              ],
            ),
            
            const SizedBox(height: 24),
            
            // Sección de Idioma
            _buildSection(
              title: AppLocalizations.get('idioma'),
              icon: Icons.language_outlined,
              children: [
                _buildDropdownTile(
                  title: AppLocalizations.get('idioma_aplicacion'),
                  subtitle: AppLocalizations.get('idioma_aplicacion_desc'),
                  value: _selectedLanguage,
                  items: AppLocalizations.availableLanguages.values.toList(),
                  onChanged: (value) async {
                    if (value != null) {
                      final languageCode = AppLocalizations.getLanguageCode(value);
                      if (languageCode != null) {
                        await AppLocalizations.changeLanguage(languageCode);
                        setState(() {
                          _selectedLanguage = value;
                        });
                        
                        // Mostrar mensaje de confirmación
                        if (mounted) {
                          ScaffoldMessenger.of(context).showSnackBar(
                            SnackBar(
                              content: Text(AppLocalizations.get('idioma_cambiado')),
                              backgroundColor: Colors.green.shade600,
                              duration: const Duration(seconds: 2),
                            ),
                          );
                        }
                      }
                    }
                  },
                ),
              ],
            ),
            

            
            // Sección de Información y Enlaces
            _buildSection(
              title: AppLocalizations.get('informacion'),
              icon: Icons.info_outline,
              children: [
                _buildActionTile(
                  title: AppLocalizations.get('politica_privacidad'),
                  subtitle: AppLocalizations.get('politica_privacidad_desc'),
                  icon: Icons.privacy_tip_outlined,
                  onTap: () {
                    // TODO: Implementar navegación a política de privacidad
                    _showPrivacyPolicy();
                  },
                ),
                _buildDivider(),
                _buildActionTile(
                  title: AppLocalizations.get('compartir_app'),
                  subtitle: AppLocalizations.get('compartir_app_desc'),
                  icon: Icons.share_outlined,
                  onTap: () {
                    _shareApp();
                  },
                ),
                _buildDivider(),
                _buildActionTile(
                  title: AppLocalizations.get('calificar_app'),
                  subtitle: AppLocalizations.get('calificar_app_desc'),
                  icon: Icons.star_outline,
                  onTap: () {
                    // TODO: Implementar navegación a Google Play
                    _rateApp();
                  },
                ),
                _buildDivider(),
                _buildActionTile(
                  title: 'GitHub del autor',
                  subtitle: '@Andrewst22',
                  icon: Icons.person_outline,
                  onTap: () {
                    _openGitHubUser();
                  },
                ),
                _buildDivider(),
                _buildActionTile(
                  title: 'Repositorio oficial',
                  subtitle: 'Status-Keep',
                  icon: Icons.code_outlined,
                  onTap: () {
                    _openGitHubRepo();
                  },
                ),
              ],
            ),
            
            const SizedBox(height: 32),
            
            // Información de la app
            _buildInfoSection(),
          ],
        ),
      ),
    );
  }

  Widget _buildSection({
    required String title,
    required IconData icon,
    required List<Widget> children,
  }) {
    return Container(
      decoration: BoxDecoration(
        color: const Color(0xFF1E1E1E),
        borderRadius: BorderRadius.circular(12),
        border: Border.all(
          color: const Color(0xFF2A2A2A),
          width: 1,
        ),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          // Header de la sección
          Container(
            padding: const EdgeInsets.all(16),
            decoration: BoxDecoration(
              color: const Color(0xFF252525),
              borderRadius: const BorderRadius.only(
                topLeft: Radius.circular(12),
                topRight: Radius.circular(12),
              ),
            ),
            child: Row(
              children: [
                Icon(
                  icon,
                  color: Colors.green.shade400,
                  size: 20,
                ),
                const SizedBox(width: 12),
                Text(
                  title,
                  style: const TextStyle(
                    color: Colors.white,
                    fontSize: 16,
                    fontWeight: FontWeight.w600,
                  ),
                ),
              ],
            ),
          ),
          // Contenido de la sección
          ...children,
        ],
      ),
    );
  }

  Widget _buildSwitchTile({
    required String title,
    required String subtitle,
    required bool value,
    required ValueChanged<bool> onChanged,
  }) {
    return Container(
      padding: const EdgeInsets.all(16),
      child: Row(
        children: [
          Expanded(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  title,
                  style: const TextStyle(
                    color: Colors.white,
                    fontSize: 15,
                    fontWeight: FontWeight.w500,
                  ),
                ),
                const SizedBox(height: 4),
                Text(
                  subtitle,
                  style: TextStyle(
                    color: Colors.grey.shade400,
                    fontSize: 13,
                  ),
                ),
              ],
            ),
          ),
          Switch(
            value: value,
            onChanged: onChanged,
            activeColor: Colors.green.shade400,
            activeTrackColor: Colors.green.shade200,
            inactiveThumbColor: Colors.grey.shade600,
            inactiveTrackColor: Colors.grey.shade800,
          ),
        ],
      ),
    );
  }

  Widget _buildDropdownTile({
    required String title,
    required String subtitle,
    required String value,
    required List<String> items,
    required ValueChanged<String?> onChanged,
  }) {
    return Container(
      padding: const EdgeInsets.all(16),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            title,
            style: const TextStyle(
              color: Colors.white,
              fontSize: 15,
              fontWeight: FontWeight.w500,
            ),
          ),
          const SizedBox(height: 4),
          Text(
            subtitle,
            style: TextStyle(
              color: Colors.grey.shade400,
              fontSize: 13,
            ),
          ),
          const SizedBox(height: 12),
          Container(
            width: double.infinity,
            padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 8),
            decoration: BoxDecoration(
              color: const Color(0xFF252525),
              borderRadius: BorderRadius.circular(8),
              border: Border.all(
                color: const Color(0xFF2A2A2A),
                width: 1,
              ),
            ),
            child: DropdownButtonHideUnderline(
              child: DropdownButton<String>(
                value: value,
                onChanged: onChanged,
                dropdownColor: const Color(0xFF252525),
                style: const TextStyle(
                  color: Colors.white,
                  fontSize: 14,
                ),
                icon: Icon(
                  Icons.keyboard_arrow_down,
                  color: Colors.grey.shade400,
                ),
                items: items.map((String language) {
                  return DropdownMenuItem<String>(
                    value: language,
                    child: Text(language),
                  );
                }).toList(),
              ),
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildActionTile({
    required String title,
    required String subtitle,
    required IconData icon,
    required VoidCallback onTap,
  }) {
    return InkWell(
      onTap: onTap,
      borderRadius: BorderRadius.circular(8),
      child: Container(
        padding: const EdgeInsets.all(16),
        child: Row(
          children: [
            Icon(
              icon,
              color: Colors.green.shade400,
              size: 20,
            ),
            const SizedBox(width: 16),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    title,
                    style: const TextStyle(
                      color: Colors.white,
                      fontSize: 15,
                      fontWeight: FontWeight.w500,
                    ),
                  ),
                  const SizedBox(height: 4),
                  Text(
                    subtitle,
                    style: TextStyle(
                      color: Colors.grey.shade400,
                      fontSize: 13,
                    ),
                  ),
                ],
              ),
            ),
            Icon(
              Icons.arrow_forward_ios,
              color: Colors.grey.shade500,
              size: 16,
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildDivider() {
    return Container(
      margin: const EdgeInsets.symmetric(horizontal: 16),
      height: 1,
      color: const Color(0xFF2A2A2A),
    );
  }

  void _shareApp() {
    Share.share(
      '¡Mira esta increíble app para guardar estados de WhatsApp! 📱✨\n\nStatusKeep - Guarda y organiza todos tus estados favoritos de WhatsApp de forma fácil y rápida.\n\nDescárgala ahora: [Link de la app]',
      subject: 'StatusKeep - Guarda tus estados favoritos',
    );
  }

  Future<void> _openGitHubUser() async {
    const url = 'https://github.com/Andrewst22';
    if (await canLaunchUrl(Uri.parse(url))) {
      await launchUrl(Uri.parse(url), mode: LaunchMode.externalApplication);
    } else if (mounted) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(
          content: Text('No se pudo abrir el perfil de GitHub'),
          backgroundColor: Colors.red,
        ),
      );
    }
  }

  Future<void> _openGitHubRepo() async {
    const url = 'https://github.com/Andrewst22/Status-Keep';
    if (await canLaunchUrl(Uri.parse(url))) {
      await launchUrl(Uri.parse(url), mode: LaunchMode.externalApplication);
    } else if (mounted) {
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(
          content: Text('No se pudo abrir el repositorio de GitHub'),
          backgroundColor: Colors.red,
        ),
      );
    }
  }

  void _showPrivacyPolicy() {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          backgroundColor: const Color(0xFF1E1E1E),
          title: const Text(
            'Política de Privacidad',
            style: TextStyle(
              color: Colors.white,
              fontSize: 18,
              fontWeight: FontWeight.w600,
            ),
          ),
          content: SingleChildScrollView(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              mainAxisSize: MainAxisSize.min,
              children: [
                Text(
                  'Tu privacidad es importante para nosotros.',
                  style: TextStyle(
                    color: Colors.grey.shade300,
                    fontSize: 14,
                    fontWeight: FontWeight.w500,
                  ),
                ),
                const SizedBox(height: 12),
                Text(
                  '• No recopilamos información personal\n'
                  '• No compartimos datos con terceros\n'
                  '• Los archivos se guardan solo en tu dispositivo\n'
                  '• No accedemos a tus conversaciones de WhatsApp\n'
                  '• Solo leemos los estados que tú autorizas',
                  style: TextStyle(
                    color: Colors.grey.shade400,
                    fontSize: 13,
                  ),
                ),
              ],
            ),
          ),
          actions: [
            TextButton(
              onPressed: () => Navigator.of(context).pop(),
              child: Text(
                'Entendido',
                style: TextStyle(
                  color: Colors.green.shade400,
                  fontSize: 14,
                  fontWeight: FontWeight.w500,
                ),
              ),
            ),
          ],
        );
      },
    );
  }

  void _rateApp() async {
    const url = 'https://play.google.com/store/apps/details?id=com.example.flutter_application_1';
    if (await canLaunchUrl(Uri.parse(url))) {
      await launchUrl(Uri.parse(url), mode: LaunchMode.externalApplication);
    } else {
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: const Text('No se pudo abrir Google Play'),
            backgroundColor: Colors.red.shade400,
          ),
        );
      }
    }
  }









  Widget _buildInfoSection() {
    return Container(
      padding: const EdgeInsets.all(16),
      decoration: BoxDecoration(
        color: const Color(0xFF1E1E1E),
        borderRadius: BorderRadius.circular(12),
        border: Border.all(
          color: const Color(0xFF2A2A2A),
          width: 1,
        ),
      ),
      child: Column(
        children: [
          Icon(
            Icons.info_outline,
            color: Colors.grey.shade400,
            size: 24,
          ),
          const SizedBox(height: 8),
          Text(
            'StatusKeep',
            style: TextStyle(
              color: Colors.grey.shade300,
              fontSize: 14,
              fontWeight: FontWeight.w500,
            ),
          ),
          const SizedBox(height: 4),
          Text(
            '${AppLocalizations.get('version')} 1.0.0',
            style: TextStyle(
              color: Colors.grey.shade500,
              fontSize: 12,
            ),
          ),
        ],
      ),
    );
  }

  // NUEVO: Widget para la opción de eliminar anuncios
  Widget _buildRemoveAdsTile() {
    return AnimatedBuilder(
      animation: _removeAdsScale,
      builder: (context, child) {
        return Transform.scale(
          scale: _removeAdsScale.value,
          child: child,
        );
      },
      child: InkWell(
        onTap: () {
          // Aquí puedes implementar la lógica para eliminar anuncios o mostrar un diálogo de compra
          showDialog(
            context: context,
            builder: (context) => AlertDialog(
              backgroundColor: const Color(0xFFFFF8E1),
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(16)),
              title: Row(
                children: [
                  Icon(Icons.emoji_events, color: Colors.amber.shade700, size: 28),
                  const SizedBox(width: 8),
                  Text(
                    AppLocalizations.get('eliminar_anuncios'),
                    style: const TextStyle(
                      color: Color(0xFF8A6D1B),
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ],
              ),
              content: Text(
                AppLocalizations.get('eliminar_anuncios_desc'),
                style: const TextStyle(color: Color(0xFF8A6D1B)),
              ),
              actions: [
                TextButton(
                  onPressed: () => Navigator.of(context).pop(),
                  child: const Text('Cerrar', style: TextStyle(color: Color(0xFF8A6D1B))),
                ),
              ],
            ),
          );
        },
        borderRadius: BorderRadius.circular(12),
        child: Container(
          decoration: BoxDecoration(
            color: Colors.amber.shade400,
            borderRadius: BorderRadius.circular(12),
            boxShadow: [
              BoxShadow(
                color: Colors.amber.shade200.withOpacity(0.4),
                blurRadius: 8,
                offset: const Offset(0, 2),
              ),
            ],
          ),
          padding: const EdgeInsets.symmetric(horizontal: 20, vertical: 18),
          child: Row(
            children: [
              Icon(Icons.emoji_events, color: Colors.white, size: 28),
              const SizedBox(width: 16),
              Expanded(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      AppLocalizations.get('eliminar_anuncios'),
                      style: const TextStyle(
                        color: Colors.white,
                        fontSize: 17,
                        fontWeight: FontWeight.bold,
                        letterSpacing: 0.5,
                      ),
                    ),
                    const SizedBox(height: 4),
                    Text(
                      AppLocalizations.get('eliminar_anuncios_desc'),
                      style: const TextStyle(
                        color: Color(0xFF8A6D1B),
                        fontSize: 13.5,
                        fontWeight: FontWeight.w500,
                      ),
                    ),
                  ],
                ),
              ),
              const SizedBox(width: 8),
              Icon(Icons.arrow_forward_ios, color: Color(0xFF8A6D1B), size: 18),
            ],
          ),
        ),
      ),
    );
  }
} 
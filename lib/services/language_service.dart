import 'dart:async';
import 'package:shared_preferences/shared_preferences.dart';

class LanguageService {
  static final LanguageService _instance = LanguageService._internal();
  factory LanguageService() => _instance;
  LanguageService._internal();

  static const String _languageKey = 'selected_language';
  static const String _defaultLanguage = 'es';

  // Stream controller para notificar cambios de idioma
  final StreamController<String> _languageController = StreamController<String>.broadcast();

  // Stream público para escuchar cambios de idioma
  Stream<String> get languageStream => _languageController.stream;

  // Idiomas disponibles
  static const Map<String, String> _languages = {
    'es': 'Español',
    'en': 'English',
    'pt': 'Português',
    'fr': 'Français',
    'de': 'Deutsch',
    'it': 'Italiano',
  };

  // Obtener idioma actual
  String _currentLanguage = _defaultLanguage;

  // Getters
  String get currentLanguage => _currentLanguage;
  String get currentLanguageName => _languages[_currentLanguage] ?? 'Español';
  Map<String, String> get availableLanguages => Map.from(_languages);

  /// Inicializar el servicio de idiomas
  Future<void> initialize() async {
    try {
      final prefs = await SharedPreferences.getInstance();
      final savedLanguage = prefs.getString(_languageKey);
      
      if (savedLanguage != null && _languages.containsKey(savedLanguage)) {
        _currentLanguage = savedLanguage;
      } else {
        _currentLanguage = _defaultLanguage;
      }
      
      print('🌍 Idioma inicializado: ${_languages[_currentLanguage]}');
    } catch (e) {
      print('❌ Error al inicializar idioma: $e');
      _currentLanguage = _defaultLanguage;
    }
  }

  /// Cambiar idioma
  Future<void> changeLanguage(String languageCode) async {
    if (!_languages.containsKey(languageCode)) {
      print('❌ Idioma no soportado: $languageCode');
      return;
    }

    try {
      final prefs = await SharedPreferences.getInstance();
      await prefs.setString(_languageKey, languageCode);
      
      _currentLanguage = languageCode;
      _languageController.add(languageCode);
      
      print('🌍 Idioma cambiado a: ${_languages[languageCode]}');
    } catch (e) {
      print('❌ Error al cambiar idioma: $e');
    }
  }

  /// Obtener idioma por nombre
  String? getLanguageCode(String languageName) {
    for (final entry in _languages.entries) {
      if (entry.value == languageName) {
        return entry.key;
      }
    }
    return null;
  }

  /// Obtener nombre del idioma por código
  String getLanguageName(String languageCode) {
    return _languages[languageCode] ?? 'Español';
  }

  /// Limpiar recursos
  void dispose() {
    _languageController.close();
  }
} 
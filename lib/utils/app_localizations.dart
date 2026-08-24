import '../services/language_service.dart';
import 'translations.dart';

class AppLocalizations {
  static final LanguageService _languageService = LanguageService();

  /// Obtener traducción
  static String get(String key) {
    return Translations.get(key, _languageService.currentLanguage);
  }

  /// Obtener traducción con parámetros
  static String getWithParams(String key, Map<String, String> params) {
    return Translations.getWithParams(key, _languageService.currentLanguage, params);
  }

  /// Obtener idioma actual
  static String get currentLanguage => _languageService.currentLanguage;

  /// Obtener nombre del idioma actual
  static String get currentLanguageName => _languageService.currentLanguageName;

  /// Obtener idiomas disponibles
  static Map<String, String> get availableLanguages => _languageService.availableLanguages;

  /// Cambiar idioma
  static Future<void> changeLanguage(String languageCode) async {
    await _languageService.changeLanguage(languageCode);
  }

  /// Obtener código de idioma por nombre
  static String? getLanguageCode(String languageName) {
    return _languageService.getLanguageCode(languageName);
  }

  /// Obtener nombre de idioma por código
  static String getLanguageName(String languageCode) {
    return _languageService.getLanguageName(languageCode);
  }
} 
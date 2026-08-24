import 'package:flutter/material.dart';
import 'screens/home_screen.dart';
import 'services/notification_service.dart';
import 'services/language_service.dart';
import 'dart:async';
import 'package:flutter/services.dart';
import 'package:flutter/gestures.dart';
import 'utils/translations.dart';
import 'package:url_launcher/url_launcher.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  
  // Inicializar el servicio de notificaciones
  final notificationService = NotificationService();
  await notificationService.initialize();
  
  // Inicializar el servicio de idiomas
  final languageService = LanguageService();
  await languageService.initialize();
  
  runApp(const SocialStatusDownloaderApp());
}

class SocialStatusDownloaderApp extends StatelessWidget {
  const SocialStatusDownloaderApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'StatusKeep',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(
          seedColor: Colors.green,
          brightness: Brightness.light,
        ),
        useMaterial3: true,
        appBarTheme: const AppBarTheme(
          backgroundColor: Colors.green,
          foregroundColor: Colors.white,
          elevation: 0,
          centerTitle: true,
        ),
        cardTheme: CardThemeData(
          elevation: 4,
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(16),
          ),
        ),
        elevatedButtonTheme: ElevatedButtonThemeData(
          style: ElevatedButton.styleFrom(
            backgroundColor: Colors.green,
            foregroundColor: Colors.white,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(12),
            ),
            padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 12),
          ),
        ),
        floatingActionButtonTheme: const FloatingActionButtonThemeData(
          backgroundColor: Colors.green,
          foregroundColor: Colors.white,
        ),
        chipTheme: ChipThemeData(
          backgroundColor: Colors.grey[200],
          selectedColor: Colors.green[100],
          checkmarkColor: Colors.green,
          labelStyle: const TextStyle(fontWeight: FontWeight.w500),
        ),
      ),
      darkTheme: ThemeData(
        colorScheme: ColorScheme.fromSeed(
          seedColor: Colors.green,
          brightness: Brightness.dark,
        ),
        useMaterial3: true,
        appBarTheme: const AppBarTheme(
          backgroundColor: Color(0xFF222E23),
          foregroundColor: Colors.white,
          elevation: 0,
          centerTitle: true,
        ),
        cardTheme: CardThemeData(
          elevation: 4,
          color: const Color(0xFF232D25),
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(16),
          ),
        ),
        elevatedButtonTheme: ElevatedButtonThemeData(
          style: ElevatedButton.styleFrom(
            backgroundColor: Colors.green[700],
            foregroundColor: Colors.white,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(12),
            ),
            padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 12),
          ),
        ),
        floatingActionButtonTheme: const FloatingActionButtonThemeData(
          backgroundColor: Color(0xFF1B5E20),
          foregroundColor: Colors.white,
        ),
        chipTheme: ChipThemeData(
          backgroundColor: Colors.grey[800],
          selectedColor: Colors.green[900],
          checkmarkColor: Colors.green[300],
          labelStyle: const TextStyle(fontWeight: FontWeight.w500, color: Colors.white),
        ),
      ),
      themeMode: ThemeMode.system,
      home: const SplashScreen(),
    );
  }
}

// Pantalla de intro animada tipo TikTok con barra de carga y carga optimizada
class SplashScreen extends StatefulWidget {
  const SplashScreen({super.key});

  @override
  State<SplashScreen> createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> with SingleTickerProviderStateMixin {
  late AnimationController _controller;
  late Animation<double> _scaleAnim;
  late Animation<double> _fadeAnim;
  double _progress = 0.0;
  bool _initialized = false;

  @override
  void initState() {
    super.initState();
    _controller = AnimationController(
      vsync: this,
      duration: const Duration(milliseconds: 1400),
    );
    _scaleAnim = Tween<double>(begin: 0.7, end: 1.0).animate(
      CurvedAnimation(parent: _controller, curve: Curves.elasticOut),
    );
    _fadeAnim = Tween<double>(begin: 0.0, end: 1.0).animate(
      CurvedAnimation(parent: _controller, curve: Curves.easeIn),
    );
    _controller.forward();
    _startInitialization();
    // Ocultar barra de estado para efecto más limpio
    SystemChrome.setEnabledSystemUIMode(SystemUiMode.immersiveSticky);
  }

  Future<void> _startInitialization() async {
    // Simular carga de servicios en paralelo y actualizar progreso
    final totalSteps = 3;
    int completed = 0;
    void updateProgress() {
      setState(() {
        _progress = (++completed) / totalSteps;
      });
    }
    // Inicializar notificaciones
    await NotificationService().initialize();
    updateProgress();
    // Inicializar idioma
    await LanguageService().initialize();
    updateProgress();
    // Simular otra tarea pesada (puedes agregar más tareas reales aquí)
    await Future.delayed(const Duration(milliseconds: 600));
    updateProgress();
    // Cuando todo esté listo, navegar
    setState(() {
      _initialized = true;
    });
    // Asegurar que la intro dure exactamente 1.5 segundos
    await Future.delayed(const Duration(milliseconds: 1500));
    if (mounted) {
      Navigator.of(context).pushReplacement(
        MaterialPageRoute(builder: (_) => const HomeScreen()),
      );
    }
    // Restaurar barra de estado
    SystemChrome.setEnabledSystemUIMode(SystemUiMode.edgeToEdge);
  }

  @override
  void dispose() {
    _controller.dispose();
    SystemChrome.setEnabledSystemUIMode(SystemUiMode.edgeToEdge);
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      body: Stack(
        children: [
          Center(
            child: AnimatedBuilder(
              animation: _controller,
              builder: (context, child) {
                return Opacity(
                  opacity: _fadeAnim.value,
                  child: Transform.scale(
                    scale: _scaleAnim.value,
                    child: child,
                  ),
                );
              },
              child: Image.asset(
                'assets/images/4638a1.png',
                width: MediaQuery.of(context).size.width * 0.55,
                fit: BoxFit.contain,
              ),
            ),
          ),
          // Disclaimer with clickable privacy policy link
          Positioned(
            left: 0,
            right: 0,
            bottom: MediaQuery.of(context).size.height * 0.28,
            child: Center(
              child: Padding(
                padding: const EdgeInsets.symmetric(horizontal: 32.0),
                child: _IntroDisclaimerWidget(),
              ),
            ),
          ),
          // Barra de carga verde centrada en la parte inferior
          Positioned(
            left: 0,
            right: 0,
            bottom: MediaQuery.of(context).size.height * 0.18,
            child: Center(
              child: Container(
                width: MediaQuery.of(context).size.width * 0.5,
                height: 8,
                decoration: BoxDecoration(
                  color: Colors.white.withOpacity(0.12),
                  borderRadius: BorderRadius.circular(8),
                ),
                child: Stack(
                  children: [
                    AnimatedContainer(
                      duration: const Duration(milliseconds: 300),
                      width: MediaQuery.of(context).size.width * 0.5 * _progress,
                      height: 8,
                      decoration: BoxDecoration(
                        color: Colors.green,
                        borderRadius: BorderRadius.circular(8),
                      ),
                    ),
                  ],
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}

class _IntroDisclaimerWidget extends StatelessWidget {
  final String privacyUrl = 'https://your-privacy-policy-url.com';

  const _IntroDisclaimerWidget();

  @override
  Widget build(BuildContext context) {
    // Use the singleton instance to get the current language
    String languageCode = LanguageService().currentLanguage;
    final linkText = Translations.get('intro_policies_link', languageCode);
    final disclaimer = Translations.getWithParams('intro_disclaimer', languageCode, {'link': linkText});

    // Split disclaimer to replace {link} with clickable text
    final parts = disclaimer.split(linkText);

    return RichText(
      textAlign: TextAlign.center,
      text: TextSpan(
        style: TextStyle(color: Colors.grey[400], fontSize: 13),
        children: [
          TextSpan(text: parts[0]),
          TextSpan(
            text: linkText,
            style: const TextStyle(
              color: Colors.green,
              decoration: TextDecoration.underline,
              fontWeight: FontWeight.w600,
            ),
            recognizer: TapGestureRecognizer()
              ..onTap = () async {
                final uri = Uri.parse(privacyUrl);
                if (await canLaunchUrl(uri)) {
                  await launchUrl(uri, mode: LaunchMode.externalApplication);
                }
              },
          ),
          if (parts.length > 1) TextSpan(text: parts[1]),
        ],
      ),
    );
  }
}

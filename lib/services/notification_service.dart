import 'package:flutter_local_notifications/flutter_local_notifications.dart';
import 'package:flutter/material.dart';
import 'dart:async';

class NotificationService {
  static final NotificationService _instance = NotificationService._internal();
  factory NotificationService() => _instance;
  NotificationService._internal();

  final FlutterLocalNotificationsPlugin _notifications = FlutterLocalNotificationsPlugin();
  bool _isInitialized = false;

  // Stream controller para notificar cuando se descarga un estado
  final StreamController<void> _downloadController = StreamController<void>.broadcast();

  // Stream público para escuchar las notificaciones de descarga
  Stream<void> get downloadStream => _downloadController.stream;

  /// Inicializar el servicio de notificaciones
  Future<void> initialize() async {
    if (_isInitialized) return;

    try {
      // Configuración para Android
      const AndroidInitializationSettings androidSettings = 
          AndroidInitializationSettings('@mipmap/ic_launcher');

      // Configuración para iOS
      const DarwinInitializationSettings iosSettings = 
          DarwinInitializationSettings(
        requestAlertPermission: true,
        requestBadgePermission: true,
        requestSoundPermission: true,
      );

      // Configuración general
      const InitializationSettings settings = InitializationSettings(
        android: androidSettings,
        iOS: iosSettings,
      );

      // Inicializar el plugin
      await _notifications.initialize(
        settings,
        onDidReceiveNotificationResponse: _onNotificationTapped,
      );

      _isInitialized = true;
      print('✅ Servicio de notificaciones inicializado correctamente');
    } catch (e) {
      print('❌ Error al inicializar notificaciones: $e');
    }
  }

  /// Mostrar notificación de nuevo estado
  Future<void> showNewStatusNotification({
    required String title,
    required String body,
    required String payload,
  }) async {
    if (!_isInitialized) {
      await initialize();
    }

    try {
      const AndroidNotificationDetails androidDetails = AndroidNotificationDetails(
        'whatsapp_status_channel',
        'Estados de WhatsApp',
        channelDescription: 'Notificaciones de nuevos estados de WhatsApp',
        importance: Importance.high,
        priority: Priority.high,
        showWhen: true,
        enableVibration: true,
        playSound: true,
        icon: '@mipmap/ic_launcher',
        color: Color(0xFF25D366), // Color verde de WhatsApp
        largeIcon: DrawableResourceAndroidBitmap('@mipmap/ic_launcher'),
        styleInformation: BigTextStyleInformation(''),
      );

      const DarwinNotificationDetails iosDetails = DarwinNotificationDetails(
        presentAlert: true,
        presentBadge: true,
        presentSound: true,
      );

      const NotificationDetails details = NotificationDetails(
        android: androidDetails,
        iOS: iosDetails,
      );

      // Generar ID único para la notificación
      final int notificationId = DateTime.now().millisecondsSinceEpoch % 2147483647;

      await _notifications.show(
        notificationId,
        title,
        body,
        details,
        payload: payload,
      );

      print('📱 Notificación enviada: $title');
    } catch (e) {
      print('❌ Error al mostrar notificación: $e');
    }
  }

  /// Mostrar notificación de múltiples estados nuevos
  Future<void> showMultipleStatusNotification({
    required int count,
    required String payload,
  }) async {
    await showNewStatusNotification(
      title: '🆕 Nuevos Estados de WhatsApp',
      body: 'Se han descargado automáticamente $count nuevos estados',
      payload: payload,
    );
  }

  /// Mostrar notificación de un estado específico
  Future<void> showSingleStatusNotification({
    required String fileName,
    required String mediaType,
    required String payload,
    required String contactName,
  }) async {
    final String mediaIcon = mediaType == 'image' ? '🖼️' : '🎥';
    
    await showNewStatusNotification(
      title: '$mediaIcon Nuevo Estado',
      body: '$contactName ha publicado un estado',
      payload: payload,
    );
  }

  /// Manejar cuando se toca una notificación
  void _onNotificationTapped(NotificationResponse response) {
    print('📱 Notificación tocada: ${response.payload}');
    
    // Aquí puedes agregar lógica para navegar a una pantalla específica
    // Por ejemplo, abrir la sección de estados guardados
    // Navigator.pushNamed(context, '/saved');
  }

  /// Cancelar todas las notificaciones
  Future<void> cancelAllNotifications() async {
    await _notifications.cancelAll();
    print('🗑️ Todas las notificaciones canceladas');
  }

  /// Cancelar una notificación específica
  Future<void> cancelNotification(int id) async {
    await _notifications.cancel(id);
    print('🗑️ Notificación $id cancelada');
  }

  /// Verificar si las notificaciones están habilitadas
  Future<bool> areNotificationsEnabled() async {
    if (!_isInitialized) {
      await initialize();
    }

    try {
      final bool? result = await _notifications.resolvePlatformSpecificImplementation<
          AndroidFlutterLocalNotificationsPlugin>()?.areNotificationsEnabled();
      return result ?? false;
    } catch (e) {
      print('❌ Error al verificar permisos de notificación: $e');
      return false;
    }
  }

  /// Solicitar permisos de notificación (iOS)
  Future<bool> requestPermissions() async {
    if (!_isInitialized) {
      await initialize();
    }

    try {
      final bool? result = await _notifications.resolvePlatformSpecificImplementation<
          IOSFlutterLocalNotificationsPlugin>()?.requestPermissions(
        alert: true,
        badge: true,
        sound: true,
      );
      return result ?? false;
    } catch (e) {
      print('❌ Error al solicitar permisos de notificación: $e');
      return false;
    }
  }

  // Método para notificar que se ha descargado un estado
  void notifyDownload() {
    _downloadController.add(null);
  }

  // Método para limpiar recursos
  void dispose() {
    _downloadController.close();
  }
} 
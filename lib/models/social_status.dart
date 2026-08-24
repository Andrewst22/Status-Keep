import 'package:flutter/material.dart';

enum MediaType { image, video, audio }

enum SocialPlatform { whatsapp }

class SocialStatus {
  final String id;
  final String title;
  final String description;
  final String mediaUrl;
  final MediaType mediaType;
  final SocialPlatform platform;
  final DateTime createdAt;
  final String? author;
  final int? duration; // en segundos, solo para videos
  final bool isDownloaded;
  final String? localPath; // ruta local del archivo descargado

  SocialStatus({
    required this.id,
    required this.title,
    required this.description,
    required this.mediaUrl,
    required this.mediaType,
    required this.platform,
    required this.createdAt,
    this.author,
    this.duration,
    this.isDownloaded = false,
    this.localPath,
  });

  // Método para obtener el icono de la plataforma
  IconData get platformIcon {
    switch (platform) {
      case SocialPlatform.whatsapp:
        return Icons.whatshot;
    }
  }

  // Método para obtener el color de la plataforma
  Color get platformColor {
    switch (platform) {
      case SocialPlatform.whatsapp:
        return Colors.green;
    }
  }

  // Método para obtener el nombre de la plataforma
  String get platformName {
    switch (platform) {
      case SocialPlatform.whatsapp:
        return 'WhatsApp';
    }
  }

  // Método para obtener el icono del tipo de medio
  IconData get mediaTypeIcon {
    switch (mediaType) {
      case MediaType.image:
        return Icons.image;
      case MediaType.video:
        return Icons.video_library;
      case MediaType.audio:
        return Icons.audiotrack;
    }
  }

  // Método para formatear la duración
  String get formattedDuration {
    if (duration == null) return '';
    final minutes = duration! ~/ 60;
    final seconds = duration! % 60;
    return '${minutes}:${seconds.toString().padLeft(2, '0')}';
  }

  // Método para formatear la fecha de creación
  String get formattedDate {
    final now = DateTime.now();
    final difference = now.difference(createdAt);

    if (difference.inDays > 0) {
      return '${difference.inDays} día${difference.inDays == 1 ? '' : 's'}';
    } else if (difference.inHours > 0) {
      return '${difference.inHours} hora${difference.inHours == 1 ? '' : 's'}';
    } else if (difference.inMinutes > 0) {
      return '${difference.inMinutes} minuto${difference.inMinutes == 1 ? '' : 's'}';
    } else {
      return 'Ahora';
    }
  }

  // Método para crear una copia con cambios
  SocialStatus copyWith({
    String? id,
    String? title,
    String? description,
    String? mediaUrl,
    MediaType? mediaType,
    SocialPlatform? platform,
    DateTime? createdAt,
    String? author,
    int? duration,
    bool? isDownloaded,
    String? localPath,
  }) {
    return SocialStatus(
      id: id ?? this.id,
      title: title ?? this.title,
      description: description ?? this.description,
      mediaUrl: mediaUrl ?? this.mediaUrl,
      mediaType: mediaType ?? this.mediaType,
      platform: platform ?? this.platform,
      createdAt: createdAt ?? this.createdAt,
      author: author ?? this.author,
      duration: duration ?? this.duration,
      isDownloaded: isDownloaded ?? this.isDownloaded,
      localPath: localPath ?? this.localPath,
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'title': title,
      'description': description,
      'mediaUrl': mediaUrl,
      'mediaType': mediaType.name,
      'platform': platform.name,
      'createdAt': createdAt.toIso8601String(),
      'author': author,
      'duration': duration,
      'isDownloaded': isDownloaded,
      'localPath': localPath,
    };
  }

  factory SocialStatus.fromJson(Map<String, dynamic> json) {
    return SocialStatus(
      id: json['id'],
      title: json['title'],
      description: json['description'],
      mediaUrl: json['mediaUrl'],
      mediaType: MediaType.values.firstWhere((e) => e.name == json['mediaType']),
      platform: SocialPlatform.values.firstWhere((e) => e.name == json['platform']),
      createdAt: DateTime.parse(json['createdAt']),
      author: json['author'],
      duration: json['duration'],
      isDownloaded: json['isDownloaded'] ?? false,
      localPath: json['localPath'],
    );
  }
} 
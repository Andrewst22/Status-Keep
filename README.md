# StatusKeep

StatusKeep es una aplicación móvil desarrollada con Flutter para visualizar,
guardar y organizar estados multimedia de WhatsApp. La app permite acceder a
los estados que el usuario autoriza, verlos en una galería y descargar
imágenes y videos para conservarlos en el dispositivo.

> **Nota:** StatusKeep no pertenece ni está afiliada a WhatsApp o Meta. El
> usuario debe contar con los derechos y permisos necesarios para guardar y
> compartir cualquier contenido.

## Funciones principales

- Acceso controlado a la carpeta de estados de WhatsApp.
- Visualización de imágenes y videos en una cuadrícula.
- Vista completa para revisar cada estado.
- Descarga individual o múltiple de estados.
- Organización de archivos descargados en una carpeta propia.
- Sección para consultar los archivos guardados.
- Búsqueda y filtrado por tipo de contenido.
- Guardado automático opcional.
- Notificaciones de nuevos estados y descargas.
- Tema claro y oscuro según la configuración del dispositivo.
- Interfaz disponible en varios idiomas.
- Enlaces directos al perfil del autor y al repositorio oficial de GitHub.

## Carpeta de estados de WhatsApp

En Android, la ubicación habitual de los estados es:

```text
/storage/emulated/0/Android/media/com.whatsapp/WhatsApp/Media/.Statuses
```

La app solicita que el usuario seleccione la carpeta:

```text
/storage/emulated/0/Android/media
```

Para conceder el acceso:

1. Pulsa **Solicitar permisos** dentro de StatusKeep.
2. En el selector de archivos, abre `Android` y después `media`.
3. Selecciona la carpeta `media` y confirma el permiso.

Si la carpeta `.Statuses` no aparece en el explorador, activa la opción
**Mostrar archivos ocultos**. Los estados de WhatsApp pueden desaparecer
después de aproximadamente 24 horas, según el funcionamiento de WhatsApp.

## Ubicación de las descargas

Cuando el dispositivo permite escribir en el almacenamiento público, StatusKeep
crea esta estructura:

```text
/storage/emulated/0/StatusKeep/WhatsApp
```

Si Android impide escribir en la raíz del almacenamiento, la app utiliza una
ubicación interna de respaldo para evitar que la descarga falle.

## Requisitos

- Flutter SDK compatible con Dart `^3.8.1`.
- Android Studio o las herramientas de compilación de Android.
- Un dispositivo Android con WhatsApp instalado y estados disponibles.
- Permiso de acceso a los archivos que el usuario desea visualizar.

## Instalación y ejecución

Clona el repositorio oficial y ejecuta:

```bash
git clone https://github.com/Andrewst22/Status-Keep.git
cd Status-Keep
flutter pub get
flutter run
```

Para generar una APK de lanzamiento:

```bash
flutter build apk --release
```

La APK se genera en:

```text
build/app/outputs/flutter-apk/app-release.apk
```

## Tecnologías utilizadas

- Flutter y Dart.
- `permission_handler` para permisos del sistema.
- `file_picker` para seleccionar carpetas.
- `path_provider` para rutas de almacenamiento.
- `video_player` y `chewie` para reproducir videos.
- `video_thumbnail` para miniaturas.
- `shared_preferences` para preferencias locales.
- `flutter_local_notifications` para notificaciones.
- `url_launcher` para abrir enlaces externos.

## Privacidad

StatusKeep está diseñada para trabajar con archivos locales del dispositivo.
No necesita acceder a conversaciones de WhatsApp. El acceso a los estados y
al almacenamiento se solicita mediante los permisos del sistema y queda bajo
control del usuario.

## Autor y repositorio

- **Autor:** [Andrewst22](https://github.com/Andrewst22)
- **Repositorio oficial:** [Andrewst22/Status-Keep](https://github.com/Andrewst22/Status-Keep)

Las sugerencias, reportes y contribuciones pueden realizarse desde el
repositorio oficial.

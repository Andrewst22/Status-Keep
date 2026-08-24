package io.flutter.plugins;

import R1.g;
import S1.a;
import T1.e;
import U1.b;
import V2.d;
import X1.c;
import android.util.Log;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import d.InterfaceC0249a;
import k2.C0562a;
import l2.C0611d;
import m2.C0627J;
import n2.C0665h;
import o2.C0718o;
import x1.C0900a;
@InterfaceC0249a
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f2979d.a(new g());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e2);
        }
        try {
            cVar.f2979d.a(new FlutterLocalNotificationsPlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e3);
        }
        try {
            cVar.f2979d.a(new C0562a());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e4);
        }
        try {
            cVar.f2979d.a(new a());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e5);
        }
        try {
            cVar.f2979d.a(new C0611d());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e6);
        }
        try {
            cVar.f2979d.a(new C0900a());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e7);
        }
        try {
            cVar.f2979d.a(new e());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e8);
        }
        try {
            cVar.f2979d.a(new C0627J());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e9);
        }
        try {
            cVar.f2979d.a(new C0665h());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e10);
        }
        try {
            cVar.f2979d.a(new C0718o());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e11);
        }
        try {
            cVar.f2979d.a(new d());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin video_thumbnail, xyz.justsoft.video_thumbnail.VideoThumbnailPlugin", e12);
        }
        try {
            cVar.f2979d.a(new b());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e13);
        }
    }
}

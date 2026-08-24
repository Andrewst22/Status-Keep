package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.plugin.platform.n;
import io.flutter.view.FlutterCallbackInformation;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import r2.AbstractC0766a;
import s.S;
/* loaded from: classes.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static B1.a f5127b;

    /* renamed from: c  reason: collision with root package name */
    public static X1.c f5128c;

    /* renamed from: a  reason: collision with root package name */
    public h0.i f5129a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED".equalsIgnoreCase(intent.getAction())) {
            return;
        }
        h0.i iVar = this.f5129a;
        if (iVar == null) {
            iVar = new h0.i(context);
        }
        this.f5129a = iVar;
        Map<String, Object> extractNotificationResponseMap = FlutterLocalNotificationsPlugin.extractNotificationResponseMap(intent);
        if (intent.getBooleanExtra("cancelNotification", false)) {
            int intValue = ((Integer) extractNotificationResponseMap.get("notificationId")).intValue();
            Object obj = extractNotificationResponseMap.get("notificationTag");
            if (obj instanceof String) {
                new S(context).b((String) obj, intValue);
            } else {
                new S(context).b(null, intValue);
            }
        }
        if (f5127b == null) {
            f5127b = new B1.a(20);
        }
        B1.a aVar = f5127b;
        g2.i iVar2 = (g2.i) aVar.f51o;
        if (iVar2 != null) {
            iVar2.a(extractNotificationResponseMap);
        } else {
            ((ArrayList) aVar.f50n).add(extractNotificationResponseMap);
        }
        if (f5128c != null) {
            Log.e("ActionBroadcastReceiver", "Engine is already initialised");
            return;
        }
        a2.e eVar = (a2.e) B1.e.j0().f56n;
        eVar.c(context);
        eVar.a(context, null);
        f5128c = new X1.c(context, null, new n(), true, false);
        FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f5129a.f5846m.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", -1L));
        if (lookupCallbackInformation == null) {
            Log.w("ActionBroadcastReceiver", "Callback information could not be retrieved");
            return;
        }
        Y1.b bVar = f5128c.f2978c;
        new B1.e(bVar.f3422q, "dexterous.com/flutter/local_notifications/actions").t0(f5127b);
        String str = eVar.f3860d.f3849b;
        AssetManager assets = context.getAssets();
        B1.a aVar2 = new B1.a(assets, str, lookupCallbackInformation);
        if (bVar.f3423r) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC0766a.b("DartExecutor#executeDartCallback");
        try {
            Objects.toString(aVar2);
            bVar.f3418m.runBundleAndSnapshotFromLibrary(str, lookupCallbackInformation.callbackName, lookupCallbackInformation.callbackLibraryPath, assets, null, bVar.f3420o);
            bVar.f3423r = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

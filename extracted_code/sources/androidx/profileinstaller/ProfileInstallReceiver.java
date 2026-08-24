package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import e0.C0262c;
import g1.ExecutorC0274b;
import g1.d;
import java.io.File;
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File cacheDir;
        Context createDeviceProtectedStorageContext;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            d.s(context, new ExecutorC0274b(0), new C0262c(this, 21), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C0262c c0262c = new C0262c(this, 21);
                    try {
                        d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        c0262c.h(10, null);
                    } catch (PackageManager.NameNotFoundException e2) {
                        c0262c.h(7, e2);
                    }
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                    setResultCode(11);
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C0262c c0262c2 = new C0262c(this, 21);
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                c0262c2.h(12, null);
                return;
            }
            c0262c2.h(13, null);
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C0262c c0262c3 = new C0262c(this, 21);
            if ("DROP_SHADER_CACHE".equals(string2)) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 24) {
                    createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    cacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                } else if (i3 >= 23) {
                    cacheDir = context.getCodeCacheDir();
                } else {
                    cacheDir = context.getCacheDir();
                }
                if (d.c(cacheDir)) {
                    c0262c3.h(14, null);
                    return;
                } else {
                    c0262c3.h(15, null);
                    return;
                }
            }
            c0262c3.h(16, null);
        }
    }
}

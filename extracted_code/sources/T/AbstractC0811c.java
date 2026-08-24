package t;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import java.util.Objects;
import s.AbstractC0782f;
import s.AbstractC0783g;
/* renamed from: t.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0811c {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
        String str2;
        int i4 = 1;
        if ((i3 & 4) != 0 && str == null) {
            String str3 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            int myPid = Process.myPid();
            int myUid = Process.myUid();
            String packageName = context.getPackageName();
            char c3 = 65535;
            if (context.checkPermission(str3, myPid, myUid) != -1) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 23) {
                    str2 = AbstractC0782f.d(str3);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    if (packageName == null) {
                        String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                        if (packagesForUid != null && packagesForUid.length > 0) {
                            packageName = packagesForUid[0];
                        }
                    }
                    int myUid2 = Process.myUid();
                    String packageName2 = context.getPackageName();
                    if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                        if (i5 >= 29) {
                            AppOpsManager c4 = AbstractC0783g.c(context);
                            i4 = AbstractC0783g.a(c4, str2, Binder.getCallingUid(), packageName);
                            if (i4 == 0) {
                                i4 = AbstractC0783g.a(c4, str2, myUid, AbstractC0783g.b(context));
                            }
                        } else if (i5 >= 23) {
                            i4 = AbstractC0782f.c((AppOpsManager) AbstractC0782f.a(context, AppOpsManager.class), str2, packageName);
                        }
                    } else if (i5 >= 23) {
                        i4 = AbstractC0782f.c((AppOpsManager) AbstractC0782f.a(context, AppOpsManager.class), str2, packageName);
                    }
                    if (i4 != 0) {
                        c3 = 65534;
                    }
                }
                c3 = 0;
            }
            if (c3 == 0) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str3, handler);
            }
            throw new RuntimeException("Permission " + str3 + " is required by your application to receive broadcasts, please add it to your manifest");
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3 & 1);
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}

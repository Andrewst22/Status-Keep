package s;

import android.app.AppOpsManager;
import android.content.Context;
/* renamed from: s.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0783g {
    public static int a(AppOpsManager appOpsManager, String str, int i3, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i3, str2);
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}

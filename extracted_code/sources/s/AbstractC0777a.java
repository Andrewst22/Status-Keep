package s;

import android.app.Activity;
import android.app.SharedElementCallback;
/* renamed from: s.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0777a {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i3) {
        activity.requestPermissions(strArr, i3);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}

package v1;

import C.S;
import D2.i;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* renamed from: v1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0878a f9493a = new Object();

    public final S a(Context context) {
        Object systemService;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        i.e(context, "context");
        systemService = context.getSystemService(WindowManager.class);
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        i.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return S.a(windowInsets, null);
    }
}

package C;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import v.C0872c;
/* loaded from: classes.dex */
public abstract class K extends Q {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f71f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Method f72g;

    /* renamed from: h  reason: collision with root package name */
    public static Class f73h;

    /* renamed from: i  reason: collision with root package name */
    public static Field f74i;

    /* renamed from: j  reason: collision with root package name */
    public static Field f75j;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f76c;

    /* renamed from: d  reason: collision with root package name */
    public C0872c f77d;

    /* renamed from: e  reason: collision with root package name */
    public C0872c f78e;

    public K(S s3, WindowInsets windowInsets) {
        super(s3);
        this.f77d = null;
        this.f76c = windowInsets;
    }

    private C0872c m(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f71f) {
                n();
            }
            Method method = f72g;
            if (method != null && f73h != null && f74i != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f74i.get(f75j.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return C0872c.a(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void n() {
        try {
            f72g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f73h = cls;
            f74i = cls.getDeclaredField("mVisibleInsets");
            f75j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f74i.setAccessible(true);
            f75j.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f71f = true;
    }

    @Override // C.Q
    public void d(View view) {
        C0872c m3 = m(view);
        if (m3 == null) {
            m3 = C0872c.f9463e;
        }
        o(m3);
    }

    @Override // C.Q
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f78e, ((K) obj).f78e);
    }

    @Override // C.Q
    public final C0872c g() {
        if (this.f77d == null) {
            WindowInsets windowInsets = this.f76c;
            this.f77d = C0872c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f77d;
    }

    @Override // C.Q
    public boolean i() {
        return this.f76c.isRound();
    }

    public void o(C0872c c0872c) {
        this.f78e = c0872c;
    }

    @Override // C.Q
    public void j(C0872c[] c0872cArr) {
    }

    @Override // C.Q
    public void k(S s3) {
    }
}

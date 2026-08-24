package C;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import v.C0872c;
/* loaded from: classes.dex */
public final class F extends J {

    /* renamed from: c  reason: collision with root package name */
    public static Field f64c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f65d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Constructor f66e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f67f = false;

    /* renamed from: a  reason: collision with root package name */
    public WindowInsets f68a = e();

    /* renamed from: b  reason: collision with root package name */
    public C0872c f69b;

    private static WindowInsets e() {
        if (!f65d) {
            try {
                f64c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f65d = true;
        }
        Field field = f64c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f67f) {
            try {
                f66e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f67f = true;
        }
        Constructor constructor = f66e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // C.J
    public S b() {
        a();
        S a3 = S.a(this.f68a, null);
        Q q3 = a3.f83a;
        q3.j(null);
        q3.l(this.f69b);
        return a3;
    }

    @Override // C.J
    public void c(C0872c c0872c) {
        this.f69b = c0872c;
    }

    @Override // C.J
    public void d(C0872c c0872c) {
        WindowInsets windowInsets = this.f68a;
        if (windowInsets != null) {
            this.f68a = windowInsets.replaceSystemWindowInsets(c0872c.f9464a, c0872c.f9465b, c0872c.f9466c, c0872c.f9467d);
        }
    }
}

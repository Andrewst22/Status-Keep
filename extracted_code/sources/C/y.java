package C;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static Field f117a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f118b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0001b c0001b) {
        View.AccessibilityDelegate accessibilityDelegate;
        C0000a c0000a = null;
        if (c0001b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = AbstractC0020v.a(viewGroup);
            } else {
                if (!f118b) {
                    if (f117a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f117a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f118b = true;
                        }
                    }
                    try {
                        Object obj = f117a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f118b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0000a) {
                c0001b = new C0001b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        if (c0001b != null) {
            c0000a = c0001b.f90b;
        }
        viewGroup.setAccessibilityDelegate(c0000a);
    }
}

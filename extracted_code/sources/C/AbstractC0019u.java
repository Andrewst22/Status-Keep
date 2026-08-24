package C;

import android.view.View;
import com.example.flutter_application_1.R;
import java.util.Objects;
import p.C0727i;
/* renamed from: C.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0019u {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, x xVar) {
        C0727i c0727i = (C0727i) view.getTag(R.id.tag_unhandled_key_listeners);
        C0727i c0727i2 = c0727i;
        if (c0727i == null) {
            C0727i c0727i3 = new C0727i();
            view.setTag(R.id.tag_unhandled_key_listeners, c0727i3);
            c0727i2 = c0727i3;
        }
        Objects.requireNonNull(xVar);
        ?? obj = new Object();
        c0727i2.put(xVar, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, x xVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0727i c0727i = (C0727i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0727i != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0727i.getOrDefault(xVar, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i3) {
        return (T) view.requireViewById(i3);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, E.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}

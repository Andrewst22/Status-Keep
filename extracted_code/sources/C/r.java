package C;

import android.view.View;
import android.view.WindowInsets;
/* loaded from: classes.dex */
public abstract class r {
    public static S a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        S a3 = S.a(rootWindowInsets, null);
        Q q3 = a3.f83a;
        q3.k(a3);
        q3.d(view.getRootView());
        return a3;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    public static void d(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}

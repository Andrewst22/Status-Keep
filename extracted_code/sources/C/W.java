package C;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public final class W extends android.support.v4.media.session.a {

    /* renamed from: b  reason: collision with root package name */
    public final WindowInsetsController f85b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f86c;

    public W(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f85b = insetsController;
        this.f86c = window;
    }

    @Override // android.support.v4.media.session.a
    public final void O(boolean z3) {
        Window window = this.f86c;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f85b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f85b.setSystemBarsAppearance(0, 16);
    }

    @Override // android.support.v4.media.session.a
    public final void P(boolean z3) {
        Window window = this.f86c;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f85b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f85b.setSystemBarsAppearance(0, 8);
    }
}

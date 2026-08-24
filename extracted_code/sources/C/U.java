package C;

import android.view.View;
import android.view.Window;
/* loaded from: classes.dex */
public class U extends T {
    @Override // android.support.v4.media.session.a
    public final void P(boolean z3) {
        Window window = this.f84b;
        if (z3) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}

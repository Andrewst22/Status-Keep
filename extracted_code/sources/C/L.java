package C;

import android.view.WindowInsets;
import v.C0872c;
/* loaded from: classes.dex */
public class L extends K {

    /* renamed from: k  reason: collision with root package name */
    public C0872c f79k;

    public L(S s3, WindowInsets windowInsets) {
        super(s3, windowInsets);
        this.f79k = null;
    }

    @Override // C.Q
    public S b() {
        return S.a(this.f76c.consumeStableInsets(), null);
    }

    @Override // C.Q
    public S c() {
        return S.a(this.f76c.consumeSystemWindowInsets(), null);
    }

    @Override // C.Q
    public final C0872c f() {
        if (this.f79k == null) {
            WindowInsets windowInsets = this.f76c;
            this.f79k = C0872c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f79k;
    }

    @Override // C.Q
    public boolean h() {
        return this.f76c.isConsumed();
    }

    @Override // C.Q
    public void l(C0872c c0872c) {
        this.f79k = c0872c;
    }
}

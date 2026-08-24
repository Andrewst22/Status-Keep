package C;

import android.view.WindowInsets;
import v.C0872c;
/* loaded from: classes.dex */
public class H extends J {

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsets.Builder f70a = G.h();

    @Override // C.J
    public S b() {
        WindowInsets build;
        a();
        build = this.f70a.build();
        S a3 = S.a(build, null);
        a3.f83a.j(null);
        return a3;
    }

    @Override // C.J
    public void c(C0872c c0872c) {
        this.f70a.setStableInsets(c0872c.b());
    }

    @Override // C.J
    public void d(C0872c c0872c) {
        this.f70a.setSystemWindowInsets(c0872c.b());
    }
}

package W1;

import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ o f2842m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ g f2843n;

    public f(g gVar, o oVar) {
        this.f2843n = gVar;
        this.f2842m = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        g gVar = this.f2843n;
        if (gVar.f2850g && gVar.f2848e != null) {
            this.f2842m.getViewTreeObserver().removeOnPreDrawListener(this);
            gVar.f2848e = null;
        }
        return gVar.f2850g;
    }
}

package K2;

import s2.C0808g;
/* loaded from: classes.dex */
public final class D implements c0, C2.l {

    /* renamed from: m  reason: collision with root package name */
    public final C f787m;

    public D(C c3) {
        this.f787m = c3;
    }

    public final void a(Throwable th) {
        this.f787m.d();
    }

    @Override // C2.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        a((Throwable) obj);
        return C0808g.f9229a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f787m + ']';
    }
}

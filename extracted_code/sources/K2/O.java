package K2;

import n2.AbstractC0664g;
import s2.C0808g;
/* loaded from: classes.dex */
public final class O extends U {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f801q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f802r;

    public /* synthetic */ O(Object obj, int i3) {
        this.f801q = i3;
        this.f802r = obj;
    }

    @Override // C2.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        switch (this.f801q) {
            case 0:
                o((Throwable) obj);
                return C0808g.f9229a;
            default:
                o((Throwable) obj);
                return C0808g.f9229a;
        }
    }

    @Override // K2.U
    public final void o(Throwable th) {
        switch (this.f801q) {
            case 0:
                ((C2.l) this.f802r).b(th);
                return;
            default:
                Object E3 = n().E();
                boolean z3 = E3 instanceof C0085n;
                V v3 = (V) this.f802r;
                if (z3) {
                    v3.k(AbstractC0664g.f(((C0085n) E3).f845a));
                    return;
                } else {
                    v3.k(AbstractC0092v.l(E3));
                    return;
                }
        }
    }
}

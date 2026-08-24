package K;

import K2.C0077f;
import s2.C0807f;
import s2.C0808g;
/* loaded from: classes.dex */
public final class L extends D2.j implements C2.l {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f550n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f551o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(Object obj, int i3) {
        super(1);
        this.f550n = i3;
        this.f551o = obj;
    }

    @Override // C2.l
    public final Object b(Object obj) {
        switch (this.f550n) {
            case 0:
                Throwable th = (Throwable) obj;
                Q q3 = (Q) this.f551o;
                if (th != null) {
                    q3.f574t.R(new S(th));
                }
                if (q3.f576v.f9226n != C0807f.f9228a) {
                    ((M.i) q3.f576v.a()).close();
                }
                return C0808g.f9229a;
            case 1:
                Throwable th2 = (Throwable) obj;
                C0808g c0808g = C0808g.f9229a;
                ((C0077f) this.f551o).k(c0808g);
                return c0808g;
            default:
                Throwable th3 = (Throwable) obj;
                ((S2.h) this.f551o).b();
                return C0808g.f9229a;
        }
    }
}

package K2;

import s2.C0808g;
/* loaded from: classes.dex */
public final class W extends U {

    /* renamed from: q  reason: collision with root package name */
    public final Z f807q;

    /* renamed from: r  reason: collision with root package name */
    public final X f808r;

    /* renamed from: s  reason: collision with root package name */
    public final C0081j f809s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f810t;

    public W(Z z3, X x, C0081j c0081j, Object obj) {
        this.f807q = z3;
        this.f808r = x;
        this.f809s = c0081j;
        this.f810t = obj;
    }

    @Override // C2.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        o((Throwable) obj);
        return C0808g.f9229a;
    }

    @Override // K2.U
    public final void o(Throwable th) {
        C0081j c0081j = this.f809s;
        Z z3 = this.f807q;
        z3.getClass();
        C0081j M3 = Z.M(c0081j);
        X x = this.f808r;
        Object obj = this.f810t;
        if (M3 != null) {
            while (AbstractC0092v.e(M3.f836q, false, new W(z3, x, M3, obj), 1) == b0.f823m) {
                M3 = Z.M(M3);
                if (M3 == null) {
                    z3.q(z3.z(x, obj));
                }
            }
            return;
        }
        z3.q(z3.z(x, obj));
    }
}

package O2;

import K2.AbstractC0092v;
import K2.C0087p;
import P2.AbstractC0097a;
import s2.C0808g;
import u2.C0867e;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: p  reason: collision with root package name */
    public final N2.d f1346p;

    public h(N2.d dVar, u2.i iVar, int i3, int i4) {
        super(iVar, i3, i4);
        this.f1346p = dVar;
    }

    @Override // O2.f
    public final Object a(M2.p pVar, InterfaceC0866d interfaceC0866d) {
        Object x = this.f1346p.x(new r(pVar), interfaceC0866d);
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        C0808g c0808g = C0808g.f9229a;
        if (x != enumC0879a) {
            x = c0808g;
        }
        if (x == enumC0879a) {
            return x;
        }
        return c0808g;
    }

    @Override // O2.f
    public final f b(u2.i iVar, int i3, int i4) {
        return new h(this.f1346p, iVar, i3, i4);
    }

    @Override // O2.f
    public final String toString() {
        return this.f1346p + " -> " + super.toString();
    }

    @Override // O2.f, N2.d
    public final Object x(N2.e eVar, InterfaceC0866d interfaceC0866d) {
        Object x;
        u2.i a3;
        C0808g c0808g = C0808g.f9229a;
        int i3 = this.f1341n;
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        if (i3 == -3) {
            u2.i h3 = interfaceC0866d.h();
            Boolean bool = Boolean.FALSE;
            C0087p c0087p = C0087p.f849p;
            u2.i iVar = this.f1340m;
            if (!((Boolean) iVar.c(bool, c0087p)).booleanValue()) {
                a3 = h3.n(iVar);
            } else {
                a3 = AbstractC0092v.a(h3, iVar, false);
            }
            if (D2.i.a(a3, h3)) {
                x = this.f1346p.x(eVar, interfaceC0866d);
                if (x != enumC0879a) {
                    x = c0808g;
                }
                if (x != enumC0879a) {
                    return c0808g;
                }
            } else {
                C0867e c0867e = C0867e.f9460m;
                if (D2.i.a(a3.d(c0867e), h3.d(c0867e))) {
                    u2.i h4 = interfaceC0866d.h();
                    if (!(eVar instanceof r)) {
                        eVar = new N2.l(eVar, h4);
                    }
                    x = l.b(a3, eVar, AbstractC0097a.m(a3), new g(this, null), interfaceC0866d);
                    if (x != enumC0879a) {
                        x = c0808g;
                    }
                    if (x != enumC0879a) {
                        return c0808g;
                    }
                }
            }
            return x;
        }
        x = super.x(eVar, interfaceC0866d);
        if (x != enumC0879a) {
            return c0808g;
        }
        return x;
    }
}

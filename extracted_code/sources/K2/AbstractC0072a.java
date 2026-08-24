package K2;

import P2.AbstractC0097a;
import n2.AbstractC0664g;
import s2.AbstractC0805d;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: K2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0072a extends Z implements InterfaceC0866d, InterfaceC0091u {

    /* renamed from: o  reason: collision with root package name */
    public final u2.i f821o;

    public AbstractC0072a(u2.i iVar, boolean z3) {
        super(z3);
        H((P) iVar.d(C0090t.f856n));
        this.f821o = iVar.n(this);
    }

    @Override // K2.Z
    public final void G(B1.c cVar) {
        AbstractC0092v.d(cVar, this.f821o);
    }

    @Override // K2.Z
    public final void O(Object obj) {
        boolean z3;
        if (obj instanceof C0085n) {
            C0085n c0085n = (C0085n) obj;
            Throwable th = c0085n.f845a;
            if (C0085n.f844b.get(c0085n) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            U(th, z3);
            return;
        }
        V(obj);
    }

    public final void W(int i3, AbstractC0072a abstractC0072a, C2.p pVar) {
        int b3 = N.j.b(i3);
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 != 2) {
                    if (b3 == 3) {
                        try {
                            u2.i iVar = this.f821o;
                            Object n3 = AbstractC0097a.n(iVar, null);
                            D2.t.a(2, pVar);
                            Object i4 = pVar.i(abstractC0072a, this);
                            AbstractC0097a.h(iVar, n3);
                            if (i4 != EnumC0879a.f9494m) {
                                k(i4);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            k(AbstractC0664g.f(th));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                AbstractC0664g.p(((w2.b) pVar).d(abstractC0072a, this)).k(C0808g.f9229a);
                return;
            }
            return;
        }
        android.support.v4.media.session.a.V(pVar, abstractC0072a, this);
    }

    @Override // u2.InterfaceC0866d
    public final u2.i h() {
        return this.f821o;
    }

    @Override // K2.InterfaceC0091u
    public final u2.i j() {
        return this.f821o;
    }

    @Override // u2.InterfaceC0866d
    public final void k(Object obj) {
        Throwable a3 = AbstractC0805d.a(obj);
        if (a3 != null) {
            obj = new C0085n(a3, false);
        }
        Object L = L(obj);
        if (L == AbstractC0092v.f860d) {
            return;
        }
        r(L);
    }

    @Override // K2.Z
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z3) {
    }
}

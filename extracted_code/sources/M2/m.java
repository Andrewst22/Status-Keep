package M2;

import K2.l0;
import P2.AbstractC0097a;
import m2.AbstractC0635d;
import s2.C0808g;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class m extends b {
    public final int x;

    public m(int i3, int i4, C2.l lVar) {
        super(i3, lVar);
        this.x = i4;
        if (i4 != 1) {
            if (i3 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i3 + " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + D2.r.a(b.class).b() + " instead").toString());
    }

    public final Object D(Object obj, boolean z3) {
        j jVar;
        l0 l0Var;
        C2.l lVar;
        B1.c b3;
        C0808g c0808g = C0808g.f9229a;
        if (this.x == 3) {
            Object i3 = super.i(obj);
            if ((i3 instanceof h) && !(i3 instanceof g)) {
                if (z3 && (lVar = this.f1068n) != null && (b3 = AbstractC0097a.b(lVar, obj, null)) != null) {
                    throw b3;
                }
                return c0808g;
            }
            return i3;
        }
        C1.f fVar = d.f1073d;
        j jVar2 = (j) b.f1062s.get(this);
        while (true) {
            long andIncrement = b.f1058o.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean r3 = r(andIncrement, false);
            int i4 = d.f1071b;
            long j4 = i4;
            long j5 = j3 / j4;
            int i5 = (int) (j3 % j4);
            if (jVar2.f1515o != j5) {
                j a3 = b.a(this, j5, jVar2);
                if (a3 == null) {
                    if (r3) {
                        return new g(n());
                    }
                } else {
                    jVar = a3;
                }
            } else {
                jVar = jVar2;
            }
            int d3 = b.d(this, jVar, i5, obj, j3, fVar, r3);
            if (d3 != 0) {
                if (d3 != 1) {
                    if (d3 != 2) {
                        if (d3 != 3) {
                            if (d3 != 4) {
                                if (d3 == 5) {
                                    jVar.a();
                                }
                                jVar2 = jVar;
                            } else {
                                if (j3 < b.f1059p.get(this)) {
                                    jVar.a();
                                }
                                return new g(n());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (r3) {
                        jVar.h();
                        return new g(n());
                    } else {
                        if (fVar instanceof l0) {
                            l0Var = (l0) fVar;
                        } else {
                            l0Var = null;
                        }
                        if (l0Var != null) {
                            l0Var.a(jVar, i5 + i4);
                        }
                        h((jVar.f1515o * j4) + i5);
                        return c0808g;
                    }
                } else {
                    return c0808g;
                }
            } else {
                jVar.a();
                return c0808g;
            }
        }
    }

    @Override // M2.b, M2.r
    public final Object i(Object obj) {
        return D(obj, false);
    }

    @Override // M2.b, M2.r
    public final Object o(Object obj, InterfaceC0866d interfaceC0866d) {
        B1.c b3;
        if (D(obj, true) instanceof g) {
            C2.l lVar = this.f1068n;
            if (lVar != null && (b3 = AbstractC0097a.b(lVar, obj, null)) != null) {
                AbstractC0635d.b(b3, n());
                throw b3;
            }
            throw n();
        }
        return C0808g.f9229a;
    }

    @Override // M2.b
    public final boolean t() {
        if (this.x == 2) {
            return true;
        }
        return false;
    }
}

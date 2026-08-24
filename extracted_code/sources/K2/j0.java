package K2;

import P2.AbstractC0097a;
import s2.C0803b;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class j0 extends P2.u {

    /* renamed from: q  reason: collision with root package name */
    public final ThreadLocal f837q;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(u2.i r3, w2.f r4) {
        /*
            r2 = this;
            K2.k0 r0 = K2.k0.f838m
            u2.g r1 = r3.d(r0)
            if (r1 != 0) goto Ld
            u2.i r0 = r3.n(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r4, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f837q = r0
            u2.i r4 = r4.f9665n
            D2.i.b(r4)
            u2.e r0 = u2.C0867e.f9460m
            u2.g r4 = r4.d(r0)
            boolean r4 = r4 instanceof K2.AbstractC0089s
            if (r4 != 0) goto L32
            r4 = 0
            java.lang.Object r4 = P2.AbstractC0097a.n(r3, r4)
            P2.AbstractC0097a.h(r3, r4)
            r2.Y(r3, r4)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.j0.<init>(u2.i, w2.f):void");
    }

    public final boolean X() {
        boolean z3;
        if (this.threadLocalIsSet && this.f837q.get() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f837q.remove();
        return !z3;
    }

    public final void Y(u2.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f837q.set(new C0803b(iVar, obj));
    }

    @Override // P2.u, K2.Z
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            C0803b c0803b = (C0803b) this.f837q.get();
            if (c0803b != null) {
                AbstractC0097a.h((u2.i) c0803b.f9222m, c0803b.f9223n);
            }
            this.f837q.remove();
        }
        Object h3 = AbstractC0092v.h(obj);
        InterfaceC0866d interfaceC0866d = this.f1513p;
        u2.i h4 = interfaceC0866d.h();
        j0 j0Var = null;
        Object n3 = AbstractC0097a.n(h4, null);
        if (n3 != AbstractC0097a.f1475f) {
            j0Var = AbstractC0092v.m(interfaceC0866d, h4, n3);
        }
        try {
            this.f1513p.k(h3);
        } finally {
            if (j0Var == null || j0Var.X()) {
                AbstractC0097a.h(h4, n3);
            }
        }
    }
}

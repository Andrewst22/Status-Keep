package p0;

import R.C0113p;
import U.AbstractC0123a;
import W.A;
import a.AbstractC0155a;
import g2.C0276a;
/* loaded from: classes.dex */
public final class k extends AbstractC0732e {

    /* renamed from: v  reason: collision with root package name */
    public final C0731d f8820v;

    /* renamed from: w  reason: collision with root package name */
    public C0276a f8821w;
    public long x;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f8822y;

    public k(W.h hVar, W.l lVar, C0113p c0113p, int i3, Object obj, C0731d c0731d) {
        super(hVar, lVar, 2, c0113p, i3, obj, -9223372036854775807L, -9223372036854775807L);
        this.f8820v = c0731d;
    }

    @Override // s0.k
    public final void b() {
        boolean z3;
        if (this.x == 0) {
            this.f8820v.a(this.f8821w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            W.l a3 = this.f8779n.a(this.x);
            A a4 = this.f8786u;
            w0.l lVar = new w0.l(a4, a3.f2771e, a4.j(a3));
            while (!this.f8822y) {
                C0731d c0731d = this.f8820v;
                int f3 = c0731d.f8769m.f(lVar, C0731d.f8768w);
                boolean z4 = false;
                if (f3 != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                if (f3 == 0) {
                    z4 = true;
                    continue;
                }
                if (!z4) {
                    break;
                }
            }
            this.x = lVar.f9608p - this.f8779n.f2771e;
        } finally {
            AbstractC0155a.r(this.f8786u);
        }
    }

    @Override // s0.k
    public final void c() {
        this.f8822y = true;
    }
}

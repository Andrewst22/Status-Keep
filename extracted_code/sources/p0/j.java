package p0;

import R.C0113p;
import R.G;
import U.AbstractC0123a;
import U.t;
import W.A;
import a.AbstractC0155a;
import g2.C0276a;
import o0.T;
/* loaded from: classes.dex */
public final class j extends AbstractC0728a {

    /* renamed from: A  reason: collision with root package name */
    public final int f8814A;

    /* renamed from: B  reason: collision with root package name */
    public final long f8815B;

    /* renamed from: C  reason: collision with root package name */
    public final InterfaceC0733f f8816C;

    /* renamed from: D  reason: collision with root package name */
    public long f8817D;

    /* renamed from: E  reason: collision with root package name */
    public volatile boolean f8818E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f8819F;

    public j(W.h hVar, W.l lVar, C0113p c0113p, int i3, Object obj, long j3, long j4, long j5, long j6, long j7, int i4, long j8, InterfaceC0733f interfaceC0733f) {
        super(hVar, lVar, c0113p, i3, obj, j3, j4, j5, j6, j7);
        this.f8814A = i4;
        this.f8815B = j8;
        this.f8816C = interfaceC0733f;
    }

    @Override // p0.l
    public final long a() {
        return this.f8823v + this.f8814A;
    }

    @Override // s0.k
    public final void b() {
        boolean z3;
        boolean z4;
        T[] tArr;
        long j3;
        long j4;
        C0276a c0276a = this.f8756y;
        AbstractC0123a.k(c0276a);
        if (this.f8817D == 0) {
            long j5 = this.f8815B;
            for (T t3 : (T[]) c0276a.f5778o) {
                if (t3.f8523F != j5) {
                    t3.f8523F = j5;
                    t3.f8549z = true;
                }
            }
            InterfaceC0733f interfaceC0733f = this.f8816C;
            long j6 = this.f8755w;
            if (j6 == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j3 = j6 - this.f8815B;
            }
            long j7 = this.x;
            if (j7 == -9223372036854775807L) {
                j4 = -9223372036854775807L;
            } else {
                j4 = j7 - this.f8815B;
            }
            ((C0731d) interfaceC0733f).a(c0276a, j3, j4);
        }
        try {
            W.l a3 = this.f8779n.a(this.f8817D);
            A a4 = this.f8786u;
            w0.l lVar = new w0.l(a4, a3.f2771e, a4.j(a3));
            while (!this.f8818E) {
                int f3 = ((C0731d) this.f8816C).f8769m.f(lVar, C0731d.f8768w);
                if (f3 != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                if (f3 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    break;
                }
            }
            C0113p c0113p = this.f8781p;
            if (G.i(c0113p.f1973l)) {
                int i3 = c0113p.f1958H;
                int i4 = c0113p.f1959I;
                if ((i3 > 1 || i4 > 1) && i3 != -1 && i4 != -1) {
                    w0.G l3 = c0276a.l(4);
                    int i5 = i3 * i4;
                    long j8 = (this.f8785t - this.f8784s) / i5;
                    for (int i6 = 1; i6 < i5; i6++) {
                        l3.f(0, new t());
                        l3.b(i6 * j8, 0, 0, 0, null);
                    }
                }
            }
            this.f8817D = lVar.f9608p - this.f8779n.f2771e;
            AbstractC0155a.r(this.f8786u);
            this.f8819F = !this.f8818E;
        } catch (Throwable th) {
            AbstractC0155a.r(this.f8786u);
            throw th;
        }
    }

    @Override // s0.k
    public final void c() {
        this.f8818E = true;
    }

    @Override // p0.l
    public final boolean d() {
        return this.f8819F;
    }
}

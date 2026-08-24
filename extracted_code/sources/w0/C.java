package w0;

import D1.I;
import D1.b0;
import R.C0112o;
import U.AbstractC0123a;
import java.util.List;
/* loaded from: classes.dex */
public final class C implements o {

    /* renamed from: a  reason: collision with root package name */
    public final int f9511a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9512b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9513c;

    /* renamed from: d  reason: collision with root package name */
    public int f9514d;

    /* renamed from: e  reason: collision with root package name */
    public int f9515e;

    /* renamed from: f  reason: collision with root package name */
    public q f9516f;

    /* renamed from: g  reason: collision with root package name */
    public G f9517g;

    public C(int i3, int i4, String str) {
        this.f9511a = i3;
        this.f9512b = i4;
        this.f9513c = str;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        if (j3 == 0 || this.f9515e == 1) {
            this.f9515e = 1;
            this.f9514d = 0;
        }
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        boolean z3;
        int i3 = this.f9512b;
        int i4 = this.f9511a;
        if (i4 != -1 && i3 != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        U.t tVar = new U.t(i3);
        ((l) pVar).p(tVar.f2477a, 0, i3, false);
        if (tVar.A() == i4) {
            return true;
        }
        return false;
    }

    @Override // w0.o
    public final int f(p pVar, R.r rVar) {
        int i3 = this.f9515e;
        if (i3 != 1) {
            if (i3 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        G g3 = this.f9517g;
        g3.getClass();
        int d3 = g3.d(pVar, 1024, true);
        if (d3 == -1) {
            this.f9515e = 2;
            this.f9517g.b(0L, 1, this.f9514d, 0, null);
            this.f9514d = 0;
        } else {
            this.f9514d += d3;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w0.A] */
    @Override // w0.o
    public final void h(q qVar) {
        this.f9516f = qVar;
        G w3 = qVar.w(1024, 4);
        this.f9517g = w3;
        C0112o c0112o = new C0112o();
        c0112o.f1937l = R.G.l(this.f9513c);
        D2.h.p(c0112o, w3);
        this.f9516f.s();
        this.f9516f.n(new Object());
        this.f9515e = 1;
    }

    @Override // w0.o
    public final List l() {
        D1.G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
    }
}

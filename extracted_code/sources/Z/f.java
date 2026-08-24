package Z;

import C.C0002c;
import D1.I;
import D1.g0;
import R.C0102e;
import R.C0122z;
import R.F;
import R.J;
import R.K;
import R.L;
import R.M;
import R.N;
import R.Q;
import R.S;
import R.T;
import R.Z;
import R.c0;
import U.A;
import U.AbstractC0123a;
import U.v;
import U.x;
import Y.C;
import Y.C0142m;
import Y.C0152x;
import Y.G;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import o0.C0701z;
import o0.InterfaceC0675D;
import o0.r;
/* loaded from: classes.dex */
public final class f implements L, InterfaceC0675D, d0.e {

    /* renamed from: m  reason: collision with root package name */
    public final v f3476m;

    /* renamed from: n  reason: collision with root package name */
    public final Q f3477n;

    /* renamed from: o  reason: collision with root package name */
    public final S f3478o;

    /* renamed from: p  reason: collision with root package name */
    public final e f3479p;

    /* renamed from: q  reason: collision with root package name */
    public final SparseArray f3480q;

    /* renamed from: r  reason: collision with root package name */
    public U.l f3481r;

    /* renamed from: s  reason: collision with root package name */
    public N f3482s;

    /* renamed from: t  reason: collision with root package name */
    public x f3483t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3484u;

    public f(v vVar) {
        vVar.getClass();
        this.f3476m = vVar;
        int i3 = A.f2405a;
        Looper myLooper = Looper.myLooper();
        this.f3481r = new U.l(myLooper == null ? Looper.getMainLooper() : myLooper, vVar, new c(11));
        Q q3 = new Q();
        this.f3477n = q3;
        this.f3478o = new S();
        this.f3479p = new e(q3);
        this.f3480q = new SparseArray();
    }

    @Override // R.L
    public final void A(J j3) {
        J(E(), 12, new C0002c(14));
    }

    @Override // o0.InterfaceC0675D
    public final void B(int i3, C0701z c0701z, r rVar, l0.g gVar) {
        J(H(i3, c0701z), 1000, new C0002c(22));
    }

    @Override // o0.InterfaceC0675D
    public final void C(int i3, C0701z c0701z, r rVar, l0.g gVar) {
        J(H(i3, c0701z), 1001, new c(25));
    }

    @Override // R.L
    public final void D(boolean z3) {
        J(E(), 7, new c(3));
    }

    public final a E() {
        return G((C0701z) this.f3479p.f3473d);
    }

    public final a F(T t3, int i3, C0701z c0701z) {
        C0701z c0701z2;
        boolean z3;
        if (t3.p()) {
            c0701z2 = null;
        } else {
            c0701z2 = c0701z;
        }
        this.f3476m.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (t3.equals(((G) this.f3482s).r()) && i3 == ((G) this.f3482s).o()) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j3 = 0;
        if (c0701z2 != null && c0701z2.b()) {
            if (z3 && ((G) this.f3482s).m() == c0701z2.f8654b && ((G) this.f3482s).n() == c0701z2.f8655c) {
                j3 = ((G) this.f3482s).p();
            }
        } else if (z3) {
            G g3 = (G) this.f3482s;
            g3.J();
            j3 = g3.l(g3.f3057d0);
        } else if (!t3.p()) {
            j3 = A.Z(t3.m(i3, this.f3478o, 0L).f1815l);
        }
        C0701z c0701z3 = (C0701z) this.f3479p.f3473d;
        T r3 = ((G) this.f3482s).r();
        int o3 = ((G) this.f3482s).o();
        long p3 = ((G) this.f3482s).p();
        G g4 = (G) this.f3482s;
        g4.J();
        return new a(elapsedRealtime, t3, i3, c0701z2, j3, r3, o3, c0701z3, p3, A.Z(g4.f3057d0.f3270r));
    }

    public final a G(C0701z c0701z) {
        T t3;
        this.f3482s.getClass();
        if (c0701z == null) {
            t3 = null;
        } else {
            t3 = (T) ((g0) this.f3479p.f3472c).get(c0701z);
        }
        if (c0701z != null && t3 != null) {
            return F(t3, t3.g(c0701z.f8653a, this.f3477n).f1797c, c0701z);
        }
        int o3 = ((G) this.f3482s).o();
        T r3 = ((G) this.f3482s).r();
        if (o3 >= r3.o()) {
            r3 = T.f1820a;
        }
        return F(r3, o3, null);
    }

    public final a H(int i3, C0701z c0701z) {
        this.f3482s.getClass();
        if (c0701z != null) {
            if (((T) ((g0) this.f3479p.f3472c).get(c0701z)) != null) {
                return G(c0701z);
            }
            return F(T.f1820a, i3, c0701z);
        }
        T r3 = ((G) this.f3482s).r();
        if (i3 >= r3.o()) {
            r3 = T.f1820a;
        }
        return F(r3, i3, null);
    }

    public final a I() {
        return G((C0701z) this.f3479p.f3475f);
    }

    public final void J(a aVar, int i3, U.i iVar) {
        this.f3480q.put(i3, aVar);
        this.f3481r.e(i3, iVar);
    }

    public final void K(N n3, Looper looper) {
        boolean z3;
        if (this.f3482s != null && !((I) this.f3479p.f3471b).isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.j(z3);
        n3.getClass();
        this.f3482s = n3;
        this.f3483t = this.f3476m.a(looper, null);
        U.l lVar = this.f3481r;
        b bVar = new b(1, this, n3);
        this.f3481r = new U.l(lVar.f2448d, looper, lVar.f2445a, bVar, lVar.f2453i);
    }

    @Override // R.L
    public final void a(int i3) {
        J(E(), 6, new c(5));
    }

    @Override // R.L
    public final void b(int i3) {
        J(E(), 4, new c(14));
    }

    @Override // R.L
    public final void c(int i3) {
        N n3 = this.f3482s;
        n3.getClass();
        e eVar = this.f3479p;
        eVar.f3473d = e.d(n3, (I) eVar.f3471b, (C0701z) eVar.f3474e, (Q) eVar.f3470a);
        eVar.h(((G) n3).r());
        J(E(), 0, new C0002c(24));
    }

    @Override // R.L
    public final void d(C0102e c0102e) {
        J(I(), 20, new C0002c(29));
    }

    @Override // R.L
    public final void e(R.I i3) {
        a E3;
        C0701z c0701z;
        if ((i3 instanceof C0142m) && (c0701z = ((C0142m) i3).f3365t) != null) {
            E3 = G(c0701z);
        } else {
            E3 = E();
        }
        J(E3, 10, new c(8));
    }

    @Override // R.L
    public final void f(T.c cVar) {
        J(E(), 27, new C0002c(16));
    }

    @Override // o0.InterfaceC0675D
    public final void g(int i3, C0701z c0701z, l0.g gVar) {
        J(H(i3, c0701z), 1005, new c(26));
    }

    @Override // o0.InterfaceC0675D
    public final void h(int i3, C0701z c0701z, r rVar, l0.g gVar) {
        J(H(i3, c0701z), 1002, new c(19));
    }

    @Override // o0.InterfaceC0675D
    public final void i(int i3, C0701z c0701z, l0.g gVar) {
        a H3 = H(i3, c0701z);
        J(H3, 1004, new b(0, H3, gVar));
    }

    @Override // R.L
    public final void j(C0122z c0122z, int i3) {
        J(E(), 1, new C0002c(25));
    }

    @Override // R.L
    public final void k(F f3) {
        J(E(), 28, new c(1));
    }

    @Override // R.L
    public final void l(int i3, int i4) {
        J(I(), 24, new c(24));
    }

    @Override // R.L
    public final void m(int i3) {
        J(E(), 8, new c(20));
    }

    @Override // R.L
    public final void n(c0 c0Var) {
        a I3 = I();
        J(I3, 25, new C(I3, c0Var));
    }

    @Override // R.L
    public final void o(boolean z3) {
        J(E(), 3, new C0002c(19));
    }

    @Override // R.L
    public final void p(int i3, M m3, M m4) {
        if (i3 == 1) {
            this.f3484u = false;
        }
        N n3 = this.f3482s;
        n3.getClass();
        e eVar = this.f3479p;
        eVar.f3473d = e.d(n3, (I) eVar.f3471b, (C0701z) eVar.f3474e, (Q) eVar.f3470a);
        a E3 = E();
        J(E3, 11, new C0152x(E3, i3, m3, m4));
    }

    @Override // o0.InterfaceC0675D
    public final void q(int i3, C0701z c0701z, r rVar, l0.g gVar, IOException iOException, boolean z3) {
        a H3 = H(i3, c0701z);
        J(H3, 1003, new B0.a(H3, rVar, gVar, iOException, z3));
    }

    @Override // R.L
    public final void r(R.C c3) {
        J(E(), 14, new C0002c(17));
    }

    @Override // R.L
    public final void s(boolean z3) {
        J(I(), 23, new C0002c(11));
    }

    @Override // R.L
    public final void t(K k3) {
        J(E(), 13, new C0002c(23));
    }

    @Override // R.L
    public final void u(List list) {
        J(E(), 27, new c(10));
    }

    @Override // R.L
    public final void v(Z z3) {
        J(E(), 2, new C0002c(15));
    }

    @Override // R.L
    public final void w(int i3, boolean z3) {
        J(E(), -1, new C0002c(28));
    }

    @Override // R.L
    public final void x(int i3, boolean z3) {
        J(E(), 5, new c(9));
    }

    @Override // R.L
    public final void y(R.I i3) {
        a E3;
        C0701z c0701z;
        if ((i3 instanceof C0142m) && (c0701z = ((C0142m) i3).f3365t) != null) {
            E3 = G(c0701z);
        } else {
            E3 = E();
        }
        J(E3, 10, new B0.a(E3, (Object) i3, 15));
    }

    @Override // R.L
    public final void z(float f3) {
        J(I(), 22, new C0002c(26));
    }
}

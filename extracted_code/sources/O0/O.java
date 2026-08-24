package o0;

import R.C0119w;
import R.C0122z;
import U.AbstractC0123a;
import android.os.Looper;
/* loaded from: classes.dex */
public final class O extends AbstractC0677a {

    /* renamed from: A  reason: collision with root package name */
    public boolean f8499A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f8500B;

    /* renamed from: C  reason: collision with root package name */
    public W.B f8501C;

    /* renamed from: D  reason: collision with root package name */
    public C0122z f8502D;

    /* renamed from: t  reason: collision with root package name */
    public final B1.a f8503t;

    /* renamed from: u  reason: collision with root package name */
    public final B0.a f8504u;

    /* renamed from: v  reason: collision with root package name */
    public final d0.g f8505v;

    /* renamed from: w  reason: collision with root package name */
    public final e0.l f8506w;
    public final int x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8507y = true;

    /* renamed from: z  reason: collision with root package name */
    public long f8508z = -9223372036854775807L;

    public O(C0122z c0122z, B1.a aVar, B0.a aVar2, d0.g gVar, e0.l lVar, int i3) {
        this.f8502D = c0122z;
        this.f8503t = aVar;
        this.f8504u = aVar2;
        this.f8505v = gVar;
        this.f8506w = lVar;
        this.x = i3;
    }

    @Override // o0.AbstractC0677a
    public final InterfaceC0699x b(C0701z c0701z, s0.e eVar, long j3) {
        W.h a3 = this.f8503t.a();
        W.B b3 = this.f8501C;
        if (b3 != null) {
            ((W.m) a3).y(b3);
        }
        C0119w c0119w = k().f2008b;
        c0119w.getClass();
        AbstractC0123a.k(this.f8574s);
        B1.e eVar2 = new B1.e((w0.r) this.f8504u.f25n, 22);
        d0.d dVar = new d0.d(this.f8571p.f5150c, 0, c0701z);
        d0.d a4 = a(c0701z);
        long M3 = U.A.M(c0119w.f2005e);
        return new M(c0119w.f2001a, a3, eVar2, this.f8505v, dVar, this.f8506w, a4, this, eVar, this.x, M3);
    }

    @Override // o0.AbstractC0677a
    public final synchronized C0122z k() {
        return this.f8502D;
    }

    @Override // o0.AbstractC0677a
    public final void o(W.B b3) {
        this.f8501C = b3;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Z.m mVar = this.f8574s;
        AbstractC0123a.k(mVar);
        d0.g gVar = this.f8505v;
        gVar.d(myLooper, mVar);
        gVar.i();
        w();
    }

    @Override // o0.AbstractC0677a
    public final void q(InterfaceC0699x interfaceC0699x) {
        T[] tArr;
        M m3 = (M) interfaceC0699x;
        if (m3.f8464H) {
            for (T t3 : m3.f8461E) {
                t3.j();
                C1.j jVar = t3.f8532h;
                if (jVar != null) {
                    jVar.N(t3.f8529e);
                    t3.f8532h = null;
                    t3.f8531g = null;
                }
            }
        }
        m3.f8491w.e(m3);
        m3.f8458B.removeCallbacksAndMessages(null);
        m3.f8459C = null;
        m3.f8480Y = true;
    }

    @Override // o0.AbstractC0677a
    public final void s() {
        this.f8505v.release();
    }

    @Override // o0.AbstractC0677a
    public final synchronized void v(C0122z c0122z) {
        this.f8502D = c0122z;
    }

    public final void w() {
        R.T y3 = new Y(this.f8508z, this.f8499A, this.f8500B, k());
        if (this.f8507y) {
            y3 = new k0.s(y3, 1);
        }
        p(y3);
    }

    public final void x(long j3, boolean z3, boolean z4) {
        if (j3 == -9223372036854775807L) {
            j3 = this.f8508z;
        }
        if (!this.f8507y && this.f8508z == j3 && this.f8499A == z3 && this.f8500B == z4) {
            return;
        }
        this.f8508z = j3;
        this.f8499A = z3;
        this.f8500B = z4;
        this.f8507y = false;
        w();
    }

    @Override // o0.AbstractC0677a
    public final void m() {
    }
}

package o0;

import R.C0122z;
/* loaded from: classes.dex */
public abstract class c0 extends AbstractC0686j {

    /* renamed from: w  reason: collision with root package name */
    public final AbstractC0677a f8585w;

    public c0(AbstractC0677a abstractC0677a) {
        this.f8585w = abstractC0677a;
    }

    public abstract void C(R.T t3);

    public final void D() {
        A(null, this.f8585w);
    }

    public void E() {
        D();
    }

    @Override // o0.AbstractC0677a
    public final R.T i() {
        return this.f8585w.i();
    }

    @Override // o0.AbstractC0677a
    public final C0122z k() {
        return this.f8585w.k();
    }

    @Override // o0.AbstractC0677a
    public final boolean l() {
        return this.f8585w.l();
    }

    @Override // o0.AbstractC0677a
    public final void o(W.B b3) {
        this.f8611v = b3;
        this.f8610u = U.A.n(null);
        E();
    }

    @Override // o0.AbstractC0677a
    public void v(C0122z c0122z) {
        this.f8585w.v(c0122z);
    }

    @Override // o0.AbstractC0686j
    public final C0701z w(Object obj, C0701z c0701z) {
        Void r12 = (Void) obj;
        return B(c0701z);
    }

    @Override // o0.AbstractC0686j
    public final long x(long j3, Object obj) {
        Void r3 = (Void) obj;
        return j3;
    }

    @Override // o0.AbstractC0686j
    public final int y(int i3, Object obj) {
        Void r22 = (Void) obj;
        return i3;
    }

    @Override // o0.AbstractC0686j
    public final void z(Object obj, AbstractC0677a abstractC0677a, R.T t3) {
        Void r12 = (Void) obj;
        C(t3);
    }

    public C0701z B(C0701z c0701z) {
        return c0701z;
    }
}

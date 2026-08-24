package o0;

import Y.l0;
/* renamed from: o0.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694s implements InterfaceC0699x, InterfaceC0698w {

    /* renamed from: m  reason: collision with root package name */
    public final C0701z f8635m;

    /* renamed from: n  reason: collision with root package name */
    public final long f8636n;

    /* renamed from: o  reason: collision with root package name */
    public final s0.e f8637o;

    /* renamed from: p  reason: collision with root package name */
    public AbstractC0677a f8638p;

    /* renamed from: q  reason: collision with root package name */
    public InterfaceC0699x f8639q;

    /* renamed from: r  reason: collision with root package name */
    public InterfaceC0698w f8640r;

    /* renamed from: s  reason: collision with root package name */
    public long f8641s = -9223372036854775807L;

    public C0694s(C0701z c0701z, s0.e eVar, long j3) {
        this.f8635m = c0701z;
        this.f8637o = eVar;
        this.f8636n = j3;
    }

    public final void a(C0701z c0701z) {
        long j3 = this.f8641s;
        if (j3 == -9223372036854775807L) {
            j3 = this.f8636n;
        }
        AbstractC0677a abstractC0677a = this.f8638p;
        abstractC0677a.getClass();
        InterfaceC0699x b3 = abstractC0677a.b(c0701z, this.f8637o, j3);
        this.f8639q = b3;
        if (this.f8640r != null) {
            b3.l(this, j3);
        }
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        return interfaceC0699x.b(j3, l0Var);
    }

    @Override // o0.W
    public final boolean d() {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        if (interfaceC0699x != null && interfaceC0699x.d()) {
            return true;
        }
        return false;
    }

    @Override // o0.V
    public final void f(W w3) {
        InterfaceC0699x interfaceC0699x = (InterfaceC0699x) w3;
        InterfaceC0698w interfaceC0698w = this.f8640r;
        int i3 = U.A.f2405a;
        interfaceC0698w.f(this);
    }

    @Override // o0.InterfaceC0699x
    public final b0 g() {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        return interfaceC0699x.g();
    }

    @Override // o0.W
    public final boolean h(Y.P p3) {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        if (interfaceC0699x != null && interfaceC0699x.h(p3)) {
            return true;
        }
        return false;
    }

    @Override // o0.InterfaceC0698w
    public final void j(InterfaceC0699x interfaceC0699x) {
        InterfaceC0698w interfaceC0698w = this.f8640r;
        int i3 = U.A.f2405a;
        interfaceC0698w.j(this);
    }

    @Override // o0.InterfaceC0699x
    public final void l(InterfaceC0698w interfaceC0698w, long j3) {
        this.f8640r = interfaceC0698w;
        InterfaceC0699x interfaceC0699x = this.f8639q;
        if (interfaceC0699x != null) {
            long j4 = this.f8641s;
            if (j4 == -9223372036854775807L) {
                j4 = this.f8636n;
            }
            interfaceC0699x.l(this, j4);
        }
    }

    @Override // o0.W
    public final long m() {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        return interfaceC0699x.m();
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        if (interfaceC0699x != null) {
            interfaceC0699x.o();
            return;
        }
        AbstractC0677a abstractC0677a = this.f8638p;
        if (abstractC0677a != null) {
            abstractC0677a.m();
        }
    }

    @Override // o0.InterfaceC0699x
    public final long p(r0.s[] sVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j3) {
        long j4;
        long j5 = this.f8641s;
        if (j5 != -9223372036854775807L && j3 == this.f8636n) {
            j4 = j5;
        } else {
            j4 = j3;
        }
        this.f8641s = -9223372036854775807L;
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        return interfaceC0699x.p(sVarArr, zArr, uArr, zArr2, j4);
    }

    @Override // o0.InterfaceC0699x
    public final long q(long j3) {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        return interfaceC0699x.q(j3);
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        interfaceC0699x.r(j3);
    }

    @Override // o0.W
    public final long t() {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        return interfaceC0699x.t();
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        return interfaceC0699x.u();
    }

    @Override // o0.W
    public final void v(long j3) {
        InterfaceC0699x interfaceC0699x = this.f8639q;
        int i3 = U.A.f2405a;
        interfaceC0699x.v(j3);
    }
}

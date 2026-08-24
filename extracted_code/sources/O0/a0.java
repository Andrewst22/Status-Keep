package o0;

import Y.l0;
/* loaded from: classes.dex */
public final class a0 implements InterfaceC0699x, InterfaceC0698w {

    /* renamed from: m  reason: collision with root package name */
    public final InterfaceC0699x f8575m;

    /* renamed from: n  reason: collision with root package name */
    public final long f8576n;

    /* renamed from: o  reason: collision with root package name */
    public InterfaceC0698w f8577o;

    public a0(InterfaceC0699x interfaceC0699x, long j3) {
        this.f8575m = interfaceC0699x;
        this.f8576n = j3;
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        long j4 = this.f8576n;
        return this.f8575m.b(j3 - j4, l0Var) + j4;
    }

    @Override // o0.W
    public final boolean d() {
        return this.f8575m.d();
    }

    @Override // o0.V
    public final void f(W w3) {
        InterfaceC0699x interfaceC0699x = (InterfaceC0699x) w3;
        InterfaceC0698w interfaceC0698w = this.f8577o;
        interfaceC0698w.getClass();
        interfaceC0698w.f(this);
    }

    @Override // o0.InterfaceC0699x
    public final b0 g() {
        return this.f8575m.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Y.O] */
    @Override // o0.W
    public final boolean h(Y.P p3) {
        ?? obj = new Object();
        obj.f3148b = p3.f3151b;
        obj.f3149c = p3.f3152c;
        obj.f3147a = p3.f3150a - this.f8576n;
        return this.f8575m.h(new Y.P(obj));
    }

    @Override // o0.InterfaceC0698w
    public final void j(InterfaceC0699x interfaceC0699x) {
        InterfaceC0698w interfaceC0698w = this.f8577o;
        interfaceC0698w.getClass();
        interfaceC0698w.j(this);
    }

    @Override // o0.InterfaceC0699x
    public final void l(InterfaceC0698w interfaceC0698w, long j3) {
        this.f8577o = interfaceC0698w;
        this.f8575m.l(this, j3 - this.f8576n);
    }

    @Override // o0.W
    public final long m() {
        long m3 = this.f8575m.m();
        if (m3 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f8576n + m3;
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        this.f8575m.o();
    }

    @Override // o0.InterfaceC0699x
    public final long p(r0.s[] sVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j3) {
        U[] uArr2 = new U[uArr.length];
        int i3 = 0;
        while (true) {
            U u3 = null;
            if (i3 >= uArr.length) {
                break;
            }
            Z z3 = (Z) uArr[i3];
            if (z3 != null) {
                u3 = z3.f8566m;
            }
            uArr2[i3] = u3;
            i3++;
        }
        long j4 = this.f8576n;
        long p3 = this.f8575m.p(sVarArr, zArr, uArr2, zArr2, j3 - j4);
        for (int i4 = 0; i4 < uArr.length; i4++) {
            U u4 = uArr2[i4];
            if (u4 == null) {
                uArr[i4] = null;
            } else {
                U u5 = uArr[i4];
                if (u5 == null || ((Z) u5).f8566m != u4) {
                    uArr[i4] = new Z(u4, j4);
                }
            }
        }
        return p3 + j4;
    }

    @Override // o0.InterfaceC0699x
    public final long q(long j3) {
        long j4 = this.f8576n;
        return this.f8575m.q(j3 - j4) + j4;
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        this.f8575m.r(j3 - this.f8576n);
    }

    @Override // o0.W
    public final long t() {
        long t3 = this.f8575m.t();
        if (t3 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f8576n + t3;
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        long u3 = this.f8575m.u();
        if (u3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f8576n + u3;
    }

    @Override // o0.W
    public final void v(long j3) {
        this.f8575m.v(j3 - this.f8576n);
    }
}

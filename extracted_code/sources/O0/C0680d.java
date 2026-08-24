package o0;

import U.AbstractC0123a;
import Y.l0;
/* renamed from: o0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680d implements InterfaceC0699x, InterfaceC0698w {

    /* renamed from: m  reason: collision with root package name */
    public final InterfaceC0699x f8586m;

    /* renamed from: n  reason: collision with root package name */
    public InterfaceC0698w f8587n;

    /* renamed from: o  reason: collision with root package name */
    public C0679c[] f8588o = new C0679c[0];

    /* renamed from: p  reason: collision with root package name */
    public long f8589p;

    /* renamed from: q  reason: collision with root package name */
    public long f8590q;

    /* renamed from: r  reason: collision with root package name */
    public long f8591r;

    /* renamed from: s  reason: collision with root package name */
    public C0682f f8592s;

    public C0680d(InterfaceC0699x interfaceC0699x, boolean z3, long j3, long j4) {
        long j5;
        this.f8586m = interfaceC0699x;
        if (z3) {
            j5 = j3;
        } else {
            j5 = -9223372036854775807L;
        }
        this.f8589p = j5;
        this.f8590q = j3;
        this.f8591r = j4;
    }

    public final boolean a() {
        if (this.f8589p != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        long j4;
        long j5 = this.f8590q;
        if (j3 == j5) {
            return j5;
        }
        long k3 = U.A.k(l0Var.f3358a, 0L, j3 - j5);
        long j6 = this.f8591r;
        if (j6 == Long.MIN_VALUE) {
            j4 = Long.MAX_VALUE;
        } else {
            j4 = j6 - j3;
        }
        long k4 = U.A.k(l0Var.f3359b, 0L, j4);
        if (k3 != l0Var.f3358a || k4 != l0Var.f3359b) {
            l0Var = new l0(k3, k4);
        }
        return this.f8586m.b(j3, l0Var);
    }

    @Override // o0.W
    public final boolean d() {
        return this.f8586m.d();
    }

    @Override // o0.V
    public final void f(W w3) {
        InterfaceC0699x interfaceC0699x = (InterfaceC0699x) w3;
        InterfaceC0698w interfaceC0698w = this.f8587n;
        interfaceC0698w.getClass();
        interfaceC0698w.f(this);
    }

    @Override // o0.InterfaceC0699x
    public final b0 g() {
        return this.f8586m.g();
    }

    @Override // o0.W
    public final boolean h(Y.P p3) {
        return this.f8586m.h(p3);
    }

    @Override // o0.InterfaceC0698w
    public final void j(InterfaceC0699x interfaceC0699x) {
        if (this.f8592s != null) {
            return;
        }
        InterfaceC0698w interfaceC0698w = this.f8587n;
        interfaceC0698w.getClass();
        interfaceC0698w.j(this);
    }

    @Override // o0.InterfaceC0699x
    public final void l(InterfaceC0698w interfaceC0698w, long j3) {
        this.f8587n = interfaceC0698w;
        this.f8586m.l(this, j3);
    }

    @Override // o0.W
    public final long m() {
        long m3 = this.f8586m.m();
        if (m3 != Long.MIN_VALUE) {
            long j3 = this.f8591r;
            if (j3 == Long.MIN_VALUE || m3 < j3) {
                return m3;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        C0682f c0682f = this.f8592s;
        if (c0682f == null) {
            this.f8586m.o();
            return;
        }
        throw c0682f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x011f, code lost:
        if (r1 > r3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    @Override // o0.InterfaceC0699x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p(r0.s[] r16, boolean[] r17, o0.U[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0680d.p(r0.s[], boolean[], o0.U[], boolean[], long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > r7) goto L18;
     */
    @Override // o0.InterfaceC0699x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f8589p = r0
            o0.c[] r0 = r6.f8588o
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f8583n = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            o0.x r0 = r6.f8586m
            long r0 = r0.q(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L33
            long r7 = r6.f8590q
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L34
            long r7 = r6.f8591r
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L33
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L34
        L33:
            r2 = 1
        L34:
            U.AbstractC0123a.j(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0680d.q(long):long");
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        this.f8586m.r(j3);
    }

    @Override // o0.W
    public final long t() {
        long t3 = this.f8586m.t();
        if (t3 != Long.MIN_VALUE) {
            long j3 = this.f8591r;
            if (j3 == Long.MIN_VALUE || t3 < j3) {
                return t3;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        boolean z3;
        if (a()) {
            long j3 = this.f8589p;
            this.f8589p = -9223372036854775807L;
            long u3 = u();
            if (u3 != -9223372036854775807L) {
                return u3;
            }
            return j3;
        }
        long u4 = this.f8586m.u();
        if (u4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z4 = false;
        if (u4 >= this.f8590q) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        long j4 = this.f8591r;
        AbstractC0123a.j((j4 == Long.MIN_VALUE || u4 <= j4) ? true : true);
        return u4;
    }

    @Override // o0.W
    public final void v(long j3) {
        this.f8586m.v(j3);
    }
}

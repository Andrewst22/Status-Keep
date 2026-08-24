package Y;

import R.C0112o;
import R.C0113p;
import U.AbstractC0123a;
import o0.C0701z;
/* renamed from: Y.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0135f implements g0 {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3273A;

    /* renamed from: C  reason: collision with root package name */
    public r0.q f3275C;

    /* renamed from: n  reason: collision with root package name */
    public final int f3277n;

    /* renamed from: p  reason: collision with root package name */
    public k0 f3279p;

    /* renamed from: q  reason: collision with root package name */
    public int f3280q;

    /* renamed from: r  reason: collision with root package name */
    public Z.m f3281r;

    /* renamed from: s  reason: collision with root package name */
    public U.v f3282s;

    /* renamed from: t  reason: collision with root package name */
    public int f3283t;

    /* renamed from: u  reason: collision with root package name */
    public o0.U f3284u;

    /* renamed from: v  reason: collision with root package name */
    public C0113p[] f3285v;

    /* renamed from: w  reason: collision with root package name */
    public long f3286w;
    public long x;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3288z;

    /* renamed from: m  reason: collision with root package name */
    public final Object f3276m = new Object();

    /* renamed from: o  reason: collision with root package name */
    public final B1.a f3278o = new B1.a(13, false);

    /* renamed from: y  reason: collision with root package name */
    public long f3287y = Long.MIN_VALUE;

    /* renamed from: B  reason: collision with root package name */
    public R.T f3274B = R.T.f1820a;

    public AbstractC0135f(int i3) {
        this.f3277n = i3;
    }

    public int A() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y.C0142m f(java.lang.Exception r13, R.C0113p r14, boolean r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f3273A
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f3273A = r3
            r3 = 0
            int r4 = r12.z(r14)     // Catch: java.lang.Throwable -> L16 Y.C0142m -> L1b
            r4 = r4 & 7
            r1.f3273A = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f3273A = r3
            throw r2
        L1b:
            r1.f3273A = r3
        L1d:
            r4 = 4
        L1e:
            java.lang.String r6 = r12.i()
            int r7 = r1.f3280q
            Y.m r11 = new Y.m
            if (r0 != 0) goto L2a
            r9 = 4
            goto L2b
        L2a:
            r9 = r4
        L2b:
            r3 = 1
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AbstractC0135f.f(java.lang.Exception, R.p, boolean, int):Y.m");
    }

    public void g() {
    }

    public Q h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        if (this.f3287y == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract void m();

    public abstract void o(long j3, boolean z3);

    public abstract void t(C0113p[] c0113pArr, long j3, long j4);

    public final int u(B1.a aVar, X.f fVar, int i3) {
        o0.U u3 = this.f3284u;
        u3.getClass();
        int i4 = u3.i(aVar, fVar, i3);
        if (i4 == -4) {
            if (fVar.c(4)) {
                this.f3287y = Long.MIN_VALUE;
                if (this.f3288z) {
                    return -4;
                }
                return -3;
            }
            long j3 = fVar.f2936s + this.f3286w;
            fVar.f2936s = j3;
            this.f3287y = Math.max(this.f3287y, j3);
        } else if (i4 == -5) {
            C0113p c0113p = (C0113p) aVar.f51o;
            c0113p.getClass();
            long j4 = c0113p.f1979r;
            if (j4 != Long.MAX_VALUE) {
                C0112o a3 = c0113p.a();
                a3.f1942q = j4 + this.f3286w;
                aVar.f51o = new C0113p(a3);
            }
        }
        return i4;
    }

    public abstract void v(long j3, long j4);

    public final void w(C0113p[] c0113pArr, o0.U u3, long j3, long j4, C0701z c0701z) {
        AbstractC0123a.j(!this.f3288z);
        this.f3284u = u3;
        if (this.f3287y == Long.MIN_VALUE) {
            this.f3287y = j3;
        }
        this.f3285v = c0113pArr;
        this.f3286w = j4;
        t(c0113pArr, j3, j4);
    }

    public final void x() {
        boolean z3;
        if (this.f3283t == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        this.f3278o.y();
        q();
    }

    public void y(float f3, float f4) {
    }

    public abstract int z(C0113p c0113p);

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    @Override // Y.g0
    public void d(int i3, Object obj) {
    }

    public void n(boolean z3, boolean z4) {
    }
}

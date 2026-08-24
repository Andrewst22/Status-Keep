package Y;

import U.AbstractC0123a;
import android.util.Pair;
import o0.C0680d;
import o0.C0694s;
import o0.C0701z;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3153a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3154b;

    /* renamed from: c  reason: collision with root package name */
    public final o0.U[] f3155c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3156d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3157e;

    /* renamed from: f  reason: collision with root package name */
    public T f3158f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3159g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f3160h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC0135f[] f3161i;

    /* renamed from: j  reason: collision with root package name */
    public final r0.u f3162j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f3163k;

    /* renamed from: l  reason: collision with root package name */
    public S f3164l;

    /* renamed from: m  reason: collision with root package name */
    public o0.b0 f3165m;

    /* renamed from: n  reason: collision with root package name */
    public r0.v f3166n;

    /* renamed from: o  reason: collision with root package name */
    public long f3167o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [o0.d] */
    public S(AbstractC0135f[] abstractC0135fArr, long j3, r0.u uVar, s0.e eVar, d0 d0Var, T t3, r0.v vVar) {
        this.f3161i = abstractC0135fArr;
        this.f3167o = j3;
        this.f3162j = uVar;
        this.f3163k = d0Var;
        C0701z c0701z = t3.f3168a;
        this.f3154b = c0701z.f8653a;
        this.f3158f = t3;
        this.f3165m = o0.b0.f8578d;
        this.f3166n = vVar;
        this.f3155c = new o0.U[abstractC0135fArr.length];
        this.f3160h = new boolean[abstractC0135fArr.length];
        d0Var.getClass();
        int i3 = j0.f3333k;
        Pair pair = (Pair) c0701z.f8653a;
        Object obj = pair.first;
        C0701z a3 = c0701z.a(pair.second);
        c0 c0Var = (c0) d0Var.f3235d.get(obj);
        c0Var.getClass();
        d0Var.f3238g.add(c0Var);
        b0 b0Var = (b0) d0Var.f3237f.get(c0Var);
        if (b0Var != null) {
            b0Var.f3219a.g(b0Var.f3220b);
        }
        c0Var.f3227c.add(a3);
        C0694s b3 = c0Var.f3225a.b(a3, eVar, t3.f3169b);
        d0Var.f3234c.put(b3, c0Var);
        d0Var.c();
        long j4 = t3.f3171d;
        this.f3153a = j4 != -9223372036854775807L ? new C0680d(b3, true, 0L, j4) : b3;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [o0.x, java.lang.Object] */
    public final long a(r0.v vVar, long j3, boolean z3, boolean[] zArr) {
        AbstractC0135f[] abstractC0135fArr;
        Object[] objArr;
        boolean z4;
        int i3 = 0;
        while (true) {
            boolean z5 = true;
            if (i3 >= vVar.f8996a) {
                break;
            }
            if (z3 || !vVar.a(this.f3166n, i3)) {
                z5 = false;
            }
            this.f3160h[i3] = z5;
            i3++;
        }
        int i4 = 0;
        while (true) {
            abstractC0135fArr = this.f3161i;
            int length = abstractC0135fArr.length;
            objArr = this.f3155c;
            if (i4 >= length) {
                break;
            }
            if (abstractC0135fArr[i4].f3277n == -2) {
                objArr[i4] = null;
            }
            i4++;
        }
        b();
        this.f3166n = vVar;
        c();
        long p3 = this.f3153a.p(vVar.f8998c, this.f3160h, this.f3155c, zArr, j3);
        for (int i5 = 0; i5 < abstractC0135fArr.length; i5++) {
            if (abstractC0135fArr[i5].f3277n == -2 && this.f3166n.b(i5)) {
                objArr[i5] = new Object();
            }
        }
        this.f3157e = false;
        for (int i6 = 0; i6 < objArr.length; i6++) {
            if (objArr[i6] != null) {
                AbstractC0123a.j(vVar.b(i6));
                if (abstractC0135fArr[i6].f3277n != -2) {
                    this.f3157e = true;
                }
            } else {
                if (vVar.f8998c[i6] == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0123a.j(z4);
            }
        }
        return p3;
    }

    public final void b() {
        if (this.f3164l == null) {
            int i3 = 0;
            while (true) {
                r0.v vVar = this.f3166n;
                if (i3 < vVar.f8996a) {
                    boolean b3 = vVar.b(i3);
                    r0.s sVar = this.f3166n.f8998c[i3];
                    if (b3 && sVar != null) {
                        sVar.s();
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f3164l == null) {
            int i3 = 0;
            while (true) {
                r0.v vVar = this.f3166n;
                if (i3 < vVar.f8996a) {
                    boolean b3 = vVar.b(i3);
                    r0.s sVar = this.f3166n.f8998c[i3];
                    if (b3 && sVar != null) {
                        sVar.h();
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o0.W, java.lang.Object] */
    public final long d() {
        long j3;
        if (!this.f3156d) {
            return this.f3158f.f3169b;
        }
        if (this.f3157e) {
            j3 = this.f3153a.m();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f3158f.f3172e;
        }
        return j3;
    }

    public final long e() {
        return this.f3158f.f3169b + this.f3167o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o0.W, java.lang.Object] */
    public final boolean f() {
        if (this.f3156d && (!this.f3157e || this.f3153a.m() == Long.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o0.x, java.lang.Object] */
    public final void g() {
        b();
        ?? r02 = this.f3153a;
        try {
            boolean z3 = r02 instanceof C0680d;
            d0 d0Var = this.f3163k;
            if (z3) {
                d0Var.f(((C0680d) r02).f8586m);
            } else {
                d0Var.f(r02);
            }
        } catch (RuntimeException e2) {
            AbstractC0123a.o("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0293, code lost:
        if (D1.AbstractC0046z.f317a.c(r9.f8936n, r15.f8936n).c(r9.f8935m, r15.f8935m).e() > 0) goto L116;
     */
    /* JADX WARN: Type inference failed for: r1v18, types: [D1.F, D1.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r0.v h(float r36, R.T r37) {
        /*
            Method dump skipped, instructions count: 1971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.S.h(float, R.T):r0.v");
    }

    public final void i() {
        Object obj = this.f3153a;
        if (obj instanceof C0680d) {
            long j3 = this.f3158f.f3171d;
            if (j3 == -9223372036854775807L) {
                j3 = Long.MIN_VALUE;
            }
            C0680d c0680d = (C0680d) obj;
            c0680d.f8590q = 0L;
            c0680d.f8591r = j3;
        }
    }
}

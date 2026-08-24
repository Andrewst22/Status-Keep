package Y;

import R.C0099b;
import U.AbstractC0123a;
import android.util.Pair;
import java.util.ArrayList;
import o0.C0701z;
/* loaded from: classes.dex */
public final class V {

    /* renamed from: c  reason: collision with root package name */
    public final Z.f f3183c;

    /* renamed from: d  reason: collision with root package name */
    public final U.x f3184d;

    /* renamed from: e  reason: collision with root package name */
    public final B0.a f3185e;

    /* renamed from: f  reason: collision with root package name */
    public long f3186f;

    /* renamed from: g  reason: collision with root package name */
    public int f3187g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3188h;

    /* renamed from: i  reason: collision with root package name */
    public S f3189i;

    /* renamed from: j  reason: collision with root package name */
    public S f3190j;

    /* renamed from: k  reason: collision with root package name */
    public S f3191k;

    /* renamed from: l  reason: collision with root package name */
    public int f3192l;

    /* renamed from: m  reason: collision with root package name */
    public Object f3193m;

    /* renamed from: n  reason: collision with root package name */
    public long f3194n;

    /* renamed from: a  reason: collision with root package name */
    public final R.Q f3181a = new R.Q();

    /* renamed from: b  reason: collision with root package name */
    public final R.S f3182b = new R.S();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f3195o = new ArrayList();

    public V(Z.f fVar, U.x xVar, B0.a aVar, r rVar) {
        this.f3183c = fVar;
        this.f3184d = xVar;
        this.f3185e = aVar;
    }

    public static C0701z l(R.T t3, Object obj, long j3, long j4, R.S s3, R.Q q3) {
        t3.g(obj, q3);
        t3.n(q3.f1797c, s3);
        t3.b(obj);
        int i3 = q3.f1801g.f1877a;
        if (i3 != 0) {
            if (i3 == 1) {
                q3.f(0);
            }
            q3.f1801g.getClass();
            q3.g(0);
        }
        t3.g(obj, q3);
        int c3 = q3.c(j3);
        if (c3 == -1) {
            return new C0701z(obj, j4, q3.b(j3));
        }
        return new C0701z(obj, c3, q3.e(c3), j4, -1);
    }

    public final S a() {
        S s3 = this.f3189i;
        if (s3 == null) {
            return null;
        }
        if (s3 == this.f3190j) {
            this.f3190j = s3.f3164l;
        }
        s3.g();
        int i3 = this.f3192l - 1;
        this.f3192l = i3;
        if (i3 == 0) {
            this.f3191k = null;
            S s4 = this.f3189i;
            this.f3193m = s4.f3154b;
            this.f3194n = s4.f3158f.f3168a.f8656d;
        }
        this.f3189i = this.f3189i.f3164l;
        j();
        return this.f3189i;
    }

    public final void b() {
        if (this.f3192l == 0) {
            return;
        }
        S s3 = this.f3189i;
        AbstractC0123a.k(s3);
        this.f3193m = s3.f3154b;
        this.f3194n = s3.f3158f.f3168a.f8656d;
        while (s3 != null) {
            s3.g();
            s3 = s3.f3164l;
        }
        this.f3189i = null;
        this.f3191k = null;
        this.f3190j = null;
        this.f3192l = 0;
        j();
    }

    public final T c(R.T t3, S s3, long j3) {
        T f3;
        long j4;
        T t4 = s3.f3158f;
        long j5 = (s3.f3167o + t4.f3172e) - j3;
        if (t4.f3174g) {
            T t5 = s3.f3158f;
            C0701z c0701z = t5.f3168a;
            int d3 = t3.d(t3.b(c0701z.f8653a), this.f3181a, this.f3182b, this.f3187g, this.f3188h);
            if (d3 != -1) {
                R.Q q3 = this.f3181a;
                int i3 = t3.f(d3, q3, true).f1797c;
                Object obj = q3.f1796b;
                obj.getClass();
                long j6 = c0701z.f8656d;
                long j7 = 0;
                if (t3.m(i3, this.f3182b, 0L).f1817n == d3) {
                    Pair j8 = t3.j(this.f3182b, this.f3181a, i3, -9223372036854775807L, Math.max(0L, j5));
                    if (j8 != null) {
                        obj = j8.first;
                        long longValue = ((Long) j8.second).longValue();
                        S s4 = s3.f3164l;
                        if (s4 != null && s4.f3154b.equals(obj)) {
                            j6 = s4.f3158f.f3168a.f8656d;
                        } else {
                            j6 = n(obj);
                            if (j6 == -1) {
                                j6 = this.f3186f;
                                this.f3186f = 1 + j6;
                            }
                        }
                        j4 = longValue;
                        j7 = -9223372036854775807L;
                    }
                } else {
                    j4 = 0;
                }
                C0701z l3 = l(t3, obj, j4, j6, this.f3182b, this.f3181a);
                if (j7 != -9223372036854775807L && t5.f3170c != -9223372036854775807L) {
                    int i4 = t3.g(c0701z.f8653a, q3).f1801g.f1877a;
                    q3.f1801g.getClass();
                    if (i4 > 0) {
                        q3.g(0);
                    }
                }
                return d(t3, l3, j7, j4);
            }
            return null;
        }
        C0701z c0701z2 = t4.f3168a;
        Object obj2 = c0701z2.f8653a;
        R.Q q4 = this.f3181a;
        t3.g(obj2, q4);
        boolean b3 = c0701z2.b();
        Object obj3 = c0701z2.f8653a;
        if (b3) {
            C0099b c0099b = q4.f1801g;
            int i5 = c0701z2.f8654b;
            int i6 = c0099b.a(i5).f1868a;
            if (i6 != -1) {
                int a3 = q4.f1801g.a(i5).a(c0701z2.f8655c);
                if (a3 < i6) {
                    f3 = e(t3, c0701z2.f8653a, i5, a3, t4.f3170c, c0701z2.f8656d);
                } else {
                    long j9 = t4.f3170c;
                    if (j9 == -9223372036854775807L) {
                        Pair j10 = t3.j(this.f3182b, q4, q4.f1797c, -9223372036854775807L, Math.max(0L, j5));
                        if (j10 != null) {
                            j9 = ((Long) j10.second).longValue();
                        }
                    }
                    t3.g(obj3, q4);
                    int i7 = c0701z2.f8654b;
                    q4.d(i7);
                    q4.f1801g.a(i7).getClass();
                    f3 = f(t3, c0701z2.f8653a, Math.max(0L, j9), t4.f3170c, c0701z2.f8656d);
                }
            }
            return null;
        }
        int i8 = c0701z2.f8657e;
        if (i8 != -1) {
            q4.f(i8);
        }
        int e2 = q4.e(i8);
        q4.g(i8);
        if (e2 != q4.f1801g.a(i8).f1868a) {
            f3 = e(t3, c0701z2.f8653a, c0701z2.f8657e, e2, t4.f3172e, c0701z2.f8656d);
        } else {
            t3.g(obj3, q4);
            q4.d(i8);
            q4.f1801g.a(i8).getClass();
            f3 = f(t3, c0701z2.f8653a, 0L, t4.f3172e, c0701z2.f8656d);
        }
        return f3;
    }

    public final T d(R.T t3, C0701z c0701z, long j3, long j4) {
        t3.g(c0701z.f8653a, this.f3181a);
        if (c0701z.b()) {
            return e(t3, c0701z.f8653a, c0701z.f8654b, c0701z.f8655c, j3, c0701z.f8656d);
        }
        return f(t3, c0701z.f8653a, j4, j3, c0701z.f8656d);
    }

    public final T e(R.T t3, Object obj, int i3, int i4, long j3, long j4) {
        C0701z c0701z = new C0701z(obj, i3, i4, j4, -1);
        R.Q q3 = this.f3181a;
        long a3 = t3.g(obj, q3).a(i3, i4);
        if (i4 == q3.e(i3)) {
            q3.f1801g.getClass();
        }
        q3.g(i3);
        long j5 = 0;
        if (a3 != -9223372036854775807L && 0 >= a3) {
            j5 = Math.max(0L, a3 - 1);
        }
        return new T(c0701z, j5, j3, -9223372036854775807L, a3, false, false, false, false);
    }

    public final T f(R.T t3, Object obj, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        R.Q q3 = this.f3181a;
        t3.g(obj, q3);
        int b3 = q3.b(j3);
        if (b3 != -1) {
            q3.f(b3);
        }
        boolean z3 = false;
        if (b3 == -1) {
            if (q3.f1801g.f1877a > 0) {
                q3.g(0);
            }
        } else {
            q3.g(b3);
        }
        C0701z c0701z = new C0701z(obj, j5, b3);
        if (!c0701z.b() && b3 == -1) {
            z3 = true;
        }
        boolean i3 = i(t3, c0701z);
        boolean h3 = h(t3, c0701z, z3);
        if (b3 != -1) {
            q3.g(b3);
        }
        if (b3 != -1) {
            q3.d(b3);
            j6 = 0;
        } else {
            j6 = -9223372036854775807L;
        }
        if (j6 != -9223372036854775807L && j6 != Long.MIN_VALUE) {
            j7 = j6;
        } else {
            j7 = q3.f1798d;
        }
        if (j7 != -9223372036854775807L && j3 >= j7) {
            j8 = Math.max(0L, j7 - 1);
        } else {
            j8 = j3;
        }
        return new T(c0701z, j8, j4, j6, j7, false, z3, i3, h3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y.T g(R.T r20, Y.T r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            o0.z r3 = r2.f3168a
            boolean r4 = r3.b()
            r5 = -1
            int r6 = r3.f8657e
            if (r4 != 0) goto L16
            if (r6 != r5) goto L16
            r4 = 1
            r12 = 1
            goto L18
        L16:
            r4 = 0
            r12 = 0
        L18:
            boolean r13 = r0.i(r1, r3)
            boolean r14 = r0.h(r1, r3, r12)
            java.lang.Object r4 = r3.f8653a
            R.Q r7 = r0.f3181a
            r1.g(r4, r7)
            boolean r1 = r3.b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3b
            if (r6 != r5) goto L35
            goto L3b
        L35:
            r7.d(r6)
            r10 = 0
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r1 = r3.b()
            int r4 = r3.f8654b
            if (r1 == 0) goto L4c
            int r1 = r3.f8655c
            long r8 = r7.a(r4, r1)
        L4a:
            r15 = r8
            goto L5c
        L4c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L59
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L57
            goto L59
        L57:
            r15 = r10
            goto L5c
        L59:
            long r8 = r7.f1798d
            goto L4a
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L66
            r7.g(r4)
            goto L6b
        L66:
            if (r6 == r5) goto L6b
            r7.g(r6)
        L6b:
            Y.T r17 = new Y.T
            long r4 = r2.f3169b
            long r6 = r2.f3170c
            r18 = 0
            r1 = r17
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r10
            r9 = r15
            r11 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.V.g(R.T, Y.T):Y.T");
    }

    public final boolean h(R.T t3, C0701z c0701z, boolean z3) {
        int b3 = t3.b(c0701z.f8653a);
        if (t3.m(t3.f(b3, this.f3181a, false).f1797c, this.f3182b, 0L).f1812i) {
            return false;
        }
        if (t3.d(b3, this.f3181a, this.f3182b, this.f3187g, this.f3188h) != -1 || !z3) {
            return false;
        }
        return true;
    }

    public final boolean i(R.T t3, C0701z c0701z) {
        boolean z3;
        if (!c0701z.b() && c0701z.f8657e == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Object obj = c0701z.f8653a;
        int i3 = t3.g(obj, this.f3181a).f1797c;
        if (t3.m(i3, this.f3182b, 0L).f1818o != t3.b(obj)) {
            return false;
        }
        return true;
    }

    public final void j() {
        C0701z c0701z;
        D1.F i3 = D1.I.i();
        for (S s3 = this.f3189i; s3 != null; s3 = s3.f3164l) {
            i3.a(s3.f3158f.f3168a);
        }
        S s4 = this.f3190j;
        if (s4 == null) {
            c0701z = null;
        } else {
            c0701z = s4.f3158f.f3168a;
        }
        this.f3184d.c(new U(this, i3, c0701z, 0));
    }

    public final boolean k(S s3) {
        AbstractC0123a.k(s3);
        boolean z3 = false;
        if (s3.equals(this.f3191k)) {
            return false;
        }
        this.f3191k = s3;
        while (true) {
            s3 = s3.f3164l;
            if (s3 == null) {
                break;
            }
            if (s3 == this.f3190j) {
                this.f3190j = this.f3189i;
                z3 = true;
            }
            s3.g();
            this.f3192l--;
        }
        S s4 = this.f3191k;
        s4.getClass();
        if (s4.f3164l != null) {
            s4.b();
            s4.f3164l = null;
            s4.c();
        }
        j();
        return z3;
    }

    public final C0701z m(R.T t3, Object obj, long j3) {
        long n3;
        int b3;
        Object obj2 = obj;
        R.Q q3 = this.f3181a;
        int i3 = t3.g(obj2, q3).f1797c;
        Object obj3 = this.f3193m;
        if (obj3 != null && (b3 = t3.b(obj3)) != -1 && t3.f(b3, q3, false).f1797c == i3) {
            n3 = this.f3194n;
        } else {
            S s3 = this.f3189i;
            while (true) {
                if (s3 != null) {
                    if (s3.f3154b.equals(obj2)) {
                        n3 = s3.f3158f.f3168a.f8656d;
                        break;
                    }
                    s3 = s3.f3164l;
                } else {
                    S s4 = this.f3189i;
                    while (true) {
                        if (s4 != null) {
                            int b4 = t3.b(s4.f3154b);
                            if (b4 != -1 && t3.f(b4, q3, false).f1797c == i3) {
                                n3 = s4.f3158f.f3168a.f8656d;
                                break;
                            }
                            s4 = s4.f3164l;
                        } else {
                            n3 = n(obj2);
                            if (n3 == -1) {
                                n3 = this.f3186f;
                                this.f3186f = 1 + n3;
                                if (this.f3189i == null) {
                                    this.f3193m = obj2;
                                    this.f3194n = n3;
                                }
                            }
                        }
                    }
                }
            }
        }
        long j4 = n3;
        t3.g(obj2, q3);
        int i4 = q3.f1797c;
        R.S s5 = this.f3182b;
        t3.n(i4, s5);
        boolean z3 = false;
        for (int b5 = t3.b(obj); b5 >= s5.f1817n; b5--) {
            boolean z4 = true;
            t3.f(b5, q3, true);
            if (q3.f1801g.f1877a <= 0) {
                z4 = false;
            }
            z3 |= z4;
            if (q3.c(q3.f1798d) != -1) {
                obj2 = q3.f1796b;
                obj2.getClass();
            }
            if (z3 && (!z4 || q3.f1798d != 0)) {
                break;
            }
        }
        return l(t3, obj2, j3, j4, this.f3182b, this.f3181a);
    }

    public final long n(Object obj) {
        for (int i3 = 0; i3 < this.f3195o.size(); i3++) {
            S s3 = (S) this.f3195o.get(i3);
            if (s3.f3154b.equals(obj)) {
                return s3.f3158f.f3168a.f8656d;
            }
        }
        return -1L;
    }

    public final boolean o(R.T t3) {
        S s3;
        S s4 = this.f3189i;
        if (s4 == null) {
            return true;
        }
        int b3 = t3.b(s4.f3154b);
        while (true) {
            b3 = t3.d(b3, this.f3181a, this.f3182b, this.f3187g, this.f3188h);
            while (true) {
                s4.getClass();
                s3 = s4.f3164l;
                if (s3 == null || s4.f3158f.f3174g) {
                    break;
                }
                s4 = s3;
            }
            if (b3 == -1 || s3 == null || t3.b(s3.f3154b) != b3) {
                break;
            }
            s4 = s3;
        }
        boolean k3 = k(s4);
        s4.f3158f = g(t3, s4.f3158f);
        return !k3;
    }

    public final boolean p(R.T t3, long j3, long j4) {
        T t4;
        long j5;
        boolean z3;
        S s3 = null;
        for (S s4 = this.f3189i; s4 != null; s4 = s4.f3164l) {
            T t5 = s4.f3158f;
            if (s3 == null) {
                t4 = g(t3, t5);
            } else {
                T c3 = c(t3, s3, j3);
                if (c3 == null) {
                    return !k(s3);
                }
                if (t5.f3169b == c3.f3169b && t5.f3168a.equals(c3.f3168a)) {
                    t4 = c3;
                } else {
                    return !k(s3);
                }
            }
            s4.f3158f = t4.a(t5.f3170c);
            long j6 = t5.f3172e;
            if (j6 != -9223372036854775807L) {
                long j7 = t4.f3172e;
                if (j6 != j7) {
                    s4.i();
                    if (j7 == -9223372036854775807L) {
                        j5 = Long.MAX_VALUE;
                    } else {
                        j5 = s4.f3167o + j7;
                    }
                    if (s4 == this.f3190j && !s4.f3158f.f3173f && (j4 == Long.MIN_VALUE || j4 >= j5)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!k(s4) && !z3) {
                        return true;
                    }
                    return false;
                }
            }
            s3 = s4;
        }
        return true;
    }
}

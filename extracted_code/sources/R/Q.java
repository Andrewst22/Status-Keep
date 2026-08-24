package R;
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public Object f1795a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1796b;

    /* renamed from: c  reason: collision with root package name */
    public int f1797c;

    /* renamed from: d  reason: collision with root package name */
    public long f1798d;

    /* renamed from: e  reason: collision with root package name */
    public long f1799e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1800f;

    /* renamed from: g  reason: collision with root package name */
    public C0099b f1801g = C0099b.f1875c;

    static {
        D2.h.m(0, 1, 2, 3, 4);
    }

    public final long a(int i3, int i4) {
        C0098a a3 = this.f1801g.a(i3);
        if (a3.f1868a != -1) {
            return a3.f1873f[i4];
        }
        return -9223372036854775807L;
    }

    public final int b(long j3) {
        int i3;
        C0098a a3;
        int i4;
        C0099b c0099b = this.f1801g;
        long j4 = this.f1798d;
        c0099b.getClass();
        if (j3 == Long.MIN_VALUE) {
            return -1;
        }
        if (j4 != -9223372036854775807L && j3 >= j4) {
            return -1;
        }
        int i5 = 0;
        while (true) {
            i3 = c0099b.f1877a;
            if (i5 >= i3) {
                break;
            }
            c0099b.a(i5).getClass();
            c0099b.a(i5).getClass();
            if (0 > j3 && ((i4 = (a3 = c0099b.a(i5)).f1868a) == -1 || a3.a(-1) < i4)) {
                break;
            }
            i5++;
        }
        if (i5 >= i3) {
            return -1;
        }
        return i5;
    }

    public final int c(long j3) {
        C0099b c0099b = this.f1801g;
        int i3 = c0099b.f1877a - 1;
        c0099b.b(i3);
        while (i3 >= 0 && j3 != Long.MIN_VALUE) {
            c0099b.a(i3).getClass();
            if (j3 >= 0) {
                break;
            }
            i3--;
        }
        if (i3 >= 0) {
            C0098a a3 = c0099b.a(i3);
            int i4 = a3.f1868a;
            if (i4 != -1) {
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = a3.f1872e[i5];
                    if (i6 == 0 || i6 == 1) {
                        return i3;
                    }
                }
            } else {
                return i3;
            }
        }
        return -1;
    }

    public final long d(int i3) {
        this.f1801g.a(i3).getClass();
        return 0L;
    }

    public final int e(int i3) {
        return this.f1801g.a(i3).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Q.class.equals(obj.getClass())) {
            return false;
        }
        Q q3 = (Q) obj;
        if (U.A.a(this.f1795a, q3.f1795a) && U.A.a(this.f1796b, q3.f1796b) && this.f1797c == q3.f1797c && this.f1798d == q3.f1798d && this.f1799e == q3.f1799e && this.f1800f == q3.f1800f && U.A.a(this.f1801g, q3.f1801g)) {
            return true;
        }
        return false;
    }

    public final boolean f(int i3) {
        C0099b c0099b = this.f1801g;
        if (i3 == c0099b.f1877a - 1) {
            c0099b.b(i3);
            return false;
        }
        return false;
    }

    public final boolean g(int i3) {
        this.f1801g.a(i3).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i3, long j3, long j4, C0099b c0099b, boolean z3) {
        this.f1795a = obj;
        this.f1796b = obj2;
        this.f1797c = i3;
        this.f1798d = j3;
        this.f1799e = j4;
        this.f1801g = c0099b;
        this.f1800f = z3;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f1795a;
        int i3 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i4 = (217 + hashCode) * 31;
        Object obj2 = this.f1796b;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        long j3 = this.f1798d;
        long j4 = this.f1799e;
        return this.f1801g.hashCode() + ((((((((((i4 + i3) * 31) + this.f1797c) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f1800f ? 1 : 0)) * 31);
    }
}

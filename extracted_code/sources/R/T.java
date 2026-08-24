package R;

import U.AbstractC0123a;
import android.util.Pair;
/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a  reason: collision with root package name */
    public static final P f1820a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [R.P, java.lang.Object] */
    static {
        U.A.H(0);
        U.A.H(1);
        U.A.H(2);
    }

    public int a(boolean z3) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z3) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i3, Q q3, S s3, int i4, boolean z3) {
        int i5 = f(i3, q3, false).f1797c;
        if (m(i5, s3, 0L).f1818o == i3) {
            int e2 = e(i5, i4, z3);
            if (e2 == -1) {
                return -1;
            }
            return m(e2, s3, 0L).f1817n;
        }
        return i3 + 1;
    }

    public int e(int i3, int i4, boolean z3) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    if (i3 == c(z3)) {
                        return a(z3);
                    }
                    return i3 + 1;
                }
                throw new IllegalStateException();
            }
            return i3;
        } else if (i3 == c(z3)) {
            return -1;
        } else {
            return i3 + 1;
        }
    }

    public final boolean equals(Object obj) {
        int c3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t3 = (T) obj;
        if (t3.o() != o() || t3.h() != h()) {
            return false;
        }
        S s3 = new S();
        Q q3 = new Q();
        S s4 = new S();
        Q q4 = new Q();
        for (int i3 = 0; i3 < o(); i3++) {
            if (!m(i3, s3, 0L).equals(t3.m(i3, s4, 0L))) {
                return false;
            }
        }
        for (int i4 = 0; i4 < h(); i4++) {
            if (!f(i4, q3, true).equals(t3.f(i4, q4, true))) {
                return false;
            }
        }
        int a3 = a(true);
        if (a3 != t3.a(true) || (c3 = c(true)) != t3.c(true)) {
            return false;
        }
        while (a3 != c3) {
            int e2 = e(a3, 0, true);
            if (e2 != t3.e(a3, 0, true)) {
                return false;
            }
            a3 = e2;
        }
        return true;
    }

    public abstract Q f(int i3, Q q3, boolean z3);

    public Q g(Object obj, Q q3) {
        return f(b(obj), q3, true);
    }

    public abstract int h();

    public final int hashCode() {
        S s3 = new S();
        Q q3 = new Q();
        int o3 = o() + 217;
        for (int i3 = 0; i3 < o(); i3++) {
            o3 = (o3 * 31) + m(i3, s3, 0L).hashCode();
        }
        int h3 = h() + (o3 * 31);
        for (int i4 = 0; i4 < h(); i4++) {
            h3 = (h3 * 31) + f(i4, q3, true).hashCode();
        }
        int a3 = a(true);
        while (a3 != -1) {
            h3 = (h3 * 31) + a3;
            a3 = e(a3, 0, true);
        }
        return h3;
    }

    public final Pair i(S s3, Q q3, int i3, long j3) {
        Pair j4 = j(s3, q3, i3, j3, 0L);
        j4.getClass();
        return j4;
    }

    public final Pair j(S s3, Q q3, int i3, long j3, long j4) {
        AbstractC0123a.g(i3, o());
        m(i3, s3, j4);
        if (j3 == -9223372036854775807L) {
            j3 = s3.f1815l;
            if (j3 == -9223372036854775807L) {
                return null;
            }
        }
        int i4 = s3.f1817n;
        f(i4, q3, false);
        while (i4 < s3.f1818o && q3.f1799e != j3) {
            int i5 = i4 + 1;
            if (f(i5, q3, false).f1799e > j3) {
                break;
            }
            i4 = i5;
        }
        f(i4, q3, true);
        long j5 = j3 - q3.f1799e;
        long j6 = q3.f1798d;
        if (j6 != -9223372036854775807L) {
            j5 = Math.min(j5, j6 - 1);
        }
        long max = Math.max(0L, j5);
        Object obj = q3.f1796b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i3, int i4, boolean z3) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    if (i3 == a(z3)) {
                        return c(z3);
                    }
                    return i3 - 1;
                }
                throw new IllegalStateException();
            }
            return i3;
        } else if (i3 == a(z3)) {
            return -1;
        } else {
            return i3 - 1;
        }
    }

    public abstract Object l(int i3);

    public abstract S m(int i3, S s3, long j3);

    public final void n(int i3, S s3) {
        m(i3, s3, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}

package c0;

import U.A;
import java.math.RoundingMode;
import java.util.List;
/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d  reason: collision with root package name */
    public final long f4766d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4767e;

    /* renamed from: f  reason: collision with root package name */
    public final List f4768f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4769g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4770h;

    /* renamed from: i  reason: collision with root package name */
    public final long f4771i;

    public n(j jVar, long j3, long j4, long j5, long j6, List list, long j7, long j8, long j9) {
        super(jVar, j3, j4);
        this.f4766d = j5;
        this.f4767e = j6;
        this.f4768f = list;
        this.f4771i = j7;
        this.f4769g = j8;
        this.f4770h = j9;
    }

    public final long b(long j3, long j4) {
        long d3 = d(j3);
        if (d3 != -1) {
            return d3;
        }
        return (int) (f((j4 - this.f4770h) + this.f4771i, j3) - c(j3, j4));
    }

    public final long c(long j3, long j4) {
        long d3 = d(j3);
        long j5 = this.f4766d;
        if (d3 == -1) {
            long j6 = this.f4769g;
            if (j6 != -9223372036854775807L) {
                return Math.max(j5, f((j4 - this.f4770h) - j6, j3));
            }
        }
        return j5;
    }

    public abstract long d(long j3);

    public final long e(long j3, long j4) {
        long j5 = this.f4781b;
        long j6 = this.f4766d;
        List list = this.f4768f;
        if (list != null) {
            return (((q) list.get((int) (j3 - j6))).f4777b * 1000000) / j5;
        }
        long d3 = d(j4);
        if (d3 != -1 && j3 == (j6 + d3) - 1) {
            return j4 - g(j3);
        }
        return (this.f4767e * 1000000) / j5;
    }

    public final long f(long j3, long j4) {
        long d3 = d(j4);
        long j5 = this.f4766d;
        if (d3 == 0) {
            return j5;
        }
        if (this.f4768f == null) {
            long j6 = (j3 / ((this.f4767e * 1000000) / this.f4781b)) + j5;
            if (j6 >= j5) {
                if (d3 == -1) {
                    return j6;
                }
                return Math.min(j6, (j5 + d3) - 1);
            }
            return j5;
        }
        long j7 = (d3 + j5) - 1;
        long j8 = j5;
        while (j8 <= j7) {
            long j9 = ((j7 - j8) / 2) + j8;
            int i3 = (g(j9) > j3 ? 1 : (g(j9) == j3 ? 0 : -1));
            if (i3 < 0) {
                j8 = j9 + 1;
            } else if (i3 > 0) {
                j7 = j9 - 1;
            } else {
                return j9;
            }
        }
        if (j8 == j5) {
            return j8;
        }
        return j7;
    }

    public final long g(long j3) {
        long j4;
        long j5 = this.f4766d;
        List list = this.f4768f;
        if (list != null) {
            j4 = ((q) list.get((int) (j3 - j5))).f4776a - this.f4782c;
        } else {
            j4 = (j3 - j5) * this.f4767e;
        }
        long j6 = j4;
        int i3 = A.f2405a;
        return A.U(j6, 1000000L, this.f4781b, RoundingMode.FLOOR);
    }

    public abstract j h(k kVar, long j3);

    public boolean i() {
        if (this.f4768f != null) {
            return true;
        }
        return false;
    }
}

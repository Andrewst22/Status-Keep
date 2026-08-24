package o0;

import R.C0099b;
/* renamed from: o0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681e extends AbstractC0692p {

    /* renamed from: c  reason: collision with root package name */
    public final long f8593c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8594d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8595e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8596f;

    public C0681e(R.T t3, long j3, long j4) {
        super(t3);
        long max;
        boolean z3 = false;
        if (t3.h() == 1) {
            R.S m3 = t3.m(0, new R.S(), 0L);
            long max2 = Math.max(0L, j3);
            if (!m3.f1814k && max2 != 0 && !m3.f1811h) {
                throw new C0682f(1);
            }
            if (j4 == Long.MIN_VALUE) {
                max = m3.f1816m;
            } else {
                max = Math.max(0L, j4);
            }
            long j5 = m3.f1816m;
            int i3 = (j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1));
            if (i3 != 0) {
                max = max > j5 ? j5 : max;
                if (max2 > max) {
                    throw new C0682f(2);
                }
            }
            this.f8593c = max2;
            this.f8594d = max;
            int i4 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
            this.f8595e = i4 != 0 ? max - max2 : -9223372036854775807L;
            if (m3.f1812i && (i4 == 0 || (i3 != 0 && max == j5))) {
                z3 = true;
            }
            this.f8596f = z3;
            return;
        }
        throw new C0682f(0);
    }

    @Override // o0.AbstractC0692p, R.T
    public final R.Q f(int i3, R.Q q3, boolean z3) {
        long j3;
        this.f8627b.f(0, q3, z3);
        long j4 = q3.f1799e - this.f8593c;
        long j5 = this.f8595e;
        if (j5 == -9223372036854775807L) {
            j3 = -9223372036854775807L;
        } else {
            j3 = j5 - j4;
        }
        q3.h(q3.f1795a, q3.f1796b, 0, j3, j4, C0099b.f1875c, false);
        return q3;
    }

    @Override // o0.AbstractC0692p, R.T
    public final R.S m(int i3, R.S s3, long j3) {
        this.f8627b.m(0, s3, 0L);
        long j4 = s3.f1819p;
        long j5 = this.f8593c;
        s3.f1819p = j4 + j5;
        s3.f1816m = this.f8595e;
        s3.f1812i = this.f8596f;
        long j6 = s3.f1815l;
        if (j6 != -9223372036854775807L) {
            long max = Math.max(j6, j5);
            s3.f1815l = max;
            long j7 = this.f8594d;
            if (j7 != -9223372036854775807L) {
                max = Math.min(max, j7);
            }
            s3.f1815l = max - j5;
        }
        long Z2 = U.A.Z(j5);
        long j8 = s3.f1808e;
        if (j8 != -9223372036854775807L) {
            s3.f1808e = j8 + Z2;
        }
        long j9 = s3.f1809f;
        if (j9 != -9223372036854775807L) {
            s3.f1809f = j9 + Z2;
        }
        return s3;
    }
}

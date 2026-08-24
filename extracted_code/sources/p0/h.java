package P0;

import U.A;
import U.AbstractC0123a;
import w0.B;
import w0.z;
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f1458a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1459b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1460c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1461d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1462e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1463f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f1464g;

    public h(long j3, int i3, long j4, int i4, long j5, long[] jArr) {
        this.f1458a = j3;
        this.f1459b = i3;
        this.f1460c = j4;
        this.f1461d = i4;
        this.f1462e = j5;
        this.f1464g = jArr;
        this.f1463f = j5 != -1 ? j3 + j5 : -1L;
    }

    @Override // P0.f
    public final long a(long j3) {
        long j4;
        double d3;
        long j5 = j3 - this.f1458a;
        if (c() && j5 > this.f1459b) {
            long[] jArr = this.f1464g;
            AbstractC0123a.k(jArr);
            double d4 = (j5 * 256.0d) / this.f1462e;
            int f3 = A.f(jArr, (long) d4, true);
            long j6 = this.f1460c;
            long j7 = (f3 * j6) / 100;
            long j8 = jArr[f3];
            int i3 = f3 + 1;
            long j9 = (j6 * i3) / 100;
            if (f3 == 99) {
                j4 = 256;
            } else {
                j4 = jArr[i3];
            }
            if (j8 == j4) {
                d3 = 0.0d;
            } else {
                d3 = (d4 - j8) / (j4 - j8);
            }
            return Math.round(d3 * (j9 - j7)) + j7;
        }
        return 0L;
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        if (this.f1464g != null) {
            return true;
        }
        return false;
    }

    @Override // P0.f
    public final long g() {
        return this.f1463f;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        double d3;
        double d4;
        boolean c3 = c();
        int i3 = this.f1459b;
        long j4 = this.f1458a;
        if (!c3) {
            B b3 = new B(0L, j4 + i3);
            return new z(b3, b3);
        }
        long k3 = A.k(j3, 0L, this.f1460c);
        double d5 = (k3 * 100.0d) / this.f1460c;
        double d6 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 100.0d) {
                d4 = 256.0d;
                d6 = 256.0d;
                double d7 = d6 / d4;
                long j5 = this.f1462e;
                B b4 = new B(k3, j4 + A.k(Math.round(d7 * j5), i3, j5 - 1));
                return new z(b4, b4);
            }
            int i4 = (int) d5;
            long[] jArr = this.f1464g;
            AbstractC0123a.k(jArr);
            double d8 = jArr[i4];
            if (i4 == 99) {
                d3 = 256.0d;
            } else {
                d3 = jArr[i4 + 1];
            }
            d6 = ((d3 - d8) * (d5 - i4)) + d8;
        }
        d4 = 256.0d;
        double d72 = d6 / d4;
        long j52 = this.f1462e;
        B b42 = new B(k3, j4 + A.k(Math.round(d72 * j52), i3, j52 - 1));
        return new z(b42, b42);
    }

    @Override // P0.f
    public final int j() {
        return this.f1461d;
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f1460c;
    }
}

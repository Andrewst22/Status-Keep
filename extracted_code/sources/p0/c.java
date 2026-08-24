package P0;

import U.A;
import android.util.Pair;
import w0.B;
import w0.z;
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f1429a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f1430b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1431c;

    public c(long j3, long[] jArr, long[] jArr2) {
        this.f1429a = jArr;
        this.f1430b = jArr2;
        this.f1431c = j3 == -9223372036854775807L ? A.M(jArr2[jArr2.length - 1]) : j3;
    }

    public static Pair b(long j3, long[] jArr, long[] jArr2) {
        double d3;
        int f3 = A.f(jArr, j3, true);
        long j4 = jArr[f3];
        long j5 = jArr2[f3];
        int i3 = f3 + 1;
        if (i3 == jArr.length) {
            return Pair.create(Long.valueOf(j4), Long.valueOf(j5));
        }
        long j6 = jArr[i3];
        long j7 = jArr2[i3];
        if (j6 == j4) {
            d3 = 0.0d;
        } else {
            d3 = (j3 - j4) / (j6 - j4);
        }
        return Pair.create(Long.valueOf(j3), Long.valueOf(((long) (d3 * (j7 - j5))) + j5));
    }

    @Override // P0.f
    public final long a(long j3) {
        return A.M(((Long) b(j3, this.f1429a, this.f1430b).second).longValue());
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return true;
    }

    @Override // P0.f
    public final long g() {
        return -1L;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        Pair b3 = b(A.Z(A.k(j3, 0L, this.f1431c)), this.f1430b, this.f1429a);
        B b4 = new B(A.M(((Long) b3.first).longValue()), ((Long) b3.second).longValue());
        return new z(b4, b4);
    }

    @Override // P0.f
    public final int j() {
        return -2147483647;
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f1431c;
    }
}

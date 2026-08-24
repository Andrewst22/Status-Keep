package P0;

import U.A;
import w0.B;
import w0.z;
/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f1453a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f1454b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1455c;

    /* renamed from: d  reason: collision with root package name */
    public final long f1456d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1457e;

    public g(long[] jArr, long[] jArr2, long j3, long j4, int i3) {
        this.f1453a = jArr;
        this.f1454b = jArr2;
        this.f1455c = j3;
        this.f1456d = j4;
        this.f1457e = i3;
    }

    @Override // P0.f
    public final long a(long j3) {
        return this.f1453a[A.f(this.f1454b, j3, true)];
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return true;
    }

    @Override // P0.f
    public final long g() {
        return this.f1456d;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        long[] jArr = this.f1453a;
        int f3 = A.f(jArr, j3, true);
        long j4 = jArr[f3];
        long[] jArr2 = this.f1454b;
        B b3 = new B(j4, jArr2[f3]);
        if (j4 < j3 && f3 != jArr.length - 1) {
            int i3 = f3 + 1;
            return new z(b3, new B(jArr[i3], jArr2[i3]));
        }
        return new z(b3, b3);
    }

    @Override // P0.f
    public final int j() {
        return this.f1457e;
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f1455c;
    }
}

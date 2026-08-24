package w0;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j implements InterfaceC0890A {

    /* renamed from: a  reason: collision with root package name */
    public final int f9592a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f9593b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f9594c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f9595d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f9596e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9597f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f9593b = iArr;
        this.f9594c = jArr;
        this.f9595d = jArr2;
        this.f9596e = jArr3;
        int length = iArr.length;
        this.f9592a = length;
        if (length > 0) {
            this.f9597f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f9597f = 0L;
        }
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return true;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        long[] jArr = this.f9596e;
        int f3 = U.A.f(jArr, j3, true);
        long j4 = jArr[f3];
        long[] jArr2 = this.f9594c;
        B b3 = new B(j4, jArr2[f3]);
        if (j4 < j3 && f3 != this.f9592a - 1) {
            int i3 = f3 + 1;
            return new z(b3, new B(jArr[i3], jArr2[i3]));
        }
        return new z(b3, b3);
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f9597f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f9592a + ", sizes=" + Arrays.toString(this.f9593b) + ", offsets=" + Arrays.toString(this.f9594c) + ", timeUs=" + Arrays.toString(this.f9596e) + ", durationsUs=" + Arrays.toString(this.f9595d) + ")";
    }
}

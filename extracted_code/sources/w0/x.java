package w0;

import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class x implements InterfaceC0890A {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f9650a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f9651b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9652c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9653d;

    public x(long j3, long[] jArr, long[] jArr2) {
        boolean z3;
        boolean z4;
        if (jArr.length == jArr2.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        int length = jArr2.length;
        if (length > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f9653d = z4;
        if (z4 && jArr2[0] > 0) {
            int i3 = length + 1;
            long[] jArr3 = new long[i3];
            this.f9650a = jArr3;
            long[] jArr4 = new long[i3];
            this.f9651b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f9650a = jArr;
            this.f9651b = jArr2;
        }
        this.f9652c = j3;
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return this.f9653d;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        if (!this.f9653d) {
            B b3 = B.f9508c;
            return new z(b3, b3);
        }
        long[] jArr = this.f9651b;
        int f3 = U.A.f(jArr, j3, true);
        long j4 = jArr[f3];
        long[] jArr2 = this.f9650a;
        B b4 = new B(j4, jArr2[f3]);
        if (j4 != j3 && f3 != jArr.length - 1) {
            int i3 = f3 + 1;
            return new z(b4, new B(jArr[i3], jArr2[i3]));
        }
        return new z(b4, b4);
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f9652c;
    }
}

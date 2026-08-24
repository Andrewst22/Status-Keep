package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class B2 extends AbstractC0494x2 {

    /* renamed from: c  reason: collision with root package name */
    private P2 f6892c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.P2] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        ?? r02;
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j3 <= 0) {
            r02 = new V2();
        } else {
            r02 = new V2((int) j3);
        }
        this.f6892c = r02;
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final void r() {
        double[] dArr = (double[]) this.f6892c.i();
        Arrays.sort(dArr);
        InterfaceC0440m2 interfaceC0440m2 = this.f7161a;
        interfaceC0440m2.s(dArr.length);
        int i3 = 0;
        if (!this.f7306b) {
            int length = dArr.length;
            while (i3 < length) {
                interfaceC0440m2.d(dArr[i3]);
                i3++;
            }
        } else {
            int length2 = dArr.length;
            while (i3 < length2) {
                double d3 = dArr[i3];
                if (interfaceC0440m2.v()) {
                    break;
                }
                interfaceC0440m2.d(d3);
                i3++;
            }
        }
        interfaceC0440m2.r();
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        this.f6892c.d(d3);
    }
}

package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class D2 extends AbstractC0504z2 {

    /* renamed from: c  reason: collision with root package name */
    private T2 f6910c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.T2] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
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
        this.f6910c = r02;
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final void r() {
        long[] jArr = (long[]) this.f6910c.i();
        Arrays.sort(jArr);
        InterfaceC0440m2 interfaceC0440m2 = this.f7176a;
        interfaceC0440m2.s(jArr.length);
        int i3 = 0;
        if (!this.f7315b) {
            int length = jArr.length;
            while (i3 < length) {
                interfaceC0440m2.f(jArr[i3]);
                i3++;
            }
        } else {
            int length2 = jArr.length;
            while (i3 < length2) {
                long j3 = jArr[i3];
                if (interfaceC0440m2.v()) {
                    break;
                }
                interfaceC0440m2.f(j3);
                i3++;
            }
        }
        interfaceC0440m2.r();
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        this.f6910c.f(j3);
    }
}

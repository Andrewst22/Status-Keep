package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class C2 extends AbstractC0499y2 {

    /* renamed from: c  reason: collision with root package name */
    private R2 f6900c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
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
        this.f6900c = r02;
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final void r() {
        int[] iArr = (int[]) this.f6900c.i();
        Arrays.sort(iArr);
        InterfaceC0440m2 interfaceC0440m2 = this.f7169a;
        interfaceC0440m2.s(iArr.length);
        int i3 = 0;
        if (!this.f7310b) {
            int length = iArr.length;
            while (i3 < length) {
                interfaceC0440m2.e(iArr[i3]);
                i3++;
            }
        } else {
            int length2 = iArr.length;
            while (i3 < length2) {
                int i4 = iArr[i3];
                if (interfaceC0440m2.v()) {
                    break;
                }
                interfaceC0440m2.e(i4);
                i3++;
            }
        }
        interfaceC0440m2.r();
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        this.f6900c.e(i3);
    }
}

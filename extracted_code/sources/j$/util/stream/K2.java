package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class K2 extends AbstractC0499y2 {

    /* renamed from: c  reason: collision with root package name */
    private int[] f6961c;

    /* renamed from: d  reason: collision with root package name */
    private int f6962d;

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f6961c = new int[(int) j3];
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final void r() {
        int i3 = 0;
        Arrays.sort(this.f6961c, 0, this.f6962d);
        InterfaceC0440m2 interfaceC0440m2 = this.f7169a;
        interfaceC0440m2.s(this.f6962d);
        if (!this.f7310b) {
            while (i3 < this.f6962d) {
                interfaceC0440m2.e(this.f6961c[i3]);
                i3++;
            }
        } else {
            while (i3 < this.f6962d && !interfaceC0440m2.v()) {
                interfaceC0440m2.e(this.f6961c[i3]);
                i3++;
            }
        }
        interfaceC0440m2.r();
        this.f6961c = null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        int[] iArr = this.f6961c;
        int i4 = this.f6962d;
        this.f6962d = i4 + 1;
        iArr[i4] = i3;
    }
}

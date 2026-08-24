package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class L2 extends AbstractC0504z2 {

    /* renamed from: c  reason: collision with root package name */
    private long[] f6971c;

    /* renamed from: d  reason: collision with root package name */
    private int f6972d;

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f6971c = new long[(int) j3];
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final void r() {
        int i3 = 0;
        Arrays.sort(this.f6971c, 0, this.f6972d);
        InterfaceC0440m2 interfaceC0440m2 = this.f7176a;
        interfaceC0440m2.s(this.f6972d);
        if (!this.f7315b) {
            while (i3 < this.f6972d) {
                interfaceC0440m2.f(this.f6971c[i3]);
                i3++;
            }
        } else {
            while (i3 < this.f6972d && !interfaceC0440m2.v()) {
                interfaceC0440m2.f(this.f6971c[i3]);
                i3++;
            }
        }
        interfaceC0440m2.r();
        this.f6971c = null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        long[] jArr = this.f6971c;
        int i3 = this.f6972d;
        this.f6972d = i3 + 1;
        jArr[i3] = j3;
    }
}

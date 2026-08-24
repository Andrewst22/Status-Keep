package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class J2 extends AbstractC0494x2 {

    /* renamed from: c  reason: collision with root package name */
    private double[] f6952c;

    /* renamed from: d  reason: collision with root package name */
    private int f6953d;

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f6952c = new double[(int) j3];
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final void r() {
        int i3 = 0;
        Arrays.sort(this.f6952c, 0, this.f6953d);
        InterfaceC0440m2 interfaceC0440m2 = this.f7161a;
        interfaceC0440m2.s(this.f6953d);
        if (!this.f7306b) {
            while (i3 < this.f6953d) {
                interfaceC0440m2.d(this.f6952c[i3]);
                i3++;
            }
        } else {
            while (i3 < this.f6953d && !interfaceC0440m2.v()) {
                interfaceC0440m2.d(this.f6952c[i3]);
                i3++;
            }
        }
        interfaceC0440m2.r();
        this.f6952c = null;
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        double[] dArr = this.f6952c;
        int i3 = this.f6953d;
        this.f6953d = i3 + 1;
        dArr[i3] = d3;
    }
}

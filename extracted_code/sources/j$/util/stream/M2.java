package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class M2 extends A2 {

    /* renamed from: d  reason: collision with root package name */
    private Object[] f6978d;

    /* renamed from: e  reason: collision with root package name */
    private int f6979e;

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f6978d = new Object[(int) j3];
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final void r() {
        int i3 = 0;
        Arrays.sort(this.f6978d, 0, this.f6979e, this.f6885b);
        InterfaceC0440m2 interfaceC0440m2 = this.f7182a;
        interfaceC0440m2.s(this.f6979e);
        if (!this.f6886c) {
            while (i3 < this.f6979e) {
                interfaceC0440m2.accept(this.f6978d[i3]);
                i3++;
            }
        } else {
            while (i3 < this.f6979e && !interfaceC0440m2.v()) {
                interfaceC0440m2.accept(this.f6978d[i3]);
                i3++;
            }
        }
        interfaceC0440m2.r();
        this.f6978d = null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f6978d;
        int i3 = this.f6979e;
        this.f6979e = i3 + 1;
        objArr[i3] = obj;
    }
}

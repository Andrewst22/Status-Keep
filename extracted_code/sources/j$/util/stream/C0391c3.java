package j$.util.stream;

import j$.util.function.InterfaceC0352g;
/* renamed from: j$.util.stream.c3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0391c3 extends AbstractC0406f3 implements InterfaceC0352g {

    /* renamed from: c  reason: collision with root package name */
    final double[] f7133c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0391c3(int i3) {
        this.f7133c = new double[i3];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0406f3
    public final void b(Object obj, long j3) {
        InterfaceC0352g interfaceC0352g = (InterfaceC0352g) obj;
        for (int i3 = 0; i3 < j3; i3++) {
            interfaceC0352g.d(this.f7133c[i3]);
        }
    }

    @Override // j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        int i3 = this.f7162b;
        this.f7162b = i3 + 1;
        this.f7133c[i3] = d3;
    }
}

package j$.util.stream;

import j$.util.function.InterfaceC0362q;
/* renamed from: j$.util.stream.d3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0396d3 extends AbstractC0406f3 implements InterfaceC0362q {

    /* renamed from: c  reason: collision with root package name */
    final int[] f7143c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0396d3(int i3) {
        this.f7143c = new int[i3];
    }

    @Override // j$.util.stream.AbstractC0406f3
    public final void b(Object obj, long j3) {
        InterfaceC0362q interfaceC0362q = (InterfaceC0362q) obj;
        for (int i3 = 0; i3 < j3; i3++) {
            interfaceC0362q.e(this.f7143c[i3]);
        }
    }

    @Override // j$.util.function.InterfaceC0362q
    public final void e(int i3) {
        int i4 = this.f7162b;
        this.f7162b = i4 + 1;
        this.f7143c[i4] = i3;
    }
}

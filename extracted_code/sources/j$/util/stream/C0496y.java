package j$.util.stream;

import j$.util.function.C0351f;
import j$.util.function.InterfaceC0352g;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0496y extends A {
    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ C parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ C sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC0382b
    final boolean U() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.A, j$.util.stream.C
    public final void g(InterfaceC0352g interfaceC0352g) {
        j$.util.B d02;
        if (!isParallel()) {
            d02 = A.d0(X());
            d02.o(interfaceC0352g);
            return;
        }
        super.g(interfaceC0352g);
    }

    @Override // j$.util.stream.A, j$.util.stream.C
    public final void q(C0351f c0351f) {
        j$.util.B d02;
        if (!isParallel()) {
            d02 = A.d0(X());
            d02.o(c0351f);
            return;
        }
        super.q(c0351f);
    }
}

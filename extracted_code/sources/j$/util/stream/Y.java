package j$.util.stream;

import j$.util.function.C0361p;
import j$.util.function.InterfaceC0362q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Y extends AbstractC0378a0 {
    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ InterfaceC0388c0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ InterfaceC0388c0 sequential() {
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

    @Override // j$.util.stream.AbstractC0378a0, j$.util.stream.InterfaceC0388c0
    public final void w(InterfaceC0362q interfaceC0362q) {
        j$.util.D d02;
        if (!isParallel()) {
            d02 = AbstractC0378a0.d0(X());
            d02.g(interfaceC0362q);
            return;
        }
        super.w(interfaceC0362q);
    }

    @Override // j$.util.stream.AbstractC0378a0, j$.util.stream.InterfaceC0388c0
    public final void C(C0361p c0361p) {
        j$.util.D d02;
        if (!isParallel()) {
            d02 = AbstractC0378a0.d0(X());
            d02.g(c0361p);
            return;
        }
        super.C(c0361p);
    }
}

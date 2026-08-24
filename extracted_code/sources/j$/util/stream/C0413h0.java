package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0413h0 extends AbstractC0423j0 {
    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ InterfaceC0433l0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ InterfaceC0433l0 sequential() {
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

    @Override // j$.util.stream.AbstractC0423j0, j$.util.stream.InterfaceC0433l0
    public final void e(j$.util.function.y yVar) {
        j$.util.F d02;
        if (!isParallel()) {
            d02 = AbstractC0423j0.d0(X());
            d02.i(yVar);
            return;
        }
        super.e(yVar);
    }

    @Override // j$.util.stream.AbstractC0423j0, j$.util.stream.InterfaceC0433l0
    public final void a(j$.util.function.x xVar) {
        j$.util.F d02;
        if (!isParallel()) {
            d02 = AbstractC0423j0.d0(X());
            d02.i(xVar);
            return;
        }
        super.a(xVar);
    }
}

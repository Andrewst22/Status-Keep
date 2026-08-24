package j$.util.stream;

import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0390c2 extends AbstractC0400e2 {
    @Override // j$.util.stream.AbstractC0382b
    final boolean U() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0400e2, j$.util.stream.Stream
    public final void b(Consumer consumer) {
        if (!isParallel()) {
            X().b(consumer);
        } else {
            super.b(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0400e2, j$.util.stream.Stream
    public final void f(Consumer consumer) {
        if (!isParallel()) {
            X().b(consumer);
        } else {
            super.f(consumer);
        }
    }
}

package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class O extends AbstractC0340b implements B {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0340b.f(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return AbstractC0340b.h(this, i3);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.k(this, consumer);
    }

    @Override // j$.util.AbstractC0340b, j$.util.B, j$.util.H, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ B trySplit() {
        return null;
    }

    @Override // j$.util.AbstractC0340b, j$.util.B, j$.util.H, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ H trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.B
    public final boolean m(InterfaceC0352g interfaceC0352g) {
        Objects.requireNonNull(interfaceC0352g);
        return false;
    }

    @Override // j$.util.B
    public final void o(InterfaceC0352g interfaceC0352g) {
        Objects.requireNonNull(interfaceC0352g);
    }
}

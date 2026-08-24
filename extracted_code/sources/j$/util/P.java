package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class P extends AbstractC0340b implements D {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.d(this, consumer);
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
        return AbstractC0340b.l(this, consumer);
    }

    @Override // j$.util.AbstractC0340b, j$.util.B, j$.util.H, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ D trySplit() {
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

    @Override // j$.util.D
    public final boolean c(InterfaceC0362q interfaceC0362q) {
        Objects.requireNonNull(interfaceC0362q);
        return false;
    }

    @Override // j$.util.D
    public final void g(InterfaceC0362q interfaceC0362q) {
        Objects.requireNonNull(interfaceC0362q);
    }
}

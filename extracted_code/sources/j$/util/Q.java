package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class Q extends AbstractC0340b implements F {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.e(this, consumer);
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
        return AbstractC0340b.n(this, consumer);
    }

    @Override // j$.util.AbstractC0340b, j$.util.B, j$.util.H, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ F trySplit() {
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

    @Override // j$.util.F
    public final boolean j(j$.util.function.y yVar) {
        Objects.requireNonNull(yVar);
        return false;
    }

    @Override // j$.util.F
    public final void i(j$.util.function.y yVar) {
        Objects.requireNonNull(yVar);
    }
}

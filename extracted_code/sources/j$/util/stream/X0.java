package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
/* loaded from: classes2.dex */
final class X0 extends AbstractC0379a1 implements D0 {
    @Override // j$.util.stream.H0
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0482v0.r(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0379a1, j$.util.stream.H0
    public final /* synthetic */ H0 q(long j3, long j4, IntFunction intFunction) {
        return AbstractC0482v0.u(this, j3, j4);
    }

    @Override // j$.util.stream.AbstractC0379a1, j$.util.stream.H0
    public final /* bridge */ /* synthetic */ H0 c(int i3) {
        c(i3);
        throw null;
    }

    @Override // j$.util.stream.AbstractC0379a1, j$.util.stream.H0
    public final G0 c(int i3) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void m(Object[] objArr, int i3) {
        AbstractC0482v0.o(this, (Integer[]) objArr, i3);
    }

    @Override // j$.util.stream.H0
    public final j$.util.H spliterator() {
        return j$.util.W.c();
    }

    @Override // j$.util.stream.H0
    public final Spliterator spliterator() {
        return j$.util.W.c();
    }

    @Override // j$.util.stream.G0
    public final Object i() {
        int[] iArr;
        iArr = AbstractC0482v0.f7281e;
        return iArr;
    }
}

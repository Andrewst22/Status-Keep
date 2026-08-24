package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O0 extends R0 implements B0 {
    @Override // j$.util.stream.H0
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0482v0.q(this, consumer);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 q(long j3, long j4, IntFunction intFunction) {
        return AbstractC0482v0.t(this, j3, j4);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void m(Object[] objArr, int i3) {
        AbstractC0482v0.n(this, (Double[]) objArr, i3);
    }

    @Override // j$.util.stream.G0
    public final Object g(int i3) {
        return new double[i3];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.k1, j$.util.H] */
    @Override // j$.util.stream.H0
    public final j$.util.H spliterator() {
        return new AbstractC0429k1(this);
    }

    @Override // j$.util.stream.H0
    public final Spliterator spliterator() {
        return new AbstractC0429k1(this);
    }
}

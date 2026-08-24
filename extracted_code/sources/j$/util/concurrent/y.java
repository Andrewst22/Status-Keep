package j$.util.concurrent;

import j$.util.AbstractC0340b;
import j$.util.B;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
import java.util.Comparator;
/* loaded from: classes2.dex */
final class y implements B {

    /* renamed from: a  reason: collision with root package name */
    long f6808a;

    /* renamed from: b  reason: collision with root package name */
    final long f6809b;

    /* renamed from: c  reason: collision with root package name */
    final double f6810c;

    /* renamed from: d  reason: collision with root package name */
    final double f6811d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
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

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(long j3, long j4, double d3, double d4) {
        this.f6808a = j3;
        this.f6809b = j4;
        this.f6810c = d3;
        this.f6811d = d4;
    }

    @Override // j$.util.Spliterator
    /* renamed from: a */
    public final y trySplit() {
        long j3 = this.f6808a;
        long j4 = (this.f6809b + j3) >>> 1;
        if (j4 <= j3) {
            return null;
        }
        this.f6808a = j4;
        return new y(j3, j4, this.f6810c, this.f6811d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6809b - this.f6808a;
    }

    @Override // j$.util.H
    /* renamed from: m */
    public final boolean tryAdvance(InterfaceC0352g interfaceC0352g) {
        interfaceC0352g.getClass();
        long j3 = this.f6808a;
        if (j3 < this.f6809b) {
            interfaceC0352g.d(ThreadLocalRandom.current().c(this.f6810c, this.f6811d));
            this.f6808a = j3 + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.H
    /* renamed from: o */
    public final void forEachRemaining(InterfaceC0352g interfaceC0352g) {
        interfaceC0352g.getClass();
        long j3 = this.f6808a;
        long j4 = this.f6809b;
        if (j3 < j4) {
            this.f6808a = j4;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC0352g.d(current.c(this.f6810c, this.f6811d));
                j3++;
            } while (j3 < j4);
        }
    }
}

package j$.util.concurrent;

import j$.util.AbstractC0340b;
import j$.util.F;
import j$.util.function.Consumer;
import java.util.Comparator;
/* loaded from: classes2.dex */
final class A implements F {

    /* renamed from: a  reason: collision with root package name */
    long f6742a;

    /* renamed from: b  reason: collision with root package name */
    final long f6743b;

    /* renamed from: c  reason: collision with root package name */
    final long f6744c;

    /* renamed from: d  reason: collision with root package name */
    final long f6745d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.e(this, consumer);
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
        return AbstractC0340b.n(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(long j3, long j4, long j5, long j6) {
        this.f6742a = j3;
        this.f6743b = j4;
        this.f6744c = j5;
        this.f6745d = j6;
    }

    @Override // j$.util.Spliterator
    /* renamed from: a */
    public final A trySplit() {
        long j3 = this.f6742a;
        long j4 = (this.f6743b + j3) >>> 1;
        if (j4 <= j3) {
            return null;
        }
        this.f6742a = j4;
        return new A(j3, j4, this.f6744c, this.f6745d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6743b - this.f6742a;
    }

    @Override // j$.util.H
    /* renamed from: j */
    public final boolean tryAdvance(j$.util.function.y yVar) {
        yVar.getClass();
        long j3 = this.f6742a;
        if (j3 < this.f6743b) {
            yVar.f(ThreadLocalRandom.current().e(this.f6744c, this.f6745d));
            this.f6742a = j3 + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.H
    /* renamed from: i */
    public final void forEachRemaining(j$.util.function.y yVar) {
        yVar.getClass();
        long j3 = this.f6742a;
        long j4 = this.f6743b;
        if (j3 < j4) {
            this.f6742a = j4;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                yVar.f(current.e(this.f6744c, this.f6745d));
                j3++;
            } while (j3 < j4);
        }
    }
}

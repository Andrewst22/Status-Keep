package j$.util.concurrent;

import j$.util.AbstractC0340b;
import j$.util.D;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
import java.util.Comparator;
/* loaded from: classes2.dex */
final class z implements D {

    /* renamed from: a  reason: collision with root package name */
    long f6812a;

    /* renamed from: b  reason: collision with root package name */
    final long f6813b;

    /* renamed from: c  reason: collision with root package name */
    final int f6814c;

    /* renamed from: d  reason: collision with root package name */
    final int f6815d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.d(this, consumer);
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
        return AbstractC0340b.l(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(long j3, long j4, int i3, int i4) {
        this.f6812a = j3;
        this.f6813b = j4;
        this.f6814c = i3;
        this.f6815d = i4;
    }

    @Override // j$.util.Spliterator
    /* renamed from: a */
    public final z trySplit() {
        long j3 = this.f6812a;
        long j4 = (this.f6813b + j3) >>> 1;
        if (j4 <= j3) {
            return null;
        }
        this.f6812a = j4;
        return new z(j3, j4, this.f6814c, this.f6815d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6813b - this.f6812a;
    }

    @Override // j$.util.H
    /* renamed from: c */
    public final boolean tryAdvance(InterfaceC0362q interfaceC0362q) {
        interfaceC0362q.getClass();
        long j3 = this.f6812a;
        if (j3 < this.f6813b) {
            interfaceC0362q.e(ThreadLocalRandom.current().d(this.f6814c, this.f6815d));
            this.f6812a = j3 + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.H
    /* renamed from: g */
    public final void forEachRemaining(InterfaceC0362q interfaceC0362q) {
        interfaceC0362q.getClass();
        long j3 = this.f6812a;
        long j4 = this.f6813b;
        if (j3 < j4) {
            this.f6812a = j4;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                interfaceC0362q.e(current.d(this.f6814c, this.f6815d));
                j3++;
            } while (j3 < j4);
        }
    }
}

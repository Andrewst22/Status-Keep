package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
abstract class g4 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final Spliterator f7171a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicBoolean f7172b;

    /* renamed from: c  reason: collision with root package name */
    boolean f7173c;

    /* renamed from: d  reason: collision with root package name */
    int f7174d;

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return AbstractC0340b.h(this, i3);
    }

    abstract Spliterator u(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public void b(Consumer consumer) {
        do {
        } while (p(consumer));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g4(Spliterator spliterator) {
        this.f7173c = true;
        this.f7171a = spliterator;
        this.f7172b = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g4(Spliterator spliterator, g4 g4Var) {
        this.f7173c = true;
        this.f7171a = spliterator;
        this.f7172b = g4Var.f7172b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f7171a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f7171a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f7171a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator trySplit = this.f7171a.trySplit();
        if (trySplit != null) {
            return u(trySplit);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return (this.f7174d == 0 && this.f7172b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.D trySplit() {
        return (j$.util.D) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.B trySplit() {
        return (j$.util.B) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
    }
}

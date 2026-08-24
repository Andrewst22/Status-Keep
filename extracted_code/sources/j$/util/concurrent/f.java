package j$.util.concurrent;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f extends p implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f6771i;

    /* renamed from: j  reason: collision with root package name */
    long f6772j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l[] lVarArr, int i3, int i4, int i5, long j3, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i3, i4, i5);
        this.f6771i = concurrentHashMap;
        this.f6772j = j3;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i3 = this.f6793f;
        int i4 = this.f6794g;
        int i5 = (i3 + i4) >>> 1;
        if (i5 <= i3) {
            return null;
        }
        l[] lVarArr = this.f6788a;
        this.f6794g = i5;
        long j3 = this.f6772j >>> 1;
        this.f6772j = j3;
        return new f(lVarArr, this.f6795h, i5, i4, j3, this.f6771i);
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a3 = a();
            if (a3 == null) {
                return;
            }
            consumer.accept(new k(a3.f6781b, a3.f6782c, this.f6771i));
        }
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        consumer.getClass();
        l a3 = a();
        if (a3 == null) {
            return false;
        }
        consumer.accept(new k(a3.f6781b, a3.f6782c, this.f6771i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6772j;
    }
}

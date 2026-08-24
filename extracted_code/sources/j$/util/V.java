package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V implements F {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f6730a;

    /* renamed from: b  reason: collision with root package name */
    private int f6731b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6732c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6733d;

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

    public V(long[] jArr, int i3, int i4, int i5) {
        this.f6730a = jArr;
        this.f6731b = i3;
        this.f6732c = i4;
        this.f6733d = i5 | 16448;
    }

    @Override // j$.util.Spliterator
    public final F trySplit() {
        int i3 = this.f6731b;
        int i4 = (this.f6732c + i3) >>> 1;
        if (i3 >= i4) {
            return null;
        }
        this.f6731b = i4;
        return new V(this.f6730a, i3, i4, this.f6733d);
    }

    @Override // j$.util.H
    /* renamed from: i */
    public final void forEachRemaining(j$.util.function.y yVar) {
        int i3;
        yVar.getClass();
        long[] jArr = this.f6730a;
        int length = jArr.length;
        int i4 = this.f6732c;
        if (length < i4 || (i3 = this.f6731b) < 0) {
            return;
        }
        this.f6731b = i4;
        if (i3 < i4) {
            do {
                yVar.f(jArr[i3]);
                i3++;
            } while (i3 < i4);
        }
    }

    @Override // j$.util.H
    /* renamed from: j */
    public final boolean tryAdvance(j$.util.function.y yVar) {
        yVar.getClass();
        int i3 = this.f6731b;
        if (i3 < 0 || i3 >= this.f6732c) {
            return false;
        }
        this.f6731b = i3 + 1;
        yVar.f(this.f6730a[i3]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6732c - this.f6731b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6733d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0340b.h(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}

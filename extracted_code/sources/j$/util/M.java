package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
/* loaded from: classes2.dex */
final class M implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f6712a;

    /* renamed from: b  reason: collision with root package name */
    private int f6713b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6714c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6715d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0340b.f(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return AbstractC0340b.h(this, i3);
    }

    public M(Object[] objArr, int i3, int i4, int i5) {
        this.f6712a = objArr;
        this.f6713b = i3;
        this.f6714c = i4;
        this.f6715d = i5 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i3 = this.f6713b;
        int i4 = (this.f6714c + i3) >>> 1;
        if (i3 >= i4) {
            return null;
        }
        this.f6713b = i4;
        return new M(this.f6712a, i3, i4, this.f6715d);
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        int i3;
        consumer.getClass();
        Object[] objArr = this.f6712a;
        int length = objArr.length;
        int i4 = this.f6714c;
        if (length < i4 || (i3 = this.f6713b) < 0) {
            return;
        }
        this.f6713b = i4;
        if (i3 < i4) {
            do {
                consumer.accept(objArr[i3]);
                i3++;
            } while (i3 < i4);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        consumer.getClass();
        int i3 = this.f6713b;
        if (i3 < 0 || i3 >= this.f6714c) {
            return false;
        }
        this.f6713b = i3 + 1;
        consumer.accept(this.f6712a[i3]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6714c - this.f6713b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6715d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0340b.h(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}

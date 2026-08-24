package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N implements B {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f6716a;

    /* renamed from: b  reason: collision with root package name */
    private int f6717b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6718c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6719d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.a(this, consumer);
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

    public N(double[] dArr, int i3, int i4, int i5) {
        this.f6716a = dArr;
        this.f6717b = i3;
        this.f6718c = i4;
        this.f6719d = i5 | 16448;
    }

    @Override // j$.util.Spliterator
    public final B trySplit() {
        int i3 = this.f6717b;
        int i4 = (this.f6718c + i3) >>> 1;
        if (i3 >= i4) {
            return null;
        }
        this.f6717b = i4;
        return new N(this.f6716a, i3, i4, this.f6719d);
    }

    @Override // j$.util.H
    /* renamed from: o */
    public final void forEachRemaining(InterfaceC0352g interfaceC0352g) {
        int i3;
        interfaceC0352g.getClass();
        double[] dArr = this.f6716a;
        int length = dArr.length;
        int i4 = this.f6718c;
        if (length < i4 || (i3 = this.f6717b) < 0) {
            return;
        }
        this.f6717b = i4;
        if (i3 < i4) {
            do {
                interfaceC0352g.d(dArr[i3]);
                i3++;
            } while (i3 < i4);
        }
    }

    @Override // j$.util.H
    /* renamed from: m */
    public final boolean tryAdvance(InterfaceC0352g interfaceC0352g) {
        interfaceC0352g.getClass();
        int i3 = this.f6717b;
        if (i3 < 0 || i3 >= this.f6718c) {
            return false;
        }
        this.f6717b = i3 + 1;
        interfaceC0352g.d(this.f6716a[i3]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6718c - this.f6717b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6719d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0340b.h(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}

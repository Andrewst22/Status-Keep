package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class T implements D {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f6721a;

    /* renamed from: b  reason: collision with root package name */
    private int f6722b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6723c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6724d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.d(this, consumer);
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

    public T(int[] iArr, int i3, int i4, int i5) {
        this.f6721a = iArr;
        this.f6722b = i3;
        this.f6723c = i4;
        this.f6724d = i5 | 16448;
    }

    @Override // j$.util.Spliterator
    public final D trySplit() {
        int i3 = this.f6722b;
        int i4 = (this.f6723c + i3) >>> 1;
        if (i3 >= i4) {
            return null;
        }
        this.f6722b = i4;
        return new T(this.f6721a, i3, i4, this.f6724d);
    }

    @Override // j$.util.H
    /* renamed from: g */
    public final void forEachRemaining(InterfaceC0362q interfaceC0362q) {
        int i3;
        interfaceC0362q.getClass();
        int[] iArr = this.f6721a;
        int length = iArr.length;
        int i4 = this.f6723c;
        if (length < i4 || (i3 = this.f6722b) < 0) {
            return;
        }
        this.f6722b = i4;
        if (i3 < i4) {
            do {
                interfaceC0362q.e(iArr[i3]);
                i3++;
            } while (i3 < i4);
        }
    }

    @Override // j$.util.H
    /* renamed from: c */
    public final boolean tryAdvance(InterfaceC0362q interfaceC0362q) {
        interfaceC0362q.getClass();
        int i3 = this.f6722b;
        if (i3 < 0 || i3 >= this.f6723c) {
            return false;
        }
        this.f6722b = i3 + 1;
        interfaceC0362q.e(this.f6721a[i3]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f6723c - this.f6722b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6724d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0340b.h(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}

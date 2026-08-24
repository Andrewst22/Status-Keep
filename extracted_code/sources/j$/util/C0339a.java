package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0339a implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final java.util.List f6739a;

    /* renamed from: b  reason: collision with root package name */
    private int f6740b;

    /* renamed from: c  reason: collision with root package name */
    private int f6741c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public C0339a(java.util.List list) {
        this.f6739a = list;
        this.f6740b = 0;
        this.f6741c = -1;
    }

    private C0339a(C0339a c0339a, int i3, int i4) {
        this.f6739a = c0339a.f6739a;
        this.f6740b = i3;
        this.f6741c = i4;
    }

    private int a() {
        int i3 = this.f6741c;
        if (i3 < 0) {
            int size = this.f6739a.size();
            this.f6741c = size;
            return size;
        }
        return i3;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a3 = a();
        int i3 = this.f6740b;
        int i4 = (a3 + i3) >>> 1;
        if (i3 >= i4) {
            return null;
        }
        this.f6740b = i4;
        return new C0339a(this, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        consumer.getClass();
        int a3 = a();
        int i3 = this.f6740b;
        if (i3 < a3) {
            this.f6740b = i3 + 1;
            try {
                consumer.accept(this.f6739a.get(i3));
                return true;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a3 = a();
        this.f6740b = a3;
        for (int i3 = this.f6740b; i3 < a3; i3++) {
            try {
                consumer.accept(this.f6739a.get(i3));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f6740b;
    }
}

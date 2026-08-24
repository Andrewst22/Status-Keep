package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
/* renamed from: j$.util.stream.k1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0429k1 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    H0 f7194a;

    /* renamed from: b  reason: collision with root package name */
    int f7195b;

    /* renamed from: c  reason: collision with root package name */
    Spliterator f7196c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f7197d;

    /* renamed from: e  reason: collision with root package name */
    ArrayDeque f7198e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
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
    public AbstractC0429k1(H0 h02) {
        this.f7194a = h02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque d() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int o3 = this.f7194a.o();
        while (true) {
            o3--;
            if (o3 < this.f7195b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f7194a.c(o3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static H0 a(ArrayDeque arrayDeque) {
        while (true) {
            H0 h02 = (H0) arrayDeque.pollFirst();
            if (h02 == null) {
                return null;
            }
            if (h02.o() == 0) {
                if (h02.count() > 0) {
                    return h02;
                }
            } else {
                for (int o3 = h02.o() - 1; o3 >= 0; o3--) {
                    arrayDeque.addFirst(h02.c(o3));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e() {
        if (this.f7194a == null) {
            return false;
        }
        if (this.f7197d == null) {
            Spliterator spliterator = this.f7196c;
            if (spliterator == null) {
                ArrayDeque d3 = d();
                this.f7198e = d3;
                H0 a3 = a(d3);
                if (a3 != null) {
                    this.f7197d = a3.spliterator();
                    return true;
                }
                this.f7194a = null;
                return false;
            }
            this.f7197d = spliterator;
            return true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        H0 h02 = this.f7194a;
        if (h02 == null || this.f7197d != null) {
            return null;
        }
        Spliterator spliterator = this.f7196c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f7195b < h02.o() - 1) {
            H0 h03 = this.f7194a;
            int i3 = this.f7195b;
            this.f7195b = i3 + 1;
            return h03.c(i3).spliterator();
        }
        H0 c3 = this.f7194a.c(this.f7195b);
        this.f7194a = c3;
        if (c3.o() == 0) {
            Spliterator spliterator2 = this.f7194a.spliterator();
            this.f7196c = spliterator2;
            return spliterator2.trySplit();
        }
        H0 h04 = this.f7194a;
        this.f7195b = 1;
        return h04.c(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j3 = 0;
        if (this.f7194a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f7196c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i3 = this.f7195b; i3 < this.f7194a.o(); i3++) {
            j3 += this.f7194a.c(i3).count();
        }
        return j3;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
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
}

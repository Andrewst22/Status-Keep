package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N2 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    int f6989a;

    /* renamed from: b  reason: collision with root package name */
    final int f6990b;

    /* renamed from: c  reason: collision with root package name */
    int f6991c;

    /* renamed from: d  reason: collision with root package name */
    final int f6992d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f6993e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ W2 f6994f;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public N2(W2 w22, int i3, int i4, int i5, int i6) {
        this.f6994f = w22;
        this.f6989a = i3;
        this.f6990b = i4;
        this.f6991c = i5;
        this.f6992d = i6;
        Object[][] objArr = w22.f7055f;
        this.f6993e = objArr == null ? w22.f7054e : objArr[i3];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i3 = this.f6989a;
        int i4 = this.f6992d;
        int i5 = this.f6990b;
        if (i3 == i5) {
            return i4 - this.f6991c;
        }
        long[] jArr = this.f6994f.f7140d;
        return ((jArr[i5] + i4) - jArr[i3]) - this.f6991c;
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i3 = this.f6989a;
        int i4 = this.f6990b;
        if (i3 < i4 || (i3 == i4 && this.f6991c < this.f6992d)) {
            Object[] objArr = this.f6993e;
            int i5 = this.f6991c;
            this.f6991c = i5 + 1;
            consumer.accept(objArr[i5]);
            if (this.f6991c == this.f6993e.length) {
                this.f6991c = 0;
                int i6 = this.f6989a + 1;
                this.f6989a = i6;
                Object[][] objArr2 = this.f6994f.f7055f;
                if (objArr2 != null && i6 <= i4) {
                    this.f6993e = objArr2[i6];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        W2 w22;
        Objects.requireNonNull(consumer);
        int i3 = this.f6989a;
        int i4 = this.f6992d;
        int i5 = this.f6990b;
        if (i3 < i5 || (i3 == i5 && this.f6991c < i4)) {
            int i6 = this.f6991c;
            while (true) {
                w22 = this.f6994f;
                if (i3 >= i5) {
                    break;
                }
                Object[] objArr = w22.f7055f[i3];
                while (i6 < objArr.length) {
                    consumer.accept(objArr[i6]);
                    i6++;
                }
                i3++;
                i6 = 0;
            }
            Object[] objArr2 = this.f6989a == i5 ? this.f6993e : w22.f7055f[i5];
            while (i6 < i4) {
                consumer.accept(objArr2[i6]);
                i6++;
            }
            this.f6989a = i5;
            this.f6991c = i4;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i3 = this.f6989a;
        int i4 = this.f6990b;
        if (i3 < i4) {
            int i5 = i4 - 1;
            int i6 = this.f6991c;
            W2 w22 = this.f6994f;
            N2 n22 = new N2(w22, i3, i5, i6, w22.f7055f[i5].length);
            this.f6989a = i4;
            this.f6991c = 0;
            this.f6993e = w22.f7055f[i4];
            return n22;
        } else if (i3 == i4) {
            int i7 = this.f6991c;
            int i8 = (this.f6992d - i7) / 2;
            if (i8 == 0) {
                return null;
            }
            Spliterator m3 = j$.util.W.m(this.f6993e, i7, i7 + i8);
            this.f6991c += i8;
            return m3;
        } else {
            return null;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}

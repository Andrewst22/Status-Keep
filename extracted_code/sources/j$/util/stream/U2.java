package j$.util.stream;

import j$.util.AbstractC0340b;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class U2 implements j$.util.H {

    /* renamed from: a  reason: collision with root package name */
    int f7038a;

    /* renamed from: b  reason: collision with root package name */
    final int f7039b;

    /* renamed from: c  reason: collision with root package name */
    int f7040c;

    /* renamed from: d  reason: collision with root package name */
    final int f7041d;

    /* renamed from: e  reason: collision with root package name */
    Object f7042e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ V2 f7043f;

    abstract void a(int i3, Object obj, Object obj2);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    abstract j$.util.H d(Object obj, int i3, int i4);

    abstract j$.util.H e(int i3, int i4, int i5, int i6);

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
    public U2(V2 v22, int i3, int i4, int i5, int i6) {
        this.f7043f = v22;
        this.f7038a = i3;
        this.f7039b = i4;
        this.f7040c = i5;
        this.f7041d = i6;
        Object[] objArr = v22.f7048f;
        this.f7042e = objArr == null ? v22.f7047e : objArr[i3];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i3 = this.f7038a;
        int i4 = this.f7041d;
        int i5 = this.f7039b;
        if (i3 == i5) {
            return i4 - this.f7040c;
        }
        long[] jArr = this.f7043f.f7140d;
        return ((jArr[i5] + i4) - jArr[i3]) - this.f7040c;
    }

    @Override // j$.util.H
    /* renamed from: tryAdvance */
    public final boolean m(Object obj) {
        Objects.requireNonNull(obj);
        int i3 = this.f7038a;
        int i4 = this.f7039b;
        if (i3 < i4 || (i3 == i4 && this.f7040c < this.f7041d)) {
            Object obj2 = this.f7042e;
            int i5 = this.f7040c;
            this.f7040c = i5 + 1;
            a(i5, obj2, obj);
            int i6 = this.f7040c;
            Object obj3 = this.f7042e;
            V2 v22 = this.f7043f;
            if (i6 == v22.y(obj3)) {
                this.f7040c = 0;
                int i7 = this.f7038a + 1;
                this.f7038a = i7;
                Object[] objArr = v22.f7048f;
                if (objArr != null && i7 <= i4) {
                    this.f7042e = objArr[i7];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.H
    /* renamed from: forEachRemaining */
    public final void o(Object obj) {
        V2 v22;
        Objects.requireNonNull(obj);
        int i3 = this.f7038a;
        int i4 = this.f7041d;
        int i5 = this.f7039b;
        if (i3 < i5 || (i3 == i5 && this.f7040c < i4)) {
            int i6 = this.f7040c;
            while (true) {
                v22 = this.f7043f;
                if (i3 >= i5) {
                    break;
                }
                Object obj2 = v22.f7048f[i3];
                v22.x(obj2, i6, v22.y(obj2), obj);
                i3++;
                i6 = 0;
            }
            v22.x(this.f7038a == i5 ? this.f7042e : v22.f7048f[i5], i6, i4, obj);
            this.f7038a = i5;
            this.f7040c = i4;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.H trySplit() {
        int i3 = this.f7038a;
        int i4 = this.f7039b;
        if (i3 < i4) {
            int i5 = i4 - 1;
            int i6 = this.f7040c;
            V2 v22 = this.f7043f;
            j$.util.H e2 = e(i3, i5, i6, v22.y(v22.f7048f[i5]));
            this.f7038a = i4;
            this.f7040c = 0;
            this.f7042e = v22.f7048f[i4];
            return e2;
        } else if (i3 == i4) {
            int i7 = this.f7040c;
            int i8 = (this.f7041d - i7) / 2;
            if (i8 == 0) {
                return null;
            }
            j$.util.H d3 = d(this.f7042e, i7, i8);
            this.f7040c += i8;
            return d3;
        } else {
            return null;
        }
    }

    @Override // j$.util.H, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.D trySplit() {
        return (j$.util.D) trySplit();
    }

    @Override // j$.util.H, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.F trySplit() {
        return (j$.util.F) trySplit();
    }

    @Override // j$.util.H, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.B trySplit() {
        return (j$.util.B) trySplit();
    }
}

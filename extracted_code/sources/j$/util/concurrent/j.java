package j$.util.concurrent;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f6775i;

    /* renamed from: j  reason: collision with root package name */
    long f6776j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i3, int i4, int i5, long j3, int i6) {
        super(lVarArr, i3, i4, i5);
        this.f6775i = i6;
        this.f6776j = j3;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f6775i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f6775i) {
            case 0:
                return AbstractC0340b.f(this);
            default:
                return AbstractC0340b.f(this);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        switch (this.f6775i) {
            case 0:
                return AbstractC0340b.h(this, i3);
            default:
                return AbstractC0340b.h(this, i3);
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f6775i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f6775i) {
            case 0:
                int i3 = this.f6793f;
                int i4 = this.f6794g;
                int i5 = (i3 + i4) >>> 1;
                if (i5 <= i3) {
                    return null;
                }
                l[] lVarArr = this.f6788a;
                this.f6794g = i5;
                long j3 = this.f6776j >>> 1;
                this.f6776j = j3;
                return new j(lVarArr, this.f6795h, i5, i4, j3, 0);
            default:
                int i6 = this.f6793f;
                int i7 = this.f6794g;
                int i8 = (i6 + i7) >>> 1;
                if (i8 <= i6) {
                    return null;
                }
                l[] lVarArr2 = this.f6788a;
                this.f6794g = i8;
                long j4 = this.f6776j >>> 1;
                this.f6776j = j4;
                return new j(lVarArr2, this.f6795h, i8, i7, j4, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        switch (this.f6775i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a3 = a();
                    if (a3 == null) {
                        return;
                    }
                    consumer.accept(a3.f6781b);
                }
            default:
                consumer.getClass();
                while (true) {
                    l a4 = a();
                    if (a4 == null) {
                        return;
                    }
                    consumer.accept(a4.f6782c);
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        switch (this.f6775i) {
            case 0:
                consumer.getClass();
                l a3 = a();
                if (a3 == null) {
                    return false;
                }
                consumer.accept(a3.f6781b);
                return true;
            default:
                consumer.getClass();
                l a4 = a();
                if (a4 == null) {
                    return false;
                }
                consumer.accept(a4.f6782c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f6775i) {
            case 0:
                return this.f6776j;
            default:
                return this.f6776j;
        }
    }
}

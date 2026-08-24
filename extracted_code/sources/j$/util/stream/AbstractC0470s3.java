package j$.util.stream;

import j$.util.AbstractC0340b;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0470s3 extends AbstractC0480u3 implements j$.util.H {
    protected abstract Object d();

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
    public AbstractC0470s3(j$.util.H h3, long j3, long j4) {
        super(h3, j3, j4, 0L, Math.min(h3.estimateSize(), j4));
    }

    @Override // j$.util.H
    /* renamed from: tryAdvance */
    public final boolean m(Object obj) {
        long j3;
        Objects.requireNonNull(obj);
        long j4 = this.f7274e;
        long j5 = this.f7270a;
        if (j5 >= j4) {
            return false;
        }
        while (true) {
            j3 = this.f7273d;
            if (j5 <= j3) {
                break;
            }
            ((j$.util.H) this.f7272c).tryAdvance(d());
            this.f7273d++;
        }
        if (j3 >= this.f7274e) {
            return false;
        }
        this.f7273d = j3 + 1;
        return ((j$.util.H) this.f7272c).tryAdvance(obj);
    }

    @Override // j$.util.H
    /* renamed from: forEachRemaining */
    public final void o(Object obj) {
        Objects.requireNonNull(obj);
        long j3 = this.f7274e;
        long j4 = this.f7270a;
        if (j4 >= j3) {
            return;
        }
        long j5 = this.f7273d;
        if (j5 >= j3) {
            return;
        }
        if (j5 >= j4 && ((j$.util.H) this.f7272c).estimateSize() + j5 <= this.f7271b) {
            ((j$.util.H) this.f7272c).forEachRemaining(obj);
            this.f7273d = this.f7274e;
            return;
        }
        while (j4 > this.f7273d) {
            ((j$.util.H) this.f7272c).tryAdvance(d());
            this.f7273d++;
        }
        while (this.f7273d < this.f7274e) {
            ((j$.util.H) this.f7272c).tryAdvance(obj);
            this.f7273d++;
        }
    }
}

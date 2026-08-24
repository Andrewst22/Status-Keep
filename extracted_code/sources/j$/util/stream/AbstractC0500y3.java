package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Objects;
/* renamed from: j$.util.stream.y3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0500y3 extends B3 implements j$.util.H {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0340b.f(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return AbstractC0340b.h(this, i3);
    }

    protected abstract void y(Object obj);

    protected abstract AbstractC0406f3 z(int i3);

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.H
    /* renamed from: tryAdvance */
    public final boolean m(Object obj) {
        Objects.requireNonNull(obj);
        while (x() != A3.NO_MORE && ((j$.util.H) this.f6893a).tryAdvance(this)) {
            if (q(1L) == 1) {
                y(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.H
    /* renamed from: forEachRemaining */
    public final void o(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC0406f3 abstractC0406f3 = null;
        while (true) {
            A3 x = x();
            if (x == A3.NO_MORE) {
                return;
            }
            A3 a3 = A3.MAYBE_MORE;
            Spliterator spliterator = this.f6893a;
            if (x == a3) {
                int i3 = this.f6895c;
                if (abstractC0406f3 == null) {
                    abstractC0406f3 = z(i3);
                } else {
                    abstractC0406f3.f7162b = 0;
                }
                long j3 = 0;
                while (((j$.util.H) spliterator).tryAdvance(abstractC0406f3)) {
                    j3++;
                    if (j3 >= i3) {
                        break;
                    }
                }
                if (j3 == 0) {
                    return;
                }
                abstractC0406f3.b(obj, q(j3));
            } else {
                ((j$.util.H) spliterator).forEachRemaining(obj);
                return;
            }
        }
    }
}

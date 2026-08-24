package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S0 extends J0 {
    @Override // j$.util.stream.H0
    public final Spliterator spliterator() {
        return new AbstractC0429k1(this);
    }

    @Override // j$.util.stream.H0
    public final void m(Object[] objArr, int i3) {
        Objects.requireNonNull(objArr);
        H0 h02 = this.f6946a;
        h02.m(objArr, i3);
        this.f6947b.m(objArr, i3 + ((int) h02.count()));
    }

    @Override // j$.util.stream.H0
    public final Object[] p(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.j((int) count);
        m(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.H0
    public final void b(Consumer consumer) {
        this.f6946a.b(consumer);
        this.f6947b.b(consumer);
    }

    @Override // j$.util.stream.H0
    public final H0 q(long j3, long j4, IntFunction intFunction) {
        if (j3 == 0 && j4 == count()) {
            return this;
        }
        long count = this.f6946a.count();
        if (j3 >= count) {
            return this.f6947b.q(j3 - count, j4 - count, intFunction);
        } else if (j4 > count) {
            return AbstractC0482v0.I(EnumC0381a3.REFERENCE, this.f6946a.q(j3, count, intFunction), this.f6947b.q(0L, j4 - count, intFunction));
        } else {
            return this.f6946a.q(j3, j4, intFunction);
        }
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f6946a, this.f6947b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}

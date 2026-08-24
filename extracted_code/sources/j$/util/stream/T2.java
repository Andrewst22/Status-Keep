package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class T2 extends V2 implements j$.util.function.y {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.V2
    public final void x(Object obj, int i3, int i4, Object obj2) {
        long[] jArr = (long[]) obj;
        j$.util.function.y yVar = (j$.util.function.y) obj2;
        while (i3 < i4) {
            yVar.f(jArr[i3]);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.V2
    public final int y(Object obj) {
        return ((long[]) obj).length;
    }

    public final void b(Consumer consumer) {
        if (consumer instanceof j$.util.function.y) {
            j((j$.util.function.y) consumer);
        } else if (I3.f6943a) {
            I3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        } else {
            AbstractC0340b.e((S2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.V2
    protected final Object[] B() {
        return new long[8];
    }

    @Override // j$.util.stream.V2
    public final Object g(int i3) {
        return new long[i3];
    }

    @Override // j$.util.function.y
    public void f(long j3) {
        C();
        int i3 = this.f7138b;
        this.f7138b = i3 + 1;
        ((long[]) this.f7047e)[i3] = j3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.W.h(spliterator());
    }

    @Override // j$.util.stream.V2, java.lang.Iterable
    /* renamed from: D */
    public j$.util.F spliterator() {
        return new S2(this, 0, this.f7139c, 0, this.f7138b);
    }

    public final String toString() {
        long[] jArr = (long[]) i();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f7139c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f7139c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}

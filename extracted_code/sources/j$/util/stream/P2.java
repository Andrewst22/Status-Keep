package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class P2 extends V2 implements InterfaceC0352g {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.V2
    public final void x(Object obj, int i3, int i4, Object obj2) {
        double[] dArr = (double[]) obj;
        InterfaceC0352g interfaceC0352g = (InterfaceC0352g) obj2;
        while (i3 < i4) {
            interfaceC0352g.d(dArr[i3]);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.V2
    public final int y(Object obj) {
        return ((double[]) obj).length;
    }

    public final void b(Consumer consumer) {
        if (consumer instanceof InterfaceC0352g) {
            j((InterfaceC0352g) consumer);
        } else if (I3.f6943a) {
            I3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        } else {
            AbstractC0340b.a((O2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.V2
    protected final Object[] B() {
        return new double[8];
    }

    @Override // j$.util.stream.V2
    public final Object g(int i3) {
        return new double[i3];
    }

    @Override // j$.util.function.InterfaceC0352g
    public void d(double d3) {
        C();
        int i3 = this.f7138b;
        this.f7138b = i3 + 1;
        ((double[]) this.f7047e)[i3] = d3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.W.f(spliterator());
    }

    @Override // j$.util.stream.V2, java.lang.Iterable
    /* renamed from: D */
    public j$.util.B spliterator() {
        return new O2(this, 0, this.f7139c, 0, this.f7138b);
    }

    public final String toString() {
        double[] dArr = (double[]) i();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f7139c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f7139c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}

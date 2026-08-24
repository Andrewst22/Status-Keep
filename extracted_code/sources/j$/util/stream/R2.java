package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class R2 extends V2 implements InterfaceC0362q {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.V2
    public final void x(Object obj, int i3, int i4, Object obj2) {
        int[] iArr = (int[]) obj;
        InterfaceC0362q interfaceC0362q = (InterfaceC0362q) obj2;
        while (i3 < i4) {
            interfaceC0362q.e(iArr[i3]);
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.V2
    public final int y(Object obj) {
        return ((int[]) obj).length;
    }

    public final void b(Consumer consumer) {
        if (consumer instanceof InterfaceC0362q) {
            j((InterfaceC0362q) consumer);
        } else if (I3.f6943a) {
            I3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        } else {
            AbstractC0340b.d((Q2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.V2
    protected final Object[] B() {
        return new int[8];
    }

    @Override // j$.util.stream.V2
    public final Object g(int i3) {
        return new int[i3];
    }

    @Override // j$.util.function.InterfaceC0362q
    public void e(int i3) {
        C();
        int i4 = this.f7138b;
        this.f7138b = i4 + 1;
        ((int[]) this.f7047e)[i4] = i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.W.g(spliterator());
    }

    @Override // j$.util.stream.V2, java.lang.Iterable
    /* renamed from: D */
    public j$.util.D spliterator() {
        return new Q2(this, 0, this.f7139c, 0, this.f7138b);
    }

    public final String toString() {
        int[] iArr = (int[]) i();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f7139c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f7139c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}

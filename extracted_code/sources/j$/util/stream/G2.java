package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
final class G2 extends AbstractC0418i0 {
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        Objects.requireNonNull(interfaceC0440m2);
        return Z2.SORTED.r(i3) ? interfaceC0440m2 : Z2.SIZED.r(i3) ? new AbstractC0415h2(interfaceC0440m2) : new AbstractC0415h2(interfaceC0440m2);
    }

    @Override // j$.util.stream.AbstractC0382b
    public final H0 S(AbstractC0382b abstractC0382b, Spliterator spliterator, IntFunction intFunction) {
        if (Z2.SORTED.r(abstractC0382b.O())) {
            return abstractC0382b.G(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((F0) abstractC0382b.G(spliterator, true, intFunction)).i();
        Arrays.sort(jArr);
        return new C0434l1(jArr);
    }
}

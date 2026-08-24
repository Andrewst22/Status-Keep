package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class H2 extends AbstractC0395d2 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f6934m;

    /* renamed from: n  reason: collision with root package name */
    private final Comparator f6935n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H2(AbstractC0400e2 abstractC0400e2) {
        super(abstractC0400e2, Z2.f7081q | Z2.f7079o, 0);
        this.f6934m = true;
        this.f6935n = AbstractC0340b.v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H2(AbstractC0400e2 abstractC0400e2, Comparator comparator) {
        super(abstractC0400e2, Z2.f7081q | Z2.f7080p, 0);
        this.f6934m = false;
        Objects.requireNonNull(comparator);
        this.f6935n = comparator;
    }

    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        Objects.requireNonNull(interfaceC0440m2);
        if (Z2.SORTED.r(i3) && this.f6934m) {
            return interfaceC0440m2;
        }
        boolean r3 = Z2.SIZED.r(i3);
        Comparator comparator = this.f6935n;
        if (r3) {
            return new A2(interfaceC0440m2, comparator);
        }
        return new A2(interfaceC0440m2, comparator);
    }

    @Override // j$.util.stream.AbstractC0382b
    public final H0 S(AbstractC0382b abstractC0382b, Spliterator spliterator, IntFunction intFunction) {
        if (Z2.SORTED.r(abstractC0382b.O()) && this.f6934m) {
            return abstractC0382b.G(spliterator, false, intFunction);
        }
        Object[] p3 = abstractC0382b.G(spliterator, true, intFunction).p(intFunction);
        Arrays.sort(p3, this.f6935n);
        return new K0(p3);
    }
}

package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class L3 extends AbstractC0395d2 implements Y3 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Predicate f6973m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L3(AbstractC0400e2 abstractC0400e2, int i3, Predicate predicate) {
        super(abstractC0400e2, i3, 0);
        this.f6973m = predicate;
    }

    @Override // j$.util.stream.AbstractC0382b
    final Spliterator T(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        if (Z2.ORDERED.r(abstractC0382b.O())) {
            return S(abstractC0382b, spliterator, new C0457q(29)).spliterator();
        }
        return new f4(abstractC0382b.b0(spliterator), this.f6973m, 0);
    }

    @Override // j$.util.stream.AbstractC0382b
    final H0 S(AbstractC0382b abstractC0382b, Spliterator spliterator, IntFunction intFunction) {
        return (H0) new a4(this, abstractC0382b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        return new K3(this, interfaceC0440m2, false);
    }

    @Override // j$.util.stream.Y3
    public final Z3 n(InterfaceC0502z0 interfaceC0502z0, boolean z3) {
        return new K3(this, interfaceC0502z0, z3);
    }
}

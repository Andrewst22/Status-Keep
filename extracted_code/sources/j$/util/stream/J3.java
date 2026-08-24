package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
/* loaded from: classes2.dex */
final class J3 extends AbstractC0395d2 {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ Predicate f6954m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(AbstractC0400e2 abstractC0400e2, int i3, Predicate predicate) {
        super(abstractC0400e2, i3, 0);
        this.f6954m = predicate;
    }

    @Override // j$.util.stream.AbstractC0382b
    final Spliterator T(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        if (Z2.ORDERED.r(abstractC0382b.O())) {
            return S(abstractC0382b, spliterator, new C0457q(29)).spliterator();
        }
        return new f4(abstractC0382b.b0(spliterator), this.f6954m, 1);
    }

    @Override // j$.util.stream.AbstractC0382b
    final H0 S(AbstractC0382b abstractC0382b, Spliterator spliterator, IntFunction intFunction) {
        return (H0) new b4(this, abstractC0382b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        return new C0427k(this, interfaceC0440m2);
    }
}

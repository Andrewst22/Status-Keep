package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0355j;
import j$.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V3 extends AbstractC0501z {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ C0355j f7049m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V3(AbstractC0382b abstractC0382b, int i3, C0355j c0355j) {
        super(abstractC0382b, i3, 0);
        this.f7049m = c0355j;
    }

    @Override // j$.util.stream.AbstractC0382b
    final Spliterator T(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        if (Z2.ORDERED.r(abstractC0382b.O())) {
            return S(abstractC0382b, spliterator, new Y1(10)).spliterator();
        }
        return new c4((j$.util.B) abstractC0382b.b0(spliterator), this.f7049m, 1);
    }

    @Override // j$.util.stream.AbstractC0382b
    final H0 S(AbstractC0382b abstractC0382b, Spliterator spliterator, IntFunction intFunction) {
        return (H0) new b4(this, abstractC0382b, spliterator, intFunction).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        return new U3(this, interfaceC0440m2);
    }
}

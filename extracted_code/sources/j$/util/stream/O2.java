package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
/* loaded from: classes2.dex */
final class O2 extends U2 implements j$.util.B {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ P2 f7000g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.k(this, consumer);
    }

    @Override // j$.util.stream.U2
    final void a(int i3, Object obj, Object obj2) {
        ((InterfaceC0352g) obj2).d(((double[]) obj)[i3]);
    }

    @Override // j$.util.stream.U2
    final j$.util.H d(Object obj, int i3, int i4) {
        return j$.util.W.j((double[]) obj, i3, i4 + i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O2(P2 p22, int i3, int i4, int i5, int i6) {
        super(p22, i3, i4, i5, i6);
        this.f7000g = p22;
    }

    @Override // j$.util.stream.U2
    final j$.util.H e(int i3, int i4, int i5, int i6) {
        return new O2(this.f7000g, i3, i4, i5, i6);
    }
}

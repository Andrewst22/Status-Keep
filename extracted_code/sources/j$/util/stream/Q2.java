package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
/* loaded from: classes2.dex */
final class Q2 extends U2 implements j$.util.D {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ R2 f7020g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.d(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.l(this, consumer);
    }

    @Override // j$.util.stream.U2
    final void a(int i3, Object obj, Object obj2) {
        ((InterfaceC0362q) obj2).e(((int[]) obj)[i3]);
    }

    @Override // j$.util.stream.U2
    final j$.util.H d(Object obj, int i3, int i4) {
        return j$.util.W.k((int[]) obj, i3, i4 + i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(R2 r22, int i3, int i4, int i5, int i6) {
        super(r22, i3, i4, i5, i6);
        this.f7020g = r22;
    }

    @Override // j$.util.stream.U2
    final j$.util.H e(int i3, int i4, int i5, int i6) {
        return new Q2(this.f7020g, i3, i4, i5, i6);
    }
}

package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class S2 extends U2 implements j$.util.F {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ T2 f7026g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.n(this, consumer);
    }

    @Override // j$.util.stream.U2
    final void a(int i3, Object obj, Object obj2) {
        ((j$.util.function.y) obj2).f(((long[]) obj)[i3]);
    }

    @Override // j$.util.stream.U2
    final j$.util.H d(Object obj, int i3, int i4) {
        return j$.util.W.l((long[]) obj, i3, i4 + i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(T2 t22, int i3, int i4, int i5, int i6) {
        super(t22, i3, i4, i5, i6);
        this.f7026g = t22;
    }

    @Override // j$.util.stream.U2
    final j$.util.H e(int i3, int i4, int i5, int i6) {
        return new S2(this.f7026g, i3, i4, i5, i6);
    }
}

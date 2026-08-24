package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
/* renamed from: j$.util.stream.x3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0495x3 extends AbstractC0500y3 implements j$.util.F, j$.util.function.y {

    /* renamed from: f  reason: collision with root package name */
    long f7307f;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.n(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.B3, j$.util.Spliterator] */
    @Override // j$.util.stream.B3
    protected final Spliterator u(Spliterator spliterator) {
        return new B3((j$.util.F) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC0500y3
    protected final void y(Object obj) {
        ((j$.util.function.y) obj).f(this.f7307f);
    }

    @Override // j$.util.function.y
    public final void f(long j3) {
        this.f7307f = j3;
    }

    @Override // j$.util.stream.AbstractC0500y3
    protected final AbstractC0406f3 z(int i3) {
        return new C0401e3(i3);
    }
}

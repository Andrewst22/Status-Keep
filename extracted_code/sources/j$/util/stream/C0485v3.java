package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
/* renamed from: j$.util.stream.v3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0485v3 extends AbstractC0500y3 implements j$.util.B, InterfaceC0352g {

    /* renamed from: f  reason: collision with root package name */
    double f7289f;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.k(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.B3, j$.util.Spliterator] */
    @Override // j$.util.stream.B3
    protected final Spliterator u(Spliterator spliterator) {
        return new B3((j$.util.B) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC0500y3
    protected final void y(Object obj) {
        ((InterfaceC0352g) obj).d(this.f7289f);
    }

    @Override // j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        this.f7289f = d3;
    }

    @Override // j$.util.stream.AbstractC0500y3
    protected final AbstractC0406f3 z(int i3) {
        return new C0391c3(i3);
    }
}

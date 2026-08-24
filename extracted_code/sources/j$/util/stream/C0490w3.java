package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
/* renamed from: j$.util.stream.w3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0490w3 extends AbstractC0500y3 implements j$.util.D, InterfaceC0362q {

    /* renamed from: f  reason: collision with root package name */
    int f7301f;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.d(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.l(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.B3, j$.util.Spliterator] */
    @Override // j$.util.stream.B3
    protected final Spliterator u(Spliterator spliterator) {
        return new B3((j$.util.D) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC0500y3
    protected final void y(Object obj) {
        ((InterfaceC0362q) obj).e(this.f7301f);
    }

    @Override // j$.util.function.InterfaceC0362q
    public final void e(int i3) {
        this.f7301f = i3;
    }

    @Override // j$.util.stream.AbstractC0500y3
    protected final AbstractC0406f3 z(int i3) {
        return new C0396d3(i3);
    }
}

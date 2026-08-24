package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class J1 extends R1 implements Q1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.M f6949b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f6950c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BiConsumer f6951d;

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void f(long j3) {
        AbstractC0482v0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void r() {
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        this.f6951d.u(this.f7023a, ((J1) q1).f7023a);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7023a = this.f6949b.get();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f6950c.u(this.f7023a, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J1(j$.util.function.M m3, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f6949b = m3;
        this.f6950c = biConsumer;
        this.f6951d = biConsumer2;
    }
}

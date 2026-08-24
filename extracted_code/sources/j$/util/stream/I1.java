package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0347b;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class I1 extends R1 implements Q1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.L f6939b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f6940c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0347b f6941d;

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
        this.f7023a = this.f6941d.f6842a.apply(this.f7023a, ((I1) q1).f7023a);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7023a = this.f6939b.f6834a.get();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f6940c.u(this.f7023a, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public I1(j$.util.function.L l3, BiConsumer biConsumer, C0347b c0347b) {
        this.f6939b = l3;
        this.f6940c = biConsumer;
        this.f6941d = c0347b;
    }
}

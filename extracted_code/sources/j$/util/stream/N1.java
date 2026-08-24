package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class N1 extends R1 implements Q1, InterfaceC0430k2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.M f6986b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.I f6987c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0452p f6988d;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        t((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
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

    @Override // j$.util.stream.InterfaceC0430k2
    public final /* synthetic */ void t(Integer num) {
        AbstractC0482v0.f(this, num);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        Object obj = this.f7023a;
        this.f6988d.f7223b.u(obj, ((N1) q1).f7023a);
        this.f7023a = obj;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7023a = this.f6986b.get();
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        this.f6987c.m(i3, this.f7023a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public N1(j$.util.function.M m3, j$.util.function.I i3, C0452p c0452p) {
        this.f6986b = m3;
        this.f6987c = i3;
        this.f6988d = c0452p;
    }
}

package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class D1 extends R1 implements Q1, InterfaceC0425j2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.util.function.M f6907b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.G f6908c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0452p f6909d;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        w((Double) obj);
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

    @Override // j$.util.stream.InterfaceC0425j2
    public final /* synthetic */ void w(Double d3) {
        AbstractC0482v0.d(this, d3);
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        Object obj = this.f7023a;
        this.f6909d.f7223b.u(obj, ((D1) q1).f7023a);
        this.f7023a = obj;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7023a = this.f6907b.get();
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        this.f6908c.a(this.f7023a, d3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D1(j$.util.function.M m3, j$.util.function.G g3, C0452p c0452p) {
        this.f6907b = m3;
        this.f6908c = g3;
        this.f6909d = c0452p;
    }
}

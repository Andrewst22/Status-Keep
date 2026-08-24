package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class O1 implements Q1, InterfaceC0435l2 {

    /* renamed from: a  reason: collision with root package name */
    private long f6997a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f6998b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.w f6999c;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

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

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0435l2
    public final /* synthetic */ void n(Long l3) {
        AbstractC0482v0.i(this, l3);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void r() {
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public O1(long j3, j$.util.function.w wVar) {
        this.f6998b = j3;
        this.f6999c = wVar;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        f(((O1) q1).f6997a);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f6997a = this.f6998b;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        this.f6997a = this.f6999c.c(this.f6997a, j3);
    }

    @Override // j$.util.function.M
    public final Object get() {
        return Long.valueOf(this.f6997a);
    }
}

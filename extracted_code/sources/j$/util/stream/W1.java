package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
abstract class W1 extends R1 implements Q1 {

    /* renamed from: b  reason: collision with root package name */
    long f7053b;

    public /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
    }

    public /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    public /* synthetic */ void f(long j3) {
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
        this.f7053b += ((W1) q1).f7053b;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7053b = 0L;
    }

    @Override // j$.util.stream.R1, j$.util.function.M
    public final Object get() {
        return Long.valueOf(this.f7053b);
    }
}

package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
abstract class I implements G3 {

    /* renamed from: a  reason: collision with root package name */
    boolean f6936a;

    /* renamed from: b  reason: collision with root package name */
    Object f6937b;

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
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
    public final /* synthetic */ void s(long j3) {
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void w(Object obj) {
        if (this.f6936a) {
            return;
        }
        this.f6936a = true;
        this.f6937b = obj;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return this.f6936a;
    }
}

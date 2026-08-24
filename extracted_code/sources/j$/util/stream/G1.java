package j$.util.stream;

import j$.util.C0371m;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0348c;
/* loaded from: classes2.dex */
final class G1 implements Q1 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6925a;

    /* renamed from: b  reason: collision with root package name */
    private Object f6926b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InterfaceC0348c f6927c;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public G1(InterfaceC0348c interfaceC0348c) {
        this.f6927c = interfaceC0348c;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        G1 g12 = (G1) q1;
        if (g12.f6925a) {
            return;
        }
        accept(g12.f6926b);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f6925a = true;
        this.f6926b = null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f6925a) {
            this.f6925a = false;
            this.f6926b = obj;
            return;
        }
        this.f6926b = this.f6927c.c(this.f6926b, obj);
    }

    @Override // j$.util.function.M
    public final Object get() {
        return this.f6925a ? C0371m.a() : C0371m.d(this.f6926b);
    }
}

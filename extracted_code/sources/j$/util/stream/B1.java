package j$.util.stream;

import j$.util.C0372n;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0350e;
/* loaded from: classes2.dex */
final class B1 implements Q1, InterfaceC0425j2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6889a;

    /* renamed from: b  reason: collision with root package name */
    private double f6890b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InterfaceC0350e f6891c;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public B1(InterfaceC0350e interfaceC0350e) {
        this.f6891c = interfaceC0350e;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        B1 b12 = (B1) q1;
        if (b12.f6889a) {
            return;
        }
        d(b12.f6890b);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f6889a = true;
        this.f6890b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        if (this.f6889a) {
            this.f6889a = false;
            this.f6890b = d3;
            return;
        }
        this.f6890b = this.f6891c.b(this.f6890b, d3);
    }

    @Override // j$.util.function.M
    public final Object get() {
        return this.f6889a ? C0372n.a() : C0372n.d(this.f6890b);
    }
}

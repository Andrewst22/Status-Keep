package j$.util.stream;

import j$.util.function.C0349d;
import j$.util.function.Consumer;
/* renamed from: j$.util.stream.z1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0503z1 implements Q1, InterfaceC0425j2 {

    /* renamed from: a  reason: collision with root package name */
    private double f7312a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f7313b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0349d f7314c;

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
    public C0503z1(double d3, C0349d c0349d) {
        this.f7313b = d3;
        this.f7314c = c0349d;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        d(((C0503z1) q1).f7312a);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7312a = this.f7313b;
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        C0349d c0349d = this.f7314c;
        this.f7312a = c0349d.f6843a.applyAsDouble(this.f7312a, d3);
    }

    @Override // j$.util.function.M
    public final Object get() {
        return Double.valueOf(this.f7312a);
    }
}

package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0360o;
/* loaded from: classes2.dex */
final class K1 implements Q1, InterfaceC0430k2 {

    /* renamed from: a  reason: collision with root package name */
    private int f6958a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6959b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InterfaceC0360o f6960c;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public K1(int i3, InterfaceC0360o interfaceC0360o) {
        this.f6959b = i3;
        this.f6960c = interfaceC0360o;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        e(((K1) q1).f6958a);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f6958a = this.f6959b;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        this.f6958a = this.f6960c.b(this.f6958a, i3);
    }

    @Override // j$.util.function.M
    public final Object get() {
        return Integer.valueOf(this.f6958a);
    }
}

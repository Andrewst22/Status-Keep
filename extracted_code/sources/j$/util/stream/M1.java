package j$.util.stream;

import j$.util.C0373o;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0360o;
/* loaded from: classes2.dex */
final class M1 implements Q1, InterfaceC0430k2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f6975a;

    /* renamed from: b  reason: collision with root package name */
    private int f6976b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InterfaceC0360o f6977c;

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
    public M1(InterfaceC0360o interfaceC0360o) {
        this.f6977c = interfaceC0360o;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        M1 m12 = (M1) q1;
        if (m12.f6975a) {
            return;
        }
        e(m12.f6976b);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f6975a = true;
        this.f6976b = 0;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        if (this.f6975a) {
            this.f6975a = false;
            this.f6976b = i3;
            return;
        }
        this.f6976b = this.f6977c.b(this.f6976b, i3);
    }

    @Override // j$.util.function.M
    public final Object get() {
        return this.f6975a ? C0373o.a() : C0373o.d(this.f6976b);
    }
}

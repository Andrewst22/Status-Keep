package j$.util.stream;

import j$.util.C0374p;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class P1 implements Q1, InterfaceC0435l2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7012a;

    /* renamed from: b  reason: collision with root package name */
    private long f7013b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.util.function.w f7014c;

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
    public P1(j$.util.function.w wVar) {
        this.f7014c = wVar;
    }

    @Override // j$.util.stream.Q1
    public final void l(Q1 q1) {
        P1 p12 = (P1) q1;
        if (p12.f7012a) {
            return;
        }
        f(p12.f7013b);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7012a = true;
        this.f7013b = 0L;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        if (this.f7012a) {
            this.f7012a = false;
            this.f7013b = j3;
            return;
        }
        this.f7013b = this.f7014c.c(this.f7013b, j3);
    }

    @Override // j$.util.function.M
    public final Object get() {
        return this.f7012a ? C0374p.a() : C0374p.d(this.f7013b);
    }
}

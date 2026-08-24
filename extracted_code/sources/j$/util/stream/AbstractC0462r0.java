package j$.util.stream;

import j$.util.function.Consumer;
/* renamed from: j$.util.stream.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0462r0 implements InterfaceC0440m2 {

    /* renamed from: a  reason: collision with root package name */
    boolean f7238a;

    /* renamed from: b  reason: collision with root package name */
    boolean f7239b;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0462r0(EnumC0467s0 enumC0467s0) {
        boolean z3;
        z3 = enumC0467s0.f7248b;
        this.f7239b = !z3;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return this.f7238a;
    }
}

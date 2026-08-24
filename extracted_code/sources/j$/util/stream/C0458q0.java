package j$.util.stream;

import j$.util.function.C0355j;
/* renamed from: j$.util.stream.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0458q0 extends AbstractC0462r0 implements InterfaceC0425j2 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EnumC0467s0 f7231c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0355j f7232d;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        w((Double) obj);
    }

    @Override // j$.util.stream.InterfaceC0425j2
    public final /* synthetic */ void w(Double d3) {
        AbstractC0482v0.d(this, d3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0458q0(C0355j c0355j, EnumC0467s0 enumC0467s0) {
        super(enumC0467s0);
        this.f7231c = enumC0467s0;
        this.f7232d = c0355j;
    }

    @Override // j$.util.stream.AbstractC0462r0, j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        boolean z3;
        boolean z4;
        if (this.f7238a) {
            return;
        }
        boolean test = this.f7232d.f6846a.test(d3);
        EnumC0467s0 enumC0467s0 = this.f7231c;
        z3 = enumC0467s0.f7247a;
        if (test == z3) {
            this.f7238a = true;
            z4 = enumC0467s0.f7248b;
            this.f7239b = z4;
        }
    }
}

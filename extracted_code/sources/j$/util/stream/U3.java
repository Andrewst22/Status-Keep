package j$.util.stream;
/* loaded from: classes2.dex */
final class U3 extends AbstractC0405f2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f7044b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ V3 f7045c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U3(V3 v3, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7045c = v3;
        this.f7044b = true;
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7161a.s(-1L);
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        if (this.f7044b) {
            boolean test = this.f7045c.f7049m.f6846a.test(d3);
            this.f7044b = test;
            if (test) {
                this.f7161a.d(d3);
            }
        }
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return !this.f7044b || this.f7161a.v();
    }
}

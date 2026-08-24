package j$.util.stream;
/* loaded from: classes2.dex */
final class M3 extends AbstractC0410g2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f6980b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ N3 f6981c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(N3 n3, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f6981c = n3;
        this.f6980b = true;
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7169a.s(-1L);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        if (this.f6980b) {
            boolean test = this.f6981c.f6995m.f6852a.test(i3);
            this.f6980b = test;
            if (test) {
                this.f7169a.e(i3);
            }
        }
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return !this.f6980b || this.f7169a.v();
    }
}

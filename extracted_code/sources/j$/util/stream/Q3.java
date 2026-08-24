package j$.util.stream;
/* loaded from: classes2.dex */
final class Q3 extends AbstractC0415h2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f7021b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ R3 f7022c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(R3 r3, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7022c = r3;
        this.f7021b = true;
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7176a.s(-1L);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        if (this.f7021b) {
            boolean test = this.f7022c.f7024m.f6821a.test(j3);
            this.f7021b = test;
            if (test) {
                this.f7176a.f(j3);
            }
        }
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return !this.f7021b || this.f7176a.v();
    }
}

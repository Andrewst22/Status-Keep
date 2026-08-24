package j$.util.stream;
/* loaded from: classes2.dex */
final class W3 extends AbstractC0405f2 implements Z3 {

    /* renamed from: b  reason: collision with root package name */
    long f7056b;

    /* renamed from: c  reason: collision with root package name */
    boolean f7057c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f7058d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ X3 f7059e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(X3 x3, InterfaceC0440m2 interfaceC0440m2, boolean z3) {
        super(interfaceC0440m2);
        this.f7059e = x3;
        this.f7058d = z3;
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        boolean z3;
        boolean z4;
        if (!this.f7057c) {
            boolean test = this.f7059e.f7062m.f6846a.test(d3);
            this.f7057c = !test;
            if (test) {
                z3 = false;
                z4 = this.f7058d;
                if (z4 && !z3) {
                    this.f7056b++;
                }
                if (!z4 || z3) {
                    this.f7161a.d(d3);
                }
                return;
            }
        }
        z3 = true;
        z4 = this.f7058d;
        if (z4) {
            this.f7056b++;
        }
        if (z4) {
        }
        this.f7161a.d(d3);
    }

    @Override // j$.util.stream.Z3
    public final long k() {
        return this.f7056b;
    }
}

package j$.util.stream;
/* loaded from: classes2.dex */
final class S3 extends AbstractC0415h2 implements Z3 {

    /* renamed from: b  reason: collision with root package name */
    long f7027b;

    /* renamed from: c  reason: collision with root package name */
    boolean f7028c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f7029d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ T3 f7030e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(T3 t3, InterfaceC0440m2 interfaceC0440m2, boolean z3) {
        super(interfaceC0440m2);
        this.f7030e = t3;
        this.f7029d = z3;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        boolean z3;
        boolean z4;
        if (!this.f7028c) {
            boolean test = this.f7030e.f7036m.f6821a.test(j3);
            this.f7028c = !test;
            if (test) {
                z3 = false;
                z4 = this.f7029d;
                if (z4 && !z3) {
                    this.f7027b++;
                }
                if (!z4 || z3) {
                    this.f7176a.f(j3);
                }
                return;
            }
        }
        z3 = true;
        z4 = this.f7029d;
        if (z4) {
            this.f7027b++;
        }
        if (z4) {
        }
        this.f7176a.f(j3);
    }

    @Override // j$.util.stream.Z3
    public final long k() {
        return this.f7027b;
    }
}

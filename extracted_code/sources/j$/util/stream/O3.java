package j$.util.stream;
/* loaded from: classes2.dex */
final class O3 extends AbstractC0410g2 implements Z3 {

    /* renamed from: b  reason: collision with root package name */
    long f7001b;

    /* renamed from: c  reason: collision with root package name */
    boolean f7002c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f7003d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ P3 f7004e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(P3 p3, InterfaceC0440m2 interfaceC0440m2, boolean z3) {
        super(interfaceC0440m2);
        this.f7004e = p3;
        this.f7003d = z3;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        boolean z3;
        boolean z4;
        if (!this.f7002c) {
            boolean test = this.f7004e.f7015m.f6852a.test(i3);
            this.f7002c = !test;
            if (test) {
                z3 = false;
                z4 = this.f7003d;
                if (z4 && !z3) {
                    this.f7001b++;
                }
                if (!z4 || z3) {
                    this.f7169a.e(i3);
                }
                return;
            }
        }
        z3 = true;
        z4 = this.f7003d;
        if (z4) {
            this.f7001b++;
        }
        if (z4) {
        }
        this.f7169a.e(i3);
    }

    @Override // j$.util.stream.Z3
    public final long k() {
        return this.f7001b;
    }
}

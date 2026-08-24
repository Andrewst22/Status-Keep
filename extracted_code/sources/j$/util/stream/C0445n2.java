package j$.util.stream;
/* renamed from: j$.util.stream.n2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0445n2 extends AbstractC0420i2 {

    /* renamed from: b  reason: collision with root package name */
    long f7211b;

    /* renamed from: c  reason: collision with root package name */
    long f7212c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0450o2 f7213d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0445n2(C0450o2 c0450o2, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7213d = c0450o2;
        this.f7211b = c0450o2.f7220m;
        long j3 = c0450o2.f7221n;
        this.f7212c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7182a.s(AbstractC0482v0.A(j3, this.f7213d.f7220m, this.f7212c));
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        long j3 = this.f7211b;
        if (j3 == 0) {
            long j4 = this.f7212c;
            if (j4 > 0) {
                this.f7212c = j4 - 1;
                this.f7182a.accept(obj);
                return;
            }
            return;
        }
        this.f7211b = j3 - 1;
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return this.f7212c == 0 || this.f7182a.v();
    }
}

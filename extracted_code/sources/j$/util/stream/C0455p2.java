package j$.util.stream;
/* renamed from: j$.util.stream.p2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0455p2 extends AbstractC0410g2 {

    /* renamed from: b  reason: collision with root package name */
    long f7227b;

    /* renamed from: c  reason: collision with root package name */
    long f7228c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0460q2 f7229d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0455p2(C0460q2 c0460q2, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7229d = c0460q2;
        this.f7227b = c0460q2.f7234m;
        long j3 = c0460q2.f7235n;
        this.f7228c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7169a.s(AbstractC0482v0.A(j3, this.f7229d.f7234m, this.f7228c));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        long j3 = this.f7227b;
        if (j3 == 0) {
            long j4 = this.f7228c;
            if (j4 > 0) {
                this.f7228c = j4 - 1;
                this.f7169a.e(i3);
                return;
            }
            return;
        }
        this.f7227b = j3 - 1;
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return this.f7228c == 0 || this.f7169a.v();
    }
}

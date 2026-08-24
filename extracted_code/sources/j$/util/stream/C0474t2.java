package j$.util.stream;
/* renamed from: j$.util.stream.t2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0474t2 extends AbstractC0405f2 {

    /* renamed from: b  reason: collision with root package name */
    long f7262b;

    /* renamed from: c  reason: collision with root package name */
    long f7263c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0479u2 f7264d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0474t2(C0479u2 c0479u2, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7264d = c0479u2;
        this.f7262b = c0479u2.f7268m;
        long j3 = c0479u2.f7269n;
        this.f7263c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7161a.s(AbstractC0482v0.A(j3, this.f7264d.f7268m, this.f7263c));
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        long j3 = this.f7262b;
        if (j3 == 0) {
            long j4 = this.f7263c;
            if (j4 > 0) {
                this.f7263c = j4 - 1;
                this.f7161a.d(d3);
                return;
            }
            return;
        }
        this.f7262b = j3 - 1;
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return this.f7263c == 0 || this.f7161a.v();
    }
}

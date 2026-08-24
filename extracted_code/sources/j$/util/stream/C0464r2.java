package j$.util.stream;
/* renamed from: j$.util.stream.r2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0464r2 extends AbstractC0415h2 {

    /* renamed from: b  reason: collision with root package name */
    long f7241b;

    /* renamed from: c  reason: collision with root package name */
    long f7242c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0469s2 f7243d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0464r2(C0469s2 c0469s2, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7243d = c0469s2;
        this.f7241b = c0469s2.f7256m;
        long j3 = c0469s2.f7257n;
        this.f7242c = j3 < 0 ? Long.MAX_VALUE : j3;
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7176a.s(AbstractC0482v0.A(j3, this.f7243d.f7256m, this.f7242c));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        long j4 = this.f7241b;
        if (j4 == 0) {
            long j5 = this.f7242c;
            if (j5 > 0) {
                this.f7242c = j5 - 1;
                this.f7176a.f(j3);
                return;
            }
            return;
        }
        this.f7241b = j4 - 1;
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        return this.f7242c == 0 || this.f7176a.v();
    }
}

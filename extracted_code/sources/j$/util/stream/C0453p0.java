package j$.util.stream;
/* renamed from: j$.util.stream.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0453p0 extends AbstractC0462r0 implements InterfaceC0435l2 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EnumC0467s0 f7224c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j$.util.function.B f7225d;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0435l2
    public final /* synthetic */ void n(Long l3) {
        AbstractC0482v0.i(this, l3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0453p0(j$.util.function.B b3, EnumC0467s0 enumC0467s0) {
        super(enumC0467s0);
        this.f7224c = enumC0467s0;
        this.f7225d = b3;
    }

    @Override // j$.util.stream.AbstractC0462r0, j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        boolean z3;
        boolean z4;
        if (this.f7238a) {
            return;
        }
        boolean test = this.f7225d.f6821a.test(j3);
        EnumC0467s0 enumC0467s0 = this.f7224c;
        z3 = enumC0467s0.f7247a;
        if (test == z3) {
            this.f7238a = true;
            z4 = enumC0467s0.f7248b;
            this.f7239b = z4;
        }
    }
}

package j$.util.stream;
/* renamed from: j$.util.stream.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0448o0 extends AbstractC0462r0 implements InterfaceC0430k2 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EnumC0467s0 f7217c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j$.util.function.r f7218d;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        t((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0430k2
    public final /* synthetic */ void t(Integer num) {
        AbstractC0482v0.f(this, num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0448o0(j$.util.function.r rVar, EnumC0467s0 enumC0467s0) {
        super(enumC0467s0);
        this.f7217c = enumC0467s0;
        this.f7218d = rVar;
    }

    @Override // j$.util.stream.AbstractC0462r0, j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        boolean z3;
        boolean z4;
        if (this.f7238a) {
            return;
        }
        boolean test = this.f7218d.f6852a.test(i3);
        EnumC0467s0 enumC0467s0 = this.f7217c;
        z3 = enumC0467s0.f7247a;
        if (test == z3) {
            this.f7238a = true;
            z4 = enumC0467s0.f7248b;
            this.f7239b = z4;
        }
    }
}

package j$.util.stream;
/* renamed from: j$.util.stream.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0398e0 extends AbstractC0415h2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7154b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC0382b f7155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0398e0(AbstractC0382b abstractC0382b, InterfaceC0440m2 interfaceC0440m2, int i3) {
        super(interfaceC0440m2);
        this.f7154b = i3;
        this.f7155c = abstractC0382b;
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public void s(long j3) {
        switch (this.f7154b) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                this.f7176a.s(-1L);
                return;
            default:
                super.s(j3);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        switch (this.f7154b) {
            case 0:
                this.f7176a.accept(((j$.util.function.A) ((C0466s) this.f7155c).f7245n).o(j3));
                return;
            case 1:
                this.f7176a.f(((j$.util.function.E) ((C0481v) this.f7155c).f7276n).f6828a.applyAsLong(j3));
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7176a.e(((j$.util.function.D) ((C0476u) this.f7155c).f7266n).f6827a.applyAsInt(j3));
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f7176a.d(((j$.util.function.C) ((C0471t) this.f7155c).f7259n).f6824a.applyAsDouble(j3));
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                if (((j$.util.function.B) ((C0481v) this.f7155c).f7276n).f6821a.test(j3)) {
                    this.f7176a.f(j3);
                    return;
                }
                return;
            default:
                ((j$.util.function.x) ((C0481v) this.f7155c).f7276n).f(j3);
                this.f7176a.f(j3);
                return;
        }
    }
}

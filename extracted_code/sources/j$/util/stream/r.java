package j$.util.stream;

import j$.util.function.C0351f;
import j$.util.function.C0355j;
import j$.util.function.C0356k;
import j$.util.function.C0357l;
import j$.util.function.C0358m;
import j$.util.function.InterfaceC0354i;
/* loaded from: classes2.dex */
final class r extends AbstractC0405f2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7236b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC0382b f7237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AbstractC0382b abstractC0382b, InterfaceC0440m2 interfaceC0440m2, int i3) {
        super(interfaceC0440m2);
        this.f7236b = i3;
        this.f7237c = abstractC0382b;
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public void s(long j3) {
        switch (this.f7236b) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                this.f7161a.s(-1L);
                return;
            default:
                super.s(j3);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        switch (this.f7236b) {
            case 0:
                this.f7161a.accept(((InterfaceC0354i) ((C0466s) this.f7237c).f7245n).e(d3));
                return;
            case 1:
                this.f7161a.d(((C0358m) ((C0471t) this.f7237c).f7259n).f6849a.applyAsDouble(d3));
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7161a.e(((C0356k) ((C0476u) this.f7237c).f7266n).f6847a.applyAsInt(d3));
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f7161a.f(((C0357l) ((C0481v) this.f7237c).f7276n).f6848a.applyAsLong(d3));
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                if (((C0355j) ((C0471t) this.f7237c).f7259n).f6846a.test(d3)) {
                    this.f7161a.d(d3);
                    return;
                }
                return;
            default:
                ((C0351f) ((C0471t) this.f7237c).f7259n).d(d3);
                this.f7161a.d(d3);
                return;
        }
    }
}

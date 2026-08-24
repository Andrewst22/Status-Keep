package j$.util.stream;

import j$.util.function.C0361p;
import j$.util.function.C0363s;
import j$.util.function.C0364t;
import j$.util.function.IntFunction;
/* loaded from: classes2.dex */
final class T extends AbstractC0410g2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7032b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC0382b f7033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(AbstractC0382b abstractC0382b, InterfaceC0440m2 interfaceC0440m2, int i3) {
        super(interfaceC0440m2);
        this.f7032b = i3;
        this.f7033c = abstractC0382b;
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public void s(long j3) {
        switch (this.f7032b) {
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                this.f7169a.s(-1L);
                return;
            default:
                super.s(j3);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        switch (this.f7032b) {
            case 0:
                this.f7169a.accept(((IntFunction) ((C0466s) this.f7033c).f7245n).j(i3));
                return;
            case 1:
                ((C0361p) ((C0476u) this.f7033c).f7266n).e(i3);
                this.f7169a.e(i3);
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7169a.e(((j$.util.function.u) ((C0476u) this.f7033c).f7266n).f6855a.applyAsInt(i3));
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f7169a.f(((C0364t) ((C0481v) this.f7033c).f7276n).f6854a.applyAsLong(i3));
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                this.f7169a.d(((C0363s) ((C0471t) this.f7033c).f7259n).f6853a.applyAsDouble(i3));
                return;
            default:
                if (((j$.util.function.r) ((C0476u) this.f7033c).f7266n).f6852a.test(i3)) {
                    this.f7169a.e(i3);
                    return;
                }
                return;
        }
    }
}

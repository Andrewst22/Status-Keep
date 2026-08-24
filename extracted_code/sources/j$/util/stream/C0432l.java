package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import java.util.HashSet;
/* renamed from: j$.util.stream.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0432l extends AbstractC0420i2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7199b;

    /* renamed from: c  reason: collision with root package name */
    Object f7200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0432l(AbstractC0382b abstractC0382b, InterfaceC0440m2 interfaceC0440m2, int i3) {
        super(interfaceC0440m2);
        this.f7199b = i3;
        this.f7200c = abstractC0382b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0432l(InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7199b = 0;
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public void r() {
        switch (this.f7199b) {
            case 0:
                this.f7200c = null;
                this.f7182a.r();
                return;
            default:
                super.r();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public void s(long j3) {
        switch (this.f7199b) {
            case 0:
                this.f7200c = new HashSet();
                this.f7182a.s(-1L);
                return;
            case 1:
            default:
                super.s(j3);
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f7182a.s(-1L);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7199b) {
            case 0:
                if (((HashSet) this.f7200c).contains(obj)) {
                    return;
                }
                ((HashSet) this.f7200c).add(obj);
                this.f7182a.accept(obj);
                return;
            case 1:
                ((Consumer) ((C0466s) this.f7200c).f7245n).accept(obj);
                this.f7182a.accept(obj);
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (((Predicate) ((C0466s) this.f7200c).f7245n).g(obj)) {
                    this.f7182a.accept(obj);
                    return;
                }
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f7182a.accept(((C0385b2) this.f7200c).f7113n.a(obj));
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                this.f7182a.e(((j$.util.function.Q) ((C0476u) this.f7200c).f7266n).p(obj));
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                this.f7182a.f(((j$.util.function.T) ((C0481v) this.f7200c).f7276n).q(obj));
                return;
            default:
                this.f7182a.d(((j$.util.function.O) ((C0471t) this.f7200c).f7259n).d(obj));
                return;
        }
    }
}

package j$.util.stream;

import j$.util.function.C0351f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0471t extends AbstractC0501z {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7258m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Object f7259n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0471t(AbstractC0382b abstractC0382b, int i3, Object obj, int i4) {
        super(abstractC0382b, i3, 1);
        this.f7258m = i4;
        this.f7259n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0471t(AbstractC0382b abstractC0382b, C0351f c0351f) {
        super(abstractC0382b, 0, 1);
        this.f7258m = 3;
        this.f7259n = c0351f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        switch (this.f7258m) {
            case 0:
                return new r(this, interfaceC0440m2, 1);
            case 1:
                return new C0486w(this, interfaceC0440m2);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new r(this, interfaceC0440m2, 4);
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new r(this, interfaceC0440m2, 5);
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return new T(this, interfaceC0440m2, 4);
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return new C0398e0(this, interfaceC0440m2, 3);
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0432l(this, interfaceC0440m2, 6);
            default:
                return new Z1(this, interfaceC0440m2);
        }
    }
}

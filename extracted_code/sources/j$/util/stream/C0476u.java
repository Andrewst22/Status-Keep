package j$.util.stream;

import j$.util.function.C0361p;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0476u extends Z {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7265m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Object f7266n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0476u(AbstractC0382b abstractC0382b, int i3, Object obj, int i4) {
        super(abstractC0382b, i3, 1);
        this.f7265m = i4;
        this.f7266n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        switch (this.f7265m) {
            case 0:
                return new r(this, interfaceC0440m2, 2);
            case 1:
                return new T(this, interfaceC0440m2, 1);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new T(this, interfaceC0440m2, 2);
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new W(this, interfaceC0440m2);
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return new T(this, interfaceC0440m2, 5);
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return new C0398e0(this, interfaceC0440m2, 2);
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0432l(this, interfaceC0440m2, 4);
            default:
                return new Z1(this, interfaceC0440m2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0476u(AbstractC0382b abstractC0382b, C0361p c0361p) {
        super(abstractC0382b, 0, 1);
        this.f7265m = 1;
        this.f7266n = c0361p;
    }
}

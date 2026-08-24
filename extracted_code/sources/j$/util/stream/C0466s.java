package j$.util.stream;

import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0466s extends AbstractC0395d2 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7244m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Object f7245n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0466s(AbstractC0382b abstractC0382b, int i3, Object obj, int i4) {
        super(abstractC0382b, i3, 1);
        this.f7244m = i4;
        this.f7245n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        switch (this.f7244m) {
            case 0:
                return new r(this, interfaceC0440m2, 0);
            case 1:
                return new T(this, interfaceC0440m2, 0);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0398e0(this, interfaceC0440m2, 0);
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0432l(this, interfaceC0440m2, 1);
            default:
                return new C0432l(this, interfaceC0440m2, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0466s(AbstractC0400e2 abstractC0400e2, Consumer consumer) {
        super(abstractC0400e2, 0, 1);
        this.f7244m = 3;
        this.f7245n = consumer;
    }
}

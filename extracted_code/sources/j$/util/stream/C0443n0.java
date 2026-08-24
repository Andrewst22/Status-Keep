package j$.util.stream;

import j$.util.function.Predicate;
/* renamed from: j$.util.stream.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0443n0 extends AbstractC0462r0 {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EnumC0467s0 f7209c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Predicate f7210d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0443n0(Predicate predicate, EnumC0467s0 enumC0467s0) {
        super(enumC0467s0);
        this.f7209c = enumC0467s0;
        this.f7210d = predicate;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z3;
        boolean z4;
        if (this.f7238a) {
            return;
        }
        boolean g3 = this.f7210d.g(obj);
        EnumC0467s0 enumC0467s0 = this.f7209c;
        z3 = enumC0467s0.f7247a;
        if (g3 == z3) {
            this.f7238a = true;
            z4 = enumC0467s0.f7248b;
            this.f7239b = z4;
        }
    }
}

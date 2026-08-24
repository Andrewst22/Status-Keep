package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0347b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class A1 extends AbstractC0482v0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f6881h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f6882i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Object f6883j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Object f6884k;

    public /* synthetic */ A1(EnumC0381a3 enumC0381a3, Object obj, Object obj2, Object obj3, int i3) {
        this.f6881h = i3;
        this.f6883j = obj;
        this.f6884k = obj2;
        this.f6882i = obj3;
    }

    @Override // j$.util.stream.AbstractC0482v0
    public final Q1 d0() {
        switch (this.f6881h) {
            case 0:
                return new C0493x1((j$.util.function.M) this.f6882i, (j$.util.function.K) this.f6884k, (C0452p) this.f6883j);
            case 1:
                return new D1((j$.util.function.M) this.f6882i, (j$.util.function.G) this.f6884k, (C0452p) this.f6883j);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new F1(this.f6882i, (BiFunction) this.f6884k, (C0347b) this.f6883j);
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new J1((j$.util.function.M) this.f6882i, (BiConsumer) this.f6884k, (BiConsumer) this.f6883j);
            default:
                return new N1((j$.util.function.M) this.f6882i, (j$.util.function.I) this.f6884k, (C0452p) this.f6883j);
        }
    }
}

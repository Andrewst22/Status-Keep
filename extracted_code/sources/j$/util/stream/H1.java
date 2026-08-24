package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.C0347b;
/* loaded from: classes2.dex */
final class H1 extends AbstractC0482v0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ C0347b f6930h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ BiConsumer f6931i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ j$.util.function.L f6932j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ C0417i f6933k;

    @Override // j$.util.stream.AbstractC0482v0
    public final Q1 d0() {
        return new I1(this.f6932j, this.f6931i, this.f6930h);
    }

    @Override // j$.util.stream.AbstractC0482v0, j$.util.stream.F3
    public final int g() {
        if (this.f6933k.f7180a.characteristics().contains(EnumC0412h.UNORDERED)) {
            return Z2.f7082r;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public H1(EnumC0381a3 enumC0381a3, C0347b c0347b, BiConsumer biConsumer, j$.util.function.L l3, C0417i c0417i) {
        this.f6930h = c0347b;
        this.f6931i = biConsumer;
        this.f6932j = l3;
        this.f6933k = c0417i;
    }
}

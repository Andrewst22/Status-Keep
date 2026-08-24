package j$.util.stream;

import j$.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0472t0 implements F3 {

    /* renamed from: a  reason: collision with root package name */
    final EnumC0467s0 f7260a;

    /* renamed from: b  reason: collision with root package name */
    final j$.util.function.M f7261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0472t0(EnumC0381a3 enumC0381a3, EnumC0467s0 enumC0467s0, j$.util.function.M m3) {
        this.f7260a = enumC0467s0;
        this.f7261b = m3;
    }

    @Override // j$.util.stream.F3
    public final int g() {
        return Z2.f7085u | Z2.f7082r;
    }

    @Override // j$.util.stream.F3
    public final Object b(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        AbstractC0462r0 abstractC0462r0 = (AbstractC0462r0) this.f7261b.get();
        abstractC0382b.Z(spliterator, abstractC0462r0);
        return Boolean.valueOf(abstractC0462r0.f7239b);
    }

    @Override // j$.util.stream.F3
    public final Object c(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        return (Boolean) new C0477u0(this, abstractC0382b, spliterator).invoke();
    }
}

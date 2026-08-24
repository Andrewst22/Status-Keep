package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Predicate;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class D implements F3 {

    /* renamed from: a  reason: collision with root package name */
    final int f6903a;

    /* renamed from: b  reason: collision with root package name */
    final Object f6904b;

    /* renamed from: c  reason: collision with root package name */
    final Predicate f6905c;

    /* renamed from: d  reason: collision with root package name */
    final j$.util.function.M f6906d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(boolean z3, EnumC0381a3 enumC0381a3, Object obj, Predicate predicate, j$.util.function.M m3) {
        this.f6903a = (z3 ? 0 : Z2.f7082r) | Z2.f7085u;
        this.f6904b = obj;
        this.f6905c = predicate;
        this.f6906d = m3;
    }

    @Override // j$.util.stream.F3
    public final int g() {
        return this.f6903a;
    }

    @Override // j$.util.stream.F3
    public final Object b(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        G3 g3 = (G3) this.f6906d.get();
        abstractC0382b.Z(spliterator, g3);
        Object obj = g3.get();
        return obj != null ? obj : this.f6904b;
    }

    @Override // j$.util.stream.F3
    public final Object c(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        return new J(this, Z2.ORDERED.r(abstractC0382b.O()), abstractC0382b, spliterator).invoke();
    }
}

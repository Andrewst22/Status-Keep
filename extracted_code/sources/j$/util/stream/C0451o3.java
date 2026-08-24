package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.o3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0451o3 extends AbstractC0386b3 implements j$.util.F {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.n(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0386b3
    final AbstractC0386b3 h(Spliterator spliterator) {
        return new AbstractC0386b3(this.f7115b, spliterator, this.f7114a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.y, j$.util.stream.V2, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC0386b3
    final void f() {
        ?? v22 = new V2();
        this.f7121h = v22;
        this.f7118e = this.f7115b.a0(new C0446n3(v22, 0));
        this.f7119f = new C0377a(5, this);
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final j$.util.F trySplit() {
        return (j$.util.F) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final j$.util.H trySplit() {
        return (j$.util.F) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.F) super.trySplit();
    }

    @Override // j$.util.H
    /* renamed from: j */
    public final boolean tryAdvance(j$.util.function.y yVar) {
        long j3;
        Objects.requireNonNull(yVar);
        boolean a3 = a();
        if (a3) {
            T2 t22 = (T2) this.f7121h;
            long j4 = this.f7120g;
            int z3 = t22.z(j4);
            if (t22.f7139c == 0 && z3 == 0) {
                j3 = ((long[]) t22.f7047e)[(int) j4];
            } else {
                j3 = ((long[][]) t22.f7048f)[z3][(int) (j4 - t22.f7140d[z3])];
            }
            yVar.f(j3);
        }
        return a3;
    }

    @Override // j$.util.H
    /* renamed from: i */
    public final void forEachRemaining(j$.util.function.y yVar) {
        if (this.f7121h == null && !this.f7122i) {
            Objects.requireNonNull(yVar);
            e();
            C0446n3 c0446n3 = new C0446n3(yVar, 1);
            this.f7115b.Z(this.f7117d, c0446n3);
            this.f7122i = true;
            return;
        }
        do {
        } while (tryAdvance(yVar));
    }
}

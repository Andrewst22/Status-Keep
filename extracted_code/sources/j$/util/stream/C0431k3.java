package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
import java.util.Objects;
/* renamed from: j$.util.stream.k3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0431k3 extends AbstractC0386b3 implements j$.util.B {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.k(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0386b3
    final AbstractC0386b3 h(Spliterator spliterator) {
        return new AbstractC0386b3(this.f7115b, spliterator, this.f7114a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.g, j$.util.stream.V2, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC0386b3
    final void f() {
        ?? v22 = new V2();
        this.f7121h = v22;
        this.f7118e = this.f7115b.a0(new C0426j3(v22, 0));
        this.f7119f = new C0377a(3, this);
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final j$.util.B trySplit() {
        return (j$.util.B) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final j$.util.H trySplit() {
        return (j$.util.B) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.B) super.trySplit();
    }

    @Override // j$.util.H
    /* renamed from: m */
    public final boolean tryAdvance(InterfaceC0352g interfaceC0352g) {
        double d3;
        Objects.requireNonNull(interfaceC0352g);
        boolean a3 = a();
        if (a3) {
            P2 p22 = (P2) this.f7121h;
            long j3 = this.f7120g;
            int z3 = p22.z(j3);
            if (p22.f7139c == 0 && z3 == 0) {
                d3 = ((double[]) p22.f7047e)[(int) j3];
            } else {
                d3 = ((double[][]) p22.f7048f)[z3][(int) (j3 - p22.f7140d[z3])];
            }
            interfaceC0352g.d(d3);
        }
        return a3;
    }

    @Override // j$.util.H
    /* renamed from: o */
    public final void forEachRemaining(InterfaceC0352g interfaceC0352g) {
        if (this.f7121h == null && !this.f7122i) {
            Objects.requireNonNull(interfaceC0352g);
            e();
            C0426j3 c0426j3 = new C0426j3(interfaceC0352g, 1);
            this.f7115b.Z(this.f7117d, c0426j3);
            this.f7122i = true;
            return;
        }
        do {
        } while (tryAdvance(interfaceC0352g));
    }
}

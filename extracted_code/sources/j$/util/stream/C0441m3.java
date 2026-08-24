package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
import java.util.Objects;
/* renamed from: j$.util.stream.m3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0441m3 extends AbstractC0386b3 implements j$.util.D {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.d(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.l(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0386b3
    final AbstractC0386b3 h(Spliterator spliterator) {
        return new AbstractC0386b3(this.f7115b, spliterator, this.f7114a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.q, j$.util.stream.V2, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC0386b3
    final void f() {
        ?? v22 = new V2();
        this.f7121h = v22;
        this.f7118e = this.f7115b.a0(new C0436l3(v22, 0));
        this.f7119f = new C0377a(4, this);
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final j$.util.D trySplit() {
        return (j$.util.D) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final j$.util.H trySplit() {
        return (j$.util.D) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC0386b3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.D) super.trySplit();
    }

    @Override // j$.util.H
    /* renamed from: c */
    public final boolean tryAdvance(InterfaceC0362q interfaceC0362q) {
        int i3;
        Objects.requireNonNull(interfaceC0362q);
        boolean a3 = a();
        if (a3) {
            R2 r22 = (R2) this.f7121h;
            long j3 = this.f7120g;
            int z3 = r22.z(j3);
            if (r22.f7139c == 0 && z3 == 0) {
                i3 = ((int[]) r22.f7047e)[(int) j3];
            } else {
                i3 = ((int[][]) r22.f7048f)[z3][(int) (j3 - r22.f7140d[z3])];
            }
            interfaceC0362q.e(i3);
        }
        return a3;
    }

    @Override // j$.util.H
    /* renamed from: g */
    public final void forEachRemaining(InterfaceC0362q interfaceC0362q) {
        if (this.f7121h == null && !this.f7122i) {
            Objects.requireNonNull(interfaceC0362q);
            e();
            C0436l3 c0436l3 = new C0436l3(interfaceC0362q, 1);
            this.f7115b.Z(this.f7117d, c0436l3);
            this.f7122i = true;
            return;
        }
        do {
        } while (tryAdvance(interfaceC0362q));
    }
}

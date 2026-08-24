package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: j$.util.stream.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0423j0 extends AbstractC0382b implements InterfaceC0433l0 {
    public void a(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        H(new M(xVar, true));
    }

    public void e(j$.util.function.y yVar) {
        Objects.requireNonNull(yVar);
        H(new M(yVar, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.F d0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.F) {
            return (j$.util.F) spliterator;
        }
        if (I3.f6943a) {
            I3.a(AbstractC0382b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final EnumC0381a3 M() {
        return EnumC0381a3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC0382b
    final H0 J(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3, IntFunction intFunction) {
        return AbstractC0482v0.H(abstractC0382b, spliterator, z3);
    }

    @Override // j$.util.stream.AbstractC0382b
    final Spliterator Y(AbstractC0382b abstractC0382b, j$.util.function.M m3, boolean z3) {
        return new AbstractC0386b3(abstractC0382b, m3, z3);
    }

    @Override // j$.util.stream.AbstractC0382b
    final boolean L(Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2) {
        j$.util.function.y c0393d0;
        boolean v3;
        j$.util.F d02 = d0(spliterator);
        if (interfaceC0440m2 instanceof j$.util.function.y) {
            c0393d0 = (j$.util.function.y) interfaceC0440m2;
        } else if (I3.f6943a) {
            I3.a(AbstractC0382b.class, "using LongStream.adapt(Sink<Long> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC0440m2);
            c0393d0 = new C0393d0(interfaceC0440m2);
        }
        do {
            v3 = interfaceC0440m2.v();
            if (v3) {
                break;
            }
        } while (d02.j(c0393d0));
        return v3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0502z0 R(long j3, IntFunction intFunction) {
        return AbstractC0482v0.T(j3);
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final Iterator iterator() {
        return j$.util.W.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    /* renamed from: g0 */
    public final j$.util.F spliterator() {
        return d0(super.spliterator());
    }

    public final Stream e0() {
        return new C0466s(this, 0, new C0457q(22), 2);
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final InterfaceC0407g unordered() {
        return !P() ? this : new V(this, Z2.f7082r, 1);
    }

    public final Object f0(j$.util.function.M m3, j$.util.function.K k3, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0452p c0452p = new C0452p(biConsumer, 2);
        Objects.requireNonNull(m3);
        Objects.requireNonNull(k3);
        return H(new A1(EnumC0381a3.LONG_VALUE, c0452p, k3, m3, 0));
    }
}

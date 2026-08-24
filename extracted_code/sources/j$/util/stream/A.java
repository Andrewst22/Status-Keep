package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C0351f;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0352g;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
abstract class A extends AbstractC0382b implements C {
    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.B d0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.B) {
            return (j$.util.B) spliterator;
        }
        if (I3.f6943a) {
            I3.a(AbstractC0382b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.C
    public void g(InterfaceC0352g interfaceC0352g) {
        Objects.requireNonNull(interfaceC0352g);
        H(new K(interfaceC0352g, false));
    }

    @Override // j$.util.stream.C
    public void q(C0351f c0351f) {
        Objects.requireNonNull(c0351f);
        H(new K(c0351f, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final EnumC0381a3 M() {
        return EnumC0381a3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC0382b
    final H0 J(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3, IntFunction intFunction) {
        return AbstractC0482v0.F(abstractC0382b, spliterator, z3);
    }

    @Override // j$.util.stream.AbstractC0382b
    final Spliterator Y(AbstractC0382b abstractC0382b, j$.util.function.M m3, boolean z3) {
        return new AbstractC0386b3(abstractC0382b, m3, z3);
    }

    @Override // j$.util.stream.AbstractC0382b
    final boolean L(Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2) {
        InterfaceC0352g c0442n;
        boolean v3;
        j$.util.B d02 = d0(spliterator);
        if (interfaceC0440m2 instanceof InterfaceC0352g) {
            c0442n = (InterfaceC0352g) interfaceC0440m2;
        } else if (I3.f6943a) {
            I3.a(AbstractC0382b.class, "using DoubleStream.adapt(Sink<Double> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC0440m2);
            c0442n = new C0442n(interfaceC0440m2);
        }
        do {
            v3 = interfaceC0440m2.v();
            if (v3) {
                break;
            }
        } while (d02.m(c0442n));
        return v3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0502z0 R(long j3, IntFunction intFunction) {
        return AbstractC0482v0.J(j3);
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final Iterator iterator() {
        return j$.util.W.f(spliterator());
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    /* renamed from: g0 */
    public final j$.util.B spliterator() {
        return d0(super.spliterator());
    }

    public final Stream e0() {
        return new C0466s(this, 0, new C0447o(26), 0);
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final InterfaceC0407g unordered() {
        return !P() ? this : new C0491x(this, Z2.f7082r, 0);
    }

    public final Object f0(j$.util.function.M m3, j$.util.function.G g3, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0452p c0452p = new C0452p(biConsumer, 0);
        Objects.requireNonNull(m3);
        Objects.requireNonNull(g3);
        return H(new A1(EnumC0381a3.DOUBLE_VALUE, c0452p, g3, m3, 1));
    }
}

package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C0361p;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0362q;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: j$.util.stream.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0378a0 extends AbstractC0382b implements InterfaceC0388c0 {
    public void C(C0361p c0361p) {
        Objects.requireNonNull(c0361p);
        H(new L(c0361p, true));
    }

    public void w(InterfaceC0362q interfaceC0362q) {
        Objects.requireNonNull(interfaceC0362q);
        H(new L(interfaceC0362q, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.D d0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.D) {
            return (j$.util.D) spliterator;
        }
        if (I3.f6943a) {
            I3.a(AbstractC0382b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final EnumC0381a3 M() {
        return EnumC0381a3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC0382b
    final H0 J(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3, IntFunction intFunction) {
        return AbstractC0482v0.G(abstractC0382b, spliterator, z3);
    }

    @Override // j$.util.stream.AbstractC0382b
    final Spliterator Y(AbstractC0382b abstractC0382b, j$.util.function.M m3, boolean z3) {
        return new AbstractC0386b3(abstractC0382b, m3, z3);
    }

    @Override // j$.util.stream.AbstractC0382b
    final boolean L(Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2) {
        InterfaceC0362q s3;
        boolean v3;
        j$.util.D d02 = d0(spliterator);
        if (interfaceC0440m2 instanceof InterfaceC0362q) {
            s3 = (InterfaceC0362q) interfaceC0440m2;
        } else if (I3.f6943a) {
            I3.a(AbstractC0382b.class, "using IntStream.adapt(Sink<Integer> s)");
            throw null;
        } else {
            Objects.requireNonNull(interfaceC0440m2);
            s3 = new S(interfaceC0440m2);
        }
        do {
            v3 = interfaceC0440m2.v();
            if (v3) {
                break;
            }
        } while (d02.c(s3));
        return v3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0502z0 R(long j3, IntFunction intFunction) {
        return AbstractC0482v0.R(j3);
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final Iterator iterator() {
        return j$.util.W.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    /* renamed from: g0 */
    public final j$.util.D spliterator() {
        return d0(super.spliterator());
    }

    public final Stream e0() {
        return new C0466s(this, 0, new C0457q(8), 1);
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final InterfaceC0407g unordered() {
        return !P() ? this : new Z(this, Z2.f7082r, 1);
    }

    public final Object f0(j$.util.function.M m3, j$.util.function.I i3, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C0452p c0452p = new C0452p(biConsumer, 1);
        Objects.requireNonNull(m3);
        Objects.requireNonNull(i3);
        return H(new A1(EnumC0381a3.INT_VALUE, c0452p, i3, m3, 4));
    }
}

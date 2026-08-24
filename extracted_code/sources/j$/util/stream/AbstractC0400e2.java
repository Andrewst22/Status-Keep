package j$.util.stream;

import j$.util.C0371m;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0346a;
import j$.util.function.C0347b;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0348c;
import j$.util.function.Predicate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0400e2 extends AbstractC0382b implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new H2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new AbstractC0395d2(this, Z2.f7077m | Z2.f7084t, 0);
    }

    @Override // j$.util.stream.Stream
    public final C0371m min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return o(new C0346a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final C0371m findAny() {
        return (C0371m) H(H.f6929d);
    }

    @Override // j$.util.stream.Stream
    public final C0371m findFirst() {
        return (C0371m) H(H.f6928c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new H2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object i(Object obj, C0347b c0347b) {
        Objects.requireNonNull(c0347b);
        Objects.requireNonNull(c0347b);
        return H(new A1(EnumC0381a3.REFERENCE, c0347b, c0347b, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object t(Object obj, BiFunction biFunction, C0347b c0347b) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(c0347b);
        return H(new A1(EnumC0381a3.REFERENCE, c0347b, biFunction, obj, 2));
    }

    public void b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        H(new N(consumer, false));
    }

    public void f(Consumer consumer) {
        Objects.requireNonNull(consumer);
        H(new N(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final C0371m max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return o(new C0346a(comparator, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final EnumC0381a3 M() {
        return EnumC0381a3.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final C0371m o(InterfaceC0348c interfaceC0348c) {
        Objects.requireNonNull(interfaceC0348c);
        return (C0371m) H(new C0498y1(EnumC0381a3.REFERENCE, interfaceC0348c, 2));
    }

    @Override // j$.util.stream.AbstractC0382b
    final H0 J(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3, IntFunction intFunction) {
        return AbstractC0482v0.E(abstractC0382b, spliterator, z3, intFunction);
    }

    @Override // j$.util.stream.AbstractC0382b
    final Spliterator Y(AbstractC0382b abstractC0382b, j$.util.function.M m3, boolean z3) {
        return new AbstractC0386b3(abstractC0382b, m3, z3);
    }

    @Override // j$.util.stream.AbstractC0382b
    final boolean L(Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2) {
        boolean v3;
        do {
            v3 = interfaceC0440m2.v();
            if (v3) {
                break;
            }
        } while (spliterator.p(interfaceC0440m2));
        return v3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0502z0 R(long j3, IntFunction intFunction) {
        return AbstractC0482v0.D(j3, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final Iterator iterator() {
        return j$.util.W.i(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final InterfaceC0407g unordered() {
        return !P() ? this : new AbstractC0395d2(this, Z2.f7082r, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream v(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C0466s(this, Z2.f7084t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream k(Function function) {
        Objects.requireNonNull(function);
        return new C0385b2(this, Z2.f7080p | Z2.f7078n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0388c0 j(j$.util.function.Q q3) {
        Objects.requireNonNull(q3);
        return new C0476u(this, Z2.f7080p | Z2.f7078n, q3, 6);
    }

    @Override // j$.util.stream.Stream
    public final Object r(j$.util.function.L l3, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(l3);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return H(new A1(EnumC0381a3.REFERENCE, biConsumer2, biConsumer, l3, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0433l0 B(j$.util.function.T t3) {
        Objects.requireNonNull(t3);
        return new C0481v(this, Z2.f7080p | Z2.f7078n, t3, 7);
    }

    @Override // j$.util.stream.Stream
    public final C D(j$.util.function.O o3) {
        Objects.requireNonNull(o3);
        return new C0471t(this, Z2.f7080p | Z2.f7078n, o3, 6);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) H(new C1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream m(Function function) {
        Objects.requireNonNull(function);
        return new C0385b2(this, Z2.f7080p | Z2.f7078n | Z2.f7084t, function, 1);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0388c0 d(Function function) {
        Objects.requireNonNull(function);
        return new C0476u(this, Z2.f7080p | Z2.f7078n | Z2.f7084t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final C s(Function function) {
        Objects.requireNonNull(function);
        return new C0471t(this, Z2.f7080p | Z2.f7078n | Z2.f7084t, function, 7);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0433l0 z(Function function) {
        Objects.requireNonNull(function);
        return new C0481v(this, Z2.f7080p | Z2.f7078n | Z2.f7084t, function, 6);
    }

    @Override // j$.util.stream.Stream
    public final Stream x(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0466s(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(Long.toString(j3));
        }
        return AbstractC0482v0.c0(this, 0L, j3);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j3) {
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i3 >= 0) {
            return i3 == 0 ? this : AbstractC0482v0.c0(this, j3, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j3));
    }

    @Override // j$.util.stream.Stream
    public final Stream u(Predicate predicate) {
        int i3 = h4.f7178a;
        Objects.requireNonNull(predicate);
        return new J3(this, h4.f7178a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream p(Predicate predicate) {
        int i3 = h4.f7178a;
        Objects.requireNonNull(predicate);
        return new L3(this, h4.f7179b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] h(IntFunction intFunction) {
        return AbstractC0482v0.N(I(intFunction), intFunction).p(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return h(new Y1(0));
    }

    @Override // j$.util.stream.Stream
    public final boolean c(Predicate predicate) {
        return ((Boolean) H(AbstractC0482v0.b0(predicate, EnumC0467s0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean y(Predicate predicate) {
        return ((Boolean) H(AbstractC0482v0.b0(predicate, EnumC0467s0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean A(Predicate predicate) {
        return ((Boolean) H(AbstractC0482v0.b0(predicate, EnumC0467s0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object l(C0417i c0417i) {
        Object H3;
        if (isParallel() && c0417i.f7180a.characteristics().contains(EnumC0412h.CONCURRENT) && (!P() || c0417i.f7180a.characteristics().contains(EnumC0412h.UNORDERED))) {
            H3 = j$.util.function.L.a(c0417i.f7180a.supplier()).f6834a.get();
            b(new C0438m0(6, BiConsumer.VivifiedWrapper.convert(c0417i.f7180a.accumulator()), H3));
        } else {
            Objects.requireNonNull(c0417i);
            j$.util.function.L a3 = j$.util.function.L.a(c0417i.f7180a.supplier());
            H3 = H(new H1(EnumC0381a3.REFERENCE, C0347b.a(c0417i.f7180a.combiner()), BiConsumer.VivifiedWrapper.convert(c0417i.f7180a.accumulator()), a3, c0417i));
        }
        return c0417i.f7180a.characteristics().contains(EnumC0412h.IDENTITY_FINISH) ? H3 : Function.VivifiedWrapper.convert(c0417i.f7180a.finisher()).a(H3);
    }
}

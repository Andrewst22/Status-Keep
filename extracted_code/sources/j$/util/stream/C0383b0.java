package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.C0368j;
import j$.util.C0372n;
import j$.util.C0373o;
import j$.util.C0507u;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C0359n;
import j$.util.function.C0361p;
import j$.util.function.C0363s;
import j$.util.function.C0364t;
import j$.util.function.IntFunction;
import j$.util.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.b0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0383b0 implements IntStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0388c0 f7111a;

    private /* synthetic */ C0383b0(InterfaceC0388c0 interfaceC0388c0) {
        this.f7111a = interfaceC0388c0;
    }

    public static /* synthetic */ C0383b0 n(InterfaceC0388c0 interfaceC0388c0) {
        if (interfaceC0388c0 == null) {
            return null;
        }
        return new C0383b0(interfaceC0388c0);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return Stream.Wrapper.convert(((AbstractC0378a0) this.f7111a).e0());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((AbstractC0382b) this.f7111a).close();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return ((AbstractC0378a0) this.f7111a).f0(j$.util.function.L.a(supplier), j$.util.function.H.a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        if (obj instanceof C0383b0) {
            obj = ((C0383b0) obj).f7111a;
        }
        return interfaceC0388c0.equals(obj);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.f7111a.w(C0361p.b(intConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.f7111a.C(C0361p.b(intConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f7111a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return ((AbstractC0382b) this.f7111a).isParallel();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ IntStream onClose(Runnable runnable) {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f7111a;
        abstractC0382b.onClose(runnable);
        return C0402f.n(abstractC0382b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ IntStream parallel() {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f7111a;
        abstractC0382b.parallel();
        return C0402f.n(abstractC0382b);
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public final /* synthetic */ IntStream parallel2() {
        return n(this.f7111a.parallel());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ IntStream sequential() {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f7111a;
        abstractC0382b.sequential();
        return C0402f.n(abstractC0382b);
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public final /* synthetic */ IntStream sequential2() {
        return n(this.f7111a.sequential());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Integer> spliterator() {
        return j$.util.C.a(((AbstractC0378a0) this.f7111a).spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.IntStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ IntStream unordered() {
        return C0402f.n(((AbstractC0378a0) this.f7111a).unordered());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator<Integer> spliterator2() {
        return Spliterator.Wrapper.convert(((AbstractC0378a0) this.f7111a).spliterator());
    }

    @Override // java.util.stream.IntStream
    public final OptionalInt findAny() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        abstractC0378a0.getClass();
        return AbstractC0340b.s((C0373o) abstractC0378a0.H(F.f6919d));
    }

    @Override // java.util.stream.IntStream
    public final OptionalInt findFirst() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        abstractC0378a0.getClass();
        return AbstractC0340b.s((C0373o) abstractC0378a0.H(F.f6918c));
    }

    @Override // java.util.stream.IntStream
    public final IntStream sorted() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        abstractC0378a0.getClass();
        return n(new Z(abstractC0378a0, Z2.f7081q | Z2.f7079o, 0));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final Iterator<Integer> iterator() {
        return j$.util.W.g(((AbstractC0378a0) this.f7111a).spliterator());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final Iterator<Integer> iterator2() {
        return C0507u.a(j$.util.W.g(((AbstractC0378a0) this.f7111a).spliterator()));
    }

    @Override // java.util.stream.IntStream
    public final LongStream asLongStream() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        abstractC0378a0.getClass();
        return C0428k0.n(new V(abstractC0378a0, 0, 0));
    }

    @Override // java.util.stream.IntStream
    public final DoubleStream asDoubleStream() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        abstractC0378a0.getClass();
        return B.n(new C0491x(abstractC0378a0, 0, 1));
    }

    @Override // java.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.u a3 = j$.util.function.u.a(intUnaryOperator);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(a3);
        return n(new C0476u(abstractC0378a0, Z2.f7080p | Z2.f7078n, a3, 2));
    }

    @Override // java.util.stream.IntStream
    public final java.util.stream.Stream mapToObj(IntFunction intFunction) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.IntFunction convert = IntFunction.VivifiedWrapper.convert(intFunction);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(convert);
        return Stream.Wrapper.convert(new C0466s(abstractC0378a0, Z2.f7080p | Z2.f7078n, convert, 1));
    }

    @Override // java.util.stream.IntStream
    public final LongStream mapToLong(IntToLongFunction intToLongFunction) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        C0364t a3 = C0364t.a(intToLongFunction);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(a3);
        return C0428k0.n(new C0481v(abstractC0378a0, Z2.f7080p | Z2.f7078n, a3, 1));
    }

    @Override // java.util.stream.IntStream
    public final DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        C0363s a3 = C0363s.a(intToDoubleFunction);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(a3);
        return B.n(new C0471t(abstractC0378a0, Z2.f7080p | Z2.f7078n, a3, 4));
    }

    @Override // java.util.stream.IntStream
    public final int reduce(int i3, IntBinaryOperator intBinaryOperator) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        C0359n a3 = C0359n.a(intBinaryOperator);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(a3);
        return ((Integer) abstractC0378a0.H(new L1(EnumC0381a3.INT_VALUE, a3, i3))).intValue();
    }

    @Override // java.util.stream.IntStream
    public final IntStream flatMap(java.util.function.IntFunction intFunction) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.IntFunction convert = IntFunction.VivifiedWrapper.convert(intFunction);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(convert);
        return n(new C0476u(abstractC0378a0, Z2.f7080p | Z2.f7078n | Z2.f7084t, convert, 3));
    }

    @Override // java.util.stream.IntStream
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        C0359n a3 = C0359n.a(intBinaryOperator);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(a3);
        return AbstractC0340b.s((C0373o) abstractC0378a0.H(new C0498y1(EnumC0381a3.INT_VALUE, a3, 3)));
    }

    @Override // java.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.r a3 = j$.util.function.r.a(intPredicate);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(a3);
        return n(new C0476u(abstractC0378a0, Z2.f7084t, a3, 4));
    }

    @Override // java.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        C0361p b3 = C0361p.b(intConsumer);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        Objects.requireNonNull(b3);
        return n(new C0476u(abstractC0378a0, b3));
    }

    @Override // java.util.stream.IntStream
    public final IntStream limit(long j3) {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        abstractC0378a0.getClass();
        if (j3 < 0) {
            throw new IllegalArgumentException(Long.toString(j3));
        }
        return n(AbstractC0482v0.X(abstractC0378a0, 0L, j3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.c0] */
    @Override // java.util.stream.IntStream
    public final IntStream skip(long j3) {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        abstractC0378a0.getClass();
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        AbstractC0378a0 abstractC0378a02 = abstractC0378a0;
        if (i3 >= 0) {
            if (i3 != 0) {
                abstractC0378a02 = AbstractC0482v0.X(abstractC0378a0, j3, -1L);
            }
            return n(abstractC0378a02);
        }
        throw new IllegalArgumentException(Long.toString(j3));
    }

    public final IntStream takeWhile(IntPredicate intPredicate) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.r a3 = j$.util.function.r.a(intPredicate);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        int i3 = h4.f7178a;
        Objects.requireNonNull(a3);
        return n(new N3(abstractC0378a0, h4.f7178a, a3));
    }

    public final IntStream dropWhile(IntPredicate intPredicate) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.r a3 = j$.util.function.r.a(intPredicate);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        int i3 = h4.f7178a;
        Objects.requireNonNull(a3);
        return n(new P3(abstractC0378a0, h4.f7179b, a3));
    }

    @Override // java.util.stream.IntStream
    public final long count() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        abstractC0378a0.getClass();
        return ((Long) abstractC0378a0.H(new C1(3))).longValue();
    }

    @Override // java.util.stream.IntStream
    public final IntStream distinct() {
        return n(((AbstractC0400e2) ((AbstractC0400e2) ((AbstractC0378a0) this.f7111a).e0()).distinct()).j(new C0457q(7)));
    }

    @Override // java.util.stream.IntStream
    public final int sum() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        C0457q c0457q = new C0457q(12);
        abstractC0378a0.getClass();
        return ((Integer) abstractC0378a0.H(new L1(EnumC0381a3.INT_VALUE, c0457q, 0))).intValue();
    }

    @Override // java.util.stream.IntStream
    public final OptionalInt min() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        C0457q c0457q = new C0457q(9);
        abstractC0378a0.getClass();
        return AbstractC0340b.s((C0373o) abstractC0378a0.H(new C0498y1(EnumC0381a3.INT_VALUE, c0457q, 3)));
    }

    @Override // java.util.stream.IntStream
    public final OptionalInt max() {
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) this.f7111a;
        C0457q c0457q = new C0457q(13);
        abstractC0378a0.getClass();
        return AbstractC0340b.s((C0373o) abstractC0378a0.H(new C0498y1(EnumC0381a3.INT_VALUE, c0457q, 3)));
    }

    @Override // java.util.stream.IntStream
    public final OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC0378a0) this.f7111a).f0(new C0457q(14), new C0457q(15), new C0457q(16));
        long j3 = jArr[0];
        return AbstractC0340b.r(j3 > 0 ? C0372n.d(jArr[1] / j3) : C0372n.a());
    }

    @Override // java.util.stream.IntStream
    public final IntSummaryStatistics summaryStatistics() {
        C0368j c0368j = (C0368j) ((AbstractC0378a0) this.f7111a).f0(new C0447o(17), new C0457q(10), new C0457q(11));
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    @Override // java.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.r a3 = j$.util.function.r.a(intPredicate);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        return ((Boolean) abstractC0378a0.H(AbstractC0482v0.Y(a3, EnumC0467s0.ANY))).booleanValue();
    }

    @Override // java.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.r a3 = j$.util.function.r.a(intPredicate);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        return ((Boolean) abstractC0378a0.H(AbstractC0482v0.Y(a3, EnumC0467s0.ALL))).booleanValue();
    }

    @Override // java.util.stream.IntStream
    public final boolean noneMatch(IntPredicate intPredicate) {
        InterfaceC0388c0 interfaceC0388c0 = this.f7111a;
        j$.util.function.r a3 = j$.util.function.r.a(intPredicate);
        AbstractC0378a0 abstractC0378a0 = (AbstractC0378a0) interfaceC0388c0;
        abstractC0378a0.getClass();
        return ((Boolean) abstractC0378a0.H(AbstractC0482v0.Y(a3, EnumC0467s0.NONE))).booleanValue();
    }

    @Override // java.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0482v0.P((D0) ((AbstractC0378a0) this.f7111a).I(new C0457q(6))).i();
    }
}

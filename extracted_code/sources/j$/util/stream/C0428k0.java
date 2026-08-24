package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.C0370l;
import j$.util.C0372n;
import j$.util.C0374p;
import j$.util.C0510x;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.LongSummaryStatistics;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.k0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0428k0 implements LongStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0433l0 f7193a;

    private /* synthetic */ C0428k0(InterfaceC0433l0 interfaceC0433l0) {
        this.f7193a = interfaceC0433l0;
    }

    public static /* synthetic */ C0428k0 n(InterfaceC0433l0 interfaceC0433l0) {
        if (interfaceC0433l0 == null) {
            return null;
        }
        return new C0428k0(interfaceC0433l0);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return Stream.Wrapper.convert(((AbstractC0423j0) this.f7193a).e0());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((AbstractC0382b) this.f7193a).close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return ((AbstractC0423j0) this.f7193a).f0(j$.util.function.L.a(supplier), j$.util.function.J.a(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        if (obj instanceof C0428k0) {
            obj = ((C0428k0) obj).f7193a;
        }
        return interfaceC0433l0.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f7193a.e(j$.util.function.x.b(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f7193a.a(j$.util.function.x.b(longConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f7193a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return ((AbstractC0382b) this.f7193a).isParallel();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream onClose(Runnable runnable) {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f7193a;
        abstractC0382b.onClose(runnable);
        return C0402f.n(abstractC0382b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f7193a;
        abstractC0382b.parallel();
        return C0402f.n(abstractC0382b);
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: parallel */
    public final /* synthetic */ LongStream parallel2() {
        return n(this.f7193a.parallel());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f7193a;
        abstractC0382b.sequential();
        return C0402f.n(abstractC0382b);
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: sequential */
    public final /* synthetic */ LongStream sequential2() {
        return n(this.f7193a.sequential());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Long> spliterator() {
        return j$.util.E.a(((AbstractC0423j0) this.f7193a).spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.LongStream, java.util.stream.BaseStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ LongStream unordered() {
        return C0402f.n(((AbstractC0423j0) this.f7193a).unordered());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: spliterator */
    public final /* synthetic */ Spliterator<Long> spliterator2() {
        return Spliterator.Wrapper.convert(((AbstractC0423j0) this.f7193a).spliterator());
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong findAny() {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        abstractC0423j0.getClass();
        return AbstractC0340b.t((C0374p) abstractC0423j0.H(G.f6924d));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong findFirst() {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        abstractC0423j0.getClass();
        return AbstractC0340b.t((C0374p) abstractC0423j0.H(G.f6923c));
    }

    @Override // java.util.stream.LongStream
    public final LongStream sorted() {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        abstractC0423j0.getClass();
        return n(new AbstractC0418i0(abstractC0423j0, Z2.f7081q | Z2.f7079o, 0));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final Iterator<Long> iterator() {
        return j$.util.W.h(((AbstractC0423j0) this.f7193a).spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* renamed from: iterator */
    public final Iterator<Long> iterator2() {
        return C0510x.a(j$.util.W.h(((AbstractC0423j0) this.f7193a).spliterator()));
    }

    @Override // java.util.stream.LongStream
    public final DoubleStream asDoubleStream() {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        abstractC0423j0.getClass();
        return B.n(new C0491x(abstractC0423j0, Z2.f7078n, 2));
    }

    @Override // java.util.stream.LongStream
    public final LongStream map(LongUnaryOperator longUnaryOperator) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.E a3 = j$.util.function.E.a(longUnaryOperator);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(a3);
        return n(new C0481v(abstractC0423j0, Z2.f7080p | Z2.f7078n, a3, 2));
    }

    @Override // java.util.stream.LongStream
    public final java.util.stream.Stream mapToObj(LongFunction longFunction) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.z a3 = j$.util.function.z.a(longFunction);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(a3);
        return Stream.Wrapper.convert(new C0466s(abstractC0423j0, Z2.f7080p | Z2.f7078n, a3, 2));
    }

    @Override // java.util.stream.LongStream
    public final IntStream mapToInt(LongToIntFunction longToIntFunction) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.D a3 = j$.util.function.D.a(longToIntFunction);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(a3);
        return C0383b0.n(new C0476u(abstractC0423j0, Z2.f7080p | Z2.f7078n, a3, 5));
    }

    @Override // java.util.stream.LongStream
    public final DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.C a3 = j$.util.function.C.a(longToDoubleFunction);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(a3);
        return B.n(new C0471t(abstractC0423j0, Z2.f7080p | Z2.f7078n, a3, 5));
    }

    @Override // java.util.stream.LongStream
    public final LongStream flatMap(LongFunction longFunction) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.z a3 = j$.util.function.z.a(longFunction);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(a3);
        return n(new C0481v(abstractC0423j0, Z2.f7080p | Z2.f7078n | Z2.f7084t, a3, 3));
    }

    @Override // java.util.stream.LongStream
    public final LongStream filter(LongPredicate longPredicate) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.B a3 = j$.util.function.B.a(longPredicate);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(a3);
        return n(new C0481v(abstractC0423j0, Z2.f7084t, a3, 4));
    }

    @Override // java.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.x b3 = j$.util.function.x.b(longConsumer);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(b3);
        return n(new C0481v(abstractC0423j0, b3));
    }

    @Override // java.util.stream.LongStream
    public final LongStream limit(long j3) {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        abstractC0423j0.getClass();
        if (j3 < 0) {
            throw new IllegalArgumentException(Long.toString(j3));
        }
        return n(AbstractC0482v0.Z(abstractC0423j0, 0L, j3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.l0] */
    @Override // java.util.stream.LongStream
    public final LongStream skip(long j3) {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        abstractC0423j0.getClass();
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        AbstractC0423j0 abstractC0423j02 = abstractC0423j0;
        if (i3 >= 0) {
            if (i3 != 0) {
                abstractC0423j02 = AbstractC0482v0.Z(abstractC0423j0, j3, -1L);
            }
            return n(abstractC0423j02);
        }
        throw new IllegalArgumentException(Long.toString(j3));
    }

    public final LongStream takeWhile(LongPredicate longPredicate) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.B a3 = j$.util.function.B.a(longPredicate);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        int i3 = h4.f7178a;
        Objects.requireNonNull(a3);
        return n(new R3(abstractC0423j0, h4.f7178a, a3));
    }

    public final LongStream dropWhile(LongPredicate longPredicate) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.B a3 = j$.util.function.B.a(longPredicate);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        int i3 = h4.f7178a;
        Objects.requireNonNull(a3);
        return n(new T3(abstractC0423j0, h4.f7179b, a3));
    }

    @Override // java.util.stream.LongStream
    public final LongStream distinct() {
        return n(((AbstractC0400e2) ((AbstractC0400e2) ((AbstractC0423j0) this.f7193a).e0()).distinct()).B(new C0457q(19)));
    }

    @Override // java.util.stream.LongStream
    public final long sum() {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        C0457q c0457q = new C0457q(27);
        abstractC0423j0.getClass();
        return ((Long) abstractC0423j0.H(new C0488w1(EnumC0381a3.LONG_VALUE, c0457q, 0L))).longValue();
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong min() {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        C0457q c0457q = new C0457q(18);
        abstractC0423j0.getClass();
        return AbstractC0340b.t((C0374p) abstractC0423j0.H(new C0498y1(EnumC0381a3.LONG_VALUE, c0457q, 0)));
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong max() {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        C0457q c0457q = new C0457q(26);
        abstractC0423j0.getClass();
        return AbstractC0340b.t((C0374p) abstractC0423j0.H(new C0498y1(EnumC0381a3.LONG_VALUE, c0457q, 0)));
    }

    @Override // java.util.stream.LongStream
    public final OptionalDouble average() {
        long[] jArr = (long[]) ((AbstractC0423j0) this.f7193a).f0(new C0457q(23), new C0457q(24), new C0457q(25));
        long j3 = jArr[0];
        return AbstractC0340b.r(j3 > 0 ? C0372n.d(jArr[1] / j3) : C0372n.a());
    }

    @Override // java.util.stream.LongStream
    public final long reduce(long j3, LongBinaryOperator longBinaryOperator) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.v a3 = j$.util.function.v.a(longBinaryOperator);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(a3);
        return ((Long) abstractC0423j0.H(new C0488w1(EnumC0381a3.LONG_VALUE, a3, j3))).longValue();
    }

    @Override // java.util.stream.LongStream
    public final LongSummaryStatistics summaryStatistics() {
        C0370l c0370l = (C0370l) ((AbstractC0423j0) this.f7193a).f0(new C0447o(18), new C0457q(17), new C0457q(20));
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    @Override // java.util.stream.LongStream
    public final boolean anyMatch(LongPredicate longPredicate) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.B a3 = j$.util.function.B.a(longPredicate);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        return ((Boolean) abstractC0423j0.H(AbstractC0482v0.a0(a3, EnumC0467s0.ANY))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public final boolean allMatch(LongPredicate longPredicate) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.B a3 = j$.util.function.B.a(longPredicate);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        return ((Boolean) abstractC0423j0.H(AbstractC0482v0.a0(a3, EnumC0467s0.ALL))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public final OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.v a3 = j$.util.function.v.a(longBinaryOperator);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        Objects.requireNonNull(a3);
        return AbstractC0340b.t((C0374p) abstractC0423j0.H(new C0498y1(EnumC0381a3.LONG_VALUE, a3, 0)));
    }

    @Override // java.util.stream.LongStream
    public final boolean noneMatch(LongPredicate longPredicate) {
        InterfaceC0433l0 interfaceC0433l0 = this.f7193a;
        j$.util.function.B a3 = j$.util.function.B.a(longPredicate);
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) interfaceC0433l0;
        abstractC0423j0.getClass();
        return ((Boolean) abstractC0423j0.H(AbstractC0482v0.a0(a3, EnumC0467s0.NONE))).booleanValue();
    }

    @Override // java.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) AbstractC0482v0.Q((F0) ((AbstractC0423j0) this.f7193a).I(new C0457q(21))).i();
    }

    @Override // java.util.stream.LongStream
    public final long count() {
        AbstractC0423j0 abstractC0423j0 = (AbstractC0423j0) this.f7193a;
        abstractC0423j0.getClass();
        return ((Long) abstractC0423j0.H(new C1(0))).longValue();
    }
}

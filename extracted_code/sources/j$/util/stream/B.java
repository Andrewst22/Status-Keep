package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.C0367i;
import j$.util.C0372n;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.C0349d;
import j$.util.function.C0351f;
import j$.util.function.C0353h;
import j$.util.function.C0355j;
import j$.util.function.C0356k;
import j$.util.function.C0357l;
import j$.util.function.C0358m;
import j$.util.stream.Stream;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* loaded from: classes2.dex */
public final /* synthetic */ class B implements DoubleStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C f6888a;

    private /* synthetic */ B(C c3) {
        this.f6888a = c3;
    }

    public static /* synthetic */ B n(C c3) {
        if (c3 == null) {
            return null;
        }
        return new B(c3);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return Stream.Wrapper.convert(((A) this.f6888a).e0());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((AbstractC0382b) this.f6888a).close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return ((A) this.f6888a).f0(j$.util.function.L.a(supplier), j$.util.function.F.b(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C c3 = this.f6888a;
        if (obj instanceof B) {
            obj = ((B) obj).f6888a;
        }
        return c3.equals(obj);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f6888a.g(C0351f.b(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f6888a.q(C0351f.b(doubleConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f6888a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return ((AbstractC0382b) this.f6888a).isParallel();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream onClose(Runnable runnable) {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f6888a;
        abstractC0382b.onClose(runnable);
        return C0402f.n(abstractC0382b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream parallel() {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f6888a;
        abstractC0382b.parallel();
        return C0402f.n(abstractC0382b);
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: parallel  reason: avoid collision after fix types in other method */
    public final /* synthetic */ DoubleStream parallel2() {
        return n(this.f6888a.parallel());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream sequential() {
        AbstractC0382b abstractC0382b = (AbstractC0382b) this.f6888a;
        abstractC0382b.sequential();
        return C0402f.n(abstractC0382b);
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: sequential  reason: avoid collision after fix types in other method */
    public final /* synthetic */ DoubleStream sequential2() {
        return n(this.f6888a.sequential());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ Spliterator<Double> spliterator() {
        return j$.util.A.a(((A) this.f6888a).spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.stream.BaseStream, java.util.stream.DoubleStream] */
    @Override // java.util.stream.BaseStream
    public final /* synthetic */ DoubleStream unordered() {
        return C0402f.n(((A) this.f6888a).unordered());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: spliterator  reason: avoid collision after fix types in other method */
    public final /* synthetic */ Spliterator<Double> spliterator2() {
        return Spliterator.Wrapper.convert(((A) this.f6888a).spliterator());
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble findAny() {
        A a3 = (A) this.f6888a;
        a3.getClass();
        return AbstractC0340b.r((C0372n) a3.H(E.f6912d));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble findFirst() {
        A a3 = (A) this.f6888a;
        a3.getClass();
        return AbstractC0340b.r((C0372n) a3.H(E.f6911c));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream sorted() {
        A a3 = (A) this.f6888a;
        a3.getClass();
        return n(new AbstractC0501z(a3, Z2.f7081q | Z2.f7079o, 0));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final Iterator<Double> iterator() {
        return j$.util.W.f(((A) this.f6888a).spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* renamed from: iterator  reason: avoid collision after fix types in other method */
    public final Iterator<Double> iterator2() {
        return j$.util.r.a(j$.util.W.f(((A) this.f6888a).spliterator()));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        C c3 = this.f6888a;
        C0358m a3 = C0358m.a(doubleUnaryOperator);
        A a4 = (A) c3;
        a4.getClass();
        Objects.requireNonNull(a3);
        return n(new C0471t(a4, Z2.f7080p | Z2.f7078n, a3, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final java.util.stream.Stream mapToObj(DoubleFunction doubleFunction) {
        C c3 = this.f6888a;
        C0353h a3 = C0353h.a(doubleFunction);
        A a4 = (A) c3;
        a4.getClass();
        Objects.requireNonNull(a3);
        return Stream.Wrapper.convert(new C0466s(a4, Z2.f7080p | Z2.f7078n, a3, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        C c3 = this.f6888a;
        C0356k a3 = C0356k.a(doubleToIntFunction);
        A a4 = (A) c3;
        a4.getClass();
        Objects.requireNonNull(a3);
        return C0383b0.n(new C0476u(a4, Z2.f7080p | Z2.f7078n, a3, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        C c3 = this.f6888a;
        C0357l a3 = C0357l.a(doubleToLongFunction);
        A a4 = (A) c3;
        a4.getClass();
        Objects.requireNonNull(a3);
        return C0428k0.n(new C0481v(a4, Z2.f7080p | Z2.f7078n, a3, 0));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream flatMap(DoubleFunction doubleFunction) {
        C c3 = this.f6888a;
        C0353h a3 = C0353h.a(doubleFunction);
        A a4 = (A) c3;
        a4.getClass();
        Objects.requireNonNull(a3);
        return n(new C0471t(a4, Z2.f7080p | Z2.f7078n | Z2.f7084t, a3, 1));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream filter(DoublePredicate doublePredicate) {
        C c3 = this.f6888a;
        C0355j a3 = C0355j.a(doublePredicate);
        A a4 = (A) c3;
        a4.getClass();
        Objects.requireNonNull(a3);
        return n(new C0471t(a4, Z2.f7084t, a3, 2));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream peek(DoubleConsumer doubleConsumer) {
        C c3 = this.f6888a;
        C0351f b3 = C0351f.b(doubleConsumer);
        A a3 = (A) c3;
        a3.getClass();
        Objects.requireNonNull(b3);
        return n(new C0471t(a3, b3));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream limit(long j3) {
        A a3 = (A) this.f6888a;
        a3.getClass();
        if (j3 < 0) {
            throw new IllegalArgumentException(Long.toString(j3));
        }
        return n(AbstractC0482v0.V(a3, 0L, j3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.C] */
    @Override // java.util.stream.DoubleStream
    public final DoubleStream skip(long j3) {
        A a3 = (A) this.f6888a;
        a3.getClass();
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        A a4 = a3;
        if (i3 >= 0) {
            if (i3 != 0) {
                a4 = AbstractC0482v0.V(a3, j3, -1L);
            }
            return n(a4);
        }
        throw new IllegalArgumentException(Long.toString(j3));
    }

    public final DoubleStream takeWhile(DoublePredicate doublePredicate) {
        C c3 = this.f6888a;
        C0355j a3 = C0355j.a(doublePredicate);
        A a4 = (A) c3;
        a4.getClass();
        int i3 = h4.f7178a;
        Objects.requireNonNull(a3);
        return n(new V3(a4, h4.f7178a, a3));
    }

    public final DoubleStream dropWhile(DoublePredicate doublePredicate) {
        C c3 = this.f6888a;
        C0355j a3 = C0355j.a(doublePredicate);
        A a4 = (A) c3;
        a4.getClass();
        int i3 = h4.f7178a;
        Objects.requireNonNull(a3);
        return n(new X3(a4, h4.f7179b, a3));
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleStream distinct() {
        return n(((AbstractC0400e2) ((AbstractC0400e2) ((A) this.f6888a).e0()).distinct()).D(new C0447o(27)));
    }

    @Override // java.util.stream.DoubleStream
    public final double sum() {
        double[] dArr = (double[]) ((A) this.f6888a).f0(new C0457q(0), new C0447o(3), new C0447o(0));
        int i3 = AbstractC0422j.f7187a;
        double d3 = dArr[0] + dArr[1];
        double d4 = dArr[dArr.length - 1];
        return (Double.isNaN(d3) && Double.isInfinite(d4)) ? d4 : d3;
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble min() {
        A a3 = (A) this.f6888a;
        C0447o c0447o = new C0447o(22);
        a3.getClass();
        return AbstractC0340b.r((C0372n) a3.H(new C0498y1(EnumC0381a3.DOUBLE_VALUE, c0447o, 1)));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble max() {
        A a3 = (A) this.f6888a;
        C0447o c0447o = new C0447o(29);
        a3.getClass();
        return AbstractC0340b.r((C0372n) a3.H(new C0498y1(EnumC0381a3.DOUBLE_VALUE, c0447o, 1)));
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble average() {
        C0372n a3;
        double[] dArr = (double[]) ((A) this.f6888a).f0(new C0447o(23), new C0447o(1), new C0447o(2));
        if (dArr[2] > 0.0d) {
            int i3 = AbstractC0422j.f7187a;
            double d3 = dArr[0] + dArr[1];
            double d4 = dArr[dArr.length - 1];
            if (Double.isNaN(d3) && Double.isInfinite(d4)) {
                d3 = d4;
            }
            a3 = C0372n.d(d3 / dArr[2]);
        } else {
            a3 = C0372n.a();
        }
        return AbstractC0340b.r(a3);
    }

    @Override // java.util.stream.DoubleStream
    public final DoubleSummaryStatistics summaryStatistics() {
        C0367i c0367i = (C0367i) ((A) this.f6888a).f0(new C0447o(16), new C0447o(24), new C0447o(25));
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    @Override // java.util.stream.DoubleStream
    public final boolean anyMatch(DoublePredicate doublePredicate) {
        C c3 = this.f6888a;
        C0355j a3 = C0355j.a(doublePredicate);
        A a4 = (A) c3;
        a4.getClass();
        return ((Boolean) a4.H(AbstractC0482v0.W(a3, EnumC0467s0.ANY))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public final boolean allMatch(DoublePredicate doublePredicate) {
        C c3 = this.f6888a;
        C0355j a3 = C0355j.a(doublePredicate);
        A a4 = (A) c3;
        a4.getClass();
        return ((Boolean) a4.H(AbstractC0482v0.W(a3, EnumC0467s0.ALL))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public final boolean noneMatch(DoublePredicate doublePredicate) {
        C c3 = this.f6888a;
        C0355j a3 = C0355j.a(doublePredicate);
        A a4 = (A) c3;
        a4.getClass();
        return ((Boolean) a4.H(AbstractC0482v0.W(a3, EnumC0467s0.NONE))).booleanValue();
    }

    @Override // java.util.stream.DoubleStream
    public final double[] toArray() {
        return (double[]) AbstractC0482v0.O((B0) ((A) this.f6888a).I(new C0447o(28))).i();
    }

    @Override // java.util.stream.DoubleStream
    public final double reduce(double d3, DoubleBinaryOperator doubleBinaryOperator) {
        C c3 = this.f6888a;
        C0349d a3 = C0349d.a(doubleBinaryOperator);
        A a4 = (A) c3;
        a4.getClass();
        Objects.requireNonNull(a3);
        return ((Double) a4.H(new E1(EnumC0381a3.DOUBLE_VALUE, a3, d3))).doubleValue();
    }

    @Override // java.util.stream.DoubleStream
    public final OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        C c3 = this.f6888a;
        C0349d a3 = C0349d.a(doubleBinaryOperator);
        A a4 = (A) c3;
        a4.getClass();
        Objects.requireNonNull(a3);
        return AbstractC0340b.r((C0372n) a4.H(new C0498y1(EnumC0381a3.DOUBLE_VALUE, a3, 1)));
    }

    @Override // java.util.stream.DoubleStream
    public final long count() {
        A a3 = (A) this.f6888a;
        a3.getClass();
        return ((Long) a3.H(new C1(1))).longValue();
    }
}

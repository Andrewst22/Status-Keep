package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.C0371m;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0347b;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0348c;
import j$.util.function.Predicate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* loaded from: classes2.dex */
public interface Stream<T> extends InterfaceC0407g {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.stream.Stream {
        private /* synthetic */ Wrapper() {
            Stream.this = r1;
        }

        public static /* synthetic */ java.util.stream.Stream convert(Stream stream) {
            if (stream == null) {
                return null;
            }
            return new Wrapper();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean allMatch(Predicate predicate) {
            return Stream.this.y(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
            return Stream.this.c(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            Stream.this.close();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
            return Stream.this.r(j$.util.function.L.a(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object collect(Collector collector) {
            return Stream.this.l(C0417i.a(collector));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ long count() {
            return Stream.this.count();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream distinct() {
            return convert(Stream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.Stream dropWhile(java.util.function.Predicate predicate) {
            return convert(Stream.this.p(Predicate.VivifiedWrapper.convert(predicate)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Stream stream = Stream.this;
            if (obj instanceof Wrapper) {
                obj = Stream.this;
            }
            return stream.equals(obj);
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream filter(java.util.function.Predicate predicate) {
            return convert(Stream.this.v(Predicate.VivifiedWrapper.convert(predicate)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findAny() {
            return AbstractC0340b.q(Stream.this.findAny());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional findFirst() {
            return AbstractC0340b.q(Stream.this.findFirst());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream flatMap(Function function) {
            return convert(Stream.this.m(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
            return B.n(Stream.this.s(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ IntStream flatMapToInt(java.util.function.Function function) {
            return C0383b0.n(Stream.this.d(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream flatMapToLong(java.util.function.Function function) {
            return C0428k0.n(Stream.this.z(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEach(Consumer consumer) {
            Stream.this.b(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
            Stream.this.f(Consumer.VivifiedWrapper.convert(consumer));
        }

        public final /* synthetic */ int hashCode() {
            return Stream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return Stream.this.isParallel();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Iterator iterator() {
            return Stream.this.iterator();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream limit(long j3) {
            return convert(Stream.this.limit(j3));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
            return convert(Stream.this.k(Function.VivifiedWrapper.convert(function)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
            return B.n(Stream.this.D(j$.util.function.N.a(toDoubleFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
            return C0383b0.n(Stream.this.j(j$.util.function.P.a(toIntFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
            return C0428k0.n(Stream.this.B(j$.util.function.S.a(toLongFunction)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional max(Comparator comparator) {
            return AbstractC0340b.q(Stream.this.max(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional min(Comparator comparator) {
            return AbstractC0340b.q(Stream.this.min(comparator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
            return Stream.this.A(Predicate.VivifiedWrapper.convert(predicate));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C0402f.n(Stream.this.onClose(runnable));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C0402f.n(Stream.this.parallel());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
            return convert(Stream.this.x(Consumer.VivifiedWrapper.convert(consumer)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
            return Stream.this.t(obj, BiFunction.VivifiedWrapper.convert(biFunction), C0347b.a(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
            return Stream.this.i(obj, C0347b.a(binaryOperator));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
            return AbstractC0340b.q(Stream.this.o(C0347b.a(binaryOperator)));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C0402f.n(Stream.this.sequential());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream skip(long j3) {
            return convert(Stream.this.skip(j3));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted() {
            return convert(Stream.this.sorted());
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ java.util.stream.Stream sorted(Comparator comparator) {
            return convert(Stream.this.sorted(comparator));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(Stream.this.spliterator());
        }

        public final /* synthetic */ java.util.stream.Stream takeWhile(java.util.function.Predicate predicate) {
            return convert(Stream.this.u(Predicate.VivifiedWrapper.convert(predicate)));
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray() {
            return Stream.this.toArray();
        }

        @Override // java.util.stream.Stream
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return Stream.this.h(IntFunction.VivifiedWrapper.convert(intFunction));
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C0402f.n(Stream.this.unordered());
        }
    }

    boolean A(j$.util.function.Predicate predicate);

    InterfaceC0433l0 B(j$.util.function.T t3);

    C D(j$.util.function.O o3);

    void b(j$.util.function.Consumer consumer);

    boolean c(j$.util.function.Predicate predicate);

    long count();

    InterfaceC0388c0 d(j$.util.function.Function function);

    Stream distinct();

    void f(j$.util.function.Consumer consumer);

    C0371m findAny();

    C0371m findFirst();

    Object[] h(j$.util.function.IntFunction intFunction);

    Object i(Object obj, C0347b c0347b);

    InterfaceC0388c0 j(j$.util.function.Q q3);

    Stream k(j$.util.function.Function function);

    Object l(C0417i c0417i);

    Stream limit(long j3);

    Stream m(j$.util.function.Function function);

    C0371m max(Comparator comparator);

    C0371m min(Comparator comparator);

    C0371m o(InterfaceC0348c interfaceC0348c);

    Stream p(j$.util.function.Predicate predicate);

    Object r(j$.util.function.L l3, j$.util.function.BiConsumer biConsumer, j$.util.function.BiConsumer biConsumer2);

    C s(j$.util.function.Function function);

    Stream skip(long j3);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Object t(Object obj, j$.util.function.BiFunction biFunction, C0347b c0347b);

    Object[] toArray();

    Stream u(j$.util.function.Predicate predicate);

    Stream v(j$.util.function.Predicate predicate);

    Stream x(j$.util.function.Consumer consumer);

    boolean y(j$.util.function.Predicate predicate);

    InterfaceC0433l0 z(j$.util.function.Function function);
}

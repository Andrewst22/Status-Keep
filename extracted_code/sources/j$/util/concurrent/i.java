package j$.util.concurrent;

import j$.util.AbstractC0340b;
import j$.util.Collection$CC;
import j$.util.InterfaceC0341c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.AbstractC0482v0;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;
/* loaded from: classes2.dex */
public final class i extends b implements Set, InterfaceC0341c {
    private static final long serialVersionUID = 7249069246763182397L;

    @Override // j$.util.InterfaceC0341c
    public final /* synthetic */ boolean c(Predicate predicate) {
        return Collection$CC.$default$removeIf(this, predicate);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer consumer) {
        b(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        j$.util.stream.Stream e02;
        e02 = AbstractC0482v0.e0(AbstractC0340b.w(this), true);
        return Stream.Wrapper.convert(e02);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection$CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.InterfaceC0341c
    public final /* synthetic */ j$.util.stream.Stream stream() {
        j$.util.stream.Stream e02;
        e02 = AbstractC0482v0.e0(AbstractC0340b.w(this), false);
        return e02;
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        j$.util.stream.Stream e02;
        e02 = AbstractC0482v0.e0(AbstractC0340b.w(this), false);
        return Stream.Wrapper.convert(e02);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).j(0));
        return array;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f6770a.g(obj, null, null) != null;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6770a.containsKey(obj);
    }

    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f6770a;
        l[] lVarArr = concurrentHashMap.f6755a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, concurrentHashMap, 0);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (((AbstractC0342a) it).hasNext()) {
            i3 += ((h) it).next().hashCode();
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.InterfaceC0341c
    public final j$.util.Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f6770a;
        long j3 = concurrentHashMap.j();
        l[] lVarArr = concurrentHashMap.f6755a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new j(lVarArr, length, 0, length, j3 < 0 ? 0L : j3, 0);
    }

    @Override // j$.util.InterfaceC0341c
    public final void b(j$.util.function.Consumer consumer) {
        consumer.getClass();
        l[] lVarArr = this.f6770a.f6755a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a3 = pVar.a();
            if (a3 == null) {
                return;
            }
            consumer.accept(a3.f6781b);
        }
    }
}

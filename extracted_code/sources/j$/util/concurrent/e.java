package j$.util.concurrent;

import j$.util.AbstractC0340b;
import j$.util.InterfaceC0341c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.stream.AbstractC0482v0;
import j$.util.stream.Stream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
/* loaded from: classes2.dex */
final class e extends b implements Set, InterfaceC0341c {
    private static final long serialVersionUID = 2249069246763182397L;

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
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return c(Predicate.VivifiedWrapper.convert(predicate));
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

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f6770a.f(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f6770a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // j$.util.concurrent.b, java.util.Collection
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f6770a.remove(key, value);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.util.concurrent.a, java.util.Iterator] */
    @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f6770a;
        l[] lVarArr = concurrentHashMap.f6755a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new AbstractC0342a(lVarArr, length, length, concurrentHashMap);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f6770a.f(entry.getKey(), entry.getValue(), false) == null) {
                z3 = true;
            }
        }
        return z3;
    }

    @Override // j$.util.InterfaceC0341c
    public final boolean c(j$.util.function.Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f6770a;
        concurrentHashMap.getClass();
        predicate.getClass();
        l[] lVarArr = concurrentHashMap.f6755a;
        boolean z3 = false;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a3 = pVar.a();
                if (a3 == null) {
                    break;
                }
                Object obj = a3.f6781b;
                Object obj2 = a3.f6782c;
                if (predicate.g(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.g(obj, null, obj2) != null) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        l[] lVarArr = this.f6770a.f6755a;
        int i3 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a3 = pVar.a();
                if (a3 == null) {
                    break;
                }
                i3 += a3.hashCode();
            }
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
        return new f(lVarArr, length, 0, length, j3 >= 0 ? j3 : 0L, concurrentHashMap);
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
            consumer.accept(new k(a3.f6781b, a3.f6782c, this.f6770a));
        }
    }
}

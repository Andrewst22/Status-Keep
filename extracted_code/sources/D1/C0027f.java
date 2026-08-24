package D1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: D1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027f extends C0030i implements NavigableMap {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Y f250s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0027f(Y y3, NavigableMap navigableMap) {
        super(y3, navigableMap);
        this.f250s = y3;
    }

    @Override // D1.C0030i
    public final SortedSet b() {
        return new C0028g(this.f250s, d());
    }

    @Override // D1.C0030i
    public final SortedSet c() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = d().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C0027f(this.f250s, d().descendingMap());
    }

    public final E e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection d3 = this.f250s.d();
        d3.addAll((Collection) entry.getValue());
        it.remove();
        return new E(entry.getKey(), Collections.unmodifiableList((List) d3));
    }

    @Override // D1.C0030i
    /* renamed from: f */
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.f241o);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = d().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    @Override // D1.C0030i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = d().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    @Override // D1.C0030i, D1.C0025d, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = d().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((C0023b) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((C0023b) ((C0025d) descendingMap()).entrySet()).iterator());
    }

    @Override // D1.C0030i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // D1.C0030i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z3) {
        return new C0027f(this.f250s, d().headMap(obj, z3));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z3, Object obj2, boolean z4) {
        return new C0027f(this.f250s, d().subMap(obj, z3, obj2, z4));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z3) {
        return new C0027f(this.f250s, d().tailMap(obj, z3));
    }
}

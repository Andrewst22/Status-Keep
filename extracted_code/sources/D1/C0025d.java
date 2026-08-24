package D1;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
/* renamed from: D1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0025d extends AbstractMap {

    /* renamed from: m  reason: collision with root package name */
    public transient C0023b f239m;

    /* renamed from: n  reason: collision with root package name */
    public transient C0035n f240n;

    /* renamed from: o  reason: collision with root package name */
    public final transient Map f241o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Y f242p;

    public C0025d(Y y3, Map map) {
        this.f242p = y3;
        this.f241o = map;
    }

    public final E a(Map.Entry entry) {
        C0033l c0033l;
        Object key = entry.getKey();
        Y y3 = this.f242p;
        y3.getClass();
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            c0033l = new C0033l(y3, key, list, null);
        } else {
            c0033l = new C0033l(y3, key, list, null);
        }
        return new E(key, c0033l);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Y y3 = this.f242p;
        if (this.f241o == y3.f221p) {
            y3.c();
            return;
        }
        C0024c c0024c = new C0024c(this);
        while (c0024c.hasNext()) {
            c0024c.next();
            c0024c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f241o;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0023b c0023b = this.f239m;
        if (c0023b == null) {
            C0023b c0023b2 = new C0023b(this);
            this.f239m = c0023b2;
            return c0023b2;
        }
        return c0023b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f241o.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C0033l c0033l;
        Map map = this.f241o;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        Y y3 = this.f242p;
        y3.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            c0033l = new C0033l(y3, obj, list, null);
        } else {
            c0033l = new C0033l(y3, obj, list, null);
        }
        return c0033l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f241o.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set c0026e;
        Y y3 = this.f242p;
        Set set = y3.f287m;
        if (set == null) {
            Map map = y3.f221p;
            if (map instanceof NavigableMap) {
                c0026e = new C0028g(y3, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                c0026e = new C0031j(y3, (SortedMap) map);
            } else {
                c0026e = new C0026e(y3, map);
            }
            set = c0026e;
            y3.f287m = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f241o.remove(obj);
        if (collection == null) {
            return null;
        }
        Y y3 = this.f242p;
        Collection d3 = y3.d();
        d3.addAll(collection);
        y3.f222q -= collection.size();
        collection.clear();
        return d3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f241o.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f241o.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0035n c0035n = this.f240n;
        if (c0035n == null) {
            C0035n c0035n2 = new C0035n(this);
            this.f240n = c0035n2;
            return c0035n2;
        }
        return c0035n;
    }
}

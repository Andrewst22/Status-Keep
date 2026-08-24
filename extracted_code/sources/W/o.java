package W;

import D1.l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class o implements Map {

    /* renamed from: m  reason: collision with root package name */
    public final Map f2787m;

    public o(Map map) {
        this.f2787m = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f2787m.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f2787m.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((l0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return D1.r.j(this.f2787m.entrySet(), new n(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && D1.r.h(this, obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f2787m.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return D1.r.m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f2787m;
        if (map.isEmpty()) {
            return true;
        }
        if (map.size() == 1 && map.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return D1.r.j(this.f2787m.keySet(), new n(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f2787m.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f2787m.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f2787m.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f2787m;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f2787m.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f2787m.values();
    }
}

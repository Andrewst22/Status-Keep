package D1;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
/* loaded from: classes.dex */
public final class Y extends AbstractC0036o implements Serializable {

    /* renamed from: p  reason: collision with root package name */
    public final transient Map f221p;

    /* renamed from: q  reason: collision with root package name */
    public transient int f222q;

    /* renamed from: r  reason: collision with root package name */
    public transient X f223r;

    public Y(Map map) {
        if (map.isEmpty()) {
            this.f221p = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // D1.AbstractC0036o
    public final Map a() {
        Map c0025d;
        Map map = this.f289o;
        if (map == null) {
            Map map2 = this.f221p;
            if (map2 instanceof NavigableMap) {
                c0025d = new C0027f(this, (NavigableMap) map2);
            } else if (map2 instanceof SortedMap) {
                c0025d = new C0030i(this, (SortedMap) map2);
            } else {
                c0025d = new C0025d(this, map2);
            }
            map = c0025d;
            this.f289o = map;
        }
        return map;
    }

    public final void c() {
        Map map = this.f221p;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.f222q = 0;
    }

    public final Collection d() {
        return (List) this.f223r.get();
    }
}

package D1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: D1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0026e extends n0 {

    /* renamed from: m  reason: collision with root package name */
    public final Map f246m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Y f247n;

    public C0026e(Y y3, Map map) {
        this.f247n = y3;
        map.getClass();
        this.f246m = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0024c c0024c = (C0024c) it;
            if (c0024c.hasNext()) {
                c0024c.next();
                c0024c.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f246m.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f246m.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f246m.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f246m.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f246m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0024c(this, this.f246m.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i3;
        Collection collection = (Collection) this.f246m.remove(obj);
        if (collection != null) {
            i3 = collection.size();
            collection.clear();
            this.f247n.f222q -= i3;
        } else {
            i3 = 0;
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f246m.size();
    }
}

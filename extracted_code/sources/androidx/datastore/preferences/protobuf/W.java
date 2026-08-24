package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class W extends AbstractMap {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f4211r = 0;

    /* renamed from: m  reason: collision with root package name */
    public List f4212m;

    /* renamed from: n  reason: collision with root package name */
    public Map f4213n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4214o;

    /* renamed from: p  reason: collision with root package name */
    public volatile Z f4215p;

    /* renamed from: q  reason: collision with root package name */
    public Map f4216q;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, androidx.datastore.preferences.protobuf.W] */
    public static W f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f4212m = Collections.emptyList();
        abstractMap.f4213n = Collections.emptyMap();
        abstractMap.f4216q = Collections.emptyMap();
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i3;
        int size = this.f4212m.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((X) this.f4212m.get(i4)).f4217m);
            if (compareTo > 0) {
                i3 = size + 1;
                return -i3;
            } else if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((X) this.f4212m.get(i6)).f4217m);
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else if (compareTo2 > 0) {
                i5 = i6 + 1;
            } else {
                return i6;
            }
        }
        i3 = i5 + 1;
        return -i3;
    }

    public final void b() {
        if (!this.f4214o) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f4212m.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f4212m.isEmpty()) {
            this.f4212m.clear();
        }
        if (!this.f4213n.isEmpty()) {
            this.f4213n.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f4213n.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set d() {
        if (this.f4213n.isEmpty()) {
            return Collections.emptySet();
        }
        return this.f4213n.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f4213n.isEmpty() && !(this.f4213n instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4213n = treeMap;
            this.f4216q = treeMap.descendingMap();
        }
        return (SortedMap) this.f4213n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4215p == null) {
            this.f4215p = new Z(this, 0);
        }
        return this.f4215p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return super.equals(obj);
        }
        W w3 = (W) obj;
        int size = size();
        if (size != w3.size()) {
            return false;
        }
        int size2 = this.f4212m.size();
        if (size2 != w3.f4212m.size()) {
            return ((AbstractSet) entrySet()).equals(w3.entrySet());
        }
        for (int i3 = 0; i3 < size2; i3++) {
            if (!c(i3).equals(w3.c(i3))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f4213n.equals(w3.f4213n);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((X) this.f4212m.get(a3)).setValue(obj);
        }
        b();
        if (this.f4212m.isEmpty() && !(this.f4212m instanceof ArrayList)) {
            this.f4212m = new ArrayList(16);
        }
        int i3 = -(a3 + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f4212m.size() == 16) {
            X x = (X) this.f4212m.remove(15);
            e().put(x.f4217m, x.f4218n);
        }
        this.f4212m.add(i3, new X(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((X) this.f4212m.get(a3)).f4218n;
        }
        return this.f4213n.get(comparable);
    }

    public final Object h(int i3) {
        b();
        Object obj = ((X) this.f4212m.remove(i3)).f4218n;
        if (!this.f4213n.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f4212m;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new X(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4212m.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((X) this.f4212m.get(i4)).hashCode();
        }
        if (this.f4213n.size() > 0) {
            return i3 + this.f4213n.hashCode();
        }
        return i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return h(a3);
        }
        if (this.f4213n.isEmpty()) {
            return null;
        }
        return this.f4213n.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4213n.size() + this.f4212m.size();
    }
}

package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* renamed from: p.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720b implements Set {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0723e f8719m;

    public C0720b(C0723e c0723e) {
        this.f8719m = c0723e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8719m.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8719m.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C0723e c0723e = this.f8719m;
        c0723e.getClass();
        for (Object obj : collection) {
            if (!c0723e.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        C0723e c0723e = this.f8719m;
        int i3 = 0;
        for (int i4 = c0723e.f8750o - 1; i4 >= 0; i4--) {
            Object g3 = c0723e.g(i4);
            if (g3 == null) {
                hashCode = 0;
            } else {
                hashCode = g3.hashCode();
            }
            i3 += hashCode;
        }
        return i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8719m.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0719a(this.f8719m, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0723e c0723e = this.f8719m;
        int d3 = c0723e.d(obj);
        if (d3 >= 0) {
            c0723e.h(d3);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0723e c0723e = this.f8719m;
        int i3 = c0723e.f8750o;
        for (Object obj : collection) {
            c0723e.remove(obj);
        }
        if (i3 != c0723e.f8750o) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0723e c0723e = this.f8719m;
        int i3 = c0723e.f8750o;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(c0723e.g(i4))) {
                c0723e.h(i4);
            }
        }
        if (i3 != c0723e.f8750o) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8719m.f8750o;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0723e c0723e = this.f8719m;
        int i3 = c0723e.f8750o;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0723e.g(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f8719m.j(0, objArr);
    }
}

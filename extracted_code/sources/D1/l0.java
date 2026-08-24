package D1;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
/* loaded from: classes.dex */
public class l0 extends AbstractCollection implements Set {

    /* renamed from: m  reason: collision with root package name */
    public final Set f283m;

    /* renamed from: n  reason: collision with root package name */
    public final C1.g f284n;

    public l0(Set set, C1.g gVar) {
        this.f283m = set;
        this.f284n = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f284n.apply(obj)) {
            return this.f283m.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            if (!this.f284n.apply(obj)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f283m.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f283m;
        boolean z3 = set instanceof RandomAccess;
        C1.g gVar = this.f284n;
        if (z3 && (set instanceof List)) {
            List list = (List) set;
            gVar.getClass();
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                Object obj = list.get(i4);
                if (!gVar.apply(obj)) {
                    if (i4 > i3) {
                        try {
                            list.set(i3, obj);
                        } catch (IllegalArgumentException unused) {
                            r.r(list, gVar, i3, i4);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            r.r(list, gVar, i3, i4);
                            return;
                        }
                    }
                    i3++;
                }
            }
            list.subList(i3, list.size()).clear();
            return;
        }
        Iterator it = set.iterator();
        gVar.getClass();
        while (it.hasNext()) {
            if (gVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z3;
        Set set = this.f283m;
        set.getClass();
        try {
            z3 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        return this.f284n.apply(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f283m.iterator();
        C1.g gVar = this.f284n;
        if (gVar != null) {
            boolean z3 = false;
            int i3 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (gVar.apply(it.next())) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 != -1) {
                z3 = true;
            }
            return true ^ z3;
        }
        throw new NullPointerException("predicate");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f283m.iterator();
        it.getClass();
        C1.g gVar = this.f284n;
        gVar.getClass();
        return new N(it, gVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f283m.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f283m.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f284n.apply(next) && collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f283m.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f284n.apply(next) && !collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i3 = 0;
        for (Object obj : this.f283m) {
            if (this.f284n.apply(obj)) {
                i3++;
            }
        }
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n3 = (N) it;
            if (n3.hasNext()) {
                arrayList.add(n3.next());
            } else {
                return arrayList.toArray();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n3 = (N) it;
            if (n3.hasNext()) {
                arrayList.add(n3.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}

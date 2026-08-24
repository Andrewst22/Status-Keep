package D1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* renamed from: D1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0033l extends AbstractCollection implements List {

    /* renamed from: m  reason: collision with root package name */
    public final Object f277m;

    /* renamed from: n  reason: collision with root package name */
    public Collection f278n;

    /* renamed from: o  reason: collision with root package name */
    public final C0033l f279o;

    /* renamed from: p  reason: collision with root package name */
    public final Collection f280p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Y f281q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Y f282r;

    public C0033l(Y y3, Object obj, List list, C0033l c0033l) {
        Collection collection;
        this.f282r = y3;
        this.f281q = y3;
        this.f277m = obj;
        this.f278n = list;
        this.f279o = c0033l;
        if (c0033l == null) {
            collection = null;
        } else {
            collection = c0033l.f278n;
        }
        this.f280p = collection;
    }

    public final void a() {
        C0033l c0033l = this.f279o;
        if (c0033l != null) {
            c0033l.a();
        } else {
            this.f281q.f221p.put(this.f277m, this.f278n);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.f278n.isEmpty();
        boolean add = this.f278n.add(obj);
        if (add) {
            this.f281q.f222q++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f278n.addAll(collection);
        if (addAll) {
            this.f281q.f222q += this.f278n.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final void b() {
        Collection collection;
        C0033l c0033l = this.f279o;
        if (c0033l != null) {
            c0033l.b();
            if (c0033l.f278n != this.f280p) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f278n.isEmpty() && (collection = (Collection) this.f281q.f221p.get(this.f277m)) != null) {
            this.f278n = collection;
        }
    }

    public final void c() {
        C0033l c0033l = this.f279o;
        if (c0033l != null) {
            c0033l.c();
        } else if (this.f278n.isEmpty()) {
            this.f281q.f221p.remove(this.f277m);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f278n.clear();
        this.f281q.f222q -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f278n.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f278n.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f278n.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        b();
        return ((List) this.f278n).get(i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f278n.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f278n).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new C0024c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f278n).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new C0032k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.f278n.remove(obj);
        if (remove) {
            Y y3 = this.f281q;
            y3.f222q--;
            c();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f278n.removeAll(collection);
        if (removeAll) {
            this.f281q.f222q += this.f278n.size() - size;
            c();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f278n.retainAll(collection);
        if (retainAll) {
            this.f281q.f222q += this.f278n.size() - size;
            c();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        b();
        return ((List) this.f278n).set(i3, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f278n.size();
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        b();
        List subList = ((List) this.f278n).subList(i3, i4);
        C0033l c0033l = this.f279o;
        if (c0033l == null) {
            c0033l = this;
        }
        Y y3 = this.f282r;
        y3.getClass();
        boolean z3 = subList instanceof RandomAccess;
        Object obj = this.f277m;
        if (z3) {
            return new C0033l(y3, obj, subList, c0033l);
        }
        return new C0033l(y3, obj, subList, c0033l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f278n.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        b();
        return new C0032k(this, i3);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        b();
        Object remove = ((List) this.f278n).remove(i3);
        Y y3 = this.f282r;
        y3.f222q--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        b();
        boolean isEmpty = this.f278n.isEmpty();
        ((List) this.f278n).add(i3, obj);
        this.f282r.f222q++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f278n).addAll(i3, collection);
        if (addAll) {
            this.f282r.f222q += this.f278n.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }
}

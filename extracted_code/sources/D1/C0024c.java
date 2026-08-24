package D1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* renamed from: D1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0024c implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f234m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final Iterator f235n;

    /* renamed from: o  reason: collision with root package name */
    public Object f236o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f237p;

    public C0024c(C0033l c0033l) {
        Iterator it;
        this.f237p = c0033l;
        Collection collection = c0033l.f278n;
        this.f236o = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f235n = it;
    }

    public void a() {
        C0033l c0033l = (C0033l) this.f237p;
        c0033l.b();
        if (c0033l.f278n == ((Collection) this.f236o)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f234m) {
            case 0:
                return this.f235n.hasNext();
            case 1:
                return this.f235n.hasNext();
            default:
                a();
                return this.f235n.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f234m) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f235n.next();
                this.f236o = (Collection) entry.getValue();
                return ((C0025d) this.f237p).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f235n.next();
                this.f236o = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f235n.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z3;
        boolean z4;
        switch (this.f234m) {
            case 0:
                if (((Collection) this.f236o) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    this.f235n.remove();
                    ((C0025d) this.f237p).f242p.f222q -= ((Collection) this.f236o).size();
                    ((Collection) this.f236o).clear();
                    this.f236o = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Map.Entry entry = (Map.Entry) this.f236o;
                if (entry != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    Collection collection = (Collection) entry.getValue();
                    this.f235n.remove();
                    ((C0026e) this.f237p).f247n.f222q -= collection.size();
                    collection.clear();
                    this.f236o = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                this.f235n.remove();
                C0033l c0033l = (C0033l) this.f237p;
                Y y3 = c0033l.f281q;
                y3.f222q--;
                c0033l.c();
                return;
        }
    }

    public C0024c(C0033l c0033l, ListIterator listIterator) {
        this.f237p = c0033l;
        this.f236o = c0033l.f278n;
        this.f235n = listIterator;
    }

    public C0024c(C0026e c0026e, Iterator it) {
        this.f237p = c0026e;
        this.f235n = it;
    }

    public C0024c(C0025d c0025d) {
        this.f237p = c0025d;
        this.f235n = c0025d.f241o.entrySet().iterator();
    }
}

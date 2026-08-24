package D1;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* renamed from: D1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035n extends AbstractCollection {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f285m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f286n;

    public /* synthetic */ C0035n(int i3, Serializable serializable) {
        this.f285m = i3;
        this.f286n = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f285m) {
            case 0:
                ((Y) this.f286n).c();
                return;
            case 1:
                ((C0042v) this.f286n).clear();
                return;
            default:
                ((C0025d) this.f286n).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f285m) {
            case 0:
                return ((Y) this.f286n).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0025d) this.f286n).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f285m) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0025d) this.f286n).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f285m) {
            case 0:
                return new C0022a((Y) this.f286n);
            case 1:
                C0042v c0042v = (C0042v) this.f286n;
                Map c3 = c0042v.c();
                if (c3 != null) {
                    return c3.values().iterator();
                }
                return new C0039s(c0042v, 2);
            default:
                return new p0(((C0025d) this.f286n).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f285m) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0025d c0025d = (C0025d) this.f286n;
                    for (Map.Entry entry : c0025d.entrySet()) {
                        if (android.support.v4.media.session.a.s(obj, entry.getValue())) {
                            c0025d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f285m) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0025d c0025d = (C0025d) this.f286n;
                    for (Map.Entry entry : c0025d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0025d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f285m) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0025d c0025d = (C0025d) this.f286n;
                    for (Map.Entry entry : c0025d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0025d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f285m) {
            case 0:
                return ((Y) this.f286n).f222q;
            case 1:
                return ((C0042v) this.f286n).size();
            default:
                return ((C0025d) this.f286n).f241o.size();
        }
    }

    public C0035n(C0025d c0025d) {
        this.f285m = 2;
        this.f286n = c0025d;
    }
}

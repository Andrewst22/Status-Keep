package D1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* renamed from: D1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022a implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public final Iterator f225m;

    /* renamed from: n  reason: collision with root package name */
    public Object f226n = null;

    /* renamed from: o  reason: collision with root package name */
    public Collection f227o = null;

    /* renamed from: p  reason: collision with root package name */
    public Iterator f228p = O.f209m;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Y f229q;

    public C0022a(Y y3) {
        this.f229q = y3;
        this.f225m = y3.f221p.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f225m.hasNext() && !this.f228p.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f228p.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f225m.next();
            this.f226n = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f227o = collection;
            this.f228p = collection.iterator();
        }
        return this.f228p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f228p.remove();
        Collection collection = this.f227o;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f225m.remove();
        }
        Y y3 = this.f229q;
        y3.f222q--;
    }
}

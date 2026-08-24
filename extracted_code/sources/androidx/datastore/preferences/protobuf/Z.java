package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p.C0721c;
import p.C0723e;
/* loaded from: classes.dex */
public class Z extends AbstractSet {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f4224m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Map f4225n;

    public /* synthetic */ Z(Map map, int i3) {
        this.f4224m = i3;
        this.f4225n = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f4224m) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    Object value = entry.getValue();
                    ((W) this.f4225n).put((Comparable) entry.getKey(), value);
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f4224m) {
            case 0:
                ((W) this.f4225n).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f4224m) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((W) this.f4225n).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f4224m) {
            case 0:
                return new Y((W) this.f4225n);
            default:
                return new C0721c((C0723e) this.f4225n);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f4224m) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((W) this.f4225n).remove(entry.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4224m) {
            case 0:
                return ((W) this.f4225n).size();
            default:
                return ((C0723e) this.f4225n).f8750o;
        }
    }
}

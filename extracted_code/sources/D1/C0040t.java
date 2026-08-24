package D1;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* renamed from: D1.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040t extends AbstractSet {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f300m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ C0042v f301n;

    public /* synthetic */ C0040t(C0042v c0042v, int i3) {
        this.f300m = i3;
        this.f301n = c0042v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f300m) {
            case 0:
                this.f301n.clear();
                return;
            default:
                this.f301n.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f300m) {
            case 0:
                C0042v c0042v = this.f301n;
                Map c3 = c0042v.c();
                if (c3 != null) {
                    return c3.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e2 = c0042v.e(entry.getKey());
                    if (e2 != -1 && android.support.v4.media.session.a.s(c0042v.k()[e2], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f301n.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f300m) {
            case 0:
                C0042v c0042v = this.f301n;
                Map c3 = c0042v.c();
                if (c3 != null) {
                    return c3.entrySet().iterator();
                }
                return new C0039s(c0042v, 1);
            default:
                C0042v c0042v2 = this.f301n;
                Map c4 = c0042v2.c();
                if (c4 != null) {
                    return c4.keySet().iterator();
                }
                return new C0039s(c0042v2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f300m) {
            case 0:
                C0042v c0042v = this.f301n;
                Map c3 = c0042v.c();
                if (c3 != null) {
                    return c3.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0042v.g()) {
                        int d3 = c0042v.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0042v.f306m;
                        Objects.requireNonNull(obj2);
                        int q3 = r.q(key, value, d3, obj2, c0042v.i(), c0042v.j(), c0042v.k());
                        if (q3 != -1) {
                            c0042v.f(q3, d3);
                            c0042v.f311r--;
                            c0042v.f310q += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0042v c0042v2 = this.f301n;
                Map c4 = c0042v2.c();
                if (c4 != null) {
                    return c4.keySet().remove(obj);
                }
                if (c0042v2.h(obj) != C0042v.f305v) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f300m) {
            case 0:
                return this.f301n.size();
            default:
                return this.f301n.size();
        }
    }
}

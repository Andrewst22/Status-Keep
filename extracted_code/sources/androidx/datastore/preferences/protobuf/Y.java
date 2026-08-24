package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class Y implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public int f4220m = -1;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4221n;

    /* renamed from: o  reason: collision with root package name */
    public Iterator f4222o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ W f4223p;

    public Y(W w3) {
        this.f4223p = w3;
    }

    public final Iterator a() {
        if (this.f4222o == null) {
            this.f4222o = this.f4223p.f4213n.entrySet().iterator();
        }
        return this.f4222o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.f4220m + 1;
        W w3 = this.f4223p;
        if (i3 < w3.f4212m.size()) {
            return true;
        }
        if (!w3.f4213n.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f4221n = true;
        int i3 = this.f4220m + 1;
        this.f4220m = i3;
        W w3 = this.f4223p;
        if (i3 < w3.f4212m.size()) {
            return (Map.Entry) w3.f4212m.get(this.f4220m);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f4221n) {
            this.f4221n = false;
            int i3 = W.f4211r;
            W w3 = this.f4223p;
            w3.b();
            if (this.f4220m < w3.f4212m.size()) {
                int i4 = this.f4220m;
                this.f4220m = i4 - 1;
                w3.h(i4);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

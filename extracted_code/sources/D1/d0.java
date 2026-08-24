package D1;

import java.util.Map;
/* loaded from: classes.dex */
public final class d0 extends M {

    /* renamed from: p  reason: collision with root package name */
    public final transient g0 f243p;

    /* renamed from: q  reason: collision with root package name */
    public final transient Object[] f244q;

    /* renamed from: r  reason: collision with root package name */
    public final transient int f245r;

    public d0(g0 g0Var, Object[] objArr, int i3) {
        this.f243p = g0Var;
        this.f244q = objArr;
        this.f245r = i3;
    }

    @Override // D1.D
    public final int b(int i3, Object[] objArr) {
        return a().b(i3, objArr);
    }

    @Override // D1.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f243p.get(key))) {
            return false;
        }
        return true;
    }

    @Override // D1.D
    public final boolean f() {
        return true;
    }

    @Override // D1.D
    public final q0 g() {
        return a().listIterator(0);
    }

    @Override // D1.M
    public final I k() {
        return new c0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f245r;
    }
}

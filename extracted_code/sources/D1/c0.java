package D1;

import a.AbstractC0155a;
import java.util.AbstractMap;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c0 extends I {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d0 f238o;

    public c0(d0 d0Var) {
        this.f238o = d0Var;
    }

    @Override // D1.D
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        d0 d0Var = this.f238o;
        AbstractC0155a.l(i3, d0Var.f245r);
        int i4 = i3 * 2;
        Object[] objArr = d0Var.f244q;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f238o.f245r;
    }
}

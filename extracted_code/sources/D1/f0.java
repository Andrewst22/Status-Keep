package D1;

import a.AbstractC0155a;
import java.util.Objects;
/* loaded from: classes.dex */
public final class f0 extends I {

    /* renamed from: o  reason: collision with root package name */
    public final transient Object[] f251o;

    /* renamed from: p  reason: collision with root package name */
    public final transient int f252p;

    /* renamed from: q  reason: collision with root package name */
    public final transient int f253q;

    public f0(Object[] objArr, int i3, int i4) {
        this.f251o = objArr;
        this.f252p = i3;
        this.f253q = i4;
    }

    @Override // D1.D
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0155a.l(i3, this.f253q);
        Object obj = this.f251o[(i3 * 2) + this.f252p];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f253q;
    }
}

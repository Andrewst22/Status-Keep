package D1;
/* loaded from: classes.dex */
public final class e0 extends M {

    /* renamed from: p  reason: collision with root package name */
    public final transient g0 f248p;

    /* renamed from: q  reason: collision with root package name */
    public final transient f0 f249q;

    public e0(g0 g0Var, f0 f0Var) {
        this.f248p = g0Var;
        this.f249q = f0Var;
    }

    @Override // D1.M, D1.D
    public final I a() {
        return this.f249q;
    }

    @Override // D1.D
    public final int b(int i3, Object[] objArr) {
        return this.f249q.b(i3, objArr);
    }

    @Override // D1.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f248p.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // D1.D
    public final boolean f() {
        return true;
    }

    @Override // D1.D
    public final q0 g() {
        return this.f249q.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f248p.f261r;
    }
}

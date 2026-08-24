package D1;
/* loaded from: classes.dex */
public final class o0 extends M {

    /* renamed from: p  reason: collision with root package name */
    public final transient Object f290p;

    public o0(Object obj) {
        obj.getClass();
        this.f290p = obj;
    }

    @Override // D1.M, D1.D
    public final I a() {
        return I.o(this.f290p);
    }

    @Override // D1.D
    public final int b(int i3, Object[] objArr) {
        objArr[i3] = this.f290p;
        return i3 + 1;
    }

    @Override // D1.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f290p.equals(obj);
    }

    @Override // D1.D
    public final boolean f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D1.P, D1.q0, java.lang.Object] */
    @Override // D1.D
    public final q0 g() {
        ?? obj = new Object();
        obj.f212m = this.f290p;
        return obj;
    }

    @Override // D1.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f290p.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f290p.toString() + ']';
    }
}

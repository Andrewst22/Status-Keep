package U;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2441a;

    /* renamed from: b  reason: collision with root package name */
    public A.i f2442b = new A.i();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2443c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2444d;

    public k(Object obj) {
        this.f2441a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            return this.f2441a.equals(((k) obj).f2441a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2441a.hashCode();
    }
}

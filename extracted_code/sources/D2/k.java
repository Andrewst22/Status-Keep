package D2;
/* loaded from: classes.dex */
public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Class f337a;

    public k(Class cls) {
        this.f337a = cls;
    }

    @Override // D2.d
    public final Class a() {
        return this.f337a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f337a, ((k) obj).f337a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f337a.hashCode();
    }

    public final String toString() {
        return this.f337a + " (Kotlin reflection is not available)";
    }
}

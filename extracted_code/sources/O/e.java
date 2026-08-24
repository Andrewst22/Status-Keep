package O;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f1191a;

    public e(String str) {
        D2.i.e(str, "name");
        this.f1191a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return D2.i.a(this.f1191a, ((e) obj).f1191a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1191a.hashCode();
    }

    public final String toString() {
        return this.f1191a;
    }
}

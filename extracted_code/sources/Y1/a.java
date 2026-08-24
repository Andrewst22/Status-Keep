package Y1;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3415a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3416b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3417c;

    public a(String str, String str2) {
        this.f3415a = str;
        this.f3416b = null;
        this.f3417c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3415a.equals(aVar.f3415a)) {
            return false;
        }
        return this.f3417c.equals(aVar.f3417c);
    }

    public final int hashCode() {
        return this.f3417c.hashCode() + (this.f3415a.hashCode() * 31);
    }

    public final String toString() {
        return "DartEntrypoint( bundle path: " + this.f3415a + ", function: " + this.f3417c + " )";
    }

    public a(String str, String str2, String str3) {
        this.f3415a = str;
        this.f3416b = str2;
        this.f3417c = str3;
    }
}

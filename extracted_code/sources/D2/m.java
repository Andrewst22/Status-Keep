package D2;
/* loaded from: classes.dex */
public abstract class m extends c implements H2.c {

    /* renamed from: s  reason: collision with root package name */
    public final boolean f338s;

    public m(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f338s = false;
    }

    public final H2.a e() {
        if (this.f338s) {
            return this;
        }
        H2.a aVar = this.f323m;
        if (aVar == null) {
            H2.a a3 = a();
            this.f323m = a3;
            return a3;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (d().equals(mVar.d()) && this.f326p.equals(mVar.f326p) && this.f327q.equals(mVar.f327q) && this.f324n.equals(mVar.f324n)) {
                return true;
            }
            return false;
        } else if (!(obj instanceof H2.c)) {
            return false;
        } else {
            return obj.equals(e());
        }
    }

    public final int hashCode() {
        int hashCode = this.f326p.hashCode();
        return this.f327q.hashCode() + ((hashCode + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        H2.a e2 = e();
        if (e2 != this) {
            return e2.toString();
        }
        return "property " + this.f326p + " (Kotlin reflection is not available)";
    }
}

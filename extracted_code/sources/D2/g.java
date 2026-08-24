package D2;

import s2.InterfaceC0802a;
/* loaded from: classes.dex */
public abstract class g extends c implements f, H2.a, InterfaceC0802a {

    /* renamed from: s  reason: collision with root package name */
    public final int f333s;

    /* renamed from: t  reason: collision with root package name */
    public final int f334t;

    public g(int i3, Class cls, String str, String str2, int i4) {
        this(i3, b.f322m, cls, str, str2, i4);
    }

    @Override // D2.c
    public final H2.a a() {
        r.f343a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f326p.equals(gVar.f326p) && this.f327q.equals(gVar.f327q) && this.f334t == gVar.f334t && this.f333s == gVar.f333s && this.f324n.equals(gVar.f324n) && d().equals(gVar.d())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof g)) {
            return false;
        } else {
            H2.a aVar = this.f323m;
            if (aVar == null) {
                a();
                this.f323m = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    @Override // D2.f
    public final int f() {
        return this.f333s;
    }

    public final int hashCode() {
        d();
        int hashCode = this.f326p.hashCode();
        return this.f327q.hashCode() + ((hashCode + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        H2.a aVar = this.f323m;
        if (aVar == null) {
            a();
            this.f323m = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f326p;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f333s = i3;
        this.f334t = 0;
    }
}

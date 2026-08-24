package R;
/* renamed from: R.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114q {

    /* renamed from: a  reason: collision with root package name */
    public final String f1987a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1988b;

    static {
        U.A.H(0);
        U.A.H(1);
    }

    public C0114q(String str, String str2) {
        this.f1987a = U.A.N(str);
        this.f1988b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0114q.class != obj.getClass()) {
            return false;
        }
        C0114q c0114q = (C0114q) obj;
        if (U.A.a(this.f1987a, c0114q.f1987a) && U.A.a(this.f1988b, c0114q.f1988b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = this.f1988b.hashCode() * 31;
        String str = this.f1987a;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return hashCode + i3;
    }
}

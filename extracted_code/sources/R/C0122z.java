package R;

import java.util.Collections;
/* renamed from: R.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122z {

    /* renamed from: a  reason: collision with root package name */
    public final String f2007a;

    /* renamed from: b  reason: collision with root package name */
    public final C0119w f2008b;

    /* renamed from: c  reason: collision with root package name */
    public final C0118v f2009c;

    /* renamed from: d  reason: collision with root package name */
    public final C f2010d;

    /* renamed from: e  reason: collision with root package name */
    public final C0116t f2011e;

    /* renamed from: f  reason: collision with root package name */
    public final C0120x f2012f;

    static {
        r rVar = new r();
        D1.G g3 = D1.I.f197n;
        D1.b0 b0Var = D1.b0.f231q;
        Collections.emptyList();
        D1.b0 b0Var2 = D1.b0.f231q;
        C0117u c0117u = new C0117u();
        C0120x c0120x = C0120x.f2006a;
        rVar.a();
        c0117u.a();
        C c3 = C.f1745y;
        D2.h.m(0, 1, 2, 3, 4);
        U.A.H(5);
    }

    public C0122z(String str, C0116t c0116t, C0119w c0119w, C0118v c0118v, C c3, C0120x c0120x) {
        this.f2007a = str;
        this.f2008b = c0119w;
        this.f2009c = c0118v;
        this.f2010d = c3;
        this.f2011e = c0116t;
        this.f2012f = c0120x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0122z)) {
            return false;
        }
        C0122z c0122z = (C0122z) obj;
        if (U.A.a(this.f2007a, c0122z.f2007a) && this.f2011e.equals(c0122z.f2011e) && U.A.a(this.f2008b, c0122z.f2008b) && this.f2009c.equals(c0122z.f2009c) && U.A.a(this.f2010d, c0122z.f2010d) && U.A.a(this.f2012f, c0122z.f2012f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = this.f2007a.hashCode() * 31;
        C0119w c0119w = this.f2008b;
        if (c0119w != null) {
            i3 = c0119w.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = this.f2009c.hashCode();
        int hashCode3 = this.f2011e.hashCode();
        int hashCode4 = (this.f2010d.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i3) * 31)) * 31)) * 31)) * 31;
        this.f2012f.getClass();
        return hashCode4;
    }
}

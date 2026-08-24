package R;

import D1.g0;
/* loaded from: classes.dex */
public class X {

    /* renamed from: a  reason: collision with root package name */
    public final int f1844a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1845b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1846c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1847d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1848e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1849f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1850g;

    /* renamed from: h  reason: collision with root package name */
    public final D1.b0 f1851h;

    /* renamed from: i  reason: collision with root package name */
    public final D1.b0 f1852i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1853j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1854k;

    /* renamed from: l  reason: collision with root package name */
    public final D1.b0 f1855l;

    /* renamed from: m  reason: collision with root package name */
    public final V f1856m;

    /* renamed from: n  reason: collision with root package name */
    public final D1.b0 f1857n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1858o;

    /* renamed from: p  reason: collision with root package name */
    public final g0 f1859p;

    /* renamed from: q  reason: collision with root package name */
    public final D1.M f1860q;

    static {
        new X(new W());
        U.A.H(1);
        U.A.H(2);
        U.A.H(3);
        U.A.H(4);
        D2.h.m(5, 6, 7, 8, 9);
        D2.h.m(10, 11, 12, 13, 14);
        D2.h.m(15, 16, 17, 18, 19);
        D2.h.m(20, 21, 22, 23, 24);
        D2.h.m(25, 26, 27, 28, 29);
        U.A.H(30);
        U.A.H(31);
    }

    public X(W w3) {
        this.f1844a = w3.f1827a;
        this.f1845b = w3.f1828b;
        this.f1846c = w3.f1829c;
        this.f1847d = w3.f1830d;
        this.f1848e = w3.f1831e;
        this.f1849f = w3.f1832f;
        this.f1850g = w3.f1833g;
        this.f1851h = w3.f1834h;
        this.f1852i = w3.f1835i;
        this.f1853j = w3.f1836j;
        this.f1854k = w3.f1837k;
        this.f1855l = w3.f1838l;
        this.f1856m = w3.f1839m;
        this.f1857n = w3.f1840n;
        this.f1858o = w3.f1841o;
        this.f1859p = g0.a(w3.f1842p);
        this.f1860q = D1.M.j(w3.f1843q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        X x = (X) obj;
        if (this.f1844a == x.f1844a && this.f1845b == x.f1845b && this.f1846c == x.f1846c && this.f1847d == x.f1847d && this.f1850g == x.f1850g && this.f1848e == x.f1848e && this.f1849f == x.f1849f && this.f1851h.equals(x.f1851h) && this.f1852i.equals(x.f1852i) && this.f1853j == x.f1853j && this.f1854k == x.f1854k && this.f1855l.equals(x.f1855l) && this.f1856m.equals(x.f1856m) && this.f1857n.equals(x.f1857n) && this.f1858o == x.f1858o) {
            g0 g0Var = this.f1859p;
            g0Var.getClass();
            if (D1.r.h(g0Var, x.f1859p) && this.f1860q.equals(x.f1860q)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f1851h.hashCode();
        int hashCode2 = this.f1852i.hashCode();
        int hashCode3 = this.f1855l.hashCode();
        this.f1856m.getClass();
        int hashCode4 = this.f1857n.hashCode();
        int hashCode5 = this.f1859p.hashCode();
        return this.f1860q.hashCode() + ((hashCode5 + ((((hashCode4 + ((((hashCode3 + ((((((hashCode2 + ((hashCode + ((((((((((((((this.f1844a + 31) * 31) + this.f1845b) * 31) + this.f1846c) * 31) + this.f1847d) * 28629151) + (this.f1850g ? 1 : 0)) * 31) + this.f1848e) * 31) + this.f1849f) * 31)) * 961)) * 961) + this.f1853j) * 31) + this.f1854k) * 31)) * 31) + 29791) * 31)) * 31) + this.f1858o) * 887503681)) * 31);
    }
}

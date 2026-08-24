package R;

import U.AbstractC0123a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* renamed from: R.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113p {

    /* renamed from: A  reason: collision with root package name */
    public final int f1951A;

    /* renamed from: B  reason: collision with root package name */
    public final int f1952B;

    /* renamed from: C  reason: collision with root package name */
    public final int f1953C;

    /* renamed from: D  reason: collision with root package name */
    public final int f1954D;

    /* renamed from: E  reason: collision with root package name */
    public final int f1955E;

    /* renamed from: F  reason: collision with root package name */
    public final int f1956F;

    /* renamed from: G  reason: collision with root package name */
    public final int f1957G;

    /* renamed from: H  reason: collision with root package name */
    public final int f1958H;

    /* renamed from: I  reason: collision with root package name */
    public final int f1959I;

    /* renamed from: J  reason: collision with root package name */
    public final int f1960J;

    /* renamed from: K  reason: collision with root package name */
    public int f1961K;

    /* renamed from: a  reason: collision with root package name */
    public final String f1962a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1963b;

    /* renamed from: c  reason: collision with root package name */
    public final D1.I f1964c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1965d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1966e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1967f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1968g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1969h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1970i;

    /* renamed from: j  reason: collision with root package name */
    public final String f1971j;

    /* renamed from: k  reason: collision with root package name */
    public final F f1972k;

    /* renamed from: l  reason: collision with root package name */
    public final String f1973l;

    /* renamed from: m  reason: collision with root package name */
    public final String f1974m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1975n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1976o;

    /* renamed from: p  reason: collision with root package name */
    public final List f1977p;

    /* renamed from: q  reason: collision with root package name */
    public final C0110m f1978q;

    /* renamed from: r  reason: collision with root package name */
    public final long f1979r;

    /* renamed from: s  reason: collision with root package name */
    public final int f1980s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1981t;

    /* renamed from: u  reason: collision with root package name */
    public final float f1982u;

    /* renamed from: v  reason: collision with root package name */
    public final int f1983v;

    /* renamed from: w  reason: collision with root package name */
    public final float f1984w;
    public final byte[] x;

    /* renamed from: y  reason: collision with root package name */
    public final int f1985y;

    /* renamed from: z  reason: collision with root package name */
    public final C0106i f1986z;

    static {
        new C0112o().a();
        U.A.H(0);
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
        U.A.H(32);
    }

    public C0113p(C0112o c0112o) {
        boolean z3;
        String str;
        this.f1962a = c0112o.f1926a;
        String N3 = U.A.N(c0112o.f1929d);
        this.f1965d = N3;
        if (c0112o.f1928c.isEmpty() && c0112o.f1927b != null) {
            this.f1964c = D1.I.o(new C0114q(N3, c0112o.f1927b));
            this.f1963b = c0112o.f1927b;
        } else if (!c0112o.f1928c.isEmpty() && c0112o.f1927b == null) {
            D1.I i3 = c0112o.f1928c;
            this.f1964c = i3;
            Iterator it = i3.iterator();
            while (true) {
                if (it.hasNext()) {
                    C0114q c0114q = (C0114q) it.next();
                    if (TextUtils.equals(c0114q.f1987a, N3)) {
                        str = c0114q.f1988b;
                        break;
                    }
                } else {
                    str = ((C0114q) i3.get(0)).f1988b;
                    break;
                }
            }
            this.f1963b = str;
        } else {
            if (!c0112o.f1928c.isEmpty() || c0112o.f1927b != null) {
                for (int i4 = 0; i4 < c0112o.f1928c.size(); i4++) {
                    if (!((C0114q) c0112o.f1928c.get(i4)).f1988b.equals(c0112o.f1927b)) {
                    }
                }
                z3 = false;
                AbstractC0123a.j(z3);
                this.f1964c = c0112o.f1928c;
                this.f1963b = c0112o.f1927b;
            }
            z3 = true;
            AbstractC0123a.j(z3);
            this.f1964c = c0112o.f1928c;
            this.f1963b = c0112o.f1927b;
        }
        this.f1966e = c0112o.f1930e;
        this.f1967f = c0112o.f1931f;
        int i5 = c0112o.f1932g;
        this.f1968g = i5;
        int i6 = c0112o.f1933h;
        this.f1969h = i6;
        this.f1970i = i6 != -1 ? i6 : i5;
        this.f1971j = c0112o.f1934i;
        this.f1972k = c0112o.f1935j;
        this.f1973l = c0112o.f1936k;
        this.f1974m = c0112o.f1937l;
        this.f1975n = c0112o.f1938m;
        this.f1976o = c0112o.f1939n;
        List list = c0112o.f1940o;
        this.f1977p = list == null ? Collections.emptyList() : list;
        C0110m c0110m = c0112o.f1941p;
        this.f1978q = c0110m;
        this.f1979r = c0112o.f1942q;
        this.f1980s = c0112o.f1943r;
        this.f1981t = c0112o.f1944s;
        this.f1982u = c0112o.f1945t;
        int i7 = c0112o.f1946u;
        this.f1983v = i7 == -1 ? 0 : i7;
        float f3 = c0112o.f1947v;
        this.f1984w = f3 == -1.0f ? 1.0f : f3;
        this.x = c0112o.f1948w;
        this.f1985y = c0112o.x;
        this.f1986z = c0112o.f1949y;
        this.f1951A = c0112o.f1950z;
        this.f1952B = c0112o.f1917A;
        this.f1953C = c0112o.f1918B;
        int i8 = c0112o.f1919C;
        this.f1954D = i8 == -1 ? 0 : i8;
        int i9 = c0112o.f1920D;
        this.f1955E = i9 != -1 ? i9 : 0;
        this.f1956F = c0112o.f1921E;
        this.f1957G = c0112o.f1922F;
        this.f1958H = c0112o.f1923G;
        this.f1959I = c0112o.f1924H;
        int i10 = c0112o.f1925I;
        if (i10 == 0 && c0110m != null) {
            this.f1960J = 1;
        } else {
            this.f1960J = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R.o, java.lang.Object] */
    public final C0112o a() {
        ?? obj = new Object();
        obj.f1926a = this.f1962a;
        obj.f1927b = this.f1963b;
        obj.f1928c = this.f1964c;
        obj.f1929d = this.f1965d;
        obj.f1930e = this.f1966e;
        obj.f1931f = this.f1967f;
        obj.f1932g = this.f1968g;
        obj.f1933h = this.f1969h;
        obj.f1934i = this.f1971j;
        obj.f1935j = this.f1972k;
        obj.f1936k = this.f1973l;
        obj.f1937l = this.f1974m;
        obj.f1938m = this.f1975n;
        obj.f1939n = this.f1976o;
        obj.f1940o = this.f1977p;
        obj.f1941p = this.f1978q;
        obj.f1942q = this.f1979r;
        obj.f1943r = this.f1980s;
        obj.f1944s = this.f1981t;
        obj.f1945t = this.f1982u;
        obj.f1946u = this.f1983v;
        obj.f1947v = this.f1984w;
        obj.f1948w = this.x;
        obj.x = this.f1985y;
        obj.f1949y = this.f1986z;
        obj.f1950z = this.f1951A;
        obj.f1917A = this.f1952B;
        obj.f1918B = this.f1953C;
        obj.f1919C = this.f1954D;
        obj.f1920D = this.f1955E;
        obj.f1921E = this.f1956F;
        obj.f1922F = this.f1957G;
        obj.f1923G = this.f1958H;
        obj.f1924H = this.f1959I;
        obj.f1925I = this.f1960J;
        return obj;
    }

    public final int b() {
        int i3;
        int i4 = this.f1980s;
        if (i4 == -1 || (i3 = this.f1981t) == -1) {
            return -1;
        }
        return i4 * i3;
    }

    public final boolean c(C0113p c0113p) {
        List list = this.f1977p;
        if (list.size() != c0113p.f1977p.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) c0113p.f1977p.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final C0113p d(C0113p c0113p) {
        String str;
        float f3;
        String str2;
        C0110m c0110m;
        int i3;
        int i4;
        if (this == c0113p) {
            return this;
        }
        int g3 = G.g(this.f1974m);
        String str3 = c0113p.f1962a;
        String str4 = c0113p.f1963b;
        if (str4 == null) {
            str4 = this.f1963b;
        }
        D1.I i5 = c0113p.f1964c;
        if (i5.isEmpty()) {
            i5 = this.f1964c;
        }
        if ((g3 != 3 && g3 != 1) || (str = c0113p.f1965d) == null) {
            str = this.f1965d;
        }
        int i6 = this.f1968g;
        if (i6 == -1) {
            i6 = c0113p.f1968g;
        }
        int i7 = this.f1969h;
        if (i7 == -1) {
            i7 = c0113p.f1969h;
        }
        String str5 = this.f1971j;
        if (str5 == null) {
            String v3 = U.A.v(c0113p.f1971j, g3);
            if (U.A.X(v3).length == 1) {
                str5 = v3;
            }
        }
        F f4 = c0113p.f1972k;
        F f5 = this.f1972k;
        if (f5 != null) {
            f4 = f5.e(f4);
        }
        float f6 = this.f1982u;
        if (f6 == -1.0f && g3 == 2) {
            f6 = c0113p.f1982u;
        }
        int i8 = this.f1966e | c0113p.f1966e;
        int i9 = this.f1967f | c0113p.f1967f;
        ArrayList arrayList = new ArrayList();
        C0110m c0110m2 = c0113p.f1978q;
        if (c0110m2 != null) {
            C0109l[] c0109lArr = c0110m2.f1912m;
            int length = c0109lArr.length;
            f3 = f6;
            int i10 = 0;
            while (i10 < length) {
                int i11 = length;
                C0109l c0109l = c0109lArr[i10];
                C0109l[] c0109lArr2 = c0109lArr;
                if (c0109l.f1911q != null) {
                    arrayList.add(c0109l);
                }
                i10++;
                length = i11;
                c0109lArr = c0109lArr2;
            }
            str2 = c0110m2.f1914o;
        } else {
            f3 = f6;
            str2 = null;
        }
        C0110m c0110m3 = this.f1978q;
        if (c0110m3 != null) {
            if (str2 == null) {
                str2 = c0110m3.f1914o;
            }
            int size = arrayList.size();
            C0109l[] c0109lArr3 = c0110m3.f1912m;
            int length2 = c0109lArr3.length;
            int i12 = 0;
            while (true) {
                String str6 = str2;
                if (i12 >= length2) {
                    break;
                }
                C0109l c0109l2 = c0109lArr3[i12];
                C0109l[] c0109lArr4 = c0109lArr3;
                if (c0109l2.f1911q != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            i3 = size;
                            i4 = length2;
                            if (((C0109l) arrayList.get(i13)).f1908n.equals(c0109l2.f1908n)) {
                                break;
                            }
                            i13++;
                            length2 = i4;
                            size = i3;
                        } else {
                            i3 = size;
                            i4 = length2;
                            arrayList.add(c0109l2);
                            break;
                        }
                    }
                } else {
                    i3 = size;
                    i4 = length2;
                }
                i12++;
                str2 = str6;
                c0109lArr3 = c0109lArr4;
                length2 = i4;
                size = i3;
            }
        }
        if (arrayList.isEmpty()) {
            c0110m = null;
        } else {
            c0110m = new C0110m(str2, arrayList);
        }
        C0112o a3 = a();
        a3.f1926a = str3;
        a3.f1927b = str4;
        a3.f1928c = D1.I.j(i5);
        a3.f1929d = str;
        a3.f1930e = i8;
        a3.f1931f = i9;
        a3.f1932g = i6;
        a3.f1933h = i7;
        a3.f1934i = str5;
        a3.f1935j = f4;
        a3.f1941p = c0110m;
        a3.f1945t = f3;
        a3.f1923G = c0113p.f1958H;
        a3.f1924H = c0113p.f1959I;
        return new C0113p(a3);
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0113p.class != obj.getClass()) {
            return false;
        }
        C0113p c0113p = (C0113p) obj;
        int i4 = this.f1961K;
        if ((i4 == 0 || (i3 = c0113p.f1961K) == 0 || i4 == i3) && this.f1966e == c0113p.f1966e && this.f1967f == c0113p.f1967f && this.f1968g == c0113p.f1968g && this.f1969h == c0113p.f1969h && this.f1975n == c0113p.f1975n && this.f1979r == c0113p.f1979r && this.f1980s == c0113p.f1980s && this.f1981t == c0113p.f1981t && this.f1983v == c0113p.f1983v && this.f1985y == c0113p.f1985y && this.f1951A == c0113p.f1951A && this.f1952B == c0113p.f1952B && this.f1953C == c0113p.f1953C && this.f1954D == c0113p.f1954D && this.f1955E == c0113p.f1955E && this.f1956F == c0113p.f1956F && this.f1958H == c0113p.f1958H && this.f1959I == c0113p.f1959I && this.f1960J == c0113p.f1960J && Float.compare(this.f1982u, c0113p.f1982u) == 0 && Float.compare(this.f1984w, c0113p.f1984w) == 0 && Objects.equals(this.f1962a, c0113p.f1962a) && Objects.equals(this.f1963b, c0113p.f1963b) && this.f1964c.equals(c0113p.f1964c) && Objects.equals(this.f1971j, c0113p.f1971j) && Objects.equals(this.f1973l, c0113p.f1973l) && Objects.equals(this.f1974m, c0113p.f1974m) && Objects.equals(this.f1965d, c0113p.f1965d) && Arrays.equals(this.x, c0113p.x) && Objects.equals(this.f1972k, c0113p.f1972k) && Objects.equals(this.f1986z, c0113p.f1986z) && Objects.equals(this.f1978q, c0113p.f1978q) && c(c0113p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.f1961K == 0) {
            int i3 = 0;
            String str = this.f1962a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i4 = (527 + hashCode) * 31;
            String str2 = this.f1963b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.f1964c.hashCode() + ((i4 + hashCode2) * 31)) * 31;
            String str3 = this.f1965d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i5 = (((((((((hashCode7 + hashCode3) * 31) + this.f1966e) * 31) + this.f1967f) * 31) + this.f1968g) * 31) + this.f1969h) * 31;
            String str4 = this.f1971j;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i6 = (i5 + hashCode4) * 31;
            F f3 = this.f1972k;
            if (f3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = f3.hashCode();
            }
            int i7 = (i6 + hashCode5) * 961;
            String str5 = this.f1973l;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i8 = (i7 + hashCode6) * 31;
            String str6 = this.f1974m;
            if (str6 != null) {
                i3 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.f1982u);
            this.f1961K = ((((((((((((((((((((Float.floatToIntBits(this.f1984w) + ((((floatToIntBits + ((((((((((i8 + i3) * 31) + this.f1975n) * 31) + ((int) this.f1979r)) * 31) + this.f1980s) * 31) + this.f1981t) * 31)) * 31) + this.f1983v) * 31)) * 31) + this.f1985y) * 31) + this.f1951A) * 31) + this.f1952B) * 31) + this.f1953C) * 31) + this.f1954D) * 31) + this.f1955E) * 31) + this.f1956F) * 31) + this.f1958H) * 31) + this.f1959I) * 31) + this.f1960J;
        }
        return this.f1961K;
    }

    public final String toString() {
        return "Format(" + this.f1962a + ", " + this.f1963b + ", " + this.f1973l + ", " + this.f1974m + ", " + this.f1971j + ", " + this.f1970i + ", " + this.f1965d + ", [" + this.f1980s + ", " + this.f1981t + ", " + this.f1982u + ", " + this.f1986z + "], [" + this.f1951A + ", " + this.f1952B + "])";
    }
}

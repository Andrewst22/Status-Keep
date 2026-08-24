package R;

import U.AbstractC0123a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final int f1821a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1822b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1823c;

    /* renamed from: d  reason: collision with root package name */
    public final C0113p[] f1824d;

    /* renamed from: e  reason: collision with root package name */
    public int f1825e;

    static {
        U.A.H(0);
        U.A.H(1);
    }

    public U(String str, C0113p... c0113pArr) {
        boolean z3;
        if (c0113pArr.length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        this.f1822b = str;
        this.f1824d = c0113pArr;
        this.f1821a = c0113pArr.length;
        int g3 = G.g(c0113pArr[0].f1974m);
        this.f1823c = g3 == -1 ? G.g(c0113pArr[0].f1973l) : g3;
        String str2 = c0113pArr[0].f1965d;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i3 = c0113pArr[0].f1967f | 16384;
        for (int i4 = 1; i4 < c0113pArr.length; i4++) {
            String str3 = c0113pArr[i4].f1965d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                c(i4, "languages", c0113pArr[0].f1965d, c0113pArr[i4].f1965d);
                return;
            } else if (i3 != (c0113pArr[i4].f1967f | 16384)) {
                c(i4, "role flags", Integer.toBinaryString(c0113pArr[0].f1967f), Integer.toBinaryString(c0113pArr[i4].f1967f));
                return;
            }
        }
    }

    public static void c(int i3, String str, String str2, String str3) {
        AbstractC0123a.o("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i3 + ")"));
    }

    public final C0113p a() {
        return this.f1824d[0];
    }

    public final int b(C0113p c0113p) {
        int i3 = 0;
        while (true) {
            C0113p[] c0113pArr = this.f1824d;
            if (i3 < c0113pArr.length) {
                if (c0113p == c0113pArr[i3]) {
                    return i3;
                }
                i3++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        U u3 = (U) obj;
        if (this.f1822b.equals(u3.f1822b) && Arrays.equals(this.f1824d, u3.f1824d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1825e == 0) {
            this.f1825e = Arrays.hashCode(this.f1824d) + ((this.f1822b.hashCode() + 527) * 31);
        }
        return this.f1825e;
    }
}

package R;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: q  reason: collision with root package name */
    public static final Object f1802q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static final C0122z f1803r;

    /* renamed from: b  reason: collision with root package name */
    public Object f1805b;

    /* renamed from: d  reason: collision with root package name */
    public Object f1807d;

    /* renamed from: e  reason: collision with root package name */
    public long f1808e;

    /* renamed from: f  reason: collision with root package name */
    public long f1809f;

    /* renamed from: g  reason: collision with root package name */
    public long f1810g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1811h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1812i;

    /* renamed from: j  reason: collision with root package name */
    public C0118v f1813j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1814k;

    /* renamed from: l  reason: collision with root package name */
    public long f1815l;

    /* renamed from: m  reason: collision with root package name */
    public long f1816m;

    /* renamed from: n  reason: collision with root package name */
    public int f1817n;

    /* renamed from: o  reason: collision with root package name */
    public int f1818o;

    /* renamed from: p  reason: collision with root package name */
    public long f1819p;

    /* renamed from: a  reason: collision with root package name */
    public Object f1804a = f1802q;

    /* renamed from: c  reason: collision with root package name */
    public C0122z f1806c = f1803r;

    /* JADX WARN: Type inference failed for: r10v0, types: [R.s, R.t] */
    static {
        C0119w c0119w;
        r rVar = new r();
        D1.G g3 = D1.I.f197n;
        D1.b0 b0Var = D1.b0.f231q;
        List emptyList = Collections.emptyList();
        D1.b0 b0Var2 = D1.b0.f231q;
        C0117u c0117u = new C0117u();
        C0120x c0120x = C0120x.f2006a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            c0119w = new C0119w(uri, null, null, emptyList, b0Var2, -9223372036854775807L);
        } else {
            c0119w = null;
        }
        f1803r = new C0122z("androidx.media3.common.Timeline", new C0115s(rVar), c0119w, new C0118v(c0117u), C.f1745y, c0120x);
        D2.h.m(1, 2, 3, 4, 5);
        D2.h.m(6, 7, 8, 9, 10);
        U.A.H(11);
        U.A.H(12);
        U.A.H(13);
    }

    public final boolean a() {
        if (this.f1813j != null) {
            return true;
        }
        return false;
    }

    public final void b(C0122z c0122z, Object obj, long j3, long j4, long j5, boolean z3, boolean z4, C0118v c0118v, long j6, long j7, int i3, long j8) {
        C0122z c0122z2;
        this.f1804a = f1802q;
        if (c0122z != null) {
            c0122z2 = c0122z;
        } else {
            c0122z2 = f1803r;
        }
        this.f1806c = c0122z2;
        if (c0122z != null) {
            C0119w c0119w = c0122z.f2008b;
        }
        this.f1807d = obj;
        this.f1808e = j3;
        this.f1809f = j4;
        this.f1810g = j5;
        this.f1811h = z3;
        this.f1812i = z4;
        this.f1813j = c0118v;
        this.f1815l = j6;
        this.f1816m = j7;
        this.f1817n = 0;
        this.f1818o = i3;
        this.f1819p = j8;
        this.f1814k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !S.class.equals(obj.getClass())) {
            return false;
        }
        S s3 = (S) obj;
        if (U.A.a(this.f1804a, s3.f1804a) && U.A.a(this.f1806c, s3.f1806c) && U.A.a(this.f1807d, s3.f1807d) && U.A.a(this.f1813j, s3.f1813j) && this.f1808e == s3.f1808e && this.f1809f == s3.f1809f && this.f1810g == s3.f1810g && this.f1811h == s3.f1811h && this.f1812i == s3.f1812i && this.f1814k == s3.f1814k && this.f1815l == s3.f1815l && this.f1816m == s3.f1816m && this.f1817n == s3.f1817n && this.f1818o == s3.f1818o && this.f1819p == s3.f1819p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1806c.hashCode() + ((this.f1804a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f1807d;
        int i3 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i4 = (hashCode2 + hashCode) * 31;
        C0118v c0118v = this.f1813j;
        if (c0118v != null) {
            i3 = c0118v.hashCode();
        }
        long j3 = this.f1808e;
        long j4 = this.f1809f;
        long j5 = this.f1810g;
        long j6 = this.f1815l;
        long j7 = this.f1816m;
        long j8 = this.f1819p;
        return ((((((((((((((((((((((i4 + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f1811h ? 1 : 0)) * 31) + (this.f1812i ? 1 : 0)) * 31) + (this.f1814k ? 1 : 0)) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f1817n) * 31) + this.f1818o) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }
}

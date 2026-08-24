package R;

import U.AbstractC0123a;
import android.net.Uri;
import java.util.Arrays;
/* renamed from: R.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098a {

    /* renamed from: a  reason: collision with root package name */
    public final int f1868a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1869b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri[] f1870c;

    /* renamed from: d  reason: collision with root package name */
    public final C0122z[] f1871d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1872e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f1873f;

    static {
        D2.h.m(0, 1, 2, 3, 4);
        U.A.H(5);
        U.A.H(6);
        U.A.H(7);
        U.A.H(8);
    }

    public C0098a(int i3, int i4, int[] iArr, C0122z[] c0122zArr, long[] jArr) {
        boolean z3;
        Uri uri;
        int i5 = 0;
        if (iArr.length == c0122zArr.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        this.f1868a = i3;
        this.f1869b = i4;
        this.f1872e = iArr;
        this.f1871d = c0122zArr;
        this.f1873f = jArr;
        this.f1870c = new Uri[c0122zArr.length];
        while (true) {
            Uri[] uriArr = this.f1870c;
            if (i5 < uriArr.length) {
                C0122z c0122z = c0122zArr[i5];
                if (c0122z == null) {
                    uri = null;
                } else {
                    C0119w c0119w = c0122z.f2008b;
                    c0119w.getClass();
                    uri = c0119w.f2001a;
                }
                uriArr[i5] = uri;
                i5++;
            } else {
                return;
            }
        }
    }

    public final int a(int i3) {
        int i4;
        int i5 = i3 + 1;
        while (true) {
            int[] iArr = this.f1872e;
            if (i5 >= iArr.length || (i4 = iArr[i5]) == 0 || i4 == 1) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0098a.class != obj.getClass()) {
            return false;
        }
        C0098a c0098a = (C0098a) obj;
        if (this.f1868a == c0098a.f1868a && this.f1869b == c0098a.f1869b && Arrays.equals(this.f1871d, c0098a.f1871d) && Arrays.equals(this.f1872e, c0098a.f1872e) && Arrays.equals(this.f1873f, c0098a.f1873f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (int) 0;
        int hashCode = Arrays.hashCode(this.f1871d);
        int hashCode2 = Arrays.hashCode(this.f1872e);
        return (((Arrays.hashCode(this.f1873f) + ((hashCode2 + ((hashCode + (((((this.f1868a * 31) + this.f1869b) * 31) + i3) * 31)) * 31)) * 31)) * 31) + i3) * 31;
    }
}

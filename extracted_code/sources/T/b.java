package T;

import U.A;
import U.AbstractC0123a;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: A  reason: collision with root package name */
    public static final String f2245A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f2246B;

    /* renamed from: C  reason: collision with root package name */
    public static final String f2247C;

    /* renamed from: D  reason: collision with root package name */
    public static final String f2248D;

    /* renamed from: E  reason: collision with root package name */
    public static final String f2249E;

    /* renamed from: F  reason: collision with root package name */
    public static final String f2250F;

    /* renamed from: G  reason: collision with root package name */
    public static final String f2251G;

    /* renamed from: H  reason: collision with root package name */
    public static final String f2252H;

    /* renamed from: I  reason: collision with root package name */
    public static final String f2253I;

    /* renamed from: J  reason: collision with root package name */
    public static final String f2254J;

    /* renamed from: r  reason: collision with root package name */
    public static final String f2255r;

    /* renamed from: s  reason: collision with root package name */
    public static final String f2256s;

    /* renamed from: t  reason: collision with root package name */
    public static final String f2257t;

    /* renamed from: u  reason: collision with root package name */
    public static final String f2258u;

    /* renamed from: v  reason: collision with root package name */
    public static final String f2259v;

    /* renamed from: w  reason: collision with root package name */
    public static final String f2260w;
    public static final String x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f2261y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f2262z;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f2263a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f2264b;

    /* renamed from: c  reason: collision with root package name */
    public final Layout.Alignment f2265c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f2266d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2267e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2268f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2269g;

    /* renamed from: h  reason: collision with root package name */
    public final float f2270h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2271i;

    /* renamed from: j  reason: collision with root package name */
    public final float f2272j;

    /* renamed from: k  reason: collision with root package name */
    public final float f2273k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2274l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2275m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2276n;

    /* renamed from: o  reason: collision with root package name */
    public final float f2277o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2278p;

    /* renamed from: q  reason: collision with root package name */
    public final float f2279q;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i3 = A.f2405a;
        f2255r = Integer.toString(0, 36);
        f2256s = Integer.toString(17, 36);
        f2257t = Integer.toString(1, 36);
        f2258u = Integer.toString(2, 36);
        f2259v = Integer.toString(3, 36);
        f2260w = Integer.toString(18, 36);
        x = Integer.toString(4, 36);
        f2261y = Integer.toString(5, 36);
        f2262z = Integer.toString(6, 36);
        f2245A = Integer.toString(7, 36);
        f2246B = Integer.toString(8, 36);
        f2247C = Integer.toString(9, 36);
        f2248D = Integer.toString(10, 36);
        f2249E = Integer.toString(11, 36);
        f2250F = Integer.toString(12, 36);
        f2251G = Integer.toString(13, 36);
        f2252H = Integer.toString(14, 36);
        f2253I = Integer.toString(15, 36);
        f2254J = Integer.toString(16, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f3, int i3, int i4, float f4, int i5, int i6, float f5, float f6, float f7, boolean z3, int i7, int i8, float f8) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0123a.e(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f2263a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f2263a = charSequence.toString();
        } else {
            this.f2263a = null;
        }
        this.f2264b = alignment;
        this.f2265c = alignment2;
        this.f2266d = bitmap;
        this.f2267e = f3;
        this.f2268f = i3;
        this.f2269g = i4;
        this.f2270h = f4;
        this.f2271i = i5;
        this.f2272j = f6;
        this.f2273k = f7;
        this.f2274l = z3;
        this.f2275m = i7;
        this.f2276n = i6;
        this.f2277o = f5;
        this.f2278p = i8;
        this.f2279q = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f2263a, bVar.f2263a) && this.f2264b == bVar.f2264b && this.f2265c == bVar.f2265c) {
            Bitmap bitmap = bVar.f2266d;
            Bitmap bitmap2 = this.f2266d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f2267e == bVar.f2267e && this.f2268f == bVar.f2268f && this.f2269g == bVar.f2269g && this.f2270h == bVar.f2270h && this.f2271i == bVar.f2271i && this.f2272j == bVar.f2272j && this.f2273k == bVar.f2273k && this.f2274l == bVar.f2274l && this.f2275m == bVar.f2275m && this.f2276n == bVar.f2276n && this.f2277o == bVar.f2277o && this.f2278p == bVar.f2278p && this.f2279q == bVar.f2279q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2263a, this.f2264b, this.f2265c, this.f2266d, Float.valueOf(this.f2267e), Integer.valueOf(this.f2268f), Integer.valueOf(this.f2269g), Float.valueOf(this.f2270h), Integer.valueOf(this.f2271i), Float.valueOf(this.f2272j), Float.valueOf(this.f2273k), Boolean.valueOf(this.f2274l), Integer.valueOf(this.f2275m), Integer.valueOf(this.f2276n), Float.valueOf(this.f2277o), Integer.valueOf(this.f2278p), Float.valueOf(this.f2279q)});
    }
}

package n0;

import R.C0113p;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f8343a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8344b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8345c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8346d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8347e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8348f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8349g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8350h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8351i;

    /* renamed from: j  reason: collision with root package name */
    public final C0113p[] f8352j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8353k;

    /* renamed from: l  reason: collision with root package name */
    public final String f8354l;

    /* renamed from: m  reason: collision with root package name */
    public final String f8355m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f8356n;

    /* renamed from: o  reason: collision with root package name */
    public final long[] f8357o;

    /* renamed from: p  reason: collision with root package name */
    public final long f8358p;

    public b(String str, String str2, int i3, String str3, long j3, String str4, int i4, int i5, int i6, int i7, String str5, C0113p[] c0113pArr, ArrayList arrayList, long[] jArr, long j4) {
        this.f8354l = str;
        this.f8355m = str2;
        this.f8343a = i3;
        this.f8344b = str3;
        this.f8345c = j3;
        this.f8346d = str4;
        this.f8347e = i4;
        this.f8348f = i5;
        this.f8349g = i6;
        this.f8350h = i7;
        this.f8351i = str5;
        this.f8352j = c0113pArr;
        this.f8356n = arrayList;
        this.f8357o = jArr;
        this.f8358p = j4;
        this.f8353k = arrayList.size();
    }

    public final b a(C0113p[] c0113pArr) {
        long[] jArr = this.f8357o;
        return new b(this.f8354l, this.f8355m, this.f8343a, this.f8344b, this.f8345c, this.f8346d, this.f8347e, this.f8348f, this.f8349g, this.f8350h, this.f8351i, c0113pArr, this.f8356n, jArr, this.f8358p);
    }

    public final long b(int i3) {
        if (i3 == this.f8353k - 1) {
            return this.f8358p;
        }
        long[] jArr = this.f8357o;
        return jArr[i3 + 1] - jArr[i3];
    }
}

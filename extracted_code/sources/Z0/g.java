package Z0;

import android.text.Layout;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f3575a;

    /* renamed from: b  reason: collision with root package name */
    public int f3576b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3577c;

    /* renamed from: d  reason: collision with root package name */
    public int f3578d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3579e;

    /* renamed from: k  reason: collision with root package name */
    public float f3585k;

    /* renamed from: l  reason: collision with root package name */
    public String f3586l;

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f3589o;

    /* renamed from: p  reason: collision with root package name */
    public Layout.Alignment f3590p;

    /* renamed from: r  reason: collision with root package name */
    public b f3592r;

    /* renamed from: f  reason: collision with root package name */
    public int f3580f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f3581g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f3582h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f3583i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f3584j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f3587m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f3588n = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f3591q = -1;

    /* renamed from: s  reason: collision with root package name */
    public float f3593s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f3577c && gVar.f3577c) {
                this.f3576b = gVar.f3576b;
                this.f3577c = true;
            }
            if (this.f3582h == -1) {
                this.f3582h = gVar.f3582h;
            }
            if (this.f3583i == -1) {
                this.f3583i = gVar.f3583i;
            }
            if (this.f3575a == null && (str = gVar.f3575a) != null) {
                this.f3575a = str;
            }
            if (this.f3580f == -1) {
                this.f3580f = gVar.f3580f;
            }
            if (this.f3581g == -1) {
                this.f3581g = gVar.f3581g;
            }
            if (this.f3588n == -1) {
                this.f3588n = gVar.f3588n;
            }
            if (this.f3589o == null && (alignment2 = gVar.f3589o) != null) {
                this.f3589o = alignment2;
            }
            if (this.f3590p == null && (alignment = gVar.f3590p) != null) {
                this.f3590p = alignment;
            }
            if (this.f3591q == -1) {
                this.f3591q = gVar.f3591q;
            }
            if (this.f3584j == -1) {
                this.f3584j = gVar.f3584j;
                this.f3585k = gVar.f3585k;
            }
            if (this.f3592r == null) {
                this.f3592r = gVar.f3592r;
            }
            if (this.f3593s == Float.MAX_VALUE) {
                this.f3593s = gVar.f3593s;
            }
            if (!this.f3579e && gVar.f3579e) {
                this.f3578d = gVar.f3578d;
                this.f3579e = true;
            }
            if (this.f3587m == -1 && (i3 = gVar.f3587m) != -1) {
                this.f3587m = i3;
            }
        }
    }
}

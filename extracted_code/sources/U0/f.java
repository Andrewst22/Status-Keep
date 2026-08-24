package U0;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: A  reason: collision with root package name */
    public static final boolean[] f2532A;

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f2533B;

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f2534C;

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f2535D;

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f2536E;

    /* renamed from: v  reason: collision with root package name */
    public static final int f2537v = c(2, 2, 2, 0);

    /* renamed from: w  reason: collision with root package name */
    public static final int f2538w;
    public static final int[] x;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f2539y;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2540z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2541a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final SpannableStringBuilder f2542b = new SpannableStringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2543c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2544d;

    /* renamed from: e  reason: collision with root package name */
    public int f2545e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2546f;

    /* renamed from: g  reason: collision with root package name */
    public int f2547g;

    /* renamed from: h  reason: collision with root package name */
    public int f2548h;

    /* renamed from: i  reason: collision with root package name */
    public int f2549i;

    /* renamed from: j  reason: collision with root package name */
    public int f2550j;

    /* renamed from: k  reason: collision with root package name */
    public int f2551k;

    /* renamed from: l  reason: collision with root package name */
    public int f2552l;

    /* renamed from: m  reason: collision with root package name */
    public int f2553m;

    /* renamed from: n  reason: collision with root package name */
    public int f2554n;

    /* renamed from: o  reason: collision with root package name */
    public int f2555o;

    /* renamed from: p  reason: collision with root package name */
    public int f2556p;

    /* renamed from: q  reason: collision with root package name */
    public int f2557q;

    /* renamed from: r  reason: collision with root package name */
    public int f2558r;

    /* renamed from: s  reason: collision with root package name */
    public int f2559s;

    /* renamed from: t  reason: collision with root package name */
    public int f2560t;

    /* renamed from: u  reason: collision with root package name */
    public int f2561u;

    static {
        int c3 = c(0, 0, 0, 0);
        f2538w = c3;
        int c4 = c(0, 0, 0, 3);
        x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f2539y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f2540z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f2532A = new boolean[]{false, false, false, true, true, true, false};
        f2533B = new int[]{c3, c4, c3, c3, c4, c3, c3};
        f2534C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f2535D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f2536E = new int[]{c3, c3, c3, c3, c3, c4, c4};
    }

    public f() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            U.AbstractC0123a.g(r4, r0)
            U.AbstractC0123a.g(r5, r0)
            U.AbstractC0123a.g(r6, r0)
            U.AbstractC0123a.g(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L20
            r3 = 3
            if (r7 == r3) goto L1e
        L1b:
            r7 = 255(0xff, float:3.57E-43)
            goto L22
        L1e:
            r7 = 0
            goto L22
        L20:
            r7 = 127(0x7f, float:1.78E-43)
        L22:
            if (r4 <= r1) goto L27
            r4 = 255(0xff, float:3.57E-43)
            goto L28
        L27:
            r4 = 0
        L28:
            if (r5 <= r1) goto L2d
            r5 = 255(0xff, float:3.57E-43)
            goto L2e
        L2d:
            r5 = 0
        L2e:
            if (r6 <= r1) goto L32
            r0 = 255(0xff, float:3.57E-43)
        L32:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.f.c(int, int, int, int):int");
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f2542b;
        if (c3 == '\n') {
            ArrayList arrayList = this.f2541a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f2555o != -1) {
                this.f2555o = 0;
            }
            if (this.f2556p != -1) {
                this.f2556p = 0;
            }
            if (this.f2557q != -1) {
                this.f2557q = 0;
            }
            if (this.f2559s != -1) {
                this.f2559s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f2550j && arrayList.size() < 15) {
                    this.f2561u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c3);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2542b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f2555o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2555o, length, 33);
            }
            if (this.f2556p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2556p, length, 33);
            }
            if (this.f2557q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2558r), this.f2557q, length, 33);
            }
            if (this.f2559s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f2560t), this.f2559s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f2541a.clear();
        this.f2542b.clear();
        this.f2555o = -1;
        this.f2556p = -1;
        this.f2557q = -1;
        this.f2559s = -1;
        this.f2561u = 0;
        this.f2543c = false;
        this.f2544d = false;
        this.f2545e = 4;
        this.f2546f = false;
        this.f2547g = 0;
        this.f2548h = 0;
        this.f2549i = 0;
        this.f2550j = 15;
        this.f2551k = 0;
        this.f2552l = 0;
        this.f2553m = 0;
        int i3 = f2538w;
        this.f2554n = i3;
        this.f2558r = f2537v;
        this.f2560t = i3;
    }

    public final void e(boolean z3, boolean z4) {
        int i3 = this.f2555o;
        SpannableStringBuilder spannableStringBuilder = this.f2542b;
        if (i3 != -1) {
            if (!z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2555o, spannableStringBuilder.length(), 33);
                this.f2555o = -1;
            }
        } else if (z3) {
            this.f2555o = spannableStringBuilder.length();
        }
        if (this.f2556p != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2556p, spannableStringBuilder.length(), 33);
                this.f2556p = -1;
            }
        } else if (z4) {
            this.f2556p = spannableStringBuilder.length();
        }
    }

    public final void f(int i3, int i4) {
        int i5 = this.f2557q;
        SpannableStringBuilder spannableStringBuilder = this.f2542b;
        if (i5 != -1 && this.f2558r != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2558r), this.f2557q, spannableStringBuilder.length(), 33);
        }
        if (i3 != f2537v) {
            this.f2557q = spannableStringBuilder.length();
            this.f2558r = i3;
        }
        if (this.f2559s != -1 && this.f2560t != i4) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f2560t), this.f2559s, spannableStringBuilder.length(), 33);
        }
        if (i4 != f2538w) {
            this.f2559s = spannableStringBuilder.length();
            this.f2560t = i4;
        }
    }
}

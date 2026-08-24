package a1;

import C1.d;
import D1.G;
import D1.I;
import D1.b0;
import D2.h;
import T.b;
import T0.k;
import T0.l;
import U.A;
import U.AbstractC0123a;
import U.t;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: m  reason: collision with root package name */
    public final t f3837m = new t();

    /* renamed from: n  reason: collision with root package name */
    public final boolean f3838n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3839o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3840p;

    /* renamed from: q  reason: collision with root package name */
    public final String f3841q;

    /* renamed from: r  reason: collision with root package name */
    public final float f3842r;

    /* renamed from: s  reason: collision with root package name */
    public final int f3843s;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f3839o = bArr[24];
            this.f3840p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f3841q = "Serif".equals(new String(bArr, 43, bArr.length - 43, d.f153c)) ? "serif" : "sans-serif";
            int i3 = bArr[25] * 20;
            this.f3843s = i3;
            boolean z3 = (bArr[0] & 32) != 0;
            this.f3838n = z3;
            if (z3) {
                this.f3842r = A.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i3, 0.0f, 0.95f);
                return;
            } else {
                this.f3842r = 0.85f;
                return;
            }
        }
        this.f3839o = 0;
        this.f3840p = -1;
        this.f3841q = "sans-serif";
        this.f3838n = false;
        this.f3842r = 0.85f;
        this.f3843s = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i3, int i4, int i5, int i6, int i7) {
        if (i3 != i4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i3 >>> 8) | ((i3 & 255) << 24)), i5, i6, i7 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i3, int i4, int i5, int i6, int i7) {
        boolean z3;
        boolean z4;
        if (i3 != i4) {
            int i8 = i7 | 33;
            boolean z5 = true;
            if ((i3 & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 2) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3) {
                if (z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i5, i6, i8);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i5, i6, i8);
                }
            } else if (z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, i6, i8);
            }
            if ((i3 & 4) == 0) {
                z5 = false;
            }
            if (z5) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, i6, i8);
            }
            if (!z5 && !z3 && !z4) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i5, i6, i8);
            }
        }
    }

    @Override // T0.l
    public final /* synthetic */ void b() {
    }

    @Override // T0.l
    public final void e(byte[] bArr, int i3, int i4, k kVar, U.d dVar) {
        boolean z3;
        String s3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5 = 1;
        t tVar = this.f3837m;
        tVar.E(bArr, i3 + i4);
        tVar.G(i3);
        int i6 = 2;
        if (tVar.a() >= 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        int A3 = tVar.A();
        if (A3 == 0) {
            s3 = "";
        } else {
            int i7 = tVar.f2478b;
            Charset C3 = tVar.C();
            int i8 = A3 - (tVar.f2478b - i7);
            if (C3 == null) {
                C3 = d.f153c;
            }
            s3 = tVar.s(i8, C3);
        }
        if (s3.isEmpty()) {
            G g3 = I.f197n;
            dVar.accept(new T0.a(b0.f231q, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s3);
        c(spannableStringBuilder, this.f3839o, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f3840p, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f3841q;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f3 = this.f3842r;
        while (tVar.a() >= 8) {
            int i9 = tVar.f2478b;
            int h3 = tVar.h();
            int h4 = tVar.h();
            if (h4 == 1937013100) {
                if (tVar.a() >= i6) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                AbstractC0123a.e(z5);
                int A4 = tVar.A();
                int i10 = 0;
                while (i10 < A4) {
                    if (tVar.a() >= 12) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    AbstractC0123a.e(z6);
                    int A5 = tVar.A();
                    int A6 = tVar.A();
                    tVar.H(i6);
                    int u3 = tVar.u();
                    tVar.H(i5);
                    int h5 = tVar.h();
                    if (A6 > spannableStringBuilder.length()) {
                        AbstractC0123a.A("Tx3gParser", "Truncating styl end (" + A6 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        A6 = spannableStringBuilder.length();
                    }
                    if (A5 >= A6) {
                        AbstractC0123a.A("Tx3gParser", "Ignoring styl with start (" + A5 + ") >= end (" + A6 + ").");
                    } else {
                        int i11 = A6;
                        c(spannableStringBuilder, u3, this.f3839o, A5, i11, 0);
                        a(spannableStringBuilder, h5, this.f3840p, A5, i11, 0);
                    }
                    i5 = 1;
                    i10++;
                    i6 = 2;
                }
            } else if (h4 == 1952608120 && this.f3838n) {
                i6 = 2;
                if (tVar.a() >= 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0123a.e(z4);
                f3 = A.i(tVar.A() / this.f3843s, 0.0f, 0.95f);
            } else {
                i6 = 2;
            }
            tVar.G(i9 + h3);
        }
        dVar.accept(new T0.a(I.o(new b(spannableStringBuilder, null, null, null, f3, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // T0.l
    public final int k() {
        return 2;
    }

    @Override // T0.l
    public final /* synthetic */ T0.d r(byte[] bArr, int i3, int i4) {
        return h.a(this, bArr, i4);
    }
}

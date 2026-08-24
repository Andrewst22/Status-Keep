package U0;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2495a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2496b;

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f2497c;

    /* renamed from: d  reason: collision with root package name */
    public int f2498d;

    /* renamed from: e  reason: collision with root package name */
    public int f2499e;

    /* renamed from: f  reason: collision with root package name */
    public int f2500f;

    /* renamed from: g  reason: collision with root package name */
    public int f2501g;

    /* renamed from: h  reason: collision with root package name */
    public int f2502h;

    public b(int i3, int i4) {
        ArrayList arrayList = new ArrayList();
        this.f2495a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2496b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f2497c = sb;
        this.f2501g = i3;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f2498d = 15;
        this.f2499e = 0;
        this.f2500f = 0;
        this.f2502h = i4;
    }

    public final void a(char c3) {
        StringBuilder sb = this.f2497c;
        if (sb.length() < 32) {
            sb.append(c3);
        }
    }

    public final void b() {
        StringBuilder sb = this.f2497c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f2495a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i3 = aVar.f2494c;
                if (i3 == length) {
                    aVar.f2494c = i3 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final T.b c(int i3) {
        int i4;
        float f3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f2496b;
            if (i5 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i5));
            spannableStringBuilder.append('\n');
            i5++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i6 = this.f2499e + this.f2500f;
        int length = (32 - i6) - spannableStringBuilder.length();
        int i7 = i6 - length;
        if (i3 != Integer.MIN_VALUE) {
            i4 = i3;
        } else if (this.f2501g == 2 && (Math.abs(i7) < 3 || length < 0)) {
            i4 = 1;
        } else if (this.f2501g == 2 && i7 > 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                i6 = 32 - length;
            }
            f3 = ((i6 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f3 = 0.5f;
        }
        int i8 = this.f2498d;
        if (i8 > 7) {
            i8 -= 17;
        } else if (this.f2501g == 1) {
            i8 -= this.f2502h - 1;
        }
        return new T.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i8, 1, Integer.MIN_VALUE, f3, i4, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        int i3;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2497c);
        int length = spannableStringBuilder.length();
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f2495a;
            if (i4 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i4);
            boolean z5 = aVar.f2493b;
            int i10 = aVar.f2492a;
            if (i10 != 8) {
                if (i10 == 7) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i10 != 7) {
                    i9 = c.f2504B[i10];
                }
                z4 = z3;
            }
            int i11 = aVar.f2494c;
            i4++;
            if (i4 < arrayList.size()) {
                i3 = ((a) arrayList.get(i4)).f2494c;
            } else {
                i3 = length;
            }
            if (i11 != i3) {
                if (i5 != -1 && !z5) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i5, i11, 33);
                    i5 = -1;
                } else if (i5 == -1 && z5) {
                    i5 = i11;
                }
                if (i6 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i6, i11, 33);
                    i6 = -1;
                } else if (i6 == -1 && z4) {
                    i6 = i11;
                }
                if (i9 != i8) {
                    if (i8 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i8), i7, i11, 33);
                    }
                    i8 = i9;
                    i7 = i11;
                }
            }
        }
        if (i5 != -1 && i5 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
        }
        if (i6 != -1 && i6 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i6, length, 33);
        }
        if (i7 != length && i8 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i8), i7, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f2495a.isEmpty() && this.f2496b.isEmpty() && this.f2497c.length() == 0) {
            return true;
        }
        return false;
    }
}

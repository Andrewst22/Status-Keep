package U0;

import android.text.Layout;
import android.text.SpannableStringBuilder;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final d f2529c = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public final T.b f2530a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2531b;

    public e(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f3, int i3, float f4, int i4, boolean z3, int i5, int i6) {
        boolean z4;
        int i7;
        if (z3) {
            i7 = i5;
            z4 = true;
        } else {
            z4 = false;
            i7 = -16777216;
        }
        this.f2530a = new T.b(spannableStringBuilder, alignment, null, null, f3, 0, i3, f4, i4, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z4, i7, Integer.MIN_VALUE, 0.0f);
        this.f2531b = i6;
    }
}

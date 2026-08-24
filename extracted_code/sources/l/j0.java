package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import v.AbstractC0870a;
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f7852a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7853b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7854c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7855d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f7856e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f7857f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f7858g = new int[1];

    public static int a(Context context, int i3) {
        ColorStateList c3 = c(context, i3);
        if (c3 != null && c3.isStateful()) {
            return c3.getColorForState(f7853b, c3.getDefaultColor());
        }
        ThreadLocal threadLocal = f7852a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f3 = typedValue.getFloat();
        int b3 = b(context, i3);
        int round = Math.round(Color.alpha(b3) * f3);
        int i4 = AbstractC0870a.f9462a;
        if (round >= 0 && round <= 255) {
            return (b3 & 16777215) | (round << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int b(Context context, int i3) {
        int[] iArr = f7858g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList c(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f7858g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = f.b.b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

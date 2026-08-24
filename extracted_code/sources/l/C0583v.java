package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* renamed from: l.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583v {

    /* renamed from: k  reason: collision with root package name */
    public static final RectF f7938k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    public static final ConcurrentHashMap f7939l = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f7940a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7941b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f7942c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f7943d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f7944e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f7945f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f7946g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f7947h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f7948i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f7949j;

    static {
        new ConcurrentHashMap();
    }

    public C0583v(TextView textView) {
        this.f7948i = textView;
        this.f7949j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArr) {
            if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f7939l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        boolean booleanValue;
        int measuredWidth;
        if (this.f7940a != 0) {
            if (this.f7941b) {
                if (this.f7948i.getMeasuredHeight() > 0 && this.f7948i.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        booleanValue = this.f7948i.isHorizontallyScrollable();
                    } else {
                        booleanValue = ((Boolean) e(this.f7948i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
                    }
                    if (booleanValue) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f7948i.getMeasuredWidth() - this.f7948i.getTotalPaddingLeft()) - this.f7948i.getTotalPaddingRight();
                    }
                    int height = (this.f7948i.getHeight() - this.f7948i.getCompoundPaddingBottom()) - this.f7948i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f7938k;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c3 = c(rectF);
                                if (c3 != this.f7948i.getTextSize()) {
                                    f(c3, 0);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f7941b = true;
        }
    }

    public final int c(RectF rectF) {
        int i3;
        int i4;
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        int breakStrategy;
        StaticLayout.Builder breakStrategy2;
        int hyphenationFrequency;
        StaticLayout.Builder hyphenationFrequency2;
        int i5;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f7945f.length;
        if (length != 0) {
            int i6 = length - 1;
            int i7 = 1;
            int i8 = 0;
            while (i7 <= i6) {
                int i9 = (i7 + i6) / 2;
                int i10 = this.f7945f[i9];
                TextView textView = this.f7948i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int i11 = Build.VERSION.SDK_INT;
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f7947h;
                if (textPaint == null) {
                    this.f7947h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f7947h.set(textView.getPaint());
                this.f7947h.setTextSize(i10);
                Layout.Alignment alignment2 = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (i11 >= 23) {
                    obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f7947h, round);
                    alignment = obtain.setAlignment(alignment2);
                    lineSpacing = alignment.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
                    includePad = lineSpacing.setIncludePad(textView.getIncludeFontPadding());
                    breakStrategy = textView.getBreakStrategy();
                    breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
                    hyphenationFrequency = textView.getHyphenationFrequency();
                    hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
                    if (maxLines == -1) {
                        i5 = Integer.MAX_VALUE;
                    } else {
                        i5 = maxLines;
                    }
                    hyphenationFrequency2.setMaxLines(i5);
                    if (i11 >= 29) {
                        try {
                            textDirectionHeuristic = textView.getTextDirectionHeuristic();
                        } catch (ClassCastException unused) {
                            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                        }
                    } else {
                        textDirectionHeuristic = (TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                    }
                    obtain.setTextDirection(textDirectionHeuristic);
                    staticLayout = obtain.build();
                    i4 = maxLines;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i4 = maxLines;
                    staticLayout = new StaticLayout(text, this.f7947h, round, alignment2, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                }
                if (i4 != i3) {
                    if (staticLayout.getLineCount() <= i4) {
                        if (staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length()) {
                        }
                    }
                    i8 = i9 - 1;
                    i6 = i8;
                }
                if (staticLayout.getHeight() > rectF.bottom) {
                    i8 = i9 - 1;
                    i6 = i8;
                } else {
                    int i12 = i9 + 1;
                    i8 = i7;
                    i7 = i12;
                }
            }
            return this.f7945f[i8];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(float f3, int i3) {
        Resources resources;
        Context context = this.f7949j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i3, f3, resources.getDisplayMetrics());
        TextView textView = this.f7948i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f7941b = false;
                try {
                    Method d3 = d("nullLayouts");
                    if (d3 != null) {
                        d3.invoke(textView, null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f7940a == 1) {
            if (!this.f7946g || this.f7945f.length == 0) {
                int floor = ((int) Math.floor((this.f7944e - this.f7943d) / this.f7942c)) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f7942c) + this.f7943d);
                }
                this.f7945f = b(iArr);
            }
            this.f7941b = true;
        } else {
            this.f7941b = false;
        }
        return this.f7941b;
    }

    public final boolean h() {
        boolean z3;
        int[] iArr = this.f7945f;
        int length = iArr.length;
        if (length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f7946g = z3;
        if (z3) {
            this.f7940a = 1;
            this.f7943d = iArr[0];
            this.f7944e = iArr[length - 1];
            this.f7942c = -1.0f;
        }
        return z3;
    }

    public final void i(float f3, float f4, float f5) {
        if (f3 > 0.0f) {
            if (f4 > f3) {
                if (f5 > 0.0f) {
                    this.f7940a = 1;
                    this.f7943d = f3;
                    this.f7944e = f4;
                    this.f7942c = f5;
                    this.f7946g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
    }
}

package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import g2.C0276a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import n2.AbstractC0664g;
import v.AbstractC0874e;
/* renamed from: l.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0581t extends TextView implements H.q, H.c {

    /* renamed from: m  reason: collision with root package name */
    public final C0576n f7921m;

    /* renamed from: n  reason: collision with root package name */
    public final C0580s f7922n;

    /* renamed from: o  reason: collision with root package name */
    public final C0276a f7923o;

    /* renamed from: p  reason: collision with root package name */
    public Future f7924p;

    public C0581t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public final void d() {
        Future future = this.f7924p;
        if (future != null) {
            try {
                this.f7924p = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    android.support.v4.media.session.a.A(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0576n c0576n = this.f7921m;
        if (c0576n != null) {
            c0576n.a();
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            c0580s.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (H.c.f403a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            return Math.round(c0580s.f7903i.f7944e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (H.c.f403a) {
            return super.getAutoSizeMinTextSize();
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            return Math.round(c0580s.f7903i.f7943d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (H.c.f403a) {
            return super.getAutoSizeStepGranularity();
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            return Math.round(c0580s.f7903i.f7942c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (H.c.f403a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            return c0580s.f7903i.f7945f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (H.c.f403a) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C0580s c0580s = this.f7922n;
        if (c0580s == null) {
            return 0;
        }
        return c0580s.f7903i.f7940a;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        l0 l0Var;
        C0576n c0576n = this.f7921m;
        if (c0576n == null || (l0Var = (l0) c0576n.f7877e) == null) {
            return null;
        }
        return l0Var.f7866a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0576n c0576n = this.f7921m;
        if (c0576n == null || (l0Var = (l0) c0576n.f7877e) == null) {
            return null;
        }
        return l0Var.f7867b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        l0 l0Var = this.f7922n.f7902h;
        if (l0Var != null) {
            return l0Var.f7866a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        l0 l0Var = this.f7922n.f7902h;
        if (l0Var != null) {
            return l0Var.f7867b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0276a c0276a;
        if (Build.VERSION.SDK_INT < 28 && (c0276a = this.f7923o) != null) {
            TextClassifier textClassifier = (TextClassifier) c0276a.f5778o;
            if (textClassifier == null) {
                TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0581t) c0276a.f5777n).getContext().getSystemService(TextClassificationManager.class);
                if (textClassificationManager != null) {
                    return textClassificationManager.getTextClassifier();
                }
                return TextClassifier.NO_OP;
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public A.f getTextMetricsParamsCompat() {
        return android.support.v4.media.session.a.A(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C0580s c0580s = this.f7922n;
        if (c0580s != null && !H.c.f403a) {
            c0580s.f7903i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        d();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C0580s c0580s = this.f7922n;
        if (c0580s != null && !H.c.f403a) {
            C0583v c0583v = c0580s.f7903i;
            if (c0583v.f7940a != 0) {
                c0583v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (H.c.f403a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            C0583v c0583v = c0580s.f7903i;
            DisplayMetrics displayMetrics = c0583v.f7949j.getResources().getDisplayMetrics();
            c0583v.i(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (c0583v.g()) {
                c0583v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (H.c.f403a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            C0583v c0583v = c0580s.f7903i;
            c0583v.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0583v.f7949j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                c0583v.f7945f = C0583v.b(iArr2);
                if (!c0583v.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0583v.f7946g = false;
            }
            if (c0583v.g()) {
                c0583v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (H.c.f403a) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            C0583v c0583v = c0580s.f7903i;
            if (i3 != 0) {
                if (i3 == 1) {
                    DisplayMetrics displayMetrics = c0583v.f7949j.getResources().getDisplayMetrics();
                    c0583v.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c0583v.g()) {
                        c0583v.a();
                        return;
                    }
                    return;
                }
                c0583v.getClass();
                throw new IllegalArgumentException(D2.h.k("Unknown auto-size text type: ", i3));
            }
            c0583v.f7940a = 0;
            c0583v.f7943d = -1.0f;
            c0583v.f7944e = -1.0f;
            c0583v.f7942c = -1.0f;
            c0583v.f7945f = new int[0];
            c0583v.f7941b = false;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0576n c0576n = this.f7921m;
        if (c0576n != null) {
            c0576n.f7873a = -1;
            c0576n.d(null);
            c0576n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0576n c0576n = this.f7921m;
        if (c0576n != null) {
            c0576n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            c0580s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            c0580s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            c0580s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            c0580s.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.Z(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i3);
        } else {
            android.support.v4.media.session.a.Q(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i3);
        } else {
            android.support.v4.media.session.a.R(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        if (i3 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (i3 != fontMetricsInt) {
                setLineSpacing(i3 - fontMetricsInt, 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setPrecomputedText(A.g gVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        android.support.v4.media.session.a.A(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0576n c0576n = this.f7921m;
        if (c0576n != null) {
            c0576n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0576n c0576n = this.f7921m;
        if (c0576n != null) {
            c0576n.f(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.l0, java.lang.Object] */
    @Override // H.q
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z3;
        C0580s c0580s = this.f7922n;
        if (c0580s.f7902h == null) {
            c0580s.f7902h = new Object();
        }
        l0 l0Var = c0580s.f7902h;
        l0Var.f7866a = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        l0Var.f7869d = z3;
        c0580s.f7896b = l0Var;
        c0580s.f7897c = l0Var;
        c0580s.f7898d = l0Var;
        c0580s.f7899e = l0Var;
        c0580s.f7900f = l0Var;
        c0580s.f7901g = l0Var;
        c0580s.b();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.l0, java.lang.Object] */
    @Override // H.q
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z3;
        C0580s c0580s = this.f7922n;
        if (c0580s.f7902h == null) {
            c0580s.f7902h = new Object();
        }
        l0 l0Var = c0580s.f7902h;
        l0Var.f7867b = mode;
        if (mode != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        l0Var.f7868c = z3;
        c0580s.f7896b = l0Var;
        c0580s.f7897c = l0Var;
        c0580s.f7898d = l0Var;
        c0580s.f7899e = l0Var;
        c0580s.f7900f = l0Var;
        c0580s.f7901g = l0Var;
        c0580s.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            c0580s.e(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0276a c0276a;
        if (Build.VERSION.SDK_INT < 28 && (c0276a = this.f7923o) != null) {
            c0276a.f5778o = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<A.g> future) {
        this.f7924p = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(A.f fVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = fVar.f11b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        int i4 = Build.VERSION.SDK_INT;
        TextPaint textPaint = fVar.f10a;
        if (i4 < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        H.m.e(this, fVar.f12c);
        H.m.h(this, fVar.f13d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        boolean z3 = H.c.f403a;
        if (z3) {
            super.setTextSize(i3, f3);
            return;
        }
        C0580s c0580s = this.f7922n;
        if (c0580s != null && !z3) {
            C0583v c0583v = c0580s.f7903i;
            if (c0583v.f7940a == 0) {
                c0583v.f(f3, i3);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (typeface != null && i3 > 0) {
            Context context = getContext();
            AbstractC0664g abstractC0664g = AbstractC0874e.f9470a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i3);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0581t(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        k0.a(context);
        C0576n c0576n = new C0576n(this);
        this.f7921m = c0576n;
        c0576n.b(attributeSet, i3);
        C0580s c0580s = new C0580s(this);
        this.f7922n = c0580s;
        c0580s.d(attributeSet, i3);
        c0580s.b();
        C0276a c0276a = new C0276a(12, (byte) 0);
        c0276a.f5777n = this;
        this.f7923o = c0276a;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? f.b.c(context, i3) : null, i4 != 0 ? f.b.c(context, i4) : null, i5 != 0 ? f.b.c(context, i5) : null, i6 != 0 ? f.b.c(context, i6) : null);
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            c0580s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? f.b.c(context, i3) : null, i4 != 0 ? f.b.c(context, i4) : null, i5 != 0 ? f.b.c(context, i5) : null, i6 != 0 ? f.b.c(context, i6) : null);
        C0580s c0580s = this.f7922n;
        if (c0580s != null) {
            c0580s.b();
        }
    }
}

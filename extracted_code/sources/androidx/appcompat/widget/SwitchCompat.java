package androidx.appcompat.widget;

import B1.e;
import C.y;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.example.flutter_application_1.R;
import e.AbstractC0259a;
import i.C0287a;
import java.lang.reflect.Field;
import l.AbstractC0586y;
import l.C0580s;
import l.i0;
import l.y0;
import m2.AbstractC0635d;
import w.AbstractC0880a;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: b0  reason: collision with root package name */
    public static final i0 f4037b0 = new Property(Float.class, "thumbPos");

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f4038c0 = {16842912};

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f4039A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f4040B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f4041C;

    /* renamed from: D  reason: collision with root package name */
    public int f4042D;

    /* renamed from: E  reason: collision with root package name */
    public final int f4043E;

    /* renamed from: F  reason: collision with root package name */
    public float f4044F;

    /* renamed from: G  reason: collision with root package name */
    public float f4045G;

    /* renamed from: H  reason: collision with root package name */
    public final VelocityTracker f4046H;

    /* renamed from: I  reason: collision with root package name */
    public final int f4047I;

    /* renamed from: J  reason: collision with root package name */
    public float f4048J;

    /* renamed from: K  reason: collision with root package name */
    public int f4049K;
    public int L;

    /* renamed from: M  reason: collision with root package name */
    public int f4050M;

    /* renamed from: N  reason: collision with root package name */
    public int f4051N;

    /* renamed from: O  reason: collision with root package name */
    public int f4052O;

    /* renamed from: P  reason: collision with root package name */
    public int f4053P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4054Q;

    /* renamed from: R  reason: collision with root package name */
    public final TextPaint f4055R;

    /* renamed from: S  reason: collision with root package name */
    public final ColorStateList f4056S;

    /* renamed from: T  reason: collision with root package name */
    public StaticLayout f4057T;

    /* renamed from: U  reason: collision with root package name */
    public StaticLayout f4058U;

    /* renamed from: V  reason: collision with root package name */
    public final C0287a f4059V;

    /* renamed from: W  reason: collision with root package name */
    public ObjectAnimator f4060W;

    /* renamed from: a0  reason: collision with root package name */
    public final Rect f4061a0;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f4062m;

    /* renamed from: n  reason: collision with root package name */
    public ColorStateList f4063n;

    /* renamed from: o  reason: collision with root package name */
    public PorterDuff.Mode f4064o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4065p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4066q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f4067r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f4068s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f4069t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4070u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4071v;

    /* renamed from: w  reason: collision with root package name */
    public int f4072w;
    public int x;

    /* renamed from: y  reason: collision with root package name */
    public int f4073y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4074z;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, i.a] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i3;
        int resourceId;
        this.f4063n = null;
        this.f4064o = null;
        this.f4065p = false;
        this.f4066q = false;
        this.f4068s = null;
        this.f4069t = null;
        this.f4070u = false;
        this.f4071v = false;
        this.f4046H = VelocityTracker.obtain();
        this.f4061a0 = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f4055R = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        e n02 = e.n0(context, attributeSet, AbstractC0259a.f5209r, R.attr.switchStyle);
        Drawable b02 = n02.b0(2);
        this.f4062m = b02;
        if (b02 != null) {
            b02.setCallback(this);
        }
        Drawable b03 = n02.b0(11);
        this.f4067r = b03;
        if (b03 != null) {
            b03.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) n02.f57o;
        this.f4039A = typedArray.getText(0);
        this.f4040B = typedArray.getText(1);
        this.f4041C = typedArray.getBoolean(3, true);
        this.f4072w = typedArray.getDimensionPixelSize(8, 0);
        this.x = typedArray.getDimensionPixelSize(5, 0);
        this.f4073y = typedArray.getDimensionPixelSize(6, 0);
        this.f4074z = typedArray.getBoolean(4, false);
        ColorStateList Z2 = n02.Z(9);
        if (Z2 != null) {
            this.f4063n = Z2;
            this.f4065p = true;
        }
        PorterDuff.Mode d3 = AbstractC0586y.d(typedArray.getInt(10, -1), null);
        if (this.f4064o != d3) {
            this.f4064o = d3;
            this.f4066q = true;
        }
        if (this.f4065p || this.f4066q) {
            a();
        }
        ColorStateList Z3 = n02.Z(12);
        if (Z3 != null) {
            this.f4068s = Z3;
            this.f4070u = true;
        }
        PorterDuff.Mode d4 = AbstractC0586y.d(typedArray.getInt(13, -1), null);
        if (this.f4069t != d4) {
            this.f4069t = d4;
            this.f4071v = true;
        }
        if (this.f4070u || this.f4071v) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0259a.f5210s);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = f.b.b(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f4056S = colorStateList;
            } else {
                this.f4056S = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f3 = dimensionPixelSize;
                if (f3 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f3);
                    requestLayout();
                }
            }
            int i4 = obtainStyledAttributes.getInt(1, -1);
            int i5 = obtainStyledAttributes.getInt(2, -1);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i5 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i5);
                } else {
                    create = Typeface.create(typeface, i5);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i3 = create.getStyle();
                } else {
                    i3 = 0;
                }
                int i6 = (~i3) & i5;
                textPaint.setFakeBoldText((i6 & 1) != 0);
                textPaint.setTextSkewX((i6 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f5943a = context2.getResources().getConfiguration().locale;
                this.f4059V = obj;
            } else {
                this.f4059V = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C0580s(this).d(attributeSet, R.attr.switchStyle);
        n02.r0();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4043E = viewConfiguration.getScaledTouchSlop();
        this.f4047I = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        if (this.f4048J > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f3;
        if (y0.a(this)) {
            f3 = 1.0f - this.f4048J;
        } else {
            f3 = this.f4048J;
        }
        return (int) ((f3 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f4067r;
        if (drawable != null) {
            Rect rect2 = this.f4061a0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f4062m;
            if (drawable2 != null) {
                rect = AbstractC0586y.c(drawable2);
            } else {
                rect = AbstractC0586y.f7960c;
            }
            return ((((this.f4049K - this.f4050M) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    public final void a() {
        Drawable drawable = this.f4062m;
        if (drawable != null) {
            if (this.f4065p || this.f4066q) {
                Drawable mutate = AbstractC0635d.z(drawable).mutate();
                this.f4062m = mutate;
                if (this.f4065p) {
                    AbstractC0880a.h(mutate, this.f4063n);
                }
                if (this.f4066q) {
                    AbstractC0880a.i(this.f4062m, this.f4064o);
                }
                if (this.f4062m.isStateful()) {
                    this.f4062m.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f4067r;
        if (drawable != null) {
            if (this.f4070u || this.f4071v) {
                Drawable mutate = AbstractC0635d.z(drawable).mutate();
                this.f4067r = mutate;
                if (this.f4070u) {
                    AbstractC0880a.h(mutate, this.f4068s);
                }
                if (this.f4071v) {
                    AbstractC0880a.i(this.f4067r, this.f4069t);
                }
                if (this.f4067r.isStateful()) {
                    this.f4067r.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        int i3;
        C0287a c0287a = this.f4059V;
        if (c0287a != null) {
            charSequence = c0287a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f4055R;
        if (charSequence2 != null) {
            i3 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
        } else {
            i3 = 0;
        }
        return new StaticLayout(charSequence2, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i3;
        int i4;
        int i5 = this.f4051N;
        int i6 = this.f4052O;
        int i7 = this.f4053P;
        int i8 = this.f4054Q;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f4062m;
        if (drawable != null) {
            rect = AbstractC0586y.c(drawable);
        } else {
            rect = AbstractC0586y.f7960c;
        }
        Drawable drawable2 = this.f4067r;
        Rect rect2 = this.f4061a0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i9 = rect2.left;
            thumbOffset += i9;
            if (rect != null) {
                int i10 = rect.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = rect.top;
                int i12 = rect2.top;
                if (i11 > i12) {
                    i3 = (i11 - i12) + i6;
                } else {
                    i3 = i6;
                }
                int i13 = rect.right;
                int i14 = rect2.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = rect.bottom;
                int i16 = rect2.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                    this.f4067r.setBounds(i5, i3, i7, i4);
                }
            } else {
                i3 = i6;
            }
            i4 = i8;
            this.f4067r.setBounds(i5, i3, i7, i4);
        }
        Drawable drawable3 = this.f4062m;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i17 = thumbOffset - rect2.left;
            int i18 = thumbOffset + this.f4050M + rect2.right;
            this.f4062m.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0880a.f(background, i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f4062m;
        if (drawable != null) {
            AbstractC0880a.e(drawable, f3, f4);
        }
        Drawable drawable2 = this.f4067r;
        if (drawable2 != null) {
            AbstractC0880a.e(drawable2, f3, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z3;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4062m;
        if (drawable != null && drawable.isStateful()) {
            z3 = drawable.setState(drawableState);
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f4067r;
        if (drawable2 != null && drawable2.isStateful()) {
            z3 |= drawable2.setState(drawableState);
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!y0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4049K;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f4073y;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (y0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4049K;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f4073y;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f4041C;
    }

    public boolean getSplitTrack() {
        return this.f4074z;
    }

    public int getSwitchMinWidth() {
        return this.x;
    }

    public int getSwitchPadding() {
        return this.f4073y;
    }

    public CharSequence getTextOff() {
        return this.f4040B;
    }

    public CharSequence getTextOn() {
        return this.f4039A;
    }

    public Drawable getThumbDrawable() {
        return this.f4062m;
    }

    public int getThumbTextPadding() {
        return this.f4072w;
    }

    public ColorStateList getThumbTintList() {
        return this.f4063n;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4064o;
    }

    public Drawable getTrackDrawable() {
        return this.f4067r;
    }

    public ColorStateList getTrackTintList() {
        return this.f4068s;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4069t;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4062m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4067r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4060W;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f4060W.end();
            this.f4060W = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4038c0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f4067r;
        Rect rect = this.f4061a0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f4052O;
        int i4 = this.f4054Q;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f4062m;
        if (drawable != null) {
            if (this.f4074z && drawable2 != null) {
                Rect c3 = AbstractC0586y.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c3.left;
                rect.right -= c3.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f4057T;
        } else {
            staticLayout = this.f4058U;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f4056S;
            TextPaint textPaint = this.f4055R;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i5 + i6) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (isChecked()) {
            charSequence = this.f4039A;
        } else {
            charSequence = this.f4040B;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int width;
        int i8;
        int i9;
        int i10;
        super.onLayout(z3, i3, i4, i5, i6);
        int i11 = 0;
        if (this.f4062m != null) {
            Drawable drawable = this.f4067r;
            Rect rect = this.f4061a0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c3 = AbstractC0586y.c(this.f4062m);
            i7 = Math.max(0, c3.left - rect.left);
            i11 = Math.max(0, c3.right - rect.right);
        } else {
            i7 = 0;
        }
        if (y0.a(this)) {
            i8 = getPaddingLeft() + i7;
            width = ((this.f4049K + i8) - i7) - i11;
        } else {
            width = (getWidth() - getPaddingRight()) - i11;
            i8 = (width - this.f4049K) + i7 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i10 = getPaddingTop();
                i9 = this.L + i10;
            } else {
                i9 = getHeight() - getPaddingBottom();
                i10 = i9 - this.L;
            }
        } else {
            int paddingTop = getPaddingTop();
            int i12 = this.L;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i12 / 2);
            i9 = i12 + height;
            i10 = height;
        }
        this.f4051N = i8;
        this.f4052O = i10;
        this.f4054Q = i9;
        this.f4053P = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f4041C) {
            if (this.f4057T == null) {
                this.f4057T = c(this.f4039A);
            }
            if (this.f4058U == null) {
                this.f4058U = c(this.f4040B);
            }
        }
        Drawable drawable = this.f4062m;
        int i8 = 0;
        Rect rect = this.f4061a0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f4062m.getIntrinsicWidth() - rect.left) - rect.right;
            i6 = this.f4062m.getIntrinsicHeight();
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (this.f4041C) {
            i7 = (this.f4072w * 2) + Math.max(this.f4057T.getWidth(), this.f4058U.getWidth());
        } else {
            i7 = 0;
        }
        this.f4050M = Math.max(i7, i5);
        Drawable drawable2 = this.f4067r;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.f4067r.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.f4062m;
        if (drawable3 != null) {
            Rect c3 = AbstractC0586y.c(drawable3);
            i9 = Math.max(i9, c3.left);
            i10 = Math.max(i10, c3.right);
        }
        int max = Math.max(this.x, (this.f4050M * 2) + i9 + i10);
        int max2 = Math.max(i8, i6);
        this.f4049K = max;
        this.L = max2;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f4039A;
        } else {
            charSequence = this.f4040B;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean isChecked = isChecked();
        float f3 = 0.0f;
        if (getWindowToken() != null) {
            Field field = y.f117a;
            if (isLaidOut()) {
                if (isChecked) {
                    f3 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f4037b0, f3);
                this.f4060W = ofFloat;
                ofFloat.setDuration(250L);
                this.f4060W.setAutoCancel(true);
                this.f4060W.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f4060W;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f3 = 1.0f;
        }
        setThumbPosition(f3);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.Z(callback, this));
    }

    public void setShowText(boolean z3) {
        if (this.f4041C != z3) {
            this.f4041C = z3;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f4074z = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.x = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f4073y = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f4055R;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f4040B = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f4039A = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4062m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4062m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.f4048J = f3;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(f.b.c(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.f4072w = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4063n = colorStateList;
        this.f4065p = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4064o = mode;
        this.f4066q = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4067r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4067r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(f.b.c(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4068s = colorStateList;
        this.f4070u = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4069t = mode;
        this.f4071v = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f4062m && drawable != this.f4067r) {
            return false;
        }
        return true;
    }
}

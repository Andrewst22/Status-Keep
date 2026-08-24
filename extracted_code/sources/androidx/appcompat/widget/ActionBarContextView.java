package androidx.appcompat.widget;

import C.y;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.flutter_application_1.R;
import e.AbstractC0259a;
import java.lang.reflect.Field;
import l.y0;
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: m  reason: collision with root package name */
    public int f3939m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3940n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3941o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f3942p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f3943q;

    /* renamed from: r  reason: collision with root package name */
    public View f3944r;

    /* renamed from: s  reason: collision with root package name */
    public LinearLayout f3945s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f3946t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f3947u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3948v;

    /* renamed from: w  reason: collision with root package name */
    public final int f3949w;
    public boolean x;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0259a.f5195d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = f.b.c(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        Field field = y.f117a;
        setBackground(drawable);
        this.f3948v = obtainStyledAttributes.getResourceId(5, 0);
        this.f3949w = obtainStyledAttributes.getResourceId(4, 0);
        this.f3939m = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i3, int i4, int i5, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z3) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        if (z3) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void a() {
        int i3;
        if (this.f3945s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3945s = linearLayout;
            this.f3946t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3947u = (TextView) this.f3945s.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f3948v;
            if (i4 != 0) {
                this.f3946t.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f3949w;
            if (i5 != 0) {
                this.f3947u.setTextAppearance(getContext(), i5);
            }
        }
        this.f3946t.setText(this.f3942p);
        this.f3947u.setText(this.f3943q);
        boolean isEmpty = TextUtils.isEmpty(this.f3942p);
        boolean isEmpty2 = TextUtils.isEmpty(this.f3943q);
        TextView textView = this.f3947u;
        int i6 = 8;
        if (!isEmpty2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        this.f3945s.setVisibility((isEmpty && isEmpty2) ? 0 : 0);
        if (this.f3945s.getParent() == null) {
            addView(this.f3945s);
        }
    }

    @Override // android.view.View
    /* renamed from: c */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            super.setVisibility(i3);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f3939m;
    }

    public CharSequence getSubtitle() {
        return this.f3943q;
    }

    public CharSequence getTitle() {
        return this.f3942p;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0259a.f5192a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3941o = false;
        }
        if (!this.f3941o) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3941o = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3941o = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f3942p);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int paddingLeft;
        boolean a3 = y0.a(this);
        if (a3) {
            paddingLeft = (i5 - i3) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f3945s;
        if (linearLayout != null && this.f3944r == null && linearLayout.getVisibility() != 8) {
            paddingLeft += b(this.f3945s, paddingLeft, paddingTop, paddingTop2, a3);
        }
        View view = this.f3944r;
        if (view != null) {
            b(view, paddingLeft, paddingTop, paddingTop2, a3);
        }
        if (a3) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z3;
        int i6;
        int i7 = 1073741824;
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            if (View.MeasureSpec.getMode(i4) != 0) {
                int size = View.MeasureSpec.getSize(i3);
                int i8 = this.f3939m;
                if (i8 <= 0) {
                    i8 = View.MeasureSpec.getSize(i4);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i9 = i8 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
                LinearLayout linearLayout = this.f3945s;
                if (linearLayout != null && this.f3944r == null) {
                    if (this.x) {
                        this.f3945s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f3945s.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f3945s;
                        if (z3) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        linearLayout2.setVisibility(i6);
                    } else {
                        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                        paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                    }
                }
                View view = this.f3944r;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i10 = layoutParams.width;
                    if (i10 != -2) {
                        i5 = 1073741824;
                    } else {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i10 >= 0) {
                        paddingLeft = Math.min(i10, paddingLeft);
                    }
                    int i11 = layoutParams.height;
                    if (i11 == -2) {
                        i7 = Integer.MIN_VALUE;
                    }
                    if (i11 >= 0) {
                        i9 = Math.min(i11, i9);
                    }
                    this.f3944r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i9, i7));
                }
                if (this.f3939m <= 0) {
                    int childCount = getChildCount();
                    int i12 = 0;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i12) {
                            i12 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i12);
                    return;
                }
                setMeasuredDimension(size, i8);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3940n = false;
        }
        if (!this.f3940n) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3940n = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3940n = false;
        }
        return true;
    }

    public void setContentHeight(int i3) {
        this.f3939m = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3944r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3944r = view;
        if (view != null && (linearLayout = this.f3945s) != null) {
            removeView(linearLayout);
            this.f3945s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3943q = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3942p = charSequence;
        a();
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.x) {
            requestLayout();
        }
        this.x = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

package androidx.appcompat.widget;

import C.y;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.example.flutter_application_1.R;
import e.AbstractC0259a;
import java.lang.reflect.Field;
import l.C0563a;
import l.T;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    public boolean f3930m;

    /* renamed from: n  reason: collision with root package name */
    public View f3931n;

    /* renamed from: o  reason: collision with root package name */
    public View f3932o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f3933p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f3934q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f3935r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f3936s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3937t;

    /* renamed from: u  reason: collision with root package name */
    public final int f3938u;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0563a c0563a = new C0563a(this);
        Field field = y.f117a;
        setBackground(c0563a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0259a.f5192a);
        boolean z3 = false;
        this.f3933p = obtainStyledAttributes.getDrawable(0);
        this.f3934q = obtainStyledAttributes.getDrawable(2);
        this.f3938u = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3936s = true;
            this.f3935r = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f3936s ? !(this.f3933p != null || this.f3934q != null) : this.f3935r == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3933p;
        if (drawable != null && drawable.isStateful()) {
            this.f3933p.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3934q;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3934q.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3935r;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f3935r.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3933p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3934q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3935r;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3931n = findViewById(R.id.action_bar);
        this.f3932o = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f3930m && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        boolean z4 = true;
        if (this.f3936s) {
            Drawable drawable = this.f3935r;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f3933p != null) {
                if (this.f3931n.getVisibility() == 0) {
                    this.f3933p.setBounds(this.f3931n.getLeft(), this.f3931n.getTop(), this.f3931n.getRight(), this.f3931n.getBottom());
                } else {
                    View view = this.f3932o;
                    if (view != null && view.getVisibility() == 0) {
                        this.f3933p.setBounds(this.f3932o.getLeft(), this.f3932o.getTop(), this.f3932o.getRight(), this.f3932o.getBottom());
                    } else {
                        this.f3933p.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z4 = false;
            }
            this.f3937t = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f3931n == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f3938u) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f3931n == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3933p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3933p);
        }
        this.f3933p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3931n;
            if (view != null) {
                this.f3933p.setBounds(view.getLeft(), this.f3931n.getTop(), this.f3931n.getRight(), this.f3931n.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f3936s ? !(this.f3933p != null || this.f3934q != null) : this.f3935r == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3935r;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3935r);
        }
        this.f3935r = drawable;
        boolean z3 = this.f3936s;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f3935r) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f3933p != null || this.f3934q != null) : this.f3935r == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3934q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3934q);
        }
        this.f3934q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3937t && this.f3934q != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f3936s ? !(this.f3933p != null || this.f3934q != null) : this.f3935r == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        int i3;
        this.f3930m = z3;
        if (z3) {
            i3 = 393216;
        } else {
            i3 = 262144;
        }
        setDescendantFocusability(i3);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        boolean z3;
        super.setVisibility(i3);
        if (i3 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f3933p;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f3934q;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f3935r;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3933p;
        boolean z3 = this.f3936s;
        if ((drawable == drawable2 && !z3) || ((drawable == this.f3934q && this.f3937t) || ((drawable == this.f3935r && z3) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(T t3) {
    }
}

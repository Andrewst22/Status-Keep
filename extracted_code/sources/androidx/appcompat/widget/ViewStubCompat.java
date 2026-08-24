package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.AbstractC0259a;
import java.lang.ref.WeakReference;
import l.x0;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: m  reason: collision with root package name */
    public int f4110m;

    /* renamed from: n  reason: collision with root package name */
    public int f4111n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference f4112o;

    /* renamed from: p  reason: collision with root package name */
    public LayoutInflater f4113p;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4110m = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0259a.f5213v, 0, 0);
        this.f4111n = obtainStyledAttributes.getResourceId(2, -1);
        this.f4110m = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4111n;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4113p;
    }

    public int getLayoutResource() {
        return this.f4110m;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f4111n = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4113p = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f4110m = i3;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        WeakReference weakReference = this.f4112o;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i3);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                if (this.f4110m != 0) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutInflater layoutInflater = this.f4113p;
                    if (layoutInflater == null) {
                        layoutInflater = LayoutInflater.from(getContext());
                    }
                    View inflate = layoutInflater.inflate(this.f4110m, viewGroup, false);
                    int i4 = this.f4111n;
                    if (i4 != -1) {
                        inflate.setId(i4);
                    }
                    int indexOfChild = viewGroup.indexOfChild(this);
                    viewGroup.removeViewInLayout(this);
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        viewGroup.addView(inflate, indexOfChild, layoutParams);
                    } else {
                        viewGroup.addView(inflate, indexOfChild);
                    }
                    this.f4112o = new WeakReference(inflate);
                    return;
                }
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    public void setOnInflateListener(x0 x0Var) {
    }
}

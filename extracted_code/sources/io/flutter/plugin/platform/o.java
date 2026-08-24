package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
/* loaded from: classes.dex */
public final class o extends ViewGroup {

    /* renamed from: m  reason: collision with root package name */
    public final Rect f6259m;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f6260n;

    public o(Context context) {
        super(context);
        this.f6259m = new Rect();
        this.f6260n = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f6259m.set(i3, i4, i5, i6);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f6259m, layoutParams.x, layoutParams.y, this.f6260n);
            Rect rect = this.f6260n;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), Integer.MIN_VALUE));
        }
        super.onMeasure(i3, i4);
    }
}

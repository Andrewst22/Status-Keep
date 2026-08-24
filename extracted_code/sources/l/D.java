package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import e.AbstractC0259a;
/* loaded from: classes.dex */
public class D extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public final float f7715a;

    /* renamed from: b  reason: collision with root package name */
    public int f7716b;

    public D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7716b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0259a.f5201j);
        this.f7715a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f7716b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public D(int i3) {
        super(i3, -2);
        this.f7716b = -1;
        this.f7715a = 0.0f;
    }

    public D(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7716b = -1;
    }
}

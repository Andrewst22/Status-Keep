package i1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class u extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f6059a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6060b;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6059a = new Rect();
        this.f6060b = true;
    }

    public u(int i3, int i4) {
        super(i3, i4);
        this.f6059a = new Rect();
        this.f6060b = true;
    }

    public u(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f6059a = new Rect();
        this.f6060b = true;
    }

    public u(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6059a = new Rect();
        this.f6060b = true;
    }

    public u(u uVar) {
        super((ViewGroup.LayoutParams) uVar);
        this.f6059a = new Rect();
        this.f6060b = true;
    }
}

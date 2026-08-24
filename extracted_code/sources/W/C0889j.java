package w;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* renamed from: w.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889j extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f9504a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f9505b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f9506c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f9507d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i3;
        int i4 = this.f9504a;
        Drawable.ConstantState constantState = this.f9505b;
        if (constantState != null) {
            i3 = constantState.getChangingConfigurations();
        } else {
            i3 = 0;
        }
        return i4 | i3;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w.i, android.graphics.drawable.Drawable] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ?? drawable = new Drawable();
        drawable.f9501p = this;
        Drawable.ConstantState constantState = this.f9505b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        C0888i.a();
        return drawable;
    }
}

package l1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
/* renamed from: l1.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606o extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f8125a;

    public C0606o(Drawable.ConstantState constantState) {
        this.f8125a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f8125a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f8125a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0607p c0607p = new C0607p();
        c0607p.f8071m = (VectorDrawable) this.f8125a.newDrawable();
        return c0607p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0607p c0607p = new C0607p();
        c0607p.f8071m = (VectorDrawable) this.f8125a.newDrawable(resources);
        return c0607p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0607p c0607p = new C0607p();
        c0607p.f8071m = (VectorDrawable) this.f8125a.newDrawable(resources, theme);
        return c0607p;
    }
}

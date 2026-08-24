package l1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* renamed from: l1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594c extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f8065a;

    public C0594c(Drawable.ConstantState constantState) {
        this.f8065a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f8065a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f8065a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0595d c0595d = new C0595d(null);
        Drawable newDrawable = this.f8065a.newDrawable();
        c0595d.f8071m = newDrawable;
        newDrawable.setCallback(c0595d.f8068p);
        return c0595d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0595d c0595d = new C0595d(null);
        Drawable newDrawable = this.f8065a.newDrawable(resources);
        c0595d.f8071m = newDrawable;
        newDrawable.setCallback(c0595d.f8068p);
        return c0595d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0595d c0595d = new C0595d(null);
        Drawable newDrawable = this.f8065a.newDrawable(resources, theme);
        c0595d.f8071m = newDrawable;
        newDrawable.setCallback(c0595d.f8068p);
        return c0595d;
    }
}

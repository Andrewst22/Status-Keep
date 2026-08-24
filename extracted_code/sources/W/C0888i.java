package w;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import m2.AbstractC0635d;
/* renamed from: w.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888i extends Drawable implements Drawable.Callback, InterfaceC0887h, InterfaceC0886g {

    /* renamed from: s  reason: collision with root package name */
    public static final PorterDuff.Mode f9496s = PorterDuff.Mode.SRC_IN;

    /* renamed from: t  reason: collision with root package name */
    public static Method f9497t;

    /* renamed from: m  reason: collision with root package name */
    public int f9498m;

    /* renamed from: n  reason: collision with root package name */
    public PorterDuff.Mode f9499n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9500o;

    /* renamed from: p  reason: collision with root package name */
    public C0889j f9501p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9502q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f9503r;

    public static void a() {
        if (f9497t == null) {
            try {
                f9497t = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f9503r;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, w.j] */
    public final C0889j c() {
        C0889j c0889j = this.f9501p;
        ?? constantState = new Drawable.ConstantState();
        constantState.f9506c = null;
        constantState.f9507d = f9496s;
        if (c0889j != null) {
            constantState.f9504a = c0889j.f9504a;
            constantState.f9505b = c0889j.f9505b;
            constantState.f9506c = c0889j.f9506c;
            constantState.f9507d = c0889j.f9507d;
        }
        return constantState;
    }

    public final boolean d(int[] iArr) {
        boolean state = this.f9503r.setState(iArr);
        if (!i(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f9503r.draw(canvas);
    }

    public final void e(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    public final void f(ColorStateList colorStateList) {
        this.f9501p.f9506c = colorStateList;
        i(this.f9503r.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.f9501p.f9507d = mode;
        i(this.f9503r.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int i3;
        int changingConfigurations = super.getChangingConfigurations();
        C0889j c0889j = this.f9501p;
        if (c0889j != null) {
            i3 = c0889j.getChangingConfigurations();
        } else {
            i3 = 0;
        }
        return changingConfigurations | i3 | this.f9503r.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C0889j c0889j = this.f9501p;
        if (c0889j != null && c0889j.f9505b != null) {
            c0889j.f9504a = getChangingConfigurations();
            return this.f9501p;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f9503r.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f9503r.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9503r.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9503r.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return AbstractC0635d.o(this.f9503r);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f9503r.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f9503r.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f9503r.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f9503r.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f9503r.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f9503r.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f9503r.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f9503r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9503r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0889j c0889j = this.f9501p;
            if (c0889j != null) {
                c0889j.f9505b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (!b()) {
            return false;
        }
        C0889j c0889j = this.f9501p;
        ColorStateList colorStateList = c0889j.f9506c;
        PorterDuff.Mode mode = c0889j.f9507d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f9500o || colorForState != this.f9498m || mode != this.f9499n) {
                setColorFilter(colorForState, mode);
                this.f9498m = colorForState;
                this.f9499n = mode;
                this.f9500o = true;
                return true;
            }
        } else {
            this.f9500o = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f9503r.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f9503r;
        if (drawable != null && (method = f9497t) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
                return false;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        C0889j c0889j;
        if (b() && (c0889j = this.f9501p) != null) {
            colorStateList = c0889j.f9506c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f9503r.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f9503r.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f9502q && super.mutate() == this) {
            this.f9501p = c();
            Drawable drawable = this.f9503r;
            if (drawable != null) {
                drawable.mutate();
            }
            C0889j c0889j = this.f9501p;
            if (c0889j != null) {
                Drawable drawable2 = this.f9503r;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                c0889j.f9505b = constantState;
            }
            this.f9502q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9503r;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        Drawable drawable = this.f9503r;
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0881b.b(drawable, i3);
        }
        if (!AbstractC0635d.f8249e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                AbstractC0635d.f8248d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            AbstractC0635d.f8249e = true;
        }
        Method method = AbstractC0635d.f8248d;
        if (method == null) {
            return false;
        }
        try {
            method.invoke(drawable, Integer.valueOf(i3));
            return true;
        } catch (Exception e3) {
            Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
            AbstractC0635d.f8248d = null;
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        return this.f9503r.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f9503r.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        this.f9503r.setAutoMirrored(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        this.f9503r.setChangingConfigurations(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9503r.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f9503r.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f9503r.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f4) {
        this.f9503r.setHotspot(f3, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        this.f9503r.setHotspotBounds(i3, i4, i5, i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (d(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        if (b()) {
            e(i3);
        } else {
            this.f9503r.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f9503r.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f9503r.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        if (!super.setVisible(z3, z4) && !this.f9503r.setVisible(z3, z4)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

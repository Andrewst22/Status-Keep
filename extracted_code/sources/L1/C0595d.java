package l1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import m2.AbstractC0635d;
import org.xmlpull.v1.XmlPullParser;
import w.AbstractC0880a;
/* renamed from: l1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595d extends AbstractC0598g implements Animatable {

    /* renamed from: o  reason: collision with root package name */
    public final Context f8067o;

    /* renamed from: p  reason: collision with root package name */
    public final g.f f8068p = new g.f(this);

    /* renamed from: n  reason: collision with root package name */
    public final C0593b f8066n = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, l1.b] */
    public C0595d(Context context) {
        this.f8067o = context;
    }

    @Override // l1.AbstractC0598g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0880a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return AbstractC0880a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0593b c0593b = this.f8066n;
        c0593b.f8061a.draw(canvas);
        if (c0593b.f8062b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f8066n.f8061a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f8066n.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return AbstractC0880a.c(drawable);
        }
        return this.f8066n.f8061a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f8071m != null && Build.VERSION.SDK_INT >= 24) {
            return new C0594c(this.f8071m.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f8066n.f8061a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f8066n.f8061a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f8066n.f8061a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x018a, code lost:
        if (r8.f8062b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018c, code lost:
        r8.f8062b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0193, code lost:
        r8.f8062b.playTogether(r8.f8063c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019a, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Type inference failed for: r11v16, types: [p.e, p.i] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.content.res.Resources.Theme r27) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C0595d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f8066n.f8061a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f8066n.f8062b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f8066n.f8061a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f8066n.f8061a.setBounds(rect);
        }
    }

    @Override // l1.AbstractC0598g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        return this.f8066n.f8061a.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f8066n.f8061a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else {
            this.f8066n.f8061a.setAlpha(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f8066n.f8061a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8066n.f8061a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0635d.v(drawable, i3);
        } else {
            this.f8066n.f8061a.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0880a.h(drawable, colorStateList);
        } else {
            this.f8066n.f8061a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0880a.i(drawable, mode);
        } else {
            this.f8066n.f8061a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f8066n.f8061a.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0593b c0593b = this.f8066n;
        if (c0593b.f8062b.isStarted()) {
            return;
        }
        c0593b.f8062b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f8066n.f8062b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

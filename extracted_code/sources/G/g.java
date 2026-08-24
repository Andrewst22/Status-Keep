package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import m2.AbstractC0635d;
import w.AbstractC0880a;
/* loaded from: classes.dex */
public abstract class g extends Drawable implements Drawable.Callback {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f5687y = 0;

    /* renamed from: m  reason: collision with root package name */
    public b f5688m;

    /* renamed from: n  reason: collision with root package name */
    public Rect f5689n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f5690o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f5691p;

    /* renamed from: q  reason: collision with root package name */
    public int f5692q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5693r;

    /* renamed from: s  reason: collision with root package name */
    public int f5694s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5695t;

    /* renamed from: u  reason: collision with root package name */
    public H.b f5696u;

    /* renamed from: v  reason: collision with root package name */
    public long f5697v;

    /* renamed from: w  reason: collision with root package name */
    public long f5698w;
    public f x;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f5693r = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f5690o
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f5697v
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f5692q
            r3.setAlpha(r9)
            r13.f5697v = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            g.b r9 = r13.f5688m
            int r9 = r9.f5671y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f5692q
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f5697v = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f5691p
            if (r9 == 0) goto L65
            long r10 = r13.f5698w
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f5691p = r0
            r13.f5698w = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b r4 = r13.f5688m
            int r4 = r4.f5672z
            int r3 = r3 / r4
            int r4 = r13.f5692q
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f5698w = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            H.b r14 = r13.f5696u
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f5688m;
        if (theme != null) {
            bVar.c();
            int i3 = bVar.f5655h;
            Drawable[] drawableArr = bVar.f5654g;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i4].applyTheme(theme);
                    bVar.f5652e |= drawableArr[i4].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f5649b = resources;
                int i5 = resources.getDisplayMetrics().densityDpi;
                if (i5 == 0) {
                    i5 = 160;
                }
                int i6 = bVar.f5650c;
                bVar.f5650c = i5;
                if (i6 != i5) {
                    bVar.f5660m = false;
                    bVar.f5657j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    public final void b(Drawable drawable) {
        int layoutDirection;
        if (this.x == null) {
            this.x = new f();
        }
        f fVar = this.x;
        fVar.f5686n = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f5688m.f5671y <= 0 && this.f5693r) {
                drawable.setAlpha(this.f5692q);
            }
            b bVar = this.f5688m;
            if (bVar.f5640C) {
                drawable.setColorFilter(bVar.f5639B);
            } else {
                if (bVar.f5643F) {
                    AbstractC0880a.h(drawable, bVar.f5641D);
                }
                b bVar2 = this.f5688m;
                if (bVar2.f5644G) {
                    AbstractC0880a.i(drawable, bVar2.f5642E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f5688m.f5670w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                layoutDirection = getLayoutDirection();
                drawable.setLayoutDirection(layoutDirection);
            }
            drawable.setAutoMirrored(this.f5688m.f5638A);
            Rect rect = this.f5689n;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.x;
            fVar2.f5686n = null;
            drawable.setCallback((Drawable.Callback) fVar2.f5686n);
        } catch (Throwable th) {
            f fVar3 = this.x;
            fVar3.f5686n = null;
            drawable.setCallback((Drawable.Callback) fVar3.f5686n);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f5694s
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b r0 = r9.f5688m
            int r0 = r0.f5672z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f5691p
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f5690o
            if (r0 == 0) goto L29
            r9.f5691p = r0
            g.b r0 = r9.f5688m
            int r0 = r0.f5672z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f5698w = r0
            goto L35
        L29:
            r9.f5691p = r4
            r9.f5698w = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f5690o
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.b r0 = r9.f5688m
            int r1 = r0.f5655h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f5690o = r0
            r9.f5694s = r10
            if (r0 == 0) goto L5a
            g.b r10 = r9.f5688m
            int r10 = r10.f5671y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f5697v = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.f5690o = r4
            r10 = -1
            r9.f5694s = r10
        L5a:
            long r0 = r9.f5697v
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f5698w
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7d
        L67:
            H.b r0 = r9.f5696u
            if (r0 != 0) goto L77
            H.b r0 = new H.b
            r1 = r9
            g.e r1 = (g.e) r1
            r2 = 2
            r0.<init>(r1, r2)
            r9.f5696u = r0
            goto L7a
        L77:
            r9.unscheduleSelf(r0)
        L7a:
            r9.a(r10)
        L7d:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.c(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f5688m.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f5690o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f5691p;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5692q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f5688m.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z3;
        b bVar = this.f5688m;
        synchronized (bVar) {
            if (bVar.f5668u) {
                z3 = bVar.f5669v;
            } else {
                bVar.c();
                z3 = true;
                bVar.f5668u = true;
                int i3 = bVar.f5655h;
                Drawable[] drawableArr = bVar.f5654g;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (drawableArr[i4].getConstantState() == null) {
                            bVar.f5669v = false;
                            z3 = false;
                            break;
                        }
                        i4++;
                    } else {
                        bVar.f5669v = true;
                        break;
                    }
                }
            }
        }
        if (z3) {
            this.f5688m.f5651d = getChangingConfigurations();
            return this.f5688m;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f5690o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f5689n;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f5688m;
        if (bVar.f5659l) {
            if (!bVar.f5660m) {
                bVar.b();
            }
            return bVar.f5662o;
        }
        Drawable drawable = this.f5690o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f5688m;
        if (bVar.f5659l) {
            if (!bVar.f5660m) {
                bVar.b();
            }
            return bVar.f5661n;
        }
        Drawable drawable = this.f5690o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f5688m;
        if (bVar.f5659l) {
            if (!bVar.f5660m) {
                bVar.b();
            }
            return bVar.f5664q;
        }
        Drawable drawable = this.f5690o;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f5688m;
        if (bVar.f5659l) {
            if (!bVar.f5660m) {
                bVar.b();
            }
            return bVar.f5663p;
        }
        Drawable drawable = this.f5690o;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5690o;
        int i3 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        b bVar = this.f5688m;
        if (bVar.f5665r) {
            return bVar.f5666s;
        }
        bVar.c();
        int i4 = bVar.f5655h;
        Drawable[] drawableArr = bVar.f5654g;
        if (i4 > 0) {
            i3 = drawableArr[0].getOpacity();
        }
        for (int i5 = 1; i5 < i4; i5++) {
            i3 = Drawable.resolveOpacity(i3, drawableArr[i5].getOpacity());
        }
        bVar.f5666s = i3;
        bVar.f5665r = true;
        return i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f5690o;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f5688m;
        boolean z3 = false;
        Rect rect2 = null;
        if (!bVar.f5656i) {
            Rect rect3 = bVar.f5658k;
            if (rect3 == null && !bVar.f5657j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i3 = bVar.f5655h;
                Drawable[] drawableArr = bVar.f5654g;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (drawableArr[i4].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i5 = rect4.left;
                        if (i5 > rect2.left) {
                            rect2.left = i5;
                        }
                        int i6 = rect4.top;
                        if (i6 > rect2.top) {
                            rect2.top = i6;
                        }
                        int i7 = rect4.right;
                        if (i7 > rect2.right) {
                            rect2.right = i7;
                        }
                        int i8 = rect4.bottom;
                        if (i8 > rect2.bottom) {
                            rect2.bottom = i8;
                        }
                    }
                }
                bVar.f5657j = true;
                bVar.f5658k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z3 = true;
            }
        } else {
            Drawable drawable = this.f5690o;
            if (drawable != null) {
                z3 = drawable.getPadding(rect);
            } else {
                z3 = super.getPadding(rect);
            }
        }
        if (this.f5688m.f5638A && AbstractC0635d.o(this) == 1) {
            int i9 = rect.left;
            rect.left = rect.right;
            rect.right = i9;
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f5688m;
        if (bVar != null) {
            bVar.f5665r = false;
            bVar.f5667t = false;
        }
        if (drawable == this.f5690o && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f5688m.f5638A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z3;
        Drawable drawable = this.f5691p;
        boolean z4 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f5691p = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f5690o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f5693r) {
                this.f5690o.setAlpha(this.f5692q);
            }
        }
        if (this.f5698w != 0) {
            this.f5698w = 0L;
            z3 = true;
        }
        if (this.f5697v != 0) {
            this.f5697v = 0L;
        } else {
            z4 = z3;
        }
        if (z4) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5695t && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.f5679B, eVar, null);
            bVar.f5646I = bVar.f5646I.clone();
            bVar.f5647J = bVar.f5647J.clone();
            d(bVar);
            this.f5695t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5691p;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f5690o;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        boolean z3;
        b bVar = this.f5688m;
        int i4 = this.f5694s;
        int i5 = bVar.f5655h;
        Drawable[] drawableArr = bVar.f5654g;
        boolean z4 = false;
        for (int i6 = 0; i6 < i5; i6++) {
            Drawable drawable = drawableArr[i6];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z3 = drawable.setLayoutDirection(i3);
                } else {
                    z3 = false;
                }
                if (i6 == i4) {
                    z4 = z3;
                }
            }
        }
        bVar.x = i3;
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f5691p;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        Drawable drawable2 = this.f5690o;
        if (drawable2 != null) {
            return drawable2.setLevel(i3);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable == this.f5690o && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (!this.f5693r || this.f5692q != i3) {
            this.f5693r = true;
            this.f5692q = i3;
            Drawable drawable = this.f5690o;
            if (drawable != null) {
                if (this.f5697v == 0) {
                    drawable.setAlpha(i3);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        b bVar = this.f5688m;
        if (bVar.f5638A != z3) {
            bVar.f5638A = z3;
            Drawable drawable = this.f5690o;
            if (drawable != null) {
                drawable.setAutoMirrored(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f5688m;
        bVar.f5640C = true;
        if (bVar.f5639B != colorFilter) {
            bVar.f5639B = colorFilter;
            Drawable drawable = this.f5690o;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        b bVar = this.f5688m;
        if (bVar.f5670w != z3) {
            bVar.f5670w = z3;
            Drawable drawable = this.f5690o;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f4) {
        Drawable drawable = this.f5690o;
        if (drawable != null) {
            AbstractC0880a.e(drawable, f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        Rect rect = this.f5689n;
        if (rect == null) {
            this.f5689n = new Rect(i3, i4, i5, i6);
        } else {
            rect.set(i3, i4, i5, i6);
        }
        Drawable drawable = this.f5690o;
        if (drawable != null) {
            AbstractC0880a.f(drawable, i3, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f5688m;
        bVar.f5643F = true;
        if (bVar.f5641D != colorStateList) {
            bVar.f5641D = colorStateList;
            AbstractC0880a.h(this.f5690o, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f5688m;
        bVar.f5644G = true;
        if (bVar.f5642E != mode) {
            bVar.f5642E = mode;
            AbstractC0880a.i(this.f5690o, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        Drawable drawable = this.f5691p;
        if (drawable != null) {
            drawable.setVisible(z3, z4);
        }
        Drawable drawable2 = this.f5690o;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z4);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f5690o && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}

package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import m2.AbstractC0635d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.C0723e;
import u.AbstractC0839b;
import u.AbstractC0840c;
import w.AbstractC0880a;
/* renamed from: l1.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607p extends AbstractC0598g {

    /* renamed from: v  reason: collision with root package name */
    public static final PorterDuff.Mode f8126v = PorterDuff.Mode.SRC_IN;

    /* renamed from: n  reason: collision with root package name */
    public C0605n f8127n;

    /* renamed from: o  reason: collision with root package name */
    public PorterDuffColorFilter f8128o;

    /* renamed from: p  reason: collision with root package name */
    public ColorFilter f8129p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8130q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8131r;

    /* renamed from: s  reason: collision with root package name */
    public final float[] f8132s;

    /* renamed from: t  reason: collision with root package name */
    public final Matrix f8133t;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f8134u;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, l1.n] */
    public C0607p() {
        this.f8131r = true;
        this.f8132s = new float[9];
        this.f8133t = new Matrix();
        this.f8134u = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f8115c = null;
        constantState.f8116d = f8126v;
        constantState.f8114b = new C0604m();
        this.f8127n = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0880a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f8134u;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f8129p;
            if (colorFilter == null) {
                colorFilter = this.f8128o;
            }
            Matrix matrix = this.f8133t;
            canvas.getMatrix(matrix);
            float[] fArr = this.f8132s;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && AbstractC0635d.o(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                C0605n c0605n = this.f8127n;
                Bitmap bitmap = c0605n.f8118f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != c0605n.f8118f.getHeight()) {
                    c0605n.f8118f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    c0605n.f8123k = true;
                }
                if (!this.f8131r) {
                    C0605n c0605n2 = this.f8127n;
                    c0605n2.f8118f.eraseColor(0);
                    Canvas canvas2 = new Canvas(c0605n2.f8118f);
                    C0604m c0604m = c0605n2.f8114b;
                    c0604m.a(c0604m.f8104g, C0604m.f8097p, canvas2, min, min2);
                } else {
                    C0605n c0605n3 = this.f8127n;
                    if (c0605n3.f8123k || c0605n3.f8119g != c0605n3.f8115c || c0605n3.f8120h != c0605n3.f8116d || c0605n3.f8122j != c0605n3.f8117e || c0605n3.f8121i != c0605n3.f8114b.getRootAlpha()) {
                        C0605n c0605n4 = this.f8127n;
                        c0605n4.f8118f.eraseColor(0);
                        Canvas canvas3 = new Canvas(c0605n4.f8118f);
                        C0604m c0604m2 = c0605n4.f8114b;
                        c0604m2.a(c0604m2.f8104g, C0604m.f8097p, canvas3, min, min2);
                        C0605n c0605n5 = this.f8127n;
                        c0605n5.f8119g = c0605n5.f8115c;
                        c0605n5.f8120h = c0605n5.f8116d;
                        c0605n5.f8121i = c0605n5.f8114b.getRootAlpha();
                        c0605n5.f8122j = c0605n5.f8117e;
                        c0605n5.f8123k = false;
                    }
                }
                C0605n c0605n6 = this.f8127n;
                if (c0605n6.f8114b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (c0605n6.f8124l == null) {
                        Paint paint2 = new Paint();
                        c0605n6.f8124l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    c0605n6.f8124l.setAlpha(c0605n6.f8114b.getRootAlpha());
                    c0605n6.f8124l.setColorFilter(colorFilter);
                    paint = c0605n6.f8124l;
                }
                canvas.drawBitmap(c0605n6.f8118f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f8127n.f8114b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f8127n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return AbstractC0880a.c(drawable);
        }
        return this.f8129p;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f8071m != null && Build.VERSION.SDK_INT >= 24) {
            return new C0606o(this.f8071m.getConstantState());
        }
        this.f8127n.f8113a = getChangingConfigurations();
        return this.f8127n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f8127n.f8114b.f8106i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f8127n.f8114b.f8105h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f8127n.f8117e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0605n c0605n = this.f8127n;
            if (c0605n != null) {
                C0604m c0604m = c0605n.f8114b;
                if (c0604m.f8111n == null) {
                    c0604m.f8111n = Boolean.valueOf(c0604m.f8104g.a());
                }
                if (c0604m.f8111n.booleanValue() || ((colorStateList = this.f8127n.f8115c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, l1.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f8130q && super.mutate() == this) {
            C0605n c0605n = this.f8127n;
            ?? constantState = new Drawable.ConstantState();
            constantState.f8115c = null;
            constantState.f8116d = f8126v;
            if (c0605n != null) {
                constantState.f8113a = c0605n.f8113a;
                C0604m c0604m = new C0604m(c0605n.f8114b);
                constantState.f8114b = c0604m;
                if (c0605n.f8114b.f8102e != null) {
                    c0604m.f8102e = new Paint(c0605n.f8114b.f8102e);
                }
                if (c0605n.f8114b.f8101d != null) {
                    constantState.f8114b.f8101d = new Paint(c0605n.f8114b.f8101d);
                }
                constantState.f8115c = c0605n.f8115c;
                constantState.f8116d = c0605n.f8116d;
                constantState.f8117e = c0605n.f8117e;
            }
            this.f8127n = constantState;
            this.f8130q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0605n c0605n = this.f8127n;
        ColorStateList colorStateList = c0605n.f8115c;
        if (colorStateList != null && (mode = c0605n.f8116d) != null) {
            this.f8128o = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        } else {
            z3 = false;
        }
        C0604m c0604m = c0605n.f8114b;
        if (c0604m.f8111n == null) {
            c0604m.f8111n = Boolean.valueOf(c0604m.f8104g.a());
        }
        if (c0604m.f8111n.booleanValue()) {
            boolean b3 = c0605n.f8114b.f8104g.b(iArr);
            c0605n.f8123k |= b3;
            if (b3) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.f8127n.f8114b.getRootAlpha() != i3) {
            this.f8127n.f8114b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f8127n.f8117e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f8129p = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0635d.v(drawable, i3);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0880a.h(drawable, colorStateList);
            return;
        }
        C0605n c0605n = this.f8127n;
        if (c0605n.f8115c != colorStateList) {
            c0605n.f8115c = colorStateList;
            this.f8128o = a(colorStateList, c0605n.f8116d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0880a.i(drawable, mode);
            return;
        }
        C0605n c0605n = this.f8127n;
        if (c0605n.f8116d != mode) {
            c0605n.f8116d = mode;
            this.f8128o = a(c0605n.f8115c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [l1.i, l1.l, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0604m c0604m;
        int i3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f8071m;
        if (drawable != null) {
            AbstractC0880a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0605n c0605n = this.f8127n;
        c0605n.f8114b = new C0604m();
        TypedArray h3 = AbstractC0839b.h(resources, theme, attributeSet, AbstractC0592a.f8050a);
        C0605n c0605n2 = this.f8127n;
        C0604m c0604m2 = c0605n2.f8114b;
        int i4 = !AbstractC0839b.e(xmlPullParser, "tintMode") ? -1 : h3.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0605n2.f8116d = mode;
        int i5 = 1;
        ColorStateList colorStateList = null;
        if (AbstractC0839b.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            h3.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i6 >= 28 && i6 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = h3.getResources();
                int resourceId = h3.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0840c.f9277a;
                try {
                    colorStateList = AbstractC0840c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0605n2.f8115c = colorStateList2;
        }
        boolean z3 = c0605n2.f8117e;
        if (AbstractC0839b.e(xmlPullParser, "autoMirrored")) {
            z3 = h3.getBoolean(5, z3);
        }
        c0605n2.f8117e = z3;
        float f3 = c0604m2.f8107j;
        if (AbstractC0839b.e(xmlPullParser, "viewportWidth")) {
            f3 = h3.getFloat(7, f3);
        }
        c0604m2.f8107j = f3;
        float f4 = c0604m2.f8108k;
        if (AbstractC0839b.e(xmlPullParser, "viewportHeight")) {
            f4 = h3.getFloat(8, f4);
        }
        c0604m2.f8108k = f4;
        if (c0604m2.f8107j <= 0.0f) {
            throw new XmlPullParserException(h3.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f4 > 0.0f) {
            c0604m2.f8105h = h3.getDimension(3, c0604m2.f8105h);
            float dimension = h3.getDimension(2, c0604m2.f8106i);
            c0604m2.f8106i = dimension;
            if (c0604m2.f8105h <= 0.0f) {
                throw new XmlPullParserException(h3.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = c0604m2.getAlpha();
                if (AbstractC0839b.e(xmlPullParser, "alpha")) {
                    alpha = h3.getFloat(4, alpha);
                }
                c0604m2.setAlpha(alpha);
                String string = h3.getString(0);
                if (string != null) {
                    c0604m2.f8110m = string;
                    c0604m2.f8112o.put(string, c0604m2);
                }
                h3.recycle();
                c0605n.f8113a = getChangingConfigurations();
                c0605n.f8123k = true;
                C0605n c0605n3 = this.f8127n;
                C0604m c0604m3 = c0605n3.f8114b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0604m3.f8104g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                for (int i7 = 3; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i7); i7 = 3) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0601j c0601j = (C0601j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i3 = depth;
                        C0723e c0723e = c0604m3.f8112o;
                        if (equals) {
                            ?? abstractC0603l = new AbstractC0603l();
                            abstractC0603l.f8073e = 0.0f;
                            abstractC0603l.f8075g = 1.0f;
                            abstractC0603l.f8076h = 1.0f;
                            abstractC0603l.f8077i = 0.0f;
                            abstractC0603l.f8078j = 1.0f;
                            abstractC0603l.f8079k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            abstractC0603l.f8080l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            abstractC0603l.f8081m = join3;
                            c0604m = c0604m3;
                            abstractC0603l.f8082n = 4.0f;
                            TypedArray h4 = AbstractC0839b.h(resources, theme, attributeSet, AbstractC0592a.f8052c);
                            if (AbstractC0839b.e(xmlPullParser, "pathData")) {
                                String string2 = h4.getString(0);
                                if (string2 != null) {
                                    abstractC0603l.f8095b = string2;
                                }
                                String string3 = h4.getString(2);
                                if (string3 != null) {
                                    abstractC0603l.f8094a = AbstractC0635d.j(string3);
                                }
                                abstractC0603l.f8074f = AbstractC0839b.b(h4, xmlPullParser, theme, "fillColor", 1);
                                float f5 = abstractC0603l.f8076h;
                                if (AbstractC0839b.e(xmlPullParser, "fillAlpha")) {
                                    f5 = h4.getFloat(12, f5);
                                }
                                abstractC0603l.f8076h = f5;
                                int i8 = !AbstractC0839b.e(xmlPullParser, "strokeLineCap") ? -1 : h4.getInt(8, -1);
                                Paint.Cap cap3 = abstractC0603l.f8080l;
                                if (i8 != 0) {
                                    join = join3;
                                    if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                abstractC0603l.f8080l = cap;
                                int i9 = !AbstractC0839b.e(xmlPullParser, "strokeLineJoin") ? -1 : h4.getInt(9, -1);
                                Paint.Join join4 = abstractC0603l.f8081m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                abstractC0603l.f8081m = join2;
                                float f6 = abstractC0603l.f8082n;
                                if (AbstractC0839b.e(xmlPullParser, "strokeMiterLimit")) {
                                    f6 = h4.getFloat(10, f6);
                                }
                                abstractC0603l.f8082n = f6;
                                abstractC0603l.f8072d = AbstractC0839b.b(h4, xmlPullParser, theme, "strokeColor", 3);
                                float f7 = abstractC0603l.f8075g;
                                if (AbstractC0839b.e(xmlPullParser, "strokeAlpha")) {
                                    f7 = h4.getFloat(11, f7);
                                }
                                abstractC0603l.f8075g = f7;
                                float f8 = abstractC0603l.f8073e;
                                if (AbstractC0839b.e(xmlPullParser, "strokeWidth")) {
                                    f8 = h4.getFloat(4, f8);
                                }
                                abstractC0603l.f8073e = f8;
                                float f9 = abstractC0603l.f8078j;
                                if (AbstractC0839b.e(xmlPullParser, "trimPathEnd")) {
                                    f9 = h4.getFloat(6, f9);
                                }
                                abstractC0603l.f8078j = f9;
                                float f10 = abstractC0603l.f8079k;
                                if (AbstractC0839b.e(xmlPullParser, "trimPathOffset")) {
                                    f10 = h4.getFloat(7, f10);
                                }
                                abstractC0603l.f8079k = f10;
                                float f11 = abstractC0603l.f8077i;
                                if (AbstractC0839b.e(xmlPullParser, "trimPathStart")) {
                                    f11 = h4.getFloat(5, f11);
                                }
                                abstractC0603l.f8077i = f11;
                                int i10 = abstractC0603l.f8096c;
                                if (AbstractC0839b.e(xmlPullParser, "fillType")) {
                                    i10 = h4.getInt(13, i10);
                                }
                                abstractC0603l.f8096c = i10;
                            }
                            h4.recycle();
                            c0601j.f8084b.add(abstractC0603l);
                            if (abstractC0603l.getPathName() != null) {
                                c0723e.put(abstractC0603l.getPathName(), abstractC0603l);
                            }
                            c0605n3.f8113a = c0605n3.f8113a;
                            z4 = false;
                        } else {
                            c0604m = c0604m3;
                            if ("clip-path".equals(name)) {
                                AbstractC0603l abstractC0603l2 = new AbstractC0603l();
                                if (AbstractC0839b.e(xmlPullParser, "pathData")) {
                                    TypedArray h5 = AbstractC0839b.h(resources, theme, attributeSet, AbstractC0592a.f8053d);
                                    String string4 = h5.getString(0);
                                    if (string4 != null) {
                                        abstractC0603l2.f8095b = string4;
                                    }
                                    String string5 = h5.getString(1);
                                    if (string5 != null) {
                                        abstractC0603l2.f8094a = AbstractC0635d.j(string5);
                                    }
                                    abstractC0603l2.f8096c = !AbstractC0839b.e(xmlPullParser, "fillType") ? 0 : h5.getInt(2, 0);
                                    h5.recycle();
                                }
                                c0601j.f8084b.add(abstractC0603l2);
                                if (abstractC0603l2.getPathName() != null) {
                                    c0723e.put(abstractC0603l2.getPathName(), abstractC0603l2);
                                }
                                c0605n3.f8113a = c0605n3.f8113a;
                            } else if ("group".equals(name)) {
                                C0601j c0601j2 = new C0601j();
                                TypedArray h6 = AbstractC0839b.h(resources, theme, attributeSet, AbstractC0592a.f8051b);
                                float f12 = c0601j2.f8085c;
                                if (AbstractC0839b.e(xmlPullParser, "rotation")) {
                                    f12 = h6.getFloat(5, f12);
                                }
                                c0601j2.f8085c = f12;
                                c0601j2.f8086d = h6.getFloat(1, c0601j2.f8086d);
                                c0601j2.f8087e = h6.getFloat(2, c0601j2.f8087e);
                                float f13 = c0601j2.f8088f;
                                if (AbstractC0839b.e(xmlPullParser, "scaleX")) {
                                    f13 = h6.getFloat(3, f13);
                                }
                                c0601j2.f8088f = f13;
                                float f14 = c0601j2.f8089g;
                                if (AbstractC0839b.e(xmlPullParser, "scaleY")) {
                                    f14 = h6.getFloat(4, f14);
                                }
                                c0601j2.f8089g = f14;
                                float f15 = c0601j2.f8090h;
                                if (AbstractC0839b.e(xmlPullParser, "translateX")) {
                                    f15 = h6.getFloat(6, f15);
                                }
                                c0601j2.f8090h = f15;
                                float f16 = c0601j2.f8091i;
                                if (AbstractC0839b.e(xmlPullParser, "translateY")) {
                                    f16 = h6.getFloat(7, f16);
                                }
                                c0601j2.f8091i = f16;
                                String string6 = h6.getString(0);
                                if (string6 != null) {
                                    c0601j2.f8093k = string6;
                                }
                                c0601j2.c();
                                h6.recycle();
                                c0601j.f8084b.add(c0601j2);
                                arrayDeque.push(c0601j2);
                                if (c0601j2.getGroupName() != null) {
                                    c0723e.put(c0601j2.getGroupName(), c0601j2);
                                }
                                c0605n3.f8113a = c0605n3.f8113a;
                            }
                        }
                    } else {
                        c0604m = c0604m3;
                        i3 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i3;
                    c0604m3 = c0604m;
                    i5 = 1;
                }
                if (!z4) {
                    this.f8128o = a(c0605n.f8115c, c0605n.f8116d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(h3.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(h3.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public C0607p(C0605n c0605n) {
        this.f8131r = true;
        this.f8132s = new float[9];
        this.f8133t = new Matrix();
        this.f8134u = new Rect();
        this.f8127n = c0605n;
        this.f8128o = a(c0605n.f8115c, c0605n.f8116d);
    }
}

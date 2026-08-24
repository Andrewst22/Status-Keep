package l;

import C.AbstractC0016q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
/* renamed from: l.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576n {

    /* renamed from: a  reason: collision with root package name */
    public int f7873a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7874b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7875c;

    /* renamed from: d  reason: collision with root package name */
    public Object f7876d;

    /* renamed from: e  reason: collision with root package name */
    public Object f7877e;

    /* renamed from: f  reason: collision with root package name */
    public Object f7878f;

    public C0576n(View view) {
        C0577o c0577o;
        this.f7873a = -1;
        this.f7874b = view;
        PorterDuff.Mode mode = C0577o.f7881b;
        synchronized (C0577o.class) {
            try {
                if (C0577o.f7882c == null) {
                    C0577o.b();
                }
                c0577o = C0577o.f7882c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7875c = c0577o;
    }

    public void a() {
        View view = (View) this.f7874b;
        Drawable background = view.getBackground();
        if (background != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 21 ? i3 == 21 : ((l0) this.f7876d) != null) {
                if (((l0) this.f7878f) == null) {
                    this.f7878f = new Object();
                }
                l0 l0Var = (l0) this.f7878f;
                l0Var.f7866a = null;
                l0Var.f7869d = false;
                l0Var.f7867b = null;
                l0Var.f7868c = false;
                Field field = C.y.f117a;
                ColorStateList g3 = AbstractC0016q.g(view);
                if (g3 != null) {
                    l0Var.f7869d = true;
                    l0Var.f7866a = g3;
                }
                PorterDuff.Mode h3 = AbstractC0016q.h(view);
                if (h3 != null) {
                    l0Var.f7868c = true;
                    l0Var.f7867b = h3;
                }
                if (l0Var.f7869d || l0Var.f7868c) {
                    C0577o.c(background, l0Var, view.getDrawableState());
                    return;
                }
            }
            l0 l0Var2 = (l0) this.f7877e;
            if (l0Var2 != null) {
                C0577o.c(background, l0Var2, view.getDrawableState());
                return;
            }
            l0 l0Var3 = (l0) this.f7876d;
            if (l0Var3 != null) {
                C0577o.c(background, l0Var3, view.getDrawableState());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:3:0x0013, B:5:0x001a, B:6:0x002a, B:8:0x0031, B:10:0x0034, B:17:0x003e, B:19:0x0047, B:21:0x0054, B:23:0x005e, B:30:0x006c, B:32:0x0072, B:33:0x0079, B:34:0x007c, B:36:0x0083, B:38:0x0095, B:40:0x009f, B:45:0x00aa, B:47:0x00b0, B:48:0x00b7, B:7:0x002b), top: B:53:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7874b
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            int[] r2 = e.AbstractC0259a.f5212u
            B1.e r8 = B1.e.n0(r1, r8, r2, r9)
            java.lang.Object r9 = r8.f57o
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r1 = 0
            boolean r2 = r9.hasValue(r1)     // Catch: java.lang.Throwable -> L38
            r3 = -1
            if (r2 == 0) goto L3e
            int r2 = r9.getResourceId(r1, r3)     // Catch: java.lang.Throwable -> L38
            r7.f7873a = r2     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = r7.f7875c     // Catch: java.lang.Throwable -> L38
            l.o r2 = (l.C0577o) r2     // Catch: java.lang.Throwable -> L38
            android.content.Context r4 = r0.getContext()     // Catch: java.lang.Throwable -> L38
            int r5 = r7.f7873a     // Catch: java.lang.Throwable -> L38
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L38
            l.Q r6 = r2.f7883a     // Catch: java.lang.Throwable -> L3b
            android.content.res.ColorStateList r4 = r6.i(r4, r5)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3e
            r7.d(r4)     // Catch: java.lang.Throwable -> L38
            goto L3e
        L38:
            r9 = move-exception
            goto Lbe
        L3b:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r9     // Catch: java.lang.Throwable -> L38
        L3e:
            r2 = 1
            boolean r4 = r9.hasValue(r2)     // Catch: java.lang.Throwable -> L38
            r5 = 21
            if (r4 == 0) goto L7c
            android.content.res.ColorStateList r4 = r8.Z(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Field r6 = C.y.f117a     // Catch: java.lang.Throwable -> L38
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L38
            C.AbstractC0016q.q(r0, r4)     // Catch: java.lang.Throwable -> L38
            if (r6 != r5) goto L7c
            android.graphics.drawable.Drawable r4 = r0.getBackground()     // Catch: java.lang.Throwable -> L38
            android.content.res.ColorStateList r6 = C.AbstractC0016q.g(r0)     // Catch: java.lang.Throwable -> L38
            if (r6 != 0) goto L67
            android.graphics.PorterDuff$Mode r6 = C.AbstractC0016q.h(r0)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L65
            goto L67
        L65:
            r6 = 0
            goto L68
        L67:
            r6 = 1
        L68:
            if (r4 == 0) goto L7c
            if (r6 == 0) goto L7c
            boolean r6 = r4.isStateful()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L79
            int[] r6 = r0.getDrawableState()     // Catch: java.lang.Throwable -> L38
            r4.setState(r6)     // Catch: java.lang.Throwable -> L38
        L79:
            r0.setBackground(r4)     // Catch: java.lang.Throwable -> L38
        L7c:
            r4 = 2
            boolean r6 = r9.hasValue(r4)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto Lba
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L38
            r3 = 0
            android.graphics.PorterDuff$Mode r9 = l.AbstractC0586y.d(r9, r3)     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Field r3 = C.y.f117a     // Catch: java.lang.Throwable -> L38
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L38
            C.AbstractC0016q.r(r0, r9)     // Catch: java.lang.Throwable -> L38
            if (r3 != r5) goto Lba
            android.graphics.drawable.Drawable r9 = r0.getBackground()     // Catch: java.lang.Throwable -> L38
            android.content.res.ColorStateList r3 = C.AbstractC0016q.g(r0)     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto La5
            android.graphics.PorterDuff$Mode r3 = C.AbstractC0016q.h(r0)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto La6
        La5:
            r1 = 1
        La6:
            if (r9 == 0) goto Lba
            if (r1 == 0) goto Lba
            boolean r1 = r9.isStateful()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto Lb7
            int[] r1 = r0.getDrawableState()     // Catch: java.lang.Throwable -> L38
            r9.setState(r1)     // Catch: java.lang.Throwable -> L38
        Lb7:
            r0.setBackground(r9)     // Catch: java.lang.Throwable -> L38
        Lba:
            r8.r0()
            return
        Lbe:
            r8.r0()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0576n.b(android.util.AttributeSet, int):void");
    }

    public void c(int i3) {
        ColorStateList colorStateList;
        this.f7873a = i3;
        C0577o c0577o = (C0577o) this.f7875c;
        if (c0577o != null) {
            Context context = ((View) this.f7874b).getContext();
            synchronized (c0577o) {
                colorStateList = c0577o.f7883a.i(context, i3);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((l0) this.f7876d) == null) {
                this.f7876d = new Object();
            }
            l0 l0Var = (l0) this.f7876d;
            l0Var.f7866a = colorStateList;
            l0Var.f7869d = true;
        } else {
            this.f7876d = null;
        }
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (((l0) this.f7877e) == null) {
            this.f7877e = new Object();
        }
        l0 l0Var = (l0) this.f7877e;
        l0Var.f7866a = colorStateList;
        l0Var.f7869d = true;
        a();
    }

    public void f(PorterDuff.Mode mode) {
        if (((l0) this.f7877e) == null) {
            this.f7877e = new Object();
        }
        l0 l0Var = (l0) this.f7877e;
        l0Var.f7867b = mode;
        l0Var.f7868c = true;
        a();
    }

    public C0576n(int[] iArr, o0.b0[] b0VarArr, int[] iArr2, int[][][] iArr3, o0.b0 b0Var) {
        this.f7874b = iArr;
        this.f7875c = b0VarArr;
        this.f7877e = iArr3;
        this.f7876d = iArr2;
        this.f7878f = b0Var;
        this.f7873a = iArr.length;
    }
}

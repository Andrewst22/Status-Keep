package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
/* renamed from: l.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577o {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f7881b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C0577o f7882c;

    /* renamed from: a  reason: collision with root package name */
    public Q f7883a;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, l.o] */
    public static synchronized void b() {
        synchronized (C0577o.class) {
            if (f7882c == null) {
                ?? obj = new Object();
                f7882c = obj;
                obj.f7883a = Q.d();
                f7882c.f7883a.k(new Z.e());
            }
        }
    }

    public static void c(Drawable drawable, l0 l0Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = Q.f7767h;
        if (AbstractC0586y.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z3 = l0Var.f7869d;
        if (!z3 && !l0Var.f7868c) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z3) {
                colorStateList = l0Var.f7866a;
            } else {
                colorStateList = null;
            }
            if (l0Var.f7868c) {
                mode = l0Var.f7867b;
            } else {
                mode = Q.f7767h;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = Q.h(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable a(Context context, int i3) {
        return this.f7883a.f(context, i3);
    }
}

package f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import l.Q;
import n2.AbstractC0664g;
import u.AbstractC0840c;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f5404a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f5405b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f5406c = new Object();

    public static void a(Context context, int i3, ColorStateList colorStateList) {
        synchronized (f5406c) {
            try {
                WeakHashMap weakHashMap = f5405b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(context, sparseArray);
                }
                sparseArray.append(i3, new C0265a(colorStateList, context.getResources().getConfiguration()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ColorStateList b(Context context, int i3) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0265a c0265a;
        ColorStateList colorStateList3;
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList3 = context.getColorStateList(i3);
            return colorStateList3;
        }
        synchronized (f5406c) {
            try {
                SparseArray sparseArray = (SparseArray) f5405b.get(context);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (c0265a = (C0265a) sparseArray.get(i3)) != null) {
                    if (c0265a.f5403b.equals(context.getResources().getConfiguration())) {
                        colorStateList2 = c0265a.f5402a;
                    } else {
                        sparseArray.remove(i3);
                    }
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = f5404a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i3, typedValue, true);
        int i4 = typedValue.type;
        if (i4 < 28 || i4 > 31) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = AbstractC0840c.a(resources2, resources2.getXml(i3), context.getTheme());
            } catch (Exception e2) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList != null) {
            a(context, i3, colorStateList);
            return colorStateList;
        }
        return AbstractC0664g.n(context, i3);
    }

    public static Drawable c(Context context, int i3) {
        return Q.d().f(context, i3);
    }
}

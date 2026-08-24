package u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
/* renamed from: u.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0850m {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f9294a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f9295b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9296c = new Object();

    public static void a(C0849l c0849l, int i3, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f9296c) {
            try {
                WeakHashMap weakHashMap = f9295b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c0849l);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c0849l, sparseArray);
                }
                sparseArray.append(i3, new C0848k(colorStateList, c0849l.f9292a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

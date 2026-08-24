package j;

import android.view.MenuItem;
import java.lang.reflect.Method;
/* renamed from: j.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItem$OnMenuItemClickListenerC0513b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f7322c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f7323a;

    /* renamed from: b  reason: collision with root package name */
    public Method f7324b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f7324b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f7323a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}

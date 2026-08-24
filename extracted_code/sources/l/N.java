package l;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import e0.C0262c;
import java.lang.reflect.Method;
import k.MenuC0527i;
import k.MenuItemC0528j;
/* loaded from: classes.dex */
public final class N extends K implements L {

    /* renamed from: M  reason: collision with root package name */
    public static final Method f7765M;
    public C0262c L;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f7765M = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // l.L
    public final void c(MenuC0527i menuC0527i, MenuItemC0528j menuItemC0528j) {
        C0262c c0262c = this.L;
        if (c0262c != null) {
            c0262c.c(menuC0527i, menuItemC0528j);
        }
    }

    @Override // l.L
    public final void l(MenuC0527i menuC0527i, MenuItemC0528j menuItemC0528j) {
        C0262c c0262c = this.L;
        if (c0262c != null) {
            c0262c.l(menuC0527i, menuItemC0528j);
        }
    }
}

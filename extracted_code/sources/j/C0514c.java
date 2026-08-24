package j;

import C.AbstractC0005f;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.MenuItemC0528j;
/* renamed from: j.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514c {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f7325A;

    /* renamed from: D  reason: collision with root package name */
    public final /* synthetic */ d f7328D;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f7329a;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7336h;

    /* renamed from: i  reason: collision with root package name */
    public int f7337i;

    /* renamed from: j  reason: collision with root package name */
    public int f7338j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f7339k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f7340l;

    /* renamed from: m  reason: collision with root package name */
    public int f7341m;

    /* renamed from: n  reason: collision with root package name */
    public char f7342n;

    /* renamed from: o  reason: collision with root package name */
    public int f7343o;

    /* renamed from: p  reason: collision with root package name */
    public char f7344p;

    /* renamed from: q  reason: collision with root package name */
    public int f7345q;

    /* renamed from: r  reason: collision with root package name */
    public int f7346r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7347s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7348t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7349u;

    /* renamed from: v  reason: collision with root package name */
    public int f7350v;

    /* renamed from: w  reason: collision with root package name */
    public int f7351w;
    public String x;

    /* renamed from: y  reason: collision with root package name */
    public String f7352y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f7353z;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f7326B = null;

    /* renamed from: C  reason: collision with root package name */
    public PorterDuff.Mode f7327C = null;

    /* renamed from: b  reason: collision with root package name */
    public int f7330b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f7331c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f7332d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f7333e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7334f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7335g = true;

    public C0514c(d dVar, Menu menu) {
        this.f7328D = dVar;
        this.f7329a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f7328D.f7358c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.view.MenuItem$OnMenuItemClickListener, java.lang.Object, j.b] */
    public final void b(MenuItem menuItem) {
        boolean z3;
        MenuItem enabled = menuItem.setChecked(this.f7347s).setVisible(this.f7348t).setEnabled(this.f7349u);
        boolean z4 = false;
        if (this.f7346r >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        enabled.setCheckable(z3).setTitleCondensed(this.f7340l).setIcon(this.f7341m);
        int i3 = this.f7350v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f7352y;
        d dVar = this.f7328D;
        if (str != null) {
            if (!dVar.f7358c.isRestricted()) {
                if (dVar.f7359d == null) {
                    dVar.f7359d = d.a(dVar.f7358c);
                }
                Object obj = dVar.f7359d;
                String str2 = this.f7352y;
                ?? obj2 = new Object();
                obj2.f7323a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f7324b = cls.getMethod(str2, MenuItem$OnMenuItemClickListenerC0513b.f7322c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e2) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        boolean z5 = menuItem instanceof MenuItemC0528j;
        if (z5) {
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) menuItem;
        }
        if (this.f7346r >= 2 && z5) {
            MenuItemC0528j menuItemC0528j2 = (MenuItemC0528j) menuItem;
            menuItemC0528j2.x = (menuItemC0528j2.x & (-5)) | 4;
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.f7354e, dVar.f7356a));
            z4 = true;
        }
        int i4 = this.f7351w;
        if (i4 > 0) {
            if (!z4) {
                menuItem.setActionView(i4);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        CharSequence charSequence = this.f7353z;
        boolean z6 = menuItem instanceof MenuItemC0528j;
        if (z6) {
            ((MenuItemC0528j) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f7325A;
        if (z6) {
            ((MenuItemC0528j) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.m(menuItem, charSequence2);
        }
        char c3 = this.f7342n;
        int i5 = this.f7343o;
        if (z6) {
            ((MenuItemC0528j) menuItem).setAlphabeticShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.g(menuItem, c3, i5);
        }
        char c4 = this.f7344p;
        int i6 = this.f7345q;
        if (z6) {
            ((MenuItemC0528j) menuItem).setNumericShortcut(c4, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0005f.k(menuItem, c4, i6);
        }
        PorterDuff.Mode mode = this.f7327C;
        if (mode != null) {
            if (z6) {
                ((MenuItemC0528j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0005f.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f7326B;
        if (colorStateList != null) {
            if (z6) {
                ((MenuItemC0528j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0005f.i(menuItem, colorStateList);
            }
        }
    }
}

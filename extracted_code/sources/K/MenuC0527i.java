package k;

import C.A;
import C.C;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C0558m;
import l.InterfaceC0574l;
import t.AbstractC0809a;
/* renamed from: k.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0527i implements Menu {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f7416u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f7417a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f7418b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7419c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7420d;

    /* renamed from: e  reason: collision with root package name */
    public C0558m f7421e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f7422f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f7423g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7424h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f7425i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f7426j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7427k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f7428l;

    /* renamed from: s  reason: collision with root package name */
    public MenuItemC0528j f7435s;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7429m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7430n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7431o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7432p = false;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f7433q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f7434r = new CopyOnWriteArrayList();

    /* renamed from: t  reason: collision with root package name */
    public boolean f7436t = false;

    public MenuC0527i(Context context) {
        boolean z3;
        boolean z4 = false;
        this.f7417a = context;
        Resources resources = context.getResources();
        this.f7418b = resources;
        this.f7422f = new ArrayList();
        this.f7423g = new ArrayList();
        this.f7424h = true;
        this.f7425i = new ArrayList();
        this.f7426j = new ArrayList();
        this.f7427k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = C.f59a;
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = A.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                z4 = true;
            }
        }
        this.f7420d = z4;
    }

    public final MenuItemC0528j a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 >= 0 && i7 < 6) {
            int i8 = (f7416u[i7] << 16) | (65535 & i5);
            MenuItemC0528j menuItemC0528j = new MenuItemC0528j(this, i3, i4, i5, i8, charSequence);
            ArrayList arrayList = this.f7422f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((MenuItemC0528j) arrayList.get(size)).f7442d <= i8) {
                        i6 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i6 = 0;
                    break;
                }
            }
            arrayList.add(i6, menuItemC0528j);
            o(true);
            return menuItemC0528j;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        Intent intent2;
        int i8;
        PackageManager packageManager = this.f7417a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i7 = queryIntentActivityOptions.size();
        } else {
            i7 = 0;
        }
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i9 = 0; i9 < i7; i9++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            if (i10 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i10];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItemC0528j a3 = a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            a3.setIcon(resolveInfo.loadIcon(packageManager));
            a3.f7445g = intent3;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = a3;
            }
        }
        return i7;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC0533o interfaceC0533o, Context context) {
        this.f7434r.add(new WeakReference(interfaceC0533o));
        interfaceC0533o.f(context, this);
        this.f7427k = true;
    }

    public final void c(boolean z3) {
        if (this.f7432p) {
            return;
        }
        this.f7432p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7434r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0533o interfaceC0533o = (InterfaceC0533o) weakReference.get();
            if (interfaceC0533o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0533o.b(this, z3);
            }
        }
        this.f7432p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        MenuItemC0528j menuItemC0528j = this.f7435s;
        if (menuItemC0528j != null) {
            d(menuItemC0528j);
        }
        this.f7422f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f7428l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(MenuItemC0528j menuItemC0528j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7434r;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f7435s == menuItemC0528j) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0533o interfaceC0533o = (InterfaceC0533o) weakReference.get();
                if (interfaceC0533o == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = interfaceC0533o.e(menuItemC0528j);
                    if (z3) {
                        break;
                    }
                }
            }
            r();
            if (z3) {
                this.f7435s = null;
            }
        }
        return z3;
    }

    public boolean e(MenuC0527i menuC0527i, MenuItem menuItem) {
        InterfaceC0574l interfaceC0574l;
        C0558m c0558m = this.f7421e;
        if (c0558m != null && (interfaceC0574l = ((ActionMenuView) c0558m.f7632n).f3982J) != null) {
            ((Toolbar) ((C0558m) interfaceC0574l).f7632n).getClass();
            return false;
        }
        return false;
    }

    public boolean f(MenuItemC0528j menuItemC0528j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7434r;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0533o interfaceC0533o = (InterfaceC0533o) weakReference.get();
            if (interfaceC0533o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = interfaceC0533o.a(menuItemC0528j);
                if (z3) {
                    break;
                }
            }
        }
        r();
        if (z3) {
            this.f7435s = menuItemC0528j;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem findItem;
        ArrayList arrayList = this.f7422f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList.get(i4);
            if (menuItemC0528j.f7439a == i3) {
                return menuItemC0528j;
            }
            if (menuItemC0528j.hasSubMenu() && (findItem = menuItemC0528j.f7453o.findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final MenuItemC0528j g(int i3, KeyEvent keyEvent) {
        char c3;
        ArrayList arrayList = this.f7433q;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemC0528j) arrayList.get(0);
        }
        boolean m3 = m();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList.get(i4);
            if (m3) {
                c3 = menuItemC0528j.f7448j;
            } else {
                c3 = menuItemC0528j.f7446h;
            }
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (m3 && c3 == '\b' && i3 == 67))) {
                return menuItemC0528j;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f7422f.get(i3);
    }

    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        char c3;
        int i4;
        boolean m3 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i3 != 67) {
            return;
        }
        ArrayList arrayList2 = this.f7422f;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList2.get(i5);
            if (menuItemC0528j.hasSubMenu()) {
                menuItemC0528j.f7453o.h(arrayList, i3, keyEvent);
            }
            if (m3) {
                c3 = menuItemC0528j.f7448j;
            } else {
                c3 = menuItemC0528j.f7446h;
            }
            if (m3) {
                i4 = menuItemC0528j.f7449k;
            } else {
                i4 = menuItemC0528j.f7447i;
            }
            if ((modifiers & 69647) == (i4 & 69647) && c3 != 0) {
                char[] cArr = keyData.meta;
                if (c3 != cArr[0] && c3 != cArr[2]) {
                    if (m3 && c3 == '\b') {
                        if (i3 != 67) {
                        }
                    }
                }
                if (menuItemC0528j.isEnabled()) {
                    arrayList.add(menuItemC0528j);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f7422f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((MenuItemC0528j) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (!this.f7427k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7434r;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0533o interfaceC0533o = (InterfaceC0533o) weakReference.get();
            if (interfaceC0533o == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 |= interfaceC0533o.g();
            }
        }
        ArrayList arrayList = this.f7425i;
        ArrayList arrayList2 = this.f7426j;
        if (z3) {
            arrayList.clear();
            arrayList2.clear();
            int size = k3.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemC0528j menuItemC0528j = (MenuItemC0528j) k3.get(i3);
                if (menuItemC0528j.d()) {
                    arrayList.add(menuItemC0528j);
                } else {
                    arrayList2.add(menuItemC0528j);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(k());
        }
        this.f7427k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        if (g(i3, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final ArrayList k() {
        boolean z3 = this.f7424h;
        ArrayList arrayList = this.f7423g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f7422f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList2.get(i3);
            if (menuItemC0528j.isVisible()) {
                arrayList.add(menuItemC0528j);
            }
        }
        this.f7424h = false;
        this.f7427k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f7436t;
    }

    public boolean m() {
        return this.f7419c;
    }

    public boolean n() {
        return this.f7420d;
    }

    public final void o(boolean z3) {
        if (!this.f7429m) {
            if (z3) {
                this.f7424h = true;
                this.f7427k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f7434r;
            if (!copyOnWriteArrayList.isEmpty()) {
                s();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    InterfaceC0533o interfaceC0533o = (InterfaceC0533o) weakReference.get();
                    if (interfaceC0533o == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        interfaceC0533o.h();
                    }
                }
                r();
                return;
            }
            return;
        }
        this.f7430n = true;
        if (z3) {
            this.f7431o = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MenuItem r6, k.AbstractC0529k r7, int r8) {
        /*
            r5 = this;
            k.j r6 = (k.MenuItemC0528j) r6
            r0 = 0
            if (r6 == 0) goto Lab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f7454p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = 1
            goto L36
        L1a:
            k.i r1 = r6.f7452n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.f7445g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f7417a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = 0
        L36:
            boolean r3 = r6.c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Laa
            r5.c(r2)
            goto Laa
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L55
            r6 = r8 & 1
            if (r6 != 0) goto Laa
            r5.c(r2)
            goto Laa
        L55:
            r8 = r8 & 4
            if (r8 != 0) goto L5c
            r5.c(r0)
        L5c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L70
            k.s r8 = new k.s
            android.content.Context r3 = r5.f7417a
            r8.<init>(r3, r5, r6)
            r6.f7453o = r8
            java.lang.CharSequence r3 = r6.f7443e
            r8.setHeaderTitle(r3)
        L70:
            k.s r6 = r6.f7453o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f7434r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7b
            goto La4
        L7b:
            if (r7 == 0) goto L81
            boolean r0 = r7.c(r6)
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            k.o r4 = (k.InterfaceC0533o) r4
            if (r4 != 0) goto L9d
            r8.remove(r3)
            goto L85
        L9d:
            if (r0 != 0) goto L85
            boolean r0 = r4.c(r6)
            goto L85
        La4:
            r1 = r1 | r0
            if (r1 != 0) goto Laa
            r5.c(r2)
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.MenuC0527i.p(android.view.MenuItem, k.k, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return p(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        boolean z3;
        MenuItemC0528j g3 = g(i3, keyEvent);
        if (g3 != null) {
            z3 = p(g3, null, i4);
        } else {
            z3 = false;
        }
        if ((i4 & 2) != 0) {
            c(true);
        }
        return z3;
    }

    public final void q(int i3, CharSequence charSequence, int i4, View view) {
        if (view != null) {
            this.f7428l = null;
        } else {
            if (i3 > 0) {
                this.f7428l = this.f7418b.getText(i3);
            } else if (charSequence != null) {
                this.f7428l = charSequence;
            }
            if (i4 > 0) {
                AbstractC0809a.b(this.f7417a, i4);
            }
        }
        o(false);
    }

    public final void r() {
        this.f7429m = false;
        if (this.f7430n) {
            this.f7430n = false;
            o(this.f7431o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f7422f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                if (((MenuItemC0528j) arrayList.get(i5)).f7440b == i3) {
                    break;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((MenuItemC0528j) arrayList.get(i5)).f7440b != i3) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f7422f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f7422f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (((MenuItemC0528j) arrayList.get(i4)).f7439a == i3) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f7422f;
            if (i4 < arrayList2.size()) {
                arrayList2.remove(i4);
                o(true);
            }
        }
    }

    public final void s() {
        if (!this.f7429m) {
            this.f7429m = true;
            this.f7430n = false;
            this.f7431o = false;
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z3, boolean z4) {
        int i4;
        ArrayList arrayList = this.f7422f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList.get(i5);
            if (menuItemC0528j.f7440b == i3) {
                int i6 = menuItemC0528j.x & (-5);
                if (z4) {
                    i4 = 4;
                } else {
                    i4 = 0;
                }
                menuItemC0528j.x = i6 | i4;
                menuItemC0528j.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f7436t = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z3) {
        ArrayList arrayList = this.f7422f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList.get(i4);
            if (menuItemC0528j.f7440b == i3) {
                menuItemC0528j.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z3) {
        int i4;
        ArrayList arrayList = this.f7422f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList.get(i5);
            if (menuItemC0528j.f7440b == i3) {
                int i6 = menuItemC0528j.x;
                int i7 = i6 & (-9);
                if (z3) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                int i8 = i7 | i4;
                menuItemC0528j.x = i8;
                if (i6 != i8) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f7419c = z3;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f7422f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f7418b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f7418b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        MenuItemC0528j a3 = a(i3, i4, i5, charSequence);
        SubMenuC0537s subMenuC0537s = new SubMenuC0537s(this.f7417a, this, a3);
        a3.f7453o = subMenuC0537s;
        subMenuC0537s.setHeaderTitle(a3.f7443e);
        return subMenuC0537s;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f7418b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f7418b.getString(i6));
    }

    public MenuC0527i j() {
        return this;
    }
}

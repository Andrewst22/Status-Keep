package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import m2.AbstractC0635d;
import w.AbstractC0880a;
/* renamed from: k.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC0528j implements MenuItem {

    /* renamed from: A  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f7437A;

    /* renamed from: a  reason: collision with root package name */
    public final int f7439a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7440b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7441c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7442d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f7443e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f7444f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f7445g;

    /* renamed from: h  reason: collision with root package name */
    public char f7446h;

    /* renamed from: j  reason: collision with root package name */
    public char f7448j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f7450l;

    /* renamed from: n  reason: collision with root package name */
    public final MenuC0527i f7452n;

    /* renamed from: o  reason: collision with root package name */
    public SubMenuC0537s f7453o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f7454p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f7455q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f7456r;

    /* renamed from: z  reason: collision with root package name */
    public View f7463z;

    /* renamed from: i  reason: collision with root package name */
    public int f7447i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f7449k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f7451m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f7457s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f7458t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7459u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f7460v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7461w = false;
    public int x = 16;

    /* renamed from: B  reason: collision with root package name */
    public boolean f7438B = false;

    /* renamed from: y  reason: collision with root package name */
    public int f7462y = 0;

    public MenuItemC0528j(MenuC0527i menuC0527i, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f7452n = menuC0527i;
        this.f7439a = i4;
        this.f7440b = i3;
        this.f7441c = i5;
        this.f7442d = i6;
        this.f7443e = charSequence;
    }

    public static void a(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f7461w && (this.f7459u || this.f7460v)) {
            drawable = AbstractC0635d.z(drawable).mutate();
            if (this.f7459u) {
                AbstractC0880a.h(drawable, this.f7457s);
            }
            if (this.f7460v) {
                AbstractC0880a.i(drawable, this.f7458t);
            }
            this.f7461w = false;
        }
        return drawable;
    }

    public final boolean c() {
        if ((this.f7462y & 8) == 0 || this.f7463z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f7462y & 8) == 0) {
            return false;
        }
        if (this.f7463z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7437A;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f7452n.d(this);
    }

    public final boolean d() {
        if ((this.x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final MenuItemC0528j e(CharSequence charSequence) {
        this.f7455q = charSequence;
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7437A;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f7452n.f(this);
    }

    public final void f(boolean z3) {
        if (z3) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    public final MenuItemC0528j g(CharSequence charSequence) {
        this.f7456r = charSequence;
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f7463z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f7449k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f7448j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f7455q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f7440b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f7450l;
        if (drawable != null) {
            return b(drawable);
        }
        int i3 = this.f7451m;
        if (i3 != 0) {
            Drawable c3 = f.b.c(this.f7452n.f7417a, i3);
            this.f7451m = 0;
            this.f7450l = c3;
            return b(c3);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f7457s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f7458t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f7445g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f7439a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f7447i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f7446h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f7441c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f7453o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7443e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7444f;
        if (charSequence == null) {
            return this.f7443e;
        }
        return charSequence;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f7456r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f7453o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f7438B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.x & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f7463z = view;
        if (view != null && view.getId() == -1 && (i3 = this.f7439a) > 0) {
            view.setId(i3);
        }
        MenuC0527i menuC0527i = this.f7452n;
        menuC0527i.f7427k = true;
        menuC0527i.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f7448j == c3) {
            return this;
        }
        this.f7448j = Character.toLowerCase(c3);
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i3 = this.x;
        int i4 = (z3 ? 1 : 0) | (i3 & (-2));
        this.x = i4;
        if (i3 != i4) {
            this.f7452n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        boolean z4;
        int i3;
        int i4 = this.x;
        int i5 = 2;
        if ((i4 & 4) != 0) {
            MenuC0527i menuC0527i = this.f7452n;
            menuC0527i.getClass();
            ArrayList arrayList = menuC0527i.f7422f;
            int size = arrayList.size();
            menuC0527i.s();
            for (int i6 = 0; i6 < size; i6++) {
                MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList.get(i6);
                if (menuItemC0528j.f7440b == this.f7440b && (menuItemC0528j.x & 4) != 0 && menuItemC0528j.isCheckable()) {
                    if (menuItemC0528j == this) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i7 = menuItemC0528j.x;
                    int i8 = i7 & (-3);
                    if (z4) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i9 = i3 | i8;
                    menuItemC0528j.x = i9;
                    if (i7 != i9) {
                        menuItemC0528j.f7452n.o(false);
                    }
                }
            }
            menuC0527i.r();
        } else {
            int i10 = i4 & (-3);
            if (!z3) {
                i5 = 0;
            }
            int i11 = i10 | i5;
            this.x = i11;
            if (i4 != i11) {
                this.f7452n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f7451m = 0;
        this.f7450l = drawable;
        this.f7461w = true;
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7457s = colorStateList;
        this.f7459u = true;
        this.f7461w = true;
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7458t = mode;
        this.f7460v = true;
        this.f7461w = true;
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f7445g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f7446h == c3) {
            return this;
        }
        this.f7446h = c3;
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7437A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7454p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f7446h = c3;
        this.f7448j = Character.toLowerCase(c4);
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f7462y = i3;
        MenuC0527i menuC0527i = this.f7452n;
        menuC0527i.f7427k = true;
        menuC0527i.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7443e = charSequence;
        this.f7452n.o(false);
        SubMenuC0537s subMenuC0537s = this.f7453o;
        if (subMenuC0537s != null) {
            subMenuC0537s.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7444f = charSequence;
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i3;
        int i4 = this.x;
        int i5 = i4 & (-9);
        if (z3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        int i6 = i3 | i5;
        this.x = i6;
        if (i4 != i6) {
            MenuC0527i menuC0527i = this.f7452n;
            menuC0527i.f7424h = true;
            menuC0527i.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f7443e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f7448j == c3 && this.f7449k == i3) {
            return this;
        }
        this.f7448j = Character.toLowerCase(c3);
        this.f7449k = KeyEvent.normalizeMetaState(i3);
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i3) {
        if (this.f7446h == c3 && this.f7447i == i3) {
            return this;
        }
        this.f7446h = c3;
        this.f7447i = KeyEvent.normalizeMetaState(i3);
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f7446h = c3;
        this.f7447i = KeyEvent.normalizeMetaState(i3);
        this.f7448j = Character.toLowerCase(c4);
        this.f7449k = KeyEvent.normalizeMetaState(i4);
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f7450l = null;
        this.f7451m = i3;
        this.f7461w = true;
        this.f7452n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f7452n.f7417a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.f7452n.f7417a;
        View inflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f7463z = inflate;
        if (inflate != null && inflate.getId() == -1 && (i4 = this.f7439a) > 0) {
            inflate.setId(i4);
        }
        MenuC0527i menuC0527i = this.f7452n;
        menuC0527i.f7427k = true;
        menuC0527i.o(true);
        return this;
    }
}

package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: k.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC0537s extends MenuC0527i implements SubMenu {

    /* renamed from: v  reason: collision with root package name */
    public final MenuC0527i f7495v;

    /* renamed from: w  reason: collision with root package name */
    public final MenuItemC0528j f7496w;

    public SubMenuC0537s(Context context, MenuC0527i menuC0527i, MenuItemC0528j menuItemC0528j) {
        super(context);
        this.f7495v = menuC0527i;
        this.f7496w = menuItemC0528j;
    }

    @Override // k.MenuC0527i
    public final boolean d(MenuItemC0528j menuItemC0528j) {
        return this.f7495v.d(menuItemC0528j);
    }

    @Override // k.MenuC0527i
    public final boolean e(MenuC0527i menuC0527i, MenuItem menuItem) {
        super.e(menuC0527i, menuItem);
        return this.f7495v.e(menuC0527i, menuItem);
    }

    @Override // k.MenuC0527i
    public final boolean f(MenuItemC0528j menuItemC0528j) {
        return this.f7495v.f(menuItemC0528j);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f7496w;
    }

    @Override // k.MenuC0527i
    public final MenuC0527i j() {
        return this.f7495v.j();
    }

    @Override // k.MenuC0527i
    public final boolean l() {
        return this.f7495v.l();
    }

    @Override // k.MenuC0527i
    public final boolean m() {
        return this.f7495v.m();
    }

    @Override // k.MenuC0527i
    public final boolean n() {
        return this.f7495v.n();
    }

    @Override // k.MenuC0527i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f7495v.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f7496w.setIcon(drawable);
        return this;
    }

    @Override // k.MenuC0527i, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f7495v.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        q(0, null, i3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        q(i3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f7496w.setIcon(i3);
        return this;
    }
}

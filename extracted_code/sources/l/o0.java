package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import j.InterfaceC0512a;
import java.util.ArrayList;
import k.InterfaceC0533o;
import k.MenuC0527i;
import k.MenuItemC0528j;
import k.SubMenuC0537s;
/* loaded from: classes.dex */
public final class o0 implements InterfaceC0533o {

    /* renamed from: m  reason: collision with root package name */
    public MenuC0527i f7884m;

    /* renamed from: n  reason: collision with root package name */
    public MenuItemC0528j f7885n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Toolbar f7886o;

    public o0(Toolbar toolbar) {
        this.f7886o = toolbar;
    }

    @Override // k.InterfaceC0533o
    public final boolean a(MenuItemC0528j menuItemC0528j) {
        Toolbar toolbar = this.f7886o;
        toolbar.c();
        ViewParent parent = toolbar.f4104t.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4104t);
            }
            toolbar.addView(toolbar.f4104t);
        }
        View view = menuItemC0528j.f7463z;
        if (view == null) {
            view = null;
        }
        toolbar.f4105u = view;
        this.f7885n = menuItemC0528j;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4105u);
            }
            p0 g3 = Toolbar.g();
            g3.f7889a = (toolbar.f4109z & 112) | 8388611;
            g3.f7890b = 2;
            toolbar.f4105u.setLayoutParams(g3);
            toolbar.addView(toolbar.f4105u);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((p0) childAt.getLayoutParams()).f7890b != 2 && childAt != toolbar.f4097m) {
                toolbar.removeViewAt(childCount);
                toolbar.f4090Q.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC0528j.f7438B = true;
        menuItemC0528j.f7452n.o(false);
        View view2 = toolbar.f4105u;
        if (view2 instanceof InterfaceC0512a) {
            SearchView searchView = (SearchView) ((InterfaceC0512a) view2);
            if (!searchView.f4026l0) {
                searchView.f4026l0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f3994B;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f4027m0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // k.InterfaceC0533o
    public final boolean c(SubMenuC0537s subMenuC0537s) {
        return false;
    }

    @Override // k.InterfaceC0533o
    public final boolean e(MenuItemC0528j menuItemC0528j) {
        Toolbar toolbar = this.f7886o;
        View view = toolbar.f4105u;
        if (view instanceof InterfaceC0512a) {
            SearchView searchView = (SearchView) ((InterfaceC0512a) view);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3994B;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f4025k0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f4027m0);
            searchView.f4026l0 = false;
        }
        toolbar.removeView(toolbar.f4105u);
        toolbar.removeView(toolbar.f4104t);
        toolbar.f4105u = null;
        ArrayList arrayList = toolbar.f4090Q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f7885n = null;
        toolbar.requestLayout();
        menuItemC0528j.f7438B = false;
        menuItemC0528j.f7452n.o(false);
        return true;
    }

    @Override // k.InterfaceC0533o
    public final void f(Context context, MenuC0527i menuC0527i) {
        MenuItemC0528j menuItemC0528j;
        MenuC0527i menuC0527i2 = this.f7884m;
        if (menuC0527i2 != null && (menuItemC0528j = this.f7885n) != null) {
            menuC0527i2.d(menuItemC0528j);
        }
        this.f7884m = menuC0527i;
    }

    @Override // k.InterfaceC0533o
    public final boolean g() {
        return false;
    }

    @Override // k.InterfaceC0533o
    public final void h() {
        if (this.f7885n != null) {
            MenuC0527i menuC0527i = this.f7884m;
            if (menuC0527i != null) {
                int size = menuC0527i.f7422f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f7884m.getItem(i3) == this.f7885n) {
                        return;
                    }
                }
            }
            e(this.f7885n);
        }
    }

    @Override // k.InterfaceC0533o
    public final void b(MenuC0527i menuC0527i, boolean z3) {
    }
}

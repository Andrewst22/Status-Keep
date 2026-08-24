package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
/* renamed from: k.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525g extends BaseAdapter {

    /* renamed from: m  reason: collision with root package name */
    public final MenuC0527i f7410m;

    /* renamed from: n  reason: collision with root package name */
    public int f7411n = -1;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7412o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7413p;

    /* renamed from: q  reason: collision with root package name */
    public final LayoutInflater f7414q;

    /* renamed from: r  reason: collision with root package name */
    public final int f7415r;

    public C0525g(MenuC0527i menuC0527i, LayoutInflater layoutInflater, boolean z3, int i3) {
        this.f7413p = z3;
        this.f7414q = layoutInflater;
        this.f7410m = menuC0527i;
        this.f7415r = i3;
        a();
    }

    public final void a() {
        MenuC0527i menuC0527i = this.f7410m;
        MenuItemC0528j menuItemC0528j = menuC0527i.f7435s;
        if (menuItemC0528j != null) {
            menuC0527i.i();
            ArrayList arrayList = menuC0527i.f7426j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((MenuItemC0528j) arrayList.get(i3)) == menuItemC0528j) {
                    this.f7411n = i3;
                    return;
                }
            }
        }
        this.f7411n = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final MenuItemC0528j getItem(int i3) {
        ArrayList k3;
        MenuC0527i menuC0527i = this.f7410m;
        if (this.f7413p) {
            menuC0527i.i();
            k3 = menuC0527i.f7426j;
        } else {
            k3 = menuC0527i.k();
        }
        int i4 = this.f7411n;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (MenuItemC0528j) k3.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k3;
        MenuC0527i menuC0527i = this.f7410m;
        if (this.f7413p) {
            menuC0527i.i();
            k3 = menuC0527i.f7426j;
        } else {
            k3 = menuC0527i.k();
        }
        if (this.f7411n < 0) {
            return k3.size();
        }
        return k3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        int i4;
        boolean z3 = false;
        if (view == null) {
            view = this.f7414q.inflate(this.f7415r, viewGroup, false);
        }
        int i5 = getItem(i3).f7440b;
        int i6 = i3 - 1;
        if (i6 >= 0) {
            i4 = getItem(i6).f7440b;
        } else {
            i4 = i5;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f7410m.l() && i5 != i4) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        InterfaceC0534p interfaceC0534p = (InterfaceC0534p) view;
        if (this.f7412o) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0534p.b(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

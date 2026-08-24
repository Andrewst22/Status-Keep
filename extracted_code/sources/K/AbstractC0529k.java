package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* renamed from: k.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0529k implements InterfaceC0535q, InterfaceC0533o, AdapterView.OnItemClickListener {

    /* renamed from: m  reason: collision with root package name */
    public Rect f7464m;

    public static int m(ListAdapter listAdapter, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    public static boolean u(MenuC0527i menuC0527i) {
        int size = menuC0527i.f7422f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = menuC0527i.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // k.InterfaceC0533o
    public final boolean a(MenuItemC0528j menuItemC0528j) {
        return false;
    }

    @Override // k.InterfaceC0533o
    public final boolean e(MenuItemC0528j menuItemC0528j) {
        return false;
    }

    public abstract void l(MenuC0527i menuC0527i);

    public abstract void n(View view);

    public abstract void o(boolean z3);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        C0525g c0525g;
        int i4;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c0525g = (C0525g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c0525g = (C0525g) listAdapter;
        }
        MenuC0527i menuC0527i = c0525g.f7410m;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i3);
        if (!(this instanceof View$OnKeyListenerC0524f)) {
            i4 = 0;
        } else {
            i4 = 4;
        }
        menuC0527i.p(menuItem, this, i4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z3);

    public abstract void t(int i3);

    @Override // k.InterfaceC0533o
    public final void f(Context context, MenuC0527i menuC0527i) {
    }
}

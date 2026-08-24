package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import k.C0525g;
import k.MenuC0527i;
import k.MenuItemC0528j;
/* loaded from: classes.dex */
public final class M extends A {

    /* renamed from: A  reason: collision with root package name */
    public final int f7761A;

    /* renamed from: B  reason: collision with root package name */
    public L f7762B;

    /* renamed from: C  reason: collision with root package name */
    public MenuItemC0528j f7763C;

    /* renamed from: z  reason: collision with root package name */
    public final int f7764z;

    public M(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f7764z = 21;
            this.f7761A = 22;
            return;
        }
        this.f7764z = 22;
        this.f7761A = 21;
    }

    @Override // l.A, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0525g c0525g;
        int i3;
        MenuItemC0528j menuItemC0528j;
        int pointToPosition;
        int i4;
        if (this.f7762B != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i3 = headerViewListAdapter.getHeadersCount();
                c0525g = (C0525g) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0525g = (C0525g) adapter;
                i3 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i4 = pointToPosition - i3) >= 0 && i4 < c0525g.getCount()) {
                menuItemC0528j = c0525g.getItem(i4);
            } else {
                menuItemC0528j = null;
            }
            MenuItemC0528j menuItemC0528j2 = this.f7763C;
            if (menuItemC0528j2 != menuItemC0528j) {
                MenuC0527i menuC0527i = c0525g.f7410m;
                if (menuItemC0528j2 != null) {
                    this.f7762B.l(menuC0527i, menuItemC0528j2);
                }
                this.f7763C = menuItemC0528j;
                if (menuItemC0528j != null) {
                    this.f7762B.c(menuC0527i, menuItemC0528j);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f7764z) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i3 == this.f7761A) {
            setSelection(-1);
            ((C0525g) getAdapter()).f7410m.c(false);
            return true;
        } else {
            return super.onKeyDown(i3, keyEvent);
        }
    }

    public void setHoverListener(L l3) {
        this.f7762B = l3;
    }

    @Override // l.A, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

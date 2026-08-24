package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.example.flutter_application_1.R;
import java.util.ArrayList;
import k.AbstractC0529k;
import k.InterfaceC0532n;
import k.InterfaceC0533o;
import k.InterfaceC0534p;
import k.MenuC0527i;
import k.MenuItemC0528j;
import k.SubMenuC0537s;
import k0.C0558m;
/* renamed from: l.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571i implements InterfaceC0533o {

    /* renamed from: A  reason: collision with root package name */
    public int f7831A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f7832B;

    /* renamed from: D  reason: collision with root package name */
    public C0568f f7834D;

    /* renamed from: E  reason: collision with root package name */
    public C0568f f7835E;

    /* renamed from: F  reason: collision with root package name */
    public P2.i f7836F;

    /* renamed from: G  reason: collision with root package name */
    public C0569g f7837G;

    /* renamed from: m  reason: collision with root package name */
    public final Context f7839m;

    /* renamed from: n  reason: collision with root package name */
    public Context f7840n;

    /* renamed from: o  reason: collision with root package name */
    public MenuC0527i f7841o;

    /* renamed from: p  reason: collision with root package name */
    public final LayoutInflater f7842p;

    /* renamed from: q  reason: collision with root package name */
    public InterfaceC0532n f7843q;

    /* renamed from: s  reason: collision with root package name */
    public ActionMenuView f7845s;

    /* renamed from: t  reason: collision with root package name */
    public C0570h f7846t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f7847u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f7848v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7849w;
    public boolean x;

    /* renamed from: y  reason: collision with root package name */
    public int f7850y;

    /* renamed from: z  reason: collision with root package name */
    public int f7851z;

    /* renamed from: r  reason: collision with root package name */
    public final int f7844r = R.layout.abc_action_menu_item_layout;

    /* renamed from: C  reason: collision with root package name */
    public final SparseBooleanArray f7833C = new SparseBooleanArray();

    /* renamed from: H  reason: collision with root package name */
    public final C0558m f7838H = new C0558m(this, 6);

    public C0571i(Context context) {
        this.f7839m = context;
        this.f7842p = LayoutInflater.from(context);
    }

    @Override // k.InterfaceC0533o
    public final boolean a(MenuItemC0528j menuItemC0528j) {
        return false;
    }

    @Override // k.InterfaceC0533o
    public final void b(MenuC0527i menuC0527i, boolean z3) {
        i();
        C0568f c0568f = this.f7835E;
        if (c0568f != null && c0568f.b()) {
            c0568f.f7474i.dismiss();
        }
        InterfaceC0532n interfaceC0532n = this.f7843q;
        if (interfaceC0532n != null) {
            interfaceC0532n.b(menuC0527i, z3);
        }
    }

    @Override // k.InterfaceC0533o
    public final boolean c(SubMenuC0537s subMenuC0537s) {
        boolean z3;
        if (!subMenuC0537s.hasVisibleItems()) {
            return false;
        }
        SubMenuC0537s subMenuC0537s2 = subMenuC0537s;
        while (true) {
            MenuC0527i menuC0527i = subMenuC0537s2.f7495v;
            if (menuC0527i == this.f7841o) {
                break;
            }
            subMenuC0537s2 = (SubMenuC0537s) menuC0527i;
        }
        ActionMenuView actionMenuView = this.f7845s;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i3);
                if ((childAt instanceof InterfaceC0534p) && ((InterfaceC0534p) childAt).getItemData() == subMenuC0537s2.f7496w) {
                    view = childAt;
                    break;
                }
                i3++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0537s.f7496w.getClass();
        int size = subMenuC0537s.f7422f.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                MenuItem item = subMenuC0537s.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i4++;
            } else {
                z3 = false;
                break;
            }
        }
        C0568f c0568f = new C0568f(this, this.f7840n, subMenuC0537s, view);
        this.f7835E = c0568f;
        c0568f.f7472g = z3;
        AbstractC0529k abstractC0529k = c0568f.f7474i;
        if (abstractC0529k != null) {
            abstractC0529k.o(z3);
        }
        C0568f c0568f2 = this.f7835E;
        if (!c0568f2.b()) {
            if (c0568f2.f7470e != null) {
                c0568f2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        InterfaceC0532n interfaceC0532n = this.f7843q;
        if (interfaceC0532n != null) {
            interfaceC0532n.n(subMenuC0537s);
        }
        return true;
    }

    public final View d(MenuItemC0528j menuItemC0528j, View view, ActionMenuView actionMenuView) {
        InterfaceC0534p interfaceC0534p;
        View view2 = menuItemC0528j.f7463z;
        if (view2 == null) {
            view2 = null;
        }
        int i3 = 0;
        if (view2 == null || menuItemC0528j.c()) {
            if (view instanceof InterfaceC0534p) {
                interfaceC0534p = (InterfaceC0534p) view;
            } else {
                interfaceC0534p = (InterfaceC0534p) this.f7842p.inflate(this.f7844r, (ViewGroup) actionMenuView, false);
            }
            interfaceC0534p.b(menuItemC0528j);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0534p;
            actionMenuItemView.setItemInvoker(this.f7845s);
            if (this.f7837G == null) {
                this.f7837G = new C0569g(this);
            }
            actionMenuItemView.setPopupCallback(this.f7837G);
            view2 = (View) interfaceC0534p;
        }
        if (menuItemC0528j.f7438B) {
            i3 = 8;
        }
        view2.setVisibility(i3);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0573k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // k.InterfaceC0533o
    public final boolean e(MenuItemC0528j menuItemC0528j) {
        return false;
    }

    @Override // k.InterfaceC0533o
    public final void f(Context context, MenuC0527i menuC0527i) {
        this.f7840n = context;
        LayoutInflater.from(context);
        this.f7841o = menuC0527i;
        Resources resources = context.getResources();
        if (!this.x) {
            this.f7849w = true;
        }
        int i3 = 2;
        this.f7850y = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i4 <= 600 && ((i4 <= 960 || i5 <= 720) && (i4 <= 720 || i5 <= 960))) {
            if (i4 < 500 && ((i4 <= 640 || i5 <= 480) && (i4 <= 480 || i5 <= 640))) {
                if (i4 >= 360) {
                    i3 = 3;
                }
            } else {
                i3 = 4;
            }
        } else {
            i3 = 5;
        }
        this.f7831A = i3;
        int i6 = this.f7850y;
        if (this.f7849w) {
            if (this.f7846t == null) {
                C0570h c0570h = new C0570h(this, this.f7839m);
                this.f7846t = c0570h;
                if (this.f7848v) {
                    c0570h.setImageDrawable(this.f7847u);
                    this.f7847u = null;
                    this.f7848v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f7846t.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f7846t.getMeasuredWidth();
        } else {
            this.f7846t = null;
        }
        this.f7851z = i6;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // k.InterfaceC0533o
    public final boolean g() {
        ArrayList arrayList;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        MenuC0527i menuC0527i = this.f7841o;
        if (menuC0527i != null) {
            arrayList = menuC0527i.k();
            i3 = arrayList.size();
        } else {
            arrayList = null;
            i3 = 0;
        }
        int i5 = this.f7831A;
        int i6 = this.f7851z;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f7845s;
        int i7 = 0;
        boolean z7 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i7 >= i3) {
                break;
            }
            MenuItemC0528j menuItemC0528j = (MenuItemC0528j) arrayList.get(i7);
            int i10 = menuItemC0528j.f7462y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z7 = true;
            }
            if (this.f7832B && menuItemC0528j.f7438B) {
                i5 = 0;
            }
            i7++;
        }
        if (this.f7849w && (z7 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = this.f7833C;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            MenuItemC0528j menuItemC0528j2 = (MenuItemC0528j) arrayList.get(i12);
            int i14 = menuItemC0528j2.f7462y;
            if ((i14 & 2) == i4) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i15 = menuItemC0528j2.f7440b;
            if (z4) {
                View d3 = d(menuItemC0528j2, null, actionMenuView);
                d3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d3.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z3);
                }
                menuItemC0528j2.f(z3);
            } else if ((i14 & 1) == z3) {
                boolean z8 = sparseBooleanArray.get(i15);
                if ((i11 > 0 || z8) && i6 > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    View d4 = d(menuItemC0528j2, null, actionMenuView);
                    d4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = d4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (i6 + i13 > 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z5 &= z6;
                }
                if (z5 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z8) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        MenuItemC0528j menuItemC0528j3 = (MenuItemC0528j) arrayList.get(i16);
                        if (menuItemC0528j3.f7440b == i15) {
                            if (menuItemC0528j3.d()) {
                                i11++;
                            }
                            menuItemC0528j3.f(false);
                        }
                    }
                }
                if (z5) {
                    i11--;
                }
                menuItemC0528j2.f(z5);
            } else {
                menuItemC0528j2.f(false);
                i12++;
                i4 = 2;
                z3 = true;
            }
            i12++;
            i4 = 2;
            z3 = true;
        }
        return true;
    }

    @Override // k.InterfaceC0533o
    public final void h() {
        int i3;
        MenuItemC0528j menuItemC0528j;
        ActionMenuView actionMenuView = this.f7845s;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (actionMenuView != null) {
            MenuC0527i menuC0527i = this.f7841o;
            if (menuC0527i != null) {
                menuC0527i.i();
                ArrayList k3 = this.f7841o.k();
                int size = k3.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    MenuItemC0528j menuItemC0528j2 = (MenuItemC0528j) k3.get(i4);
                    if (menuItemC0528j2.d()) {
                        View childAt = actionMenuView.getChildAt(i3);
                        if (childAt instanceof InterfaceC0534p) {
                            menuItemC0528j = ((InterfaceC0534p) childAt).getItemData();
                        } else {
                            menuItemC0528j = null;
                        }
                        View d3 = d(menuItemC0528j2, childAt, actionMenuView);
                        if (menuItemC0528j2 != menuItemC0528j) {
                            d3.setPressed(false);
                            d3.jumpDrawablesToCurrentState();
                        }
                        if (d3 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) d3.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(d3);
                            }
                            this.f7845s.addView(d3, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i3) == this.f7846t) {
                    i3++;
                } else {
                    actionMenuView.removeViewAt(i3);
                }
            }
        }
        this.f7845s.requestLayout();
        MenuC0527i menuC0527i2 = this.f7841o;
        if (menuC0527i2 != null) {
            menuC0527i2.i();
            ArrayList arrayList2 = menuC0527i2.f7425i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((MenuItemC0528j) arrayList2.get(i5)).getClass();
            }
        }
        MenuC0527i menuC0527i3 = this.f7841o;
        if (menuC0527i3 != null) {
            menuC0527i3.i();
            arrayList = menuC0527i3.f7426j;
        }
        if (this.f7849w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((MenuItemC0528j) arrayList.get(0)).f7438B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f7846t == null) {
                this.f7846t = new C0570h(this, this.f7839m);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f7846t.getParent();
            if (viewGroup2 != this.f7845s) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f7846t);
                }
                ActionMenuView actionMenuView2 = this.f7845s;
                C0570h c0570h = this.f7846t;
                actionMenuView2.getClass();
                C0573k h3 = ActionMenuView.h();
                h3.f7859c = true;
                actionMenuView2.addView(c0570h, h3);
            }
        } else {
            C0570h c0570h2 = this.f7846t;
            if (c0570h2 != null) {
                ViewParent parent = c0570h2.getParent();
                ActionMenuView actionMenuView3 = this.f7845s;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f7846t);
                }
            }
        }
        this.f7845s.setOverflowReserved(this.f7849w);
    }

    public final boolean i() {
        ActionMenuView actionMenuView;
        P2.i iVar = this.f7836F;
        if (iVar != null && (actionMenuView = this.f7845s) != null) {
            actionMenuView.removeCallbacks(iVar);
            this.f7836F = null;
            return true;
        }
        C0568f c0568f = this.f7834D;
        if (c0568f != null) {
            if (c0568f.b()) {
                c0568f.f7474i.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean j() {
        MenuC0527i menuC0527i;
        if (this.f7849w) {
            C0568f c0568f = this.f7834D;
            if ((c0568f == null || !c0568f.b()) && (menuC0527i = this.f7841o) != null && this.f7845s != null && this.f7836F == null) {
                menuC0527i.i();
                if (!menuC0527i.f7426j.isEmpty()) {
                    P2.i iVar = new P2.i(3, this, new C0568f(this, this.f7840n, this.f7841o, this.f7846t));
                    this.f7836F = iVar;
                    this.f7845s.post(iVar);
                    InterfaceC0532n interfaceC0532n = this.f7843q;
                    if (interfaceC0532n != null) {
                        interfaceC0532n.n(null);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // k.InterfaceC0533o
    public final void k(InterfaceC0532n interfaceC0532n) {
        throw null;
    }
}

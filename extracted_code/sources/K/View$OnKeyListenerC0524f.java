package k;

import C.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.example.flutter_application_1.R;
import e0.C0262c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.AbstractC0582u;
import l.K;
import l.M;
import l.N;
/* renamed from: k.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0524f extends AbstractC0529k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A  reason: collision with root package name */
    public View f7387A;

    /* renamed from: B  reason: collision with root package name */
    public int f7388B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f7389C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f7390D;

    /* renamed from: E  reason: collision with root package name */
    public int f7391E;

    /* renamed from: F  reason: collision with root package name */
    public int f7392F;

    /* renamed from: H  reason: collision with root package name */
    public boolean f7394H;

    /* renamed from: I  reason: collision with root package name */
    public InterfaceC0532n f7395I;

    /* renamed from: J  reason: collision with root package name */
    public ViewTreeObserver f7396J;

    /* renamed from: K  reason: collision with root package name */
    public C0530l f7397K;
    public boolean L;

    /* renamed from: n  reason: collision with root package name */
    public final Context f7398n;

    /* renamed from: o  reason: collision with root package name */
    public final int f7399o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7400p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f7401q;

    /* renamed from: r  reason: collision with root package name */
    public final Handler f7402r;

    /* renamed from: z  reason: collision with root package name */
    public View f7409z;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f7403s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f7404t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0521c f7405u = new ViewTreeObserver$OnGlobalLayoutListenerC0521c(this, 0);

    /* renamed from: v  reason: collision with root package name */
    public final View$OnAttachStateChangeListenerC0522d f7406v = new View$OnAttachStateChangeListenerC0522d(this, 0);

    /* renamed from: w  reason: collision with root package name */
    public final C0262c f7407w = new C0262c(this, 29);
    public int x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f7408y = 0;

    /* renamed from: G  reason: collision with root package name */
    public boolean f7393G = false;

    public View$OnKeyListenerC0524f(Context context, View view, int i3, boolean z3) {
        this.f7398n = context;
        this.f7409z = view;
        this.f7400p = i3;
        this.f7401q = z3;
        Field field = y.f117a;
        this.f7388B = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f7399o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f7402r = new Handler();
    }

    @Override // k.InterfaceC0533o
    public final void b(MenuC0527i menuC0527i, boolean z3) {
        int i3;
        ArrayList arrayList = this.f7404t;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (menuC0527i == ((C0523e) arrayList.get(i4)).f7385b) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < 0) {
            return;
        }
        int i5 = i4 + 1;
        if (i5 < arrayList.size()) {
            ((C0523e) arrayList.get(i5)).f7385b.c(false);
        }
        C0523e c0523e = (C0523e) arrayList.remove(i4);
        CopyOnWriteArrayList copyOnWriteArrayList = c0523e.f7385b.f7434r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0533o interfaceC0533o = (InterfaceC0533o) weakReference.get();
            if (interfaceC0533o == null || interfaceC0533o == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z4 = this.L;
        N n3 = c0523e.f7384a;
        if (z4) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC0582u.p(n3.f7747H);
            }
            n3.f7747H.setAnimationStyle(0);
        }
        n3.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f7388B = ((C0523e) arrayList.get(size2 - 1)).f7386c;
        } else {
            View view = this.f7409z;
            Field field = y.f117a;
            if (view.getLayoutDirection() == 1) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            this.f7388B = i3;
        }
        if (size2 == 0) {
            dismiss();
            InterfaceC0532n interfaceC0532n = this.f7395I;
            if (interfaceC0532n != null) {
                interfaceC0532n.b(menuC0527i, true);
            }
            ViewTreeObserver viewTreeObserver = this.f7396J;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f7396J.removeGlobalOnLayoutListener(this.f7405u);
                }
                this.f7396J = null;
            }
            this.f7387A.removeOnAttachStateChangeListener(this.f7406v);
            this.f7397K.onDismiss();
        } else if (z3) {
            ((C0523e) arrayList.get(0)).f7385b.c(false);
        }
    }

    @Override // k.InterfaceC0533o
    public final boolean c(SubMenuC0537s subMenuC0537s) {
        Iterator it = this.f7404t.iterator();
        while (it.hasNext()) {
            C0523e c0523e = (C0523e) it.next();
            if (subMenuC0537s == c0523e.f7385b) {
                c0523e.f7384a.f7750o.requestFocus();
                return true;
            }
        }
        if (subMenuC0537s.hasVisibleItems()) {
            l(subMenuC0537s);
            InterfaceC0532n interfaceC0532n = this.f7395I;
            if (interfaceC0532n != null) {
                interfaceC0532n.n(subMenuC0537s);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0535q
    public final void d() {
        boolean z3;
        if (i()) {
            return;
        }
        ArrayList arrayList = this.f7403s;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC0527i) it.next());
        }
        arrayList.clear();
        View view = this.f7409z;
        this.f7387A = view;
        if (view != null) {
            if (this.f7396J == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f7396J = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f7405u);
            }
            this.f7387A.addOnAttachStateChangeListener(this.f7406v);
        }
    }

    @Override // k.InterfaceC0535q
    public final void dismiss() {
        ArrayList arrayList = this.f7404t;
        int size = arrayList.size();
        if (size > 0) {
            C0523e[] c0523eArr = (C0523e[]) arrayList.toArray(new C0523e[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C0523e c0523e = c0523eArr[i3];
                if (c0523e.f7384a.f7747H.isShowing()) {
                    c0523e.f7384a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0533o
    public final boolean g() {
        return false;
    }

    @Override // k.InterfaceC0533o
    public final void h() {
        Iterator it = this.f7404t.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0523e) it.next()).f7384a.f7750o.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0525g) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0535q
    public final boolean i() {
        ArrayList arrayList = this.f7404t;
        if (arrayList.size() <= 0 || !((C0523e) arrayList.get(0)).f7384a.f7747H.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // k.InterfaceC0535q
    public final ListView j() {
        ArrayList arrayList = this.f7404t;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0523e) arrayList.get(arrayList.size() - 1)).f7384a.f7750o;
    }

    @Override // k.InterfaceC0533o
    public final void k(InterfaceC0532n interfaceC0532n) {
        this.f7395I = interfaceC0532n;
    }

    @Override // k.AbstractC0529k
    public final void l(MenuC0527i menuC0527i) {
        menuC0527i.b(this, this.f7398n);
        if (i()) {
            v(menuC0527i);
        } else {
            this.f7403s.add(menuC0527i);
        }
    }

    @Override // k.AbstractC0529k
    public final void n(View view) {
        if (this.f7409z != view) {
            this.f7409z = view;
            int i3 = this.x;
            Field field = y.f117a;
            this.f7408y = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0529k
    public final void o(boolean z3) {
        this.f7393G = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0523e c0523e;
        ArrayList arrayList = this.f7404t;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                c0523e = (C0523e) arrayList.get(i3);
                if (!c0523e.f7384a.f7747H.isShowing()) {
                    break;
                }
                i3++;
            } else {
                c0523e = null;
                break;
            }
        }
        if (c0523e != null) {
            c0523e.f7385b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i3 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // k.AbstractC0529k
    public final void p(int i3) {
        if (this.x != i3) {
            this.x = i3;
            View view = this.f7409z;
            Field field = y.f117a;
            this.f7408y = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC0529k
    public final void q(int i3) {
        this.f7389C = true;
        this.f7391E = i3;
    }

    @Override // k.AbstractC0529k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f7397K = (C0530l) onDismissListener;
    }

    @Override // k.AbstractC0529k
    public final void s(boolean z3) {
        this.f7394H = z3;
    }

    @Override // k.AbstractC0529k
    public final void t(int i3) {
        this.f7390D = true;
        this.f7392F = i3;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [l.K, l.N] */
    public final void v(MenuC0527i menuC0527i) {
        View view;
        C0523e c0523e;
        Rect rect;
        int i3;
        boolean z3;
        char c3;
        int i4;
        int i5;
        int i6;
        MenuItem menuItem;
        C0525g c0525g;
        int i7;
        int i8;
        int firstVisiblePosition;
        Context context = this.f7398n;
        LayoutInflater from = LayoutInflater.from(context);
        C0525g c0525g2 = new C0525g(menuC0527i, from, this.f7401q, R.layout.abc_cascading_menu_item_layout);
        if (!i() && this.f7393G) {
            c0525g2.f7412o = true;
        } else if (i()) {
            c0525g2.f7412o = AbstractC0529k.u(menuC0527i);
        }
        int m3 = AbstractC0529k.m(c0525g2, context, this.f7399o);
        ?? k3 = new K(context, this.f7400p);
        l.r rVar = k3.f7747H;
        k3.L = this.f7407w;
        k3.f7759y = this;
        rVar.setOnDismissListener(this);
        k3.x = this.f7409z;
        k3.f7757v = this.f7408y;
        k3.f7746G = true;
        rVar.setFocusable(true);
        rVar.setInputMethodMode(2);
        k3.a(c0525g2);
        Drawable background = rVar.getBackground();
        if (background != null) {
            Rect rect2 = k3.f7744E;
            background.getPadding(rect2);
            k3.f7751p = rect2.left + rect2.right + m3;
        } else {
            k3.f7751p = m3;
        }
        k3.f7757v = this.f7408y;
        ArrayList arrayList = this.f7404t;
        if (arrayList.size() > 0) {
            c0523e = (C0523e) arrayList.get(arrayList.size() - 1);
            MenuC0527i menuC0527i2 = c0523e.f7385b;
            int size = menuC0527i2.f7422f.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    menuItem = menuC0527i2.getItem(i9);
                    if (menuItem.hasSubMenu() && menuC0527i == menuItem.getSubMenu()) {
                        break;
                    }
                    i9++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem != null) {
                M m4 = c0523e.f7384a.f7750o;
                ListAdapter adapter = m4.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    c0525g = (C0525g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0525g = (C0525g) adapter;
                    i7 = 0;
                }
                int count = c0525g.getCount();
                int i10 = 0;
                while (true) {
                    if (i10 < count) {
                        if (menuItem == c0525g.getItem(i10)) {
                            i8 = -1;
                            break;
                        }
                        i10++;
                    } else {
                        i8 = -1;
                        i10 = -1;
                        break;
                    }
                }
                if (i10 != i8 && (firstVisiblePosition = (i10 + i7) - m4.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m4.getChildCount()) {
                    view = m4.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            view = null;
            c0523e = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT > 28) {
                rVar.setTouchModal(false);
            } else {
                Method method = N.f7765M;
                if (method != null) {
                    try {
                        method.invoke(rVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                AbstractC0582u.h(rVar);
            }
            M m5 = ((C0523e) arrayList.get(arrayList.size() - 1)).f7384a.f7750o;
            int[] iArr = new int[2];
            m5.getLocationOnScreen(iArr);
            Rect rect3 = new Rect();
            this.f7387A.getWindowVisibleDisplayFrame(rect3);
            if (this.f7388B != 1 ? iArr[0] - m3 >= 0 : m5.getWidth() + iArr[0] + m3 > rect3.right) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            if (i3 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f7388B = i3;
            if (i11 >= 26) {
                k3.x = view;
                i5 = 0;
                i4 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f7409z.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f7408y & 7) == 5) {
                    c3 = 0;
                    iArr2[0] = this.f7409z.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                } else {
                    c3 = 0;
                }
                i4 = iArr3[c3] - iArr2[c3];
                i5 = iArr3[1] - iArr2[1];
            }
            if ((this.f7408y & 5) == 5) {
                if (z3) {
                    i6 = i4 + m3;
                } else {
                    i6 = i4 - view.getWidth();
                }
            } else if (z3) {
                i6 = i4 + view.getWidth();
            } else {
                i6 = i4 - m3;
            }
            k3.f7752q = i6;
            k3.f7756u = true;
            k3.f7755t = true;
            k3.f7753r = i5;
            k3.f7754s = true;
        } else {
            if (this.f7389C) {
                k3.f7752q = this.f7391E;
            }
            if (this.f7390D) {
                k3.f7753r = this.f7392F;
                k3.f7754s = true;
            }
            Rect rect4 = this.f7464m;
            if (rect4 != null) {
                rect = new Rect(rect4);
            } else {
                rect = null;
            }
            k3.f7745F = rect;
        }
        arrayList.add(new C0523e(k3, menuC0527i, this.f7388B));
        k3.d();
        M m6 = k3.f7750o;
        m6.setOnKeyListener(this);
        if (c0523e == null && this.f7394H && menuC0527i.f7428l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m6, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(menuC0527i.f7428l);
            m6.addHeaderView(frameLayout, null, false);
            k3.d();
        }
    }
}

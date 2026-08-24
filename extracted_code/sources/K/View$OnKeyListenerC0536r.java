package k;

import C.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.example.flutter_application_1.R;
import java.lang.reflect.Field;
import l.K;
import l.M;
import l.N;
/* renamed from: k.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0536r extends AbstractC0529k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A  reason: collision with root package name */
    public ViewTreeObserver f7477A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f7478B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f7479C;

    /* renamed from: D  reason: collision with root package name */
    public int f7480D;

    /* renamed from: F  reason: collision with root package name */
    public boolean f7482F;

    /* renamed from: n  reason: collision with root package name */
    public final Context f7483n;

    /* renamed from: o  reason: collision with root package name */
    public final MenuC0527i f7484o;

    /* renamed from: p  reason: collision with root package name */
    public final C0525g f7485p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f7486q;

    /* renamed from: r  reason: collision with root package name */
    public final int f7487r;

    /* renamed from: s  reason: collision with root package name */
    public final int f7488s;

    /* renamed from: t  reason: collision with root package name */
    public final N f7489t;

    /* renamed from: w  reason: collision with root package name */
    public C0530l f7492w;
    public View x;

    /* renamed from: y  reason: collision with root package name */
    public View f7493y;

    /* renamed from: z  reason: collision with root package name */
    public InterfaceC0532n f7494z;

    /* renamed from: u  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0521c f7490u = new ViewTreeObserver$OnGlobalLayoutListenerC0521c(this, 1);

    /* renamed from: v  reason: collision with root package name */
    public final View$OnAttachStateChangeListenerC0522d f7491v = new View$OnAttachStateChangeListenerC0522d(this, 1);

    /* renamed from: E  reason: collision with root package name */
    public int f7481E = 0;

    /* JADX WARN: Type inference failed for: r6v1, types: [l.K, l.N] */
    public View$OnKeyListenerC0536r(int i3, Context context, View view, MenuC0527i menuC0527i, boolean z3) {
        this.f7483n = context;
        this.f7484o = menuC0527i;
        this.f7486q = z3;
        this.f7485p = new C0525g(menuC0527i, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f7488s = i3;
        Resources resources = context.getResources();
        this.f7487r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.x = view;
        this.f7489t = new K(context, i3);
        menuC0527i.b(this, context);
    }

    @Override // k.InterfaceC0533o
    public final void b(MenuC0527i menuC0527i, boolean z3) {
        if (menuC0527i != this.f7484o) {
            return;
        }
        dismiss();
        InterfaceC0532n interfaceC0532n = this.f7494z;
        if (interfaceC0532n != null) {
            interfaceC0532n.b(menuC0527i, z3);
        }
    }

    @Override // k.InterfaceC0533o
    public final boolean c(SubMenuC0537s subMenuC0537s) {
        int i3;
        if (subMenuC0537s.hasVisibleItems()) {
            View view = this.f7493y;
            C0531m c0531m = new C0531m(this.f7488s, this.f7483n, view, subMenuC0537s, this.f7486q);
            InterfaceC0532n interfaceC0532n = this.f7494z;
            c0531m.f7473h = interfaceC0532n;
            AbstractC0529k abstractC0529k = c0531m.f7474i;
            if (abstractC0529k != null) {
                abstractC0529k.k(interfaceC0532n);
            }
            boolean u3 = AbstractC0529k.u(subMenuC0537s);
            c0531m.f7472g = u3;
            AbstractC0529k abstractC0529k2 = c0531m.f7474i;
            if (abstractC0529k2 != null) {
                abstractC0529k2.o(u3);
            }
            c0531m.f7475j = this.f7492w;
            this.f7492w = null;
            this.f7484o.c(false);
            N n3 = this.f7489t;
            int i4 = n3.f7752q;
            if (!n3.f7754s) {
                i3 = 0;
            } else {
                i3 = n3.f7753r;
            }
            int i5 = this.f7481E;
            View view2 = this.x;
            Field field = y.f117a;
            if ((Gravity.getAbsoluteGravity(i5, view2.getLayoutDirection()) & 7) == 5) {
                i4 += this.x.getWidth();
            }
            if (!c0531m.b()) {
                if (c0531m.f7470e != null) {
                    c0531m.d(i4, i3, true, true);
                }
            }
            InterfaceC0532n interfaceC0532n2 = this.f7494z;
            if (interfaceC0532n2 != null) {
                interfaceC0532n2.n(subMenuC0537s);
            }
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0535q
    public final void d() {
        View view;
        boolean z3;
        Rect rect;
        if (!i()) {
            if (!this.f7478B && (view = this.x) != null) {
                this.f7493y = view;
                N n3 = this.f7489t;
                n3.f7747H.setOnDismissListener(this);
                n3.f7759y = this;
                n3.f7746G = true;
                n3.f7747H.setFocusable(true);
                View view2 = this.f7493y;
                if (this.f7477A == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f7477A = viewTreeObserver;
                if (z3) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f7490u);
                }
                view2.addOnAttachStateChangeListener(this.f7491v);
                n3.x = view2;
                n3.f7757v = this.f7481E;
                boolean z4 = this.f7479C;
                Context context = this.f7483n;
                C0525g c0525g = this.f7485p;
                if (!z4) {
                    this.f7480D = AbstractC0529k.m(c0525g, context, this.f7487r);
                    this.f7479C = true;
                }
                int i3 = this.f7480D;
                Drawable background = n3.f7747H.getBackground();
                if (background != null) {
                    Rect rect2 = n3.f7744E;
                    background.getPadding(rect2);
                    n3.f7751p = rect2.left + rect2.right + i3;
                } else {
                    n3.f7751p = i3;
                }
                n3.f7747H.setInputMethodMode(2);
                Rect rect3 = this.f7464m;
                if (rect3 != null) {
                    rect = new Rect(rect3);
                } else {
                    rect = null;
                }
                n3.f7745F = rect;
                n3.d();
                M m3 = n3.f7750o;
                m3.setOnKeyListener(this);
                if (this.f7482F) {
                    MenuC0527i menuC0527i = this.f7484o;
                    if (menuC0527i.f7428l != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m3, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(menuC0527i.f7428l);
                        }
                        frameLayout.setEnabled(false);
                        m3.addHeaderView(frameLayout, null, false);
                    }
                }
                n3.a(c0525g);
                n3.d();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // k.InterfaceC0535q
    public final void dismiss() {
        if (i()) {
            this.f7489t.dismiss();
        }
    }

    @Override // k.InterfaceC0533o
    public final boolean g() {
        return false;
    }

    @Override // k.InterfaceC0533o
    public final void h() {
        this.f7479C = false;
        C0525g c0525g = this.f7485p;
        if (c0525g != null) {
            c0525g.notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC0535q
    public final boolean i() {
        if (!this.f7478B && this.f7489t.f7747H.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // k.InterfaceC0535q
    public final ListView j() {
        return this.f7489t.f7750o;
    }

    @Override // k.InterfaceC0533o
    public final void k(InterfaceC0532n interfaceC0532n) {
        this.f7494z = interfaceC0532n;
    }

    @Override // k.AbstractC0529k
    public final void n(View view) {
        this.x = view;
    }

    @Override // k.AbstractC0529k
    public final void o(boolean z3) {
        this.f7485p.f7412o = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7478B = true;
        this.f7484o.c(true);
        ViewTreeObserver viewTreeObserver = this.f7477A;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f7477A = this.f7493y.getViewTreeObserver();
            }
            this.f7477A.removeGlobalOnLayoutListener(this.f7490u);
            this.f7477A = null;
        }
        this.f7493y.removeOnAttachStateChangeListener(this.f7491v);
        C0530l c0530l = this.f7492w;
        if (c0530l != null) {
            c0530l.onDismiss();
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
        this.f7481E = i3;
    }

    @Override // k.AbstractC0529k
    public final void q(int i3) {
        this.f7489t.f7752q = i3;
    }

    @Override // k.AbstractC0529k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f7492w = (C0530l) onDismissListener;
    }

    @Override // k.AbstractC0529k
    public final void s(boolean z3) {
        this.f7482F = z3;
    }

    @Override // k.AbstractC0529k
    public final void t(int i3) {
        N n3 = this.f7489t;
        n3.f7753r = i3;
        n3.f7754s = true;
    }

    @Override // k.AbstractC0529k
    public final void l(MenuC0527i menuC0527i) {
    }
}

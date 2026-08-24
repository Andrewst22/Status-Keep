package k;

import C.y;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.example.flutter_application_1.R;
import java.lang.reflect.Field;
/* renamed from: k.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0531m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7466a;

    /* renamed from: b  reason: collision with root package name */
    public final MenuC0527i f7467b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7468c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7469d;

    /* renamed from: e  reason: collision with root package name */
    public View f7470e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7472g;

    /* renamed from: h  reason: collision with root package name */
    public InterfaceC0532n f7473h;

    /* renamed from: i  reason: collision with root package name */
    public AbstractC0529k f7474i;

    /* renamed from: j  reason: collision with root package name */
    public C0530l f7475j;

    /* renamed from: f  reason: collision with root package name */
    public int f7471f = 8388611;

    /* renamed from: k  reason: collision with root package name */
    public final C0530l f7476k = new C0530l(this);

    public C0531m(int i3, Context context, View view, MenuC0527i menuC0527i, boolean z3) {
        this.f7466a = context;
        this.f7467b = menuC0527i;
        this.f7470e = view;
        this.f7468c = z3;
        this.f7469d = i3;
    }

    public final AbstractC0529k a() {
        AbstractC0529k view$OnKeyListenerC0536r;
        if (this.f7474i == null) {
            Context context = this.f7466a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                view$OnKeyListenerC0536r = new View$OnKeyListenerC0524f(context, this.f7470e, this.f7469d, this.f7468c);
            } else {
                View view = this.f7470e;
                Context context2 = this.f7466a;
                boolean z3 = this.f7468c;
                view$OnKeyListenerC0536r = new View$OnKeyListenerC0536r(this.f7469d, context2, view, this.f7467b, z3);
            }
            view$OnKeyListenerC0536r.l(this.f7467b);
            view$OnKeyListenerC0536r.r(this.f7476k);
            view$OnKeyListenerC0536r.n(this.f7470e);
            view$OnKeyListenerC0536r.k(this.f7473h);
            view$OnKeyListenerC0536r.o(this.f7472g);
            view$OnKeyListenerC0536r.p(this.f7471f);
            this.f7474i = view$OnKeyListenerC0536r;
        }
        return this.f7474i;
    }

    public final boolean b() {
        AbstractC0529k abstractC0529k = this.f7474i;
        if (abstractC0529k != null && abstractC0529k.i()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f7474i = null;
        C0530l c0530l = this.f7475j;
        if (c0530l != null) {
            c0530l.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z3, boolean z4) {
        AbstractC0529k a3 = a();
        a3.s(z4);
        if (z3) {
            int i5 = this.f7471f;
            View view = this.f7470e;
            Field field = y.f117a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f7470e.getWidth();
            }
            a3.q(i3);
            a3.t(i4);
            int i6 = (int) ((this.f7466a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f7464m = new Rect(i3 - i6, i4 - i6, i3 + i6, i4 + i6);
        }
        a3.d();
    }
}

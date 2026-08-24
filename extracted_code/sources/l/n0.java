package l;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import k.MenuItemC0528j;
/* loaded from: classes.dex */
public final class n0 implements View.OnClickListener {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7879m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f7880n;

    public n0(s0 s0Var) {
        this.f7880n = s0Var;
        s0Var.f7908a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItemC0528j menuItemC0528j;
        switch (this.f7879m) {
            case 0:
                o0 o0Var = ((Toolbar) this.f7880n).f4094U;
                if (o0Var == null) {
                    menuItemC0528j = null;
                } else {
                    menuItemC0528j = o0Var.f7885n;
                }
                if (menuItemC0528j != null) {
                    menuItemC0528j.collapseActionView();
                    return;
                }
                return;
            default:
                s0 s0Var = (s0) this.f7880n;
                if (s0Var.f7918k != null) {
                    s0Var.getClass();
                    return;
                }
                return;
        }
    }

    public n0(Toolbar toolbar) {
        this.f7880n = toolbar;
    }
}

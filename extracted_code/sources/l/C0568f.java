package l;

import android.content.Context;
import android.view.View;
import com.example.flutter_application_1.R;
import k.AbstractC0529k;
import k.C0531m;
import k.MenuC0527i;
import k.SubMenuC0537s;
import k0.C0558m;
/* renamed from: l.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568f extends C0531m {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7800l = 1;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0571i f7801m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0568f(C0571i c0571i, Context context, MenuC0527i menuC0527i, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC0527i, true);
        this.f7801m = c0571i;
        this.f7471f = 8388613;
        C0558m c0558m = c0571i.f7838H;
        this.f7473h = c0558m;
        AbstractC0529k abstractC0529k = this.f7474i;
        if (abstractC0529k != null) {
            abstractC0529k.k(c0558m);
        }
    }

    @Override // k.C0531m
    public final void c() {
        switch (this.f7800l) {
            case 0:
                C0571i c0571i = this.f7801m;
                c0571i.f7835E = null;
                c0571i.getClass();
                super.c();
                return;
            default:
                C0571i c0571i2 = this.f7801m;
                MenuC0527i menuC0527i = c0571i2.f7841o;
                if (menuC0527i != null) {
                    menuC0527i.c(true);
                }
                c0571i2.f7834D = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0568f(C0571i c0571i, Context context, SubMenuC0537s subMenuC0537s, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC0537s, false);
        this.f7801m = c0571i;
        if (!subMenuC0537s.f7496w.d()) {
            View view2 = c0571i.f7846t;
            this.f7470e = view2 == null ? c0571i.f7845s : view2;
        }
        C0558m c0558m = c0571i.f7838H;
        this.f7473h = c0558m;
        AbstractC0529k abstractC0529k = this.f7474i;
        if (abstractC0529k != null) {
            abstractC0529k.k(c0558m);
        }
    }
}

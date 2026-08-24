package R1;

import e0.C0262c;
import k.C0523e;
import k.MenuC0527i;
import k.MenuItemC0528j;
import k.View$OnKeyListenerC0524f;
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2087m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f2088n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f2089o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f2090p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f2091q;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f2087m = i3;
        this.f2091q = obj;
        this.f2088n = obj2;
        this.f2089o = obj3;
        this.f2090p = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2087m) {
            case 0:
                ((f) ((f) this.f2091q).f2093b).a((String) this.f2088n, (String) this.f2089o, this.f2090p);
                return;
            default:
                C0523e c0523e = (C0523e) this.f2088n;
                if (c0523e != null) {
                    C0262c c0262c = (C0262c) this.f2091q;
                    ((View$OnKeyListenerC0524f) c0262c.f5225n).L = true;
                    c0523e.f7385b.c(false);
                    ((View$OnKeyListenerC0524f) c0262c.f5225n).L = false;
                }
                MenuItemC0528j menuItemC0528j = (MenuItemC0528j) this.f2089o;
                if (menuItemC0528j.isEnabled() && menuItemC0528j.hasSubMenu()) {
                    ((MenuC0527i) this.f2090p).p(menuItemC0528j, null, 4);
                    return;
                }
                return;
        }
    }
}

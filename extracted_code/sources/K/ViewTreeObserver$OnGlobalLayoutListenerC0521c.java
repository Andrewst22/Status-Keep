package k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import l.N;
/* renamed from: k.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC0521c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7380m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ AbstractC0529k f7381n;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC0521c(AbstractC0529k abstractC0529k, int i3) {
        this.f7380m = i3;
        this.f7381n = abstractC0529k;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f7380m) {
            case 0:
                View$OnKeyListenerC0524f view$OnKeyListenerC0524f = (View$OnKeyListenerC0524f) this.f7381n;
                if (view$OnKeyListenerC0524f.i()) {
                    ArrayList arrayList = view$OnKeyListenerC0524f.f7404t;
                    if (arrayList.size() > 0 && !((C0523e) arrayList.get(0)).f7384a.f7746G) {
                        View view = view$OnKeyListenerC0524f.f7387A;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0523e) it.next()).f7384a.d();
                            }
                            return;
                        }
                        view$OnKeyListenerC0524f.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                View$OnKeyListenerC0536r view$OnKeyListenerC0536r = (View$OnKeyListenerC0536r) this.f7381n;
                if (view$OnKeyListenerC0536r.i()) {
                    N n3 = view$OnKeyListenerC0536r.f7489t;
                    if (!n3.f7746G) {
                        View view2 = view$OnKeyListenerC0536r.f7493y;
                        if (view2 != null && view2.isShown()) {
                            n3.d();
                            return;
                        } else {
                            view$OnKeyListenerC0536r.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}

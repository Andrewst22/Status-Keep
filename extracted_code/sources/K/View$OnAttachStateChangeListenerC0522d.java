package k;

import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: k.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC0522d implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0529k f7383b;

    public /* synthetic */ View$OnAttachStateChangeListenerC0522d(AbstractC0529k abstractC0529k, int i3) {
        this.f7382a = i3;
        this.f7383b = abstractC0529k;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f7382a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f7382a) {
            case 0:
                View$OnKeyListenerC0524f view$OnKeyListenerC0524f = (View$OnKeyListenerC0524f) this.f7383b;
                ViewTreeObserver viewTreeObserver = view$OnKeyListenerC0524f.f7396J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        view$OnKeyListenerC0524f.f7396J = view.getViewTreeObserver();
                    }
                    view$OnKeyListenerC0524f.f7396J.removeGlobalOnLayoutListener(view$OnKeyListenerC0524f.f7405u);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                View$OnKeyListenerC0536r view$OnKeyListenerC0536r = (View$OnKeyListenerC0536r) this.f7383b;
                ViewTreeObserver viewTreeObserver2 = view$OnKeyListenerC0536r.f7477A;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        view$OnKeyListenerC0536r.f7477A = view.getViewTreeObserver();
                    }
                    view$OnKeyListenerC0536r.f7477A.removeGlobalOnLayoutListener(view$OnKeyListenerC0536r.f7490u);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}

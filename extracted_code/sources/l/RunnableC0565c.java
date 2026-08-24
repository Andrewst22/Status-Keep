package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;
/* renamed from: l.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0565c implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7797m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f7798n;

    public /* synthetic */ RunnableC0565c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f7797m = i3;
        this.f7798n = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7797m) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7798n;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f3956F = actionBarOverlayLayout.f3963o.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f3957G);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7798n;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f3956F = actionBarOverlayLayout2.f3963o.animate().translationY(-actionBarOverlayLayout2.f3963o.getHeight()).setListener(actionBarOverlayLayout2.f3957G);
                return;
        }
    }
}

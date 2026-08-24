package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
/* renamed from: l.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f7796a;

    public C0564b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f7796a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7796a;
        actionBarOverlayLayout.f3956F = null;
        actionBarOverlayLayout.f3970v = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f7796a;
        actionBarOverlayLayout.f3956F = null;
        actionBarOverlayLayout.f3970v = false;
    }
}

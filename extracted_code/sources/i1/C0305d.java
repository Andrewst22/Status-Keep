package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* renamed from: i1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5996a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0307f f5997b;

    public C0305d(C0307f c0307f) {
        this.f5997b = c0307f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5996a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f5996a) {
            this.f5996a = false;
            return;
        }
        C0307f c0307f = this.f5997b;
        if (((Float) c0307f.f6020u.getAnimatedValue()).floatValue() == 0.0f) {
            c0307f.f6021v = 0;
            c0307f.e(0);
            return;
        }
        c0307f.f6021v = 2;
        c0307f.f6013n.invalidate();
    }
}

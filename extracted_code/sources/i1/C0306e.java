package i1;

import android.animation.ValueAnimator;
/* renamed from: i1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0307f f5998a;

    public C0306e(C0307f c0307f) {
        this.f5998a = c0307f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0307f c0307f = this.f5998a;
        c0307f.f6001b.setAlpha(floatValue);
        c0307f.f6002c.setAlpha(floatValue);
        c0307f.f6013n.invalidate();
    }
}

package i1;

import android.view.animation.Interpolator;
/* renamed from: i1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class animation.InterpolatorC0315n implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        float f4 = f3 - 1.0f;
        return (f4 * f4 * f4 * f4 * f4) + 1.0f;
    }
}

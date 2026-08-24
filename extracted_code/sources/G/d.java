package g;

import android.animation.TimeInterpolator;
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f5675a;

    /* renamed from: b  reason: collision with root package name */
    public int f5676b;

    /* renamed from: c  reason: collision with root package name */
    public int f5677c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        float f4;
        int i3 = (int) ((f3 * this.f5677c) + 0.5f);
        int i4 = this.f5676b;
        int[] iArr = this.f5675a;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = iArr[i5];
            if (i3 < i6) {
                break;
            }
            i3 -= i6;
            i5++;
        }
        if (i5 < i4) {
            f4 = i3 / this.f5677c;
        } else {
            f4 = 0.0f;
        }
        return (i5 / i4) + f4;
    }
}

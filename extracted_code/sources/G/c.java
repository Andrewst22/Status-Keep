package g;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
/* loaded from: classes.dex */
public final class c extends android.support.v4.media.session.a {

    /* renamed from: b  reason: collision with root package name */
    public final ObjectAnimator f5673b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5674c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.animation.TimeInterpolator, java.lang.Object, g.d] */
    public c(AnimationDrawable animationDrawable, boolean z3, boolean z4) {
        int i3;
        int i4;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i5 = z3 ? numberOfFrames - 1 : 0;
        if (z3) {
            i3 = 0;
        } else {
            i3 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f5676b = numberOfFrames2;
        int[] iArr = obj.f5675a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f5675a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f5675a;
        int i6 = 0;
        for (int i7 = 0; i7 < numberOfFrames2; i7++) {
            if (z3) {
                i4 = (numberOfFrames2 - i7) - 1;
            } else {
                i4 = i7;
            }
            int duration = animationDrawable.getDuration(i4);
            iArr2[i7] = duration;
            i6 += duration;
        }
        obj.f5677c = i6;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i5, i3);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(obj.f5677c);
        ofInt.setInterpolator(obj);
        this.f5674c = z4;
        this.f5673b = ofInt;
    }

    @Override // android.support.v4.media.session.a
    public final void L() {
        this.f5673b.reverse();
    }

    @Override // android.support.v4.media.session.a
    public final void U() {
        this.f5673b.start();
    }

    @Override // android.support.v4.media.session.a
    public final void W() {
        this.f5673b.cancel();
    }

    @Override // android.support.v4.media.session.a
    public final boolean e() {
        return this.f5674c;
    }
}

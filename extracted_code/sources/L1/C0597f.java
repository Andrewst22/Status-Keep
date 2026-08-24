package l1;

import android.animation.TypeEvaluator;
/* renamed from: l1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597f implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final C0597f f8070a = new Object();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f4 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = ((((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3) * f3) + pow3;
        return Integer.valueOf((Math.round(((float) Math.pow(((pow4 - pow) * f3) + pow, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((((((intValue2 >> 24) & 255) / 255.0f) - f4) * f3) + f4) * 255.0f) << 24) | (Math.round(((float) Math.pow(((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f3) + pow2, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f));
    }
}

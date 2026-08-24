package R;

import U.AbstractC0123a;
import java.util.Locale;
/* loaded from: classes.dex */
public final class J {

    /* renamed from: d  reason: collision with root package name */
    public static final J f1778d = new J(1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f1779a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1780b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1781c;

    static {
        U.A.H(0);
        U.A.H(1);
    }

    public J(float f3) {
        this(f3, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J.class != obj.getClass()) {
            return false;
        }
        J j3 = (J) obj;
        if (this.f1779a == j3.f1779a && this.f1780b == j3.f1780b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1780b) + ((Float.floatToRawIntBits(this.f1779a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f1779a), Float.valueOf(this.f1780b)};
        int i3 = U.A.f2405a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public J(float f3, float f4) {
        AbstractC0123a.e(f3 > 0.0f);
        AbstractC0123a.e(f4 > 0.0f);
        this.f1779a = f3;
        this.f1780b = f4;
        this.f1781c = Math.round(f3 * 1000.0f);
    }
}

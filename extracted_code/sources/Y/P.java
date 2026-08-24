package Y;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final long f3150a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3151b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3152c;

    public P(O o3) {
        this.f3150a = o3.f3147a;
        this.f3151b = o3.f3148b;
        this.f3152c = o3.f3149c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        if (this.f3150a == p3.f3150a && this.f3151b == p3.f3151b && this.f3152c == p3.f3152c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3150a), Float.valueOf(this.f3151b), Long.valueOf(this.f3152c)});
    }
}

package Y;

import U.AbstractC0123a;
import o0.C0701z;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final C0701z f3168a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3169b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3170c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3171d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3172e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3173f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3174g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3175h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3176i;

    public T(C0701z c0701z, long j3, long j4, long j5, long j6, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        boolean z8;
        boolean z9 = true;
        if (z6 && !z4) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0123a.e(z7);
        if (z5 && !z4) {
            z8 = false;
        } else {
            z8 = true;
        }
        AbstractC0123a.e(z8);
        if (z3 && (z4 || z5 || z6)) {
            z9 = false;
        }
        AbstractC0123a.e(z9);
        this.f3168a = c0701z;
        this.f3169b = j3;
        this.f3170c = j4;
        this.f3171d = j5;
        this.f3172e = j6;
        this.f3173f = z3;
        this.f3174g = z4;
        this.f3175h = z5;
        this.f3176i = z6;
    }

    public final T a(long j3) {
        if (j3 == this.f3170c) {
            return this;
        }
        return new T(this.f3168a, this.f3169b, j3, this.f3171d, this.f3172e, this.f3173f, this.f3174g, this.f3175h, this.f3176i);
    }

    public final T b(long j3) {
        if (j3 == this.f3169b) {
            return this;
        }
        return new T(this.f3168a, j3, this.f3170c, this.f3171d, this.f3172e, this.f3173f, this.f3174g, this.f3175h, this.f3176i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t3 = (T) obj;
        if (this.f3169b == t3.f3169b && this.f3170c == t3.f3170c && this.f3171d == t3.f3171d && this.f3172e == t3.f3172e && this.f3173f == t3.f3173f && this.f3174g == t3.f3174g && this.f3175h == t3.f3175h && this.f3176i == t3.f3176i && U.A.a(this.f3168a, t3.f3168a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3168a.hashCode() + 527) * 31) + ((int) this.f3169b)) * 31) + ((int) this.f3170c)) * 31) + ((int) this.f3171d)) * 31) + ((int) this.f3172e)) * 31) + (this.f3173f ? 1 : 0)) * 31) + (this.f3174g ? 1 : 0)) * 31) + (this.f3175h ? 1 : 0)) * 31) + (this.f3176i ? 1 : 0);
    }
}

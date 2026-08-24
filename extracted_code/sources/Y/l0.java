package Y;

import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final l0 f3357c;

    /* renamed from: a  reason: collision with root package name */
    public final long f3358a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3359b;

    static {
        l0 l0Var = new l0(0L, 0L);
        new l0(Long.MAX_VALUE, Long.MAX_VALUE);
        new l0(Long.MAX_VALUE, 0L);
        new l0(0L, Long.MAX_VALUE);
        f3357c = l0Var;
    }

    public l0(long j3, long j4) {
        boolean z3;
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        AbstractC0123a.e(j4 >= 0);
        this.f3358a = j3;
        this.f3359b = j4;
    }

    public final long a(long j3, long j4, long j5) {
        boolean z3;
        long j6 = this.f3359b;
        long j7 = this.f3358a;
        if (j7 == 0 && j6 == 0) {
            return j3;
        }
        int i3 = U.A.f2405a;
        long j8 = j3 - j7;
        if (((j7 ^ j3) & (j3 ^ j8)) < 0) {
            j8 = Long.MIN_VALUE;
        }
        long j9 = j3 + j6;
        if (((j6 ^ j9) & (j3 ^ j9)) < 0) {
            j9 = Long.MAX_VALUE;
        }
        boolean z4 = false;
        if (j8 <= j4 && j4 <= j9) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (j8 <= j5 && j5 <= j9) {
            z4 = true;
        }
        if (z3 && z4) {
            if (Math.abs(j4 - j3) <= Math.abs(j5 - j3)) {
                return j4;
            }
            return j5;
        } else if (z3) {
            return j4;
        } else {
            if (z4) {
                return j5;
            }
            return j8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f3358a == l0Var.f3358a && this.f3359b == l0Var.f3359b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3358a) * 31) + ((int) this.f3359b);
    }
}

package R;
/* renamed from: R.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118v {

    /* renamed from: a  reason: collision with root package name */
    public final long f1996a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1997b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1998c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1999d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2000e;

    static {
        new C0117u().a();
        U.A.H(0);
        U.A.H(1);
        U.A.H(2);
        U.A.H(3);
        U.A.H(4);
    }

    public C0118v(C0117u c0117u) {
        long j3 = c0117u.f1991a;
        long j4 = c0117u.f1992b;
        long j5 = c0117u.f1993c;
        float f3 = c0117u.f1994d;
        float f4 = c0117u.f1995e;
        this.f1996a = j3;
        this.f1997b = j4;
        this.f1998c = j5;
        this.f1999d = f3;
        this.f2000e = f4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R.u, java.lang.Object] */
    public final C0117u a() {
        ?? obj = new Object();
        obj.f1991a = this.f1996a;
        obj.f1992b = this.f1997b;
        obj.f1993c = this.f1998c;
        obj.f1994d = this.f1999d;
        obj.f1995e = this.f2000e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0118v)) {
            return false;
        }
        C0118v c0118v = (C0118v) obj;
        if (this.f1996a == c0118v.f1996a && this.f1997b == c0118v.f1997b && this.f1998c == c0118v.f1998c && this.f1999d == c0118v.f1999d && this.f2000e == c0118v.f2000e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        long j3 = this.f1996a;
        long j4 = this.f1997b;
        long j5 = this.f1998c;
        int i4 = ((((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        int i5 = 0;
        float f3 = this.f1999d;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i6 = (i4 + i3) * 31;
        float f4 = this.f2000e;
        if (f4 != 0.0f) {
            i5 = Float.floatToIntBits(f4);
        }
        return i6 + i5;
    }
}

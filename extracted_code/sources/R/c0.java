package R;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e  reason: collision with root package name */
    public static final c0 f1879e = new c0(0, 0, 0, 1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final int f1880a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1881b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1882c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1883d;

    static {
        U.A.H(0);
        U.A.H(1);
        U.A.H(2);
        U.A.H(3);
    }

    public c0(int i3, int i4, int i5, float f3) {
        this.f1880a = i3;
        this.f1881b = i4;
        this.f1882c = i5;
        this.f1883d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (this.f1880a == c0Var.f1880a && this.f1881b == c0Var.f1881b && this.f1882c == c0Var.f1882c && this.f1883d == c0Var.f1883d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1883d) + ((((((217 + this.f1880a) * 31) + this.f1881b) * 31) + this.f1882c) * 31);
    }
}

package Y;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f3352c = new k0(0, false);

    /* renamed from: a  reason: collision with root package name */
    public final int f3353a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3354b;

    public k0(int i3, boolean z3) {
        this.f3353a = i3;
        this.f3354b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f3353a == k0Var.f3353a && this.f3354b == k0Var.f3354b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3353a << 1) + (this.f3354b ? 1 : 0);
    }
}

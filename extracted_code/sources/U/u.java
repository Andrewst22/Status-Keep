package U;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c  reason: collision with root package name */
    public static final u f2480c = new u(-1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f2481a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2482b;

    static {
        new u(0, 0);
    }

    public u(int i3, int i4) {
        boolean z3;
        if ((i3 != -1 && i3 < 0) || (i4 != -1 && i4 < 0)) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.e(z3);
        this.f2481a = i3;
        this.f2482b = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f2481a != uVar.f2481a || this.f2482b != uVar.f2482b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i3 = this.f2481a;
        return ((i3 >>> 16) | (i3 << 16)) ^ this.f2482b;
    }

    public final String toString() {
        return this.f2481a + "x" + this.f2482b;
    }
}

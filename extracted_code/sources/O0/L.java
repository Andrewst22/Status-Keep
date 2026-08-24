package o0;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final int f8453a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8454b;

    public L(int i3, boolean z3) {
        this.f8453a = i3;
        this.f8454b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        L l3 = (L) obj;
        if (this.f8453a == l3.f8453a && this.f8454b == l3.f8454b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8453a * 31) + (this.f8454b ? 1 : 0);
    }
}

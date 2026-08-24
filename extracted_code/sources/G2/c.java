package G2;
/* loaded from: classes.dex */
public final class c extends a {
    static {
        new a(1, 0, 1);
    }

    @Override // G2.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f385m == cVar.f385m) {
                    if (this.f386n == cVar.f386n) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // G2.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f385m * 31) + this.f386n;
    }

    @Override // G2.a
    public final boolean isEmpty() {
        if (this.f385m > this.f386n) {
            return true;
        }
        return false;
    }

    @Override // G2.a
    public final String toString() {
        return this.f385m + ".." + this.f386n;
    }
}

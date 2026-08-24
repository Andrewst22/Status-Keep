package M2;
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f1092a;

    public g(Throwable th) {
        this.f1092a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (D2.i.a(this.f1092a, ((g) obj).f1092a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1092a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // M2.h
    public final String toString() {
        return "Closed(" + this.f1092a + ')';
    }
}

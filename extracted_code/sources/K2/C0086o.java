package K2;
/* renamed from: K2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f846a;

    /* renamed from: b  reason: collision with root package name */
    public final C2.l f847b;

    public C0086o(Object obj, C2.l lVar) {
        this.f846a = obj;
        this.f847b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0086o)) {
            return false;
        }
        C0086o c0086o = (C0086o) obj;
        if (D2.i.a(this.f846a, c0086o.f846a) && D2.i.a(this.f847b, c0086o.f847b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f846a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f847b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f846a + ", onCancellation=" + this.f847b + ')';
    }
}

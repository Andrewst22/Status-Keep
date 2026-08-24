package D1;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class j0 extends a0 implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final a0 f273m;

    public j0(a0 a0Var) {
        this.f273m = a0Var;
    }

    @Override // D1.a0
    public final a0 a() {
        return this.f273m;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f273m.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f273m.equals(((j0) obj).f273m);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f273m.hashCode();
    }

    public final String toString() {
        return this.f273m + ".reverse()";
    }
}

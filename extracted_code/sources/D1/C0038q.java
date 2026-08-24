package D1;

import java.io.Serializable;
import java.util.Arrays;
/* renamed from: D1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038q extends a0 implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final C1.e f292m;

    /* renamed from: n  reason: collision with root package name */
    public final a0 f293n;

    public C0038q(C1.e eVar, a0 a0Var) {
        this.f292m = eVar;
        a0Var.getClass();
        this.f293n = a0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1.e eVar = this.f292m;
        return this.f293n.compare(eVar.apply(obj), eVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0038q)) {
            return false;
        }
        C0038q c0038q = (C0038q) obj;
        if (this.f292m.equals(c0038q.f292m) && this.f293n.equals(c0038q.f293n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f292m, this.f293n});
    }

    public final String toString() {
        return this.f293n + ".onResultOf(" + this.f292m + ")";
    }
}

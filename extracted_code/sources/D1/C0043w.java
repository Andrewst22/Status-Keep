package D1;

import java.io.Serializable;
/* renamed from: D1.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043w extends a0 implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final U0.d f315m;

    public C0043w(U0.d dVar) {
        this.f315m = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f315m.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0043w) {
            return this.f315m.equals(((C0043w) obj).f315m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f315m.hashCode();
    }

    public final String toString() {
        return this.f315m.toString();
    }
}

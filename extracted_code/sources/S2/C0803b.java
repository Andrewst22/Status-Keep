package s2;

import D2.i;
import java.io.Serializable;
/* renamed from: s2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803b implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final Object f9222m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f9223n;

    public C0803b(Object obj, Object obj2) {
        this.f9222m = obj;
        this.f9223n = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0803b)) {
            return false;
        }
        C0803b c0803b = (C0803b) obj;
        if (i.a(this.f9222m, c0803b.f9222m) && i.a(this.f9223n, c0803b.f9223n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        Object obj = this.f9222m;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i4 = hashCode * 31;
        Object obj2 = this.f9223n;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return "(" + this.f9222m + ", " + this.f9223n + ')';
    }
}

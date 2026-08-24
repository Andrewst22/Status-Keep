package r1;

import java.util.Collection;
import java.util.List;
import t2.AbstractC0827d;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9028a;

    public j(List list) {
        this.f9028a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class.equals(obj.getClass())) {
            return this.f9028a.equals(((j) obj).f9028a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9028a.hashCode();
    }

    public final String toString() {
        return AbstractC0827d.F((Collection) this.f9028a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}

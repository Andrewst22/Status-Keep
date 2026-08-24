package D1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: D1.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0036o {

    /* renamed from: m  reason: collision with root package name */
    public transient Set f287m;

    /* renamed from: n  reason: collision with root package name */
    public transient Collection f288n;

    /* renamed from: o  reason: collision with root package name */
    public transient Map f289o;

    public abstract Map a();

    public boolean b(Object obj) {
        for (Collection collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0036o) {
            return a().equals(((AbstractC0036o) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}

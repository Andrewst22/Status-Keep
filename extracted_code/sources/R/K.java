package R;

import U.AbstractC0123a;
import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final C0111n f1782a;

    static {
        new SparseBooleanArray();
        AbstractC0123a.j(!false);
        U.A.H(0);
    }

    public K(C0111n c0111n) {
        this.f1782a = c0111n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        return this.f1782a.equals(((K) obj).f1782a);
    }

    public final int hashCode() {
        return this.f1782a.hashCode();
    }
}

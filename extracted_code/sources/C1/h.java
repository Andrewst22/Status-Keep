package C1;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final List f159m;

    public h(List list) {
        this.f159m = list;
    }

    @Override // C1.g
    public final boolean apply(Object obj) {
        int i3 = 0;
        while (true) {
            List list = this.f159m;
            if (i3 < list.size()) {
                if (!((g) list.get(i3)).apply(obj)) {
                    return false;
                }
                i3++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f159m.equals(((h) obj).f159m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f159m.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z3 = true;
        for (Object obj : this.f159m) {
            if (!z3) {
                sb.append(',');
            }
            sb.append(obj);
            z3 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}

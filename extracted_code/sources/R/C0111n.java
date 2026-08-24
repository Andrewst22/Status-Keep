package R;

import U.AbstractC0123a;
import android.util.SparseBooleanArray;
/* renamed from: R.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111n {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f1916a;

    public C0111n(SparseBooleanArray sparseBooleanArray) {
        this.f1916a = sparseBooleanArray;
    }

    public final int a(int i3) {
        SparseBooleanArray sparseBooleanArray = this.f1916a;
        AbstractC0123a.g(i3, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0111n)) {
            return false;
        }
        C0111n c0111n = (C0111n) obj;
        int i3 = U.A.f2405a;
        SparseBooleanArray sparseBooleanArray = this.f1916a;
        if (i3 < 24) {
            if (sparseBooleanArray.size() != c0111n.f1916a.size()) {
                return false;
            }
            for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
                if (a(i4) != c0111n.a(i4)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray.equals(c0111n.f1916a);
    }

    public final int hashCode() {
        int i3 = U.A.f2405a;
        SparseBooleanArray sparseBooleanArray = this.f1916a;
        if (i3 < 24) {
            int size = sparseBooleanArray.size();
            for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
                size = (size * 31) + a(i4);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}

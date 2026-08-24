package D1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class A extends a0 implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final Comparator[] f183m;

    public A(C0038q c0038q, C0038q c0038q2) {
        this.f183m = new Comparator[]{c0038q, c0038q2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i3 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f183m;
            if (i3 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i3].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i3++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            return Arrays.equals(this.f183m, ((A) obj).f183m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f183m);
    }

    public final String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f183m) + ")";
    }
}

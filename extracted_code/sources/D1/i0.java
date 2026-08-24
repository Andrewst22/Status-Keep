package D1;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class i0 extends a0 implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final i0 f271m = new a0();

    @Override // D1.a0
    public final a0 a() {
        return Z.f224m;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

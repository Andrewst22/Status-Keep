package D1;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class Z extends a0 implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final Z f224m = new a0();

    @Override // D1.a0
    public final a0 a() {
        return i0.f271m;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

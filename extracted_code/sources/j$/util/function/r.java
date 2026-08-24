package j$.util.function;

import java.util.function.IntPredicate;
/* loaded from: classes2.dex */
public final /* synthetic */ class r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntPredicate f6852a;

    private /* synthetic */ r(IntPredicate intPredicate) {
        this.f6852a = intPredicate;
    }

    public static /* synthetic */ r a(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new r(intPredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntPredicate intPredicate = this.f6852a;
        if (obj instanceof r) {
            obj = ((r) obj).f6852a;
        }
        return intPredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6852a.hashCode();
    }
}

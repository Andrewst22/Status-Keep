package j$.util.function;

import java.util.function.LongPredicate;
/* loaded from: classes2.dex */
public final /* synthetic */ class B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongPredicate f6821a;

    private /* synthetic */ B(LongPredicate longPredicate) {
        this.f6821a = longPredicate;
    }

    public static /* synthetic */ B a(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new B(longPredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongPredicate longPredicate = this.f6821a;
        if (obj instanceof B) {
            obj = ((B) obj).f6821a;
        }
        return longPredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6821a.hashCode();
    }
}

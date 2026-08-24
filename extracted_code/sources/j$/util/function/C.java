package j$.util.function;

import java.util.function.LongToDoubleFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class C {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongToDoubleFunction f6824a;

    private /* synthetic */ C(LongToDoubleFunction longToDoubleFunction) {
        this.f6824a = longToDoubleFunction;
    }

    public static /* synthetic */ C a(LongToDoubleFunction longToDoubleFunction) {
        if (longToDoubleFunction == null) {
            return null;
        }
        return new C(longToDoubleFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongToDoubleFunction longToDoubleFunction = this.f6824a;
        if (obj instanceof C) {
            obj = ((C) obj).f6824a;
        }
        return longToDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6824a.hashCode();
    }
}

package j$.util.function;

import java.util.function.ToLongFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class S implements T {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToLongFunction f6838a;

    private /* synthetic */ S(ToLongFunction toLongFunction) {
        this.f6838a = toLongFunction;
    }

    public static /* synthetic */ S a(ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return new S(toLongFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToLongFunction toLongFunction = this.f6838a;
        if (obj instanceof S) {
            obj = ((S) obj).f6838a;
        }
        return toLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6838a.hashCode();
    }

    @Override // j$.util.function.T
    public final /* synthetic */ long q(Object obj) {
        return this.f6838a.applyAsLong(obj);
    }
}

package j$.util.function;

import java.util.function.LongToIntFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class D {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongToIntFunction f6827a;

    private /* synthetic */ D(LongToIntFunction longToIntFunction) {
        this.f6827a = longToIntFunction;
    }

    public static /* synthetic */ D a(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return new D(longToIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongToIntFunction longToIntFunction = this.f6827a;
        if (obj instanceof D) {
            obj = ((D) obj).f6827a;
        }
        return longToIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6827a.hashCode();
    }
}

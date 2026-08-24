package j$.util.function;

import java.util.function.LongFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongFunction f6858a;

    private /* synthetic */ z(LongFunction longFunction) {
        this.f6858a = longFunction;
    }

    public static /* synthetic */ z a(LongFunction longFunction) {
        if (longFunction == null) {
            return null;
        }
        return new z(longFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongFunction longFunction = this.f6858a;
        if (obj instanceof z) {
            obj = ((z) obj).f6858a;
        }
        return longFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6858a.hashCode();
    }

    @Override // j$.util.function.A
    public final /* synthetic */ Object o(long j3) {
        return this.f6858a.apply(j3);
    }
}

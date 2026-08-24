package j$.util.function;

import java.util.function.IntToLongFunction;
/* renamed from: j$.util.function.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0364t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntToLongFunction f6854a;

    private /* synthetic */ C0364t(IntToLongFunction intToLongFunction) {
        this.f6854a = intToLongFunction;
    }

    public static /* synthetic */ C0364t a(IntToLongFunction intToLongFunction) {
        if (intToLongFunction == null) {
            return null;
        }
        return new C0364t(intToLongFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntToLongFunction intToLongFunction = this.f6854a;
        if (obj instanceof C0364t) {
            obj = ((C0364t) obj).f6854a;
        }
        return intToLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6854a.hashCode();
    }
}

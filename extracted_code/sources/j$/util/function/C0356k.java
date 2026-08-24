package j$.util.function;

import java.util.function.DoubleToIntFunction;
/* renamed from: j$.util.function.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0356k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleToIntFunction f6847a;

    private /* synthetic */ C0356k(DoubleToIntFunction doubleToIntFunction) {
        this.f6847a = doubleToIntFunction;
    }

    public static /* synthetic */ C0356k a(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return new C0356k(doubleToIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleToIntFunction doubleToIntFunction = this.f6847a;
        if (obj instanceof C0356k) {
            obj = ((C0356k) obj).f6847a;
        }
        return doubleToIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6847a.hashCode();
    }
}

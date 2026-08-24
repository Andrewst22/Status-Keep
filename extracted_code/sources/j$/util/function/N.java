package j$.util.function;

import java.util.function.ToDoubleFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class N implements O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToDoubleFunction f6835a;

    private /* synthetic */ N(ToDoubleFunction toDoubleFunction) {
        this.f6835a = toDoubleFunction;
    }

    public static /* synthetic */ N a(ToDoubleFunction toDoubleFunction) {
        if (toDoubleFunction == null) {
            return null;
        }
        return new N(toDoubleFunction);
    }

    @Override // j$.util.function.O
    public final /* synthetic */ double d(Object obj) {
        return this.f6835a.applyAsDouble(obj);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToDoubleFunction toDoubleFunction = this.f6835a;
        if (obj instanceof N) {
            obj = ((N) obj).f6835a;
        }
        return toDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6835a.hashCode();
    }
}

package j$.util.function;

import java.util.function.IntUnaryOperator;
/* loaded from: classes2.dex */
public final /* synthetic */ class u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntUnaryOperator f6855a;

    private /* synthetic */ u(IntUnaryOperator intUnaryOperator) {
        this.f6855a = intUnaryOperator;
    }

    public static /* synthetic */ u a(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return new u(intUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntUnaryOperator intUnaryOperator = this.f6855a;
        if (obj instanceof u) {
            obj = ((u) obj).f6855a;
        }
        return intUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6855a.hashCode();
    }
}

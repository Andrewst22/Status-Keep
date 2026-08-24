package j$.util.function;

import java.util.function.LongUnaryOperator;
/* loaded from: classes2.dex */
public final /* synthetic */ class E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongUnaryOperator f6828a;

    private /* synthetic */ E(LongUnaryOperator longUnaryOperator) {
        this.f6828a = longUnaryOperator;
    }

    public static /* synthetic */ E a(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return new E(longUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongUnaryOperator longUnaryOperator = this.f6828a;
        if (obj instanceof E) {
            obj = ((E) obj).f6828a;
        }
        return longUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6828a.hashCode();
    }
}

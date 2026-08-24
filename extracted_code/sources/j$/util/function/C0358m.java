package j$.util.function;

import java.util.function.DoubleUnaryOperator;
/* renamed from: j$.util.function.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0358m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleUnaryOperator f6849a;

    private /* synthetic */ C0358m(DoubleUnaryOperator doubleUnaryOperator) {
        this.f6849a = doubleUnaryOperator;
    }

    public static /* synthetic */ C0358m a(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return new C0358m(doubleUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleUnaryOperator doubleUnaryOperator = this.f6849a;
        if (obj instanceof C0358m) {
            obj = ((C0358m) obj).f6849a;
        }
        return doubleUnaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6849a.hashCode();
    }
}

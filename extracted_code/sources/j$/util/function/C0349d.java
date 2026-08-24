package j$.util.function;

import java.util.function.DoubleBinaryOperator;
/* renamed from: j$.util.function.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0349d implements InterfaceC0350e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f6843a;

    private /* synthetic */ C0349d(DoubleBinaryOperator doubleBinaryOperator) {
        this.f6843a = doubleBinaryOperator;
    }

    public static /* synthetic */ C0349d a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return new C0349d(doubleBinaryOperator);
    }

    @Override // j$.util.function.InterfaceC0350e
    public final /* synthetic */ double b(double d3, double d4) {
        return this.f6843a.applyAsDouble(d3, d4);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleBinaryOperator doubleBinaryOperator = this.f6843a;
        if (obj instanceof C0349d) {
            obj = ((C0349d) obj).f6843a;
        }
        return doubleBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6843a.hashCode();
    }
}

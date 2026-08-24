package j$.util.function;

import java.util.function.IntBinaryOperator;
/* renamed from: j$.util.function.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0359n implements InterfaceC0360o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f6850a;

    private /* synthetic */ C0359n(IntBinaryOperator intBinaryOperator) {
        this.f6850a = intBinaryOperator;
    }

    public static /* synthetic */ C0359n a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return new C0359n(intBinaryOperator);
    }

    @Override // j$.util.function.InterfaceC0360o
    public final /* synthetic */ int b(int i3, int i4) {
        return this.f6850a.applyAsInt(i3, i4);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntBinaryOperator intBinaryOperator = this.f6850a;
        if (obj instanceof C0359n) {
            obj = ((C0359n) obj).f6850a;
        }
        return intBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6850a.hashCode();
    }
}

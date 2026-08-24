package j$.util.function;

import java.util.function.BinaryOperator;
/* renamed from: j$.util.function.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0347b implements InterfaceC0348c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f6842a;

    private /* synthetic */ C0347b(BinaryOperator binaryOperator) {
        this.f6842a = binaryOperator;
    }

    public static /* synthetic */ C0347b a(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return new C0347b(binaryOperator);
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ Object c(Object obj, Object obj2) {
        return this.f6842a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BinaryOperator binaryOperator = this.f6842a;
        if (obj instanceof C0347b) {
            obj = ((C0347b) obj).f6842a;
        }
        return binaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6842a.hashCode();
    }
}

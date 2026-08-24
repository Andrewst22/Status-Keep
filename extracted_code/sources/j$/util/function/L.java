package j$.util.function;

import java.util.function.Supplier;
/* loaded from: classes2.dex */
public final /* synthetic */ class L implements M {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Supplier f6834a;

    private /* synthetic */ L(Supplier supplier) {
        this.f6834a = supplier;
    }

    public static /* synthetic */ L a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return new L(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Supplier supplier = this.f6834a;
        if (obj instanceof L) {
            obj = ((L) obj).f6834a;
        }
        return supplier.equals(obj);
    }

    @Override // j$.util.function.M
    public final /* synthetic */ Object get() {
        return this.f6834a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f6834a.hashCode();
    }
}

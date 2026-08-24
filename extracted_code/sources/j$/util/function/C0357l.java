package j$.util.function;

import java.util.function.DoubleToLongFunction;
/* renamed from: j$.util.function.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0357l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleToLongFunction f6848a;

    private /* synthetic */ C0357l(DoubleToLongFunction doubleToLongFunction) {
        this.f6848a = doubleToLongFunction;
    }

    public static /* synthetic */ C0357l a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return new C0357l(doubleToLongFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleToLongFunction doubleToLongFunction = this.f6848a;
        if (obj instanceof C0357l) {
            obj = ((C0357l) obj).f6848a;
        }
        return doubleToLongFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6848a.hashCode();
    }
}

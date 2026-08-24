package j$.util.function;

import java.util.function.DoubleFunction;
/* renamed from: j$.util.function.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0353h implements InterfaceC0354i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleFunction f6845a;

    private /* synthetic */ C0353h(DoubleFunction doubleFunction) {
        this.f6845a = doubleFunction;
    }

    public static /* synthetic */ C0353h a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return new C0353h(doubleFunction);
    }

    @Override // j$.util.function.InterfaceC0354i
    public final /* synthetic */ Object e(double d3) {
        return this.f6845a.apply(d3);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleFunction doubleFunction = this.f6845a;
        if (obj instanceof C0353h) {
            obj = ((C0353h) obj).f6845a;
        }
        return doubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6845a.hashCode();
    }
}

package j$.util.function;

import java.util.function.IntToDoubleFunction;
/* renamed from: j$.util.function.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0363s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntToDoubleFunction f6853a;

    private /* synthetic */ C0363s(IntToDoubleFunction intToDoubleFunction) {
        this.f6853a = intToDoubleFunction;
    }

    public static /* synthetic */ C0363s a(IntToDoubleFunction intToDoubleFunction) {
        if (intToDoubleFunction == null) {
            return null;
        }
        return new C0363s(intToDoubleFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntToDoubleFunction intToDoubleFunction = this.f6853a;
        if (obj instanceof C0363s) {
            obj = ((C0363s) obj).f6853a;
        }
        return intToDoubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6853a.hashCode();
    }
}

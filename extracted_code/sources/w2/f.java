package w2;

import D2.i;
import D2.r;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public abstract class f extends b implements D2.f {

    /* renamed from: p  reason: collision with root package name */
    public final int f9669p;

    public f(int i3, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f9669p = i3;
    }

    @Override // D2.f
    public final int f() {
        return this.f9669p;
    }

    @Override // w2.b
    public final String toString() {
        if (this.f9664m == null) {
            r.f343a.getClass();
            String obj = getClass().getGenericInterfaces()[0].toString();
            if (obj.startsWith("kotlin.jvm.functions.")) {
                obj = obj.substring(21);
            }
            i.d(obj, "renderLambdaToString(...)");
            return obj;
        }
        return super.toString();
    }
}

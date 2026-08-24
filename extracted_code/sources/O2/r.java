package O2;

import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class r implements N2.e {

    /* renamed from: m  reason: collision with root package name */
    public final M2.p f1360m;

    public r(M2.p pVar) {
        this.f1360m = pVar;
    }

    @Override // N2.e
    public final Object a(Object obj, InterfaceC0866d interfaceC0866d) {
        Object o3 = ((M2.o) this.f1360m).f1099p.o(obj, interfaceC0866d);
        if (o3 == EnumC0879a.f9494m) {
            return o3;
        }
        return C0808g.f9229a;
    }
}

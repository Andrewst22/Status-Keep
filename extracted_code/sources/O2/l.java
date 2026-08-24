package O2;

import P2.AbstractC0097a;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a */
    public static final C1.f f1350a = new C1.f("NULL", 1);

    public static /* synthetic */ N2.d a(j jVar, L2.c cVar, int i3, int i4, int i5) {
        u2.j jVar2 = cVar;
        if ((i5 & 1) != 0) {
            jVar2 = u2.j.f9461m;
        }
        if ((i5 & 2) != 0) {
            i3 = -3;
        }
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        return jVar.J(jVar2, i3, i4);
    }

    public static final Object b(u2.i iVar, Object obj, Object obj2, C2.p pVar, InterfaceC0866d interfaceC0866d) {
        Object n3 = AbstractC0097a.n(iVar, obj2);
        try {
            s sVar = new s(interfaceC0866d, iVar);
            D2.t.a(2, pVar);
            Object i3 = pVar.i(obj, sVar);
            AbstractC0097a.h(iVar, n3);
            if (i3 == EnumC0879a.f9494m) {
                D2.i.e(interfaceC0866d, "frame");
            }
            return i3;
        } catch (Throwable th) {
            AbstractC0097a.h(iVar, n3);
            throw th;
        }
    }
}

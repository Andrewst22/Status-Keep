package u2;

import C2.p;
/* renamed from: u2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0864b implements p {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f9457m;

    public /* synthetic */ C0864b(int i3) {
        this.f9457m = i3;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        C0865c c0865c;
        switch (this.f9457m) {
            case 0:
                String str = (String) obj;
                InterfaceC0869g interfaceC0869g = (InterfaceC0869g) obj2;
                D2.i.e(str, "acc");
                D2.i.e(interfaceC0869g, "element");
                if (str.length() == 0) {
                    return interfaceC0869g.toString();
                }
                return str + ", " + interfaceC0869g;
            default:
                i iVar = (i) obj;
                InterfaceC0869g interfaceC0869g2 = (InterfaceC0869g) obj2;
                D2.i.e(iVar, "acc");
                D2.i.e(interfaceC0869g2, "element");
                i f3 = iVar.f(interfaceC0869g2.getKey());
                j jVar = j.f9461m;
                if (f3 != jVar) {
                    C0867e c0867e = C0867e.f9460m;
                    InterfaceC0868f interfaceC0868f = (InterfaceC0868f) f3.d(c0867e);
                    if (interfaceC0868f == null) {
                        c0865c = new C0865c(f3, interfaceC0869g2);
                    } else {
                        i f4 = f3.f(c0867e);
                        if (f4 == jVar) {
                            return new C0865c(interfaceC0869g2, interfaceC0868f);
                        }
                        c0865c = new C0865c(new C0865c(f4, interfaceC0869g2), interfaceC0868f);
                    }
                    return c0865c;
                }
                return interfaceC0869g2;
        }
    }
}

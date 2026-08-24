package P2;

import K2.AbstractC0072a;
import K2.AbstractC0092v;
import n2.AbstractC0664g;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public class u extends AbstractC0072a implements w2.c {

    /* renamed from: p  reason: collision with root package name */
    public final InterfaceC0866d f1513p;

    public u(InterfaceC0866d interfaceC0866d, u2.i iVar) {
        super(iVar, true);
        this.f1513p = interfaceC0866d;
    }

    @Override // K2.Z
    public final boolean J() {
        return true;
    }

    @Override // w2.c
    public final w2.c e() {
        InterfaceC0866d interfaceC0866d = this.f1513p;
        if (interfaceC0866d instanceof w2.c) {
            return (w2.c) interfaceC0866d;
        }
        return null;
    }

    @Override // K2.Z
    public void q(Object obj) {
        AbstractC0097a.i(AbstractC0664g.p(this.f1513p), AbstractC0092v.h(obj), null);
    }

    @Override // K2.Z
    public void r(Object obj) {
        this.f1513p.k(AbstractC0092v.h(obj));
    }
}

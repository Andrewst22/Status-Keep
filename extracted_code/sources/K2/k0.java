package K2;

import n2.AbstractC0664g;
import u2.C0864b;
import u2.InterfaceC0869g;
/* loaded from: classes.dex */
public final class k0 implements InterfaceC0869g, u2.h {

    /* renamed from: m  reason: collision with root package name */
    public static final k0 f838m = new Object();

    @Override // u2.i
    public final Object c(Object obj, C2.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // u2.i
    public final InterfaceC0869g d(u2.h hVar) {
        return AbstractC0664g.m(this, hVar);
    }

    @Override // u2.i
    public final u2.i f(u2.h hVar) {
        return AbstractC0664g.r(this, hVar);
    }

    @Override // u2.i
    public final u2.i n(u2.i iVar) {
        D2.i.e(iVar, "context");
        if (iVar == u2.j.f9461m) {
            return this;
        }
        return (u2.i) iVar.c(this, new C0864b(1));
    }

    @Override // u2.InterfaceC0869g
    public final u2.h getKey() {
        return this;
    }
}

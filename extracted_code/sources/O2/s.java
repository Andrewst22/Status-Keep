package O2;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class s implements InterfaceC0866d, w2.c {

    /* renamed from: m  reason: collision with root package name */
    public final InterfaceC0866d f1361m;

    /* renamed from: n  reason: collision with root package name */
    public final u2.i f1362n;

    public s(InterfaceC0866d interfaceC0866d, u2.i iVar) {
        this.f1361m = interfaceC0866d;
        this.f1362n = iVar;
    }

    @Override // w2.c
    public final w2.c e() {
        InterfaceC0866d interfaceC0866d = this.f1361m;
        if (interfaceC0866d instanceof w2.c) {
            return (w2.c) interfaceC0866d;
        }
        return null;
    }

    @Override // u2.InterfaceC0866d
    public final u2.i h() {
        return this.f1362n;
    }

    @Override // u2.InterfaceC0866d
    public final void k(Object obj) {
        this.f1361m.k(obj);
    }
}

package K2;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class V extends C0077f {

    /* renamed from: u  reason: collision with root package name */
    public final C0083l f806u;

    public V(InterfaceC0866d interfaceC0866d, C0083l c0083l) {
        super(1, interfaceC0866d);
        this.f806u = c0083l;
    }

    @Override // K2.C0077f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // K2.C0077f
    public final Throwable t(Z z3) {
        Throwable c3;
        Object E3 = this.f806u.E();
        if ((E3 instanceof X) && (c3 = ((X) E3).c()) != null) {
            return c3;
        }
        if (E3 instanceof C0085n) {
            return ((C0085n) E3).f845a;
        }
        return z3.A();
    }
}

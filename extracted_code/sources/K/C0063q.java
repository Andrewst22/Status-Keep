package K;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: K.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063q extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f659q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ b0 f660r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063q(b0 b0Var, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f660r = b0Var;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        C0063q c0063q = new C0063q(this.f660r, interfaceC0866d);
        c0063q.f659q = obj;
        return c0063q;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0063q) d((b0) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        boolean z3;
        AbstractC0664g.w(obj);
        b0 b0Var = (b0) this.f659q;
        if ((b0Var instanceof C0049c) && b0Var.f605a <= this.f660r.f605a) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}

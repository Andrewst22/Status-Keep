package K;

import K2.C0083l;
import K2.InterfaceC0091u;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class A extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f501q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Q f502r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Q q3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f502r = q3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new A(this.f502r, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((A) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        N2.d hVar;
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f501q;
        C0808g c0808g = C0808g.f9229a;
        Q q3 = this.f502r;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC0664g.w(obj);
                    return c0808g;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0664g.w(obj);
        } else {
            AbstractC0664g.w(obj);
            this.f501q = 1;
            Object U3 = ((C0083l) q3.f575u.f651n).U(this);
            if (U3 != enumC0879a) {
                U3 = c0808g;
            }
            if (U3 == enumC0879a) {
                return enumC0879a;
            }
        }
        C1.j jVar = q3.g().f604c;
        if (jVar instanceof O2.j) {
            hVar = O2.l.a((O2.j) jVar, null, 0, 2, 1);
        } else {
            hVar = new O2.h(jVar, u2.j.f9461m, 0, 2);
        }
        C0071z c0071z = new C0071z(q3, 0);
        this.f501q = 2;
        if (hVar.x(c0071z, this) == enumC0879a) {
            return enumC0879a;
        }
        return c0808g;
    }
}

package O2;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class t extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f1363q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f1364r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ N2.e f1365s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(N2.e eVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f1365s = eVar;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        t tVar = new t(this.f1365s, interfaceC0866d);
        tVar.f1364r = obj;
        return tVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((t) d(obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f1363q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            Object obj2 = this.f1364r;
            this.f1363q = 1;
            if (this.f1365s.a(obj2, this) == enumC0879a) {
                return enumC0879a;
            }
        }
        return C0808g.f9229a;
    }
}

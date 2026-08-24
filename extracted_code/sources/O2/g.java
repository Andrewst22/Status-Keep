package O2;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class g extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f1343q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f1344r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ h f1345s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f1345s = hVar;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        g gVar = new g(this.f1345s, interfaceC0866d);
        gVar.f1344r = obj;
        return gVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((g) d((N2.e) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f1343q;
        C0808g c0808g = C0808g.f9229a;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f1343q = 1;
            Object x = this.f1345s.f1346p.x((N2.e) this.f1344r, this);
            if (x != enumC0879a) {
                x = c0808g;
            }
            if (x == enumC0879a) {
                return enumC0879a;
            }
        }
        return c0808g;
    }
}

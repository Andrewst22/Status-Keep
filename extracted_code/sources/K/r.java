package K;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class r extends w2.f implements C2.q {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f661q = 1;

    /* renamed from: r  reason: collision with root package name */
    public int f662r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object f663s;

    public /* synthetic */ r(int i3, InterfaceC0866d interfaceC0866d) {
        super(i3, interfaceC0866d);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        switch (this.f661q) {
            case 0:
                EnumC0879a enumC0879a = EnumC0879a.f9494m;
                int i3 = this.f662r;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0664g.w(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC0664g.w(obj);
                    this.f662r = 1;
                    if (Q.a((Q) this.f663s, this) == enumC0879a) {
                        return enumC0879a;
                    }
                }
                return C0808g.f9229a;
            default:
                EnumC0879a enumC0879a2 = EnumC0879a.f9494m;
                int i4 = this.f662r;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC0664g.w(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC0664g.w(obj);
                    M.c cVar = (M.c) this.f663s;
                    this.f662r = 1;
                    cVar.getClass();
                    obj = M.c.a(cVar, this);
                    if (obj == enumC0879a2) {
                        return enumC0879a2;
                    }
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, w2.b bVar) {
        switch (this.f661q) {
            case 0:
                N2.e eVar = (N2.e) obj;
                Throwable th = (Throwable) obj2;
                return new r((Q) this.f663s, bVar).n(C0808g.f9229a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, bVar);
                rVar.f663s = (M.c) obj;
                return rVar.n(C0808g.f9229a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Q q3, InterfaceC0866d interfaceC0866d) {
        super(3, interfaceC0866d);
        this.f663s = q3;
    }
}

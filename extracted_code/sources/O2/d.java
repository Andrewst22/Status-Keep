package O2;

import K2.AbstractC0092v;
import K2.B;
import K2.InterfaceC0091u;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.C0867e;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class d extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f1333q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f1334r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ N2.e f1335s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ f f1336t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(N2.e eVar, f fVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f1335s = eVar;
        this.f1336t = fVar;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        d dVar = new d(this.f1335s, this.f1336t, interfaceC0866d);
        dVar.f1334r = obj;
        return dVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((d) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f1333q;
        C0808g c0808g = C0808g.f9229a;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            InterfaceC0091u interfaceC0091u = (InterfaceC0091u) this.f1334r;
            f fVar = this.f1336t;
            int i4 = fVar.f1341n;
            if (i4 == -3) {
                i4 = -2;
            }
            C2.p eVar = new e(fVar, null);
            M2.b a3 = M2.i.a(i4, fVar.f1342o, 4);
            u2.i a4 = AbstractC0092v.a(interfaceC0091u.j(), fVar.f1340m, true);
            R2.d dVar = B.f785a;
            if (a4 != dVar && a4.d(C0867e.f9460m) == null) {
                a4 = a4.n(dVar);
            }
            M2.o oVar = new M2.o(a4, a3);
            oVar.W(3, oVar, eVar);
            this.f1333q = 1;
            Object b3 = N2.r.b(this.f1335s, oVar, true, this);
            if (b3 != enumC0879a) {
                b3 = c0808g;
            }
            if (b3 == enumC0879a) {
                return enumC0879a;
            }
        }
        return c0808g;
    }
}

package K;

import K2.AbstractC0092v;
import K2.InterfaceC0091u;
import java.util.concurrent.atomic.AtomicInteger;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class K extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f546q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f547r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Q f548s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ w2.f f549t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Q q3, C2.p pVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f548s = q3;
        this.f549t = (w2.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [w2.f, C2.p] */
    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        K k3 = new K(this.f548s, this.f549t, interfaceC0866d);
        k3.f547r = obj;
        return k3;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((K) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [K2.Z, K2.l] */
    /* JADX WARN: Type inference failed for: r7v0, types: [w2.f, C2.p] */
    @Override // w2.b
    public final Object n(Object obj) {
        M2.g gVar;
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f546q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            ?? z3 = new K2.Z(true);
            Throwable th = null;
            z3.H(null);
            Q q3 = this.f548s;
            T t3 = new T(this.f549t, z3, q3.f574t.E(), ((InterfaceC0091u) this.f547r).j());
            C0059m c0059m = q3.x;
            Object i4 = ((M2.b) c0059m.f652o).i(t3);
            if (i4 instanceof M2.g) {
                if (i4 instanceof M2.g) {
                    gVar = (M2.g) i4;
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    th = gVar.f1092a;
                }
                if (th == null) {
                    throw new IllegalStateException("Channel was closed normally");
                }
                throw th;
            } else if (!(i4 instanceof M2.h)) {
                if (((AtomicInteger) ((C1.j) c0059m.f653p).f168n).getAndIncrement() == 0) {
                    AbstractC0092v.g((InterfaceC0091u) c0059m.f650m, new W(c0059m, null));
                }
                this.f546q = 1;
                obj = z3.U(this);
                if (obj == enumC0879a) {
                    return enumC0879a;
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return obj;
    }
}

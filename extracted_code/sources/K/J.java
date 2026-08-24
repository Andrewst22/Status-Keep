package K;

import K2.InterfaceC0091u;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class J extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f543q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ w2.f f544r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0049c f545s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C2.p pVar, C0049c c0049c, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f544r = (w2.f) pVar;
        this.f545s = c0049c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w2.f, C2.p] */
    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new J(this.f544r, this.f545s, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((J) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w2.f, C2.p] */
    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f543q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            Object obj2 = this.f545s.f606b;
            this.f543q = 1;
            obj = this.f544r.i(obj2, this);
            if (obj == enumC0879a) {
                return enumC0879a;
            }
        }
        return obj;
    }
}

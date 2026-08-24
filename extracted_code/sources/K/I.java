package K;

import K2.InterfaceC0091u;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class I extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f541q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Q f542r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Q q3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f542r = q3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new I(this.f542r, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((I) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f541q;
        Q q3 = this.f542r;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        AbstractC0664g.w(obj);
                        return (b0) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0664g.w(obj);
            } else {
                AbstractC0664g.w(obj);
                if (q3.f574t.E() instanceof S) {
                    return q3.f574t.E();
                }
                this.f541q = 1;
                if (q3.h(this) == enumC0879a) {
                    return enumC0879a;
                }
            }
            this.f541q = 2;
            obj = Q.e(q3, false, this);
            if (obj == enumC0879a) {
                return enumC0879a;
            }
            return (b0) obj;
        } catch (Throwable th) {
            return new U(th, -1);
        }
    }
}

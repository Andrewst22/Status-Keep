package K;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: K.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061o extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f656q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Q f657r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061o(Q q3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f657r = q3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new C0061o(this.f657r, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0061o) d((N2.e) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f656q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f656q = 1;
            if (Q.c(this.f657r, this) == enumC0879a) {
                return enumC0879a;
            }
        }
        return C0808g.f9229a;
    }
}

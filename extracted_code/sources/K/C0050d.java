package K;

import java.util.List;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: K.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050d extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f609q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f610r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ List f611s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0050d(List list, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f611s = list;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        C0050d c0050d = new C0050d(this.f611s, interfaceC0866d);
        c0050d.f610r = obj;
        return c0050d;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0050d) d((C0057k) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f609q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f609q = 1;
            if (android.support.v4.media.session.a.a(this.f611s, (C0057k) this.f610r, this) == enumC0879a) {
                return enumC0879a;
            }
        }
        return C0808g.f9229a;
    }
}

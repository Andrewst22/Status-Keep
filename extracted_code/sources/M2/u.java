package m2;

import K2.InterfaceC0091u;
import java.util.List;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class u extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f8300q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0627J f8301r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ List f8302s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C0627J c0627j, List list, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8301r = c0627j;
        this.f8302s = list;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new u(this.f8301r, this.f8302s, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((u) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8300q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f8300q = 1;
            obj = C0627J.b(this.f8301r, this.f8302s, this);
            if (obj == enumC0879a) {
                return enumC0879a;
            }
        }
        return obj;
    }
}

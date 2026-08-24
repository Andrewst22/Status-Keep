package m2;

import K2.InterfaceC0091u;
import java.util.List;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: m2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643l extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f8267q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0627J f8268r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ List f8269s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643l(C0627J c0627j, List list, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8268r = c0627j;
        this.f8269s = list;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new C0643l(this.f8268r, this.f8269s, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0643l) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8267q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f8267q = 1;
            obj = C0627J.b(this.f8268r, this.f8269s, this);
            if (obj == enumC0879a) {
                return enumC0879a;
            }
        }
        return obj;
    }
}

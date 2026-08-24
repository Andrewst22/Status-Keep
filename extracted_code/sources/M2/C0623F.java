package m2;

import K2.InterfaceC0091u;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: m2.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623F extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f8211q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0627J f8212r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f8213s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f8214t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0623F(C0627J c0627j, String str, String str2, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8212r = c0627j;
        this.f8213s = str;
        this.f8214t = str2;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new C0623F(this.f8212r, this.f8213s, this.f8214t, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0623F) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8211q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f8211q = 1;
            if (C0627J.a(this.f8212r, this.f8213s, this.f8214t, this) == enumC0879a) {
                return enumC0879a;
            }
        }
        return C0808g.f9229a;
    }
}

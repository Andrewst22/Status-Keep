package m2;

import K2.InterfaceC0091u;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: m2.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626I extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f8222q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0627J f8223r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f8224s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f8225t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0626I(C0627J c0627j, String str, String str2, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8223r = c0627j;
        this.f8224s = str;
        this.f8225t = str2;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new C0626I(this.f8223r, this.f8224s, this.f8225t, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0626I) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8222q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f8222q = 1;
            if (C0627J.a(this.f8223r, this.f8224s, this.f8225t, this) == enumC0879a) {
                return enumC0879a;
            }
        }
        return C0808g.f9229a;
    }
}

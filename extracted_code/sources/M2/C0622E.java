package m2;

import K2.InterfaceC0091u;
import android.content.Context;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: m2.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622E extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f8207q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f8208r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0627J f8209s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ double f8210t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0622E(String str, C0627J c0627j, double d3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8208r = str;
        this.f8209s = c0627j;
        this.f8210t = d3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new C0622E(this.f8208r, this.f8209s, this.f8210t, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0622E) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8207q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            O.e eVar = new O.e(this.f8208r);
            Context context = this.f8209s.f8226m;
            if (context != null) {
                C1.j a3 = AbstractC0628K.a(context);
                C0621D c0621d = new C0621D(eVar, this.f8210t, null);
                this.f8207q = 1;
                if (a3.d(new O.g(c0621d, null), this) == enumC0879a) {
                    return enumC0879a;
                }
            } else {
                D2.i.g("context");
                throw null;
            }
        }
        return C0808g.f9229a;
    }
}

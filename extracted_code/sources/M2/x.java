package m2;

import K.InterfaceC0054h;
import K2.InterfaceC0091u;
import android.content.Context;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class x extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public D2.q f8314q;

    /* renamed from: r  reason: collision with root package name */
    public int f8315r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f8316s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0627J f8317t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ D2.q f8318u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, C0627J c0627j, D2.q qVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8316s = str;
        this.f8317t = c0627j;
        this.f8318u = qVar;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new x(this.f8316s, this.f8317t, this.f8318u, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((x) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        D2.q qVar;
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8315r;
        if (i3 != 0) {
            if (i3 == 1) {
                qVar = this.f8314q;
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            O.e eVar = new O.e(this.f8316s);
            Context context = this.f8317t.f8226m;
            if (context != null) {
                C0646o c0646o = new C0646o(((InterfaceC0054h) AbstractC0628K.a(context).f168n).m(), eVar, 2);
                D2.q qVar2 = this.f8318u;
                this.f8314q = qVar2;
                this.f8315r = 1;
                Object c3 = N2.r.c(c0646o, this);
                if (c3 == enumC0879a) {
                    return enumC0879a;
                }
                qVar = qVar2;
                obj = c3;
            } else {
                D2.i.g("context");
                throw null;
            }
        }
        qVar.f342m = obj;
        return C0808g.f9229a;
    }
}

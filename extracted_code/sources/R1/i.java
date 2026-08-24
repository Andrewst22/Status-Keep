package r1;

import C2.p;
import android.app.Activity;
import g1.ExecutorC0274b;
import n2.AbstractC0664g;
import s1.InterfaceC0801a;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class i extends w2.f implements p {

    /* renamed from: q  reason: collision with root package name */
    public int f9024q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f9025r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0760b f9026s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Activity f9027t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0760b c0760b, Activity activity, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f9026s = c0760b;
        this.f9027t = activity;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        i iVar = new i(this.f9026s, this.f9027t, interfaceC0866d);
        iVar.f9025r = obj;
        return iVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((i) d((M2.p) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f9024q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            M2.p pVar = (M2.p) this.f9025r;
            W1.m mVar = new W1.m(pVar, 1);
            C0760b c0760b = this.f9026s;
            ((InterfaceC0801a) c0760b.f9010n).b(this.f9027t, new ExecutorC0274b(0), mVar);
            N.b bVar = new N.b(1, c0760b, mVar);
            this.f9024q = 1;
            if (M2.i.b(pVar, bVar, this) == enumC0879a) {
                return enumC0879a;
            }
        }
        return C0808g.f9229a;
    }
}

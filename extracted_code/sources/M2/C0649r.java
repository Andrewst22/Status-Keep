package m2;

import K.InterfaceC0054h;
import K2.InterfaceC0091u;
import android.content.Context;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: m2.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649r extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public D2.q f8287q;

    /* renamed from: r  reason: collision with root package name */
    public int f8288r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f8289s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0627J f8290t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ D2.q f8291u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649r(String str, C0627J c0627j, D2.q qVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8289s = str;
        this.f8290t = c0627j;
        this.f8291u = qVar;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new C0649r(this.f8289s, this.f8290t, this.f8291u, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0649r) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        D2.q qVar;
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8288r;
        if (i3 != 0) {
            if (i3 == 1) {
                qVar = this.f8287q;
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            O.e eVar = new O.e(this.f8289s);
            C0627J c0627j = this.f8290t;
            Context context = c0627j.f8226m;
            if (context != null) {
                B1.e eVar2 = new B1.e(((InterfaceC0054h) AbstractC0628K.a(context).f168n).m(), eVar, c0627j, 20);
                D2.q qVar2 = this.f8291u;
                this.f8287q = qVar2;
                this.f8288r = 1;
                Object c3 = N2.r.c(eVar2, this);
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

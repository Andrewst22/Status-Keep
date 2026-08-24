package m2;

import K2.InterfaceC0091u;
import android.content.Context;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: m2.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619B extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f8196q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f8197r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0627J f8198s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ boolean f8199t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0619B(String str, C0627J c0627j, boolean z3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8197r = str;
        this.f8198s = c0627j;
        this.f8199t = z3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new C0619B(this.f8197r, this.f8198s, this.f8199t, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0619B) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8196q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            O.e eVar = new O.e(this.f8197r);
            Context context = this.f8198s.f8226m;
            if (context != null) {
                C1.j a3 = AbstractC0628K.a(context);
                C0618A c0618a = new C0618A(eVar, this.f8199t, null);
                this.f8196q = 1;
                if (a3.d(new O.g(c0618a, null), this) == enumC0879a) {
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

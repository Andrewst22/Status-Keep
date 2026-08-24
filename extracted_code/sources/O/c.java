package O;

import C2.p;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class c extends w2.f implements p {

    /* renamed from: q  reason: collision with root package name */
    public int f1186q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f1187r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ w2.f f1188s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f1188s = (w2.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [w2.f, C2.p] */
    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        c cVar = new c(this.f1188s, interfaceC0866d);
        cVar.f1187r = obj;
        return cVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((c) d((b) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w2.f, C2.p] */
    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f1186q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f1186q = 1;
            obj = this.f1188s.i((b) this.f1187r, this);
            if (obj == enumC0879a) {
                return enumC0879a;
            }
        }
        b bVar = (b) obj;
        D2.i.c(bVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        bVar.f1185b.f974a.set(true);
        return bVar;
    }
}

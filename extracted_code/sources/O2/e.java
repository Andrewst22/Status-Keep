package O2;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class e extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public int f1337q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f1338r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f f1339s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f1339s = fVar;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        e eVar = new e(this.f1339s, interfaceC0866d);
        eVar.f1338r = obj;
        return eVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((e) d((M2.p) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f1337q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f1337q = 1;
            if (this.f1339s.a((M2.p) this.f1338r, this) == enumC0879a) {
                return enumC0879a;
            }
        }
        return C0808g.f9229a;
    }
}

package O;

import C2.p;
import java.util.LinkedHashMap;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class g extends w2.f implements p {

    /* renamed from: q  reason: collision with root package name */
    public int f1192q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f1193r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ w2.f f1194s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f1194s = (w2.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [w2.f, C2.p] */
    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        g gVar = new g(this.f1194s, interfaceC0866d);
        gVar.f1193r = obj;
        return gVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((g) d((b) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [w2.f, C2.p] */
    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f1192q;
        if (i3 != 0) {
            if (i3 == 1) {
                b bVar = (b) this.f1193r;
                AbstractC0664g.w(obj);
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0664g.w(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f1193r).a()), false);
        this.f1193r = bVar2;
        this.f1192q = 1;
        if (this.f1194s.i(bVar2, this) == enumC0879a) {
            return enumC0879a;
        }
        return bVar2;
    }
}

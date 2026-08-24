package m2;

import java.util.List;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: m2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640i extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f8259q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ List f8260r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640i(List list, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8260r = list;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        C0640i c0640i = new C0640i(this.f8260r, interfaceC0866d);
        c0640i.f8259q = obj;
        return c0640i;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        C0808g c0808g = C0808g.f9229a;
        ((C0640i) d((O.b) obj, (InterfaceC0866d) obj2)).n(c0808g);
        return c0808g;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        AbstractC0664g.w(obj);
        O.b bVar = (O.b) this.f8259q;
        List<String> list = this.f8260r;
        if (list != null) {
            for (String str : list) {
                D2.i.e(str, "name");
                O.e eVar = new O.e(str);
                bVar.b();
                bVar.f1184a.remove(eVar);
            }
        } else {
            bVar.b();
            bVar.f1184a.clear();
        }
        return C0808g.f9229a;
    }
}

package m2;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: m2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642k extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f8264q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ O.e f8265r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f8266s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0642k(O.e eVar, String str, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8265r = eVar;
        this.f8266s = str;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        C0642k c0642k = new C0642k(this.f8265r, this.f8266s, interfaceC0866d);
        c0642k.f8264q = obj;
        return c0642k;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        C0808g c0808g = C0808g.f9229a;
        ((C0642k) d((O.b) obj, (InterfaceC0866d) obj2)).n(c0808g);
        return c0808g;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        AbstractC0664g.w(obj);
        ((O.b) this.f8264q).d(this.f8265r, this.f8266s);
        return C0808g.f9229a;
    }
}

package m2;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: m2.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621D extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f8204q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ O.e f8205r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ double f8206s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0621D(O.e eVar, double d3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8205r = eVar;
        this.f8206s = d3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        C0621D c0621d = new C0621D(this.f8205r, this.f8206s, interfaceC0866d);
        c0621d.f8204q = obj;
        return c0621d;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        C0808g c0808g = C0808g.f9229a;
        ((C0621D) d((O.b) obj, (InterfaceC0866d) obj2)).n(c0808g);
        return c0808g;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        AbstractC0664g.w(obj);
        ((O.b) this.f8204q).d(this.f8205r, new Double(this.f8206s));
        return C0808g.f9229a;
    }
}

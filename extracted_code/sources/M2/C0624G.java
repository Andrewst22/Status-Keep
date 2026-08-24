package m2;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: m2.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624G extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f8215q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ O.e f8216r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f8217s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624G(O.e eVar, long j3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8216r = eVar;
        this.f8217s = j3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        C0624G c0624g = new C0624G(this.f8216r, this.f8217s, interfaceC0866d);
        c0624g.f8215q = obj;
        return c0624g;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        C0808g c0808g = C0808g.f9229a;
        ((C0624G) d((O.b) obj, (InterfaceC0866d) obj2)).n(c0808g);
        return c0808g;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        AbstractC0664g.w(obj);
        ((O.b) this.f8215q).d(this.f8216r, new Long(this.f8217s));
        return C0808g.f9229a;
    }
}

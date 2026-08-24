package m2;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: m2.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618A extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f8193q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ O.e f8194r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f8195s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618A(O.e eVar, boolean z3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8194r = eVar;
        this.f8195s = z3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        C0618A c0618a = new C0618A(this.f8194r, this.f8195s, interfaceC0866d);
        c0618a.f8193q = obj;
        return c0618a;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        C0808g c0808g = C0808g.f9229a;
        ((C0618A) d((O.b) obj, (InterfaceC0866d) obj2)).n(c0808g);
        return c0808g;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        AbstractC0664g.w(obj);
        ((O.b) this.f8193q).d(this.f8194r, Boolean.valueOf(this.f8195s));
        return C0808g.f9229a;
    }
}

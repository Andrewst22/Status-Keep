package K;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: K.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062p extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f658q;

    /* JADX WARN: Type inference failed for: r0v0, types: [w2.f, u2.d, K.p] */
    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        ?? fVar = new w2.f(2, interfaceC0866d);
        fVar.f658q = obj;
        return fVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0062p) d((b0) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        AbstractC0664g.w(obj);
        return Boolean.valueOf(!(((b0) this.f658q) instanceof S));
    }
}

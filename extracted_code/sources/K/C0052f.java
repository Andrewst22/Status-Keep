package K;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: K.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052f extends w2.f implements C2.l {

    /* renamed from: q  reason: collision with root package name */
    public int f619q;

    @Override // C2.l
    public final Object b(Object obj) {
        w2.f fVar = new w2.f(1, (InterfaceC0866d) obj);
        C0808g c0808g = C0808g.f9229a;
        fVar.n(c0808g);
        return c0808g;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        int i3 = this.f619q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
                return C0808g.f9229a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0664g.w(obj);
        this.f619q = 1;
        throw null;
    }
}

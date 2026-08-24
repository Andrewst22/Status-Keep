package K;

import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: K.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071z implements N2.e {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f691m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f692n;

    public /* synthetic */ C0071z(Object obj, int i3) {
        this.f691m = i3;
        this.f692n = obj;
    }

    @Override // N2.e
    public final Object a(Object obj, InterfaceC0866d interfaceC0866d) {
        Object e2;
        switch (this.f691m) {
            case 0:
                C0808g c0808g = (C0808g) obj;
                Q q3 = (Q) this.f692n;
                boolean z3 = q3.f574t.E() instanceof S;
                C0808g c0808g2 = C0808g.f9229a;
                if (!z3 && (e2 = Q.e(q3, true, interfaceC0866d)) == EnumC0879a.f9494m) {
                    return e2;
                }
                return c0808g2;
            case 1:
                ((D2.q) this.f692n).f342m = obj;
                throw new O2.a(this);
            default:
                ((W1.m) this.f692n).accept(obj);
                return C0808g.f9229a;
        }
    }
}

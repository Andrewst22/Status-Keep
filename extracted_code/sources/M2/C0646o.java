package m2;

import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: m2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646o implements N2.d {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f8276m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ N2.d f8277n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ O.e f8278o;

    public /* synthetic */ C0646o(N2.d dVar, O.e eVar, int i3) {
        this.f8276m = i3;
        this.f8277n = dVar;
        this.f8278o = eVar;
    }

    @Override // N2.d
    public final Object x(N2.e eVar, InterfaceC0866d interfaceC0866d) {
        switch (this.f8276m) {
            case 0:
                Object x = this.f8277n.x(new C0645n(eVar, this.f8278o, 0), interfaceC0866d);
                if (x != EnumC0879a.f9494m) {
                    return C0808g.f9229a;
                }
                return x;
            case 1:
                Object x3 = this.f8277n.x(new C0645n(eVar, this.f8278o, 1), interfaceC0866d);
                if (x3 != EnumC0879a.f9494m) {
                    return C0808g.f9229a;
                }
                return x3;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object x4 = this.f8277n.x(new C0645n(eVar, this.f8278o, 2), interfaceC0866d);
                if (x4 != EnumC0879a.f9494m) {
                    return C0808g.f9229a;
                }
                return x4;
            default:
                Object x5 = this.f8277n.x(new C0645n(eVar, this.f8278o, 3), interfaceC0866d);
                if (x5 != EnumC0879a.f9494m) {
                    return C0808g.f9229a;
                }
                return x5;
        }
    }
}

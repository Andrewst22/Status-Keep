package K;

import java.io.Serializable;
import s2.C0808g;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class H extends w2.f implements C2.l {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f535q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f536r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Q f537s;

    /* renamed from: t  reason: collision with root package name */
    public Object f538t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f539u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Serializable f540v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(D2.q qVar, Q q3, D2.o oVar, InterfaceC0866d interfaceC0866d) {
        super(1, interfaceC0866d);
        this.f539u = qVar;
        this.f537s = q3;
        this.f540v = oVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [w2.f, C2.p] */
    @Override // C2.l
    public final Object b(Object obj) {
        InterfaceC0866d interfaceC0866d = (InterfaceC0866d) obj;
        switch (this.f535q) {
            case 0:
                return new H((D2.q) this.f539u, this.f537s, (D2.o) this.f540v, interfaceC0866d).n(C0808g.f9229a);
            default:
                return new H(this.f537s, (u2.i) this.f539u, (C2.p) ((w2.f) this.f540v), interfaceC0866d).n(C0808g.f9229a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Type inference failed for: r6v2, types: [w2.f, C2.p] */
    @Override // w2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.H.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Q q3, u2.i iVar, C2.p pVar, InterfaceC0866d interfaceC0866d) {
        super(1, interfaceC0866d);
        this.f537s = q3;
        this.f539u = iVar;
        this.f540v = (w2.f) pVar;
    }
}

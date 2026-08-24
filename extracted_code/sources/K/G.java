package K;

import s2.C0808g;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class G extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public Object f530q;

    /* renamed from: r  reason: collision with root package name */
    public int f531r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ boolean f532s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Q f533t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f534u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Q q3, int i3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f533t = q3;
        this.f534u = i3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        G g3 = new G(this.f533t, this.f534u, interfaceC0866d);
        g3.f532s = ((Boolean) obj).booleanValue();
        return g3;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) d(bool, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // w2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            v2.a r0 = v2.EnumC0879a.f9494m
            int r1 = r6.f531r
            K.Q r2 = r6.f533t
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.f530q
            n2.AbstractC0664g.w(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.f532s
            n2.AbstractC0664g.w(r7)
            goto L32
        L22:
            n2.AbstractC0664g.w(r7)
            boolean r1 = r6.f532s
            r6.f532s = r1
            r6.f531r = r4
            java.lang.Object r7 = r2.i(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4c
            K.a0 r1 = r2.g()
            r6.f530q = r7
            r6.f531r = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L43
            return r0
        L43:
            r0 = r7
            r7 = r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L51
        L4c:
            int r0 = r6.f534u
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            K.c r1 = new K.c
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r1.<init>(r2, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K.G.n(java.lang.Object):java.lang.Object");
    }
}

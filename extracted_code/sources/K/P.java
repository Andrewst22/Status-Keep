package K;

import s2.C0808g;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class P extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public D2.o f560q;

    /* renamed from: r  reason: collision with root package name */
    public int f561r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object f562s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ D2.o f563t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Q f564u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f565v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f566w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(D2.o oVar, Q q3, Object obj, boolean z3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f563t = oVar;
        this.f564u = q3;
        this.f565v = obj;
        this.f566w = z3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        P p3 = new P(this.f563t, this.f564u, this.f565v, this.f566w, interfaceC0866d);
        p3.f562s = obj;
        return p3;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((P) d((M.k) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // w2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            v2.a r0 = v2.EnumC0879a.f9494m
            int r1 = r8.f561r
            D2.o r2 = r8.f563t
            java.lang.Object r3 = r8.f565v
            K.Q r4 = r8.f564u
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            n2.AbstractC0664g.w(r9)
            goto L65
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            D2.o r1 = r8.f560q
            java.lang.Object r6 = r8.f562s
            M.k r6 = (M.k) r6
            n2.AbstractC0664g.w(r9)
            goto L4f
        L28:
            n2.AbstractC0664g.w(r9)
            java.lang.Object r9 = r8.f562s
            M.k r9 = (M.k) r9
            K.a0 r1 = r4.g()
            r8.f562s = r9
            r8.f560q = r2
            r8.f561r = r6
            C1.j r1 = r1.f603b
            java.lang.Object r1 = r1.f168n
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r1 = r2
            r7 = r6
            r6 = r9
            r9 = r7
        L4f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f340m = r9
            r9 = 0
            r8.f562s = r9
            r8.f560q = r9
            r8.f561r = r5
            java.lang.Object r9 = r6.b(r3, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            boolean r9 = r8.f566w
            if (r9 == 0) goto L7d
            C1.j r9 = r4.f574t
            K.c r0 = new K.c
            if (r3 == 0) goto L74
            int r1 = r3.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r2 = r2.f340m
            r0.<init>(r1, r2, r3)
            r9.R(r0)
        L7d:
            s2.g r9 = s2.C0808g.f9229a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K.P.n(java.lang.Object):java.lang.Object");
    }
}

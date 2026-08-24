package K;

import K2.AbstractC0092v;
import K2.InterfaceC0091u;
import java.util.List;
import s2.C0806e;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class Q implements InterfaceC0054h {

    /* renamed from: m  reason: collision with root package name */
    public final M.f f567m;

    /* renamed from: n  reason: collision with root package name */
    public final B1.b f568n;

    /* renamed from: o  reason: collision with root package name */
    public final InterfaceC0091u f569o;

    /* renamed from: r  reason: collision with root package name */
    public int f572r;

    /* renamed from: s  reason: collision with root package name */
    public K2.e0 f573s;

    /* renamed from: u  reason: collision with root package name */
    public final C0059m f575u;
    public final C0059m x;

    /* renamed from: p  reason: collision with root package name */
    public final C1.j f570p = new C1.j(new C0066u(this, null));

    /* renamed from: q  reason: collision with root package name */
    public final S2.d f571q = S2.e.a();

    /* renamed from: t  reason: collision with root package name */
    public final C1.j f574t = new C1.j(7);

    /* renamed from: v  reason: collision with root package name */
    public final C0806e f576v = new C0806e(new C0060n(this, 1));

    /* renamed from: w  reason: collision with root package name */
    public final C0806e f577w = new C0806e(new C0060n(this, 0));

    public Q(M.f fVar, List list, B1.b bVar, InterfaceC0091u interfaceC0091u) {
        this.f567m = fVar;
        this.f568n = bVar;
        this.f569o = interfaceC0091u;
        this.f575u = new C0059m(this, list);
        this.x = new C0059m(interfaceC0091u, new L(this, 0), new N(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:18:0x004b, B:20:0x0053, B:22:0x0057, B:23:0x005a), top: B:31:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(K.Q r4, w2.b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof K.C0067v
            if (r0 == 0) goto L16
            r0 = r5
            K.v r0 = (K.C0067v) r0
            int r1 = r0.f677t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f677t = r1
            goto L1b
        L16:
            K.v r0 = new K.v
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f675r
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f677t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            S2.d r4 = r0.f674q
            K.Q r0 = r0.f673p
            n2.AbstractC0664g.w(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            n2.AbstractC0664g.w(r5)
            r0.f673p = r4
            S2.d r5 = r4.f571q
            r0.f674q = r5
            r0.f677t = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L64
        L4a:
            r0 = 0
            int r1 = r4.f572r     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f572r = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            K2.e0 r1 = r4.f573s     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.b(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.f573s = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.e(r0)
            s2.g r1 = s2.C0808g.f9229a
        L64:
            return r1
        L65:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K.Q.a(K.Q, w2.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|(7:57|(1:(1:(1:61)(2:63|64))(3:65|66|67))(1:68)|62|17|(1:19)(1:23)|20|21)(4:8|9|10|(9:12|13|14|(1:24)|16|17|(0)(0)|20|21)(3:30|(1:32)(1:55)|(2:34|(2:36|(2:38|39))(2:47|48))(2:49|(2:51|52)(2:53|54))))|40|41|42|(1:44)|16|17|(0)(0)|20|21))|70|6|(0)(0)|40|41|42|(0)|16|17|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [w2.f, C2.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [w2.f, C2.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(K.Q r9, K.T r10, w2.b r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.Q.b(K.Q, K.T, w2.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004b, B:20:0x0052), top: B:28:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(K.Q r4, w2.b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof K.C0070y
            if (r0 == 0) goto L16
            r0 = r5
            K.y r0 = (K.C0070y) r0
            int r1 = r0.f690t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f690t = r1
            goto L1b
        L16:
            K.y r0 = new K.y
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f688r
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f690t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            S2.d r4 = r0.f687q
            K.Q r0 = r0.f686p
            n2.AbstractC0664g.w(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            n2.AbstractC0664g.w(r5)
            r0.f686p = r4
            S2.d r5 = r4.f571q
            r0.f687q = r5
            r0.f690t = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L67
        L4a:
            r0 = 0
            int r1 = r4.f572r     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + r3
            r4.f572r = r1     // Catch: java.lang.Throwable -> L60
            if (r1 != r3) goto L62
            K2.u r1 = r4.f569o     // Catch: java.lang.Throwable -> L60
            K.A r2 = new K.A     // Catch: java.lang.Throwable -> L60
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L60
            K2.e0 r1 = K2.AbstractC0092v.g(r1, r2)     // Catch: java.lang.Throwable -> L60
            r4.f573s = r1     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r4 = move-exception
            goto L68
        L62:
            r5.e(r0)
            s2.g r1 = s2.C0808g.f9229a
        L67:
            return r1
        L68:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: K.Q.c(K.Q, w2.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(K.Q r8, boolean r9, u2.InterfaceC0866d r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.Q.e(K.Q, boolean, u2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea A[Catch: b -> 0x00ab, TryCatch #2 {b -> 0x00ab, blocks: (B:35:0x00a6, B:69:0x0144, B:40:0x00b4, B:66:0x0127, B:48:0x00d1, B:56:0x00ea, B:57:0x00ee, B:52:0x00da, B:63:0x0115), top: B:77:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, D2.q, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [D2.o, java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(K.Q r8, boolean r9, w2.b r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.Q.f(K.Q, boolean, w2.b):java.lang.Object");
    }

    @Override // K.InterfaceC0054h
    public final Object d(C2.p pVar, w2.f fVar) {
        u2.i iVar = fVar.f9665n;
        D2.i.b(iVar);
        e0 e0Var = (e0) iVar.d(d0.f612m);
        if (e0Var != null) {
            e0Var.e(this);
        }
        return AbstractC0092v.n(new e0(e0Var, this), new K(this, pVar, null), fVar);
    }

    public final a0 g() {
        return (a0) this.f577w.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(w2.b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof K.B
            if (r0 == 0) goto L13
            r0 = r6
            K.B r0 = (K.B) r0
            int r1 = r0.f507t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f507t = r1
            goto L18
        L13:
            K.B r0 = new K.B
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f505r
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f507t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f504q
            K.Q r0 = r0.f503p
            n2.AbstractC0664g.w(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            K.Q r2 = r0.f503p
            n2.AbstractC0664g.w(r6)
            goto L51
        L3e:
            n2.AbstractC0664g.w(r6)
            K.a0 r6 = r5.g()
            r0.f503p = r5
            r0.f507t = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            K.m r4 = r2.f575u     // Catch: java.lang.Throwable -> L6d
            r0.f503p = r2     // Catch: java.lang.Throwable -> L6d
            r0.f504q = r6     // Catch: java.lang.Throwable -> L6d
            r0.f507t = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.l(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
            return r1
        L66:
            s2.g r6 = s2.C0808g.f9229a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            C1.j r0 = r0.f574t
            K.U r2 = new K.U
            r2.<init>(r6, r1)
            r0.R(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K.Q.h(w2.b):java.lang.Object");
    }

    public final Object i(w2.b bVar) {
        return ((M.i) this.f576v.a()).a(new r(3, (InterfaceC0866d) null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Type inference failed for: r14v2, types: [D2.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r12, boolean r13, w2.b r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof K.O
            if (r0 == 0) goto L13
            r0 = r14
            K.O r0 = (K.O) r0
            int r1 = r0.f559s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f559s = r1
            goto L18
        L13:
            K.O r0 = new K.O
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f557q
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f559s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            D2.o r12 = r0.f556p
            n2.AbstractC0664g.w(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            n2.AbstractC0664g.w(r14)
            D2.o r14 = new D2.o
            r14.<init>()
            s2.e r2 = r11.f576v
            java.lang.Object r2 = r2.a()
            M.i r2 = (M.i) r2
            K.P r10 = new K.P
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f556p = r14
            r0.f559s = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f340m
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: K.Q.j(java.lang.Object, boolean, w2.b):java.lang.Object");
    }

    @Override // K.InterfaceC0054h
    public final N2.d m() {
        return this.f570p;
    }
}

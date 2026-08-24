package N2;
/* loaded from: classes.dex */
public final class c extends O2.f {

    /* renamed from: p  reason: collision with root package name */
    public final r1.i f1123p;

    /* renamed from: q  reason: collision with root package name */
    public final r1.i f1124q;

    public c(r1.i iVar, u2.i iVar2, int i3, int i4) {
        super(iVar2, i3, i4);
        this.f1123p = iVar;
        this.f1124q = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // O2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(M2.p r6, u2.InterfaceC0866d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof N2.b
            if (r0 == 0) goto L13
            r0 = r7
            N2.b r0 = (N2.b) r0
            int r1 = r0.f1122s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1122s = r1
            goto L1a
        L13:
            N2.b r0 = new N2.b
            w2.b r7 = (w2.b) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f1120q
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f1122s
            s2.g r3 = s2.C0808g.f9229a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            M2.p r6 = r0.f1119p
            n2.AbstractC0664g.w(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            n2.AbstractC0664g.w(r7)
            r0.f1119p = r6
            r0.f1122s = r4
            r1.i r7 = r5.f1123p
            java.lang.Object r7 = r7.i(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            M2.o r6 = (M2.o) r6
            M2.b r6 = r6.f1099p
            boolean r6 = r6.s()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.c.a(M2.p, u2.d):java.lang.Object");
    }

    @Override // O2.f
    public final O2.f b(u2.i iVar, int i3, int i4) {
        return new c(this.f1124q, iVar, i3, i4);
    }

    @Override // O2.f
    public final String toString() {
        return "block[" + this.f1123p + "] -> " + super.toString();
    }
}

package M2;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final h f1093a = new Object();

    public static b a(int i3, int i4, int i5) {
        b mVar;
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        if (i3 != -2) {
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != Integer.MAX_VALUE) {
                        if (i4 == 1) {
                            return new b(i3, null);
                        }
                        return new m(i3, i4, null);
                    }
                    return new b(Integer.MAX_VALUE, null);
                } else if (i4 == 1) {
                    mVar = new b(0, null);
                } else {
                    mVar = new m(1, i4, null);
                }
            } else if (i4 == 1) {
                return new m(1, 2, null);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else if (i4 == 1) {
            f.f1091b.getClass();
            mVar = new b(e.f1090b, null);
        } else {
            mVar = new m(1, i4, null);
        }
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Type inference failed for: r0v2, types: [M2.n, u2.d, w2.b] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r5v5, types: [C2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(M2.p r4, N.b r5, w2.b r6) {
        /*
            boolean r0 = r6 instanceof M2.n
            if (r0 == 0) goto L13
            r0 = r6
            M2.n r0 = (M2.n) r0
            int r1 = r0.f1098r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1098r = r1
            goto L18
        L13:
            M2.n r0 = new M2.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1097q
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f1098r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            C2.a r5 = r0.f1096p
            n2.AbstractC0664g.w(r6)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r4 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            n2.AbstractC0664g.w(r6)
            u2.i r6 = r0.f9665n
            D2.i.b(r6)
            K2.t r2 = K2.C0090t.f856n
            u2.g r6 = r6.d(r2)
            if (r6 != r4) goto L6f
            r0.f1096p = r5     // Catch: java.lang.Throwable -> L29
            r0.f1098r = r3     // Catch: java.lang.Throwable -> L29
            K2.f r6 = new K2.f     // Catch: java.lang.Throwable -> L29
            u2.d r0 = n2.AbstractC0664g.p(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.v()     // Catch: java.lang.Throwable -> L29
            K.L r0 = new K.L     // Catch: java.lang.Throwable -> L29
            r2 = 1
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            M2.o r4 = (M2.o) r4     // Catch: java.lang.Throwable -> L29
            r4.X(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L65
            return r1
        L65:
            r5.c()
            s2.g r4 = s2.C0808g.f9229a
            return r4
        L6b:
            r5.c()
            throw r4
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.i.b(M2.p, N.b, w2.b):java.lang.Object");
    }
}

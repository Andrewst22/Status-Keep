package K;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final S2.d f602a = S2.e.a();

    /* renamed from: b  reason: collision with root package name */
    public final C1.j f603b = new C1.j(5);

    /* renamed from: c  reason: collision with root package name */
    public final C1.j f604c = new C1.j((C2.p) new w2.f(2, null));

    /* JADX WARN: Type inference failed for: r3v3, types: [w2.f, C2.p] */
    public a0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f603b.f168n).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(C2.l r8, w2.b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof K.X
            if (r0 == 0) goto L13
            r0 = r9
            K.X r0 = (K.X) r0
            int r1 = r0.f596t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f596t = r1
            goto L18
        L13:
            K.X r0 = new K.X
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f594r
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f596t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f592p
            S2.a r8 = (S2.a) r8
            n2.AbstractC0664g.w(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            S2.d r8 = r0.f593q
            java.lang.Object r2 = r0.f592p
            C2.l r2 = (C2.l) r2
            n2.AbstractC0664g.w(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            n2.AbstractC0664g.w(r9)
            r0.f592p = r8
            S2.d r9 = r7.f602a
            r0.f593q = r9
            r0.f596t = r4
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r0.f592p = r9     // Catch: java.lang.Throwable -> L6d
            r0.f593q = r5     // Catch: java.lang.Throwable -> L6d
            r0.f596t = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.b(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            S2.d r8 = (S2.d) r8
            r8.e(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            S2.d r8 = (S2.d) r8
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K.a0.b(C2.l, w2.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(C2.p r7, w2.b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof K.Y
            if (r0 == 0) goto L13
            r0 = r8
            K.Y r0 = (K.Y) r0
            int r1 = r0.f601t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f601t = r1
            goto L18
        L13:
            K.Y r0 = new K.Y
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f599r
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f601t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f598q
            S2.d r0 = r0.f597p
            n2.AbstractC0664g.w(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            n2.AbstractC0664g.w(r8)
            S2.d r8 = r6.f602a
            boolean r2 = r8.d(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f597p = r8     // Catch: java.lang.Throwable -> L59
            r0.f598q = r2     // Catch: java.lang.Throwable -> L59
            r0.f601t = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.i(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.e(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.e(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K.a0.c(C2.p, w2.b):java.lang.Object");
    }
}

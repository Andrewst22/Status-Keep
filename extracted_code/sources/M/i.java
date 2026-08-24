package M;

import K.InterfaceC0047a;
import K.a0;
import T2.l;
/* loaded from: classes.dex */
public final class i implements InterfaceC0047a {

    /* renamed from: a  reason: collision with root package name */
    public final T2.i f1005a;

    /* renamed from: b  reason: collision with root package name */
    public final l f1006b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f1007c;

    /* renamed from: d  reason: collision with root package name */
    public final e f1008d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1009e;

    /* renamed from: f  reason: collision with root package name */
    public final S2.d f1010f;

    public i(T2.i iVar, l lVar, a0 a0Var, e eVar) {
        D2.i.e(iVar, "fileSystem");
        D2.i.e(lVar, "path");
        D2.i.e(a0Var, "coordinator");
        this.f1005a = iVar;
        this.f1006b = lVar;
        this.f1007c = a0Var;
        this.f1008d = eVar;
        this.f1009e = new a();
        this.f1010f = S2.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:28|29))(2:30|(6:32|33|34|35|36|(1:38)(1:39))(2:49|50))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007d, blocks: (B:33:0x007c, B:43:0x008f, B:39:0x0087), top: B:58:0x0020 }] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [M.g, w2.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [M.i] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [K.r] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(K.r r9, w2.b r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof M.g
            if (r0 == 0) goto L13
            r0 = r10
            M.g r0 = (M.g) r0
            int r1 = r0.f997u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f997u = r1
            goto L18
        L13:
            M.g r0 = new M.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f995s
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f997u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r9 = r0.f994r
            M.c r1 = r0.f993q
            M.i r0 = r0.f992p
            n2.AbstractC0664g.w(r10)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r10 = move-exception
            goto L87
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            n2.AbstractC0664g.w(r10)
            M.a r10 = r8.f1009e
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.f974a
            boolean r10 = r10.get()
            if (r10 != 0) goto L9f
            S2.d r10 = r8.f1010f
            boolean r10 = r10.d(r3)
            M.c r2 = new M.c     // Catch: java.lang.Throwable -> L95
            T2.i r5 = r8.f1005a     // Catch: java.lang.Throwable -> L95
            T2.l r6 = r8.f1006b     // Catch: java.lang.Throwable -> L95
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L85
            r0.f992p = r8     // Catch: java.lang.Throwable -> L85
            r0.f993q = r2     // Catch: java.lang.Throwable -> L85
            r0.f994r = r10     // Catch: java.lang.Throwable -> L85
            r0.f997u = r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r9 = r9.p(r2, r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r9 != r1) goto L67
            return r1
        L67:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L71
            r1 = r3
            goto L72
        L71:
            r1 = move-exception
        L72:
            if (r1 != 0) goto L7c
            if (r9 == 0) goto L7b
            S2.d r9 = r0.f1010f
            r9.e(r3)
        L7b:
            return r10
        L7c:
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r10 = move-exception
            goto L97
        L7f:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
            goto L87
        L85:
            r9 = move-exception
            goto L7f
        L87:
            r1.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r1 = move-exception
            m2.AbstractC0635d.b(r10, r1)     // Catch: java.lang.Throwable -> L7d
        L8f:
            throw r10     // Catch: java.lang.Throwable -> L7d
        L90:
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
            goto L97
        L95:
            r9 = move-exception
            goto L90
        L97:
            if (r9 == 0) goto L9e
            S2.d r9 = r0.f1010f
            r9.e(r3)
        L9e:
            throw r10
        L9f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M.i.a(K.r, w2.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:57:0x011a, B:59:0x0122, B:67:0x013a, B:74:0x0149, B:70:0x0141), top: B:93:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:57:0x011a, B:59:0x0122, B:67:0x013a, B:74:0x0149, B:70:0x0141), top: B:93:0x0021 }] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T2.f, T2.i] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, T2.i] */
    /* JADX WARN: Type inference failed for: r10v25, types: [S2.a] */
    /* JADX WARN: Type inference failed for: r10v9, types: [C2.p] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T2.l] */
    /* JADX WARN: Type inference failed for: r3v6, types: [C2.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(K.P r10, w2.b r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M.i.b(K.P, w2.b):java.lang.Object");
    }

    @Override // K.InterfaceC0047a
    public final void close() {
        this.f1009e.f974a.set(true);
        this.f1008d.c();
    }
}

package r0;
/* renamed from: r0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0751d implements C1.g {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ q f8910m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5.equals("audio/ac4") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
        if (r3.f8990g.a(r3.f8991h, r9) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:36:0x005a, B:38:0x005e, B:40:0x0062, B:45:0x0069, B:47:0x006d, B:49:0x0071, B:51:0x0075, B:53:0x007d, B:55:0x0087, B:58:0x0092), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007d A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:36:0x005a, B:38:0x005e, B:40:0x0062, B:45:0x0069, B:47:0x006d, B:49:0x0071, B:51:0x0075, B:53:0x007d, B:55:0x0087, B:58:0x0092), top: B:62:0x000a }] */
    @Override // C1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            r0.q r3 = r8.f8910m
            R.p r9 = (R.C0113p) r9
            java.lang.Object r4 = r3.f8986c
            monitor-enter(r4)
            r0.j r5 = r3.f8989f     // Catch: java.lang.Throwable -> L67
            boolean r5 = r5.f8950v     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L91
            boolean r5 = r3.f8988e     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L91
            int r5 = r9.f1951A     // Catch: java.lang.Throwable -> L67
            if (r5 <= r1) goto L91
            java.lang.String r5 = r9.f1974m     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L1e
        L1c:
            r1 = 0
            goto L56
        L1e:
            r6 = -1
            int r7 = r5.hashCode()
            switch(r7) {
                case -2123537834: goto L47;
                case 187078296: goto L3c;
                case 187078297: goto L33;
                case 1504578661: goto L28;
                default: goto L26;
            }
        L26:
            r1 = -1
            goto L51
        L28:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r7 = "audio/ac4"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L51
            goto L26
        L3c:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L45
            goto L26
        L45:
            r1 = 1
            goto L51
        L47:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L50
            goto L26
        L50:
            r1 = 0
        L51:
            switch(r1) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L1c
        L55:
            r1 = 1
        L56:
            r5 = 32
            if (r1 == 0) goto L69
            int r1 = U.A.f2405a     // Catch: java.lang.Throwable -> L67
            if (r1 < r5) goto L91
            r0.l r1 = r3.f8990g     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L91
            boolean r1 = r1.f8956b     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L91
            goto L69
        L67:
            r9 = move-exception
            goto L94
        L69:
            int r1 = U.A.f2405a     // Catch: java.lang.Throwable -> L67
            if (r1 < r5) goto L92
            r0.l r1 = r3.f8990g     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L92
            boolean r5 = r1.f8956b     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L92
            android.media.Spatializer r1 = r1.f8955a     // Catch: java.lang.Throwable -> L67
            boolean r1 = D.c.g(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L92
            r0.l r1 = r3.f8990g     // Catch: java.lang.Throwable -> L67
            android.media.Spatializer r1 = r1.f8955a     // Catch: java.lang.Throwable -> L67
            boolean r1 = D.c.j(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L92
            r0.l r1 = r3.f8990g     // Catch: java.lang.Throwable -> L67
            R.e r3 = r3.f8991h     // Catch: java.lang.Throwable -> L67
            boolean r9 = r1.a(r3, r9)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L92
        L91:
            r0 = 1
        L92:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            return r0
        L94:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C0751d.apply(java.lang.Object):boolean");
    }
}

package h0;
/* loaded from: classes.dex */
public abstract class p {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        r6 = ((h0.o) r4.get(r5)).f5856d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
        C.G.l();
        r4 = C.G.e();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (r5 >= r6.size()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r2 = C.G.g(r6.get(r5)).covers(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
        if (r2 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
        if (r7 != 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            java.util.List r3 = C.G.k(r3)
            r0 = 0
            if (r3 == 0) goto Lc5
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto Lc5
        Lf:
            C.G.l()
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = C.G.f(r4, r5, r6)
            r5 = 0
        L18:
            int r6 = r3.size()
            r7 = 2
            r1 = 1
            if (r5 >= r6) goto L33
            java.lang.Object r6 = r3.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = C.G.g(r6)
            boolean r6 = C.G.v(r6, r4)
            if (r6 == 0) goto L30
            r3 = 2
            goto L34
        L30:
            int r5 = r5 + 1
            goto L18
        L33:
            r3 = 1
        L34:
            if (r3 != r1) goto Lc4
            java.lang.Boolean r4 = android.support.v4.media.session.a.f3902a
            if (r4 != 0) goto Lc4
            int r4 = U.A.f2405a
            r5 = 35
            if (r4 < r5) goto L43
        L40:
            r1 = 0
            goto Lbb
        L43:
            R.o r4 = new R.o     // Catch: h0.C0280A -> Lbb
            r4.<init>()     // Catch: h0.C0280A -> Lbb
            java.lang.String r5 = "video/avc"
            java.lang.String r5 = R.G.l(r5)     // Catch: h0.C0280A -> Lbb
            r4.f1937l = r5     // Catch: h0.C0280A -> Lbb
            R.p r5 = new R.p     // Catch: h0.C0280A -> Lbb
            r5.<init>(r4)     // Catch: h0.C0280A -> Lbb
            java.lang.String r4 = r5.f1974m     // Catch: h0.C0280A -> Lbb
            if (r4 == 0) goto Lbb
            h0.w r4 = h0.w.f5934n     // Catch: h0.C0280A -> Lbb
            D1.b0 r4 = h0.D.g(r4, r5, r0, r0)     // Catch: h0.C0280A -> Lbb
            r5 = 0
        L60:
            int r6 = r4.f233p     // Catch: h0.C0280A -> Lbb
            if (r5 >= r6) goto Lbb
            java.lang.Object r6 = r4.get(r5)     // Catch: h0.C0280A -> Lbb
            h0.o r6 = (h0.o) r6     // Catch: h0.C0280A -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f5856d     // Catch: h0.C0280A -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: h0.C0280A -> Lbb
            h0.o r6 = (h0.o) r6     // Catch: h0.C0280A -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f5856d     // Catch: h0.C0280A -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: h0.C0280A -> Lbb
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r4.get(r5)     // Catch: h0.C0280A -> Lbb
            h0.o r6 = (h0.o) r6     // Catch: h0.C0280A -> Lbb
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f5856d     // Catch: h0.C0280A -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: h0.C0280A -> Lbb
            java.util.List r6 = C.G.k(r6)     // Catch: h0.C0280A -> Lbb
            if (r6 == 0) goto Lb8
            boolean r2 = r6.isEmpty()     // Catch: h0.C0280A -> Lbb
            if (r2 != 0) goto Lb8
            C.G.l()     // Catch: h0.C0280A -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = C.G.e()     // Catch: h0.C0280A -> Lbb
            r5 = 0
        L9c:
            int r2 = r6.size()     // Catch: h0.C0280A -> Lbb
            if (r5 >= r2) goto Lb4
            java.lang.Object r2 = r6.get(r5)     // Catch: h0.C0280A -> Lbb
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = C.G.g(r2)     // Catch: h0.C0280A -> Lbb
            boolean r2 = C.G.v(r2, r4)     // Catch: h0.C0280A -> Lbb
            if (r2 == 0) goto Lb1
            goto Lb5
        Lb1:
            int r5 = r5 + 1
            goto L9c
        Lb4:
            r7 = 1
        Lb5:
            if (r7 != r1) goto L40
            goto Lbb
        Lb8:
            int r5 = r5 + 1
            goto L60
        Lbb:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            android.support.v4.media.session.a.f3902a = r4
            if (r1 == 0) goto Lc4
            return r0
        Lc4:
            return r3
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.p.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}

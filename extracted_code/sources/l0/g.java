package l0;

import R.C0113p;
import U.A;
import k0.C0555j;
import w0.G;
import w0.q;
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    public int f8021a;

    /* renamed from: b  reason: collision with root package name */
    public int f8022b;

    /* renamed from: c  reason: collision with root package name */
    public int f8023c;

    /* renamed from: d  reason: collision with root package name */
    public long f8024d;

    /* renamed from: e  reason: collision with root package name */
    public long f8025e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f8026f;

    /* renamed from: g  reason: collision with root package name */
    public Object f8027g;

    public g(C0555j c0555j) {
        this.f8026f = c0555j;
        this.f8024d = -9223372036854775807L;
        this.f8022b = -1;
    }

    @Override // l0.i
    public void b(long j3, long j4) {
        this.f8024d = j3;
        this.f8025e = j4;
        this.f8023c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if ((r24.e() >> 6) == 0) goto L24;
     */
    @Override // l0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(U.t r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f8027g
            w0.G r5 = (w0.G) r5
            U.AbstractC0123a.k(r5)
            int r5 = r0.f8022b
            r6 = -1
            if (r5 == r6) goto L3e
            int r5 = k0.C0553h.a(r5)
            if (r2 == r5) goto L3e
            int r7 = U.A.f2405a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Received RTP packet with unexpected sequence number. Expected: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = "; received: "
            r7.append(r5)
            r7.append(r2)
            java.lang.String r5 = ". Dropping packet."
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "RtpMpeg4Reader"
            U.AbstractC0123a.A(r7, r5)
        L3e:
            int r5 = r24.a()
            java.lang.Object r7 = r0.f8027g
            w0.G r7 = (w0.G) r7
            r7.f(r5, r1)
            int r7 = r0.f8023c
            r8 = 0
            if (r7 != 0) goto L88
            byte[] r7 = r1.f2477a
            byte[] r9 = new byte[r3]
            r9 = {x00c6: FILL_ARRAY_DATA  , data: [0, 0, 1, -74} // fill-array
            if (r7 == 0) goto L80
            r10 = 0
        L58:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L6c
            r11 = 0
        L5e:
            if (r11 >= r3) goto L6d
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L6a
            int r10 = r10 + r4
            goto L58
        L6a:
            int r11 = r11 + r4
            goto L5e
        L6c:
            r10 = -1
        L6d:
            if (r10 == r6) goto L7c
            int r10 = r10 + r3
            r1.G(r10)
            int r1 = r24.e()
            int r1 = r1 >> 6
            if (r1 != 0) goto L7c
            goto L7d
        L7c:
            r4 = 0
        L7d:
            r0.f8021a = r4
            goto L88
        L80:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "array"
            r1.<init>(r2)
            throw r1
        L88:
            int r1 = r0.f8023c
            int r1 = r1 + r5
            r0.f8023c = r1
            if (r28 == 0) goto Lc2
            long r3 = r0.f8024d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = r25
            if (r1 != 0) goto L9e
            r0.f8024d = r3
        L9e:
            long r9 = r0.f8025e
            long r13 = r0.f8024d
            r15 = 90000(0x15f90, float:1.26117E-40)
            r11 = r25
            long r17 = a.AbstractC0155a.M(r9, r11, r13, r15)
            java.lang.Object r1 = r0.f8027g
            r16 = r1
            w0.G r16 = (w0.G) r16
            int r1 = r0.f8021a
            int r3 = r0.f8023c
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.b(r17, r19, r20, r21, r22)
            r0.f8023c = r8
        Lc2:
            r0.f8022b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.g.c(U.t, long, int, boolean):void");
    }

    @Override // l0.i
    public void e(q qVar, int i3) {
        G w3 = qVar.w(i3, 2);
        this.f8027g = w3;
        int i4 = A.f2405a;
        w3.c(((C0555j) this.f8026f).f7606c);
    }

    public g(int i3, int i4, C0113p c0113p, int i5, Object obj, long j3, long j4) {
        this.f8021a = i3;
        this.f8022b = i4;
        this.f8026f = c0113p;
        this.f8023c = i5;
        this.f8027g = obj;
        this.f8024d = j3;
        this.f8025e = j4;
    }

    @Override // l0.i
    public void d(long j3) {
    }
}

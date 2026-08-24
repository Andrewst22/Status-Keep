package B0;

import R.r;
import w0.C0895e;
import w0.C0896f;
import w0.InterfaceC0897g;
import w0.i;
import w0.l;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final C0895e f30a;

    /* renamed from: b  reason: collision with root package name */
    public final i f31b;

    /* renamed from: c  reason: collision with root package name */
    public C0896f f32c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33d;

    public c(InterfaceC0897g interfaceC0897g, i iVar, long j3, long j4, long j5, long j6, long j7, int i3) {
        this.f31b = iVar;
        this.f33d = i3;
        this.f30a = new C0895e(interfaceC0897g, j3, j4, j5, j6, j7);
    }

    public static int a(byte[] bArr, int i3) {
        return (bArr[i3 + 3] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8);
    }

    public static int c(l lVar, long j3, r rVar) {
        if (j3 == lVar.f9608p) {
            return 0;
        }
        rVar.f1989a = j3;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(w0.l r28, R.r r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            w0.f r3 = r0.f32c
            U.AbstractC0123a.k(r3)
            long r4 = r3.f9585f
            long r6 = r3.f9586g
            long r8 = r3.f9587h
            long r6 = r6 - r4
            int r10 = r0.f33d
            long r10 = (long) r10
            r12 = 0
            w0.i r13 = r0.f31b
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 > 0) goto L26
            r0.f32c = r12
            r13.m()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.f9608p
            long r4 = r8 - r4
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto Lc5
            r10 = 262144(0x40000, double:1.295163E-318)
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 > 0) goto Lc5
            int r5 = (int) r4
            r1.d(r5)
            r4 = 0
            r1.f9610r = r4
            long r4 = r3.f9581b
            w0.h r4 = r13.n(r1, r4)
            r5 = -3
            int r14 = r4.f9589a
            if (r14 == r5) goto Lb8
            r5 = -2
            long r8 = r4.f9590b
            r16 = r13
            long r12 = r4.f9591c
            if (r14 == r5) goto L99
            r4 = -1
            if (r14 == r4) goto L7a
            if (r14 != 0) goto L72
            long r3 = r1.f9608p
            long r3 = r12 - r3
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L67
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 > 0) goto L67
            int r4 = (int) r3
            r1.d(r4)
        L67:
            r3 = 0
            r0.f32c = r3
            r16.m()
            int r1 = c(r1, r12, r2)
            return r1
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L7a:
            r3.f9584e = r8
            r3.f9586g = r12
            long r4 = r3.f9583d
            long r6 = r3.f9585f
            long r10 = r3.f9582c
            long r14 = r3.f9581b
            r15 = r14
            r17 = r4
            r19 = r8
            r21 = r6
            r23 = r12
            r25 = r10
            long r4 = w0.C0896f.a(r15, r17, r19, r21, r23, r25)
            r3.f9587h = r4
            goto L6
        L99:
            r3.f9583d = r8
            r3.f9585f = r12
            long r4 = r3.f9584e
            long r6 = r3.f9586g
            long r10 = r3.f9582c
            long r14 = r3.f9581b
            r15 = r14
            r17 = r8
            r19 = r4
            r21 = r12
            r23 = r6
            r25 = r10
            long r4 = w0.C0896f.a(r15, r17, r19, r21, r23, r25)
            r3.f9587h = r4
            goto L6
        Lb8:
            r3 = r12
            r16 = r13
            r0.f32c = r3
            r16.m()
            int r1 = c(r1, r8, r2)
            return r1
        Lc5:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.c.b(w0.l, R.r):int");
    }

    public final void d(long j3) {
        C0896f c0896f = this.f32c;
        if (c0896f != null && c0896f.f9580a == j3) {
            return;
        }
        C0895e c0895e = this.f30a;
        this.f32c = new C0896f(j3, c0895e.f9574a.a(j3), c0895e.f9576c, c0895e.f9577d, c0895e.f9578e, c0895e.f9579f);
    }
}

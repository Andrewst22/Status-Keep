package R0;

import R.H;
import U.t;
import java.io.EOFException;
import w0.l;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f2035a;

    /* renamed from: b  reason: collision with root package name */
    public long f2036b;

    /* renamed from: c  reason: collision with root package name */
    public int f2037c;

    /* renamed from: d  reason: collision with root package name */
    public int f2038d;

    /* renamed from: e  reason: collision with root package name */
    public int f2039e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2040f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final t f2041g = new t(255);

    public final boolean a(l lVar, boolean z3) {
        boolean z4;
        boolean z5;
        this.f2035a = 0;
        this.f2036b = 0L;
        this.f2037c = 0;
        this.f2038d = 0;
        this.f2039e = 0;
        t tVar = this.f2041g;
        tVar.D(27);
        try {
            z4 = lVar.p(tVar.f2477a, 0, 27, z3);
        } catch (EOFException e2) {
            if (z3) {
                z4 = false;
            } else {
                throw e2;
            }
        }
        if (!z4 || tVar.w() != 1332176723) {
            return false;
        }
        if (tVar.u() != 0) {
            if (z3) {
                return false;
            }
            throw H.c("unsupported bit stream revision");
        }
        this.f2035a = tVar.u();
        this.f2036b = tVar.k();
        tVar.l();
        tVar.l();
        tVar.l();
        int u3 = tVar.u();
        this.f2037c = u3;
        this.f2038d = u3 + 27;
        tVar.D(u3);
        try {
            z5 = lVar.p(tVar.f2477a, 0, this.f2037c, z3);
        } catch (EOFException e3) {
            if (z3) {
                z5 = false;
            } else {
                throw e3;
            }
        }
        if (!z5) {
            return false;
        }
        for (int i3 = 0; i3 < this.f2037c; i3++) {
            int u4 = tVar.u();
            this.f2040f[i3] = u4;
            this.f2039e += u4;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r6 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r10.f9608p >= r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r10.k(1) == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(w0.l r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f9608p
            long r2 = r10.u()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            U.AbstractC0123a.e(r0)
            U.t r0 = r9.f2041g
            r1 = 4
            r0.D(r1)
        L18:
            r2 = -1
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 == 0) goto L27
            long r2 = r10.f9608p
            r7 = 4
            long r2 = r2 + r7
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 >= 0) goto L47
        L27:
            byte[] r2 = r0.f2477a
            boolean r2 = r10.p(r2, r4, r1, r5)     // Catch: java.io.EOFException -> L2e
            goto L30
        L2e:
            r2 = 0
        L30:
            if (r2 == 0) goto L47
            r0.G(r4)
            long r2 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L43
            r10.f9610r = r4
            return r5
        L43:
            r10.d(r5)
            goto L18
        L47:
            if (r6 == 0) goto L4f
            long r0 = r10.f9608p
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L57
        L4f:
            int r0 = r10.k(r5)
            r1 = -1
            if (r0 == r1) goto L57
            goto L47
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.f.b(w0.l, long):boolean");
    }
}

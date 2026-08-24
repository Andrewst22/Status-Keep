package o0;

import R.C0110m;
import R.C0112o;
import R.C0113p;
import R.InterfaceC0107j;
import U.AbstractC0123a;
import android.util.SparseArray;
import g0.C0271b;
import java.io.EOFException;
import n2.AbstractC0662e;
/* loaded from: classes.dex */
public class T implements w0.G {

    /* renamed from: A  reason: collision with root package name */
    public C0113p f8518A;

    /* renamed from: B  reason: collision with root package name */
    public C0113p f8519B;

    /* renamed from: C  reason: collision with root package name */
    public long f8520C;

    /* renamed from: E  reason: collision with root package name */
    public boolean f8522E;

    /* renamed from: F  reason: collision with root package name */
    public long f8523F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f8524G;

    /* renamed from: a  reason: collision with root package name */
    public final P f8525a;

    /* renamed from: d  reason: collision with root package name */
    public final d0.g f8528d;

    /* renamed from: e  reason: collision with root package name */
    public final d0.d f8529e;

    /* renamed from: f  reason: collision with root package name */
    public S f8530f;

    /* renamed from: g  reason: collision with root package name */
    public C0113p f8531g;

    /* renamed from: h  reason: collision with root package name */
    public C1.j f8532h;

    /* renamed from: p  reason: collision with root package name */
    public int f8540p;

    /* renamed from: q  reason: collision with root package name */
    public int f8541q;

    /* renamed from: r  reason: collision with root package name */
    public int f8542r;

    /* renamed from: s  reason: collision with root package name */
    public int f8543s;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8547w;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8549z;

    /* renamed from: b  reason: collision with root package name */
    public final g0.h f8526b = new Object();

    /* renamed from: i  reason: collision with root package name */
    public int f8533i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public long[] f8534j = new long[1000];

    /* renamed from: k  reason: collision with root package name */
    public long[] f8535k = new long[1000];

    /* renamed from: n  reason: collision with root package name */
    public long[] f8538n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f8537m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    public int[] f8536l = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    public w0.F[] f8539o = new w0.F[1000];

    /* renamed from: c  reason: collision with root package name */
    public final B0.b f8527c = new B0.b(new C0271b(4));

    /* renamed from: t  reason: collision with root package name */
    public long f8544t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public long f8545u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f8546v = Long.MIN_VALUE;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8548y = true;
    public boolean x = true;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8521D = true;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, g0.h] */
    public T(s0.e eVar, d0.g gVar, d0.d dVar) {
        this.f8528d = gVar;
        this.f8529e = dVar;
        this.f8525a = new P(eVar);
    }

    public final synchronized long A() {
        long j3;
        try {
            int s3 = s(this.f8543s);
            if (v()) {
                j3 = this.f8534j[s3];
            } else {
                j3 = this.f8520C;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j3;
    }

    public final int B(B1.a aVar, X.f fVar, int i3, boolean z3) {
        boolean z4;
        int i4;
        boolean z5 = false;
        if ((i3 & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        g0.h hVar = this.f8526b;
        synchronized (this) {
            try {
                fVar.f2935r = false;
                i4 = -3;
                if (!v()) {
                    if (!z3 && !this.f8547w) {
                        C0113p c0113p = this.f8519B;
                        if (c0113p == null || (!z4 && c0113p == this.f8531g)) {
                        }
                        z(c0113p, aVar);
                        i4 = -5;
                    }
                    fVar.f1529n = 4;
                    fVar.f2936s = Long.MIN_VALUE;
                    i4 = -4;
                } else {
                    C0113p c0113p2 = ((Q) this.f8527c.d(r())).f8516a;
                    if (!z4 && c0113p2 == this.f8531g) {
                        int s3 = s(this.f8543s);
                        if (!x(s3)) {
                            fVar.f2935r = true;
                        } else {
                            fVar.f1529n = this.f8537m[s3];
                            if (this.f8543s == this.f8540p - 1 && (z3 || this.f8547w)) {
                                fVar.a(536870912);
                            }
                            fVar.f2936s = this.f8538n[s3];
                            hVar.f5722a = this.f8536l[s3];
                            hVar.f5723b = this.f8535k[s3];
                            hVar.f5724c = this.f8539o[s3];
                            i4 = -4;
                        }
                    }
                    z(c0113p2, aVar);
                    i4 = -5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i4 == -4 && !fVar.c(4)) {
            if ((i3 & 1) != 0) {
                z5 = true;
            }
            if ((i3 & 4) == 0) {
                if (z5) {
                    P p3 = this.f8525a;
                    P.f(p3.f8513e, fVar, this.f8526b, p3.f8511c);
                } else {
                    P p4 = this.f8525a;
                    p4.f8513e = P.f(p4.f8513e, fVar, this.f8526b, p4.f8511c);
                }
            }
            if (!z5) {
                this.f8543s++;
            }
        }
        return i4;
    }

    public final void C() {
        D(true);
        C1.j jVar = this.f8532h;
        if (jVar != null) {
            jVar.N(this.f8529e);
            this.f8532h = null;
            this.f8531g = null;
        }
    }

    public final void D(boolean z3) {
        boolean z4;
        B0.b bVar;
        SparseArray sparseArray;
        P p3 = this.f8525a;
        p3.a(p3.f8512d);
        Q0.e eVar = p3.f8512d;
        int i3 = 0;
        if (((s0.a) eVar.f1541o) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.j(z4);
        eVar.f1539m = 0L;
        eVar.f1540n = p3.f8510b;
        Q0.e eVar2 = p3.f8512d;
        p3.f8513e = eVar2;
        p3.f8514f = eVar2;
        p3.f8515g = 0L;
        p3.f8509a.b();
        this.f8540p = 0;
        this.f8541q = 0;
        this.f8542r = 0;
        this.f8543s = 0;
        this.x = true;
        this.f8544t = Long.MIN_VALUE;
        this.f8545u = Long.MIN_VALUE;
        this.f8546v = Long.MIN_VALUE;
        this.f8547w = false;
        while (true) {
            bVar = this.f8527c;
            sparseArray = (SparseArray) bVar.f28o;
            if (i3 >= sparseArray.size()) {
                break;
            }
            ((C0271b) bVar.f29p).accept(sparseArray.valueAt(i3));
            i3++;
        }
        bVar.f27n = -1;
        sparseArray.clear();
        if (z3) {
            this.f8518A = null;
            this.f8519B = null;
            this.f8548y = true;
            this.f8521D = true;
        }
    }

    public final synchronized void E() {
        this.f8543s = 0;
        P p3 = this.f8525a;
        p3.f8513e = p3.f8512d;
    }

    public final synchronized boolean F(int i3) {
        E();
        int i4 = this.f8541q;
        if (i3 >= i4 && i3 <= this.f8540p + i4) {
            this.f8544t = Long.MIN_VALUE;
            this.f8543s = i3 - i4;
            return true;
        }
        return false;
    }

    public final synchronized boolean G(long j3, boolean z3) {
        int m3;
        try {
            E();
            int s3 = s(this.f8543s);
            if (v() && j3 >= this.f8538n[s3] && (j3 <= this.f8546v || z3)) {
                if (this.f8521D) {
                    int i3 = this.f8540p - this.f8543s;
                    m3 = 0;
                    while (true) {
                        if (m3 < i3) {
                            if (this.f8538n[s3] < j3) {
                                s3++;
                                if (s3 == this.f8533i) {
                                    s3 = 0;
                                }
                                m3++;
                            }
                        } else {
                            if (!z3) {
                                i3 = -1;
                            }
                            m3 = i3;
                        }
                    }
                } else {
                    m3 = m(s3, this.f8540p - this.f8543s, j3, true);
                }
                if (m3 == -1) {
                    return false;
                }
                this.f8544t = j3;
                this.f8543s += m3;
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized void H(int i3) {
        boolean z3;
        if (i3 >= 0) {
            try {
                if (this.f8543s + i3 <= this.f8540p) {
                    z3 = true;
                    AbstractC0123a.e(z3);
                    this.f8543s += i3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z3 = false;
        AbstractC0123a.e(z3);
        this.f8543s += i3;
    }

    @Override // w0.G
    public final void a(U.t tVar, int i3, int i4) {
        while (true) {
            P p3 = this.f8525a;
            if (i3 > 0) {
                int c3 = p3.c(i3);
                Q0.e eVar = p3.f8514f;
                s0.a aVar = (s0.a) eVar.f1541o;
                tVar.f(aVar.f9148a, ((int) (p3.f8515g - eVar.f1539m)) + aVar.f9149b, c3);
                i3 -= c3;
                long j3 = p3.f8515g + c3;
                p3.f8515g = j3;
                Q0.e eVar2 = p3.f8514f;
                if (j3 == eVar2.f1540n) {
                    p3.f8514f = (Q0.e) eVar2.f1542p;
                }
            } else {
                p3.getClass();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    @Override // w0.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r13, int r15, int r16, int r17, w0.F r18) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.T.b(long, int, int, int, w0.F):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
        if (r1 == 16) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    @Override // w0.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(R.C0113p r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.T.c(R.p):void");
    }

    @Override // w0.G
    public final int d(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        return e(interfaceC0107j, i3, z3);
    }

    @Override // w0.G
    public final int e(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        P p3 = this.f8525a;
        int c3 = p3.c(i3);
        Q0.e eVar = p3.f8514f;
        s0.a aVar = (s0.a) eVar.f1541o;
        int read = interfaceC0107j.read(aVar.f9148a, ((int) (p3.f8515g - eVar.f1539m)) + aVar.f9149b, c3);
        if (read == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = p3.f8515g + read;
        p3.f8515g = j3;
        Q0.e eVar2 = p3.f8514f;
        if (j3 == eVar2.f1540n) {
            p3.f8514f = (Q0.e) eVar2.f1542p;
            return read;
        }
        return read;
    }

    @Override // w0.G
    public final /* synthetic */ void f(int i3, U.t tVar) {
        AbstractC0662e.a(this, tVar, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        if (((o0.Q) r9.valueAt(r9.size() - 1)).f8516a.equals(r8.f8519B) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(long r9, int r11, long r12, int r14, w0.F r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.T.g(long, int, long, int, w0.F):void");
    }

    public final long h(int i3) {
        int i4;
        this.f8545u = Math.max(this.f8545u, q(i3));
        this.f8540p -= i3;
        int i5 = this.f8541q + i3;
        this.f8541q = i5;
        int i6 = this.f8542r + i3;
        this.f8542r = i6;
        int i7 = this.f8533i;
        if (i6 >= i7) {
            this.f8542r = i6 - i7;
        }
        int i8 = this.f8543s - i3;
        this.f8543s = i8;
        int i9 = 0;
        if (i8 < 0) {
            this.f8543s = 0;
        }
        while (true) {
            B0.b bVar = this.f8527c;
            SparseArray sparseArray = (SparseArray) bVar.f28o;
            if (i9 >= sparseArray.size() - 1) {
                break;
            }
            int i10 = i9 + 1;
            if (i5 < sparseArray.keyAt(i10)) {
                break;
            }
            ((C0271b) bVar.f29p).accept(sparseArray.valueAt(i9));
            sparseArray.removeAt(i9);
            int i11 = bVar.f27n;
            if (i11 > 0) {
                bVar.f27n = i11 - 1;
            }
            i9 = i10;
        }
        if (this.f8540p == 0) {
            int i12 = this.f8542r;
            if (i12 == 0) {
                i12 = this.f8533i;
            }
            return this.f8535k[i12 - 1] + this.f8536l[i4];
        }
        return this.f8535k[this.f8542r];
    }

    public final void i(long j3, boolean z3) {
        long j4;
        int i3;
        P p3 = this.f8525a;
        synchronized (this) {
            try {
                int i4 = this.f8540p;
                j4 = -1;
                if (i4 != 0) {
                    long[] jArr = this.f8538n;
                    int i5 = this.f8542r;
                    if (j3 >= jArr[i5]) {
                        if (z3 && (i3 = this.f8543s) != i4) {
                            i4 = i3 + 1;
                        }
                        int m3 = m(i5, i4, j3, false);
                        if (m3 != -1) {
                            j4 = h(m3);
                        }
                    }
                }
            } finally {
            }
        }
        p3.b(j4);
    }

    public final void j() {
        long h3;
        P p3 = this.f8525a;
        synchronized (this) {
            int i3 = this.f8540p;
            if (i3 == 0) {
                h3 = -1;
            } else {
                h3 = h(i3);
            }
        }
        p3.b(h3);
    }

    public final long k(int i3) {
        boolean z3;
        int i4;
        int s3;
        int i5 = this.f8541q;
        int i6 = this.f8540p;
        int i7 = (i5 + i6) - i3;
        boolean z4 = false;
        if (i7 >= 0 && i7 <= i6 - this.f8543s) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        int i8 = this.f8540p - i7;
        this.f8540p = i8;
        this.f8546v = Math.max(this.f8545u, q(i8));
        if (i7 == 0 && this.f8547w) {
            z4 = true;
        }
        this.f8547w = z4;
        B0.b bVar = this.f8527c;
        SparseArray sparseArray = (SparseArray) bVar.f28o;
        for (int size = sparseArray.size() - 1; size >= 0 && i3 < sparseArray.keyAt(size); size--) {
            ((C0271b) bVar.f29p).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i4 = Math.min(bVar.f27n, sparseArray.size() - 1);
        } else {
            i4 = -1;
        }
        bVar.f27n = i4;
        int i9 = this.f8540p;
        if (i9 != 0) {
            return this.f8535k[s(i9 - 1)] + this.f8536l[s3];
        }
        return 0L;
    }

    public final void l(int i3) {
        boolean z3;
        long k3 = k(i3);
        P p3 = this.f8525a;
        if (k3 <= p3.f8515g) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        p3.f8515g = k3;
        int i4 = p3.f8510b;
        if (k3 != 0) {
            Q0.e eVar = p3.f8512d;
            if (k3 != eVar.f1539m) {
                while (p3.f8515g > eVar.f1540n) {
                    eVar = (Q0.e) eVar.f1542p;
                }
                Q0.e eVar2 = (Q0.e) eVar.f1542p;
                eVar2.getClass();
                p3.a(eVar2);
                Q0.e eVar3 = new Q0.e(eVar.f1540n, i4);
                eVar.f1542p = eVar3;
                if (p3.f8515g == eVar.f1540n) {
                    eVar = eVar3;
                }
                p3.f8514f = eVar;
                if (p3.f8513e == eVar2) {
                    p3.f8513e = eVar3;
                    return;
                }
                return;
            }
        }
        p3.a(p3.f8512d);
        Q0.e eVar4 = new Q0.e(p3.f8515g, i4);
        p3.f8512d = eVar4;
        p3.f8513e = eVar4;
        p3.f8514f = eVar4;
    }

    public final int m(int i3, int i4, long j3, boolean z3) {
        int i5 = -1;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = (this.f8538n[i3] > j3 ? 1 : (this.f8538n[i3] == j3 ? 0 : -1));
            if (i7 > 0) {
                break;
            }
            if (!z3 || (this.f8537m[i3] & 1) != 0) {
                i5 = i6;
                if (i7 == 0) {
                    break;
                }
            }
            i3++;
            if (i3 == this.f8533i) {
                i3 = 0;
            }
        }
        return i5;
    }

    public C0113p n(C0113p c0113p) {
        if (this.f8523F != 0 && c0113p.f1979r != Long.MAX_VALUE) {
            C0112o a3 = c0113p.a();
            a3.f1942q = c0113p.f1979r + this.f8523F;
            return new C0113p(a3);
        }
        return c0113p;
    }

    public final synchronized long o() {
        return this.f8546v;
    }

    public final synchronized long p() {
        return Math.max(this.f8545u, q(this.f8543s));
    }

    public final long q(int i3) {
        long j3 = Long.MIN_VALUE;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int s3 = s(i3 - 1);
        for (int i4 = 0; i4 < i3; i4++) {
            j3 = Math.max(j3, this.f8538n[s3]);
            if ((this.f8537m[s3] & 1) != 0) {
                break;
            }
            s3--;
            if (s3 == -1) {
                s3 = this.f8533i - 1;
            }
        }
        return j3;
    }

    public final int r() {
        return this.f8541q + this.f8543s;
    }

    public final int s(int i3) {
        int i4 = this.f8542r + i3;
        int i5 = this.f8533i;
        if (i4 >= i5) {
            return i4 - i5;
        }
        return i4;
    }

    public final synchronized int t(long j3, boolean z3) {
        int s3 = s(this.f8543s);
        if (v() && j3 >= this.f8538n[s3]) {
            if (j3 > this.f8546v && z3) {
                return this.f8540p - this.f8543s;
            }
            int m3 = m(s3, this.f8540p - this.f8543s, j3, true);
            if (m3 == -1) {
                return 0;
            }
            return m3;
        }
        return 0;
    }

    public final synchronized C0113p u() {
        C0113p c0113p;
        if (this.f8548y) {
            c0113p = null;
        } else {
            c0113p = this.f8519B;
        }
        return c0113p;
    }

    public final boolean v() {
        if (this.f8543s != this.f8540p) {
            return true;
        }
        return false;
    }

    public final synchronized boolean w(boolean z3) {
        C0113p c0113p;
        boolean z4 = true;
        if (!v()) {
            if (!z3 && !this.f8547w && ((c0113p = this.f8519B) == null || c0113p == this.f8531g)) {
                z4 = false;
            }
            return z4;
        } else if (((Q) this.f8527c.d(r())).f8516a != this.f8531g) {
            return true;
        } else {
            return x(s(this.f8543s));
        }
    }

    public final boolean x(int i3) {
        C1.j jVar = this.f8532h;
        if (jVar != null && jVar.I() != 4) {
            if ((this.f8537m[i3] & 1073741824) == 0) {
                this.f8532h.getClass();
            }
            return false;
        }
        return true;
    }

    public final void y() {
        C1.j jVar = this.f8532h;
        if (jVar != null && jVar.I() == 1) {
            d0.b G3 = this.f8532h.G();
            G3.getClass();
            throw G3;
        }
    }

    public final void z(C0113p c0113p, B1.a aVar) {
        boolean z3;
        C0110m c0110m;
        C0113p c0113p2;
        C0113p c0113p3 = this.f8531g;
        if (c0113p3 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c0113p3 == null) {
            c0110m = null;
        } else {
            c0110m = c0113p3.f1978q;
        }
        this.f8531g = c0113p;
        C0110m c0110m2 = c0113p.f1978q;
        d0.g gVar = this.f8528d;
        if (gVar != null) {
            int c3 = gVar.c(c0113p);
            C0112o a3 = c0113p.a();
            a3.f1925I = c3;
            c0113p2 = new C0113p(a3);
        } else {
            c0113p2 = c0113p;
        }
        aVar.f51o = c0113p2;
        aVar.f50n = this.f8532h;
        if (gVar == null) {
            return;
        }
        if (!z3 && U.A.a(c0110m, c0110m2)) {
            return;
        }
        C1.j jVar = this.f8532h;
        d0.d dVar = this.f8529e;
        C1.j h3 = gVar.h(dVar, c0113p);
        this.f8532h = h3;
        aVar.f50n = h3;
        if (jVar != null) {
            jVar.N(dVar);
        }
    }
}

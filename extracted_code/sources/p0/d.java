package P0;

import C.C0002c;
import D1.I;
import D1.b0;
import R.E;
import R.F;
import U.A;
import U.t;
import b1.C0211a;
import java.io.EOFException;
import java.util.List;
import w0.G;
import w0.l;
import w0.n;
import w0.o;
import w0.p;
import w0.q;
import w0.v;
import w0.y;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: u  reason: collision with root package name */
    public static final C0002c f1432u = new C0002c(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f1433a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1434b;

    /* renamed from: c  reason: collision with root package name */
    public final t f1435c;

    /* renamed from: d  reason: collision with root package name */
    public final y f1436d;

    /* renamed from: e  reason: collision with root package name */
    public final v f1437e;

    /* renamed from: f  reason: collision with root package name */
    public final C0211a f1438f;

    /* renamed from: g  reason: collision with root package name */
    public final n f1439g;

    /* renamed from: h  reason: collision with root package name */
    public q f1440h;

    /* renamed from: i  reason: collision with root package name */
    public G f1441i;

    /* renamed from: j  reason: collision with root package name */
    public G f1442j;

    /* renamed from: k  reason: collision with root package name */
    public int f1443k;

    /* renamed from: l  reason: collision with root package name */
    public F f1444l;

    /* renamed from: m  reason: collision with root package name */
    public long f1445m;

    /* renamed from: n  reason: collision with root package name */
    public long f1446n;

    /* renamed from: o  reason: collision with root package name */
    public long f1447o;

    /* renamed from: p  reason: collision with root package name */
    public int f1448p;

    /* renamed from: q  reason: collision with root package name */
    public f f1449q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1450r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1451s;

    /* renamed from: t  reason: collision with root package name */
    public long f1452t;

    public d() {
        this(-9223372036854775807L);
    }

    public static long a(F f3) {
        if (f3 != null) {
            int length = f3.f1770m.length;
            for (int i3 = 0; i3 < length; i3++) {
                E e2 = f3.f1770m[i3];
                if (e2 instanceof K0.n) {
                    K0.n nVar = (K0.n) e2;
                    if (nVar.f721m.equals("TLEN")) {
                        return A.M(Long.parseLong((String) nVar.f734o.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        this.f1443k = 0;
        this.f1445m = -9223372036854775807L;
        this.f1446n = 0L;
        this.f1448p = 0;
        this.f1452t = j4;
        f fVar = this.f1449q;
        if ((fVar instanceof b) && !((b) fVar).b(j4)) {
            this.f1451s = true;
            this.f1442j = this.f1439g;
        }
    }

    public final boolean c(l lVar) {
        f fVar = this.f1449q;
        if (fVar != null) {
            long g3 = fVar.g();
            if (g3 != -1 && lVar.u() > g3 - 4) {
                return true;
            }
        }
        try {
            return !lVar.p(this.f1435c.f2477a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        return g((l) pVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r6 != 1231971951) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ed  */
    /* JADX WARN: Type inference failed for: r0v40, types: [w0.s] */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r51, R.r r52) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.d.f(w0.p, R.r):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (r19 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r18.d(r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
        r18.f9610r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
        r17.f1443k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(w0.l r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r3 = 0
            r1.f9610r = r3
            long r4 = r1.f9608p
            r6 = 0
            r8 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L3f
            int r4 = r0.f1433a
            r4 = r4 & 8
            if (r4 != 0) goto L20
            r4 = r8
            goto L22
        L20:
            C.c r4 = P0.d.f1432u
        L22:
            b1.a r5 = r0.f1438f
            R.F r4 = r5.a(r1, r4)
            r0.f1444l = r4
            if (r4 == 0) goto L31
            w0.v r5 = r0.f1437e
            r5.b(r4)
        L31:
            long r4 = r18.u()
            int r5 = (int) r4
            if (r19 != 0) goto L3b
            r1.d(r5)
        L3b:
            r4 = 0
        L3c:
            r6 = 0
            r7 = 0
            goto L42
        L3f:
            r4 = 0
            r5 = 0
            goto L3c
        L42:
            boolean r9 = r17.c(r18)
            r10 = 1
            if (r9 == 0) goto L52
            if (r6 <= 0) goto L4c
            goto L9f
        L4c:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L52:
            U.t r9 = r0.f1435c
            r9.G(r3)
            int r9 = r9.h()
            if (r4 == 0) goto L6b
            long r11 = (long) r4
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r9
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto L72
        L6b:
            int r11 = w0.AbstractC0892b.j(r9)
            r12 = -1
            if (r11 != r12) goto L91
        L72:
            int r4 = r7 + 1
            if (r7 != r2) goto L80
            if (r19 == 0) goto L79
            return r3
        L79:
            java.lang.String r1 = "Searched too many bytes."
            R.H r1 = R.H.a(r8, r1)
            throw r1
        L80:
            if (r19 == 0) goto L8a
            r1.f9610r = r3
            int r6 = r5 + r4
            r1.a(r6, r3)
            goto L8d
        L8a:
            r1.d(r10)
        L8d:
            r7 = r4
            r4 = 0
            r6 = 0
            goto L42
        L91:
            int r6 = r6 + 1
            if (r6 != r10) goto L9c
            w0.y r4 = r0.f1436d
            r4.a(r9)
            r4 = r9
            goto Lab
        L9c:
            r9 = 4
            if (r6 != r9) goto Lab
        L9f:
            if (r19 == 0) goto La6
            int r5 = r5 + r7
            r1.d(r5)
            goto La8
        La6:
            r1.f9610r = r3
        La8:
            r0.f1443k = r4
            return r10
        Lab:
            int r11 = r11 + (-4)
            r1.a(r11, r3)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.d.g(w0.l, boolean):boolean");
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f1440h = qVar;
        G w3 = qVar.w(0, 1);
        this.f1441i = w3;
        this.f1442j = w3;
        this.f1440h.s();
    }

    @Override // w0.o
    public final List l() {
        D1.G g3 = I.f197n;
        return b0.f231q;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [w0.y, java.lang.Object] */
    public d(long j3) {
        this.f1433a = 0;
        this.f1434b = j3;
        this.f1435c = new t(10);
        this.f1436d = new Object();
        this.f1437e = new v();
        this.f1445m = -9223372036854775807L;
        this.f1438f = new C0211a(1);
        n nVar = new n();
        this.f1439g = nVar;
        this.f1442j = nVar;
    }

    @Override // w0.o
    public final void release() {
    }
}

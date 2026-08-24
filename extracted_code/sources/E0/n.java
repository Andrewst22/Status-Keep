package e0;

import D1.G;
import D1.I;
import R.C0112o;
import R.C0113p;
import R.F;
import R.H;
import U.A;
import W.B;
import Y.O;
import Y.P;
import Y.l0;
import android.net.Uri;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o0.C0688l;
import o0.InterfaceC0698w;
import o0.InterfaceC0699x;
import o0.b0;
/* loaded from: classes.dex */
public final class n implements InterfaceC0699x, f0.q {

    /* renamed from: A  reason: collision with root package name */
    public final Z.m f5287A;

    /* renamed from: B  reason: collision with root package name */
    public final C0262c f5288B = new C0262c(this, 2);

    /* renamed from: C  reason: collision with root package name */
    public InterfaceC0698w f5289C;

    /* renamed from: D  reason: collision with root package name */
    public int f5290D;

    /* renamed from: E  reason: collision with root package name */
    public b0 f5291E;

    /* renamed from: F  reason: collision with root package name */
    public t[] f5292F;

    /* renamed from: G  reason: collision with root package name */
    public t[] f5293G;

    /* renamed from: H  reason: collision with root package name */
    public int f5294H;

    /* renamed from: I  reason: collision with root package name */
    public C0688l f5295I;

    /* renamed from: m  reason: collision with root package name */
    public final C0263d f5296m;

    /* renamed from: n  reason: collision with root package name */
    public final f0.c f5297n;

    /* renamed from: o  reason: collision with root package name */
    public final C0262c f5298o;

    /* renamed from: p  reason: collision with root package name */
    public final B f5299p;

    /* renamed from: q  reason: collision with root package name */
    public final d0.g f5300q;

    /* renamed from: r  reason: collision with root package name */
    public final d0.d f5301r;

    /* renamed from: s  reason: collision with root package name */
    public final l f5302s;

    /* renamed from: t  reason: collision with root package name */
    public final d0.d f5303t;

    /* renamed from: u  reason: collision with root package name */
    public final s0.e f5304u;

    /* renamed from: v  reason: collision with root package name */
    public final IdentityHashMap f5305v;

    /* renamed from: w  reason: collision with root package name */
    public final C0262c f5306w;
    public final l x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f5307y;

    /* renamed from: z  reason: collision with root package name */
    public final int f5308z;

    public n(C0263d c0263d, f0.c cVar, C0262c c0262c, B b3, d0.g gVar, d0.d dVar, l lVar, d0.d dVar2, s0.e eVar, l lVar2, boolean z3, int i3, Z.m mVar) {
        this.f5296m = c0263d;
        this.f5297n = cVar;
        this.f5298o = c0262c;
        this.f5299p = b3;
        this.f5300q = gVar;
        this.f5301r = dVar;
        this.f5302s = lVar;
        this.f5303t = dVar2;
        this.f5304u = eVar;
        this.x = lVar2;
        this.f5307y = z3;
        this.f5308z = i3;
        this.f5287A = mVar;
        lVar2.getClass();
        G g3 = I.f197n;
        D1.b0 b0Var = D1.b0.f231q;
        this.f5295I = new C0688l(b0Var, b0Var);
        this.f5305v = new IdentityHashMap();
        this.f5306w = new C0262c(3);
        this.f5292F = new t[0];
        this.f5293G = new t[0];
    }

    public static C0113p f(C0113p c0113p, C0113p c0113p2, boolean z3) {
        F f3;
        int i3;
        String str;
        String str2;
        int i4;
        int i5;
        String str3;
        I i6;
        int i7;
        G g3 = I.f197n;
        I i8 = D1.b0.f231q;
        int i9 = -1;
        if (c0113p2 != null) {
            str3 = c0113p2.f1971j;
            f3 = c0113p2.f1972k;
            i4 = c0113p2.f1951A;
            i3 = c0113p2.f1966e;
            i5 = c0113p2.f1967f;
            str = c0113p2.f1965d;
            str2 = c0113p2.f1963b;
            i6 = c0113p2.f1964c;
        } else {
            String v3 = A.v(c0113p.f1971j, 1);
            f3 = c0113p.f1972k;
            if (z3) {
                i4 = c0113p.f1951A;
                i3 = c0113p.f1966e;
                i5 = c0113p.f1967f;
                str = c0113p.f1965d;
                str2 = c0113p.f1963b;
                i8 = c0113p.f1964c;
            } else {
                i3 = 0;
                str = null;
                str2 = null;
                i4 = -1;
                i5 = 0;
            }
            I i10 = i8;
            str3 = v3;
            i6 = i10;
        }
        String c3 = R.G.c(str3);
        if (z3) {
            i7 = c0113p.f1968g;
        } else {
            i7 = -1;
        }
        if (z3) {
            i9 = c0113p.f1969h;
        }
        C0112o c0112o = new C0112o();
        c0112o.f1926a = c0113p.f1962a;
        c0112o.f1927b = str2;
        c0112o.f1928c = I.j(i6);
        c0112o.f1936k = R.G.l(c0113p.f1973l);
        c0112o.f1937l = R.G.l(c3);
        c0112o.f1934i = str3;
        c0112o.f1935j = f3;
        c0112o.f1932g = i7;
        c0112o.f1933h = i9;
        c0112o.f1950z = i4;
        c0112o.f1930e = i3;
        c0112o.f1931f = i5;
        c0112o.f1929d = str;
        return new C0113p(c0112o);
    }

    @Override // f0.q
    public final void a() {
        t[] tVarArr;
        for (t tVar : this.f5292F) {
            ArrayList arrayList = tVar.f5382z;
            if (!arrayList.isEmpty()) {
                m mVar = (m) D1.r.l(arrayList);
                int b3 = tVar.f5373p.b(mVar);
                if (b3 == 1) {
                    mVar.f5283W = true;
                } else if (b3 == 0) {
                    tVar.f5338D.post(new U.n(5, tVar, mVar));
                } else if (b3 == 2 && !tVar.f5365f0) {
                    s0.n nVar = tVar.f5379v;
                    if (nVar.d()) {
                        nVar.b();
                    }
                }
            }
        }
        this.f5289C.f(this);
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        f0.i iVar;
        long j4;
        t[] tVarArr = this.f5293G;
        int length = tVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            t tVar = tVarArr[i3];
            if (tVar.f5346M == 2) {
                j jVar = tVar.f5373p;
                int f3 = jVar.f5254q.f();
                Uri[] uriArr = jVar.f5242e;
                int length2 = uriArr.length;
                f0.c cVar = jVar.f5244g;
                if (f3 < length2 && f3 != -1) {
                    iVar = cVar.a(true, uriArr[jVar.f5254q.a()]);
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    I i4 = iVar.f5468r;
                    if (!i4.isEmpty() && iVar.f5493c) {
                        long j5 = iVar.f5458h - cVar.f5432z;
                        long j6 = j3 - j5;
                        int d3 = A.d(i4, Long.valueOf(j6), true);
                        long j7 = ((f0.f) i4.get(d3)).f5442q;
                        if (d3 != i4.size() - 1) {
                            j4 = ((f0.f) i4.get(d3 + 1)).f5442q;
                        } else {
                            j4 = j7;
                        }
                        return l0Var.a(j6, j7, j4) + j5;
                    }
                }
            } else {
                i3++;
            }
        }
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0053 A[SYNTHETIC] */
    @Override // f0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.net.Uri r17, B.b r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            e0.t[] r2 = r0.f5292F
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La4
            r8 = r2[r6]
            e0.j r9 = r8.f5373p
            android.net.Uri[] r10 = r9.f5242e
            boolean r11 = U.A.l(r10, r1)
            if (r11 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L9f
        L1d:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            r0.s r13 = r9.f5254q
            s0.h r13 = m2.AbstractC0635d.i(r13)
            e0.l r8 = r8.f5378u
            r8.getClass()
            r8 = r18
            d1.e r13 = e0.l.t(r13, r8)
            if (r13 == 0) goto L41
            int r14 = r13.f5183a
            r15 = 2
            if (r14 != r15) goto L41
            long r13 = r13.f5184b
            goto L42
        L3f:
            r8 = r18
        L41:
            r13 = r11
        L42:
            r15 = 0
        L43:
            int r5 = r10.length
            r4 = -1
            if (r15 >= r5) goto L53
            r5 = r10[r15]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L50
            goto L54
        L50:
            int r15 = r15 + 1
            goto L43
        L53:
            r15 = -1
        L54:
            if (r15 != r4) goto L59
        L56:
            r4 = 1
            r5 = 1
            goto L96
        L59:
            r0.s r5 = r9.f5254q
            int r5 = r5.u(r15)
            if (r5 != r4) goto L62
            goto L56
        L62:
            boolean r4 = r9.f5256s
            android.net.Uri r10 = r9.f5252o
            boolean r10 = r1.equals(r10)
            r4 = r4 | r10
            r9.f5256s = r4
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L94
            r0.s r4 = r9.f5254q
            boolean r4 = r4.r(r13, r5)
            if (r4 == 0) goto L91
            f0.c r4 = r9.f5244g
            java.util.HashMap r4 = r4.f5423p
            java.lang.Object r4 = r4.get(r1)
            f0.b r4 = (f0.b) r4
            if (r4 == 0) goto L8c
            boolean r4 = f0.b.a(r4, r13)
            r5 = 1
            r4 = r4 ^ r5
            goto L8e
        L8c:
            r5 = 1
            r4 = 0
        L8e:
            if (r4 == 0) goto L92
            goto L95
        L91:
            r5 = 1
        L92:
            r4 = 0
            goto L96
        L94:
            r5 = 1
        L95:
            r4 = 1
        L96:
            if (r4 == 0) goto L9e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9e
            r4 = 1
            goto L9f
        L9e:
            r4 = 0
        L9f:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La4:
            o0.w r1 = r0.f5289C
            r1.f(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n.c(android.net.Uri, B.b, boolean):boolean");
    }

    @Override // o0.W
    public final boolean d() {
        return this.f5295I.d();
    }

    public final t e(String str, int i3, Uri[] uriArr, C0113p[] c0113pArr, C0113p c0113p, List list, Map map, long j3) {
        j jVar = new j(this.f5296m, this.f5297n, uriArr, c0113pArr, this.f5298o, this.f5299p, this.f5306w, list, this.f5287A);
        d0.d dVar = this.f5303t;
        return new t(str, i3, this.f5288B, jVar, map, this.f5304u, j3, c0113p, this.f5300q, this.f5301r, this.f5302s, dVar, this.f5308z);
    }

    @Override // o0.InterfaceC0699x
    public final b0 g() {
        b0 b0Var = this.f5291E;
        b0Var.getClass();
        return b0Var;
    }

    @Override // o0.W
    public final boolean h(P p3) {
        t[] tVarArr;
        if (this.f5291E == null) {
            for (t tVar : this.f5292F) {
                if (!tVar.f5349P) {
                    O o3 = new O();
                    o3.f3147a = tVar.f5361b0;
                    tVar.h(new P(o3));
                }
            }
            return false;
        }
        return this.f5295I.h(p3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (r2[r7] == 1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // o0.InterfaceC0699x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(o0.InterfaceC0698w r27, long r28) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n.l(o0.w, long):void");
    }

    @Override // o0.W
    public final long m() {
        return this.f5295I.m();
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        t[] tVarArr;
        for (t tVar : this.f5292F) {
            tVar.E();
            if (tVar.f5365f0 && !tVar.f5349P) {
                throw H.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    @Override // o0.InterfaceC0699x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p(r0.s[] r37, boolean[] r38, o0.U[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n.p(r0.s[], boolean[], o0.U[], boolean[], long):long");
    }

    @Override // o0.InterfaceC0699x
    public final long q(long j3) {
        t[] tVarArr = this.f5293G;
        if (tVarArr.length > 0) {
            boolean H3 = tVarArr[0].H(j3, false);
            int i3 = 1;
            while (true) {
                t[] tVarArr2 = this.f5293G;
                if (i3 >= tVarArr2.length) {
                    break;
                }
                tVarArr2[i3].H(j3, H3);
                i3++;
            }
            if (H3) {
                ((SparseArray) this.f5306w.f5225n).clear();
            }
        }
        return j3;
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        t[] tVarArr;
        for (t tVar : this.f5293G) {
            if (tVar.f5348O && !tVar.C()) {
                int length = tVar.f5342H.length;
                for (int i3 = 0; i3 < length; i3++) {
                    tVar.f5342H[i3].i(j3, tVar.f5359Z[i3]);
                }
            }
        }
    }

    @Override // o0.W
    public final long t() {
        return this.f5295I.t();
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        return -9223372036854775807L;
    }

    @Override // o0.W
    public final void v(long j3) {
        this.f5295I.v(j3);
    }
}

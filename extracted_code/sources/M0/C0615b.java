package m0;

import D1.I;
import D1.r;
import R.C0112o;
import R.C0113p;
import R.G;
import R.U;
import W.B;
import W.h;
import Y.C0131b;
import Y.P;
import Y.l0;
import d0.d;
import d0.g;
import e0.l;
import g0.C0271b;
import java.util.AbstractList;
import java.util.ArrayList;
import o0.C0688l;
import o0.InterfaceC0698w;
import o0.InterfaceC0699x;
import o0.V;
import o0.W;
import o0.b0;
import p0.C0735h;
import r0.s;
import s0.e;
import s0.o;
/* renamed from: m0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615b implements InterfaceC0699x, V {

    /* renamed from: m  reason: collision with root package name */
    public final C0131b f8152m;

    /* renamed from: n  reason: collision with root package name */
    public final B f8153n;

    /* renamed from: o  reason: collision with root package name */
    public final o f8154o;

    /* renamed from: p  reason: collision with root package name */
    public final g f8155p;

    /* renamed from: q  reason: collision with root package name */
    public final d f8156q;

    /* renamed from: r  reason: collision with root package name */
    public final l f8157r;

    /* renamed from: s  reason: collision with root package name */
    public final d f8158s;

    /* renamed from: t  reason: collision with root package name */
    public final e f8159t;

    /* renamed from: u  reason: collision with root package name */
    public final b0 f8160u;

    /* renamed from: v  reason: collision with root package name */
    public final l f8161v;

    /* renamed from: w  reason: collision with root package name */
    public InterfaceC0698w f8162w;
    public n0.c x;

    /* renamed from: y  reason: collision with root package name */
    public C0735h[] f8163y;

    /* renamed from: z  reason: collision with root package name */
    public C0688l f8164z;

    public C0615b(n0.c cVar, C0131b c0131b, B b3, l lVar, g gVar, d dVar, l lVar2, d dVar2, o oVar, e eVar) {
        String str;
        this.x = cVar;
        this.f8152m = c0131b;
        this.f8153n = b3;
        this.f8154o = oVar;
        this.f8155p = gVar;
        this.f8156q = dVar;
        this.f8157r = lVar2;
        this.f8158s = dVar2;
        this.f8159t = eVar;
        this.f8161v = lVar;
        U[] uArr = new U[cVar.f8364f.length];
        int i3 = 0;
        while (true) {
            n0.b[] bVarArr = cVar.f8364f;
            if (i3 < bVarArr.length) {
                C0113p[] c0113pArr = bVarArr[i3].f8352j;
                C0113p[] c0113pArr2 = new C0113p[c0113pArr.length];
                for (int i4 = 0; i4 < c0113pArr.length; i4++) {
                    C0113p c0113p = c0113pArr[i4];
                    C0112o a3 = c0113p.a();
                    a3.f1925I = gVar.c(c0113p);
                    C0113p c0113p2 = new C0113p(a3);
                    if (c0131b.f3216a && ((B1.b) c0131b.f3218c).g(c0113p2)) {
                        C0112o a4 = c0113p2.a();
                        a4.f1937l = G.l("application/x-media3-cues");
                        a4.f1922F = ((B1.b) c0131b.f3218c).e(c0113p2);
                        StringBuilder sb = new StringBuilder();
                        sb.append(c0113p2.f1974m);
                        String str2 = c0113p2.f1971j;
                        if (str2 != null) {
                            str = " ".concat(str2);
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        a4.f1934i = sb.toString();
                        a4.f1942q = Long.MAX_VALUE;
                        c0113p2 = new C0113p(a4);
                    }
                    c0113pArr2[i4] = c0113p2;
                }
                uArr[i3] = new U(Integer.toString(i3), c0113pArr2);
                i3++;
            } else {
                this.f8160u = new b0(uArr);
                this.f8163y = new C0735h[0];
                lVar.getClass();
                D1.G g3 = I.f197n;
                D1.b0 b0Var = D1.b0.f231q;
                this.f8164z = new C0688l(b0Var, b0Var);
                return;
            }
        }
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        C0735h[] c0735hArr;
        for (C0735h c0735h : this.f8163y) {
            if (c0735h.f8801m == 2) {
                return c0735h.f8805q.b(j3, l0Var);
            }
        }
        return j3;
    }

    @Override // o0.W
    public final boolean d() {
        return this.f8164z.d();
    }

    @Override // o0.V
    public final void f(W w3) {
        InterfaceC0698w interfaceC0698w = this.f8162w;
        interfaceC0698w.getClass();
        interfaceC0698w.f(this);
    }

    @Override // o0.InterfaceC0699x
    public final b0 g() {
        return this.f8160u;
    }

    @Override // o0.W
    public final boolean h(P p3) {
        return this.f8164z.h(p3);
    }

    @Override // o0.InterfaceC0699x
    public final void l(InterfaceC0698w interfaceC0698w, long j3) {
        this.f8162w = interfaceC0698w;
        interfaceC0698w.j(this);
    }

    @Override // o0.W
    public final long m() {
        return this.f8164z.m();
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        this.f8154o.a();
    }

    @Override // o0.InterfaceC0699x
    public final long p(s[] sVarArr, boolean[] zArr, o0.U[] uArr, boolean[] zArr2, long j3) {
        int i3;
        s sVar;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < sVarArr.length) {
            o0.U u3 = uArr[i4];
            if (u3 != null) {
                C0735h c0735h = (C0735h) u3;
                s sVar2 = sVarArr[i4];
                if (sVar2 != null && zArr[i4]) {
                    ((C0614a) c0735h.f8805q).f8148e = sVar2;
                    arrayList.add(c0735h);
                } else {
                    c0735h.B(null);
                    uArr[i4] = null;
                }
            }
            if (uArr[i4] == null && (sVar = sVarArr[i4]) != null) {
                int b3 = this.f8160u.b(sVar.b());
                n0.c cVar = this.x;
                C0131b c0131b = this.f8152m;
                h a3 = ((W.g) c0131b.f3217b).a();
                B b4 = this.f8153n;
                if (b4 != null) {
                    a3.y(b4);
                }
                i3 = i4;
                C0735h c0735h2 = new C0735h(this.x.f8364f[b3].f8343a, null, null, new C0614a(this.f8154o, cVar, b3, sVar, a3, (B1.b) c0131b.f3218c, c0131b.f3216a), this, this.f8159t, j3, this.f8155p, this.f8156q, this.f8157r, this.f8158s);
                arrayList.add(c0735h2);
                uArr[i3] = c0735h2;
                zArr2[i3] = true;
            } else {
                i3 = i4;
            }
            i4 = i3 + 1;
        }
        C0735h[] c0735hArr = new C0735h[arrayList.size()];
        this.f8163y = c0735hArr;
        arrayList.toArray(c0735hArr);
        AbstractList w3 = r.w(arrayList, new C0271b(1));
        this.f8161v.getClass();
        this.f8164z = new C0688l(arrayList, w3);
        return j3;
    }

    @Override // o0.InterfaceC0699x
    public final long q(long j3) {
        for (C0735h c0735h : this.f8163y) {
            c0735h.C(j3);
        }
        return j3;
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        for (C0735h c0735h : this.f8163y) {
            c0735h.r(j3);
        }
    }

    @Override // o0.W
    public final long t() {
        return this.f8164z.t();
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        return -9223372036854775807L;
    }

    @Override // o0.W
    public final void v(long j3) {
        this.f8164z.v(j3);
    }
}

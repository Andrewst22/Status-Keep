package e0;

import D1.I;
import R.C0110m;
import R.C0112o;
import R.C0113p;
import R.F;
import R.G;
import R.U;
import U.A;
import U.AbstractC0123a;
import Y.C0131b;
import Y.O;
import Y.P;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import d1.C0255e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.AbstractC0635d;
import o0.C0678b;
import o0.S;
import o0.W;
import o0.b0;
import p0.AbstractC0732e;
import w0.InterfaceC0890A;
/* loaded from: classes.dex */
public final class t implements s0.i, s0.l, W, w0.q, S {

    /* renamed from: k0  reason: collision with root package name */
    public static final Set f5334k0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A  reason: collision with root package name */
    public final List f5335A;

    /* renamed from: B  reason: collision with root package name */
    public final q f5336B;

    /* renamed from: C  reason: collision with root package name */
    public final q f5337C;

    /* renamed from: D  reason: collision with root package name */
    public final Handler f5338D;

    /* renamed from: E  reason: collision with root package name */
    public final ArrayList f5339E;

    /* renamed from: F  reason: collision with root package name */
    public final Map f5340F;

    /* renamed from: G  reason: collision with root package name */
    public AbstractC0732e f5341G;

    /* renamed from: H  reason: collision with root package name */
    public s[] f5342H;

    /* renamed from: I  reason: collision with root package name */
    public int[] f5343I;

    /* renamed from: J  reason: collision with root package name */
    public final HashSet f5344J;

    /* renamed from: K  reason: collision with root package name */
    public final SparseIntArray f5345K;
    public r L;

    /* renamed from: M  reason: collision with root package name */
    public int f5346M;

    /* renamed from: N  reason: collision with root package name */
    public int f5347N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f5348O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f5349P;

    /* renamed from: Q  reason: collision with root package name */
    public int f5350Q;

    /* renamed from: R  reason: collision with root package name */
    public C0113p f5351R;

    /* renamed from: S  reason: collision with root package name */
    public C0113p f5352S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f5353T;

    /* renamed from: U  reason: collision with root package name */
    public b0 f5354U;

    /* renamed from: V  reason: collision with root package name */
    public Set f5355V;

    /* renamed from: W  reason: collision with root package name */
    public int[] f5356W;

    /* renamed from: X  reason: collision with root package name */
    public int f5357X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f5358Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean[] f5359Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean[] f5360a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f5361b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f5362c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f5363d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f5364e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f5365f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5366g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f5367h0;

    /* renamed from: i0  reason: collision with root package name */
    public C0110m f5368i0;

    /* renamed from: j0  reason: collision with root package name */
    public m f5369j0;

    /* renamed from: m  reason: collision with root package name */
    public final String f5370m;

    /* renamed from: n  reason: collision with root package name */
    public final int f5371n;

    /* renamed from: o  reason: collision with root package name */
    public final C0262c f5372o;

    /* renamed from: p  reason: collision with root package name */
    public final j f5373p;

    /* renamed from: q  reason: collision with root package name */
    public final s0.e f5374q;

    /* renamed from: r  reason: collision with root package name */
    public final C0113p f5375r;

    /* renamed from: s  reason: collision with root package name */
    public final d0.g f5376s;

    /* renamed from: t  reason: collision with root package name */
    public final d0.d f5377t;

    /* renamed from: u  reason: collision with root package name */
    public final l f5378u;

    /* renamed from: v  reason: collision with root package name */
    public final s0.n f5379v = new s0.n("Loader:HlsSampleStreamWrapper");

    /* renamed from: w  reason: collision with root package name */
    public final d0.d f5380w;
    public final int x;

    /* renamed from: y  reason: collision with root package name */
    public final C0131b f5381y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f5382z;

    /* JADX WARN: Type inference failed for: r1v12, types: [e0.q] */
    /* JADX WARN: Type inference failed for: r1v13, types: [e0.q] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, Y.b] */
    public t(String str, int i3, C0262c c0262c, j jVar, Map map, s0.e eVar, long j3, C0113p c0113p, d0.g gVar, d0.d dVar, l lVar, d0.d dVar2, int i4) {
        this.f5370m = str;
        this.f5371n = i3;
        this.f5372o = c0262c;
        this.f5373p = jVar;
        this.f5340F = map;
        this.f5374q = eVar;
        this.f5375r = c0113p;
        this.f5376s = gVar;
        this.f5377t = dVar;
        this.f5378u = lVar;
        this.f5380w = dVar2;
        this.x = i4;
        ?? obj = new Object();
        obj.f3217b = null;
        obj.f3216a = false;
        obj.f3218c = null;
        this.f5381y = obj;
        this.f5343I = new int[0];
        Set set = f5334k0;
        this.f5344J = new HashSet(set.size());
        this.f5345K = new SparseIntArray(set.size());
        this.f5342H = new s[0];
        this.f5360a0 = new boolean[0];
        this.f5359Z = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f5382z = arrayList;
        this.f5335A = Collections.unmodifiableList(arrayList);
        this.f5339E = new ArrayList();
        this.f5336B = new Runnable(this) { // from class: e0.q

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ t f5324n;

            {
                this.f5324n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5324n.D();
                        return;
                    default:
                        t tVar = this.f5324n;
                        tVar.f5348O = true;
                        tVar.D();
                        return;
                }
            }
        };
        this.f5337C = new Runnable(this) { // from class: e0.q

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ t f5324n;

            {
                this.f5324n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5324n.D();
                        return;
                    default:
                        t tVar = this.f5324n;
                        tVar.f5348O = true;
                        tVar.D();
                        return;
                }
            }
        };
        this.f5338D = A.n(null);
        this.f5361b0 = j3;
        this.f5362c0 = j3;
    }

    public static int B(int i3) {
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 == 3) {
            return 1;
        }
        return 0;
    }

    public static w0.n i(int i3, int i4) {
        AbstractC0123a.A("HlsSampleStreamWrapper", "Unmapped track with id " + i3 + " of type " + i4);
        return new w0.n();
    }

    public static C0113p y(C0113p c0113p, C0113p c0113p2, boolean z3) {
        String str;
        String str2;
        int i3;
        int i4;
        if (c0113p == null) {
            return c0113p2;
        }
        String str3 = c0113p2.f1974m;
        int g3 = G.g(str3);
        String str4 = c0113p.f1971j;
        if (A.u(str4, g3) == 1) {
            str2 = A.v(str4, g3);
            str = G.c(str2);
        } else {
            String a3 = G.a(str4, str3);
            str = str3;
            str2 = a3;
        }
        C0112o a4 = c0113p2.a();
        a4.f1926a = c0113p.f1962a;
        a4.f1927b = c0113p.f1963b;
        a4.f1928c = I.j(c0113p.f1964c);
        a4.f1929d = c0113p.f1965d;
        a4.f1930e = c0113p.f1966e;
        a4.f1931f = c0113p.f1967f;
        if (z3) {
            i3 = c0113p.f1968g;
        } else {
            i3 = -1;
        }
        a4.f1932g = i3;
        if (z3) {
            i4 = c0113p.f1969h;
        } else {
            i4 = -1;
        }
        a4.f1933h = i4;
        a4.f1934i = str2;
        if (g3 == 2) {
            a4.f1943r = c0113p.f1980s;
            a4.f1944s = c0113p.f1981t;
            a4.f1945t = c0113p.f1982u;
        }
        if (str != null) {
            a4.g(str);
        }
        int i5 = c0113p.f1951A;
        if (i5 != -1 && g3 == 1) {
            a4.f1950z = i5;
        }
        F f3 = c0113p.f1972k;
        if (f3 != null) {
            F f4 = c0113p2.f1972k;
            if (f4 != null) {
                f3 = f4.e(f3);
            }
            a4.f1935j = f3;
        }
        return new C0113p(a4);
    }

    public final m A() {
        ArrayList arrayList = this.f5382z;
        return (m) arrayList.get(arrayList.size() - 1);
    }

    public final boolean C() {
        if (this.f5362c0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void D() {
        boolean z3;
        C0113p y3;
        if (!this.f5353T && this.f5356W == null && this.f5348O) {
            for (s sVar : this.f5342H) {
                if (sVar.u() == null) {
                    return;
                }
            }
            b0 b0Var = this.f5354U;
            if (b0Var != null) {
                int i3 = b0Var.f8579a;
                int[] iArr = new int[i3];
                this.f5356W = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        s[] sVarArr = this.f5342H;
                        if (i5 < sVarArr.length) {
                            C0113p u3 = sVarArr[i5].u();
                            AbstractC0123a.k(u3);
                            C0113p c0113p = this.f5354U.a(i4).f1824d[0];
                            String str = c0113p.f1974m;
                            String str2 = u3.f1974m;
                            int g3 = G.g(str2);
                            if (g3 != 3) {
                                if (g3 == G.g(str)) {
                                    break;
                                }
                                i5++;
                            } else {
                                if (!A.a(str2, str)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || u3.f1956F == c0113p.f1956F) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    this.f5356W[i4] = i5;
                }
                Iterator it = this.f5339E.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).b();
                }
                return;
            }
            int length = this.f5342H.length;
            int i6 = 0;
            int i7 = -2;
            int i8 = -1;
            while (true) {
                int i9 = 2;
                if (i6 >= length) {
                    break;
                }
                C0113p u4 = this.f5342H[i6].u();
                AbstractC0123a.k(u4);
                String str3 = u4.f1974m;
                if (!G.k(str3)) {
                    if (G.h(str3)) {
                        i9 = 1;
                    } else if (G.j(str3)) {
                        i9 = 3;
                    } else {
                        i9 = -2;
                    }
                }
                if (B(i9) > B(i7)) {
                    i8 = i6;
                    i7 = i9;
                } else if (i9 == i7 && i8 != -1) {
                    i8 = -1;
                }
                i6++;
            }
            U u5 = this.f5373p.f5245h;
            int i10 = u5.f1821a;
            this.f5357X = -1;
            this.f5356W = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.f5356W[i11] = i11;
            }
            U[] uArr = new U[length];
            for (int i12 = 0; i12 < length; i12++) {
                C0113p u6 = this.f5342H[i12].u();
                AbstractC0123a.k(u6);
                String str4 = this.f5370m;
                C0113p c0113p2 = this.f5375r;
                if (i12 == i8) {
                    C0113p[] c0113pArr = new C0113p[i10];
                    for (int i13 = 0; i13 < i10; i13++) {
                        C0113p c0113p3 = u5.f1824d[i13];
                        if (i7 == 1 && c0113p2 != null) {
                            c0113p3 = c0113p3.d(c0113p2);
                        }
                        if (i10 == 1) {
                            y3 = u6.d(c0113p3);
                        } else {
                            y3 = y(c0113p3, u6, true);
                        }
                        c0113pArr[i13] = y3;
                    }
                    uArr[i12] = new U(str4, c0113pArr);
                    this.f5357X = i12;
                } else {
                    c0113p2 = (i7 == 2 && G.h(u6.f1974m)) ? null : null;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i12 < i8 ? i12 : i12 - 1);
                    uArr[i12] = new U(sb.toString(), y(c0113p2, u6, false));
                }
            }
            this.f5354U = x(uArr);
            if (this.f5355V == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.j(z3);
            this.f5355V = Collections.emptySet();
            this.f5349P = true;
            this.f5372o.s();
        }
    }

    public final void E() {
        this.f5379v.a();
        j jVar = this.f5373p;
        C0678b c0678b = jVar.f5251n;
        if (c0678b == null) {
            Uri uri = jVar.f5252o;
            if (uri != null && jVar.f5256s) {
                f0.b bVar = (f0.b) jVar.f5244g.f5423p.get(uri);
                bVar.f5409n.a();
                IOException iOException = bVar.f5417v;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw c0678b;
    }

    public final void F(U[] uArr, int... iArr) {
        this.f5354U = x(uArr);
        this.f5355V = new HashSet();
        for (int i3 : iArr) {
            this.f5355V.add(this.f5354U.a(i3));
        }
        this.f5357X = 0;
        this.f5338D.post(new Z.d(this.f5372o, 4));
        this.f5349P = true;
    }

    public final void G() {
        for (s sVar : this.f5342H) {
            sVar.D(this.f5363d0);
        }
        this.f5363d0 = false;
    }

    public final boolean H(long j3, boolean z3) {
        m mVar;
        boolean z4;
        boolean G3;
        this.f5361b0 = j3;
        if (C()) {
            this.f5362c0 = j3;
            return true;
        }
        boolean z5 = this.f5373p.f5253p;
        ArrayList arrayList = this.f5382z;
        if (z5) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                mVar = (m) arrayList.get(i3);
                if (mVar.f8784s == j3) {
                    break;
                }
            }
        }
        mVar = null;
        if (this.f5348O && !z3) {
            int length = this.f5342H.length;
            for (int i4 = 0; i4 < length; i4++) {
                s sVar = this.f5342H[i4];
                if (mVar != null) {
                    G3 = sVar.F(mVar.g(i4));
                } else {
                    G3 = sVar.G(j3, false);
                }
                if (!G3 && (this.f5360a0[i4] || !this.f5358Y)) {
                    z4 = false;
                    break;
                }
            }
            z4 = true;
            if (z4) {
                return false;
            }
        }
        this.f5362c0 = j3;
        this.f5365f0 = false;
        arrayList.clear();
        s0.n nVar = this.f5379v;
        if (nVar.d()) {
            if (this.f5348O) {
                for (s sVar2 : this.f5342H) {
                    sVar2.j();
                }
            }
            nVar.b();
        } else {
            nVar.f9203o = null;
            G();
        }
        return true;
    }

    @Override // o0.S
    public final void a() {
        this.f5338D.post(this.f5336B);
    }

    @Override // s0.i
    public final C0255e c(s0.k kVar, long j3, long j4, IOException iOException, int i3) {
        boolean z3;
        C0255e c0255e;
        C0255e c0255e2;
        int i4;
        AbstractC0732e abstractC0732e = (AbstractC0732e) kVar;
        boolean z4 = abstractC0732e instanceof m;
        if (z4 && !((m) abstractC0732e).f5283W && (iOException instanceof W.w) && ((i4 = ((W.w) iOException).f2804p) == 410 || i4 == 404)) {
            return s0.n.f9198p;
        }
        long j5 = abstractC0732e.f8786u.f2723n;
        Uri uri = abstractC0732e.f8786u.f2724o;
        o0.r rVar = new o0.r(j4);
        A.Z(abstractC0732e.f8784s);
        A.Z(abstractC0732e.f8785t);
        B.b bVar = new B.b(iOException, i3);
        j jVar = this.f5373p;
        s0.h i5 = AbstractC0635d.i(jVar.f5254q);
        this.f5378u.getClass();
        C0255e t3 = l.t(i5, bVar);
        boolean z5 = false;
        if (t3 != null && t3.f5183a == 2) {
            r0.s sVar = jVar.f5254q;
            z3 = sVar.r(t3.f5184b, sVar.u(jVar.f5245h.b(abstractC0732e.f8781p)));
        } else {
            z3 = false;
        }
        if (z3) {
            if (z4 && j5 == 0) {
                ArrayList arrayList = this.f5382z;
                if (((m) arrayList.remove(arrayList.size() - 1)) == abstractC0732e) {
                    z5 = true;
                }
                AbstractC0123a.j(z5);
                if (arrayList.isEmpty()) {
                    this.f5362c0 = this.f5361b0;
                } else {
                    ((m) D1.r.l(arrayList)).f5282V = true;
                }
            }
            c0255e2 = s0.n.f9199q;
        } else {
            long v3 = l.v(bVar);
            if (v3 != -9223372036854775807L) {
                c0255e = new C0255e(0, v3, false);
            } else {
                c0255e = s0.n.f9200r;
            }
            c0255e2 = c0255e;
        }
        boolean a3 = c0255e2.a();
        this.f5380w.h(rVar, abstractC0732e.f8780o, this.f5371n, abstractC0732e.f8781p, abstractC0732e.f8782q, abstractC0732e.f8783r, abstractC0732e.f8784s, abstractC0732e.f8785t, iOException, !a3);
        if (!a3) {
            this.f5341G = null;
        }
        if (z3) {
            if (!this.f5349P) {
                O o3 = new O();
                o3.f3147a = this.f5361b0;
                h(new P(o3));
            } else {
                this.f5372o.f(this);
            }
        }
        return c0255e2;
    }

    @Override // o0.W
    public final boolean d() {
        return this.f5379v.d();
    }

    @Override // s0.i
    public final void e(s0.k kVar, long j3, long j4, boolean z3) {
        AbstractC0732e abstractC0732e = (AbstractC0732e) kVar;
        this.f5341G = null;
        long j5 = abstractC0732e.f8778m;
        Uri uri = abstractC0732e.f8786u.f2724o;
        o0.r rVar = new o0.r(j4);
        this.f5378u.getClass();
        this.f5380w.c(rVar, abstractC0732e.f8780o, this.f5371n, abstractC0732e.f8781p, abstractC0732e.f8782q, abstractC0732e.f8783r, abstractC0732e.f8784s, abstractC0732e.f8785t);
        if (!z3) {
            if (C() || this.f5350Q == 0) {
                G();
            }
            if (this.f5350Q > 0) {
                this.f5372o.f(this);
            }
        }
    }

    public final void f() {
        AbstractC0123a.j(this.f5349P);
        this.f5354U.getClass();
        this.f5355V.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Type inference failed for: r1v25, types: [o0.b, java.io.IOException] */
    @Override // o0.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(Y.P r58) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.t.h(Y.P):boolean");
    }

    @Override // s0.i
    public final void j(s0.k kVar, long j3, long j4) {
        AbstractC0732e abstractC0732e = (AbstractC0732e) kVar;
        this.f5341G = null;
        j jVar = this.f5373p;
        if (abstractC0732e instanceof f) {
            f fVar = (f) abstractC0732e;
            jVar.f5250m = fVar.f5229v;
            Uri uri = fVar.f8779n.f2767a;
            byte[] bArr = fVar.x;
            bArr.getClass();
            C0262c c0262c = jVar.f5247j;
            c0262c.getClass();
            uri.getClass();
            byte[] bArr2 = (byte[]) ((C0264e) c0262c.f5225n).put(uri, bArr);
        }
        long j5 = abstractC0732e.f8778m;
        Uri uri2 = abstractC0732e.f8786u.f2724o;
        o0.r rVar = new o0.r(j4);
        this.f5378u.getClass();
        this.f5380w.f(rVar, abstractC0732e.f8780o, this.f5371n, abstractC0732e.f8781p, abstractC0732e.f8782q, abstractC0732e.f8783r, abstractC0732e.f8784s, abstractC0732e.f8785t);
        if (!this.f5349P) {
            O o3 = new O();
            o3.f3147a = this.f5361b0;
            h(new P(o3));
            return;
        }
        this.f5372o.f(this);
    }

    @Override // s0.l
    public final void k() {
        for (s sVar : this.f5342H) {
            sVar.C();
        }
    }

    @Override // o0.W
    public final long m() {
        if (this.f5365f0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f5362c0;
        }
        long j3 = this.f5361b0;
        m A3 = A();
        if (!A3.f5280T) {
            ArrayList arrayList = this.f5382z;
            if (arrayList.size() > 1) {
                A3 = (m) arrayList.get(arrayList.size() - 2);
            } else {
                A3 = null;
            }
        }
        if (A3 != null) {
            j3 = Math.max(j3, A3.f8785t);
        }
        if (this.f5348O) {
            for (s sVar : this.f5342H) {
                j3 = Math.max(j3, sVar.o());
            }
        }
        return j3;
    }

    @Override // w0.q
    public final void s() {
        this.f5366g0 = true;
        this.f5338D.post(this.f5337C);
    }

    @Override // o0.W
    public final long t() {
        if (C()) {
            return this.f5362c0;
        }
        if (this.f5365f0) {
            return Long.MIN_VALUE;
        }
        return A().f8785t;
    }

    @Override // o0.W
    public final void v(long j3) {
        int size;
        boolean q3;
        s0.n nVar = this.f5379v;
        if (!nVar.c() && !C()) {
            boolean d3 = nVar.d();
            j jVar = this.f5373p;
            List list = this.f5335A;
            if (d3) {
                this.f5341G.getClass();
                AbstractC0732e abstractC0732e = this.f5341G;
                if (jVar.f5251n != null) {
                    q3 = false;
                } else {
                    q3 = jVar.f5254q.q(j3, abstractC0732e, list);
                }
                if (q3) {
                    nVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && jVar.b((m) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                z(size2);
            }
            if (jVar.f5251n == null && jVar.f5254q.length() >= 2) {
                size = jVar.f5254q.n(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.f5382z.size()) {
                z(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [w0.n] */
    @Override // w0.q
    public final w0.G w(int i3, int i4) {
        m mVar;
        s sVar;
        Integer valueOf = Integer.valueOf(i4);
        Set set = f5334k0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f5344J;
        SparseIntArray sparseIntArray = this.f5345K;
        boolean z3 = false;
        s sVar2 = null;
        if (contains) {
            AbstractC0123a.e(set.contains(Integer.valueOf(i4)));
            int i5 = sparseIntArray.get(i4, -1);
            if (i5 != -1) {
                if (hashSet.add(Integer.valueOf(i4))) {
                    this.f5343I[i5] = i3;
                }
                if (this.f5343I[i5] == i3) {
                    sVar = this.f5342H[i5];
                } else {
                    sVar = i(i3, i4);
                }
                sVar2 = sVar;
            }
        } else {
            int i6 = 0;
            while (true) {
                s[] sVarArr = this.f5342H;
                if (i6 >= sVarArr.length) {
                    break;
                } else if (this.f5343I[i6] == i3) {
                    sVar2 = sVarArr[i6];
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (sVar2 == null) {
            if (this.f5366g0) {
                return i(i3, i4);
            }
            int length = this.f5342H.length;
            z3 = (i4 == 1 || i4 == 2) ? true : true;
            sVar2 = new s(this.f5374q, this.f5376s, this.f5377t, this.f5340F);
            sVar2.f8544t = this.f5361b0;
            if (z3) {
                sVar2.f5333I = this.f5368i0;
                sVar2.f8549z = true;
            }
            long j3 = this.f5367h0;
            if (sVar2.f8523F != j3) {
                sVar2.f8523F = j3;
                sVar2.f8549z = true;
            }
            if (this.f5369j0 != null) {
                sVar2.f8520C = mVar.f5284w;
            }
            sVar2.f8530f = this;
            int i7 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f5343I, i7);
            this.f5343I = copyOf;
            copyOf[length] = i3;
            s[] sVarArr2 = this.f5342H;
            int i8 = A.f2405a;
            Object[] copyOf2 = Arrays.copyOf(sVarArr2, sVarArr2.length + 1);
            copyOf2[sVarArr2.length] = sVar2;
            this.f5342H = (s[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f5360a0, i7);
            this.f5360a0 = copyOf3;
            copyOf3[length] = z3;
            this.f5358Y |= z3;
            hashSet.add(Integer.valueOf(i4));
            sparseIntArray.append(i4, length);
            if (B(i4) > B(this.f5346M)) {
                this.f5347N = length;
                this.f5346M = i4;
            }
            this.f5359Z = Arrays.copyOf(this.f5359Z, i7);
        }
        if (i4 == 5) {
            if (this.L == null) {
                this.L = new r(sVar2, this.x);
            }
            return this.L;
        }
        return sVar2;
    }

    public final b0 x(U[] uArr) {
        for (int i3 = 0; i3 < uArr.length; i3++) {
            U u3 = uArr[i3];
            C0113p[] c0113pArr = new C0113p[u3.f1821a];
            for (int i4 = 0; i4 < u3.f1821a; i4++) {
                C0113p c0113p = u3.f1824d[i4];
                int c3 = this.f5376s.c(c0113p);
                C0112o a3 = c0113p.a();
                a3.f1925I = c3;
                c0113pArr[i4] = new C0113p(a3);
            }
            uArr[i3] = new U(u3.f1822b, c0113pArr);
        }
        return new b0(uArr);
    }

    public final void z(int i3) {
        ArrayList arrayList;
        AbstractC0123a.j(!this.f5379v.d());
        int i4 = i3;
        loop0: while (true) {
            arrayList = this.f5382z;
            if (i4 < arrayList.size()) {
                int i5 = i4;
                while (true) {
                    if (i5 < arrayList.size()) {
                        if (((m) arrayList.get(i5)).f5286z) {
                            break;
                        }
                        i5++;
                    } else {
                        m mVar = (m) arrayList.get(i4);
                        for (int i6 = 0; i6 < this.f5342H.length; i6++) {
                            if (this.f5342H[i6].r() > mVar.g(i6)) {
                                break;
                            }
                        }
                        break loop0;
                    }
                }
            } else {
                i4 = -1;
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            return;
        }
        long j3 = A().f8785t;
        m mVar2 = (m) arrayList.get(i4);
        A.R(arrayList, i4, arrayList.size());
        for (int i7 = 0; i7 < this.f5342H.length; i7++) {
            this.f5342H[i7].l(mVar2.g(i7));
        }
        if (arrayList.isEmpty()) {
            this.f5362c0 = this.f5361b0;
        } else {
            ((m) D1.r.l(arrayList)).f5282V = true;
        }
        this.f5365f0 = false;
        this.f5380w.m(new l0.g(1, this.f5346M, null, 3, null, A.Z(mVar2.f8784s), A.Z(j3)));
    }

    @Override // w0.q
    public final void n(InterfaceC0890A interfaceC0890A) {
    }
}

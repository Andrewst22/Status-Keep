package e0;

import D1.G;
import D1.I;
import D1.b0;
import R.C0110m;
import R.C0112o;
import R.C0113p;
import R.E;
import R.F;
import U.A;
import U.AbstractC0123a;
import U.y;
import a.AbstractC0155a;
import android.net.Uri;
import android.text.TextUtils;
import c1.C0230D;
import c1.C0234a;
import c1.C0236c;
import c1.C0237d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class m extends p0.l {

    /* renamed from: X  reason: collision with root package name */
    public static final AtomicInteger f5261X = new AtomicInteger();

    /* renamed from: A  reason: collision with root package name */
    public final int f5262A;

    /* renamed from: B  reason: collision with root package name */
    public final W.h f5263B;

    /* renamed from: C  reason: collision with root package name */
    public final W.l f5264C;

    /* renamed from: D  reason: collision with root package name */
    public final C0261b f5265D;

    /* renamed from: E  reason: collision with root package name */
    public final boolean f5266E;

    /* renamed from: F  reason: collision with root package name */
    public final boolean f5267F;

    /* renamed from: G  reason: collision with root package name */
    public final y f5268G;

    /* renamed from: H  reason: collision with root package name */
    public final C0263d f5269H;

    /* renamed from: I  reason: collision with root package name */
    public final List f5270I;

    /* renamed from: J  reason: collision with root package name */
    public final C0110m f5271J;

    /* renamed from: K  reason: collision with root package name */
    public final K0.h f5272K;
    public final U.t L;

    /* renamed from: M  reason: collision with root package name */
    public final boolean f5273M;

    /* renamed from: N  reason: collision with root package name */
    public final boolean f5274N;

    /* renamed from: O  reason: collision with root package name */
    public C0261b f5275O;

    /* renamed from: P  reason: collision with root package name */
    public t f5276P;

    /* renamed from: Q  reason: collision with root package name */
    public int f5277Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f5278R;

    /* renamed from: S  reason: collision with root package name */
    public volatile boolean f5279S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f5280T;

    /* renamed from: U  reason: collision with root package name */
    public b0 f5281U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f5282V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f5283W;

    /* renamed from: w  reason: collision with root package name */
    public final int f5284w;
    public final int x;

    /* renamed from: y  reason: collision with root package name */
    public final Uri f5285y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f5286z;

    public m(C0263d c0263d, W.h hVar, W.l lVar, C0113p c0113p, boolean z3, W.h hVar2, W.l lVar2, boolean z4, Uri uri, List list, int i3, Object obj, long j3, long j4, long j5, int i4, boolean z5, int i5, boolean z6, boolean z7, y yVar, C0110m c0110m, C0261b c0261b, K0.h hVar3, U.t tVar, boolean z8, Z.m mVar) {
        super(hVar, lVar, c0113p, i3, obj, j3, j4, j5);
        this.f5273M = z3;
        this.f5262A = i4;
        this.f5283W = z5;
        this.x = i5;
        this.f5264C = lVar2;
        this.f5263B = hVar2;
        this.f5278R = lVar2 != null;
        this.f5274N = z4;
        this.f5285y = uri;
        this.f5266E = z7;
        this.f5268G = yVar;
        this.f5267F = z6;
        this.f5269H = c0263d;
        this.f5270I = list;
        this.f5271J = c0110m;
        this.f5265D = c0261b;
        this.f5272K = hVar3;
        this.L = tVar;
        this.f5286z = z8;
        G g3 = I.f197n;
        this.f5281U = b0.f231q;
        this.f5284w = f5261X.getAndIncrement();
    }

    public static byte[] f(String str) {
        int i3;
        if (AbstractC0155a.L(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i3 = byteArray.length - 16;
        } else {
            i3 = 0;
        }
        System.arraycopy(byteArray, i3, bArr, (16 - byteArray.length) + i3, byteArray.length - i3);
        return bArr;
    }

    @Override // s0.k
    public final void b() {
        C0261b c0261b;
        this.f5276P.getClass();
        if (this.f5275O == null && (c0261b = this.f5265D) != null) {
            w0.o d3 = c0261b.f5219a.d();
            if ((d3 instanceof C0230D) || (d3 instanceof Q0.n)) {
                this.f5275O = this.f5265D;
                this.f5278R = false;
            }
        }
        if (this.f5278R) {
            W.h hVar = this.f5263B;
            hVar.getClass();
            W.l lVar = this.f5264C;
            lVar.getClass();
            e(hVar, lVar, this.f5274N, false);
            this.f5277Q = 0;
            this.f5278R = false;
        }
        if (!this.f5279S) {
            if (!this.f5267F) {
                e(this.f8786u, this.f8779n, this.f5273M, true);
            }
            this.f5280T = !this.f5279S;
        }
    }

    @Override // s0.k
    public final void c() {
        this.f5279S = true;
    }

    @Override // p0.l
    public final boolean d() {
        throw null;
    }

    public final void e(W.h hVar, W.l lVar, boolean z3, boolean z4) {
        W.l a3;
        long j3;
        long j4;
        C0261b c0261b;
        boolean z5 = false;
        if (z3) {
            if (this.f5277Q != 0) {
                z5 = true;
            }
            a3 = lVar;
        } else {
            a3 = lVar.a(this.f5277Q);
        }
        try {
            w0.l h3 = h(hVar, a3, z4);
            if (z5) {
                h3.d(this.f5277Q);
            }
            do {
                try {
                    if (this.f5279S) {
                        break;
                    }
                    c0261b = this.f5275O;
                } catch (EOFException e2) {
                    if ((this.f8781p.f1967f & 16384) != 0) {
                        this.f5275O.f5219a.b(0L, 0L);
                        j3 = h3.f9608p;
                        j4 = lVar.f2771e;
                    } else {
                        throw e2;
                    }
                }
            } while (c0261b.f5219a.f(h3, C0261b.f5218f) == 0);
            j3 = h3.f9608p;
            j4 = lVar.f2771e;
            this.f5277Q = (int) (j3 - j4);
        } finally {
            AbstractC0155a.r(hVar);
        }
    }

    public final int g(int i3) {
        AbstractC0123a.j(!this.f5286z);
        if (i3 >= this.f5281U.size()) {
            return 0;
        }
        return ((Integer) this.f5281U.get(i3)).intValue();
    }

    public final w0.l h(W.h hVar, W.l lVar, boolean z3) {
        int i3;
        long j3;
        String str;
        long j4;
        y yVar;
        long j5;
        C0261b c0261b;
        ArrayList arrayList;
        w0.o c0234a;
        boolean z4;
        B1.b bVar;
        boolean z5;
        int i4;
        int i5;
        B1.b bVar2;
        int i6;
        B1.b bVar3;
        boolean z6;
        s[] sVarArr;
        long j6;
        s[] sVarArr2;
        boolean z7;
        boolean z8;
        w0.o dVar;
        E[] eArr;
        long j7 = hVar.j(lVar);
        long j8 = this.f8784s;
        y yVar2 = this.f5268G;
        if (z3) {
            try {
                yVar2.h(j8, this.f5266E);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e2) {
                throw new IOException(e2);
            }
        }
        w0.l lVar2 = new w0.l(hVar, lVar.f2771e, j7);
        if (this.f5275O == null) {
            U.t tVar = this.L;
            lVar2.f9610r = 0;
            try {
                tVar.D(10);
                lVar2.p(tVar.f2477a, 0, 10, false);
                if (tVar.x() == 4801587) {
                    tVar.H(3);
                    int t3 = tVar.t();
                    int i7 = t3 + 10;
                    byte[] bArr = tVar.f2477a;
                    if (i7 > bArr.length) {
                        tVar.D(i7);
                        System.arraycopy(bArr, 0, tVar.f2477a, 0, 10);
                    }
                    lVar2.p(tVar.f2477a, 10, t3, false);
                    F d02 = this.f5272K.d0(tVar.f2477a, t3);
                    if (d02 != null) {
                        for (E e3 : d02.f1770m) {
                            if (e3 instanceof K0.m) {
                                K0.m mVar = (K0.m) e3;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f731n)) {
                                    System.arraycopy(mVar.f732o, 0, tVar.f2477a, 0, 8);
                                    tVar.G(0);
                                    tVar.F(8);
                                    j3 = tVar.o() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j3 = -9223372036854775807L;
            lVar2.f9610r = 0;
            C0261b c0261b2 = this.f5265D;
            if (c0261b2 != null) {
                w0.o oVar = c0261b2.f5219a;
                w0.o d3 = oVar.d();
                if (!(d3 instanceof C0230D) && !(d3 instanceof Q0.n)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                AbstractC0123a.j(!z7);
                if (oVar.d() == oVar) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0123a.i("Can't recreate wrapped extractors. Outer type: " + oVar.getClass(), z8);
                boolean z9 = oVar instanceof w;
                B1.b bVar4 = c0261b2.f5222d;
                if (z9) {
                    dVar = new w(c0261b2.f5220b.f1965d, c0261b2.f5221c, bVar4, c0261b2.f5223e);
                } else if (oVar instanceof C0237d) {
                    dVar = new C0237d();
                } else if (oVar instanceof C0234a) {
                    dVar = new C0234a();
                } else if (oVar instanceof C0236c) {
                    dVar = new C0236c();
                } else if (oVar instanceof P0.d) {
                    dVar = new P0.d();
                } else {
                    throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(oVar.getClass().getSimpleName()));
                }
                c0261b = new C0261b(dVar, c0261b2.f5220b, c0261b2.f5221c, bVar4, c0261b2.f5223e);
                j4 = j8;
                yVar = yVar2;
                j5 = j3;
                i3 = 0;
            } else {
                Map x = hVar.x();
                C0263d c0263d = this.f5269H;
                c0263d.getClass();
                C0113p c0113p = this.f8781p;
                int C3 = android.support.v4.media.session.a.C(c0113p.f1974m);
                List list = (List) x.get("Content-Type");
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                int C4 = android.support.v4.media.session.a.C(str);
                int D3 = android.support.v4.media.session.a.D(lVar.f2767a);
                ArrayList arrayList2 = new ArrayList(7);
                C0263d.a(C3, arrayList2);
                C0263d.a(C4, arrayList2);
                C0263d.a(D3, arrayList2);
                int[] iArr = C0263d.f5226d;
                int i8 = 0;
                for (int i9 = 7; i8 < i9; i9 = 7) {
                    C0263d.a(iArr[i8], arrayList2);
                    i8++;
                }
                lVar2.f9610r = 0;
                int i10 = 0;
                w0.o oVar2 = null;
                while (true) {
                    int size = arrayList2.size();
                    y yVar3 = this.f5268G;
                    if (i10 < size) {
                        int intValue = ((Integer) arrayList2.get(i10)).intValue();
                        j4 = j8;
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue != 7) {
                                        B1.b bVar5 = T0.j.f2321c;
                                        List list2 = this.f5270I;
                                        arrayList = arrayList2;
                                        if (intValue != 8) {
                                            if (intValue != 11) {
                                                if (intValue != 13) {
                                                    yVar = yVar2;
                                                    j5 = j3;
                                                    c0234a = null;
                                                } else {
                                                    yVar = yVar2;
                                                    c0234a = new w(c0113p.f1965d, yVar3, c0263d.f5227b, c0263d.f5228c);
                                                    j5 = j3;
                                                }
                                            } else {
                                                yVar = yVar2;
                                                B1.b bVar6 = c0263d.f5227b;
                                                boolean z10 = c0263d.f5228c;
                                                if (list2 != null) {
                                                    i6 = 48;
                                                } else {
                                                    C0112o c0112o = new C0112o();
                                                    c0112o.f1937l = R.G.l("application/cea-608");
                                                    list2 = Collections.singletonList(new C0113p(c0112o));
                                                    i6 = 16;
                                                }
                                                String str2 = c0113p.f1971j;
                                                j5 = j3;
                                                if (!TextUtils.isEmpty(str2)) {
                                                    if (R.G.a(str2, "audio/mp4a-latm") == null) {
                                                        i6 |= 2;
                                                    }
                                                    if (R.G.a(str2, "video/avc") == null) {
                                                        i6 |= 4;
                                                    }
                                                }
                                                if (!z10) {
                                                    bVar3 = bVar5;
                                                } else {
                                                    bVar3 = bVar6;
                                                }
                                                c0234a = new C0230D(2, !z10 ? 1 : 0, bVar3, yVar3, new B.b(i6, list2));
                                            }
                                        } else {
                                            yVar = yVar2;
                                            j5 = j3;
                                            B1.b bVar7 = c0263d.f5227b;
                                            boolean z11 = c0263d.f5228c;
                                            F f3 = c0113p.f1972k;
                                            if (f3 == null) {
                                                bVar = bVar7;
                                            } else {
                                                int i11 = 0;
                                                while (true) {
                                                    E[] eArr2 = f3.f1770m;
                                                    bVar = bVar7;
                                                    if (i11 >= eArr2.length) {
                                                        break;
                                                    }
                                                    E e4 = eArr2[i11];
                                                    if (e4 instanceof v) {
                                                        z5 = !((v) e4).f5391o.isEmpty();
                                                        break;
                                                    }
                                                    i11++;
                                                    bVar7 = bVar;
                                                }
                                            }
                                            z5 = false;
                                            if (z5) {
                                                i4 = 4;
                                            } else {
                                                i4 = 0;
                                            }
                                            if (!z11) {
                                                i5 = i4 | 32;
                                                bVar2 = bVar5;
                                            } else {
                                                i5 = i4;
                                                bVar2 = bVar;
                                            }
                                            if (list2 == null) {
                                                list2 = b0.f231q;
                                            }
                                            c0234a = new Q0.n(bVar2, i5, yVar3, null, list2, null);
                                        }
                                    } else {
                                        yVar = yVar2;
                                        j5 = j3;
                                        arrayList = arrayList2;
                                        c0234a = new P0.d(0L);
                                    }
                                } else {
                                    yVar = yVar2;
                                    j5 = j3;
                                    arrayList = arrayList2;
                                    c0234a = new C0237d();
                                }
                            } else {
                                yVar = yVar2;
                                j5 = j3;
                                arrayList = arrayList2;
                                c0234a = new C0236c();
                            }
                        } else {
                            yVar = yVar2;
                            j5 = j3;
                            arrayList = arrayList2;
                            c0234a = new C0234a();
                        }
                        c0234a.getClass();
                        try {
                            z4 = c0234a.e(lVar2);
                            i3 = 0;
                            lVar2.f9610r = 0;
                        } catch (EOFException unused3) {
                            i3 = 0;
                            lVar2.f9610r = 0;
                            z4 = false;
                        } catch (Throwable th) {
                            lVar2.f9610r = 0;
                            throw th;
                        }
                        if (z4) {
                            c0261b = new C0261b(c0234a, c0113p, yVar3, c0263d.f5227b, c0263d.f5228c);
                            break;
                        }
                        if (oVar2 == null && (intValue == C3 || intValue == C4 || intValue == D3 || intValue == 11)) {
                            oVar2 = c0234a;
                        }
                        i10++;
                        arrayList2 = arrayList;
                        j8 = j4;
                        yVar2 = yVar;
                        j3 = j5;
                    } else {
                        j4 = j8;
                        yVar = yVar2;
                        j5 = j3;
                        i3 = 0;
                        oVar2.getClass();
                        c0261b = new C0261b(oVar2, c0113p, yVar3, c0263d.f5227b, c0263d.f5228c);
                        break;
                    }
                }
            }
            this.f5275O = c0261b;
            w0.o d4 = c0261b.f5219a.d();
            if (!(d4 instanceof C0237d) && !(d4 instanceof C0234a) && !(d4 instanceof C0236c) && !(d4 instanceof P0.d)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6) {
                t tVar2 = this.f5276P;
                if (j5 != -9223372036854775807L) {
                    j6 = yVar.b(j5);
                } else {
                    j6 = j4;
                }
                if (tVar2.f5367h0 != j6) {
                    tVar2.f5367h0 = j6;
                    for (s sVar : tVar2.f5342H) {
                        if (sVar.f8523F != j6) {
                            sVar.f8523F = j6;
                            sVar.f8549z = true;
                        }
                    }
                }
            } else {
                t tVar3 = this.f5276P;
                if (tVar3.f5367h0 != 0) {
                    tVar3.f5367h0 = 0L;
                    for (s sVar2 : tVar3.f5342H) {
                        if (sVar2.f8523F != 0) {
                            sVar2.f8523F = 0L;
                            sVar2.f8549z = true;
                        }
                    }
                }
            }
            this.f5276P.f5344J.clear();
            this.f5275O.f5219a.h(this.f5276P);
        } else {
            i3 = 0;
        }
        t tVar4 = this.f5276P;
        C0110m c0110m = tVar4.f5368i0;
        C0110m c0110m2 = this.f5271J;
        if (!A.a(c0110m, c0110m2)) {
            tVar4.f5368i0 = c0110m2;
            while (true) {
                s[] sVarArr3 = tVar4.f5342H;
                if (i3 >= sVarArr3.length) {
                    break;
                }
                if (tVar4.f5360a0[i3]) {
                    s sVar3 = sVarArr3[i3];
                    sVar3.f5333I = c0110m2;
                    sVar3.f8549z = true;
                }
                i3++;
            }
        }
        return lVar2;
    }
}

package m0;

import R.A;
import R.C0119w;
import R.C0122z;
import U.AbstractC0123a;
import W.B;
import W.g;
import W.h;
import Y.C0131b;
import Z.m;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d0.d;
import e0.l;
import java.util.ArrayList;
import java.util.regex.Matcher;
import o0.AbstractC0677a;
import o0.C0701z;
import o0.InterfaceC0698w;
import o0.InterfaceC0699x;
import o0.Y;
import o0.r;
import p0.C0735h;
import s0.e;
import s0.i;
import s0.k;
import s0.n;
import s0.o;
import s0.p;
import s0.q;
/* renamed from: m0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616c extends AbstractC0677a implements i {

    /* renamed from: A  reason: collision with root package name */
    public final long f8165A;

    /* renamed from: B  reason: collision with root package name */
    public final d f8166B;

    /* renamed from: C  reason: collision with root package name */
    public final p f8167C;

    /* renamed from: D  reason: collision with root package name */
    public final ArrayList f8168D;

    /* renamed from: E  reason: collision with root package name */
    public h f8169E;

    /* renamed from: F  reason: collision with root package name */
    public n f8170F;

    /* renamed from: G  reason: collision with root package name */
    public o f8171G;

    /* renamed from: H  reason: collision with root package name */
    public B f8172H;

    /* renamed from: I  reason: collision with root package name */
    public long f8173I;

    /* renamed from: J  reason: collision with root package name */
    public n0.c f8174J;

    /* renamed from: K  reason: collision with root package name */
    public Handler f8175K;
    public C0122z L;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8176t;

    /* renamed from: u  reason: collision with root package name */
    public final Uri f8177u;

    /* renamed from: v  reason: collision with root package name */
    public final g f8178v;

    /* renamed from: w  reason: collision with root package name */
    public final C0131b f8179w;
    public final l x;

    /* renamed from: y  reason: collision with root package name */
    public final d0.g f8180y;

    /* renamed from: z  reason: collision with root package name */
    public final l f8181z;

    static {
        A.a("media3.exoplayer.smoothstreaming");
    }

    public C0616c(C0122z c0122z, g gVar, p pVar, C0131b c0131b, l lVar, d0.g gVar2, l lVar2, long j3) {
        this.L = c0122z;
        C0119w c0119w = c0122z.f2008b;
        c0119w.getClass();
        this.f8174J = null;
        Uri uri = Uri.EMPTY;
        Uri uri2 = c0119w.f2001a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            String path = uri2.getPath();
            if (path != null) {
                Matcher matcher = U.A.f2414j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = Uri.withAppendedPath(uri2, "Manifest");
                }
            }
        }
        this.f8177u = uri2;
        this.f8178v = gVar;
        this.f8167C = pVar;
        this.f8179w = c0131b;
        this.x = lVar;
        this.f8180y = gVar2;
        this.f8181z = lVar2;
        this.f8165A = j3;
        this.f8166B = a(null);
        this.f8176t = false;
        this.f8168D = new ArrayList();
    }

    @Override // o0.AbstractC0677a
    public final InterfaceC0699x b(C0701z c0701z, e eVar, long j3) {
        d a3 = a(c0701z);
        d dVar = new d(this.f8571p.f5150c, 0, c0701z);
        n0.c cVar = this.f8174J;
        B b3 = this.f8172H;
        o oVar = this.f8171G;
        C0615b c0615b = new C0615b(cVar, this.f8179w, b3, this.x, this.f8180y, dVar, this.f8181z, a3, oVar, eVar);
        this.f8168D.add(c0615b);
        return c0615b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // s0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d1.C0255e c(s0.k r4, long r5, long r7, java.io.IOException r9, int r10) {
        /*
            r3 = this;
            r5 = 0
            s0.q r4 = (s0.q) r4
            o0.r r6 = new o0.r
            long r0 = r4.f9204m
            W.A r0 = r4.f9207p
            android.net.Uri r0 = r0.f2724o
            r6.<init>(r7)
            e0.l r7 = r3.f8181z
            r7.getClass()
            boolean r7 = r9 instanceof R.H
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof W.t
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof s0.m
            if (r7 != 0) goto L4c
            int r7 = W.i.f2752n
            r7 = r9
        L2b:
            if (r7 == 0) goto L40
            boolean r8 = r7 instanceof W.i
            if (r8 == 0) goto L3b
            r8 = r7
            W.i r8 = (W.i) r8
            int r8 = r8.f2753m
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r2) goto L3b
            goto L4c
        L3b:
            java.lang.Throwable r7 = r7.getCause()
            goto L2b
        L40:
            int r10 = r10 + (-1)
            int r10 = r10 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r10, r7)
            long r7 = (long) r7
            goto L4d
        L4c:
            r7 = r0
        L4d:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 != 0) goto L54
            d1.e r5 = s0.n.f9200r
            goto L5a
        L54:
            d1.e r10 = new d1.e
            r10.<init>(r5, r7, r5)
            r5 = r10
        L5a:
            boolean r7 = r5.a()
            r7 = r7 ^ 1
            d0.d r8 = r3.f8166B
            int r4 = r4.f9206o
            r8.i(r6, r4, r9, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0616c.c(s0.k, long, long, java.io.IOException, int):d1.e");
    }

    @Override // s0.i
    public final void e(k kVar, long j3, long j4, boolean z3) {
        q qVar = (q) kVar;
        long j5 = qVar.f9204m;
        Uri uri = qVar.f9207p.f2724o;
        r rVar = new r(j4);
        this.f8181z.getClass();
        this.f8166B.c(rVar, qVar.f9206o, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // s0.i
    public final void j(k kVar, long j3, long j4) {
        q qVar = (q) kVar;
        long j5 = qVar.f9204m;
        Uri uri = qVar.f9207p.f2724o;
        r rVar = new r(j4);
        this.f8181z.getClass();
        this.f8166B.e(rVar, qVar.f9206o);
        this.f8174J = (n0.c) qVar.f9209r;
        this.f8173I = j3 - j4;
        w();
        if (this.f8174J.f8362d) {
            this.f8175K.postDelayed(new Z.d(this, 8), Math.max(0L, (this.f8173I + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // o0.AbstractC0677a
    public final synchronized C0122z k() {
        return this.L;
    }

    @Override // o0.AbstractC0677a
    public final void m() {
        this.f8171G.a();
    }

    @Override // o0.AbstractC0677a
    public final void o(B b3) {
        this.f8172H = b3;
        Looper myLooper = Looper.myLooper();
        m mVar = this.f8574s;
        AbstractC0123a.k(mVar);
        d0.g gVar = this.f8180y;
        gVar.d(myLooper, mVar);
        gVar.i();
        if (this.f8176t) {
            this.f8171G = new l(29);
            w();
            return;
        }
        this.f8169E = this.f8178v.a();
        n nVar = new n("SsMediaSource");
        this.f8170F = nVar;
        this.f8171G = nVar;
        this.f8175K = U.A.n(null);
        x();
    }

    @Override // o0.AbstractC0677a
    public final void q(InterfaceC0699x interfaceC0699x) {
        C0615b c0615b = (C0615b) interfaceC0699x;
        for (C0735h c0735h : c0615b.f8163y) {
            c0735h.B(null);
        }
        c0615b.f8162w = null;
        this.f8168D.remove(interfaceC0699x);
    }

    @Override // o0.AbstractC0677a
    public final void s() {
        n0.c cVar;
        if (this.f8176t) {
            cVar = this.f8174J;
        } else {
            cVar = null;
        }
        this.f8174J = cVar;
        this.f8169E = null;
        this.f8173I = 0L;
        n nVar = this.f8170F;
        if (nVar != null) {
            nVar.e(null);
            this.f8170F = null;
        }
        Handler handler = this.f8175K;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f8175K = null;
        }
        this.f8180y.release();
    }

    @Override // o0.AbstractC0677a
    public final synchronized void v(C0122z c0122z) {
        this.L = c0122z;
    }

    public final void w() {
        n0.b[] bVarArr;
        long j3;
        Y y3;
        long j4;
        C0735h[] c0735hArr;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8168D;
            if (i3 >= arrayList.size()) {
                break;
            }
            C0615b c0615b = (C0615b) arrayList.get(i3);
            n0.c cVar = this.f8174J;
            c0615b.x = cVar;
            C0735h[] c0735hArr2 = c0615b.f8163y;
            int length = c0735hArr2.length;
            int i4 = 0;
            while (i4 < length) {
                C0614a c0614a = (C0614a) c0735hArr2[i4].f8805q;
                n0.b[] bVarArr2 = c0614a.f8149f.f8364f;
                int i5 = c0614a.f8145b;
                n0.b bVar = bVarArr2[i5];
                int i6 = bVar.f8353k;
                n0.b bVar2 = cVar.f8364f[i5];
                if (i6 == 0 || bVar2.f8353k == 0) {
                    c0735hArr = c0735hArr2;
                    c0614a.f8150g += i6;
                } else {
                    int i7 = i6 - 1;
                    long[] jArr = bVar.f8357o;
                    long j5 = jArr[i7];
                    c0735hArr = c0735hArr2;
                    long j6 = bVar2.f8357o[0];
                    if (bVar.b(i7) + j5 <= j6) {
                        c0614a.f8150g += i6;
                    } else {
                        c0614a.f8150g = U.A.f(jArr, j6, true) + c0614a.f8150g;
                    }
                }
                c0614a.f8149f = cVar;
                i4++;
                c0735hArr2 = c0735hArr;
            }
            InterfaceC0698w interfaceC0698w = c0615b.f8162w;
            interfaceC0698w.getClass();
            interfaceC0698w.f(c0615b);
            i3++;
        }
        long j7 = Long.MIN_VALUE;
        long j8 = Long.MAX_VALUE;
        for (n0.b bVar3 : this.f8174J.f8364f) {
            if (bVar3.f8353k > 0) {
                long[] jArr2 = bVar3.f8357o;
                j8 = Math.min(j8, jArr2[0]);
                int i8 = bVar3.f8353k - 1;
                j7 = Math.max(j7, bVar3.b(i8) + jArr2[i8]);
            }
        }
        if (j8 == Long.MAX_VALUE) {
            if (this.f8174J.f8362d) {
                j4 = -9223372036854775807L;
            } else {
                j4 = 0;
            }
            n0.c cVar2 = this.f8174J;
            boolean z3 = cVar2.f8362d;
            y3 = new Y(j4, 0L, 0L, 0L, true, z3, z3, cVar2, k());
        } else {
            n0.c cVar3 = this.f8174J;
            if (cVar3.f8362d) {
                long j9 = cVar3.f8366h;
                if (j9 != -9223372036854775807L && j9 > 0) {
                    j8 = Math.max(j8, j7 - j9);
                }
                long j10 = j8;
                long j11 = j7 - j10;
                long M3 = j11 - U.A.M(this.f8165A);
                if (M3 < 5000000) {
                    M3 = Math.min(5000000L, j11 / 2);
                }
                y3 = new Y(-9223372036854775807L, j11, j10, M3, true, true, true, this.f8174J, k());
            } else {
                long j12 = cVar3.f8365g;
                if (j12 != -9223372036854775807L) {
                    j3 = j12;
                } else {
                    j3 = j7 - j8;
                }
                y3 = new Y(-9223372036854775807L, -9223372036854775807L, j8 + j3, j3, j8, 0L, true, false, false, this.f8174J, k(), null);
            }
        }
        p(y3);
    }

    public final void x() {
        if (this.f8170F.c()) {
            return;
        }
        q qVar = new q(this.f8169E, this.f8177u, 4, this.f8167C);
        n nVar = this.f8170F;
        l lVar = this.f8181z;
        int i3 = qVar.f9206o;
        this.f8166B.k(new r(qVar.f9204m, qVar.f9205n, nVar.f(qVar, this, lVar.u(i3))), i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}

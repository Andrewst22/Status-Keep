package e0;

import D1.I;
import R.A;
import R.C0117u;
import R.C0118v;
import R.C0119w;
import R.C0122z;
import U.AbstractC0123a;
import W.B;
import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import o0.AbstractC0677a;
import o0.C0701z;
import o0.InterfaceC0699x;
import o0.Y;
/* loaded from: classes.dex */
public final class o extends AbstractC0677a {

    /* renamed from: A  reason: collision with root package name */
    public final f0.c f5309A;

    /* renamed from: B  reason: collision with root package name */
    public final long f5310B;

    /* renamed from: C  reason: collision with root package name */
    public C0118v f5311C;

    /* renamed from: D  reason: collision with root package name */
    public B f5312D;

    /* renamed from: E  reason: collision with root package name */
    public C0122z f5313E;

    /* renamed from: t  reason: collision with root package name */
    public final C0263d f5314t;

    /* renamed from: u  reason: collision with root package name */
    public final C0262c f5315u;

    /* renamed from: v  reason: collision with root package name */
    public final l f5316v;

    /* renamed from: w  reason: collision with root package name */
    public final d0.g f5317w;
    public final l x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f5318y;

    /* renamed from: z  reason: collision with root package name */
    public final int f5319z;

    static {
        A.a("media3.exoplayer.hls");
    }

    public o(C0122z c0122z, C0262c c0262c, C0263d c0263d, l lVar, d0.g gVar, l lVar2, f0.c cVar, long j3, boolean z3, int i3) {
        this.f5313E = c0122z;
        this.f5311C = c0122z.f2009c;
        this.f5315u = c0262c;
        this.f5314t = c0263d;
        this.f5316v = lVar;
        this.f5317w = gVar;
        this.x = lVar2;
        this.f5309A = cVar;
        this.f5310B = j3;
        this.f5318y = z3;
        this.f5319z = i3;
    }

    public static f0.d w(I i3, long j3) {
        f0.d dVar = null;
        for (int i4 = 0; i4 < i3.size(); i4++) {
            f0.d dVar2 = (f0.d) i3.get(i4);
            int i5 = (dVar2.f5442q > j3 ? 1 : (dVar2.f5442q == j3 ? 0 : -1));
            if (i5 <= 0 && dVar2.x) {
                dVar = dVar2;
            } else if (i5 > 0) {
                break;
            }
        }
        return dVar;
    }

    @Override // o0.AbstractC0677a
    public final InterfaceC0699x b(C0701z c0701z, s0.e eVar, long j3) {
        d0.d a3 = a(c0701z);
        d0.d dVar = new d0.d(this.f8571p.f5150c, 0, c0701z);
        B b3 = this.f5312D;
        Z.m mVar = this.f8574s;
        AbstractC0123a.k(mVar);
        return new n(this.f5314t, this.f5309A, this.f5315u, b3, this.f5317w, dVar, this.x, a3, eVar, this.f5316v, this.f5318y, this.f5319z, mVar);
    }

    @Override // o0.AbstractC0677a
    public final synchronized C0122z k() {
        return this.f5313E;
    }

    @Override // o0.AbstractC0677a
    public final void m() {
        f0.c cVar = this.f5309A;
        s0.n nVar = cVar.f5426s;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = cVar.f5430w;
        if (uri != null) {
            f0.b bVar = (f0.b) cVar.f5423p.get(uri);
            bVar.f5409n.a();
            IOException iOException = bVar.f5417v;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // o0.AbstractC0677a
    public final void o(B b3) {
        boolean z3;
        this.f5312D = b3;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Z.m mVar = this.f8574s;
        AbstractC0123a.k(mVar);
        d0.g gVar = this.f5317w;
        gVar.d(myLooper, mVar);
        gVar.i();
        d0.d a3 = a(null);
        C0119w c0119w = k().f2008b;
        c0119w.getClass();
        f0.c cVar = this.f5309A;
        cVar.getClass();
        cVar.f5427t = U.A.n(null);
        cVar.f5425r = a3;
        cVar.f5428u = this;
        s0.q qVar = new s0.q(((W.g) cVar.f5420m.f5225n).a(), c0119w.f2001a, 4, cVar.f5421n.l());
        if (cVar.f5426s == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        s0.n nVar = new s0.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f5426s = nVar;
        l lVar = cVar.f5422o;
        int i3 = qVar.f9206o;
        a3.k(new o0.r(qVar.f9204m, qVar.f9205n, nVar.f(qVar, cVar, lVar.u(i3))), i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // o0.AbstractC0677a
    public final void q(InterfaceC0699x interfaceC0699x) {
        t[] tVarArr;
        s[] sVarArr;
        n nVar = (n) interfaceC0699x;
        nVar.f5297n.f5424q.remove(nVar);
        for (t tVar : nVar.f5292F) {
            if (tVar.f5349P) {
                for (s sVar : tVar.f5342H) {
                    sVar.j();
                    C1.j jVar = sVar.f8532h;
                    if (jVar != null) {
                        jVar.N(sVar.f8529e);
                        sVar.f8532h = null;
                        sVar.f8531g = null;
                    }
                }
            }
            j jVar2 = tVar.f5373p;
            f0.b bVar = (f0.b) jVar2.f5244g.f5423p.get(jVar2.f5242e[jVar2.f5254q.a()]);
            if (bVar != null) {
                bVar.f5418w = false;
            }
            jVar2.f5251n = null;
            tVar.f5379v.e(tVar);
            tVar.f5338D.removeCallbacksAndMessages(null);
            tVar.f5353T = true;
            tVar.f5339E.clear();
        }
        nVar.f5289C = null;
    }

    @Override // o0.AbstractC0677a
    public final void s() {
        f0.c cVar = this.f5309A;
        cVar.f5430w = null;
        cVar.x = null;
        cVar.f5429v = null;
        cVar.f5432z = -9223372036854775807L;
        cVar.f5426s.e(null);
        cVar.f5426s = null;
        HashMap hashMap = cVar.f5423p;
        for (f0.b bVar : hashMap.values()) {
            bVar.f5409n.e(null);
        }
        cVar.f5427t.removeCallbacksAndMessages(null);
        cVar.f5427t = null;
        hashMap.clear();
        this.f5317w.release();
    }

    @Override // o0.AbstractC0677a
    public final synchronized void v(C0122z c0122z) {
        this.f5313E = c0122z;
    }

    public final void x(f0.i iVar) {
        long j3;
        long j4;
        long j5;
        Y y3;
        l lVar;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        boolean z3;
        float f3;
        long j11;
        int i3;
        boolean z4;
        boolean z5 = iVar.f5466p;
        long j12 = iVar.f5458h;
        if (z5) {
            j3 = U.A.Z(j12);
        } else {
            j3 = -9223372036854775807L;
        }
        int i4 = iVar.f5454d;
        if (i4 != 2 && i4 != 1) {
            j4 = -9223372036854775807L;
        } else {
            j4 = j3;
        }
        f0.c cVar = this.f5309A;
        cVar.f5429v.getClass();
        l lVar2 = new l(0);
        boolean z6 = cVar.f5431y;
        long j13 = iVar.f5471u;
        I i5 = iVar.f5468r;
        boolean z7 = iVar.f5457g;
        long j14 = j3;
        long j15 = iVar.f5455e;
        if (z6) {
            long j16 = j12 - cVar.f5432z;
            boolean z8 = iVar.f5465o;
            if (z8) {
                j6 = j16 + j13;
                lVar = lVar2;
            } else {
                lVar = lVar2;
                j6 = -9223372036854775807L;
            }
            if (iVar.f5466p) {
                j7 = j6;
                j8 = U.A.M(U.A.z(this.f5310B)) - (j12 + j13);
            } else {
                j7 = j6;
                j8 = 0;
            }
            long j17 = this.f5311C.f1996a;
            f0.h hVar = iVar.f5472v;
            if (j17 != -9223372036854775807L) {
                j10 = U.A.M(j17);
            } else {
                if (j15 != -9223372036854775807L) {
                    j9 = j13 - j15;
                } else {
                    long j18 = hVar.f5452d;
                    if (j18 != -9223372036854775807L && iVar.f5464n != -9223372036854775807L) {
                        j9 = j18;
                    } else {
                        j9 = hVar.f5451c;
                        if (j9 == -9223372036854775807L) {
                            j9 = 3 * iVar.f5463m;
                        }
                    }
                }
                j10 = j9 + j8;
            }
            long j19 = j13 + j8;
            long k3 = U.A.k(j10, j8, j19);
            C0118v c0118v = k().f2009c;
            if (c0118v.f1999d == -3.4028235E38f && c0118v.f2000e == -3.4028235E38f && hVar.f5451c == -9223372036854775807L && hVar.f5452d == -9223372036854775807L) {
                z3 = true;
            } else {
                z3 = false;
            }
            C0117u c0117u = new C0117u();
            c0117u.f1991a = U.A.Z(k3);
            float f4 = 1.0f;
            if (z3) {
                f3 = 1.0f;
            } else {
                f3 = this.f5311C.f1999d;
            }
            c0117u.f1994d = f3;
            if (!z3) {
                f4 = this.f5311C.f2000e;
            }
            c0117u.f1995e = f4;
            C0118v c0118v2 = new C0118v(c0117u);
            this.f5311C = c0118v2;
            if (j15 == -9223372036854775807L) {
                j15 = j19 - U.A.M(c0118v2.f1996a);
            }
            if (z7) {
                j11 = j15;
            } else {
                f0.d w3 = w(iVar.f5469s, j15);
                if (w3 != null) {
                    j11 = w3.f5442q;
                } else if (i5.isEmpty()) {
                    i3 = i4;
                    j11 = 0;
                    if (i3 != 2 && iVar.f5456f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j20 = j7;
                    y3 = new Y(j4, j14, j20, iVar.f5471u, j16, j11, true, !z8, z4, lVar, k(), this.f5311C);
                } else {
                    f0.f fVar = (f0.f) i5.get(U.A.d(i5, Long.valueOf(j15), true));
                    f0.d w4 = w(fVar.f5437y, j15);
                    if (w4 != null) {
                        j11 = w4.f5442q;
                    } else {
                        j11 = fVar.f5442q;
                    }
                }
            }
            i3 = i4;
            if (i3 != 2) {
            }
            z4 = false;
            long j202 = j7;
            y3 = new Y(j4, j14, j202, iVar.f5471u, j16, j11, true, !z8, z4, lVar, k(), this.f5311C);
        } else {
            if (j15 != -9223372036854775807L && !i5.isEmpty()) {
                if (!z7 && j15 != j13) {
                    j5 = ((f0.f) i5.get(U.A.d(i5, Long.valueOf(j15), true))).f5442q;
                } else {
                    j5 = j15;
                }
            } else {
                j5 = 0;
            }
            C0122z k4 = k();
            long j21 = iVar.f5471u;
            y3 = new Y(j4, j14, j21, j21, 0L, j5, true, false, true, lVar2, k4, null);
        }
        p(y3);
    }
}

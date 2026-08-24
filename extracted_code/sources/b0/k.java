package b0;

import D1.I;
import K.C0059m;
import R.C0113p;
import R.G;
import U.A;
import U.AbstractC0123a;
import W.w;
import Y.P;
import android.os.SystemClock;
import c0.C0221a;
import c0.C0222b;
import c0.C0223c;
import d1.C0255e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o0.C0678b;
import p0.AbstractC0732e;
import p0.C0731d;
import r0.s;
import w0.InterfaceC0890A;
/* loaded from: classes.dex */
public final class k implements p0.i {

    /* renamed from: a  reason: collision with root package name */
    public final s0.o f4597a;

    /* renamed from: b  reason: collision with root package name */
    public final C0059m f4598b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f4599c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4600d;

    /* renamed from: e  reason: collision with root package name */
    public final W.h f4601e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4602f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4603g;

    /* renamed from: h  reason: collision with root package name */
    public final n f4604h;

    /* renamed from: i  reason: collision with root package name */
    public final i[] f4605i;

    /* renamed from: j  reason: collision with root package name */
    public s f4606j;

    /* renamed from: k  reason: collision with root package name */
    public C0223c f4607k;

    /* renamed from: l  reason: collision with root package name */
    public int f4608l;

    /* renamed from: m  reason: collision with root package name */
    public C0678b f4609m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4610n;

    public k(A.i iVar, s0.o oVar, C0223c c0223c, C0059m c0059m, int i3, int[] iArr, s sVar, int i4, W.h hVar, long j3, int i5, boolean z3, ArrayList arrayList, n nVar) {
        T0.m nVar2;
        String str;
        C0113p c0113p;
        i[] iVarArr;
        c0.m mVar;
        C0731d c0731d;
        this.f4597a = oVar;
        this.f4607k = c0223c;
        this.f4598b = c0059m;
        this.f4599c = iArr;
        this.f4606j = sVar;
        this.f4600d = i4;
        this.f4601e = hVar;
        this.f4608l = i3;
        this.f4602f = j3;
        this.f4603g = i5;
        this.f4604h = nVar;
        long d3 = c0223c.d(i3);
        ArrayList h3 = h();
        this.f4605i = new i[sVar.length()];
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.f4605i.length) {
            c0.m mVar2 = (c0.m) h3.get(sVar.k(i7));
            C0222b m3 = c0059m.m(mVar2.f4762n);
            i[] iVarArr2 = this.f4605i;
            C0222b c0222b = m3 == null ? (C0222b) mVar2.f4762n.get(i6) : m3;
            C0113p c0113p2 = mVar2.f4761m;
            iVar.getClass();
            String str2 = c0113p2.f1973l;
            if (G.j(str2)) {
                if (iVar.f15a) {
                    nVar2 = new T0.h(((B1.b) iVar.f16b).l(c0113p2), c0113p2);
                } else {
                    c0731d = null;
                    iVarArr = iVarArr2;
                    mVar = mVar2;
                    int i8 = i7;
                    iVarArr[i8] = new i(d3, mVar, c0222b, c0731d, 0L, mVar.d());
                    i7 = i8 + 1;
                    i6 = 0;
                }
            } else {
                if (str2 == null || (!str2.startsWith("video/webm") && !str2.startsWith("audio/webm") && !str2.startsWith("application/webm") && !str2.startsWith("video/x-matroska") && !str2.startsWith("audio/x-matroska") && !str2.startsWith("application/x-matroska"))) {
                    if (Objects.equals(str2, "image/jpeg")) {
                        nVar2 = new A0.a(1);
                    } else if (Objects.equals(str2, "image/png")) {
                        nVar2 = new A0.a(1, (byte) 0);
                    } else {
                        int i9 = z3 ? 4 : 0;
                        str = str2;
                        c0113p = c0113p2;
                        iVarArr = iVarArr2;
                        mVar = mVar2;
                        nVar2 = new Q0.n((B1.b) iVar.f16b, iVar.f15a ? i9 : i9 | 32, null, null, arrayList, nVar);
                    }
                } else {
                    str = str2;
                    c0113p = c0113p2;
                    iVarArr = iVarArr2;
                    mVar = mVar2;
                    nVar2 = new O0.d((B1.b) iVar.f16b, iVar.f15a ? 1 : 3);
                }
                if (iVar.f15a && !G.j(str) && !(nVar2.d() instanceof Q0.n) && !(nVar2.d() instanceof O0.d)) {
                    nVar2 = new T0.m(nVar2, (B1.b) iVar.f16b);
                }
                c0731d = new C0731d(nVar2, i4, c0113p);
                int i82 = i7;
                iVarArr[i82] = new i(d3, mVar, c0222b, c0731d, 0L, mVar.d());
                i7 = i82 + 1;
                i6 = 0;
            }
            str = str2;
            c0113p = c0113p2;
            iVarArr = iVarArr2;
            mVar = mVar2;
            if (iVar.f15a) {
                nVar2 = new T0.m(nVar2, (B1.b) iVar.f16b);
            }
            c0731d = new C0731d(nVar2, i4, c0113p);
            int i822 = i7;
            iVarArr[i822] = new i(d3, mVar, c0222b, c0731d, 0L, mVar.d());
            i7 = i822 + 1;
            i6 = 0;
        }
    }

    @Override // p0.i
    public final void a() {
        C0678b c0678b = this.f4609m;
        if (c0678b == null) {
            this.f4597a.a();
            return;
        }
        throw c0678b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r3 < (((r0.k() + r10) + r8) - 1)) goto L14;
     */
    @Override // p0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r19, Y.l0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            b0.i[] r0 = r7.f4605i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L5e
            r5 = r0[r4]
            b0.h r6 = r5.f4592d
            if (r6 == 0) goto L5b
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto L5b
        L1b:
            b0.h r0 = r5.f4592d
            U.AbstractC0123a.k(r0)
            long r3 = r5.f4593e
            long r3 = r0.b(r1, r3)
            long r10 = r5.f4594f
            long r3 = r3 + r10
            long r12 = r5.f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L50
            r14 = -1
            r16 = 1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L48
            U.AbstractC0123a.k(r0)
            long r14 = r0.k()
            long r14 = r14 + r10
            long r14 = r14 + r8
            long r14 = r14 - r16
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 >= 0) goto L50
        L48:
            long r3 = r3 + r16
            long r3 = r5.f(r3)
            r5 = r3
            goto L51
        L50:
            r5 = r12
        L51:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5b:
            int r4 = r4 + 1
            goto L8
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.k.b(long, Y.l0):long");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [o0.b, java.io.IOException] */
    @Override // p0.i
    public final void c(P p3, long j3, List list, A.i iVar) {
        long j4;
        long M3;
        p0.l lVar;
        i[] iVarArr;
        p0.m[] mVarArr;
        long j5;
        boolean z3;
        boolean z4;
        c0.m mVar;
        long j6;
        long k3;
        long j7;
        C0113p c0113p;
        long j8;
        int i3;
        A.i iVar2;
        Object obj;
        int i4;
        boolean z5;
        c0.j jVar;
        long M4;
        long j9;
        long k4;
        boolean z6;
        if (this.f4609m != null) {
            return;
        }
        long j10 = p3.f3150a;
        long j11 = j3 - j10;
        long M5 = A.M(this.f4607k.b(this.f4608l).f4746b) + A.M(this.f4607k.f4713a) + j3;
        n nVar = this.f4604h;
        if (nVar != null) {
            o oVar = nVar.f4625e;
            C0223c c0223c = oVar.f4631r;
            if (!c0223c.f4716d) {
                j4 = j11;
                z6 = false;
            } else if (oVar.f4633t) {
                j4 = j11;
                z6 = true;
            } else {
                Map.Entry ceilingEntry = oVar.f4630q.ceilingEntry(Long.valueOf(c0223c.f4720h));
                C0210d c0210d = oVar.f4627n;
                if (ceilingEntry != null && ((Long) ceilingEntry.getValue()).longValue() < M5) {
                    long longValue = ((Long) ceilingEntry.getKey()).longValue();
                    g gVar = c0210d.f4544n;
                    j4 = j11;
                    long j12 = gVar.f4580Z;
                    if (j12 == -9223372036854775807L || j12 < longValue) {
                        gVar.f4580Z = longValue;
                    }
                    z6 = true;
                } else {
                    j4 = j11;
                    z6 = false;
                }
                if (z6 && oVar.f4632s) {
                    oVar.f4633t = true;
                    oVar.f4632s = false;
                    g gVar2 = c0210d.f4544n;
                    gVar2.f4570P.removeCallbacks(gVar2.f4564I);
                    gVar2.B();
                }
            }
            if (z6) {
                return;
            }
        } else {
            j4 = j11;
        }
        long M6 = A.M(A.z(this.f4602f));
        C0223c c0223c2 = this.f4607k;
        long j13 = c0223c2.f4713a;
        if (j13 == -9223372036854775807L) {
            M3 = -9223372036854775807L;
        } else {
            M3 = M6 - A.M(j13 + c0223c2.b(this.f4608l).f4746b);
        }
        c0.j jVar2 = null;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (p0.l) list.get(list.size() - 1);
        }
        int length = this.f4606j.length();
        p0.m[] mVarArr2 = new p0.m[length];
        int i5 = 0;
        while (true) {
            iVarArr = this.f4605i;
            if (i5 >= length) {
                break;
            }
            i iVar3 = iVarArr[i5];
            h hVar = iVar3.f4592d;
            e0.l lVar2 = p0.m.f8824h;
            if (hVar == null) {
                mVarArr2[i5] = lVar2;
                j9 = M3;
            } else {
                long b3 = iVar3.b(M6);
                long c3 = iVar3.c(M6);
                if (lVar != null) {
                    j9 = M3;
                    k4 = lVar.a();
                } else {
                    h hVar2 = iVar3.f4592d;
                    AbstractC0123a.k(hVar2);
                    j9 = M3;
                    k4 = A.k(hVar2.b(j3, iVar3.f4593e) + iVar3.f4594f, b3, c3);
                }
                if (k4 < b3) {
                    mVarArr2[i5] = lVar2;
                } else {
                    mVarArr2[i5] = new j(i(i5), k4, c3);
                }
            }
            i5++;
            M3 = j9;
        }
        long j14 = M3;
        long j15 = 0;
        if (!this.f4607k.f4716d || iVarArr[0].d() == 0) {
            mVarArr = mVarArr2;
            j5 = -9223372036854775807L;
        } else {
            long e2 = iVarArr[0].e(iVarArr[0].c(M6));
            C0223c c0223c3 = this.f4607k;
            long j16 = c0223c3.f4713a;
            if (j16 == -9223372036854775807L) {
                mVarArr = mVarArr2;
                M4 = -9223372036854775807L;
            } else {
                mVarArr = mVarArr2;
                M4 = M6 - A.M(j16 + c0223c3.b(this.f4608l).f4746b);
            }
            j15 = 0;
            j5 = Math.max(0L, Math.min(M4, e2) - j10);
        }
        long j17 = j4;
        long j18 = j15;
        this.f4606j.p(j10, j17, j5, list, mVarArr);
        int f3 = this.f4606j.f();
        SystemClock.elapsedRealtime();
        i i6 = i(f3);
        h hVar3 = i6.f4592d;
        C0222b c0222b = i6.f4591c;
        C0731d c0731d = i6.f4589a;
        c0.m mVar2 = i6.f4590b;
        if (c0731d != null) {
            if (c0731d.f8777u == null) {
                jVar = mVar2.f4765q;
            } else {
                jVar = null;
            }
            if (hVar3 == null) {
                jVar2 = mVar2.f();
            }
            c0.j jVar3 = jVar2;
            if (jVar != null || jVar3 != null) {
                C0113p d3 = this.f4606j.d();
                int e3 = this.f4606j.e();
                Object l3 = this.f4606j.l();
                if (jVar != null) {
                    c0.j a3 = jVar.a(jVar3, c0222b.f4709a);
                    if (a3 != null) {
                        jVar = a3;
                    }
                } else {
                    jVar3.getClass();
                    jVar = jVar3;
                }
                iVar.f16b = new p0.k(this.f4601e, android.support.v4.media.session.a.d(mVar2, c0222b.f4709a, jVar, 0), d3, e3, l3, i6.f4589a);
                return;
            }
        }
        C0223c c0223c4 = this.f4607k;
        if (c0223c4.f4716d && this.f4608l == c0223c4.f4725m.size() - 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j19 = i6.f4593e;
        if (z3 && j19 == -9223372036854775807L) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i6.d() == j18) {
            iVar.f15a = z4;
            return;
        }
        long b4 = i6.b(M6);
        long c4 = i6.c(M6);
        if (z3) {
            long e4 = i6.e(c4);
            if ((e4 - i6.f(c4)) + e4 >= j19) {
                z5 = true;
            } else {
                z5 = false;
            }
            z4 &= z5;
        }
        long j20 = i6.f4594f;
        if (lVar != null) {
            mVar = mVar2;
            k3 = lVar.a();
            j6 = j19;
        } else {
            AbstractC0123a.k(hVar3);
            mVar = mVar2;
            j6 = j19;
            k3 = A.k(hVar3.b(j3, j6) + j20, b4, c4);
        }
        if (k3 < b4) {
            this.f4609m = new IOException();
            return;
        }
        int i7 = (k3 > c4 ? 1 : (k3 == c4 ? 0 : -1));
        if (i7 <= 0) {
            c0.m mVar3 = mVar;
            if (!this.f4610n || i7 < 0) {
                if (z4 && i6.f(k3) >= j6) {
                    iVar.f15a = true;
                    return;
                }
                int min = (int) Math.min(this.f4603g, (c4 - k3) + 1);
                int i8 = (j6 > (-9223372036854775807L) ? 1 : (j6 == (-9223372036854775807L) ? 0 : -1));
                if (i8 != 0) {
                    while (min > 1 && i6.f((min + k3) - 1) >= j6) {
                        min--;
                    }
                }
                if (list.isEmpty()) {
                    j7 = j3;
                } else {
                    j7 = -9223372036854775807L;
                }
                C0113p d4 = this.f4606j.d();
                int e5 = this.f4606j.e();
                Object l4 = this.f4606j.l();
                long f4 = i6.f(k3);
                AbstractC0123a.k(hVar3);
                long j21 = j6;
                c0.j C3 = hVar3.C(k3 - j20);
                W.h hVar4 = this.f4601e;
                if (c0731d == null) {
                    long e6 = i6.e(k3);
                    if (i6.g(k3, j14)) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    obj = new p0.n(hVar4, android.support.v4.media.session.a.d(mVar3, c0222b.f4709a, C3, i4), d4, e5, l4, f4, e6, k3, this.f4600d, d4);
                    iVar2 = iVar;
                } else {
                    c0.j jVar4 = C3;
                    int i9 = 1;
                    int i10 = 1;
                    while (true) {
                        if (i9 < min) {
                            int i11 = min;
                            c0113p = d4;
                            AbstractC0123a.k(hVar3);
                            c0.j a4 = jVar4.a(hVar3.C((i9 + k3) - j20), c0222b.f4709a);
                            if (a4 == null) {
                                break;
                            }
                            i10++;
                            i9++;
                            d4 = c0113p;
                            jVar4 = a4;
                            min = i11;
                        } else {
                            c0113p = d4;
                            break;
                        }
                    }
                    long j22 = (i10 + k3) - 1;
                    long e7 = i6.e(j22);
                    if (i8 != 0 && j21 <= e7) {
                        j8 = j21;
                    } else {
                        j8 = -9223372036854775807L;
                    }
                    if (i6.g(j22, j14)) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    W.l d5 = android.support.v4.media.session.a.d(mVar3, c0222b.f4709a, jVar4, i3);
                    long j23 = -mVar3.f4763o;
                    C0113p c0113p2 = c0113p;
                    if (G.i(c0113p2.f1974m)) {
                        j23 += f4;
                    }
                    p0.j jVar5 = new p0.j(hVar4, d5, c0113p2, e5, l4, f4, e7, j7, j8, k3, i10, j23, i6.f4589a);
                    iVar2 = iVar;
                    obj = jVar5;
                }
                iVar2.f16b = obj;
                return;
            }
        }
        iVar.f15a = z4;
    }

    @Override // p0.i
    public final boolean d(AbstractC0732e abstractC0732e, boolean z3, B.b bVar, e0.l lVar) {
        long j3;
        boolean z4;
        if (!z3) {
            return false;
        }
        n nVar = this.f4604h;
        if (nVar != null) {
            long j4 = nVar.f4624d;
            if (j4 != -9223372036854775807L && j4 < abstractC0732e.f8784s) {
                z4 = true;
            } else {
                z4 = false;
            }
            o oVar = nVar.f4625e;
            if (oVar.f4631r.f4716d) {
                if (!oVar.f4633t) {
                    if (z4) {
                        if (oVar.f4632s) {
                            oVar.f4633t = true;
                            oVar.f4632s = false;
                            g gVar = oVar.f4627n.f4544n;
                            gVar.f4570P.removeCallbacks(gVar.f4564I);
                            gVar.B();
                        }
                    }
                }
                return true;
            }
        }
        boolean z5 = this.f4607k.f4716d;
        i[] iVarArr = this.f4605i;
        if (!z5 && (abstractC0732e instanceof p0.l)) {
            IOException iOException = (IOException) bVar.f23n;
            if ((iOException instanceof w) && ((w) iOException).f2804p == 404) {
                i iVar = iVarArr[this.f4606j.i(abstractC0732e.f8781p)];
                long d3 = iVar.d();
                if (d3 != -1 && d3 != 0) {
                    h hVar = iVar.f4592d;
                    AbstractC0123a.k(hVar);
                    if (((p0.l) abstractC0732e).a() > ((hVar.k() + iVar.f4594f) + d3) - 1) {
                        this.f4610n = true;
                        return true;
                    }
                }
            }
        }
        i iVar2 = iVarArr[this.f4606j.i(abstractC0732e.f8781p)];
        I i3 = iVar2.f4590b.f4762n;
        C0059m c0059m = this.f4598b;
        C0222b m3 = c0059m.m(i3);
        C0222b c0222b = iVar2.f4591c;
        if (m3 != null && !c0222b.equals(m3)) {
            return true;
        }
        s sVar = this.f4606j;
        I i4 = iVar2.f4590b.f4762n;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (sVar.o(elapsedRealtime, i6)) {
                i5++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < i4.size(); i7++) {
            hashSet.add(Integer.valueOf(((C0222b) i4.get(i7)).f4711c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList a3 = c0059m.a(i4);
        for (int i8 = 0; i8 < a3.size(); i8++) {
            hashSet2.add(Integer.valueOf(((C0222b) a3.get(i8)).f4711c));
        }
        s0.h hVar2 = new s0.h(size, size - hashSet2.size(), length, i5);
        if (!hVar2.a(2) && !hVar2.a(1)) {
            return false;
        }
        lVar.getClass();
        C0255e t3 = e0.l.t(hVar2, bVar);
        if (t3 != null) {
            int i9 = t3.f5183a;
            if (hVar2.a(i9)) {
                long j5 = t3.f5184b;
                if (i9 == 2) {
                    s sVar2 = this.f4606j;
                    return sVar2.r(j5, sVar2.i(abstractC0732e.f8781p));
                } else if (i9 == 1) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j5;
                    String str = c0222b.f4710b;
                    HashMap hashMap = (HashMap) c0059m.f650m;
                    if (hashMap.containsKey(str)) {
                        int i10 = A.f2405a;
                        j3 = Math.max(elapsedRealtime2, ((Long) hashMap.get(str)).longValue());
                    } else {
                        j3 = elapsedRealtime2;
                    }
                    hashMap.put(str, Long.valueOf(j3));
                    int i11 = c0222b.f4711c;
                    if (i11 == Integer.MIN_VALUE) {
                        return true;
                    }
                    Integer valueOf = Integer.valueOf(i11);
                    HashMap hashMap2 = (HashMap) c0059m.f651n;
                    if (hashMap2.containsKey(valueOf)) {
                        int i12 = A.f2405a;
                        elapsedRealtime2 = Math.max(elapsedRealtime2, ((Long) hashMap2.get(valueOf)).longValue());
                    }
                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override // p0.i
    public final boolean e(long j3, AbstractC0732e abstractC0732e, List list) {
        if (this.f4609m != null) {
            return false;
        }
        return this.f4606j.q(j3, abstractC0732e, list);
    }

    @Override // p0.i
    public final int f(long j3, List list) {
        if (this.f4609m == null && this.f4606j.length() >= 2) {
            return this.f4606j.n(j3, list);
        }
        return list.size();
    }

    @Override // p0.i
    public final void g(AbstractC0732e abstractC0732e) {
        w0.j jVar;
        if (abstractC0732e instanceof p0.k) {
            int i3 = this.f4606j.i(((p0.k) abstractC0732e).f8781p);
            i[] iVarArr = this.f4605i;
            i iVar = iVarArr[i3];
            if (iVar.f4592d == null) {
                C0731d c0731d = iVar.f4589a;
                AbstractC0123a.k(c0731d);
                InterfaceC0890A interfaceC0890A = c0731d.f8776t;
                if (interfaceC0890A instanceof w0.j) {
                    jVar = (w0.j) interfaceC0890A;
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    c0.m mVar = iVar.f4590b;
                    E0.c cVar = new E0.c(jVar, mVar.f4763o, 4);
                    iVarArr[i3] = new i(iVar.f4593e, mVar, iVar.f4591c, iVar.f4589a, iVar.f4594f, cVar);
                }
            }
        }
        n nVar = this.f4604h;
        if (nVar != null) {
            long j3 = nVar.f4624d;
            if (j3 == -9223372036854775807L || abstractC0732e.f8785t > j3) {
                nVar.f4624d = abstractC0732e.f8785t;
            }
            nVar.f4625e.f4632s = true;
        }
    }

    public final ArrayList h() {
        List list = this.f4607k.b(this.f4608l).f4747c;
        ArrayList arrayList = new ArrayList();
        for (int i3 : this.f4599c) {
            arrayList.addAll(((C0221a) list.get(i3)).f4705c);
        }
        return arrayList;
    }

    public final i i(int i3) {
        i[] iVarArr = this.f4605i;
        i iVar = iVarArr[i3];
        C0222b m3 = this.f4598b.m(iVar.f4590b.f4762n);
        if (m3 != null && !m3.equals(iVar.f4591c)) {
            i iVar2 = new i(iVar.f4593e, iVar.f4590b, m3, iVar.f4589a, iVar.f4594f, iVar.f4592d);
            iVarArr[i3] = iVar2;
            return iVar2;
        }
        return iVar;
    }

    @Override // p0.i
    public final void release() {
        for (i iVar : this.f4605i) {
            C0731d c0731d = iVar.f4589a;
            if (c0731d != null) {
                c0731d.f8769m.release();
            }
        }
    }
}

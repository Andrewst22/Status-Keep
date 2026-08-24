package p0;

import R.C0113p;
import U.A;
import U.AbstractC0123a;
import Y.P;
import android.net.Uri;
import b0.C0208b;
import g2.C0276a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.T;
import o0.U;
import o0.V;
import o0.W;
import o0.r;
/* renamed from: p0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735h implements U, W, s0.i, s0.l {

    /* renamed from: A  reason: collision with root package name */
    public final C0276a f8792A;

    /* renamed from: B  reason: collision with root package name */
    public AbstractC0732e f8793B;

    /* renamed from: C  reason: collision with root package name */
    public C0113p f8794C;

    /* renamed from: D  reason: collision with root package name */
    public C0208b f8795D;

    /* renamed from: E  reason: collision with root package name */
    public long f8796E;

    /* renamed from: F  reason: collision with root package name */
    public long f8797F;

    /* renamed from: G  reason: collision with root package name */
    public int f8798G;

    /* renamed from: H  reason: collision with root package name */
    public AbstractC0728a f8799H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f8800I;

    /* renamed from: m  reason: collision with root package name */
    public final int f8801m;

    /* renamed from: n  reason: collision with root package name */
    public final int[] f8802n;

    /* renamed from: o  reason: collision with root package name */
    public final C0113p[] f8803o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean[] f8804p;

    /* renamed from: q  reason: collision with root package name */
    public final i f8805q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f8806r;

    /* renamed from: s  reason: collision with root package name */
    public final d0.d f8807s;

    /* renamed from: t  reason: collision with root package name */
    public final e0.l f8808t;

    /* renamed from: u  reason: collision with root package name */
    public final s0.n f8809u;

    /* renamed from: v  reason: collision with root package name */
    public final A.i f8810v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f8811w;
    public final List x;

    /* renamed from: y  reason: collision with root package name */
    public final T f8812y;

    /* renamed from: z  reason: collision with root package name */
    public final T[] f8813z;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, A.i] */
    public C0735h(int i3, int[] iArr, C0113p[] c0113pArr, i iVar, V v3, s0.e eVar, long j3, d0.g gVar, d0.d dVar, e0.l lVar, d0.d dVar2) {
        this.f8801m = i3;
        int i4 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f8802n = iArr;
        this.f8803o = c0113pArr == null ? new C0113p[0] : c0113pArr;
        this.f8805q = iVar;
        this.f8806r = v3;
        this.f8807s = dVar2;
        this.f8808t = lVar;
        this.f8809u = new s0.n("ChunkSampleStream");
        this.f8810v = new Object();
        ArrayList arrayList = new ArrayList();
        this.f8811w = arrayList;
        this.x = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f8813z = new T[length];
        this.f8804p = new boolean[length];
        int i5 = length + 1;
        int[] iArr2 = new int[i5];
        T[] tArr = new T[i5];
        gVar.getClass();
        T t3 = new T(eVar, gVar, dVar);
        this.f8812y = t3;
        iArr2[0] = i3;
        tArr[0] = t3;
        while (i4 < length) {
            T t4 = new T(eVar, null, null);
            this.f8813z[i4] = t4;
            int i6 = i4 + 1;
            tArr[i6] = t4;
            iArr2[i6] = this.f8802n[i4];
            i4 = i6;
        }
        this.f8792A = new C0276a((Object) iArr2, (Object) tArr, 13, false);
        this.f8796E = j3;
        this.f8797F = j3;
    }

    public final int A(int i3, int i4) {
        ArrayList arrayList;
        do {
            i4++;
            arrayList = this.f8811w;
            if (i4 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC0728a) arrayList.get(i4)).e(0) <= i3);
        return i4 - 1;
    }

    public final void B(C0208b c0208b) {
        T[] tArr;
        this.f8795D = c0208b;
        T t3 = this.f8812y;
        t3.j();
        C1.j jVar = t3.f8532h;
        if (jVar != null) {
            jVar.N(t3.f8529e);
            t3.f8532h = null;
            t3.f8531g = null;
        }
        for (T t4 : this.f8813z) {
            t4.j();
            C1.j jVar2 = t4.f8532h;
            if (jVar2 != null) {
                jVar2.N(t4.f8529e);
                t4.f8532h = null;
                t4.f8531g = null;
            }
        }
        this.f8809u.e(this);
    }

    public final void C(long j3) {
        ArrayList arrayList;
        AbstractC0728a abstractC0728a;
        boolean z3;
        boolean G3;
        this.f8797F = j3;
        if (y()) {
            this.f8796E = j3;
            return;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            arrayList = this.f8811w;
            if (i4 >= arrayList.size()) {
                break;
            }
            abstractC0728a = (AbstractC0728a) arrayList.get(i4);
            int i5 = (abstractC0728a.f8784s > j3 ? 1 : (abstractC0728a.f8784s == j3 ? 0 : -1));
            if (i5 == 0 && abstractC0728a.f8755w == -9223372036854775807L) {
                break;
            } else if (i5 > 0) {
                break;
            } else {
                i4++;
            }
        }
        abstractC0728a = null;
        T t3 = this.f8812y;
        if (abstractC0728a != null) {
            G3 = t3.F(abstractC0728a.e(0));
        } else {
            if (j3 < t()) {
                z3 = true;
            } else {
                z3 = false;
            }
            G3 = t3.G(j3, z3);
        }
        T[] tArr = this.f8813z;
        if (G3) {
            this.f8798G = A(t3.r(), 0);
            int length = tArr.length;
            while (i3 < length) {
                tArr[i3].G(j3, true);
                i3++;
            }
            return;
        }
        this.f8796E = j3;
        this.f8800I = false;
        arrayList.clear();
        this.f8798G = 0;
        s0.n nVar = this.f8809u;
        if (nVar.d()) {
            t3.j();
            int length2 = tArr.length;
            while (i3 < length2) {
                tArr[i3].j();
                i3++;
            }
            nVar.b();
            return;
        }
        nVar.f9203o = null;
        t3.D(false);
        for (T t4 : tArr) {
            t4.D(false);
        }
    }

    @Override // o0.U
    public final void a() {
        s0.n nVar = this.f8809u;
        nVar.a();
        this.f8812y.y();
        if (!nVar.d()) {
            this.f8805q.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o0.V] */
    @Override // s0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d1.C0255e c(s0.k r25, long r26, long r28, java.io.IOException r30, int r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            p0.e r1 = (p0.AbstractC0732e) r1
            W.A r2 = r1.f8786u
            long r2 = r2.f2723n
            boolean r4 = r1 instanceof p0.AbstractC0728a
            java.util.ArrayList r5 = r0.f8811w
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            r10 = 0
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 == 0) goto L26
            if (r4 == 0) goto L26
            boolean r2 = r0.x(r6)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = 1
        L27:
            o0.r r12 = new o0.r
            W.A r3 = r1.f8786u
            android.net.Uri r3 = r3.f2724o
            r8 = r28
            r12.<init>(r8)
            long r8 = r1.f8784s
            U.A.Z(r8)
            long r8 = r1.f8785t
            U.A.Z(r8)
            B.b r3 = new B.b
            r8 = r30
            r9 = r31
            r3.<init>(r8, r9)
            p0.i r9 = r0.f8805q
            e0.l r15 = r0.f8808t
            boolean r9 = r9.d(r1, r2, r3, r15)
            r14 = 0
            if (r9 == 0) goto L73
            if (r2 == 0) goto L6c
            if (r4 == 0) goto L69
            p0.a r2 = r0.s(r6)
            if (r2 != r1) goto L5b
            goto L5c
        L5b:
            r7 = 0
        L5c:
            U.AbstractC0123a.j(r7)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L69
            long r4 = r0.f8797F
            r0.f8796E = r4
        L69:
            d1.e r2 = s0.n.f9199q
            goto L74
        L6c:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            U.AbstractC0123a.A(r2, r4)
        L73:
            r2 = r14
        L74:
            if (r2 != 0) goto L90
            r15.getClass()
            long r2 = e0.l.v(r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L8e
            d1.e r4 = new d1.e
            r5 = 0
            r4.<init>(r10, r2, r5)
            r2 = r4
            goto L90
        L8e:
            d1.e r2 = s0.n.f9200r
        L90:
            boolean r3 = r2.a()
            r23 = r3 ^ 1
            d0.d r11 = r0.f8807s
            long r4 = r1.f8784s
            long r6 = r1.f8785t
            int r13 = r1.f8780o
            int r9 = r0.f8801m
            R.p r10 = r1.f8781p
            int r8 = r1.f8782q
            java.lang.Object r1 = r1.f8783r
            r25 = r2
            r2 = r14
            r14 = r9
            r9 = r15
            r15 = r10
            r16 = r8
            r17 = r1
            r18 = r4
            r20 = r6
            r22 = r30
            r11.h(r12, r13, r14, r15, r16, r17, r18, r20, r22, r23)
            if (r3 != 0) goto Lc5
            r0.f8793B = r2
            r9.getClass()
            java.lang.Object r1 = r0.f8806r
            r1.f(r0)
        Lc5:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C0735h.c(s0.k, long, long, java.io.IOException, int):d1.e");
    }

    @Override // o0.W
    public final boolean d() {
        return this.f8809u.d();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, o0.V] */
    @Override // s0.i
    public final void e(s0.k kVar, long j3, long j4, boolean z3) {
        AbstractC0732e abstractC0732e = (AbstractC0732e) kVar;
        this.f8793B = null;
        this.f8799H = null;
        long j5 = abstractC0732e.f8778m;
        Uri uri = abstractC0732e.f8786u.f2724o;
        r rVar = new r(j4);
        this.f8808t.getClass();
        this.f8807s.c(rVar, abstractC0732e.f8780o, this.f8801m, abstractC0732e.f8781p, abstractC0732e.f8782q, abstractC0732e.f8783r, abstractC0732e.f8784s, abstractC0732e.f8785t);
        if (!z3) {
            if (y()) {
                this.f8812y.D(false);
                for (T t3 : this.f8813z) {
                    t3.D(false);
                }
            } else if (abstractC0732e instanceof AbstractC0728a) {
                ArrayList arrayList = this.f8811w;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.f8796E = this.f8797F;
                }
            }
            this.f8806r.f(this);
        }
    }

    @Override // o0.U
    public final boolean f() {
        if (!y() && this.f8812y.w(this.f8800I)) {
            return true;
        }
        return false;
    }

    @Override // o0.W
    public final boolean h(P p3) {
        long j3;
        List list;
        if (!this.f8800I) {
            s0.n nVar = this.f8809u;
            if (!nVar.d() && !nVar.c()) {
                boolean y3 = y();
                if (y3) {
                    list = Collections.emptyList();
                    j3 = this.f8796E;
                } else {
                    j3 = w().f8785t;
                    list = this.x;
                }
                this.f8805q.c(p3, j3, list, this.f8810v);
                A.i iVar = this.f8810v;
                boolean z3 = iVar.f15a;
                AbstractC0732e abstractC0732e = (AbstractC0732e) iVar.f16b;
                iVar.f16b = null;
                iVar.f15a = false;
                if (z3) {
                    this.f8796E = -9223372036854775807L;
                    this.f8800I = true;
                    return true;
                } else if (abstractC0732e == null) {
                    return false;
                } else {
                    this.f8793B = abstractC0732e;
                    boolean z4 = abstractC0732e instanceof AbstractC0728a;
                    C0276a c0276a = this.f8792A;
                    if (z4) {
                        AbstractC0728a abstractC0728a = (AbstractC0728a) abstractC0732e;
                        if (y3) {
                            long j4 = this.f8796E;
                            if (abstractC0728a.f8784s != j4) {
                                this.f8812y.f8544t = j4;
                                for (T t3 : this.f8813z) {
                                    t3.f8544t = this.f8796E;
                                }
                            }
                            this.f8796E = -9223372036854775807L;
                        }
                        abstractC0728a.f8756y = c0276a;
                        T[] tArr = (T[]) c0276a.f5778o;
                        int[] iArr = new int[tArr.length];
                        for (int i3 = 0; i3 < tArr.length; i3++) {
                            T t4 = tArr[i3];
                            iArr[i3] = t4.f8541q + t4.f8540p;
                        }
                        abstractC0728a.f8757z = iArr;
                        this.f8811w.add(abstractC0728a);
                    } else if (abstractC0732e instanceof k) {
                        ((k) abstractC0732e).f8821w = c0276a;
                    }
                    this.f8807s.k(new r(abstractC0732e.f8778m, abstractC0732e.f8779n, nVar.f(abstractC0732e, this, this.f8808t.u(abstractC0732e.f8780o))), abstractC0732e.f8780o, this.f8801m, abstractC0732e.f8781p, abstractC0732e.f8782q, abstractC0732e.f8783r, abstractC0732e.f8784s, abstractC0732e.f8785t);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o0.U
    public final int i(B1.a aVar, X.f fVar, int i3) {
        if (y()) {
            return -3;
        }
        AbstractC0728a abstractC0728a = this.f8799H;
        T t3 = this.f8812y;
        if (abstractC0728a != null && abstractC0728a.e(0) <= t3.r()) {
            return -3;
        }
        z();
        return t3.B(aVar, fVar, i3, this.f8800I);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o0.V] */
    @Override // s0.i
    public final void j(s0.k kVar, long j3, long j4) {
        AbstractC0732e abstractC0732e = (AbstractC0732e) kVar;
        this.f8793B = null;
        this.f8805q.g(abstractC0732e);
        long j5 = abstractC0732e.f8778m;
        Uri uri = abstractC0732e.f8786u.f2724o;
        r rVar = new r(j4);
        this.f8808t.getClass();
        this.f8807s.f(rVar, abstractC0732e.f8780o, this.f8801m, abstractC0732e.f8781p, abstractC0732e.f8782q, abstractC0732e.f8783r, abstractC0732e.f8784s, abstractC0732e.f8785t);
        this.f8806r.f(this);
    }

    @Override // s0.l
    public final void k() {
        this.f8812y.C();
        for (T t3 : this.f8813z) {
            t3.C();
        }
        this.f8805q.release();
        C0208b c0208b = this.f8795D;
        if (c0208b != null) {
            synchronized (c0208b) {
                b0.n nVar = (b0.n) c0208b.f4540z.remove(this);
                if (nVar != null) {
                    nVar.f4621a.C();
                }
            }
        }
    }

    @Override // o0.W
    public final long m() {
        if (this.f8800I) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f8796E;
        }
        long j3 = this.f8797F;
        AbstractC0728a w3 = w();
        if (!w3.d()) {
            ArrayList arrayList = this.f8811w;
            if (arrayList.size() > 1) {
                w3 = (AbstractC0728a) arrayList.get(arrayList.size() - 2);
            } else {
                w3 = null;
            }
        }
        if (w3 != null) {
            j3 = Math.max(j3, w3.f8785t);
        }
        return Math.max(j3, this.f8812y.o());
    }

    @Override // o0.U
    public final int n(long j3) {
        if (y()) {
            return 0;
        }
        T t3 = this.f8812y;
        int t4 = t3.t(j3, this.f8800I);
        AbstractC0728a abstractC0728a = this.f8799H;
        if (abstractC0728a != null) {
            t4 = Math.min(t4, abstractC0728a.e(0) - t3.r());
        }
        t3.H(t4);
        z();
        return t4;
    }

    public final void r(long j3) {
        long j4;
        if (y()) {
            return;
        }
        T t3 = this.f8812y;
        int i3 = t3.f8541q;
        t3.i(j3, true);
        T t4 = this.f8812y;
        int i4 = t4.f8541q;
        if (i4 > i3) {
            synchronized (t4) {
                if (t4.f8540p == 0) {
                    j4 = Long.MIN_VALUE;
                } else {
                    j4 = t4.f8538n[t4.f8542r];
                }
            }
            int i5 = 0;
            while (true) {
                T[] tArr = this.f8813z;
                if (i5 >= tArr.length) {
                    break;
                }
                tArr[i5].i(j4, this.f8804p[i5]);
                i5++;
            }
        }
        int min = Math.min(A(i4, 0), this.f8798G);
        if (min > 0) {
            A.R(this.f8811w, 0, min);
            this.f8798G -= min;
        }
    }

    public final AbstractC0728a s(int i3) {
        ArrayList arrayList = this.f8811w;
        AbstractC0728a abstractC0728a = (AbstractC0728a) arrayList.get(i3);
        A.R(arrayList, i3, arrayList.size());
        this.f8798G = Math.max(this.f8798G, arrayList.size());
        int i4 = 0;
        this.f8812y.l(abstractC0728a.e(0));
        while (true) {
            T[] tArr = this.f8813z;
            if (i4 < tArr.length) {
                T t3 = tArr[i4];
                i4++;
                t3.l(abstractC0728a.e(i4));
            } else {
                return abstractC0728a;
            }
        }
    }

    @Override // o0.W
    public final long t() {
        if (y()) {
            return this.f8796E;
        }
        if (this.f8800I) {
            return Long.MIN_VALUE;
        }
        return w().f8785t;
    }

    @Override // o0.W
    public final void v(long j3) {
        s0.n nVar = this.f8809u;
        if (!nVar.c() && !y()) {
            boolean d3 = nVar.d();
            i iVar = this.f8805q;
            ArrayList arrayList = this.f8811w;
            List list = this.x;
            if (d3) {
                AbstractC0732e abstractC0732e = this.f8793B;
                abstractC0732e.getClass();
                boolean z3 = abstractC0732e instanceof AbstractC0728a;
                if ((!z3 || !x(arrayList.size() - 1)) && iVar.e(j3, abstractC0732e, list)) {
                    nVar.b();
                    if (z3) {
                        this.f8799H = (AbstractC0728a) abstractC0732e;
                        return;
                    }
                    return;
                }
                return;
            }
            int f3 = iVar.f(j3, list);
            if (f3 < arrayList.size()) {
                AbstractC0123a.j(!nVar.d());
                int size = arrayList.size();
                while (true) {
                    if (f3 < size) {
                        if (!x(f3)) {
                            break;
                        }
                        f3++;
                    } else {
                        f3 = -1;
                        break;
                    }
                }
                if (f3 != -1) {
                    long j4 = w().f8785t;
                    AbstractC0728a s3 = s(f3);
                    if (arrayList.isEmpty()) {
                        this.f8796E = this.f8797F;
                    }
                    this.f8800I = false;
                    this.f8807s.m(new l0.g(1, this.f8801m, null, 3, null, A.Z(s3.f8784s), A.Z(j4)));
                }
            }
        }
    }

    public final AbstractC0728a w() {
        ArrayList arrayList = this.f8811w;
        return (AbstractC0728a) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x(int i3) {
        int r3;
        AbstractC0728a abstractC0728a = (AbstractC0728a) this.f8811w.get(i3);
        if (this.f8812y.r() > abstractC0728a.e(0)) {
            return true;
        }
        int i4 = 0;
        do {
            T[] tArr = this.f8813z;
            if (i4 >= tArr.length) {
                return false;
            }
            r3 = tArr[i4].r();
            i4++;
        } while (r3 <= abstractC0728a.e(i4));
        return true;
    }

    public final boolean y() {
        if (this.f8796E != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        int A3 = A(this.f8812y.r(), this.f8798G - 1);
        while (true) {
            int i3 = this.f8798G;
            if (i3 <= A3) {
                this.f8798G = i3 + 1;
                AbstractC0728a abstractC0728a = (AbstractC0728a) this.f8811w.get(i3);
                C0113p c0113p = abstractC0728a.f8781p;
                if (!c0113p.equals(this.f8794C)) {
                    this.f8807s.a(this.f8801m, c0113p, abstractC0728a.f8782q, abstractC0728a.f8783r, abstractC0728a.f8784s);
                }
                this.f8794C = c0113p;
            } else {
                return;
            }
        }
    }
}

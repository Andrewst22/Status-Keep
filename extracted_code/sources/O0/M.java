package o0;

import K.C0059m;
import R.C0112o;
import R.C0113p;
import U.AbstractC0123a;
import Y.l0;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w0.InterfaceC0890A;
/* loaded from: classes.dex */
public final class M implements InterfaceC0699x, w0.q, s0.i, s0.l, S {

    /* renamed from: Z  reason: collision with root package name */
    public static final Map f8455Z;

    /* renamed from: a0  reason: collision with root package name */
    public static final C0113p f8456a0;

    /* renamed from: C  reason: collision with root package name */
    public InterfaceC0698w f8459C;

    /* renamed from: D  reason: collision with root package name */
    public J0.b f8460D;

    /* renamed from: G  reason: collision with root package name */
    public boolean f8463G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f8464H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f8465I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f8466J;

    /* renamed from: K  reason: collision with root package name */
    public C0059m f8467K;
    public InterfaceC0890A L;

    /* renamed from: M  reason: collision with root package name */
    public long f8468M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f8469N;

    /* renamed from: P  reason: collision with root package name */
    public boolean f8471P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f8472Q;

    /* renamed from: R  reason: collision with root package name */
    public int f8473R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f8474S;

    /* renamed from: T  reason: collision with root package name */
    public long f8475T;

    /* renamed from: V  reason: collision with root package name */
    public boolean f8477V;

    /* renamed from: W  reason: collision with root package name */
    public int f8478W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f8479X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f8480Y;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f8481m;

    /* renamed from: n  reason: collision with root package name */
    public final W.h f8482n;

    /* renamed from: o  reason: collision with root package name */
    public final d0.g f8483o;

    /* renamed from: p  reason: collision with root package name */
    public final e0.l f8484p;

    /* renamed from: q  reason: collision with root package name */
    public final d0.d f8485q;

    /* renamed from: r  reason: collision with root package name */
    public final d0.d f8486r;

    /* renamed from: s  reason: collision with root package name */
    public final O f8487s;

    /* renamed from: t  reason: collision with root package name */
    public final s0.e f8488t;

    /* renamed from: u  reason: collision with root package name */
    public final long f8489u;

    /* renamed from: v  reason: collision with root package name */
    public final long f8490v;
    public final B1.e x;

    /* renamed from: w  reason: collision with root package name */
    public final s0.n f8491w = new s0.n("ProgressiveMediaPeriod");

    /* renamed from: y  reason: collision with root package name */
    public final U.c f8492y = new Object();

    /* renamed from: z  reason: collision with root package name */
    public final H f8493z = new H(this, 1);

    /* renamed from: A  reason: collision with root package name */
    public final H f8457A = new H(this, 2);

    /* renamed from: B  reason: collision with root package name */
    public final Handler f8458B = U.A.n(null);

    /* renamed from: F  reason: collision with root package name */
    public L[] f8462F = new L[0];

    /* renamed from: E  reason: collision with root package name */
    public T[] f8461E = new T[0];

    /* renamed from: U  reason: collision with root package name */
    public long f8476U = -9223372036854775807L;

    /* renamed from: O  reason: collision with root package name */
    public int f8470O = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f8455Z = Collections.unmodifiableMap(hashMap);
        C0112o c0112o = new C0112o();
        c0112o.f1926a = "icy";
        c0112o.f1937l = R.G.l("application/x-icy");
        f8456a0 = new C0113p(c0112o);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, U.c] */
    public M(Uri uri, W.h hVar, B1.e eVar, d0.g gVar, d0.d dVar, e0.l lVar, d0.d dVar2, O o3, s0.e eVar2, int i3, long j3) {
        this.f8481m = uri;
        this.f8482n = hVar;
        this.f8483o = gVar;
        this.f8486r = dVar;
        this.f8484p = lVar;
        this.f8485q = dVar2;
        this.f8487s = o3;
        this.f8488t = eVar2;
        this.f8489u = i3;
        this.x = eVar;
        this.f8490v = j3;
    }

    public final void A(int i3) {
        f();
        C0059m c0059m = this.f8467K;
        boolean[] zArr = (boolean[]) c0059m.f653p;
        if (!zArr[i3]) {
            C0113p c0113p = ((b0) c0059m.f650m).a(i3).f1824d[0];
            this.f8485q.a(R.G.g(c0113p.f1974m), c0113p, 0, null, this.f8475T);
            zArr[i3] = true;
        }
    }

    public final void B(int i3) {
        f();
        boolean[] zArr = (boolean[]) this.f8467K.f651n;
        if (this.f8477V && zArr[i3] && !this.f8461E[i3].w(false)) {
            this.f8476U = 0L;
            this.f8477V = false;
            this.f8472Q = true;
            this.f8475T = 0L;
            this.f8478W = 0;
            for (T t3 : this.f8461E) {
                t3.D(false);
            }
            InterfaceC0698w interfaceC0698w = this.f8459C;
            interfaceC0698w.getClass();
            interfaceC0698w.f(this);
        }
    }

    public final w0.G C(L l3) {
        int length = this.f8461E.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (l3.equals(this.f8462F[i3])) {
                return this.f8461E[i3];
            }
        }
        if (this.f8463G) {
            AbstractC0123a.A("ProgressiveMediaPeriod", "Extractor added new track (id=" + l3.f8453a + ") after finishing tracks.");
            return new w0.n();
        }
        d0.d dVar = this.f8486r;
        d0.g gVar = this.f8483o;
        gVar.getClass();
        T t3 = new T(this.f8488t, gVar, dVar);
        t3.f8530f = this;
        int i4 = length + 1;
        L[] lArr = (L[]) Arrays.copyOf(this.f8462F, i4);
        lArr[length] = l3;
        int i5 = U.A.f2405a;
        this.f8462F = lArr;
        T[] tArr = (T[]) Arrays.copyOf(this.f8461E, i4);
        tArr[length] = t3;
        this.f8461E = tArr;
        return t3;
    }

    public final void D() {
        J j3 = new J(this, this.f8481m, this.f8482n, this.x, this, this.f8492y);
        if (this.f8464H) {
            AbstractC0123a.j(y());
            long j4 = this.f8468M;
            if (j4 != -9223372036854775807L && this.f8476U > j4) {
                this.f8479X = true;
                this.f8476U = -9223372036854775807L;
                return;
            }
            InterfaceC0890A interfaceC0890A = this.L;
            interfaceC0890A.getClass();
            long j5 = interfaceC0890A.i(this.f8476U).f9661a.f9510b;
            long j6 = this.f8476U;
            j3.f8444s.f1989a = j5;
            j3.f8447v = j6;
            j3.f8446u = true;
            j3.f8449y = false;
            for (T t3 : this.f8461E) {
                t3.f8544t = this.f8476U;
            }
            this.f8476U = -9223372036854775807L;
        }
        this.f8478W = i();
        this.f8485q.k(new r(j3.f8438m, j3.f8448w, this.f8491w.f(j3, this, this.f8484p.u(this.f8470O))), 1, -1, null, 0, null, j3.f8447v, this.f8468M);
    }

    public final boolean E() {
        if (!this.f8472Q && !y()) {
            return false;
        }
        return true;
    }

    @Override // o0.S
    public final void a() {
        this.f8458B.post(this.f8493z);
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        f();
        if (!this.L.c()) {
            return 0L;
        }
        w0.z i3 = this.L.i(j3);
        return l0Var.a(j3, i3.f9661a.f9509a, i3.f9662b.f9509a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // s0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d1.C0255e c(s0.k r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.M.c(s0.k, long, long, java.io.IOException, int):d1.e");
    }

    @Override // o0.W
    public final boolean d() {
        boolean z3;
        if (this.f8491w.d()) {
            U.c cVar = this.f8492y;
            synchronized (cVar) {
                z3 = cVar.f2428a;
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    @Override // s0.i
    public final void e(s0.k kVar, long j3, long j4, boolean z3) {
        J j5 = (J) kVar;
        Uri uri = j5.f8440o.f2724o;
        r rVar = new r(j4);
        this.f8484p.getClass();
        this.f8485q.c(rVar, 1, -1, null, 0, null, j5.f8447v, this.f8468M);
        if (!z3) {
            for (T t3 : this.f8461E) {
                t3.D(false);
            }
            if (this.f8473R > 0) {
                InterfaceC0698w interfaceC0698w = this.f8459C;
                interfaceC0698w.getClass();
                interfaceC0698w.f(this);
            }
        }
    }

    public final void f() {
        AbstractC0123a.j(this.f8464H);
        this.f8467K.getClass();
        this.L.getClass();
    }

    @Override // o0.InterfaceC0699x
    public final b0 g() {
        f();
        return (b0) this.f8467K.f650m;
    }

    @Override // o0.W
    public final boolean h(Y.P p3) {
        if (!this.f8479X) {
            s0.n nVar = this.f8491w;
            if (!nVar.c() && !this.f8477V) {
                if (!this.f8464H || this.f8473R != 0) {
                    boolean b3 = this.f8492y.b();
                    if (!nVar.d()) {
                        D();
                        return true;
                    }
                    return b3;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int i() {
        T[] tArr;
        int i3 = 0;
        for (T t3 : this.f8461E) {
            i3 += t3.f8541q + t3.f8540p;
        }
        return i3;
    }

    @Override // s0.i
    public final void j(s0.k kVar, long j3, long j4) {
        InterfaceC0890A interfaceC0890A;
        long j5;
        J j6 = (J) kVar;
        if (this.f8468M == -9223372036854775807L && (interfaceC0890A = this.L) != null) {
            boolean c3 = interfaceC0890A.c();
            long x = x(true);
            if (x == Long.MIN_VALUE) {
                j5 = 0;
            } else {
                j5 = x + 10000;
            }
            this.f8468M = j5;
            this.f8487s.x(j5, c3, this.f8469N);
        }
        Uri uri = j6.f8440o.f2724o;
        r rVar = new r(j4);
        this.f8484p.getClass();
        this.f8485q.f(rVar, 1, -1, null, 0, null, j6.f8447v, this.f8468M);
        this.f8479X = true;
        InterfaceC0698w interfaceC0698w = this.f8459C;
        interfaceC0698w.getClass();
        interfaceC0698w.f(this);
    }

    @Override // s0.l
    public final void k() {
        for (T t3 : this.f8461E) {
            t3.C();
        }
        B1.e eVar = this.x;
        w0.o oVar = (w0.o) eVar.f57o;
        if (oVar != null) {
            oVar.release();
            eVar.f57o = null;
        }
        eVar.f58p = null;
    }

    @Override // o0.InterfaceC0699x
    public final void l(InterfaceC0698w interfaceC0698w, long j3) {
        this.f8459C = interfaceC0698w;
        this.f8492y.b();
        D();
    }

    @Override // o0.W
    public final long m() {
        long j3;
        boolean z3;
        f();
        if (this.f8479X || this.f8473R == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f8476U;
        }
        if (this.f8465I) {
            int length = this.f8461E.length;
            j3 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < length; i3++) {
                C0059m c0059m = this.f8467K;
                if (((boolean[]) c0059m.f651n)[i3] && ((boolean[]) c0059m.f652o)[i3]) {
                    T t3 = this.f8461E[i3];
                    synchronized (t3) {
                        z3 = t3.f8547w;
                    }
                    if (!z3) {
                        j3 = Math.min(j3, this.f8461E[i3].o());
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = x(false);
        }
        if (j3 == Long.MIN_VALUE) {
            return this.f8475T;
        }
        return j3;
    }

    @Override // w0.q
    public final void n(InterfaceC0890A interfaceC0890A) {
        this.f8458B.post(new U.n(10, this, interfaceC0890A));
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        int u3 = this.f8484p.u(this.f8470O);
        s0.n nVar = this.f8491w;
        IOException iOException = nVar.f9203o;
        if (iOException == null) {
            s0.j jVar = nVar.f9202n;
            if (jVar != null) {
                if (u3 == Integer.MIN_VALUE) {
                    u3 = jVar.f9188m;
                }
                IOException iOException2 = jVar.f9192q;
                if (iOException2 != null && jVar.f9193r > u3) {
                    throw iOException2;
                }
            }
            if (this.f8479X && !this.f8464H) {
                throw R.H.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    @Override // o0.InterfaceC0699x
    public final long p(r0.s[] sVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j3) {
        boolean z3;
        r0.s sVar;
        boolean z4;
        boolean z5;
        f();
        C0059m c0059m = this.f8467K;
        b0 b0Var = (b0) c0059m.f650m;
        boolean[] zArr3 = (boolean[]) c0059m.f652o;
        int i3 = this.f8473R;
        int i4 = 0;
        for (int i5 = 0; i5 < sVarArr.length; i5++) {
            U u3 = uArr[i5];
            if (u3 != null && (sVarArr[i5] == null || !zArr[i5])) {
                int i6 = ((K) u3).f8451m;
                AbstractC0123a.j(zArr3[i6]);
                this.f8473R--;
                zArr3[i6] = false;
                uArr[i5] = null;
            }
        }
        if (!this.f8471P ? !(j3 == 0 || this.f8466J) : i3 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        for (int i7 = 0; i7 < sVarArr.length; i7++) {
            if (uArr[i7] == null && (sVar = sVarArr[i7]) != null) {
                if (sVar.length() == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0123a.j(z4);
                if (sVar.k(0) == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                AbstractC0123a.j(z5);
                int b3 = b0Var.b(sVar.b());
                AbstractC0123a.j(!zArr3[b3]);
                this.f8473R++;
                zArr3[b3] = true;
                uArr[i7] = new K(this, b3);
                zArr2[i7] = true;
                if (!z3) {
                    T t3 = this.f8461E[b3];
                    if (t3.r() != 0 && !t3.G(j3, true)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
        }
        if (this.f8473R == 0) {
            this.f8477V = false;
            this.f8472Q = false;
            s0.n nVar = this.f8491w;
            if (nVar.d()) {
                T[] tArr = this.f8461E;
                int length = tArr.length;
                while (i4 < length) {
                    tArr[i4].j();
                    i4++;
                }
                nVar.b();
            } else {
                this.f8479X = false;
                for (T t4 : this.f8461E) {
                    t4.D(false);
                }
            }
        } else if (z3) {
            j3 = q(j3);
            while (i4 < uArr.length) {
                if (uArr[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.f8471P = true;
        return j3;
    }

    @Override // o0.InterfaceC0699x
    public final long q(long j3) {
        boolean z3;
        boolean G3;
        f();
        boolean[] zArr = (boolean[]) this.f8467K.f651n;
        if (!this.L.c()) {
            j3 = 0;
        }
        this.f8472Q = false;
        this.f8475T = j3;
        if (y()) {
            this.f8476U = j3;
            return j3;
        }
        int i3 = this.f8470O;
        s0.n nVar = this.f8491w;
        if (i3 != 7 && (this.f8479X || nVar.d())) {
            int length = this.f8461E.length;
            for (int i4 = 0; i4 < length; i4++) {
                T t3 = this.f8461E[i4];
                if (this.f8466J) {
                    G3 = t3.F(t3.f8541q);
                } else {
                    G3 = t3.G(j3, false);
                }
                if (!G3 && (zArr[i4] || !this.f8465I)) {
                    z3 = false;
                    break;
                }
            }
            z3 = true;
            if (z3) {
                return j3;
            }
        }
        this.f8477V = false;
        this.f8476U = j3;
        this.f8479X = false;
        if (nVar.d()) {
            for (T t4 : this.f8461E) {
                t4.j();
            }
            nVar.b();
        } else {
            nVar.f9203o = null;
            for (T t5 : this.f8461E) {
                t5.D(false);
            }
        }
        return j3;
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        if (this.f8466J) {
            return;
        }
        f();
        if (y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f8467K.f652o;
        int length = this.f8461E.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f8461E[i3].i(j3, zArr[i3]);
        }
    }

    @Override // w0.q
    public final void s() {
        this.f8463G = true;
        this.f8458B.post(this.f8493z);
    }

    @Override // o0.W
    public final long t() {
        return m();
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        if (this.f8472Q) {
            if (this.f8479X || i() > this.f8478W) {
                this.f8472Q = false;
                return this.f8475T;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // w0.q
    public final w0.G w(int i3, int i4) {
        return C(new L(i3, false));
    }

    public final long x(boolean z3) {
        long j3 = Long.MIN_VALUE;
        for (int i3 = 0; i3 < this.f8461E.length; i3++) {
            if (!z3) {
                C0059m c0059m = this.f8467K;
                c0059m.getClass();
                if (!((boolean[]) c0059m.f652o)[i3]) {
                }
            }
            j3 = Math.max(j3, this.f8461E[i3].o());
        }
        return j3;
    }

    public final boolean y() {
        if (this.f8476U != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        long j3;
        boolean z3;
        boolean z4;
        R.F d3;
        int i3;
        if (!this.f8480Y && !this.f8464H && this.f8463G && this.L != null) {
            for (T t3 : this.f8461E) {
                if (t3.u() == null) {
                    return;
                }
            }
            this.f8492y.a();
            int length = this.f8461E.length;
            R.U[] uArr = new R.U[length];
            boolean[] zArr = new boolean[length];
            int i4 = 0;
            while (true) {
                j3 = this.f8490v;
                if (i4 >= length) {
                    break;
                }
                C0113p u3 = this.f8461E[i4].u();
                u3.getClass();
                String str = u3.f1974m;
                boolean h3 = R.G.h(str);
                if (!h3 && !R.G.k(str)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                zArr[i4] = z3;
                this.f8465I = z3 | this.f8465I;
                boolean i5 = R.G.i(str);
                if (j3 != -9223372036854775807L && length == 1 && i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f8466J = z4;
                J0.b bVar = this.f8460D;
                if (bVar != null) {
                    if (h3 || this.f8462F[i4].f8454b) {
                        R.F f3 = u3.f1972k;
                        if (f3 == null) {
                            d3 = new R.F(bVar);
                        } else {
                            d3 = f3.d(bVar);
                        }
                        C0112o a3 = u3.a();
                        a3.f1935j = d3;
                        u3 = new C0113p(a3);
                    }
                    if (h3 && u3.f1968g == -1 && u3.f1969h == -1 && (i3 = bVar.f486m) != -1) {
                        C0112o a4 = u3.a();
                        a4.f1932g = i3;
                        u3 = new C0113p(a4);
                    }
                }
                int c3 = this.f8483o.c(u3);
                C0112o a5 = u3.a();
                a5.f1925I = c3;
                uArr[i4] = new R.U(Integer.toString(i4), new C0113p(a5));
                i4++;
            }
            this.f8467K = new C0059m(new b0(uArr), zArr);
            if (this.f8466J && this.f8468M == -9223372036854775807L) {
                this.f8468M = j3;
                this.L = new I(this, this.L);
            }
            this.f8487s.x(this.f8468M, this.L.c(), this.f8469N);
            this.f8464H = true;
            InterfaceC0698w interfaceC0698w = this.f8459C;
            interfaceC0698w.getClass();
            interfaceC0698w.j(this);
        }
    }

    @Override // o0.W
    public final void v(long j3) {
    }
}

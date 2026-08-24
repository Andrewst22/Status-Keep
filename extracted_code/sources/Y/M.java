package Y;

import R.C0113p;
import R.C0118v;
import R.C0122z;
import U.AbstractC0123a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o0.C0678b;
import o0.C0701z;
import o0.InterfaceC0698w;
import o0.InterfaceC0699x;
import q0.C0746d;
/* loaded from: classes.dex */
public final class M implements Handler.Callback, InterfaceC0698w, f0 {

    /* renamed from: f0  reason: collision with root package name */
    public static final long f3100f0 = U.A.Z(10000);

    /* renamed from: A  reason: collision with root package name */
    public final ArrayList f3101A;

    /* renamed from: B  reason: collision with root package name */
    public final U.v f3102B;

    /* renamed from: C  reason: collision with root package name */
    public final C0153y f3103C;

    /* renamed from: D  reason: collision with root package name */
    public final V f3104D;

    /* renamed from: E  reason: collision with root package name */
    public final d0 f3105E;

    /* renamed from: F  reason: collision with root package name */
    public final C0138i f3106F;

    /* renamed from: G  reason: collision with root package name */
    public final long f3107G;

    /* renamed from: H  reason: collision with root package name */
    public final Z.m f3108H;

    /* renamed from: I  reason: collision with root package name */
    public l0 f3109I;

    /* renamed from: J  reason: collision with root package name */
    public e0 f3110J;

    /* renamed from: K  reason: collision with root package name */
    public J f3111K;
    public boolean L;

    /* renamed from: N  reason: collision with root package name */
    public boolean f3113N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f3114O;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f3116Q;

    /* renamed from: R  reason: collision with root package name */
    public int f3117R;

    /* renamed from: T  reason: collision with root package name */
    public boolean f3119T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f3120U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f3121V;

    /* renamed from: W  reason: collision with root package name */
    public int f3122W;

    /* renamed from: X  reason: collision with root package name */
    public L f3123X;

    /* renamed from: Y  reason: collision with root package name */
    public long f3124Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f3125Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f3126a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f3127b0;

    /* renamed from: c0  reason: collision with root package name */
    public C0142m f3128c0;

    /* renamed from: e0  reason: collision with root package name */
    public r f3130e0;

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC0135f[] f3131m;

    /* renamed from: n  reason: collision with root package name */
    public final Set f3132n;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC0135f[] f3133o;

    /* renamed from: p  reason: collision with root package name */
    public final r0.u f3134p;

    /* renamed from: q  reason: collision with root package name */
    public final r0.v f3135q;

    /* renamed from: r  reason: collision with root package name */
    public final C0140k f3136r;

    /* renamed from: s  reason: collision with root package name */
    public final s0.d f3137s;

    /* renamed from: t  reason: collision with root package name */
    public final U.x f3138t;

    /* renamed from: u  reason: collision with root package name */
    public final HandlerThread f3139u;

    /* renamed from: v  reason: collision with root package name */
    public final Looper f3140v;

    /* renamed from: w  reason: collision with root package name */
    public final R.S f3141w;
    public final R.Q x;

    /* renamed from: y  reason: collision with root package name */
    public final long f3142y;

    /* renamed from: z  reason: collision with root package name */
    public final X1.f f3143z;

    /* renamed from: S  reason: collision with root package name */
    public boolean f3118S = false;

    /* renamed from: M  reason: collision with root package name */
    public boolean f3112M = false;

    /* renamed from: d0  reason: collision with root package name */
    public long f3129d0 = -9223372036854775807L;

    /* renamed from: P  reason: collision with root package name */
    public long f3115P = -9223372036854775807L;

    public M(AbstractC0135f[] abstractC0135fArr, r0.u uVar, r0.v vVar, C0140k c0140k, s0.d dVar, int i3, Z.f fVar, l0 l0Var, C0138i c0138i, long j3, Looper looper, U.v vVar2, C0153y c0153y, Z.m mVar, r rVar) {
        this.f3103C = c0153y;
        this.f3131m = abstractC0135fArr;
        this.f3134p = uVar;
        this.f3135q = vVar;
        this.f3136r = c0140k;
        this.f3137s = dVar;
        this.f3117R = i3;
        this.f3109I = l0Var;
        this.f3106F = c0138i;
        this.f3107G = j3;
        this.f3102B = vVar2;
        this.f3108H = mVar;
        this.f3130e0 = rVar;
        this.f3142y = c0140k.f3349g;
        R.P p3 = R.T.f1820a;
        e0 i4 = e0.i(vVar);
        this.f3110J = i4;
        this.f3111K = new J(i4);
        this.f3133o = new AbstractC0135f[abstractC0135fArr.length];
        r0.q qVar = (r0.q) uVar;
        qVar.getClass();
        for (int i5 = 0; i5 < abstractC0135fArr.length; i5++) {
            AbstractC0135f abstractC0135f = abstractC0135fArr[i5];
            abstractC0135f.f3280q = i5;
            abstractC0135f.f3281r = mVar;
            abstractC0135f.f3282s = vVar2;
            this.f3133o[i5] = abstractC0135f;
            AbstractC0135f abstractC0135f2 = this.f3133o[i5];
            synchronized (abstractC0135f2.f3276m) {
                abstractC0135f2.f3275C = qVar;
            }
        }
        this.f3143z = new X1.f(this, vVar2);
        this.f3101A = new ArrayList();
        this.f3132n = Collections.newSetFromMap(new IdentityHashMap());
        this.f3141w = new R.S();
        this.x = new R.Q();
        uVar.f8994a = this;
        uVar.f8995b = dVar;
        this.f3127b0 = true;
        U.x a3 = vVar2.a(looper, null);
        this.f3104D = new V(fVar, a3, new B0.a(this, 12), rVar);
        this.f3105E = new d0(this, fVar, a3, mVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f3139u = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f3140v = looper2;
        this.f3138t = vVar2.a(looper2, this);
    }

    public static Pair G(R.T t3, L l3, boolean z3, int i3, boolean z4, R.S s3, R.Q q3) {
        R.T t4;
        Pair i4;
        int H3;
        R.T t5 = l3.f3097a;
        if (t3.p()) {
            return null;
        }
        if (t5.p()) {
            t4 = t3;
        } else {
            t4 = t5;
        }
        try {
            i4 = t4.i(s3, q3, l3.f3098b, l3.f3099c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (t3.equals(t4)) {
            return i4;
        }
        if (t3.b(i4.first) != -1) {
            if (t4.g(i4.first, q3).f1800f && t4.m(q3.f1797c, s3, 0L).f1817n == t4.b(i4.first)) {
                return t3.i(s3, q3, t3.g(i4.first, q3).f1797c, l3.f3099c);
            }
            return i4;
        }
        if (z3 && (H3 = H(s3, q3, i3, z4, i4.first, t4, t3)) != -1) {
            return t3.i(s3, q3, H3, -9223372036854775807L);
        }
        return null;
    }

    public static int H(R.S s3, R.Q q3, int i3, boolean z3, Object obj, R.T t3, R.T t4) {
        Object obj2 = t3.m(t3.g(obj, q3).f1797c, s3, 0L).f1804a;
        for (int i4 = 0; i4 < t4.o(); i4++) {
            if (t4.m(i4, s3, 0L).f1804a.equals(obj2)) {
                return i4;
            }
        }
        int b3 = t3.b(obj);
        int h3 = t3.h();
        int i5 = b3;
        int i6 = -1;
        for (int i7 = 0; i7 < h3 && i6 == -1; i7++) {
            i5 = t3.d(i5, q3, s3, i3, z3);
            if (i5 == -1) {
                break;
            }
            i6 = t4.b(t3.l(i5));
        }
        if (i6 == -1) {
            return -1;
        }
        return t4.f(i6, q3, false).f1797c;
    }

    public static void O(AbstractC0135f abstractC0135f, long j3) {
        abstractC0135f.f3288z = true;
        if (abstractC0135f instanceof C0746d) {
            C0746d c0746d = (C0746d) abstractC0135f;
            AbstractC0123a.j(c0746d.f3288z);
            c0746d.f8879W = j3;
        }
    }

    public static boolean q(AbstractC0135f abstractC0135f) {
        if (abstractC0135f.f3283t != 0) {
            return true;
        }
        return false;
    }

    public final void A(int i3, int i4, o0.X x) {
        boolean z3 = true;
        this.f3111K.c(1);
        d0 d0Var = this.f3105E;
        d0Var.getClass();
        AbstractC0123a.e((i3 < 0 || i3 > i4 || i4 > d0Var.f3233b.size()) ? false : false);
        d0Var.f3241j = x;
        d0Var.g(i3, i4);
        l(d0Var.b(), false);
    }

    public final void B() {
        r0.v vVar;
        boolean z3;
        float f3 = this.f3143z.a().f1779a;
        V v3 = this.f3104D;
        S s3 = v3.f3189i;
        S s4 = v3.f3190j;
        r0.v vVar2 = null;
        S s5 = s3;
        boolean z4 = true;
        while (s5 != null && s5.f3156d) {
            r0.v h3 = s5.h(f3, this.f3110J.f3253a);
            if (s5 == this.f3104D.f3189i) {
                vVar = h3;
            } else {
                vVar = vVar2;
            }
            r0.v vVar3 = s5.f3166n;
            if (vVar3 != null) {
                int length = vVar3.f8998c.length;
                r0.s[] sVarArr = h3.f8998c;
                if (length == sVarArr.length) {
                    for (int i3 = 0; i3 < sVarArr.length; i3++) {
                        if (h3.a(vVar3, i3)) {
                        }
                    }
                    if (s5 == s4) {
                        z4 = false;
                    }
                    s5 = s5.f3164l;
                    vVar2 = vVar;
                }
            }
            if (z4) {
                V v4 = this.f3104D;
                S s6 = v4.f3189i;
                boolean k3 = v4.k(s6);
                boolean[] zArr = new boolean[this.f3131m.length];
                vVar.getClass();
                long a3 = s6.a(vVar, this.f3110J.f3271s, k3, zArr);
                e0 e0Var = this.f3110J;
                if (e0Var.f3257e != 4 && a3 != e0Var.f3271s) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                e0 e0Var2 = this.f3110J;
                this.f3110J = o(e0Var2.f3254b, a3, e0Var2.f3255c, e0Var2.f3256d, z3, 5);
                if (z3) {
                    E(a3);
                }
                boolean[] zArr2 = new boolean[this.f3131m.length];
                int i4 = 0;
                while (true) {
                    AbstractC0135f[] abstractC0135fArr = this.f3131m;
                    if (i4 >= abstractC0135fArr.length) {
                        break;
                    }
                    AbstractC0135f abstractC0135f = abstractC0135fArr[i4];
                    boolean q3 = q(abstractC0135f);
                    zArr2[i4] = q3;
                    o0.U u3 = s6.f3155c[i4];
                    if (q3) {
                        if (u3 != abstractC0135f.f3284u) {
                            b(abstractC0135f);
                        } else if (zArr[i4]) {
                            long j3 = this.f3124Y;
                            abstractC0135f.f3288z = false;
                            abstractC0135f.x = j3;
                            abstractC0135f.f3287y = j3;
                            abstractC0135f.o(j3, false);
                            i4++;
                        }
                    }
                    i4++;
                }
                d(zArr2, this.f3124Y);
            } else {
                this.f3104D.k(s5);
                if (s5.f3156d) {
                    s5.a(h3, Math.max(s5.f3158f.f3169b, this.f3124Y - s5.f3167o), false, new boolean[s5.f3161i.length]);
                }
            }
            k(true);
            if (this.f3110J.f3257e != 4) {
                s();
                h0();
                this.f3138t.e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.M.C(boolean, boolean, boolean, boolean):void");
    }

    public final void D() {
        boolean z3;
        S s3 = this.f3104D.f3189i;
        if (s3 != null && s3.f3158f.f3175h && this.f3112M) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3113N = z3;
    }

    public final void E(long j3) {
        V v3;
        long j4;
        AbstractC0135f[] abstractC0135fArr;
        r0.s[] sVarArr;
        S s3 = this.f3104D.f3189i;
        if (s3 == null) {
            j4 = 1000000000000L;
        } else {
            j4 = s3.f3167o;
        }
        long j5 = j3 + j4;
        this.f3124Y = j5;
        ((m0) this.f3143z.f3009o).d(j5);
        for (AbstractC0135f abstractC0135f : this.f3131m) {
            if (q(abstractC0135f)) {
                long j6 = this.f3124Y;
                abstractC0135f.f3288z = false;
                abstractC0135f.x = j6;
                abstractC0135f.f3287y = j6;
                abstractC0135f.o(j6, false);
            }
        }
        for (S s4 = v3.f3189i; s4 != null; s4 = s4.f3164l) {
            for (r0.s sVar : s4.f3166n.f8998c) {
                if (sVar != null) {
                    sVar.m();
                }
            }
        }
    }

    public final void F(R.T t3, R.T t4) {
        if (t3.p() && t4.p()) {
            return;
        }
        ArrayList arrayList = this.f3101A;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            D2.h.q(arrayList.get(size));
            throw null;
        }
    }

    public final void I(long j3) {
        long j4;
        if (this.f3110J.f3257e == 3 && !Z()) {
            j4 = 1000;
        } else {
            j4 = f3100f0;
        }
        this.f3138t.f2486a.sendEmptyMessageAtTime(2, j3 + j4);
    }

    public final void J(boolean z3) {
        C0701z c0701z = this.f3104D.f3189i.f3158f.f3168a;
        long L = L(c0701z, this.f3110J.f3271s, true, false);
        if (L != this.f3110J.f3271s) {
            e0 e0Var = this.f3110J;
            this.f3110J = o(c0701z, L, e0Var.f3255c, e0Var.f3256d, z3, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [o0.x, java.lang.Object] */
    public final void K(L l3) {
        long j3;
        boolean z3;
        long j4;
        long j5;
        boolean z4;
        C0701z c0701z;
        long j6;
        long j7;
        boolean z5;
        boolean z6;
        long j8;
        long j9;
        e0 e0Var;
        int i3;
        boolean z7 = true;
        this.f3111K.c(1);
        Pair G3 = G(this.f3110J.f3253a, l3, true, this.f3117R, this.f3118S, this.f3141w, this.x);
        if (G3 == null) {
            Pair g3 = g(this.f3110J.f3253a);
            c0701z = (C0701z) g3.first;
            long longValue = ((Long) g3.second).longValue();
            z4 = !this.f3110J.f3253a.p();
            j4 = longValue;
            j5 = -9223372036854775807L;
        } else {
            Object obj = G3.first;
            long longValue2 = ((Long) G3.second).longValue();
            if (l3.f3099c == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j3 = longValue2;
            }
            C0701z m3 = this.f3104D.m(this.f3110J.f3253a, obj, longValue2);
            if (m3.b()) {
                this.f3110J.f3253a.g(m3.f8653a, this.x);
                if (this.x.e(m3.f8654b) == m3.f8655c) {
                    this.x.f1801g.getClass();
                }
                j4 = 0;
                j5 = j3;
                z4 = true;
            } else {
                if (l3.f3099c == -9223372036854775807L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                j4 = longValue2;
                j5 = j3;
                z4 = z3;
            }
            c0701z = m3;
        }
        try {
            if (this.f3110J.f3253a.p()) {
                this.f3123X = l3;
            } else if (G3 == null) {
                if (this.f3110J.f3257e != 1) {
                    Y(4);
                }
                C(false, true, false, true);
            } else {
                if (c0701z.equals(this.f3110J.f3254b)) {
                    S s3 = this.f3104D.f3189i;
                    if (s3 != null && s3.f3156d && j4 != 0) {
                        j9 = s3.f3153a.b(j4, this.f3109I);
                    } else {
                        j9 = j4;
                    }
                    if (U.A.Z(j9) == U.A.Z(this.f3110J.f3271s) && ((i3 = (e0Var = this.f3110J).f3257e) == 2 || i3 == 3)) {
                        long j10 = e0Var.f3271s;
                        this.f3110J = o(c0701z, j10, j5, j10, z4, 2);
                        return;
                    }
                    j7 = j9;
                } else {
                    j7 = j4;
                }
                if (this.f3110J.f3257e == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                V v3 = this.f3104D;
                if (v3.f3189i != v3.f3190j) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                long L = L(c0701z, j7, z6, z5);
                if (j4 == L) {
                    z7 = false;
                }
                z4 |= z7;
                try {
                    e0 e0Var2 = this.f3110J;
                    R.T t3 = e0Var2.f3253a;
                    i0(t3, c0701z, t3, e0Var2.f3254b, j5, true);
                    j8 = L;
                    this.f3110J = o(c0701z, j8, j5, j8, z4, 2);
                } catch (Throwable th) {
                    th = th;
                    j6 = L;
                    this.f3110J = o(c0701z, j6, j5, j6, z4, 2);
                    throw th;
                }
            }
            j8 = j4;
            this.f3110J = o(c0701z, j8, j5, j8, z4, 2);
        } catch (Throwable th2) {
            th = th2;
            j6 = j4;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [o0.x, java.lang.Object] */
    public final long L(C0701z c0701z, long j3, boolean z3, boolean z4) {
        d0();
        j0(false, true);
        if (z4 || this.f3110J.f3257e == 3) {
            Y(2);
        }
        V v3 = this.f3104D;
        S s3 = v3.f3189i;
        S s4 = s3;
        while (s4 != null && !c0701z.equals(s4.f3158f.f3168a)) {
            s4 = s4.f3164l;
        }
        if (z3 || s3 != s4 || (s4 != null && s4.f3167o + j3 < 0)) {
            AbstractC0135f[] abstractC0135fArr = this.f3131m;
            for (AbstractC0135f abstractC0135f : abstractC0135fArr) {
                b(abstractC0135f);
            }
            if (s4 != null) {
                while (v3.f3189i != s4) {
                    v3.a();
                }
                v3.k(s4);
                s4.f3167o = 1000000000000L;
                d(new boolean[abstractC0135fArr.length], v3.f3190j.e());
            }
        }
        if (s4 != null) {
            v3.k(s4);
            if (!s4.f3156d) {
                s4.f3158f = s4.f3158f.b(j3);
            } else if (s4.f3157e) {
                ?? r9 = s4.f3153a;
                j3 = r9.q(j3);
                r9.r(j3 - this.f3142y);
            }
            E(j3);
            s();
        } else {
            v3.b();
            E(j3);
        }
        k(false);
        this.f3138t.e(2);
        return j3;
    }

    public final void M(h0 h0Var) {
        Looper looper = h0Var.f3311f;
        Looper looper2 = this.f3140v;
        U.x xVar = this.f3138t;
        if (looper == looper2) {
            synchronized (h0Var) {
            }
            try {
                h0Var.f3306a.d(h0Var.f3309d, h0Var.f3310e);
                h0Var.b(true);
                int i3 = this.f3110J.f3257e;
                if (i3 == 3 || i3 == 2) {
                    xVar.e(2);
                    return;
                }
                return;
            } catch (Throwable th) {
                h0Var.b(true);
                throw th;
            }
        }
        xVar.a(15, h0Var).b();
    }

    public final void N(h0 h0Var) {
        Looper looper = h0Var.f3311f;
        if (!looper.getThread().isAlive()) {
            AbstractC0123a.A("TAG", "Trying to send message on a dead thread.");
            h0Var.b(false);
            return;
        }
        this.f3102B.a(looper, null).c(new U.n(2, this, h0Var));
    }

    public final void P(boolean z3, AtomicBoolean atomicBoolean) {
        AbstractC0135f[] abstractC0135fArr;
        if (this.f3119T != z3) {
            this.f3119T = z3;
            if (!z3) {
                for (AbstractC0135f abstractC0135f : this.f3131m) {
                    if (!q(abstractC0135f) && this.f3132n.remove(abstractC0135f)) {
                        abstractC0135f.x();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(I i3) {
        this.f3111K.c(1);
        int i4 = i3.f3084c;
        ArrayList arrayList = i3.f3082a;
        o0.X x = i3.f3083b;
        if (i4 != -1) {
            this.f3123X = new L(new j0(arrayList, x), i3.f3084c, i3.f3085d);
        }
        d0 d0Var = this.f3105E;
        ArrayList arrayList2 = d0Var.f3233b;
        d0Var.g(0, arrayList2.size());
        l(d0Var.a(arrayList2.size(), arrayList, x), false);
    }

    public final void R(boolean z3) {
        this.f3112M = z3;
        D();
        if (this.f3113N) {
            V v3 = this.f3104D;
            if (v3.f3190j != v3.f3189i) {
                J(true);
                k(false);
            }
        }
    }

    public final void S(int i3, int i4, boolean z3, boolean z4) {
        r0.s[] sVarArr;
        this.f3111K.c(z4 ? 1 : 0);
        this.f3110J = this.f3110J.d(i4, i3, z3);
        j0(false, false);
        for (S s3 = this.f3104D.f3189i; s3 != null; s3 = s3.f3164l) {
            for (r0.s sVar : s3.f3166n.f8998c) {
                if (sVar != null) {
                    sVar.c(z3);
                }
            }
        }
        if (!Z()) {
            d0();
            h0();
            return;
        }
        int i5 = this.f3110J.f3257e;
        U.x xVar = this.f3138t;
        if (i5 == 3) {
            X1.f fVar = this.f3143z;
            fVar.f3008n = true;
            ((m0) fVar.f3009o).f();
            b0();
            xVar.e(2);
        } else if (i5 == 2) {
            xVar.e(2);
        }
    }

    public final void T(R.J j3) {
        this.f3138t.d(16);
        X1.f fVar = this.f3143z;
        fVar.b(j3);
        R.J a3 = fVar.a();
        n(a3, a3.f1779a, true, true);
    }

    public final void U(r rVar) {
        this.f3130e0 = rVar;
        R.T t3 = this.f3110J.f3253a;
        V v3 = this.f3104D;
        v3.getClass();
        rVar.getClass();
        if (!v3.f3195o.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < v3.f3195o.size(); i3++) {
                ((S) v3.f3195o.get(i3)).g();
            }
            v3.f3195o = arrayList;
        }
    }

    public final void V(int i3) {
        this.f3117R = i3;
        R.T t3 = this.f3110J.f3253a;
        V v3 = this.f3104D;
        v3.f3187g = i3;
        if (!v3.o(t3)) {
            J(true);
        }
        k(false);
    }

    public final void W(boolean z3) {
        this.f3118S = z3;
        R.T t3 = this.f3110J.f3253a;
        V v3 = this.f3104D;
        v3.f3188h = z3;
        if (!v3.o(t3)) {
            J(true);
        }
        k(false);
    }

    public final void X(o0.X x) {
        this.f3111K.c(1);
        d0 d0Var = this.f3105E;
        int size = d0Var.f3233b.size();
        if (x.f8551b.length != size) {
            x = new o0.X(new Random(x.f8550a.nextLong())).a(size);
        }
        d0Var.f3241j = x;
        l(d0Var.b(), false);
    }

    public final void Y(int i3) {
        e0 e0Var = this.f3110J;
        if (e0Var.f3257e != i3) {
            if (i3 != 2) {
                this.f3129d0 = -9223372036854775807L;
            }
            this.f3110J = e0Var.g(i3);
        }
    }

    public final boolean Z() {
        e0 e0Var = this.f3110J;
        if (e0Var.f3264l && e0Var.f3266n == 0) {
            return true;
        }
        return false;
    }

    public final void a(I i3, int i4) {
        this.f3111K.c(1);
        d0 d0Var = this.f3105E;
        if (i4 == -1) {
            i4 = d0Var.f3233b.size();
        }
        l(d0Var.a(i4, i3.f3082a, i3.f3083b), false);
    }

    public final boolean a0(R.T t3, C0701z c0701z) {
        if (c0701z.b() || t3.p()) {
            return false;
        }
        int i3 = t3.g(c0701z.f8653a, this.x).f1797c;
        R.S s3 = this.f3141w;
        t3.n(i3, s3);
        if (!s3.a() || !s3.f1812i || s3.f1809f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    public final void b(AbstractC0135f abstractC0135f) {
        boolean z3;
        boolean z4;
        if (!q(abstractC0135f)) {
            return;
        }
        X1.f fVar = this.f3143z;
        if (abstractC0135f == ((AbstractC0135f) fVar.f3011q)) {
            fVar.f3012r = null;
            fVar.f3011q = null;
            fVar.f3007m = true;
        }
        int i3 = abstractC0135f.f3283t;
        if (i3 == 2) {
            if (i3 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            AbstractC0123a.j(z4);
            abstractC0135f.f3283t = 1;
            abstractC0135f.s();
        }
        if (abstractC0135f.f3283t == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        abstractC0135f.f3278o.y();
        abstractC0135f.f3283t = 0;
        abstractC0135f.f3284u = null;
        abstractC0135f.f3285v = null;
        abstractC0135f.f3288z = false;
        abstractC0135f.m();
        this.f3122W--;
    }

    public final void b0() {
        S s3 = this.f3104D.f3189i;
        if (s3 == null) {
            return;
        }
        r0.v vVar = s3.f3166n;
        int i3 = 0;
        while (true) {
            AbstractC0135f[] abstractC0135fArr = this.f3131m;
            if (i3 < abstractC0135fArr.length) {
                if (vVar.b(i3)) {
                    AbstractC0135f abstractC0135f = abstractC0135fArr[i3];
                    int i4 = abstractC0135f.f3283t;
                    boolean z3 = true;
                    if (i4 == 1) {
                        if (i4 != 1) {
                            z3 = false;
                        }
                        AbstractC0123a.j(z3);
                        abstractC0135f.f3283t = 2;
                        abstractC0135f.r();
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x05bd, code lost:
        if (r2 >= r6.b()) goto L266;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x035d A[EDGE_INSN: B:461:0x035d->B:200:0x035d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Type inference failed for: r1v2, types: [o0.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v80, types: [o0.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v91, types: [o0.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [o0.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v74, types: [o0.W, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.M.c():void");
    }

    public final void c0(boolean z3, boolean z4) {
        boolean z5;
        if (!z3 && this.f3119T) {
            z5 = false;
        } else {
            z5 = true;
        }
        C(z5, false, true, false);
        this.f3111K.c(z4 ? 1 : 0);
        C0140k c0140k = this.f3136r;
        if (c0140k.f3350h.remove(this.f3108H) != null) {
            c0140k.d();
        }
        Y(1);
    }

    public final void d(boolean[] zArr, long j3) {
        AbstractC0135f[] abstractC0135fArr;
        Set set;
        int i3;
        V v3;
        S s3;
        r0.v vVar;
        Set set2;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Q q3;
        V v4 = this.f3104D;
        S s4 = v4.f3190j;
        r0.v vVar2 = s4.f3166n;
        int i5 = 0;
        while (true) {
            abstractC0135fArr = this.f3131m;
            int length = abstractC0135fArr.length;
            set = this.f3132n;
            if (i5 >= length) {
                break;
            }
            if (!vVar2.b(i5) && set.remove(abstractC0135fArr[i5])) {
                abstractC0135fArr[i5].x();
            }
            i5++;
        }
        int i6 = 0;
        while (i6 < abstractC0135fArr.length) {
            if (vVar2.b(i6)) {
                boolean z8 = zArr[i6];
                AbstractC0135f abstractC0135f = abstractC0135fArr[i6];
                if (!q(abstractC0135f)) {
                    S s5 = v4.f3190j;
                    if (s5 == v4.f3189i) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    r0.v vVar3 = s5.f3166n;
                    k0 k0Var = vVar3.f8997b[i6];
                    r0.s sVar = vVar3.f8998c[i6];
                    if (sVar != null) {
                        v3 = v4;
                        i4 = sVar.length();
                    } else {
                        v3 = v4;
                        i4 = 0;
                    }
                    C0113p[] c0113pArr = new C0113p[i4];
                    vVar = vVar2;
                    for (int i7 = 0; i7 < i4; i7++) {
                        c0113pArr[i7] = sVar.g(i7);
                    }
                    if (Z() && this.f3110J.f3257e == 3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z8 && z4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.f3122W++;
                    set.add(abstractC0135f);
                    o0.U u3 = s5.f3155c[i6];
                    s3 = s4;
                    boolean z9 = z4;
                    long j4 = s5.f3167o;
                    T t3 = s5.f3158f;
                    if (abstractC0135f.f3283t == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    AbstractC0123a.j(z6);
                    abstractC0135f.f3279p = k0Var;
                    abstractC0135f.f3283t = 1;
                    abstractC0135f.n(z5, z3);
                    boolean z10 = z3;
                    i3 = i6;
                    set2 = set;
                    abstractC0135f.w(c0113pArr, u3, j3, j4, t3.f3168a);
                    abstractC0135f.f3288z = false;
                    abstractC0135f.x = j3;
                    abstractC0135f.f3287y = j3;
                    abstractC0135f.o(j3, z5);
                    abstractC0135f.d(11, new H(this));
                    X1.f fVar = this.f3143z;
                    fVar.getClass();
                    Q h3 = abstractC0135f.h();
                    if (h3 != null && h3 != (q3 = (Q) fVar.f3012r)) {
                        if (q3 == null) {
                            fVar.f3012r = h3;
                            fVar.f3011q = abstractC0135f;
                            ((a0.O) h3).b(((m0) fVar.f3009o).f3371q);
                        } else {
                            throw new C0142m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z9 && z10) {
                        if (abstractC0135f.f3283t == 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        AbstractC0123a.j(z7);
                        abstractC0135f.f3283t = 2;
                        abstractC0135f.r();
                    }
                    i6 = i3 + 1;
                    set = set2;
                    v4 = v3;
                    vVar2 = vVar;
                    s4 = s3;
                }
            }
            i3 = i6;
            v3 = v4;
            s3 = s4;
            vVar = vVar2;
            set2 = set;
            i6 = i3 + 1;
            set = set2;
            v4 = v3;
            vVar2 = vVar;
            s4 = s3;
        }
        s4.f3159g = true;
    }

    public final void d0() {
        AbstractC0135f[] abstractC0135fArr;
        int i3;
        boolean z3;
        X1.f fVar = this.f3143z;
        fVar.f3008n = false;
        m0 m0Var = (m0) fVar.f3009o;
        if (m0Var.f3368n) {
            m0Var.d(m0Var.e());
            m0Var.f3368n = false;
        }
        for (AbstractC0135f abstractC0135f : this.f3131m) {
            if (q(abstractC0135f) && (i3 = abstractC0135f.f3283t) == 2) {
                if (i3 == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                abstractC0135f.f3283t = 1;
                abstractC0135f.s();
            }
        }
    }

    public final long e(R.T t3, Object obj, long j3) {
        R.Q q3 = this.x;
        int i3 = t3.g(obj, q3).f1797c;
        R.S s3 = this.f3141w;
        t3.n(i3, s3);
        if (s3.f1809f == -9223372036854775807L || !s3.a() || !s3.f1812i) {
            return -9223372036854775807L;
        }
        return U.A.M(U.A.z(s3.f1810g) - s3.f1809f) - (j3 + q3.f1799e);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [o0.W, java.lang.Object] */
    public final void e0() {
        boolean z3;
        S s3 = this.f3104D.f3191k;
        if (!this.f3116Q && (s3 == null || !s3.f3153a.d())) {
            z3 = false;
        } else {
            z3 = true;
        }
        e0 e0Var = this.f3110J;
        if (z3 != e0Var.f3259g) {
            this.f3110J = new e0(e0Var.f3253a, e0Var.f3254b, e0Var.f3255c, e0Var.f3256d, e0Var.f3257e, e0Var.f3258f, z3, e0Var.f3260h, e0Var.f3261i, e0Var.f3262j, e0Var.f3263k, e0Var.f3264l, e0Var.f3265m, e0Var.f3266n, e0Var.f3267o, e0Var.f3269q, e0Var.f3270r, e0Var.f3271s, e0Var.f3272t, e0Var.f3268p);
        }
    }

    @Override // o0.V
    public final void f(o0.W w3) {
        this.f3138t.a(9, (InterfaceC0699x) w3).b();
    }

    public final void f0(r0.v vVar) {
        R.T t3 = this.f3110J.f3253a;
        r0.s[] sVarArr = vVar.f8998c;
        C0140k c0140k = this.f3136r;
        C0139j c0139j = (C0139j) c0140k.f3350h.get(this.f3108H);
        c0139j.getClass();
        int i3 = c0140k.f3348f;
        if (i3 == -1) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                AbstractC0135f[] abstractC0135fArr = this.f3131m;
                int i6 = 13107200;
                if (i4 < abstractC0135fArr.length) {
                    if (sVarArr[i4] != null) {
                        switch (abstractC0135fArr[i4].f3277n) {
                            case 0:
                                i6 = 144310272;
                                break;
                            case 1:
                                break;
                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                i6 = 131072000;
                                break;
                            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            case N.k.LONG_FIELD_NUMBER /* 4 */:
                            case N.k.STRING_FIELD_NUMBER /* 5 */:
                            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                i6 = 131072;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i5 += i6;
                    }
                    i4++;
                } else {
                    i3 = Math.max(13107200, i5);
                }
            }
        }
        c0139j.f3332b = i3;
        c0140k.d();
    }

    public final Pair g(R.T t3) {
        long j3 = 0;
        if (t3.p()) {
            return Pair.create(e0.f3252u, 0L);
        }
        Pair i3 = t3.i(this.f3141w, this.x, t3.a(this.f3118S), -9223372036854775807L);
        C0701z m3 = this.f3104D.m(t3, i3.first, 0L);
        long longValue = ((Long) i3.second).longValue();
        if (m3.b()) {
            Object obj = m3.f8653a;
            R.Q q3 = this.x;
            t3.g(obj, q3);
            if (m3.f8655c == q3.e(m3.f8654b)) {
                q3.f1801g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(m3, Long.valueOf(j3));
    }

    public final void g0(int i3, int i4, List list) {
        boolean z3;
        boolean z4 = true;
        this.f3111K.c(1);
        d0 d0Var = this.f3105E;
        d0Var.getClass();
        ArrayList arrayList = d0Var.f3233b;
        if (i3 >= 0 && i3 <= i4 && i4 <= arrayList.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        if (list.size() != i4 - i3) {
            z4 = false;
        }
        AbstractC0123a.e(z4);
        for (int i5 = i3; i5 < i4; i5++) {
            ((c0) arrayList.get(i5)).f3225a.v((C0122z) list.get(i5 - i3));
        }
        l(d0Var.b(), false);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [o0.W, java.lang.Object] */
    public final void h(InterfaceC0699x interfaceC0699x) {
        boolean z3;
        S s3 = this.f3104D.f3191k;
        if (s3 != null && s3.f3153a == interfaceC0699x) {
            long j3 = this.f3124Y;
            if (s3 != null) {
                if (s3.f3164l == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                if (s3.f3156d) {
                    s3.f3153a.v(j3 - s3.f3167o);
                }
            }
            s();
        }
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [o0.x, java.lang.Object] */
    public final void h0() {
        long j3;
        boolean z3;
        long max;
        long max2;
        long j4;
        long max3;
        S s3 = this.f3104D.f3189i;
        if (s3 == null) {
            return;
        }
        if (s3.f3156d) {
            j3 = s3.f3153a.u();
        } else {
            j3 = -9223372036854775807L;
        }
        if (j3 != -9223372036854775807L) {
            if (!s3.f()) {
                this.f3104D.k(s3);
                k(false);
                s();
            }
            E(j3);
            if (j3 != this.f3110J.f3271s) {
                e0 e0Var = this.f3110J;
                this.f3110J = o(e0Var.f3254b, j3, e0Var.f3255c, j3, true, 5);
            }
        } else {
            X1.f fVar = this.f3143z;
            if (s3 != this.f3104D.f3190j) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0135f abstractC0135f = (AbstractC0135f) fVar.f3011q;
            m0 m0Var = (m0) fVar.f3009o;
            if (abstractC0135f != null && !abstractC0135f.k() && ((!z3 || ((AbstractC0135f) fVar.f3011q).f3283t == 2) && (((AbstractC0135f) fVar.f3011q).l() || (!z3 && !((AbstractC0135f) fVar.f3011q).j())))) {
                Q q3 = (Q) fVar.f3012r;
                q3.getClass();
                long e2 = q3.e();
                if (fVar.f3007m) {
                    if (e2 < m0Var.e()) {
                        if (m0Var.f3368n) {
                            m0Var.d(m0Var.e());
                            m0Var.f3368n = false;
                        }
                    } else {
                        fVar.f3007m = false;
                        if (fVar.f3008n) {
                            m0Var.f();
                        }
                    }
                }
                m0Var.d(e2);
                R.J a3 = q3.a();
                if (!a3.equals(m0Var.f3371q)) {
                    m0Var.b(a3);
                    ((M) fVar.f3010p).f3138t.a(16, a3).b();
                }
            } else {
                fVar.f3007m = true;
                if (fVar.f3008n) {
                    m0Var.f();
                }
            }
            long e3 = fVar.e();
            this.f3124Y = e3;
            long j5 = e3 - s3.f3167o;
            long j6 = this.f3110J.f3271s;
            if (!this.f3101A.isEmpty() && !this.f3110J.f3254b.b()) {
                if (this.f3127b0) {
                    this.f3127b0 = false;
                }
                e0 e0Var2 = this.f3110J;
                e0Var2.f3253a.b(e0Var2.f3254b.f8653a);
                int min = Math.min(this.f3126a0, this.f3101A.size());
                if (min > 0 && this.f3101A.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.f3101A.size() && this.f3101A.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f3126a0 = min;
            }
            if (this.f3143z.c()) {
                boolean z4 = !this.f3111K.f3088c;
                e0 e0Var3 = this.f3110J;
                this.f3110J = o(e0Var3.f3254b, j5, e0Var3.f3255c, j5, z4, 6);
            } else {
                e0 e0Var4 = this.f3110J;
                e0Var4.f3271s = j5;
                e0Var4.f3272t = SystemClock.elapsedRealtime();
            }
        }
        this.f3110J.f3269q = this.f3104D.f3191k.d();
        e0 e0Var5 = this.f3110J;
        long j7 = e0Var5.f3269q;
        S s4 = this.f3104D.f3191k;
        if (s4 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j7 - (this.f3124Y - s4.f3167o));
        }
        e0Var5.f3270r = max;
        e0 e0Var6 = this.f3110J;
        if (e0Var6.f3264l && e0Var6.f3257e == 3 && a0(e0Var6.f3253a, e0Var6.f3254b)) {
            e0 e0Var7 = this.f3110J;
            float f3 = 1.0f;
            if (e0Var7.f3267o.f1779a == 1.0f) {
                C0138i c0138i = this.f3106F;
                long e4 = e(e0Var7.f3253a, e0Var7.f3254b.f8653a, e0Var7.f3271s);
                long j8 = this.f3110J.f3269q;
                S s5 = this.f3104D.f3191k;
                if (s5 == null) {
                    max2 = 0;
                } else {
                    max2 = Math.max(0L, j8 - (this.f3124Y - s5.f3167o));
                }
                if (c0138i.f3317c != -9223372036854775807L) {
                    long j9 = e4 - max2;
                    if (c0138i.f3327m == -9223372036854775807L) {
                        c0138i.f3327m = j9;
                        c0138i.f3328n = 0L;
                    } else {
                        c0138i.f3327m = Math.max(j9, (((float) j9) * 9.999871E-4f) + (((float) j4) * 0.999f));
                        c0138i.f3328n = (9.999871E-4f * ((float) Math.abs(j9 - max3))) + (0.999f * ((float) c0138i.f3328n));
                    }
                    if (c0138i.f3326l != -9223372036854775807L && SystemClock.elapsedRealtime() - c0138i.f3326l < 1000) {
                        f3 = c0138i.f3325k;
                    } else {
                        c0138i.f3326l = SystemClock.elapsedRealtime();
                        long j10 = (c0138i.f3328n * 3) + c0138i.f3327m;
                        if (c0138i.f3322h > j10) {
                            float M3 = (float) U.A.M(1000L);
                            long[] jArr = {j10, c0138i.f3319e, c0138i.f3322h - (((c0138i.f3325k - 1.0f) * M3) + ((c0138i.f3323i - 1.0f) * M3))};
                            long j11 = jArr[0];
                            for (int i3 = 1; i3 < 3; i3++) {
                                long j12 = jArr[i3];
                                if (j12 > j11) {
                                    j11 = j12;
                                }
                            }
                            c0138i.f3322h = j11;
                        } else {
                            long k3 = U.A.k(e4 - (Math.max(0.0f, c0138i.f3325k - 1.0f) / 1.0E-7f), c0138i.f3322h, j10);
                            c0138i.f3322h = k3;
                            long j13 = c0138i.f3321g;
                            if (j13 != -9223372036854775807L && k3 > j13) {
                                c0138i.f3322h = j13;
                            }
                        }
                        long j14 = e4 - c0138i.f3322h;
                        if (Math.abs(j14) < c0138i.f3315a) {
                            c0138i.f3325k = 1.0f;
                        } else {
                            c0138i.f3325k = U.A.i((1.0E-7f * ((float) j14)) + 1.0f, c0138i.f3324j, c0138i.f3323i);
                        }
                        f3 = c0138i.f3325k;
                    }
                }
                if (this.f3143z.a().f1779a != f3) {
                    R.J j15 = new R.J(f3, this.f3110J.f3267o.f1780b);
                    this.f3138t.d(16);
                    this.f3143z.b(j15);
                    n(this.f3110J.f3267o, this.f3143z.a().f1779a, false, false);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        V v3;
        boolean z3;
        S s3;
        int i3;
        S s4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i4 = 1000;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i5 = message.arg2;
                    S(i5 >> 4, i5 & 15, z4, true);
                    break;
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    c();
                    break;
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    K((L) message.obj);
                    break;
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    T((R.J) message.obj);
                    break;
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    this.f3109I = (l0) message.obj;
                    break;
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    c0(false, true);
                    break;
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    y();
                    return true;
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    m((InterfaceC0699x) message.obj);
                    break;
                case 9:
                    h((InterfaceC0699x) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    W(z5);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    P(z6, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    h0 h0Var = (h0) message.obj;
                    h0Var.getClass();
                    M(h0Var);
                    break;
                case 15:
                    N((h0) message.obj);
                    break;
                case 16:
                    R.J j3 = (R.J) message.obj;
                    n(j3, j3.f1779a, true, false);
                    break;
                case 17:
                    Q((I) message.obj);
                    break;
                case 18:
                    a((I) message.obj, message.arg1);
                    break;
                case 19:
                    D2.h.q(message.obj);
                    v();
                    throw null;
                case 20:
                    A(message.arg1, message.arg2, (o0.X) message.obj);
                    break;
                case 21:
                    X((o0.X) message.obj);
                    break;
                case 22:
                    u();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    R(z7);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    B();
                    J(true);
                    break;
                case 26:
                    B();
                    J(true);
                    break;
                case 27:
                    g0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    U((r) message.obj);
                    break;
                case 29:
                    w();
                    break;
            }
        } catch (R.H e2) {
            boolean z8 = e2.f1774m;
            int i6 = e2.f1775n;
            if (i6 == 1) {
                if (z8) {
                    i4 = 3001;
                } else {
                    i4 = 3003;
                }
            } else if (i6 == 4) {
                if (z8) {
                    i4 = 3002;
                } else {
                    i4 = 3004;
                }
            }
            i(e2, i4);
        } catch (W.i e3) {
            i(e3, e3.f2753m);
        } catch (C0142m e4) {
            C0142m c0142m = e4;
            int i7 = c0142m.f3360o;
            V v4 = this.f3104D;
            if (i7 == 1 && (s4 = v4.f3190j) != null) {
                v3 = v4;
                c0142m = new C0142m(c0142m.getMessage(), c0142m.getCause(), c0142m.f1776m, c0142m.f3360o, c0142m.f3361p, c0142m.f3362q, c0142m.f3363r, c0142m.f3364s, s4.f3158f.f3168a, c0142m.f1777n, c0142m.f3366u);
            } else {
                v3 = v4;
            }
            if (c0142m.f3366u && (this.f3128c0 == null || (i3 = c0142m.f1776m) == 5004 || i3 == 5003)) {
                AbstractC0123a.B("ExoPlayerImplInternal", "Recoverable renderer error", c0142m);
                C0142m c0142m2 = this.f3128c0;
                if (c0142m2 != null) {
                    c0142m2.addSuppressed(c0142m);
                    c0142m = this.f3128c0;
                } else {
                    this.f3128c0 = c0142m;
                }
                U.x xVar = this.f3138t;
                U.w a3 = xVar.a(25, c0142m);
                xVar.getClass();
                Message message2 = a3.f2484a;
                message2.getClass();
                xVar.f2486a.sendMessageAtFrontOfQueue(message2);
                a3.a();
            } else {
                C0142m c0142m3 = this.f3128c0;
                if (c0142m3 != null) {
                    c0142m3.addSuppressed(c0142m);
                    c0142m = this.f3128c0;
                }
                C0142m c0142m4 = c0142m;
                AbstractC0123a.o("ExoPlayerImplInternal", "Playback error", c0142m4);
                if (c0142m4.f3360o == 1) {
                    V v5 = v3;
                    if (v5.f3189i != v5.f3190j) {
                        while (true) {
                            s3 = v5.f3189i;
                            if (s3 == v5.f3190j) {
                                break;
                            }
                            v5.a();
                        }
                        s3.getClass();
                        t();
                        T t3 = s3.f3158f;
                        C0701z c0701z = t3.f3168a;
                        long j4 = t3.f3169b;
                        this.f3110J = o(c0701z, j4, t3.f3170c, j4, true, 0);
                    }
                }
                z3 = true;
                c0(true, false);
                this.f3110J = this.f3110J.e(c0142m4);
            }
        } catch (d0.b e5) {
            i(e5, e5.f5146m);
        } catch (IOException e6) {
            i(e6, 2000);
        } catch (RuntimeException e7) {
            C0142m c0142m5 = new C0142m(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1004);
            AbstractC0123a.o("ExoPlayerImplInternal", "Playback error", c0142m5);
            c0(true, false);
            this.f3110J = this.f3110J.e(c0142m5);
        } catch (C0678b e8) {
            i(e8, 1002);
        }
        z3 = true;
        t();
        return z3;
    }

    public final void i(IOException iOException, int i3) {
        C0142m c0142m = new C0142m(0, iOException, i3);
        S s3 = this.f3104D.f3189i;
        if (s3 != null) {
            T t3 = s3.f3158f;
            c0142m = new C0142m(c0142m.getMessage(), c0142m.getCause(), c0142m.f1776m, c0142m.f3360o, c0142m.f3361p, c0142m.f3362q, c0142m.f3363r, c0142m.f3364s, t3.f3168a, c0142m.f1777n, c0142m.f3366u);
        }
        AbstractC0123a.o("ExoPlayerImplInternal", "Playback error", c0142m);
        c0(false, false);
        this.f3110J = this.f3110J.e(c0142m);
    }

    public final void i0(R.T t3, C0701z c0701z, R.T t4, C0701z c0701z2, long j3, boolean z3) {
        Object obj;
        R.J j4;
        if (!a0(t3, c0701z)) {
            if (c0701z.b()) {
                j4 = R.J.f1778d;
            } else {
                j4 = this.f3110J.f3267o;
            }
            X1.f fVar = this.f3143z;
            if (!fVar.a().equals(j4)) {
                this.f3138t.d(16);
                fVar.b(j4);
                n(this.f3110J.f3267o, j4.f1779a, false, false);
                return;
            }
            return;
        }
        Object obj2 = c0701z.f8653a;
        R.Q q3 = this.x;
        int i3 = t3.g(obj2, q3).f1797c;
        R.S s3 = this.f3141w;
        t3.n(i3, s3);
        C0118v c0118v = s3.f1813j;
        C0138i c0138i = this.f3106F;
        c0138i.getClass();
        c0138i.f3317c = U.A.M(c0118v.f1996a);
        c0138i.f3320f = U.A.M(c0118v.f1997b);
        c0138i.f3321g = U.A.M(c0118v.f1998c);
        float f3 = c0118v.f1999d;
        if (f3 == -3.4028235E38f) {
            f3 = 0.97f;
        }
        c0138i.f3324j = f3;
        float f4 = c0118v.f2000e;
        if (f4 == -3.4028235E38f) {
            f4 = 1.03f;
        }
        c0138i.f3323i = f4;
        if (f3 == 1.0f && f4 == 1.0f) {
            c0138i.f3317c = -9223372036854775807L;
        }
        c0138i.a();
        if (j3 != -9223372036854775807L) {
            c0138i.f3318d = e(t3, obj2, j3);
            c0138i.a();
            return;
        }
        Object obj3 = s3.f1804a;
        if (!t4.p()) {
            obj = t4.m(t4.g(c0701z2.f8653a, q3).f1797c, s3, 0L).f1804a;
        } else {
            obj = null;
        }
        if (!U.A.a(obj, obj3) || z3) {
            c0138i.f3318d = -9223372036854775807L;
            c0138i.a();
        }
    }

    @Override // o0.InterfaceC0698w
    public final void j(InterfaceC0699x interfaceC0699x) {
        this.f3138t.a(8, interfaceC0699x).b();
    }

    public final void j0(boolean z3, boolean z4) {
        long j3;
        this.f3114O = z3;
        if (z3 && !z4) {
            this.f3102B.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f3115P = j3;
    }

    public final void k(boolean z3) {
        C0701z c0701z;
        long d3;
        S s3 = this.f3104D.f3191k;
        if (s3 == null) {
            c0701z = this.f3110J.f3254b;
        } else {
            c0701z = s3.f3158f.f3168a;
        }
        boolean equals = this.f3110J.f3263k.equals(c0701z);
        if (!equals) {
            this.f3110J = this.f3110J.b(c0701z);
        }
        e0 e0Var = this.f3110J;
        if (s3 == null) {
            d3 = e0Var.f3271s;
        } else {
            d3 = s3.d();
        }
        e0Var.f3269q = d3;
        e0 e0Var2 = this.f3110J;
        long j3 = e0Var2.f3269q;
        S s4 = this.f3104D.f3191k;
        long j4 = 0;
        if (s4 != null) {
            j4 = Math.max(0L, j3 - (this.f3124Y - s4.f3167o));
        }
        e0Var2.f3270r = j4;
        if ((!equals || z3) && s3 != null && s3.f3156d) {
            f0(s3.f3166n);
        }
    }

    public final synchronized void k0(C0143n c0143n, long j3) {
        this.f3102B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j3;
        boolean z3 = false;
        while (!((Boolean) c0143n.get()).booleanValue() && j3 > 0) {
            try {
                this.f3102B.getClass();
                wait(j3);
            } catch (InterruptedException unused) {
                z3 = true;
            }
            this.f3102B.getClass();
            j3 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d9 A[Catch: all -> 0x02df, TryCatch #7 {all -> 0x02df, blocks: (B:164:0x02d3, B:166:0x02d9, B:180:0x02fe, B:182:0x030b, B:184:0x0311, B:186:0x031b, B:187:0x0328, B:188:0x032b, B:192:0x0336), top: B:262:0x0277 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x043e  */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [Y.L] */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(R.T r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.M.l(R.T, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [o0.x, java.lang.Object] */
    public final void m(InterfaceC0699x interfaceC0699x) {
        V v3 = this.f3104D;
        S s3 = v3.f3191k;
        if (s3 != null && s3.f3153a == interfaceC0699x) {
            float f3 = this.f3143z.a().f1779a;
            R.T t3 = this.f3110J.f3253a;
            s3.f3156d = true;
            s3.f3165m = s3.f3153a.g();
            r0.v h3 = s3.h(f3, t3);
            T t4 = s3.f3158f;
            long j3 = t4.f3169b;
            long j4 = t4.f3172e;
            if (j4 != -9223372036854775807L && j3 >= j4) {
                j3 = Math.max(0L, j4 - 1);
            }
            long a3 = s3.a(h3, j3, false, new boolean[s3.f3161i.length]);
            long j5 = s3.f3167o;
            T t5 = s3.f3158f;
            s3.f3167o = (t5.f3169b - a3) + j5;
            s3.f3158f = t5.b(a3);
            f0(s3.f3166n);
            if (s3 == v3.f3189i) {
                E(s3.f3158f.f3169b);
                d(new boolean[this.f3131m.length], v3.f3190j.e());
                e0 e0Var = this.f3110J;
                C0701z c0701z = e0Var.f3254b;
                long j6 = s3.f3158f.f3169b;
                this.f3110J = o(c0701z, j6, e0Var.f3255c, j6, false, 5);
            }
            s();
        }
    }

    public final void n(R.J j3, float f3, boolean z3, boolean z4) {
        int i3;
        if (z3) {
            if (z4) {
                this.f3111K.c(1);
            }
            this.f3110J = this.f3110J.f(j3);
        }
        float f4 = j3.f1779a;
        S s3 = this.f3104D.f3189i;
        while (true) {
            i3 = 0;
            if (s3 == null) {
                break;
            }
            r0.s[] sVarArr = s3.f3166n.f8998c;
            int length = sVarArr.length;
            while (i3 < length) {
                r0.s sVar = sVarArr[i3];
                if (sVar != null) {
                    sVar.j(f4);
                }
                i3++;
            }
            s3 = s3.f3164l;
        }
        AbstractC0135f[] abstractC0135fArr = this.f3131m;
        int length2 = abstractC0135fArr.length;
        while (i3 < length2) {
            AbstractC0135f abstractC0135f = abstractC0135fArr[i3];
            if (abstractC0135f != null) {
                abstractC0135f.y(f3, j3.f1779a);
            }
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [D1.F, D1.C] */
    public final e0 o(C0701z c0701z, long j3, long j4, long j5, boolean z3, int i3) {
        boolean z4;
        o0.b0 b0Var;
        r0.v vVar;
        D1.b0 b0Var2;
        long max;
        o0.b0 b0Var3;
        r0.v vVar2;
        D1.b0 b0Var4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        boolean z7 = false;
        if (!this.f3127b0 && j3 == this.f3110J.f3271s && c0701z.equals(this.f3110J.f3254b)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f3127b0 = z4;
        D();
        e0 e0Var = this.f3110J;
        o0.b0 b0Var5 = e0Var.f3260h;
        r0.v vVar3 = e0Var.f3261i;
        List list = e0Var.f3262j;
        if (this.f3105E.f3242k) {
            S s3 = this.f3104D.f3189i;
            if (s3 == null) {
                b0Var3 = o0.b0.f8578d;
            } else {
                b0Var3 = s3.f3165m;
            }
            if (s3 == null) {
                vVar2 = this.f3135q;
            } else {
                vVar2 = s3.f3166n;
            }
            r0.s[] sVarArr = vVar2.f8998c;
            ?? c3 = new D1.C(4);
            int length = sVarArr.length;
            int i6 = 0;
            boolean z8 = false;
            while (i6 < length) {
                r0.s sVar = sVarArr[i6];
                if (sVar != null) {
                    R.F f3 = sVar.g(0).f1972k;
                    if (f3 == null) {
                        c3.a(new R.F(new R.E[0]));
                    } else {
                        c3.a(f3);
                        i5 = 1;
                        z8 = true;
                        i6 += i5;
                    }
                }
                i5 = 1;
                i6 += i5;
            }
            if (z8) {
                b0Var4 = c3.g();
            } else {
                D1.G g3 = D1.I.f197n;
                b0Var4 = D1.b0.f231q;
            }
            if (s3 != null) {
                T t3 = s3.f3158f;
                if (t3.f3170c != j4) {
                    s3.f3158f = t3.a(j4);
                }
            }
            S s4 = this.f3104D.f3189i;
            if (s4 != null) {
                r0.v vVar4 = s4.f3166n;
                boolean z9 = false;
                int i7 = 0;
                while (true) {
                    AbstractC0135f[] abstractC0135fArr = this.f3131m;
                    if (i7 < abstractC0135fArr.length) {
                        if (vVar4.b(i7)) {
                            i4 = 1;
                            if (abstractC0135fArr[i7].f3277n != 1) {
                                z5 = false;
                                break;
                            } else if (vVar4.f8997b[i7].f3353a != 0) {
                                z9 = true;
                            }
                        } else {
                            i4 = 1;
                        }
                        i7 += i4;
                    } else {
                        z5 = true;
                        break;
                    }
                }
                if (z9 && z5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 != this.f3121V) {
                    this.f3121V = z6;
                    if (!z6 && this.f3110J.f3268p) {
                        this.f3138t.e(2);
                    }
                }
            }
            b0Var2 = b0Var4;
            b0Var = b0Var3;
            vVar = vVar2;
        } else if (!c0701z.equals(e0Var.f3254b)) {
            o0.b0 b0Var6 = o0.b0.f8578d;
            b0Var = b0Var6;
            vVar = this.f3135q;
            b0Var2 = D1.b0.f231q;
        } else {
            b0Var = b0Var5;
            vVar = vVar3;
            b0Var2 = list;
        }
        if (z3) {
            J j6 = this.f3111K;
            if (j6.f3088c && j6.f3089d != 5) {
                if (i3 == 5) {
                    z7 = true;
                }
                AbstractC0123a.e(z7);
            } else {
                j6.f3087b = true;
                j6.f3088c = true;
                j6.f3089d = i3;
            }
        }
        e0 e0Var2 = this.f3110J;
        long j7 = e0Var2.f3269q;
        S s5 = this.f3104D.f3191k;
        if (s5 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j7 - (this.f3124Y - s5.f3167o));
        }
        return e0Var2.c(c0701z, j3, j4, j5, max, b0Var, vVar, b0Var2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o0.x, o0.W, java.lang.Object] */
    public final boolean p() {
        o0.U[] uArr;
        long t3;
        S s3 = this.f3104D.f3191k;
        if (s3 == null) {
            return false;
        }
        try {
            ?? r22 = s3.f3153a;
            if (!s3.f3156d) {
                r22.o();
            } else {
                for (o0.U u3 : s3.f3155c) {
                    if (u3 != null) {
                        u3.a();
                    }
                }
            }
            if (!s3.f3156d) {
                t3 = 0;
            } else {
                t3 = r22.t();
            }
            if (t3 == Long.MIN_VALUE) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean r() {
        S s3 = this.f3104D.f3189i;
        long j3 = s3.f3158f.f3172e;
        if (s3.f3156d && (j3 == -9223372036854775807L || this.f3110J.f3271s < j3 || !Z())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [o0.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [o0.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [o0.x, java.lang.Object] */
    public final void s() {
        long t3;
        long max;
        long j3;
        boolean c3;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (!p()) {
            c3 = false;
        } else {
            S s3 = this.f3104D.f3191k;
            if (!s3.f3156d) {
                t3 = 0;
            } else {
                t3 = s3.f3153a.t();
            }
            S s4 = this.f3104D.f3191k;
            if (s4 == null) {
                max = 0;
            } else {
                max = Math.max(0L, t3 - (this.f3124Y - s4.f3167o));
            }
            S s5 = this.f3104D.f3189i;
            if (a0(this.f3110J.f3253a, s3.f3158f.f3168a)) {
                j3 = this.f3106F.f3322h;
            } else {
                j3 = -9223372036854775807L;
            }
            Z.m mVar = this.f3108H;
            R.T t4 = this.f3110J.f3253a;
            float f3 = this.f3143z.a().f1779a;
            boolean z6 = this.f3110J.f3264l;
            N n3 = new N(mVar, max, f3, this.f3114O, j3);
            c3 = this.f3136r.c(n3);
            S s6 = this.f3104D.f3189i;
            if (!c3 && s6.f3156d && max < 500000 && this.f3142y > 0) {
                s6.f3153a.r(this.f3110J.f3271s);
                c3 = this.f3136r.c(n3);
            }
        }
        this.f3116Q = c3;
        if (c3) {
            S s7 = this.f3104D.f3191k;
            long j4 = this.f3124Y;
            float f4 = this.f3143z.a().f1779a;
            long j5 = this.f3115P;
            if (s7.f3164l == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.j(z3);
            ?? r12 = s7.f3153a;
            O o3 = new O();
            o3.f3147a = j4 - s7.f3167o;
            if (f4 <= 0.0f && f4 != -3.4028235E38f) {
                z4 = false;
            } else {
                z4 = true;
            }
            AbstractC0123a.e(z4);
            o3.f3148b = f4;
            AbstractC0123a.e((j5 >= 0 || j5 == -9223372036854775807L) ? true : true);
            o3.f3149c = j5;
            r12.h(new P(o3));
        }
        e0();
    }

    public final void t() {
        boolean z3;
        J j3 = this.f3111K;
        e0 e0Var = this.f3110J;
        boolean z4 = j3.f3087b;
        if (((e0) j3.f3090e) != e0Var) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        j3.f3087b = z5;
        j3.f3090e = e0Var;
        if (z5) {
            G g3 = this.f3103C.f3406m;
            g3.f3064i.c(new U.n(1, g3, j3));
            this.f3111K = new J(this.f3110J);
        }
    }

    public final void u() {
        l(this.f3105E.b(), true);
    }

    public final void v() {
        this.f3111K.c(1);
        throw null;
    }

    public final void w() {
        boolean z3;
        int i3;
        this.f3111K.c(1);
        int i4 = 0;
        C(false, false, false, true);
        C0140k c0140k = this.f3136r;
        c0140k.getClass();
        long id = Thread.currentThread().getId();
        long j3 = c0140k.f3351i;
        if (j3 != -1 && j3 != id) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.i("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z3);
        c0140k.f3351i = id;
        HashMap hashMap = c0140k.f3350h;
        Z.m mVar = this.f3108H;
        if (!hashMap.containsKey(mVar)) {
            hashMap.put(mVar, new Object());
        }
        C0139j c0139j = (C0139j) hashMap.get(mVar);
        c0139j.getClass();
        int i5 = c0140k.f3348f;
        if (i5 == -1) {
            i5 = 13107200;
        }
        c0139j.f3332b = i5;
        c0139j.f3331a = false;
        if (this.f3110J.f3253a.p()) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        Y(i3);
        s0.g gVar = (s0.g) this.f3137s;
        gVar.getClass();
        d0 d0Var = this.f3105E;
        AbstractC0123a.j(!d0Var.f3242k);
        d0Var.f3243l = gVar;
        while (true) {
            ArrayList arrayList = d0Var.f3233b;
            if (i4 < arrayList.size()) {
                c0 c0Var = (c0) arrayList.get(i4);
                d0Var.e(c0Var);
                d0Var.f3238g.add(c0Var);
                i4++;
            } else {
                d0Var.f3242k = true;
                this.f3138t.e(2);
                return;
            }
        }
    }

    public final synchronized boolean x() {
        if (!this.L && this.f3140v.getThread().isAlive()) {
            this.f3138t.e(7);
            k0(new C0143n(this, 1), this.f3107G);
            return this.L;
        }
        return true;
    }

    public final void y() {
        try {
            C(true, false, true, false);
            z();
            C0140k c0140k = this.f3136r;
            if (c0140k.f3350h.remove(this.f3108H) != null) {
                c0140k.d();
            }
            if (c0140k.f3350h.isEmpty()) {
                c0140k.f3351i = -1L;
            }
            Y(1);
            HandlerThread handlerThread = this.f3139u;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.L = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.f3139u;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.L = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void z() {
        boolean z3;
        for (int i3 = 0; i3 < this.f3131m.length; i3++) {
            AbstractC0135f abstractC0135f = this.f3133o[i3];
            synchronized (abstractC0135f.f3276m) {
                abstractC0135f.f3275C = null;
            }
            AbstractC0135f abstractC0135f2 = this.f3131m[i3];
            if (abstractC0135f2.f3283t == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.j(z3);
            abstractC0135f2.p();
        }
    }
}

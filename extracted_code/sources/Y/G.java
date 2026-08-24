package Y;

import C.C0009j;
import R.C0102e;
import R.C0108k;
import R.C0111n;
import R.C0113p;
import R.C0122z;
import U.AbstractC0123a;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k0.C0558m;
import l.C0576n;
import o0.C0701z;
import o0.InterfaceC0700y;
/* loaded from: classes.dex */
public final class G extends C0.e implements InterfaceC0147s {

    /* renamed from: A  reason: collision with root package name */
    public final B1.b f3026A;

    /* renamed from: B  reason: collision with root package name */
    public final long f3027B;

    /* renamed from: C  reason: collision with root package name */
    public int f3028C;

    /* renamed from: D  reason: collision with root package name */
    public int f3029D;

    /* renamed from: E  reason: collision with root package name */
    public int f3030E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f3031F;

    /* renamed from: G  reason: collision with root package name */
    public final l0 f3032G;

    /* renamed from: H  reason: collision with root package name */
    public o0.X f3033H;

    /* renamed from: I  reason: collision with root package name */
    public final r f3034I;

    /* renamed from: J  reason: collision with root package name */
    public R.K f3035J;

    /* renamed from: K  reason: collision with root package name */
    public R.C f3036K;
    public C0113p L;

    /* renamed from: M  reason: collision with root package name */
    public AudioTrack f3037M;

    /* renamed from: N  reason: collision with root package name */
    public Surface f3038N;

    /* renamed from: O  reason: collision with root package name */
    public Surface f3039O;

    /* renamed from: P  reason: collision with root package name */
    public SurfaceHolder f3040P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f3041Q;

    /* renamed from: R  reason: collision with root package name */
    public final int f3042R;

    /* renamed from: S  reason: collision with root package name */
    public U.u f3043S;

    /* renamed from: T  reason: collision with root package name */
    public final int f3044T;

    /* renamed from: U  reason: collision with root package name */
    public C0102e f3045U;

    /* renamed from: V  reason: collision with root package name */
    public float f3046V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f3047W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f3048X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f3049Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f3050Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f3051a0;

    /* renamed from: b  reason: collision with root package name */
    public final r0.v f3052b;

    /* renamed from: b0  reason: collision with root package name */
    public R.c0 f3053b0;

    /* renamed from: c  reason: collision with root package name */
    public final R.K f3054c;

    /* renamed from: c0  reason: collision with root package name */
    public R.C f3055c0;

    /* renamed from: d  reason: collision with root package name */
    public final U.c f3056d = new Object();

    /* renamed from: d0  reason: collision with root package name */
    public e0 f3057d0;

    /* renamed from: e  reason: collision with root package name */
    public final Context f3058e;

    /* renamed from: e0  reason: collision with root package name */
    public int f3059e0;

    /* renamed from: f  reason: collision with root package name */
    public final R.N f3060f;

    /* renamed from: f0  reason: collision with root package name */
    public long f3061f0;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC0135f[] f3062g;

    /* renamed from: h  reason: collision with root package name */
    public final r0.u f3063h;

    /* renamed from: i  reason: collision with root package name */
    public final U.x f3064i;

    /* renamed from: j  reason: collision with root package name */
    public final C0153y f3065j;

    /* renamed from: k  reason: collision with root package name */
    public final M f3066k;

    /* renamed from: l  reason: collision with root package name */
    public final U.l f3067l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArraySet f3068m;

    /* renamed from: n  reason: collision with root package name */
    public final R.Q f3069n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f3070o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f3071p;

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0700y f3072q;

    /* renamed from: r  reason: collision with root package name */
    public final Z.f f3073r;

    /* renamed from: s  reason: collision with root package name */
    public final Looper f3074s;

    /* renamed from: t  reason: collision with root package name */
    public final s0.d f3075t;

    /* renamed from: u  reason: collision with root package name */
    public final U.v f3076u;

    /* renamed from: v  reason: collision with root package name */
    public final D f3077v;

    /* renamed from: w  reason: collision with root package name */
    public final E f3078w;
    public final C0131b x;

    /* renamed from: y  reason: collision with root package name */
    public final C0134e f3079y;

    /* renamed from: z  reason: collision with root package name */
    public final B1.b f3080z;

    static {
        R.A.a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, U.c] */
    /* JADX WARN: Type inference failed for: r14v0, types: [Y.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, Y.b] */
    public G(C0146q c0146q) {
        boolean z3;
        Z.m a3;
        int generateAudioSessionId;
        try {
            AbstractC0123a.r("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + U.A.f2409e + "]");
            Context context = c0146q.f3377a;
            Looper looper = c0146q.f3383g;
            this.f3058e = context.getApplicationContext();
            U.v vVar = c0146q.f3378b;
            this.f3073r = new Z.f(vVar);
            this.f3050Z = c0146q.f3384h;
            this.f3045U = c0146q.f3385i;
            this.f3042R = c0146q.f3386j;
            this.f3047W = false;
            this.f3027B = c0146q.f3391o;
            D d3 = new D(this);
            this.f3077v = d3;
            this.f3078w = new Object();
            Handler handler = new Handler(looper);
            AbstractC0135f[] a4 = ((C0141l) c0146q.f3379c.get()).a(handler, d3, d3, d3, d3);
            this.f3062g = a4;
            if (a4.length > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.j(z3);
            this.f3063h = (r0.u) c0146q.f3381e.get();
            this.f3072q = (InterfaceC0700y) c0146q.f3380d.get();
            this.f3075t = (s0.d) c0146q.f3382f.get();
            this.f3071p = c0146q.f3387k;
            this.f3032G = c0146q.f3388l;
            this.f3074s = looper;
            this.f3076u = vVar;
            this.f3060f = this;
            this.f3067l = new U.l(looper, vVar, new C0153y(this));
            this.f3068m = new CopyOnWriteArraySet();
            this.f3070o = new ArrayList();
            this.f3033H = new o0.X();
            this.f3034I = r.f3395a;
            this.f3052b = new r0.v(new k0[a4.length], new r0.s[a4.length], R.Z.f1866b, null);
            this.f3069n = new R.Q();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i3 = 0; i3 < 20; i3++) {
                int i4 = iArr[i3];
                AbstractC0123a.j(!false);
                sparseBooleanArray.append(i4, true);
            }
            this.f3063h.getClass();
            AbstractC0123a.j(!false);
            sparseBooleanArray.append(29, true);
            AbstractC0123a.j(!false);
            C0111n c0111n = new C0111n(sparseBooleanArray);
            this.f3054c = new R.K(c0111n);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i5 = 0; i5 < c0111n.f1916a.size(); i5++) {
                int a5 = c0111n.a(i5);
                AbstractC0123a.j(!false);
                sparseBooleanArray2.append(a5, true);
            }
            AbstractC0123a.j(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC0123a.j(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC0123a.j(!false);
            this.f3035J = new R.K(new C0111n(sparseBooleanArray2));
            this.f3064i = this.f3076u.a(this.f3074s, null);
            C0153y c0153y = new C0153y(this);
            this.f3065j = c0153y;
            this.f3057d0 = e0.i(this.f3052b);
            this.f3073r.K(this.f3060f, this.f3074s);
            int i6 = U.A.f2405a;
            String str = c0146q.f3394r;
            if (i6 < 31) {
                a3 = new Z.m(str);
            } else {
                a3 = A.a(this.f3058e, this, c0146q.f3392p, str);
            }
            this.f3066k = new M(this.f3062g, this.f3063h, this.f3052b, new C0140k(), this.f3075t, this.f3028C, this.f3073r, this.f3032G, c0146q.f3389m, c0146q.f3390n, this.f3074s, this.f3076u, c0153y, a3, this.f3034I);
            this.f3046V = 1.0f;
            this.f3028C = 0;
            R.C c3 = R.C.f1745y;
            this.f3036K = c3;
            this.f3055c0 = c3;
            this.f3059e0 = -1;
            if (i6 < 21) {
                AudioTrack audioTrack = this.f3037M;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f3037M.release();
                    this.f3037M = null;
                }
                if (this.f3037M == null) {
                    this.f3037M = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f3044T = this.f3037M.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f3058e.getSystemService("audio");
                if (audioManager == null) {
                    generateAudioSessionId = -1;
                } else {
                    generateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f3044T = generateAudioSessionId;
            }
            int i7 = T.c.f2280b;
            this.f3048X = true;
            Z.f fVar = this.f3073r;
            fVar.getClass();
            this.f3067l.a(fVar);
            s0.d dVar = this.f3075t;
            Handler handler2 = new Handler(this.f3074s);
            Z.f fVar2 = this.f3073r;
            s0.g gVar = (s0.g) dVar;
            gVar.getClass();
            fVar2.getClass();
            C0558m c0558m = gVar.f9172b;
            c0558m.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c0558m.f7632n;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                s0.c cVar = (s0.c) it.next();
                if (cVar.f9155b == fVar2) {
                    cVar.f9156c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new s0.c(handler2, fVar2));
            this.f3068m.add(this.f3077v);
            D d4 = this.f3077v;
            ?? obj = new Object();
            obj.f3217b = context.getApplicationContext();
            obj.f3218c = new RunnableC0130a(obj, handler, d4);
            this.x = obj;
            obj.b();
            C0134e c0134e = new C0134e(context, handler, this.f3077v);
            this.f3079y = c0134e;
            c0134e.b(null);
            B1.b bVar = new B1.b(23);
            context.getApplicationContext();
            this.f3080z = bVar;
            this.f3026A = new B1.b(context);
            C0009j c0009j = new C0009j(1);
            c0009j.f107b = 0;
            c0009j.f108c = 0;
            new C0108k(c0009j);
            this.f3053b0 = R.c0.f1879e;
            this.f3043S = U.u.f2480c;
            this.f3063h.b(this.f3045U);
            C(1, 10, Integer.valueOf(this.f3044T));
            C(2, 10, Integer.valueOf(this.f3044T));
            C(1, 3, this.f3045U);
            C(2, 4, Integer.valueOf(this.f3042R));
            C(2, 5, 0);
            C(1, 9, Boolean.valueOf(this.f3047W));
            C(2, 7, this.f3078w);
            C(6, 8, this.f3078w);
            C(-1, 16, Integer.valueOf(this.f3050Z));
            this.f3056d.b();
        } catch (Throwable th) {
            this.f3056d.b();
            throw th;
        }
    }

    public static long v(e0 e0Var) {
        R.S s3 = new R.S();
        R.Q q3 = new R.Q();
        e0Var.f3253a.g(e0Var.f3254b.f8653a, q3);
        long j3 = e0Var.f3255c;
        if (j3 == -9223372036854775807L) {
            return e0Var.f3253a.m(q3.f1797c, s3, 0L).f1815l;
        }
        return q3.f1799e + j3;
    }

    public final void A() {
        int i3;
        J();
        boolean u3 = u();
        int i4 = 2;
        int d3 = this.f3079y.d(2, u3);
        if (d3 == -1) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        G(d3, i3, u3);
        e0 e0Var = this.f3057d0;
        if (e0Var.f3257e != 1) {
            return;
        }
        e0 e2 = e0Var.e(null);
        if (e2.f3253a.p()) {
            i4 = 4;
        }
        e0 g3 = e2.g(i4);
        this.f3029D++;
        U.x xVar = this.f3066k.f3138t;
        xVar.getClass();
        U.w b3 = U.x.b();
        b3.f2484a = xVar.f2486a.obtainMessage(29);
        b3.b();
        H(g3, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void B() {
        SurfaceHolder surfaceHolder = this.f3040P;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f3077v);
            this.f3040P = null;
        }
    }

    public final void C(int i3, int i4, Object obj) {
        AbstractC0135f[] abstractC0135fArr;
        int i5;
        for (AbstractC0135f abstractC0135f : this.f3062g) {
            if (i3 == -1 || abstractC0135f.f3277n == i3) {
                int s3 = s(this.f3057d0);
                R.T t3 = this.f3057d0.f3253a;
                if (s3 == -1) {
                    i5 = 0;
                } else {
                    i5 = s3;
                }
                M m3 = this.f3066k;
                h0 h0Var = new h0(m3, abstractC0135f, t3, i5, this.f3076u, m3.f3140v);
                AbstractC0123a.j(!h0Var.f3312g);
                h0Var.f3309d = i4;
                AbstractC0123a.j(!h0Var.f3312g);
                h0Var.f3310e = obj;
                h0Var.c();
            }
        }
    }

    public final void D(Surface surface) {
        AbstractC0135f[] abstractC0135fArr;
        boolean z3;
        int i3;
        ArrayList arrayList = new ArrayList();
        for (AbstractC0135f abstractC0135f : this.f3062g) {
            if (abstractC0135f.f3277n == 2) {
                int s3 = s(this.f3057d0);
                R.T t3 = this.f3057d0.f3253a;
                if (s3 == -1) {
                    i3 = 0;
                } else {
                    i3 = s3;
                }
                M m3 = this.f3066k;
                h0 h0Var = new h0(m3, abstractC0135f, t3, i3, this.f3076u, m3.f3140v);
                AbstractC0123a.j(!h0Var.f3312g);
                h0Var.f3309d = 1;
                AbstractC0123a.j(!h0Var.f3312g);
                h0Var.f3310e = surface;
                h0Var.c();
                arrayList.add(h0Var);
            }
        }
        Surface surface2 = this.f3038N;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((h0) it.next()).a(this.f3027B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z3 = true;
            }
            z3 = false;
            Surface surface3 = this.f3038N;
            Surface surface4 = this.f3039O;
            if (surface3 == surface4) {
                surface4.release();
                this.f3039O = null;
            }
        } else {
            z3 = false;
        }
        this.f3038N = surface;
        if (z3) {
            C0142m c0142m = new C0142m(2, new RuntimeException("Detaching surface timed out."), 1003);
            e0 e0Var = this.f3057d0;
            e0 b3 = e0Var.b(e0Var.f3254b);
            b3.f3269q = b3.f3271s;
            b3.f3270r = 0L;
            e0 e2 = b3.g(1).e(c0142m);
            this.f3029D++;
            U.x xVar = this.f3066k.f3138t;
            xVar.getClass();
            U.w b4 = U.x.b();
            b4.f2484a = xVar.f2486a.obtainMessage(6);
            b4.b();
            H(e2, 0, false, 5, -9223372036854775807L, -1);
        }
    }

    public final void E(Surface surface) {
        int i3;
        J();
        B();
        D(surface);
        if (surface == null) {
            i3 = 0;
        } else {
            i3 = -1;
        }
        z(i3, i3);
    }

    public final void F() {
        boolean z3;
        int k3;
        boolean z4;
        int e2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        R.K k4 = this.f3035J;
        int i3 = U.A.f2405a;
        G g3 = (G) this.f3060f;
        boolean w3 = g3.w();
        R.T r3 = g3.r();
        boolean p3 = r3.p();
        R.S s3 = (R.S) g3.f142a;
        if (!p3 && r3.m(g3.o(), s3, 0L).f1811h) {
            z3 = true;
        } else {
            z3 = false;
        }
        R.T r4 = g3.r();
        if (r4.p()) {
            k3 = -1;
        } else {
            int o3 = g3.o();
            g3.J();
            int i4 = g3.f3028C;
            if (i4 == 1) {
                i4 = 0;
            }
            g3.J();
            k3 = r4.k(o3, i4, false);
        }
        if (k3 != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        R.T r5 = g3.r();
        if (r5.p()) {
            e2 = -1;
        } else {
            int o4 = g3.o();
            g3.J();
            int i5 = g3.f3028C;
            if (i5 == 1) {
                i5 = 0;
            }
            g3.J();
            e2 = r5.e(o4, i5, false);
        }
        if (e2 != -1) {
            z5 = true;
        } else {
            z5 = false;
        }
        R.T r6 = g3.r();
        if (!r6.p() && r6.m(g3.o(), s3, 0L).a()) {
            z6 = true;
        } else {
            z6 = false;
        }
        R.T r7 = g3.r();
        if (!r7.p() && r7.m(g3.o(), s3, 0L).f1812i) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean p4 = g3.r().p();
        C1.j jVar = new C1.j(15);
        C0111n c0111n = this.f3054c.f1782a;
        A.i iVar = (A.i) jVar.f168n;
        iVar.getClass();
        for (int i6 = 0; i6 < c0111n.f1916a.size(); i6++) {
            iVar.a(c0111n.a(i6));
        }
        boolean z15 = !w3;
        jVar.o(4, z15);
        if (z3 && !w3) {
            z8 = true;
        } else {
            z8 = false;
        }
        jVar.o(5, z8);
        if (z4 && !w3) {
            z9 = true;
        } else {
            z9 = false;
        }
        jVar.o(6, z9);
        if (!p4 && ((z4 || !z6 || z3) && !w3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        jVar.o(7, z10);
        if (z5 && !w3) {
            z11 = true;
        } else {
            z11 = false;
        }
        jVar.o(8, z11);
        if (!p4 && ((z5 || (z6 && z7)) && !w3)) {
            z12 = true;
        } else {
            z12 = false;
        }
        jVar.o(9, z12);
        jVar.o(10, z15);
        if (z3 && !w3) {
            z13 = true;
        } else {
            z13 = false;
        }
        jVar.o(11, z13);
        jVar.o(12, (!z3 || w3) ? false : false);
        R.K k5 = new R.K(iVar.b());
        this.f3035J = k5;
        if (!k5.equals(k4)) {
            this.f3067l.c(13, new C0153y(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final void G(int i3, int i4, boolean z3) {
        ?? r13;
        int i5 = 0;
        if (z3 && i3 != -1) {
            r13 = 1;
        } else {
            r13 = 0;
        }
        if (i3 == 0) {
            i5 = 1;
        }
        e0 e0Var = this.f3057d0;
        if (e0Var.f3264l == r13 && e0Var.f3266n == i5 && e0Var.f3265m == i4) {
            return;
        }
        this.f3029D++;
        e0 e0Var2 = this.f3057d0;
        boolean z4 = e0Var2.f3268p;
        e0 e0Var3 = e0Var2;
        if (z4) {
            e0Var3 = e0Var2.a();
        }
        e0 d3 = e0Var3.d(i4, i5, r13);
        int i6 = (i5 << 4) | i4;
        U.x xVar = this.f3066k.f3138t;
        xVar.getClass();
        U.w b3 = U.x.b();
        b3.f2484a = xVar.f2486a.obtainMessage(1, r13, i6);
        b3.b();
        H(d3, 0, false, 5, -9223372036854775807L, -1);
    }

    public final void H(final e0 e0Var, final int i3, boolean z3, final int i4, long j3, int i5) {
        Pair pair;
        int i6;
        final C0122z c0122z;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i7;
        Object obj;
        C0122z c0122z2;
        Object obj2;
        int i8;
        long j4;
        long j5;
        long j6;
        long v3;
        Object obj3;
        C0122z c0122z3;
        Object obj4;
        int i9;
        long j7;
        e0 e0Var2 = this.f3057d0;
        this.f3057d0 = e0Var;
        boolean equals = e0Var2.f3253a.equals(e0Var.f3253a);
        R.T t3 = e0Var2.f3253a;
        R.T t4 = e0Var.f3253a;
        if (t4.p() && t3.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (t4.p() != t3.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            C0701z c0701z = e0Var2.f3254b;
            Object obj5 = c0701z.f8653a;
            R.Q q3 = this.f3069n;
            int i10 = t3.g(obj5, q3).f1797c;
            R.S s3 = (R.S) this.f142a;
            Object obj6 = t3.m(i10, s3, 0L).f1804a;
            C0701z c0701z2 = e0Var.f3254b;
            if (!obj6.equals(t4.m(t4.g(c0701z2.f8653a, q3).f1797c, s3, 0L).f1804a)) {
                if (z3 && i4 == 0) {
                    i6 = 1;
                } else if (z3 && i4 == 1) {
                    i6 = 2;
                } else if (!equals) {
                    i6 = 3;
                } else {
                    throw new IllegalStateException();
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i6));
            } else if (z3 && i4 == 0 && c0701z.f8656d < c0701z2.f8656d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!e0Var.f3253a.p()) {
                c0122z = e0Var.f3253a.m(e0Var.f3253a.g(e0Var.f3254b.f8653a, this.f3069n).f1797c, (R.S) this.f142a, 0L).f1806c;
            } else {
                c0122z = null;
            }
            this.f3055c0 = R.C.f1745y;
        } else {
            c0122z = null;
        }
        if (booleanValue || !e0Var2.f3262j.equals(e0Var.f3262j)) {
            R.B a3 = this.f3055c0.a();
            List list = e0Var.f3262j;
            for (int i11 = 0; i11 < list.size(); i11++) {
                R.F f3 = (R.F) list.get(i11);
                int i12 = 0;
                while (true) {
                    R.E[] eArr = f3.f1770m;
                    if (i12 < eArr.length) {
                        eArr[i12].a(a3);
                        i12++;
                    }
                }
            }
            this.f3055c0 = new R.C(a3);
        }
        R.C j8 = j();
        boolean equals2 = j8.equals(this.f3036K);
        this.f3036K = j8;
        if (e0Var2.f3264l != e0Var.f3264l) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (e0Var2.f3257e != e0Var.f3257e) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 || z4) {
            I();
        }
        if (e0Var2.f3259g != e0Var.f3259g) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!equals) {
            this.f3067l.c(0, new U.i() { // from class: Y.t
                @Override // U.i
                public final void b(Object obj7) {
                    R.L l3 = (R.L) obj7;
                    switch (r2) {
                        case 0:
                            R.T t5 = ((e0) e0Var).f3253a;
                            l3.c(i3);
                            return;
                        default:
                            l3.j((C0122z) e0Var, i3);
                            return;
                    }
                }
            });
        }
        if (z3) {
            R.Q q4 = new R.Q();
            if (!e0Var2.f3253a.p()) {
                Object obj7 = e0Var2.f3254b.f8653a;
                e0Var2.f3253a.g(obj7, q4);
                int i13 = q4.f1797c;
                int b3 = e0Var2.f3253a.b(obj7);
                z7 = z5;
                z8 = z6;
                obj = e0Var2.f3253a.m(i13, (R.S) this.f142a, 0L).f1804a;
                c0122z2 = ((R.S) this.f142a).f1806c;
                i7 = i13;
                i8 = b3;
                obj2 = obj7;
            } else {
                z7 = z5;
                z8 = z6;
                i7 = i5;
                obj = null;
                c0122z2 = null;
                obj2 = null;
                i8 = -1;
            }
            if (i4 == 0) {
                if (e0Var2.f3254b.b()) {
                    C0701z c0701z3 = e0Var2.f3254b;
                    j6 = q4.a(c0701z3.f8654b, c0701z3.f8655c);
                    v3 = v(e0Var2);
                } else if (e0Var2.f3254b.f8657e != -1) {
                    j6 = v(this.f3057d0);
                    v3 = j6;
                } else {
                    j4 = q4.f1799e;
                    j5 = q4.f1798d;
                    j6 = j4 + j5;
                    v3 = j6;
                }
            } else if (e0Var2.f3254b.b()) {
                j6 = e0Var2.f3271s;
                v3 = v(e0Var2);
            } else {
                j4 = q4.f1799e;
                j5 = e0Var2.f3271s;
                j6 = j4 + j5;
                v3 = j6;
            }
            long Z2 = U.A.Z(j6);
            long Z3 = U.A.Z(v3);
            C0701z c0701z4 = e0Var2.f3254b;
            final R.M m3 = new R.M(obj, i7, c0122z2, obj2, i8, Z2, Z3, c0701z4.f8654b, c0701z4.f8655c);
            int o3 = o();
            if (!this.f3057d0.f3253a.p()) {
                e0 e0Var3 = this.f3057d0;
                Object obj8 = e0Var3.f3254b.f8653a;
                e0Var3.f3253a.g(obj8, this.f3069n);
                int b4 = this.f3057d0.f3253a.b(obj8);
                R.T t5 = this.f3057d0.f3253a;
                R.S s4 = (R.S) this.f142a;
                i9 = b4;
                obj3 = t5.m(o3, s4, 0L).f1804a;
                c0122z3 = s4.f1806c;
                obj4 = obj8;
            } else {
                obj3 = null;
                c0122z3 = null;
                obj4 = null;
                i9 = -1;
            }
            long Z4 = U.A.Z(j3);
            if (this.f3057d0.f3254b.b()) {
                j7 = U.A.Z(v(this.f3057d0));
            } else {
                j7 = Z4;
            }
            C0701z c0701z5 = this.f3057d0.f3254b;
            final R.M m4 = new R.M(obj3, o3, c0122z3, obj4, i9, Z4, j7, c0701z5.f8654b, c0701z5.f8655c);
            this.f3067l.c(11, new U.i() { // from class: Y.z
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    l3.getClass();
                    l3.p(i4, m3, m4);
                }
            });
        } else {
            z7 = z5;
            z8 = z6;
        }
        if (booleanValue) {
            this.f3067l.c(1, new U.i() { // from class: Y.t
                @Override // U.i
                public final void b(Object obj72) {
                    R.L l3 = (R.L) obj72;
                    switch (r2) {
                        case 0:
                            R.T t52 = ((e0) c0122z).f3253a;
                            l3.c(intValue);
                            return;
                        default:
                            l3.j((C0122z) c0122z, intValue);
                            return;
                    }
                }
            });
        }
        if (e0Var2.f3258f != e0Var.f3258f) {
            this.f3067l.c(10, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
            if (e0Var.f3258f != null) {
                this.f3067l.c(10, new U.i() { // from class: Y.u
                    @Override // U.i
                    public final void b(Object obj9) {
                        R.L l3 = (R.L) obj9;
                        switch (r2) {
                            case 0:
                                e0 e0Var4 = e0Var;
                                boolean z9 = e0Var4.f3259g;
                                l3.getClass();
                                l3.o(e0Var4.f3259g);
                                return;
                            case 1:
                                e0 e0Var5 = e0Var;
                                l3.w(e0Var5.f3257e, e0Var5.f3264l);
                                return;
                            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                l3.b(e0Var.f3257e);
                                return;
                            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                e0 e0Var6 = e0Var;
                                l3.x(e0Var6.f3265m, e0Var6.f3264l);
                                return;
                            case N.k.LONG_FIELD_NUMBER /* 4 */:
                                l3.a(e0Var.f3266n);
                                return;
                            case N.k.STRING_FIELD_NUMBER /* 5 */:
                                l3.D(e0Var.k());
                                return;
                            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                l3.A(e0Var.f3267o);
                                return;
                            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                l3.e(e0Var.f3258f);
                                return;
                            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                                l3.y(e0Var.f3258f);
                                return;
                            default:
                                l3.v(e0Var.f3261i.f8999d);
                                return;
                        }
                    }
                });
            }
        }
        r0.v vVar = e0Var2.f3261i;
        r0.v vVar2 = e0Var.f3261i;
        if (vVar != vVar2) {
            r0.u uVar = this.f3063h;
            C0576n c0576n = vVar2.f9000e;
            uVar.getClass();
            this.f3067l.c(2, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
        }
        if (!equals2) {
            this.f3067l.c(14, new B0.a(this.f3036K, 6));
        }
        if (z8) {
            this.f3067l.c(3, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
        }
        if (z7 || z4) {
            this.f3067l.c(-1, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
        }
        if (z7) {
            this.f3067l.c(4, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
        }
        if (z4 || e0Var2.f3265m != e0Var.f3265m) {
            this.f3067l.c(5, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
        }
        if (e0Var2.f3266n != e0Var.f3266n) {
            this.f3067l.c(6, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
        }
        if (e0Var2.k() != e0Var.k()) {
            this.f3067l.c(7, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
        }
        if (!e0Var2.f3267o.equals(e0Var.f3267o)) {
            this.f3067l.c(12, new U.i() { // from class: Y.u
                @Override // U.i
                public final void b(Object obj9) {
                    R.L l3 = (R.L) obj9;
                    switch (r2) {
                        case 0:
                            e0 e0Var4 = e0Var;
                            boolean z9 = e0Var4.f3259g;
                            l3.getClass();
                            l3.o(e0Var4.f3259g);
                            return;
                        case 1:
                            e0 e0Var5 = e0Var;
                            l3.w(e0Var5.f3257e, e0Var5.f3264l);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            l3.b(e0Var.f3257e);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            e0 e0Var6 = e0Var;
                            l3.x(e0Var6.f3265m, e0Var6.f3264l);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            l3.a(e0Var.f3266n);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            l3.D(e0Var.k());
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            l3.A(e0Var.f3267o);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            l3.e(e0Var.f3258f);
                            return;
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            l3.y(e0Var.f3258f);
                            return;
                        default:
                            l3.v(e0Var.f3261i.f8999d);
                            return;
                    }
                }
            });
        }
        F();
        this.f3067l.b();
        if (e0Var2.f3268p != e0Var.f3268p) {
            Iterator it = this.f3068m.iterator();
            while (it.hasNext()) {
                ((D) it.next()).f3021a.I();
            }
        }
    }

    public final void I() {
        J();
        int i3 = this.f3057d0.f3257e;
        B1.b bVar = this.f3026A;
        B1.b bVar2 = this.f3080z;
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                J();
                boolean z3 = this.f3057d0.f3268p;
                u();
                bVar2.getClass();
                u();
                bVar.getClass();
                return;
            }
        }
        bVar2.getClass();
        bVar.getClass();
    }

    public final void J() {
        IllegalStateException illegalStateException;
        U.c cVar = this.f3056d;
        synchronized (cVar) {
            boolean z3 = false;
            while (!cVar.f2428a) {
                try {
                    cVar.wait();
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f3074s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f3074s.getThread().getName();
            int i3 = U.A.f2405a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (!this.f3048X) {
                if (this.f3049Y) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                AbstractC0123a.B("ExoPlayerImpl", str, illegalStateException);
                this.f3049Y = true;
                return;
            }
            throw new IllegalStateException(str);
        }
    }

    @Override // C0.e
    public final void i(long j3, int i3) {
        boolean z3;
        J();
        if (i3 == -1) {
            return;
        }
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        R.T t3 = this.f3057d0.f3253a;
        if (!t3.p() && i3 >= t3.o()) {
            return;
        }
        Z.f fVar = this.f3073r;
        if (!fVar.f3484u) {
            Z.a E3 = fVar.E();
            fVar.f3484u = true;
            fVar.J(E3, -1, new Z.c(16));
        }
        this.f3029D++;
        if (w()) {
            AbstractC0123a.A("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            J j4 = new J(this.f3057d0);
            j4.c(1);
            G g3 = this.f3065j.f3406m;
            g3.f3064i.c(new U.n(1, g3, j4));
            return;
        }
        e0 e0Var = this.f3057d0;
        int i4 = e0Var.f3257e;
        if (i4 == 3 || (i4 == 4 && !t3.p())) {
            e0Var = this.f3057d0.g(2);
        }
        int o3 = o();
        e0 x = x(e0Var, t3, y(t3, i3, j3));
        this.f3066k.f3138t.a(3, new L(t3, i3, U.A.M(j3))).b();
        H(x, 0, true, 1, q(x), o3);
    }

    public final R.C j() {
        byte[] bArr;
        R.T r3 = r();
        if (r3.p()) {
            return this.f3055c0;
        }
        C0122z c0122z = r3.m(o(), (R.S) this.f142a, 0L).f1806c;
        R.B a3 = this.f3055c0.a();
        R.C c3 = c0122z.f2010d;
        if (c3 != null) {
            CharSequence charSequence = c3.f1746a;
            if (charSequence != null) {
                a3.f1722a = charSequence;
            }
            CharSequence charSequence2 = c3.f1747b;
            if (charSequence2 != null) {
                a3.f1723b = charSequence2;
            }
            CharSequence charSequence3 = c3.f1748c;
            if (charSequence3 != null) {
                a3.f1724c = charSequence3;
            }
            CharSequence charSequence4 = c3.f1749d;
            if (charSequence4 != null) {
                a3.f1725d = charSequence4;
            }
            CharSequence charSequence5 = c3.f1750e;
            if (charSequence5 != null) {
                a3.f1726e = charSequence5;
            }
            byte[] bArr2 = c3.f1751f;
            if (bArr2 != null) {
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) bArr2.clone();
                }
                a3.f1727f = bArr;
                a3.f1728g = c3.f1752g;
            }
            Integer num = c3.f1753h;
            if (num != null) {
                a3.f1729h = num;
            }
            Integer num2 = c3.f1754i;
            if (num2 != null) {
                a3.f1730i = num2;
            }
            Integer num3 = c3.f1755j;
            if (num3 != null) {
                a3.f1731j = num3;
            }
            Boolean bool = c3.f1756k;
            if (bool != null) {
                a3.f1732k = bool;
            }
            Integer num4 = c3.f1757l;
            if (num4 != null) {
                a3.f1733l = num4;
            }
            Integer num5 = c3.f1758m;
            if (num5 != null) {
                a3.f1733l = num5;
            }
            Integer num6 = c3.f1759n;
            if (num6 != null) {
                a3.f1734m = num6;
            }
            Integer num7 = c3.f1760o;
            if (num7 != null) {
                a3.f1735n = num7;
            }
            Integer num8 = c3.f1761p;
            if (num8 != null) {
                a3.f1736o = num8;
            }
            Integer num9 = c3.f1762q;
            if (num9 != null) {
                a3.f1737p = num9;
            }
            Integer num10 = c3.f1763r;
            if (num10 != null) {
                a3.f1738q = num10;
            }
            CharSequence charSequence6 = c3.f1764s;
            if (charSequence6 != null) {
                a3.f1739r = charSequence6;
            }
            CharSequence charSequence7 = c3.f1765t;
            if (charSequence7 != null) {
                a3.f1740s = charSequence7;
            }
            CharSequence charSequence8 = c3.f1766u;
            if (charSequence8 != null) {
                a3.f1741t = charSequence8;
            }
            CharSequence charSequence9 = c3.f1767v;
            if (charSequence9 != null) {
                a3.f1742u = charSequence9;
            }
            CharSequence charSequence10 = c3.f1768w;
            if (charSequence10 != null) {
                a3.f1743v = charSequence10;
            }
            Integer num11 = c3.x;
            if (num11 != null) {
                a3.f1744w = num11;
            }
        }
        return new R.C(a3);
    }

    public final long k() {
        J();
        if (w()) {
            e0 e0Var = this.f3057d0;
            if (e0Var.f3263k.equals(e0Var.f3254b)) {
                return U.A.Z(this.f3057d0.f3269q);
            }
            return t();
        }
        J();
        if (this.f3057d0.f3253a.p()) {
            return this.f3061f0;
        }
        e0 e0Var2 = this.f3057d0;
        long j3 = 0;
        if (e0Var2.f3263k.f8656d != e0Var2.f3254b.f8656d) {
            return U.A.Z(e0Var2.f3253a.m(o(), (R.S) this.f142a, 0L).f1816m);
        }
        long j4 = e0Var2.f3269q;
        if (this.f3057d0.f3263k.b()) {
            e0 e0Var3 = this.f3057d0;
            e0Var3.f3253a.g(e0Var3.f3263k.f8653a, this.f3069n).d(this.f3057d0.f3263k.f8654b);
        } else {
            j3 = j4;
        }
        e0 e0Var4 = this.f3057d0;
        R.T t3 = e0Var4.f3253a;
        Object obj = e0Var4.f3263k.f8653a;
        R.Q q3 = this.f3069n;
        t3.g(obj, q3);
        return U.A.Z(j3 + q3.f1799e);
    }

    public final long l(e0 e0Var) {
        if (e0Var.f3254b.b()) {
            Object obj = e0Var.f3254b.f8653a;
            R.T t3 = e0Var.f3253a;
            R.Q q3 = this.f3069n;
            t3.g(obj, q3);
            long j3 = e0Var.f3255c;
            if (j3 == -9223372036854775807L) {
                return U.A.Z(t3.m(s(e0Var), (R.S) this.f142a, 0L).f1815l);
            }
            return U.A.Z(q3.f1799e) + U.A.Z(j3);
        }
        return U.A.Z(q(e0Var));
    }

    public final int m() {
        J();
        if (w()) {
            return this.f3057d0.f3254b.f8654b;
        }
        return -1;
    }

    public final int n() {
        J();
        if (w()) {
            return this.f3057d0.f3254b.f8655c;
        }
        return -1;
    }

    public final int o() {
        J();
        int s3 = s(this.f3057d0);
        if (s3 == -1) {
            return 0;
        }
        return s3;
    }

    public final long p() {
        J();
        return U.A.Z(q(this.f3057d0));
    }

    public final long q(e0 e0Var) {
        long j3;
        if (e0Var.f3253a.p()) {
            return U.A.M(this.f3061f0);
        }
        if (e0Var.f3268p) {
            j3 = e0Var.j();
        } else {
            j3 = e0Var.f3271s;
        }
        if (e0Var.f3254b.b()) {
            return j3;
        }
        R.T t3 = e0Var.f3253a;
        Object obj = e0Var.f3254b.f8653a;
        R.Q q3 = this.f3069n;
        t3.g(obj, q3);
        return j3 + q3.f1799e;
    }

    public final R.T r() {
        J();
        return this.f3057d0.f3253a;
    }

    public final int s(e0 e0Var) {
        if (e0Var.f3253a.p()) {
            return this.f3059e0;
        }
        return e0Var.f3253a.g(e0Var.f3254b.f8653a, this.f3069n).f1797c;
    }

    public final long t() {
        J();
        if (w()) {
            e0 e0Var = this.f3057d0;
            C0701z c0701z = e0Var.f3254b;
            R.T t3 = e0Var.f3253a;
            Object obj = c0701z.f8653a;
            R.Q q3 = this.f3069n;
            t3.g(obj, q3);
            return U.A.Z(q3.a(c0701z.f8654b, c0701z.f8655c));
        }
        R.T r3 = r();
        if (r3.p()) {
            return -9223372036854775807L;
        }
        return U.A.Z(r3.m(o(), (R.S) this.f142a, 0L).f1816m);
    }

    public final boolean u() {
        J();
        return this.f3057d0.f3264l;
    }

    public final boolean w() {
        J();
        return this.f3057d0.f3254b.b();
    }

    public final e0 x(e0 e0Var, R.T t3, Pair pair) {
        boolean z3;
        C0701z c0701z;
        o0.b0 b0Var;
        r0.v vVar;
        List list;
        int i3;
        long j3;
        if (!t3.p() && pair == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.e(z3);
        R.T t4 = e0Var.f3253a;
        long l3 = l(e0Var);
        e0 h3 = e0Var.h(t3);
        if (t3.p()) {
            C0701z c0701z2 = e0.f3252u;
            long M3 = U.A.M(this.f3061f0);
            e0 b3 = h3.c(c0701z2, M3, M3, M3, 0L, o0.b0.f8578d, this.f3052b, D1.b0.f231q).b(c0701z2);
            b3.f3269q = b3.f3271s;
            return b3;
        }
        Object obj = h3.f3254b.f8653a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            c0701z = new C0701z(pair.first);
        } else {
            c0701z = h3.f3254b;
        }
        C0701z c0701z3 = c0701z;
        long longValue = ((Long) pair.second).longValue();
        long M4 = U.A.M(l3);
        if (!t4.p()) {
            M4 -= t4.g(obj, this.f3069n).f1799e;
        }
        if (equals && longValue >= M4) {
            if (i3 == 0) {
                int b4 = t3.b(h3.f3263k.f8653a);
                if (b4 == -1 || t3.f(b4, this.f3069n, false).f1797c != t3.g(c0701z3.f8653a, this.f3069n).f1797c) {
                    t3.g(c0701z3.f8653a, this.f3069n);
                    if (c0701z3.b()) {
                        j3 = this.f3069n.a(c0701z3.f8654b, c0701z3.f8655c);
                    } else {
                        j3 = this.f3069n.f1798d;
                    }
                    e0 b5 = h3.c(c0701z3, h3.f3271s, h3.f3271s, h3.f3256d, j3 - h3.f3271s, h3.f3260h, h3.f3261i, h3.f3262j).b(c0701z3);
                    b5.f3269q = j3;
                    return b5;
                }
                return h3;
            }
            AbstractC0123a.j(!c0701z3.b());
            long max = Math.max(0L, h3.f3270r - (longValue - M4));
            long j4 = h3.f3269q;
            if (h3.f3263k.equals(h3.f3254b)) {
                j4 = longValue + max;
            }
            e0 c3 = h3.c(c0701z3, longValue, longValue, longValue, max, h3.f3260h, h3.f3261i, h3.f3262j);
            c3.f3269q = j4;
            return c3;
        }
        AbstractC0123a.j(!c0701z3.b());
        if (!equals) {
            b0Var = o0.b0.f8578d;
        } else {
            b0Var = h3.f3260h;
        }
        o0.b0 b0Var2 = b0Var;
        if (!equals) {
            vVar = this.f3052b;
        } else {
            vVar = h3.f3261i;
        }
        r0.v vVar2 = vVar;
        if (!equals) {
            D1.G g3 = D1.I.f197n;
            list = D1.b0.f231q;
        } else {
            list = h3.f3262j;
        }
        e0 b6 = h3.c(c0701z3, longValue, longValue, longValue, 0L, b0Var2, vVar2, list).b(c0701z3);
        b6.f3269q = longValue;
        return b6;
    }

    public final Pair y(R.T t3, int i3, long j3) {
        if (t3.p()) {
            this.f3059e0 = i3;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f3061f0 = j3;
            return null;
        }
        if (i3 == -1 || i3 >= t3.o()) {
            i3 = t3.a(false);
            j3 = U.A.Z(t3.m(i3, (R.S) this.f142a, 0L).f1815l);
        }
        return t3.i((R.S) this.f142a, this.f3069n, i3, U.A.M(j3));
    }

    public final void z(final int i3, final int i4) {
        U.u uVar = this.f3043S;
        if (i3 != uVar.f2481a || i4 != uVar.f2482b) {
            this.f3043S = new U.u(i3, i4);
            this.f3067l.e(24, new U.i() { // from class: Y.w
                @Override // U.i
                public final void b(Object obj) {
                    ((R.L) obj).l(i3, i4);
                }
            });
            C(2, 14, new U.u(i3, i4));
        }
    }
}

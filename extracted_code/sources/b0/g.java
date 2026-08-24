package b0;

import K.C0059m;
import R.A;
import R.C0118v;
import R.C0119w;
import R.C0122z;
import U.AbstractC0123a;
import W.B;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import c0.C0223c;
import java.io.IOException;
import java.util.HashMap;
import k0.C0558m;
import o0.AbstractC0677a;
import o0.C0701z;
import o0.InterfaceC0699x;
import o0.r;
import p0.C0735h;
import s0.p;
import s0.q;
import t0.AbstractC0817b;
import t0.C0816a;
/* loaded from: classes.dex */
public final class g extends AbstractC0677a {

    /* renamed from: A  reason: collision with root package name */
    public final long f4556A;

    /* renamed from: B  reason: collision with root package name */
    public final long f4557B;

    /* renamed from: C  reason: collision with root package name */
    public final d0.d f4558C;

    /* renamed from: D  reason: collision with root package name */
    public final p f4559D;

    /* renamed from: E  reason: collision with root package name */
    public final C0210d f4560E;

    /* renamed from: F  reason: collision with root package name */
    public final Object f4561F;

    /* renamed from: G  reason: collision with root package name */
    public final SparseArray f4562G;

    /* renamed from: H  reason: collision with root package name */
    public final RunnableC0209c f4563H;

    /* renamed from: I  reason: collision with root package name */
    public final RunnableC0209c f4564I;

    /* renamed from: J  reason: collision with root package name */
    public final C0210d f4565J;

    /* renamed from: K  reason: collision with root package name */
    public final s0.o f4566K;
    public W.h L;

    /* renamed from: M  reason: collision with root package name */
    public s0.n f4567M;

    /* renamed from: N  reason: collision with root package name */
    public B f4568N;

    /* renamed from: O  reason: collision with root package name */
    public A2.b f4569O;

    /* renamed from: P  reason: collision with root package name */
    public Handler f4570P;

    /* renamed from: Q  reason: collision with root package name */
    public C0118v f4571Q;

    /* renamed from: R  reason: collision with root package name */
    public Uri f4572R;

    /* renamed from: S  reason: collision with root package name */
    public final Uri f4573S;

    /* renamed from: T  reason: collision with root package name */
    public C0223c f4574T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f4575U;

    /* renamed from: V  reason: collision with root package name */
    public long f4576V;

    /* renamed from: W  reason: collision with root package name */
    public long f4577W;

    /* renamed from: X  reason: collision with root package name */
    public long f4578X;

    /* renamed from: Y  reason: collision with root package name */
    public int f4579Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f4580Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f4581a0;

    /* renamed from: b0  reason: collision with root package name */
    public C0122z f4582b0;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f4583t;

    /* renamed from: u  reason: collision with root package name */
    public final W.g f4584u;

    /* renamed from: v  reason: collision with root package name */
    public final B0.b f4585v;

    /* renamed from: w  reason: collision with root package name */
    public final e0.l f4586w;
    public final d0.g x;

    /* renamed from: y  reason: collision with root package name */
    public final e0.l f4587y;

    /* renamed from: z  reason: collision with root package name */
    public final C0059m f4588z;

    static {
        A.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [b0.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [b0.c] */
    public g(C0122z c0122z, W.g gVar, p pVar, B0.b bVar, e0.l lVar, d0.g gVar2, e0.l lVar2, long j3, long j4) {
        this.f4582b0 = c0122z;
        this.f4571Q = c0122z.f2009c;
        C0119w c0119w = c0122z.f2008b;
        c0119w.getClass();
        Uri uri = c0119w.f2001a;
        this.f4572R = uri;
        this.f4573S = uri;
        this.f4574T = null;
        this.f4584u = gVar;
        this.f4559D = pVar;
        this.f4585v = bVar;
        this.x = gVar2;
        this.f4587y = lVar2;
        this.f4556A = j3;
        this.f4557B = j4;
        this.f4586w = lVar;
        this.f4588z = new C0059m(3);
        this.f4583t = false;
        this.f4558C = a(null);
        this.f4561F = new Object();
        this.f4562G = new SparseArray();
        this.f4565J = new C0210d(this, 1);
        this.f4580Z = -9223372036854775807L;
        this.f4578X = -9223372036854775807L;
        this.f4560E = new C0210d(this, 2);
        this.f4566K = new C0210d(this, 3);
        this.f4563H = new Runnable(this) { // from class: b0.c

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ g f4542n;

            {
                this.f4542n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f4542n.B();
                        return;
                    default:
                        this.f4542n.A(false);
                        return;
                }
            }
        };
        this.f4564I = new Runnable(this) { // from class: b0.c

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ g f4542n;

            {
                this.f4542n = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f4542n.B();
                        return;
                    default:
                        this.f4542n.A(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean w(c0.h r5) {
        /*
            r0 = 0
            r1 = 0
        L2:
            java.util.List r2 = r5.f4747c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            c0.a r2 = (c0.C0221a) r2
            int r2 = r2.f4704b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.w(c0.h):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f2, code lost:
        if (r10 != (-9223372036854775807L)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0360, code lost:
        if (r1.f1991a == (-9223372036854775807L)) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c6, code lost:
        r2 = r40;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r41) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.g.A(boolean):void");
    }

    public final void B() {
        Uri uri;
        this.f4570P.removeCallbacks(this.f4563H);
        if (this.f4567M.c()) {
            return;
        }
        if (this.f4567M.d()) {
            this.f4575U = true;
            return;
        }
        synchronized (this.f4561F) {
            uri = this.f4572R;
        }
        this.f4575U = false;
        q qVar = new q(this.L, uri, 4, this.f4559D);
        C0210d c0210d = this.f4560E;
        this.f4587y.getClass();
        this.f4558C.k(new r(qVar.f9204m, qVar.f9205n, this.f4567M.f(qVar, c0210d, 3)), qVar.f9206o, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // o0.AbstractC0677a
    public final InterfaceC0699x b(C0701z c0701z, s0.e eVar, long j3) {
        int intValue = ((Integer) c0701z.f8653a).intValue() - this.f4581a0;
        d0.d a3 = a(c0701z);
        d0.d dVar = new d0.d(this.f8571p.f5150c, 0, c0701z);
        int i3 = this.f4581a0 + intValue;
        C0223c c0223c = this.f4574T;
        B b3 = this.f4568N;
        long j4 = this.f4578X;
        Z.m mVar = this.f8574s;
        AbstractC0123a.k(mVar);
        C0208b c0208b = new C0208b(i3, c0223c, this.f4588z, intValue, this.f4585v, b3, this.x, dVar, this.f4587y, a3, j4, this.f4566K, eVar, this.f4586w, this.f4565J, mVar);
        this.f4562G.put(i3, c0208b);
        return c0208b;
    }

    @Override // o0.AbstractC0677a
    public final synchronized C0122z k() {
        return this.f4582b0;
    }

    @Override // o0.AbstractC0677a
    public final void m() {
        this.f4566K.a();
    }

    @Override // o0.AbstractC0677a
    public final void o(B b3) {
        this.f4568N = b3;
        Looper myLooper = Looper.myLooper();
        Z.m mVar = this.f8574s;
        AbstractC0123a.k(mVar);
        d0.g gVar = this.x;
        gVar.d(myLooper, mVar);
        gVar.i();
        if (this.f4583t) {
            A(false);
            return;
        }
        this.L = this.f4584u.a();
        this.f4567M = new s0.n("DashMediaSource");
        this.f4570P = U.A.n(null);
        B();
    }

    @Override // o0.AbstractC0677a
    public final void q(InterfaceC0699x interfaceC0699x) {
        C0208b c0208b = (C0208b) interfaceC0699x;
        o oVar = c0208b.f4539y;
        oVar.f4634u = true;
        oVar.f4629p.removeCallbacksAndMessages(null);
        for (C0735h c0735h : c0208b.f4522D) {
            c0735h.B(c0208b);
        }
        c0208b.f4521C = null;
        this.f4562G.remove(c0208b.f4528m);
    }

    @Override // o0.AbstractC0677a
    public final void s() {
        this.f4575U = false;
        this.L = null;
        s0.n nVar = this.f4567M;
        if (nVar != null) {
            nVar.e(null);
            this.f4567M = null;
        }
        this.f4576V = 0L;
        this.f4577W = 0L;
        this.f4572R = this.f4573S;
        this.f4569O = null;
        Handler handler = this.f4570P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f4570P = null;
        }
        this.f4578X = -9223372036854775807L;
        this.f4579Y = 0;
        this.f4580Z = -9223372036854775807L;
        this.f4562G.clear();
        C0059m c0059m = this.f4588z;
        ((HashMap) c0059m.f650m).clear();
        ((HashMap) c0059m.f651n).clear();
        ((HashMap) c0059m.f652o).clear();
        this.x.release();
    }

    @Override // o0.AbstractC0677a
    public final synchronized void v(C0122z c0122z) {
        this.f4582b0 = c0122z;
    }

    public final void x() {
        boolean z3;
        s0.n nVar = this.f4567M;
        C0210d c0210d = new C0210d(this, 0);
        synchronized (AbstractC0817b.f9240b) {
            z3 = AbstractC0817b.f9241c;
        }
        if (z3) {
            c0210d.b();
            return;
        }
        if (nVar == null) {
            nVar = new s0.n("SntpClient");
        }
        nVar.f(new C0816a(0), new C0558m(c0210d, 13), 1);
    }

    public final void y(q qVar, long j3, long j4) {
        long j5 = qVar.f9204m;
        Uri uri = qVar.f9207p.f2724o;
        r rVar = new r(j4);
        this.f4587y.getClass();
        this.f4558C.c(rVar, qVar.f9206o, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void z(IOException iOException) {
        AbstractC0123a.o("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.f4578X = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        A(true);
    }
}

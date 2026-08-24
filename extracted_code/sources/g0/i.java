package g0;

import R.C0113p;
import U.AbstractC0123a;
import Y.AbstractC0135f;
import android.graphics.Bitmap;
import android.os.Trace;
import e0.C0262c;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class i extends AbstractC0135f {

    /* renamed from: D  reason: collision with root package name */
    public final C0262c f5725D;

    /* renamed from: E  reason: collision with root package name */
    public final X.f f5726E;

    /* renamed from: F  reason: collision with root package name */
    public final ArrayDeque f5727F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f5728G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f5729H;

    /* renamed from: I  reason: collision with root package name */
    public g f5730I;

    /* renamed from: J  reason: collision with root package name */
    public long f5731J;

    /* renamed from: K  reason: collision with root package name */
    public long f5732K;
    public int L;

    /* renamed from: M  reason: collision with root package name */
    public int f5733M;

    /* renamed from: N  reason: collision with root package name */
    public C0113p f5734N;

    /* renamed from: O  reason: collision with root package name */
    public C0272c f5735O;

    /* renamed from: P  reason: collision with root package name */
    public X.f f5736P;

    /* renamed from: Q  reason: collision with root package name */
    public f f5737Q;

    /* renamed from: R  reason: collision with root package name */
    public Bitmap f5738R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f5739S;

    /* renamed from: T  reason: collision with root package name */
    public h f5740T;

    /* renamed from: U  reason: collision with root package name */
    public h f5741U;

    /* renamed from: V  reason: collision with root package name */
    public int f5742V;

    public i(C0262c c0262c) {
        super(4);
        this.f5725D = c0262c;
        this.f5737Q = f.f5718a;
        this.f5726E = new X.f(0);
        this.f5730I = g.f5719c;
        this.f5727F = new ArrayDeque();
        this.f5732K = -9223372036854775807L;
        this.f5731J = -9223372036854775807L;
        this.L = 0;
        this.f5733M = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0144, code lost:
        if (r14.f5722a == ((r0.f1959I * r1.f1958H) - 1)) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(long r13) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.i.B(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0105, code lost:
        if (r2 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011e  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, g0.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.i.C(long):boolean");
    }

    public final void D() {
        C0113p c0113p = this.f5734N;
        C0262c c0262c = this.f5725D;
        int w3 = c0262c.w(c0113p);
        if (w3 != D2.h.e(4, 0, 0, 0) && w3 != D2.h.e(3, 0, 0, 0)) {
            throw f(new Exception("Provided decoder factory can't create decoder for format."), this.f5734N, false, 4005);
        }
        C0272c c0272c = this.f5735O;
        if (c0272c != null) {
            c0272c.release();
        }
        this.f5735O = new C0272c((C0271b) c0262c.f5225n);
    }

    public final void E() {
        this.f5736P = null;
        this.L = 0;
        this.f5732K = -9223372036854775807L;
        C0272c c0272c = this.f5735O;
        if (c0272c != null) {
            c0272c.release();
            this.f5735O = null;
        }
    }

    @Override // Y.AbstractC0135f, Y.g0
    public final void d(int i3, Object obj) {
        f fVar;
        if (i3 == 15) {
            if (obj instanceof f) {
                fVar = (f) obj;
            } else {
                fVar = null;
            }
            if (fVar == null) {
                fVar = f.f5718a;
            }
            this.f5737Q = fVar;
        }
    }

    @Override // Y.AbstractC0135f
    public final String i() {
        return "ImageRenderer";
    }

    @Override // Y.AbstractC0135f
    public final boolean k() {
        return this.f5729H;
    }

    @Override // Y.AbstractC0135f
    public final boolean l() {
        int i3 = this.f5733M;
        if (i3 != 3 && (i3 != 0 || !this.f5739S)) {
            return false;
        }
        return true;
    }

    @Override // Y.AbstractC0135f
    public final void m() {
        this.f5734N = null;
        this.f5730I = g.f5719c;
        this.f5727F.clear();
        E();
        this.f5737Q.getClass();
    }

    @Override // Y.AbstractC0135f
    public final void n(boolean z3, boolean z4) {
        this.f5733M = z4 ? 1 : 0;
    }

    @Override // Y.AbstractC0135f
    public final void o(long j3, boolean z3) {
        this.f5733M = Math.min(this.f5733M, 1);
        this.f5729H = false;
        this.f5728G = false;
        this.f5738R = null;
        this.f5740T = null;
        this.f5741U = null;
        this.f5739S = false;
        this.f5736P = null;
        C0272c c0272c = this.f5735O;
        if (c0272c != null) {
            c0272c.flush();
        }
        this.f5727F.clear();
    }

    @Override // Y.AbstractC0135f
    public final void p() {
        E();
    }

    @Override // Y.AbstractC0135f
    public final void q() {
        E();
        this.f5733M = Math.min(this.f5733M, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r2 >= r7) goto L14;
     */
    @Override // Y.AbstractC0135f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(R.C0113p[] r6, long r7, long r9) {
        /*
            r5 = this;
            g0.g r6 = r5.f5730I
            long r6 = r6.f5721b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L31
            java.util.ArrayDeque r6 = r5.f5727F
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.f5732K
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.f5731J
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L26
            goto L31
        L26:
            g0.g r7 = new g0.g
            long r0 = r5.f5732K
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L38
        L31:
            g0.g r6 = new g0.g
            r6.<init>(r0, r9)
            r5.f5730I = r6
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.i.t(R.p[], long, long):void");
    }

    @Override // Y.AbstractC0135f
    public final void v(long j3, long j4) {
        if (this.f5729H) {
            return;
        }
        if (this.f5734N == null) {
            B1.a aVar = this.f3278o;
            aVar.y();
            X.f fVar = this.f5726E;
            fVar.e();
            int u3 = u(aVar, fVar, 2);
            if (u3 == -5) {
                C0113p c0113p = (C0113p) aVar.f51o;
                AbstractC0123a.k(c0113p);
                this.f5734N = c0113p;
                D();
            } else if (u3 == -4) {
                AbstractC0123a.j(fVar.c(4));
                this.f5728G = true;
                this.f5729H = true;
                return;
            } else {
                return;
            }
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (B(j3)) {
            }
            while (C(j3)) {
            }
            Trace.endSection();
        } catch (e e2) {
            throw f(e2, null, false, 4003);
        }
    }

    @Override // Y.AbstractC0135f
    public final int z(C0113p c0113p) {
        return this.f5725D.w(c0113p);
    }
}

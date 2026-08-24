package a0;

import D1.b0;
import R.C0102e;
import R.C0103f;
import R.C0112o;
import R.C0113p;
import U.AbstractC0123a;
import Y.C0137h;
import Y.k0;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class O extends h0.v implements Y.Q {

    /* renamed from: Q0  reason: collision with root package name */
    public final Context f3699Q0;

    /* renamed from: R0  reason: collision with root package name */
    public final C0171o f3700R0;
    public final L S0;

    /* renamed from: T0  reason: collision with root package name */
    public int f3701T0;

    /* renamed from: U0  reason: collision with root package name */
    public boolean f3702U0;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f3703V0;

    /* renamed from: W0  reason: collision with root package name */
    public C0113p f3704W0;

    /* renamed from: X0  reason: collision with root package name */
    public C0113p f3705X0;

    /* renamed from: Y0  reason: collision with root package name */
    public long f3706Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f3707Z0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f3708a1;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f3709b1;

    /* renamed from: c1  reason: collision with root package name */
    public int f3710c1;

    public O(Context context, h0.k kVar, Handler handler, Y.D d3, L l3) {
        super(1, kVar, 44100.0f);
        this.f3699Q0 = context.getApplicationContext();
        this.S0 = l3;
        this.f3710c1 = -1000;
        this.f3700R0 = new C0171o(handler, d3, 0);
        l3.f3691s = new C1.j(this, 25);
    }

    @Override // h0.v
    public final C0137h C(h0.o oVar, C0113p c0113p, C0113p c0113p2) {
        boolean z3;
        int i3;
        C0137h b3 = oVar.b(c0113p, c0113p2);
        if (this.f5899Q == null && p0(c0113p2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = b3.f3305e;
        if (z3) {
            i4 |= 32768;
        }
        if (v0(oVar, c0113p2) > this.f3701T0) {
            i4 |= 64;
        }
        int i5 = i4;
        if (i5 != 0) {
            i3 = 0;
        } else {
            i3 = b3.f3304d;
        }
        return new C0137h(oVar.f5853a, c0113p, c0113p2, i3, i5);
    }

    @Override // h0.v
    public final float N(float f3, C0113p[] c0113pArr) {
        int i3 = -1;
        for (C0113p c0113p : c0113pArr) {
            int i4 = c0113p.f1952B;
            if (i4 != -1) {
                i3 = Math.max(i3, i4);
            }
        }
        if (i3 == -1) {
            return -1.0f;
        }
        return f3 * i3;
    }

    @Override // h0.v
    public final ArrayList O(h0.w wVar, C0113p c0113p, boolean z3) {
        b0 g3;
        h0.o oVar;
        if (c0113p.f1974m == null) {
            g3 = b0.f231q;
        } else {
            if (this.S0.f(c0113p) != 0) {
                List e2 = h0.D.e("audio/raw", false, false);
                if (e2.isEmpty()) {
                    oVar = null;
                } else {
                    oVar = (h0.o) e2.get(0);
                }
                if (oVar != null) {
                    g3 = D1.I.o(oVar);
                }
            }
            g3 = h0.D.g(wVar, c0113p, z3, false);
        }
        Pattern pattern = h0.D.f5802a;
        ArrayList arrayList = new ArrayList(g3);
        Collections.sort(arrayList, new h0.y(new B0.a(c0113p, 19)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    @Override // h0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h0.j P(h0.o r12, R.C0113p r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.O.P(h0.o, R.p, android.media.MediaCrypto, float):h0.j");
    }

    @Override // h0.v
    public final void Q(X.f fVar) {
        C0113p c0113p;
        E e2;
        if (U.A.f2405a >= 29 && (c0113p = fVar.f2932o) != null && Objects.equals(c0113p.f1974m, "audio/opus") && this.f5929u0) {
            ByteBuffer byteBuffer = fVar.f2937t;
            byteBuffer.getClass();
            C0113p c0113p2 = fVar.f2932o;
            c0113p2.getClass();
            if (byteBuffer.remaining() == 8) {
                int i3 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                L l3 = this.S0;
                AudioTrack audioTrack = l3.f3695w;
                if (audioTrack != null && L.m(audioTrack) && (e2 = l3.f3693u) != null && e2.f3619k) {
                    l3.f3695w.setOffloadDelayPadding(c0113p2.f1954D, i3);
                }
            }
        }
    }

    @Override // h0.v
    public final void V(Exception exc) {
        AbstractC0123a.o("MediaCodecAudioRenderer", "Audio codec error", exc);
        C0171o c0171o = this.f3700R0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new RunnableC0169m(c0171o, exc, 4));
        }
    }

    @Override // h0.v
    public final void W(long j3, long j4, String str) {
        C0171o c0171o = this.f3700R0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new RunnableC0169m(c0171o, str, j3, j4));
        }
    }

    @Override // h0.v
    public final void X(String str) {
        C0171o c0171o = this.f3700R0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new RunnableC0169m(c0171o, str, 8));
        }
    }

    @Override // h0.v
    public final C0137h Y(B1.a aVar) {
        C0113p c0113p = (C0113p) aVar.f51o;
        c0113p.getClass();
        this.f3704W0 = c0113p;
        C0137h Y2 = super.Y(aVar);
        C0171o c0171o = this.f3700R0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new RunnableC0169m(c0171o, c0113p, Y2));
        }
        return Y2;
    }

    @Override // h0.v
    public final void Z(C0113p c0113p, MediaFormat mediaFormat) {
        int i3;
        int i4;
        C0113p c0113p2 = this.f3705X0;
        boolean z3 = true;
        int[] iArr = null;
        if (c0113p2 != null) {
            c0113p = c0113p2;
        } else if (this.f5905W != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(c0113p.f1974m)) {
                i3 = c0113p.f1953C;
            } else if (U.A.f2405a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i3 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i3 = U.A.A(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i3 = 2;
            }
            C0112o c0112o = new C0112o();
            c0112o.f1937l = R.G.l("audio/raw");
            c0112o.f1918B = i3;
            c0112o.f1919C = c0113p.f1954D;
            c0112o.f1920D = c0113p.f1955E;
            c0112o.f1935j = c0113p.f1972k;
            c0112o.f1926a = c0113p.f1962a;
            c0112o.f1927b = c0113p.f1963b;
            c0112o.f1928c = D1.I.j(c0113p.f1964c);
            c0112o.f1929d = c0113p.f1965d;
            c0112o.f1930e = c0113p.f1966e;
            c0112o.f1931f = c0113p.f1967f;
            c0112o.f1950z = mediaFormat.getInteger("channel-count");
            c0112o.f1917A = mediaFormat.getInteger("sample-rate");
            C0113p c0113p3 = new C0113p(c0112o);
            boolean z4 = this.f3702U0;
            int i5 = c0113p3.f1951A;
            if (z4 && i5 == 6 && (i4 = c0113p.f1951A) < 6) {
                iArr = new int[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr[i6] = i6;
                }
            } else if (this.f3703V0) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        if (i5 != 6) {
                            if (i5 != 7) {
                                if (i5 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
            }
            c0113p = c0113p3;
        }
        try {
            int i7 = U.A.f2405a;
            L l3 = this.S0;
            if (i7 >= 29) {
                if (this.f5929u0) {
                    k0 k0Var = this.f3279p;
                    k0Var.getClass();
                    if (k0Var.f3353a != 0) {
                        k0 k0Var2 = this.f3279p;
                        k0Var2.getClass();
                        int i8 = k0Var2.f3353a;
                        l3.getClass();
                        if (i7 < 29) {
                            z3 = false;
                        }
                        AbstractC0123a.j(z3);
                        l3.f3683l = i8;
                    }
                }
                l3.getClass();
                if (i7 < 29) {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                l3.f3683l = 0;
            }
            l3.b(c0113p, iArr);
        } catch (C0172p e2) {
            throw f(e2, e2.f3776m, false, 5001);
        }
    }

    @Override // Y.Q
    public final R.J a() {
        return this.S0.f3639D;
    }

    @Override // h0.v
    public final void a0() {
        this.S0.getClass();
    }

    @Override // Y.Q
    public final void b(R.J j3) {
        L l3 = this.S0;
        l3.getClass();
        l3.f3639D = new R.J(U.A.i(j3.f1779a, 0.1f, 8.0f), U.A.i(j3.f1780b, 0.1f, 8.0f));
        if (l3.t()) {
            l3.s();
            return;
        }
        F f3 = new F(j3, -9223372036854775807L, -9223372036854775807L);
        if (l3.l()) {
            l3.f3637B = f3;
        } else {
            l3.f3638C = f3;
        }
    }

    @Override // Y.Q
    public final boolean c() {
        boolean z3 = this.f3709b1;
        this.f3709b1 = false;
        return z3;
    }

    @Override // h0.v
    public final void c0() {
        this.S0.f3647M = true;
    }

    @Override // Y.AbstractC0135f, Y.g0
    public final void d(int i3, Object obj) {
        R.J j3;
        L l3 = this.S0;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 6) {
                    if (i3 != 12) {
                        boolean z3 = false;
                        if (i3 != 16) {
                            if (i3 != 9) {
                                if (i3 != 10) {
                                    if (i3 == 11) {
                                        this.f5900R = (Y.H) obj;
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue = ((Integer) obj).intValue();
                                if (l3.f3662a0 != intValue) {
                                    l3.f3662a0 = intValue;
                                    if (intValue != 0) {
                                        z3 = true;
                                    }
                                    l3.f3660Z = z3;
                                    l3.d();
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            l3.f3640E = ((Boolean) obj).booleanValue();
                            if (l3.t()) {
                                j3 = R.J.f1778d;
                            } else {
                                j3 = l3.f3639D;
                            }
                            F f3 = new F(j3, -9223372036854775807L, -9223372036854775807L);
                            if (l3.l()) {
                                l3.f3637B = f3;
                                return;
                            } else {
                                l3.f3638C = f3;
                                return;
                            }
                        }
                        obj.getClass();
                        this.f3710c1 = ((Integer) obj).intValue();
                        h0.l lVar = this.f5905W;
                        if (lVar != null && U.A.f2405a >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.f3710c1));
                            lVar.a(bundle);
                            return;
                        }
                        return;
                    } else if (U.A.f2405a >= 23) {
                        N.a(l3, obj);
                        return;
                    } else {
                        return;
                    }
                }
                C0103f c0103f = (C0103f) obj;
                c0103f.getClass();
                if (!l3.f3664b0.equals(c0103f)) {
                    if (l3.f3695w != null) {
                        l3.f3664b0.getClass();
                    }
                    l3.f3664b0 = c0103f;
                    return;
                }
                return;
            }
            C0102e c0102e = (C0102e) obj;
            c0102e.getClass();
            if (!l3.f3636A.equals(c0102e)) {
                l3.f3636A = c0102e;
                if (!l3.f3668d0) {
                    C0165i c0165i = l3.f3696y;
                    if (c0165i != null) {
                        c0165i.f3759i = c0102e;
                        c0165i.a(C0161e.b(c0165i.f3751a, c0102e, c0165i.f3758h));
                    }
                    l3.d();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        if (l3.f3650P != floatValue) {
            l3.f3650P = floatValue;
            if (l3.l()) {
                if (U.A.f2405a >= 21) {
                    l3.f3695w.setVolume(l3.f3650P);
                    return;
                }
                AudioTrack audioTrack = l3.f3695w;
                float f4 = l3.f3650P;
                audioTrack.setStereoVolume(f4, f4);
            }
        }
    }

    @Override // Y.Q
    public final long e() {
        if (this.f3283t == 2) {
            w0();
        }
        return this.f3706Y0;
    }

    @Override // h0.v
    public final boolean g0(long j3, long j4, h0.l lVar, ByteBuffer byteBuffer, int i3, int i4, int i5, long j5, boolean z3, boolean z4, C0113p c0113p) {
        int i6;
        int i7;
        byteBuffer.getClass();
        if (this.f3705X0 != null && (i4 & 2) != 0) {
            lVar.getClass();
            lVar.r(i3, false);
            return true;
        }
        L l3 = this.S0;
        if (z3) {
            if (lVar != null) {
                lVar.r(i3, false);
            }
            this.f5891L0.f3294f += i5;
            l3.f3647M = true;
            return true;
        }
        try {
            if (!l3.i(j5, byteBuffer, i5)) {
                return false;
            }
            if (lVar != null) {
                lVar.r(i3, false);
            }
            this.f5891L0.f3293e += i5;
            return true;
        } catch (C0173q e2) {
            C0113p c0113p2 = this.f3704W0;
            if (this.f5929u0) {
                k0 k0Var = this.f3279p;
                k0Var.getClass();
                if (k0Var.f3353a != 0) {
                    i7 = 5004;
                    throw f(e2, c0113p2, e2.f3778n, i7);
                }
            }
            i7 = 5001;
            throw f(e2, c0113p2, e2.f3778n, i7);
        } catch (r e3) {
            if (this.f5929u0) {
                k0 k0Var2 = this.f3279p;
                k0Var2.getClass();
                if (k0Var2.f3353a != 0) {
                    i6 = 5003;
                    throw f(e3, c0113p, e3.f3780n, i6);
                }
            }
            i6 = 5002;
            throw f(e3, c0113p, e3.f3780n, i6);
        }
    }

    @Override // Y.AbstractC0135f
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // h0.v
    public final void j0() {
        int i3;
        try {
            L l3 = this.S0;
            if (!l3.f3656V && l3.l() && l3.c()) {
                l3.p();
                l3.f3656V = true;
            }
        } catch (r e2) {
            if (this.f5929u0) {
                i3 = 5003;
            } else {
                i3 = 5002;
            }
            throw f(e2, e2.f3781o, e2.f3780n, i3);
        }
    }

    @Override // Y.AbstractC0135f
    public final boolean k() {
        if (this.f5884H0) {
            L l3 = this.S0;
            if (!l3.l() || (l3.f3656V && !l3.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // h0.v, Y.AbstractC0135f
    public final boolean l() {
        if (!this.S0.j() && !super.l()) {
            return false;
        }
        return true;
    }

    @Override // h0.v, Y.AbstractC0135f
    public final void m() {
        C0171o c0171o = this.f3700R0;
        this.f3708a1 = true;
        this.f3704W0 = null;
        try {
            this.S0.d();
            try {
                super.m();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.m();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [Y.g, java.lang.Object] */
    @Override // Y.AbstractC0135f
    public final void n(boolean z3, boolean z4) {
        ?? obj = new Object();
        this.f5891L0 = obj;
        C0171o c0171o = this.f3700R0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new RunnableC0169m(c0171o, (Object) obj, 3));
        }
        k0 k0Var = this.f3279p;
        k0Var.getClass();
        boolean z5 = k0Var.f3354b;
        boolean z6 = false;
        L l3 = this.S0;
        if (z5) {
            l3.getClass();
            if (U.A.f2405a >= 21) {
                z6 = true;
            }
            AbstractC0123a.j(z6);
            AbstractC0123a.j(l3.f3660Z);
            if (!l3.f3668d0) {
                l3.f3668d0 = true;
                l3.d();
            }
        } else if (l3.f3668d0) {
            l3.f3668d0 = false;
            l3.d();
        }
        Z.m mVar = this.f3281r;
        mVar.getClass();
        l3.f3690r = mVar;
        U.v vVar = this.f3282s;
        vVar.getClass();
        l3.f3677i.f3804J = vVar;
    }

    @Override // h0.v, Y.AbstractC0135f
    public final void o(long j3, boolean z3) {
        super.o(j3, z3);
        this.S0.d();
        this.f3706Y0 = j3;
        this.f3709b1 = false;
        this.f3707Z0 = true;
    }

    @Override // Y.AbstractC0135f
    public final void p() {
        C0163g c0163g;
        C0165i c0165i = this.S0.f3696y;
        if (c0165i != null && c0165i.f3760j) {
            c0165i.f3757g = null;
            int i3 = U.A.f2405a;
            Context context = c0165i.f3751a;
            if (i3 >= 23 && (c0163g = c0165i.f3754d) != null) {
                AbstractC0162f.b(context, c0163g);
            }
            U.q qVar = c0165i.f3755e;
            if (qVar != null) {
                context.unregisterReceiver(qVar);
            }
            C0164h c0164h = c0165i.f3756f;
            if (c0164h != null) {
                c0164h.f3748a.unregisterContentObserver(c0164h);
            }
            c0165i.f3760j = false;
        }
    }

    @Override // h0.v
    public final boolean p0(C0113p c0113p) {
        k0 k0Var = this.f3279p;
        k0Var.getClass();
        if (k0Var.f3353a != 0) {
            int u02 = u0(c0113p);
            if ((u02 & 512) != 0) {
                k0 k0Var2 = this.f3279p;
                k0Var2.getClass();
                if (k0Var2.f3353a == 2 || (u02 & 1024) != 0 || (c0113p.f1954D == 0 && c0113p.f1955E == 0)) {
                    return true;
                }
            }
        }
        if (this.S0.f(c0113p) != 0) {
            return true;
        }
        return false;
    }

    @Override // Y.AbstractC0135f
    public final void q() {
        L l3 = this.S0;
        this.f3709b1 = false;
        try {
            E();
            i0();
            C1.j jVar = this.f5899Q;
            if (jVar != null) {
                jVar.N(null);
            }
            this.f5899Q = null;
        } finally {
            if (this.f3708a1) {
                this.f3708a1 = false;
                l3.r();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    @Override // h0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q0(h0.w r17, R.C0113p r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.O.q0(h0.w, R.p):int");
    }

    @Override // Y.AbstractC0135f
    public final void r() {
        this.S0.o();
    }

    @Override // Y.AbstractC0135f
    public final void s() {
        w0();
        L l3 = this.S0;
        l3.f3659Y = false;
        if (l3.l()) {
            v vVar = l3.f3677i;
            vVar.d();
            if (vVar.f3828y == -9223372036854775807L) {
                u uVar = vVar.f3810f;
                uVar.getClass();
                uVar.a();
            } else {
                vVar.f3795A = vVar.b();
                if (!L.m(l3.f3695w)) {
                    return;
                }
            }
            l3.f3695w.pause();
        }
    }

    public final int u0(C0113p c0113p) {
        int i3;
        C0168l e2 = this.S0.e(c0113p);
        if (!e2.f3766a) {
            return 0;
        }
        if (e2.f3767b) {
            i3 = 1536;
        } else {
            i3 = 512;
        }
        if (e2.f3768c) {
            return i3 | 2048;
        }
        return i3;
    }

    public final int v0(h0.o oVar, C0113p c0113p) {
        int i3;
        if ("OMX.google.raw.decoder".equals(oVar.f5853a) && (i3 = U.A.f2405a) < 24 && (i3 != 23 || !U.A.L(this.f3699Q0))) {
            return -1;
        }
        return c0113p.f1975n;
    }

    public final void w0() {
        long j3;
        ArrayDeque arrayDeque;
        long y3;
        long j4;
        S.f fVar;
        boolean k3 = k();
        L l3 = this.S0;
        if (l3.l() && !l3.f3648N) {
            long min = Math.min(l3.f3677i.a(k3), U.A.S(l3.h(), l3.f3693u.f3613e));
            while (true) {
                arrayDeque = l3.f3679j;
                if (arrayDeque.isEmpty() || min < ((F) arrayDeque.getFirst()).f3623c) {
                    break;
                }
                l3.f3638C = (F) arrayDeque.remove();
            }
            long j5 = min - l3.f3638C.f3623c;
            boolean isEmpty = arrayDeque.isEmpty();
            B1.e eVar = l3.f3663b;
            if (isEmpty) {
                S.g gVar = (S.g) eVar.f58p;
                if (gVar.a()) {
                    if (gVar.f2202o >= 1024) {
                        long j6 = gVar.f2201n;
                        gVar.f2197j.getClass();
                        long j7 = j6 - ((fVar.f2177k * fVar.f2168b) * 2);
                        int i3 = gVar.f2195h.f2155a;
                        int i4 = gVar.f2194g.f2155a;
                        if (i3 == i4) {
                            j4 = U.A.U(j5, j7, gVar.f2202o, RoundingMode.FLOOR);
                        } else {
                            j4 = U.A.U(j5, j7 * i3, gVar.f2202o * i4, RoundingMode.FLOOR);
                        }
                    } else {
                        j4 = (long) (gVar.f2190c * j5);
                    }
                    j5 = j4;
                }
                y3 = l3.f3638C.f3622b + j5;
            } else {
                F f3 = (F) arrayDeque.getFirst();
                y3 = f3.f3622b - U.A.y(f3.f3623c - min, l3.f3638C.f3621a.f1779a);
            }
            long j8 = ((Q) eVar.f57o).f3724q;
            j3 = U.A.S(j8, l3.f3693u.f3613e) + y3;
            long j9 = l3.f3680j0;
            if (j8 > j9) {
                long S3 = U.A.S(j8 - j9, l3.f3693u.f3613e);
                l3.f3680j0 = j8;
                l3.f3682k0 += S3;
                if (l3.f3684l0 == null) {
                    l3.f3684l0 = new Handler(Looper.myLooper());
                }
                l3.f3684l0.removeCallbacksAndMessages(null);
                l3.f3684l0.postDelayed(new Z.d(l3, 1), 100L);
            }
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 != Long.MIN_VALUE) {
            if (!this.f3707Z0) {
                j3 = Math.max(this.f3706Y0, j3);
            }
            this.f3706Y0 = j3;
            this.f3707Z0 = false;
        }
    }

    @Override // Y.AbstractC0135f
    public final Y.Q h() {
        return this;
    }
}

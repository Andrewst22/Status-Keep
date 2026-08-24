package a0;

import D1.b0;
import R.C0102e;
import R.C0103f;
import R.C0113p;
import U.AbstractC0123a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class L implements InterfaceC0174s {

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f3633m0 = new Object();

    /* renamed from: n0  reason: collision with root package name */
    public static ExecutorService f3634n0;

    /* renamed from: o0  reason: collision with root package name */
    public static int f3635o0;

    /* renamed from: A  reason: collision with root package name */
    public C0102e f3636A;

    /* renamed from: B  reason: collision with root package name */
    public F f3637B;

    /* renamed from: C  reason: collision with root package name */
    public F f3638C;

    /* renamed from: D  reason: collision with root package name */
    public R.J f3639D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f3640E;

    /* renamed from: F  reason: collision with root package name */
    public ByteBuffer f3641F;

    /* renamed from: G  reason: collision with root package name */
    public int f3642G;

    /* renamed from: H  reason: collision with root package name */
    public long f3643H;

    /* renamed from: I  reason: collision with root package name */
    public long f3644I;

    /* renamed from: J  reason: collision with root package name */
    public long f3645J;

    /* renamed from: K  reason: collision with root package name */
    public long f3646K;
    public int L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f3647M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f3648N;

    /* renamed from: O  reason: collision with root package name */
    public long f3649O;

    /* renamed from: P  reason: collision with root package name */
    public float f3650P;

    /* renamed from: Q  reason: collision with root package name */
    public ByteBuffer f3651Q;

    /* renamed from: R  reason: collision with root package name */
    public int f3652R;

    /* renamed from: S  reason: collision with root package name */
    public ByteBuffer f3653S;

    /* renamed from: T  reason: collision with root package name */
    public byte[] f3654T;

    /* renamed from: U  reason: collision with root package name */
    public int f3655U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f3656V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f3657W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f3658X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f3659Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f3660Z;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3661a;

    /* renamed from: a0  reason: collision with root package name */
    public int f3662a0;

    /* renamed from: b  reason: collision with root package name */
    public final B1.e f3663b;

    /* renamed from: b0  reason: collision with root package name */
    public C0103f f3664b0;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3665c;

    /* renamed from: c0  reason: collision with root package name */
    public C0166j f3666c0;

    /* renamed from: d  reason: collision with root package name */
    public final w f3667d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f3668d0;

    /* renamed from: e  reason: collision with root package name */
    public final T f3669e;

    /* renamed from: e0  reason: collision with root package name */
    public long f3670e0;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f3671f;

    /* renamed from: f0  reason: collision with root package name */
    public long f3672f0;

    /* renamed from: g  reason: collision with root package name */
    public final b0 f3673g;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f3674g0;

    /* renamed from: h  reason: collision with root package name */
    public final U.c f3675h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3676h0;

    /* renamed from: i  reason: collision with root package name */
    public final v f3677i;

    /* renamed from: i0  reason: collision with root package name */
    public Looper f3678i0;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque f3679j;

    /* renamed from: j0  reason: collision with root package name */
    public long f3680j0;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3681k;

    /* renamed from: k0  reason: collision with root package name */
    public long f3682k0;

    /* renamed from: l  reason: collision with root package name */
    public int f3683l;

    /* renamed from: l0  reason: collision with root package name */
    public Handler f3684l0;

    /* renamed from: m  reason: collision with root package name */
    public K f3685m;

    /* renamed from: n  reason: collision with root package name */
    public final E0.c f3686n;

    /* renamed from: o  reason: collision with root package name */
    public final E0.c f3687o;

    /* renamed from: p  reason: collision with root package name */
    public final M f3688p;

    /* renamed from: q  reason: collision with root package name */
    public final B1.a f3689q;

    /* renamed from: r  reason: collision with root package name */
    public Z.m f3690r;

    /* renamed from: s  reason: collision with root package name */
    public C1.j f3691s;

    /* renamed from: t  reason: collision with root package name */
    public E f3692t;

    /* renamed from: u  reason: collision with root package name */
    public E f3693u;

    /* renamed from: v  reason: collision with root package name */
    public S.a f3694v;

    /* renamed from: w  reason: collision with root package name */
    public AudioTrack f3695w;
    public C0161e x;

    /* renamed from: y  reason: collision with root package name */
    public C0165i f3696y;

    /* renamed from: z  reason: collision with root package name */
    public H f3697z;

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, R.f] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, U.c] */
    /* JADX WARN: Type inference failed for: r10v5, types: [a0.w, java.lang.Object, S.e] */
    /* JADX WARN: Type inference failed for: r2v4, types: [a0.T, java.lang.Object, S.e] */
    public L(C c3) {
        C0161e c0161e;
        Context context = (Context) c3.f3604b;
        this.f3661a = context;
        C0102e c0102e = C0102e.f1884c;
        this.f3636A = c0102e;
        if (context != null) {
            C0161e c0161e2 = C0161e.f3742c;
            int i3 = U.A.f2405a;
            c0161e = C0161e.b(context, c0102e, null);
        } else {
            c0161e = (C0161e) c3.f3605c;
        }
        this.x = c0161e;
        this.f3663b = (B1.e) c3.f3606d;
        int i4 = U.A.f2405a;
        this.f3665c = false;
        this.f3681k = false;
        this.f3683l = 0;
        this.f3688p = (M) c3.f3607e;
        B1.a aVar = (B1.a) c3.f3608f;
        aVar.getClass();
        this.f3689q = aVar;
        ?? obj = new Object();
        this.f3675h = obj;
        obj.b();
        this.f3677i = new v(new C1.j(this, 24));
        ?? eVar = new S.e();
        this.f3667d = eVar;
        ?? eVar2 = new S.e();
        eVar2.f3735m = U.A.f2410f;
        this.f3669e = eVar2;
        this.f3671f = D1.I.q(new S.e(), eVar, eVar2);
        this.f3673g = D1.I.o(new S.e());
        this.f3650P = 1.0f;
        this.f3662a0 = 0;
        this.f3664b0 = new Object();
        R.J j3 = R.J.f1778d;
        this.f3638C = new F(j3, 0L, 0L);
        this.f3639D = j3;
        this.f3640E = false;
        this.f3679j = new ArrayDeque();
        this.f3686n = new E0.c(3);
        this.f3687o = new E0.c(3);
    }

    public static boolean m(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (U.A.f2405a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r1 != 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
        if (r1 != 4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r16) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = r15.t()
            r2 = 4
            r3 = 1610612736(0x60000000, float:3.6893488E19)
            r4 = 22
            r5 = 1342177280(0x50000000, float:8.5899346E9)
            r6 = 21
            boolean r7 = r0.f3665c
            B1.e r8 = r0.f3663b
            if (r1 != 0) goto L5a
            boolean r1 = r0.f3668d0
            if (r1 != 0) goto L54
            a0.E r1 = r0.f3693u
            int r9 = r1.f3611c
            if (r9 != 0) goto L54
            R.p r1 = r1.f3609a
            int r1 = r1.f1953C
            if (r7 == 0) goto L31
            int r9 = U.A.f2405a
            if (r1 == r6) goto L54
            if (r1 == r5) goto L54
            if (r1 == r4) goto L54
            if (r1 == r3) goto L54
            if (r1 != r2) goto L31
            goto L54
        L31:
            R.J r1 = r0.f3639D
            r8.getClass()
            float r9 = r1.f1779a
            java.lang.Object r10 = r8.f58p
            S.g r10 = (S.g) r10
            float r11 = r10.f2190c
            r12 = 1
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 == 0) goto L47
            r10.f2190c = r9
            r10.f2196i = r12
        L47:
            float r9 = r10.f2191d
            float r11 = r1.f1780b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L56
            r10.f2191d = r11
            r10.f2196i = r12
            goto L56
        L54:
            R.J r1 = R.J.f1778d
        L56:
            r0.f3639D = r1
        L58:
            r10 = r1
            goto L5d
        L5a:
            R.J r1 = R.J.f1778d
            goto L58
        L5d:
            boolean r1 = r0.f3668d0
            if (r1 != 0) goto L83
            a0.E r1 = r0.f3693u
            int r9 = r1.f3611c
            if (r9 != 0) goto L83
            R.p r1 = r1.f3609a
            int r1 = r1.f1953C
            if (r7 == 0) goto L7a
            int r7 = U.A.f2405a
            if (r1 == r6) goto L83
            if (r1 == r5) goto L83
            if (r1 == r4) goto L83
            if (r1 == r3) goto L83
            if (r1 != r2) goto L7a
            goto L83
        L7a:
            boolean r1 = r0.f3640E
            java.lang.Object r2 = r8.f57o
            a0.Q r2 = (a0.Q) r2
            r2.f3722o = r1
            goto L84
        L83:
            r1 = 0
        L84:
            r0.f3640E = r1
            java.util.ArrayDeque r1 = r0.f3679j
            a0.F r2 = new a0.F
            r3 = 0
            r5 = r16
            long r11 = java.lang.Math.max(r3, r5)
            a0.E r3 = r0.f3693u
            long r4 = r15.h()
            int r3 = r3.f3613e
            long r13 = U.A.S(r4, r3)
            r9 = r2
            r9.<init>(r10, r11, r13)
            r1.add(r2)
            a0.E r1 = r0.f3693u
            S.a r1 = r1.f3617i
            r0.f3694v = r1
            r1.b()
            C1.j r1 = r0.f3691s
            if (r1 == 0) goto Lc6
            boolean r2 = r0.f3640E
            java.lang.Object r1 = r1.f168n
            a0.O r1 = (a0.O) r1
            a0.o r1 = r1.f3700R0
            android.os.Handler r3 = r1.f3774b
            if (r3 == 0) goto Lc6
            a0.n r4 = new a0.n
            r4.<init>()
            r3.post(r4)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.L.a(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c4, code lost:
        if (r23 > 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c7, code lost:
        if (r9 > 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ca, code lost:
        if (r9 < 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c1, code lost:
        if ((r3 & r5) != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Type inference failed for: r13v7, types: [D1.F, D1.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(R.C0113p r27, int[] r28) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.L.b(R.p, int[]):void");
    }

    public final boolean c() {
        if (!this.f3694v.e()) {
            ByteBuffer byteBuffer = this.f3653S;
            if (byteBuffer == null) {
                return true;
            }
            u(byteBuffer, Long.MIN_VALUE);
            if (this.f3653S != null) {
                return false;
            }
            return true;
        }
        S.a aVar = this.f3694v;
        if (aVar.e() && !aVar.f2153d) {
            aVar.f2153d = true;
            ((S.d) aVar.f2151b.get(0)).d();
        }
        q(Long.MIN_VALUE);
        if (!this.f3694v.d()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.f3653S;
        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [a0.M, java.lang.Object] */
    public final void d() {
        H h3;
        if (l()) {
            this.f3643H = 0L;
            this.f3644I = 0L;
            this.f3645J = 0L;
            this.f3646K = 0L;
            this.f3676h0 = false;
            this.L = 0;
            this.f3638C = new F(this.f3639D, 0L, 0L);
            this.f3649O = 0L;
            this.f3637B = null;
            this.f3679j.clear();
            this.f3651Q = null;
            this.f3652R = 0;
            this.f3653S = null;
            this.f3657W = false;
            this.f3656V = false;
            this.f3658X = false;
            this.f3641F = null;
            this.f3642G = 0;
            this.f3669e.f3737o = 0L;
            S.a aVar = this.f3693u.f3617i;
            this.f3694v = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f3677i.f3807c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f3695w.pause();
            }
            if (m(this.f3695w)) {
                K k3 = this.f3685m;
                k3.getClass();
                k3.b(this.f3695w);
            }
            int i3 = U.A.f2405a;
            if (i3 < 21 && !this.f3660Z) {
                this.f3662a0 = 0;
            }
            this.f3693u.getClass();
            final ?? obj = new Object();
            E e2 = this.f3692t;
            if (e2 != null) {
                this.f3693u = e2;
                this.f3692t = null;
            }
            v vVar = this.f3677i;
            vVar.d();
            vVar.f3807c = null;
            vVar.f3810f = null;
            if (i3 >= 24 && (h3 = this.f3697z) != null) {
                h3.c();
                this.f3697z = null;
            }
            final AudioTrack audioTrack2 = this.f3695w;
            final U.c cVar = this.f3675h;
            final C1.j jVar = this.f3691s;
            cVar.a();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f3633m0) {
                try {
                    if (f3634n0 == null) {
                        f3634n0 = Executors.newSingleThreadExecutor(new U.z("ExoPlayer:AudioTrackReleaseThread"));
                    }
                    f3635o0++;
                    f3634n0.execute(new Runnable() { // from class: a0.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioTrack audioTrack3 = audioTrack2;
                            C1.j jVar2 = jVar;
                            Handler handler2 = handler;
                            M m3 = obj;
                            U.c cVar2 = cVar;
                            try {
                                audioTrack3.flush();
                                audioTrack3.release();
                                if (jVar2 != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new U.n(4, jVar2, m3));
                                }
                                cVar2.b();
                                synchronized (L.f3633m0) {
                                    try {
                                        int i4 = L.f3635o0 - 1;
                                        L.f3635o0 = i4;
                                        if (i4 == 0) {
                                            L.f3634n0.shutdown();
                                            L.f3634n0 = null;
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Throwable th) {
                                if (jVar2 != null && handler2.getLooper().getThread().isAlive()) {
                                    handler2.post(new U.n(4, jVar2, m3));
                                }
                                cVar2.b();
                                synchronized (L.f3633m0) {
                                    try {
                                        int i5 = L.f3635o0 - 1;
                                        L.f3635o0 = i5;
                                        if (i5 == 0) {
                                            L.f3634n0.shutdown();
                                            L.f3634n0 = null;
                                        }
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3695w = null;
        }
        this.f3687o.f359o = null;
        this.f3686n.f359o = null;
        this.f3680j0 = 0L;
        this.f3682k0 = 0L;
        Handler handler2 = this.f3684l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final C0168l e(C0113p c0113p) {
        int i3;
        boolean booleanValue;
        boolean z3;
        if (this.f3674g0) {
            return C0168l.f3765d;
        }
        C0102e c0102e = this.f3636A;
        B1.a aVar = this.f3689q;
        aVar.getClass();
        c0113p.getClass();
        c0102e.getClass();
        int i4 = U.A.f2405a;
        if (i4 >= 29 && (i3 = c0113p.f1952B) != -1) {
            Boolean bool = (Boolean) aVar.f51o;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Context context = (Context) aVar.f50n;
                if (context != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        String parameters = audioManager.getParameters("offloadVariableRateSupported");
                        if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        aVar.f51o = Boolean.valueOf(z3);
                    } else {
                        aVar.f51o = Boolean.FALSE;
                    }
                } else {
                    aVar.f51o = Boolean.FALSE;
                }
                booleanValue = ((Boolean) aVar.f51o).booleanValue();
            }
            String str = c0113p.f1974m;
            str.getClass();
            int b3 = R.G.b(str, c0113p.f1971j);
            if (b3 != 0 && i4 >= U.A.q(b3)) {
                int s3 = U.A.s(c0113p.f1951A);
                if (s3 == 0) {
                    return C0168l.f3765d;
                }
                try {
                    AudioFormat r3 = U.A.r(i3, s3, b3);
                    if (i4 >= 31) {
                        return y.a(r3, (AudioAttributes) c0102e.a().f168n, booleanValue);
                    }
                    return x.a(r3, (AudioAttributes) c0102e.a().f168n, booleanValue);
                } catch (IllegalArgumentException unused) {
                    return C0168l.f3765d;
                }
            }
            return C0168l.f3765d;
        }
        return C0168l.f3765d;
    }

    public final int f(C0113p c0113p) {
        n();
        if ("audio/raw".equals(c0113p.f1974m)) {
            int i3 = c0113p.f1953C;
            if (!U.A.I(i3)) {
                AbstractC0123a.A("DefaultAudioSink", "Invalid PCM encoding: " + i3);
                return 0;
            } else if (i3 == 2 || (this.f3665c && i3 == 4)) {
                return 2;
            } else {
                return 1;
            }
        } else if (this.x.d(this.f3636A, c0113p) == null) {
            return 0;
        } else {
            return 2;
        }
    }

    public final long g() {
        E e2 = this.f3693u;
        if (e2.f3611c == 0) {
            return this.f3643H / e2.f3610b;
        }
        return this.f3644I;
    }

    public final long h() {
        E e2 = this.f3693u;
        if (e2.f3611c == 0) {
            long j3 = this.f3645J;
            long j4 = e2.f3612d;
            int i3 = U.A.f2405a;
            return ((j3 + j4) - 1) / j4;
        }
        return this.f3646K;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
        if (r9.b() == 0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(long r24, java.nio.ByteBuffer r26, int r27) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.L.i(long, java.nio.ByteBuffer, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r3.f3658X != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r3 = this;
            boolean r0 = r3.l()
            if (r0 == 0) goto L26
            int r0 = U.A.f2405a
            r1 = 29
            if (r0 < r1) goto L18
            android.media.AudioTrack r0 = r3.f3695w
            boolean r0 = C.G.u(r0)
            if (r0 == 0) goto L18
            boolean r0 = r3.f3658X
            if (r0 != 0) goto L26
        L18:
            a0.v r0 = r3.f3677i
            long r1 = r3.h()
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.L.j():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.L.k():boolean");
    }

    public final boolean l() {
        if (this.f3695w != null) {
            return true;
        }
        return false;
    }

    public final void n() {
        Context context;
        C0161e c3;
        C0163g c0163g;
        if (this.f3696y == null && (context = this.f3661a) != null) {
            this.f3678i0 = Looper.myLooper();
            C0165i c0165i = new C0165i(context, new B0.a(this, 17), this.f3636A, this.f3666c0);
            this.f3696y = c0165i;
            if (c0165i.f3760j) {
                c3 = c0165i.f3757g;
                c3.getClass();
            } else {
                c0165i.f3760j = true;
                C0164h c0164h = c0165i.f3756f;
                if (c0164h != null) {
                    c0164h.f3748a.registerContentObserver(c0164h.f3749b, false, c0164h);
                }
                int i3 = U.A.f2405a;
                Handler handler = c0165i.f3753c;
                Context context2 = c0165i.f3751a;
                if (i3 >= 23 && (c0163g = c0165i.f3754d) != null) {
                    AbstractC0162f.a(context2, c0163g, handler);
                }
                U.q qVar = c0165i.f3755e;
                Intent intent = null;
                if (qVar != null) {
                    intent = context2.registerReceiver(qVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler);
                }
                c3 = C0161e.c(context2, intent, c0165i.f3759i, c0165i.f3758h);
                c0165i.f3757g = c3;
            }
            this.x = c3;
        }
    }

    public final void o() {
        this.f3659Y = true;
        if (l()) {
            v vVar = this.f3677i;
            if (vVar.f3828y != -9223372036854775807L) {
                vVar.f3804J.getClass();
                vVar.f3828y = U.A.M(SystemClock.elapsedRealtime());
            }
            u uVar = vVar.f3810f;
            uVar.getClass();
            uVar.a();
            this.f3695w.play();
        }
    }

    public final void p() {
        if (!this.f3657W) {
            this.f3657W = true;
            long h3 = h();
            v vVar = this.f3677i;
            vVar.f3795A = vVar.b();
            vVar.f3804J.getClass();
            vVar.f3828y = U.A.M(SystemClock.elapsedRealtime());
            vVar.f3796B = h3;
            if (m(this.f3695w)) {
                this.f3658X = false;
            }
            this.f3695w.stop();
            this.f3642G = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        r0 = r3.f3651Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r0.hasRemaining() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        r0 = r3.f3694v;
        r1 = r3.f3651Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r0.e() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r0.f2153d == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        r0.f(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(long r4) {
        /*
            r3 = this;
            S.a r0 = r3.f3694v
            boolean r0 = r0.e()
            if (r0 != 0) goto L13
            java.nio.ByteBuffer r0 = r3.f3651Q
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            java.nio.ByteBuffer r0 = S.d.f2159a
        Lf:
            r3.u(r0, r4)
            return
        L13:
            S.a r0 = r3.f3694v
            boolean r0 = r0.d()
            if (r0 != 0) goto L71
        L1b:
            S.a r0 = r3.f3694v
            boolean r1 = r0.e()
            if (r1 != 0) goto L26
            java.nio.ByteBuffer r0 = S.d.f2159a
            goto L43
        L26:
            java.nio.ByteBuffer[] r1 = r0.f2152c
            int r2 = r0.c()
            r1 = r1[r2]
            boolean r2 = r1.hasRemaining()
            if (r2 == 0) goto L36
            r0 = r1
            goto L43
        L36:
            java.nio.ByteBuffer r1 = S.d.f2159a
            r0.f(r1)
            java.nio.ByteBuffer[] r1 = r0.f2152c
            int r0 = r0.c()
            r0 = r1[r0]
        L43:
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L53
            r3.u(r0, r4)
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L1b
            return
        L53:
            java.nio.ByteBuffer r0 = r3.f3651Q
            if (r0 == 0) goto L71
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L5e
            goto L71
        L5e:
            S.a r0 = r3.f3694v
            java.nio.ByteBuffer r1 = r3.f3651Q
            boolean r2 = r0.e()
            if (r2 == 0) goto L13
            boolean r2 = r0.f2153d
            if (r2 == 0) goto L6d
            goto L13
        L6d:
            r0.f(r1)
            goto L13
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.L.q(long):void");
    }

    public final void r() {
        d();
        D1.G listIterator = this.f3671f.listIterator(0);
        while (listIterator.hasNext()) {
            ((S.d) listIterator.next()).b();
        }
        D1.G listIterator2 = this.f3673g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((S.d) listIterator2.next()).b();
        }
        S.a aVar = this.f3694v;
        if (aVar != null) {
            int i3 = 0;
            while (true) {
                b0 b0Var = aVar.f2150a;
                if (i3 >= b0Var.size()) {
                    break;
                }
                S.d dVar = (S.d) b0Var.get(i3);
                dVar.flush();
                dVar.b();
                i3++;
            }
            aVar.f2152c = new ByteBuffer[0];
            S.b bVar = S.b.f2154e;
            aVar.f2153d = false;
        }
        this.f3659Y = false;
        this.f3674g0 = false;
    }

    public final void s() {
        PlaybackParams allowDefaults;
        PlaybackParams speed;
        PlaybackParams pitch;
        PlaybackParams audioFallbackMode;
        PlaybackParams playbackParams;
        float speed2;
        PlaybackParams playbackParams2;
        float pitch2;
        if (l()) {
            allowDefaults = D.b.g().allowDefaults();
            speed = allowDefaults.setSpeed(this.f3639D.f1779a);
            pitch = speed.setPitch(this.f3639D.f1780b);
            audioFallbackMode = pitch.setAudioFallbackMode(2);
            try {
                this.f3695w.setPlaybackParams(audioFallbackMode);
            } catch (IllegalArgumentException e2) {
                AbstractC0123a.B("DefaultAudioSink", "Failed to set playback params", e2);
            }
            playbackParams = this.f3695w.getPlaybackParams();
            speed2 = playbackParams.getSpeed();
            playbackParams2 = this.f3695w.getPlaybackParams();
            pitch2 = playbackParams2.getPitch();
            R.J j3 = new R.J(speed2, pitch2);
            this.f3639D = j3;
            float f3 = j3.f1779a;
            v vVar = this.f3677i;
            vVar.f3814j = f3;
            u uVar = vVar.f3810f;
            if (uVar != null) {
                uVar.a();
            }
            vVar.d();
        }
    }

    public final boolean t() {
        E e2 = this.f3693u;
        if (e2 != null && e2.f3618j && U.A.f2405a >= 23) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
        if (r12 < r11) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.nio.ByteBuffer r10, long r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.L.u(java.nio.ByteBuffer, long):void");
    }
}

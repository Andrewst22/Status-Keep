package a0;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: A  reason: collision with root package name */
    public long f3795A;

    /* renamed from: B  reason: collision with root package name */
    public long f3796B;

    /* renamed from: C  reason: collision with root package name */
    public long f3797C;

    /* renamed from: D  reason: collision with root package name */
    public long f3798D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f3799E;

    /* renamed from: F  reason: collision with root package name */
    public long f3800F;

    /* renamed from: G  reason: collision with root package name */
    public long f3801G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f3802H;

    /* renamed from: I  reason: collision with root package name */
    public long f3803I;

    /* renamed from: J  reason: collision with root package name */
    public U.v f3804J;

    /* renamed from: a  reason: collision with root package name */
    public final C1.j f3805a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f3806b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f3807c;

    /* renamed from: d  reason: collision with root package name */
    public int f3808d;

    /* renamed from: e  reason: collision with root package name */
    public int f3809e;

    /* renamed from: f  reason: collision with root package name */
    public u f3810f;

    /* renamed from: g  reason: collision with root package name */
    public int f3811g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3812h;

    /* renamed from: i  reason: collision with root package name */
    public long f3813i;

    /* renamed from: j  reason: collision with root package name */
    public float f3814j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3815k;

    /* renamed from: l  reason: collision with root package name */
    public long f3816l;

    /* renamed from: m  reason: collision with root package name */
    public long f3817m;

    /* renamed from: n  reason: collision with root package name */
    public Method f3818n;

    /* renamed from: o  reason: collision with root package name */
    public long f3819o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3820p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3821q;

    /* renamed from: r  reason: collision with root package name */
    public long f3822r;

    /* renamed from: s  reason: collision with root package name */
    public long f3823s;

    /* renamed from: t  reason: collision with root package name */
    public long f3824t;

    /* renamed from: u  reason: collision with root package name */
    public long f3825u;

    /* renamed from: v  reason: collision with root package name */
    public long f3826v;

    /* renamed from: w  reason: collision with root package name */
    public int f3827w;
    public int x;

    /* renamed from: y  reason: collision with root package name */
    public long f3828y;

    /* renamed from: z  reason: collision with root package name */
    public long f3829z;

    public v(C1.j jVar) {
        this.f3805a = jVar;
        try {
            this.f3818n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f3806b = new long[10];
        this.f3804J = U.v.f2483a;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022f A[Catch: Exception -> 0x0245, TRY_LEAVE, TryCatch #0 {Exception -> 0x0245, blocks: (B:88:0x0205, B:90:0x022f), top: B:132:0x0205 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r29) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.v.a(boolean):long");
    }

    public final long b() {
        this.f3804J.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f3828y != -9223372036854775807L) {
            AudioTrack audioTrack = this.f3807c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f3795A;
            }
            return Math.min(this.f3796B, this.f3795A + U.A.U(U.A.y(U.A.M(elapsedRealtime) - this.f3828y, this.f3814j), this.f3811g, 1000000L, RoundingMode.CEILING));
        }
        if (elapsedRealtime - this.f3823s >= 5) {
            AudioTrack audioTrack2 = this.f3807c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                if (this.f3812h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f3826v = this.f3824t;
                    }
                    playbackHeadPosition += this.f3826v;
                }
                if (U.A.f2405a <= 29) {
                    if (playbackHeadPosition == 0 && this.f3824t > 0 && playState == 3) {
                        if (this.f3829z == -9223372036854775807L) {
                            this.f3829z = elapsedRealtime;
                        }
                    } else {
                        this.f3829z = -9223372036854775807L;
                    }
                }
                long j3 = this.f3824t;
                if (j3 > playbackHeadPosition) {
                    if (this.f3802H) {
                        this.f3803I += j3;
                        this.f3802H = false;
                    } else {
                        this.f3825u++;
                    }
                }
                this.f3824t = playbackHeadPosition;
            }
            this.f3823s = elapsedRealtime;
        }
        return this.f3824t + this.f3803I + (this.f3825u << 32);
    }

    public final boolean c(long j3) {
        long a3 = a(false);
        int i3 = this.f3811g;
        int i4 = U.A.f2405a;
        if (j3 <= U.A.U(a3, i3, 1000000L, RoundingMode.CEILING)) {
            if (!this.f3812h) {
                return false;
            }
            AudioTrack audioTrack = this.f3807c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f3816l = 0L;
        this.x = 0;
        this.f3827w = 0;
        this.f3817m = 0L;
        this.f3798D = 0L;
        this.f3801G = 0L;
        this.f3815k = false;
    }
}

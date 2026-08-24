package Y;
/* renamed from: Y.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138i {

    /* renamed from: a  reason: collision with root package name */
    public final long f3315a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3316b;

    /* renamed from: c  reason: collision with root package name */
    public long f3317c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public long f3318d = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    public long f3320f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f3321g = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    public float f3324j = 0.97f;

    /* renamed from: i  reason: collision with root package name */
    public float f3323i = 1.03f;

    /* renamed from: k  reason: collision with root package name */
    public float f3325k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public long f3326l = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public long f3319e = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f3322h = -9223372036854775807L;

    /* renamed from: m  reason: collision with root package name */
    public long f3327m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public long f3328n = -9223372036854775807L;

    public C0138i(long j3, long j4) {
        this.f3315a = j3;
        this.f3316b = j4;
    }

    public final void a() {
        long j3;
        long j4 = this.f3317c;
        if (j4 != -9223372036854775807L) {
            j3 = this.f3318d;
            if (j3 == -9223372036854775807L) {
                long j5 = this.f3320f;
                if (j5 != -9223372036854775807L && j4 < j5) {
                    j4 = j5;
                }
                j3 = this.f3321g;
                if (j3 == -9223372036854775807L || j4 <= j3) {
                    j3 = j4;
                }
            }
        } else {
            j3 = -9223372036854775807L;
        }
        if (this.f3319e == j3) {
            return;
        }
        this.f3319e = j3;
        this.f3322h = j3;
        this.f3327m = -9223372036854775807L;
        this.f3328n = -9223372036854775807L;
        this.f3326l = -9223372036854775807L;
    }
}

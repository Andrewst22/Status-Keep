package w0;
/* renamed from: w0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896f {

    /* renamed from: a  reason: collision with root package name */
    public final long f9580a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9581b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9582c;

    /* renamed from: d  reason: collision with root package name */
    public long f9583d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f9584e;

    /* renamed from: f  reason: collision with root package name */
    public long f9585f;

    /* renamed from: g  reason: collision with root package name */
    public long f9586g;

    /* renamed from: h  reason: collision with root package name */
    public long f9587h;

    public C0896f(long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f9580a = j3;
        this.f9581b = j4;
        this.f9584e = j5;
        this.f9585f = j6;
        this.f9586g = j7;
        this.f9582c = j8;
        this.f9587h = a(j4, 0L, j5, j6, j7, j8);
    }

    public static long a(long j3, long j4, long j5, long j6, long j7, long j8) {
        if (j6 + 1 < j7 && j4 + 1 < j5) {
            long j9 = ((float) (j3 - j4)) * (((float) (j7 - j6)) / ((float) (j5 - j4)));
            return U.A.k(((j9 + j6) - j8) - (j9 / 20), j6, j7 - 1);
        }
        return j6;
    }
}

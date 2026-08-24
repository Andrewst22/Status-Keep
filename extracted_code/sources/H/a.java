package H;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f392a;

    /* renamed from: b  reason: collision with root package name */
    public int f393b;

    /* renamed from: c  reason: collision with root package name */
    public float f394c;

    /* renamed from: d  reason: collision with root package name */
    public float f395d;

    /* renamed from: e  reason: collision with root package name */
    public long f396e;

    /* renamed from: f  reason: collision with root package name */
    public long f397f;

    /* renamed from: g  reason: collision with root package name */
    public long f398g;

    /* renamed from: h  reason: collision with root package name */
    public float f399h;

    /* renamed from: i  reason: collision with root package name */
    public int f400i;

    public final float a(long j3) {
        long j4 = this.f396e;
        if (j3 < j4) {
            return 0.0f;
        }
        long j5 = this.f398g;
        if (j5 >= 0 && j3 >= j5) {
            float f3 = this.f399h;
            return (g.b(((float) (j3 - j5)) / this.f400i, 0.0f, 1.0f) * f3) + (1.0f - f3);
        }
        return g.b(((float) (j3 - j4)) / this.f392a, 0.0f, 1.0f) * 0.5f;
    }
}

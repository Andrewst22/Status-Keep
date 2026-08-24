package w0;
/* loaded from: classes.dex */
public class k implements InterfaceC0890A {

    /* renamed from: a  reason: collision with root package name */
    public final long f9598a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9599b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9600c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9601d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9602e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9603f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9604g;

    public k(long j3, long j4, int i3, int i4, boolean z3) {
        this.f9598a = j3;
        this.f9599b = j4;
        this.f9600c = i4 == -1 ? 1 : i4;
        this.f9602e = i3;
        this.f9604g = z3;
        if (j3 == -1) {
            this.f9601d = -1L;
            this.f9603f = -9223372036854775807L;
            return;
        }
        long j5 = j3 - j4;
        this.f9601d = j5;
        this.f9603f = (Math.max(0L, j5) * 8000000) / i3;
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        if (this.f9601d == -1 && !this.f9604g) {
            return false;
        }
        return true;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        long j4 = this.f9599b;
        long j5 = this.f9601d;
        int i3 = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
        if (i3 == 0 && !this.f9604g) {
            B b3 = new B(0L, j4);
            return new z(b3, b3);
        }
        int i4 = this.f9602e;
        long j6 = this.f9600c;
        long j7 = (((i4 * j3) / 8000000) / j6) * j6;
        if (i3 != 0) {
            j7 = Math.min(j7, j5 - j6);
        }
        long max = Math.max(j7, 0L) + j4;
        long max2 = (Math.max(0L, max - j4) * 8000000) / i4;
        B b4 = new B(max2, max);
        if (i3 != 0 && max2 < j3) {
            long j8 = max + j6;
            if (j8 < this.f9598a) {
                return new z(b4, new B((Math.max(0L, j8 - j4) * 8000000) / i4, j8));
            }
        }
        return new z(b4, b4);
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f9603f;
    }
}

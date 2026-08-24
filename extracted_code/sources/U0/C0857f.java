package u0;

import java.util.Arrays;
/* renamed from: u0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857f {

    /* renamed from: a  reason: collision with root package name */
    public long f9334a;

    /* renamed from: b  reason: collision with root package name */
    public long f9335b;

    /* renamed from: c  reason: collision with root package name */
    public long f9336c;

    /* renamed from: d  reason: collision with root package name */
    public long f9337d;

    /* renamed from: e  reason: collision with root package name */
    public long f9338e;

    /* renamed from: f  reason: collision with root package name */
    public long f9339f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f9340g = new boolean[15];

    /* renamed from: h  reason: collision with root package name */
    public int f9341h;

    public final boolean a() {
        if (this.f9337d > 15 && this.f9341h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j3) {
        long j4 = this.f9337d;
        if (j4 == 0) {
            this.f9334a = j3;
        } else if (j4 == 1) {
            long j5 = j3 - this.f9334a;
            this.f9335b = j5;
            this.f9339f = j5;
            this.f9338e = 1L;
        } else {
            long j6 = j3 - this.f9336c;
            int i3 = (int) (j4 % 15);
            long abs = Math.abs(j6 - this.f9335b);
            boolean[] zArr = this.f9340g;
            if (abs <= 1000000) {
                this.f9338e++;
                this.f9339f += j6;
                if (zArr[i3]) {
                    zArr[i3] = false;
                    this.f9341h--;
                }
            } else if (!zArr[i3]) {
                zArr[i3] = true;
                this.f9341h++;
            }
        }
        this.f9337d++;
        this.f9336c = j3;
    }

    public final void c() {
        this.f9337d = 0L;
        this.f9338e = 0L;
        this.f9339f = 0L;
        this.f9341h = 0;
        Arrays.fill(this.f9340g, false);
    }
}

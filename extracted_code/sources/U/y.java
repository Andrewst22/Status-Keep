package U;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public long f2487a;

    /* renamed from: b  reason: collision with root package name */
    public long f2488b;

    /* renamed from: c  reason: collision with root package name */
    public long f2489c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal f2490d = new ThreadLocal();

    public y(long j3) {
        g(j3);
    }

    public final synchronized long a(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j4 = this.f2487a;
                if (j4 == 9223372036854775806L) {
                    Long l3 = (Long) this.f2490d.get();
                    l3.getClass();
                    j4 = l3.longValue();
                }
                this.f2488b = j4 - j3;
                notifyAll();
            }
            this.f2489c = j3;
            return j3 + this.f2488b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j3) {
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j4 = this.f2489c;
            if (j4 != -9223372036854775807L) {
                long j5 = (j4 * 90000) / 1000000;
                long j6 = (4294967296L + j5) / 8589934592L;
                long j7 = ((j6 - 1) * 8589934592L) + j3;
                long j8 = (j6 * 8589934592L) + j3;
                if (Math.abs(j7 - j5) < Math.abs(j8 - j5)) {
                    j3 = j7;
                } else {
                    j3 = j8;
                }
            }
            return a((j3 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j3) {
        long j4;
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j5 = this.f2489c;
        if (j5 != -9223372036854775807L) {
            long j6 = (j5 * 90000) / 1000000;
            long j7 = j6 / 8589934592L;
            Long.signum(j7);
            long j8 = (j7 * 8589934592L) + j3;
            j4 = ((j7 + 1) * 8589934592L) + j3;
            if (j8 >= j6) {
                j4 = j8;
            }
        } else {
            j4 = j3;
        }
        return a((j4 * 1000000) / 90000);
    }

    public final synchronized long d() {
        long j3;
        j3 = this.f2487a;
        return (j3 == Long.MAX_VALUE || j3 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized long e() {
        return this.f2488b;
    }

    public final synchronized boolean f() {
        boolean z3;
        if (this.f2488b != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        return z3;
    }

    public final synchronized void g(long j3) {
        long j4;
        this.f2487a = j3;
        if (j3 == Long.MAX_VALUE) {
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        this.f2488b = j4;
        this.f2489c = -9223372036854775807L;
    }

    public final synchronized void h(long j3, boolean z3) {
        boolean z4;
        try {
            if (this.f2487a == 9223372036854775806L) {
                z4 = true;
            } else {
                z4 = false;
            }
            AbstractC0123a.j(z4);
            if (f()) {
                return;
            }
            if (z3) {
                this.f2490d.set(Long.valueOf(j3));
            } else {
                while (!f()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

package Y;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class m0 implements Q {

    /* renamed from: m  reason: collision with root package name */
    public final U.v f3367m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3368n;

    /* renamed from: o  reason: collision with root package name */
    public long f3369o;

    /* renamed from: p  reason: collision with root package name */
    public long f3370p;

    /* renamed from: q  reason: collision with root package name */
    public R.J f3371q = R.J.f1778d;

    public m0(U.v vVar) {
        this.f3367m = vVar;
    }

    @Override // Y.Q
    public final R.J a() {
        return this.f3371q;
    }

    @Override // Y.Q
    public final void b(R.J j3) {
        if (this.f3368n) {
            d(e());
        }
        this.f3371q = j3;
    }

    @Override // Y.Q
    public final /* synthetic */ boolean c() {
        return false;
    }

    public final void d(long j3) {
        this.f3369o = j3;
        if (this.f3368n) {
            this.f3367m.getClass();
            this.f3370p = SystemClock.elapsedRealtime();
        }
    }

    @Override // Y.Q
    public final long e() {
        long j3;
        long j4 = this.f3369o;
        if (this.f3368n) {
            this.f3367m.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3370p;
            R.J j5 = this.f3371q;
            if (j5.f1779a == 1.0f) {
                j3 = U.A.M(elapsedRealtime);
            } else {
                j3 = elapsedRealtime * j5.f1781c;
            }
            return j4 + j3;
        }
        return j4;
    }

    public final void f() {
        if (!this.f3368n) {
            this.f3367m.getClass();
            this.f3370p = SystemClock.elapsedRealtime();
            this.f3368n = true;
        }
    }
}

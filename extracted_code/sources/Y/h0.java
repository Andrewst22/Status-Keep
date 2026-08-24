package Y;

import U.AbstractC0123a;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0135f f3306a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f3307b;

    /* renamed from: c  reason: collision with root package name */
    public final U.v f3308c;

    /* renamed from: d  reason: collision with root package name */
    public int f3309d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3310e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f3311f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3312g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3313h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3314i;

    public h0(f0 f0Var, AbstractC0135f abstractC0135f, R.T t3, int i3, U.v vVar, Looper looper) {
        this.f3307b = f0Var;
        this.f3306a = abstractC0135f;
        this.f3311f = looper;
        this.f3308c = vVar;
    }

    public final synchronized void a(long j3) {
        boolean z3;
        boolean z4;
        AbstractC0123a.j(this.f3312g);
        if (this.f3311f.getThread() != Thread.currentThread()) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        this.f3308c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j3;
        while (true) {
            z4 = this.f3314i;
            if (z4 || j3 <= 0) {
                break;
            }
            this.f3308c.getClass();
            wait(j3);
            this.f3308c.getClass();
            j3 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z4) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z3) {
        this.f3313h = z3 | this.f3313h;
        this.f3314i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC0123a.j(!this.f3312g);
        this.f3312g = true;
        M m3 = (M) this.f3307b;
        synchronized (m3) {
            if (!m3.L && m3.f3140v.getThread().isAlive()) {
                m3.f3138t.a(14, this).b();
                return;
            }
            AbstractC0123a.A("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}

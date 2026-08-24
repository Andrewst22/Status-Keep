package s0;

import U.A;
import U.AbstractC0123a;
import U.z;
import android.os.Looper;
import android.os.SystemClock;
import d1.C0255e;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: p  reason: collision with root package name */
    public static final C0255e f9198p = new C0255e(0, -9223372036854775807L, false);

    /* renamed from: q  reason: collision with root package name */
    public static final C0255e f9199q = new C0255e(2, -9223372036854775807L, false);

    /* renamed from: r  reason: collision with root package name */
    public static final C0255e f9200r = new C0255e(3, -9223372036854775807L, false);

    /* renamed from: m  reason: collision with root package name */
    public final ExecutorService f9201m;

    /* renamed from: n  reason: collision with root package name */
    public j f9202n;

    /* renamed from: o  reason: collision with root package name */
    public IOException f9203o;

    public n(String str) {
        String l3 = D2.h.l("ExoPlayer:Loader:", str);
        int i3 = A.f2405a;
        this.f9201m = Executors.newSingleThreadExecutor(new z(l3));
    }

    @Override // s0.o
    public final void a() {
        IOException iOException;
        IOException iOException2 = this.f9203o;
        if (iOException2 == null) {
            j jVar = this.f9202n;
            if (jVar != null && (iOException = jVar.f9192q) != null && jVar.f9193r > jVar.f9188m) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void b() {
        j jVar = this.f9202n;
        AbstractC0123a.k(jVar);
        jVar.a(false);
    }

    public final boolean c() {
        if (this.f9203o != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f9202n != null) {
            return true;
        }
        return false;
    }

    public final void e(l lVar) {
        j jVar = this.f9202n;
        if (jVar != null) {
            jVar.a(true);
        }
        ExecutorService executorService = this.f9201m;
        if (lVar != null) {
            executorService.execute(new H.b(lVar, 8));
        }
        executorService.shutdown();
    }

    public final long f(k kVar, i iVar, int i3) {
        boolean z3;
        Looper myLooper = Looper.myLooper();
        AbstractC0123a.k(myLooper);
        this.f9203o = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j jVar = new j(this, myLooper, kVar, iVar, i3, elapsedRealtime);
        if (this.f9202n == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        this.f9202n = jVar;
        jVar.f9192q = null;
        this.f9201m.execute(jVar);
        return elapsedRealtime;
    }
}

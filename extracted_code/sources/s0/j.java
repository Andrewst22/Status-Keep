package s0;

import U.AbstractC0123a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import d1.C0255e;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class j extends Handler implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final int f9188m;

    /* renamed from: n  reason: collision with root package name */
    public final k f9189n;

    /* renamed from: o  reason: collision with root package name */
    public final long f9190o;

    /* renamed from: p  reason: collision with root package name */
    public i f9191p;

    /* renamed from: q  reason: collision with root package name */
    public IOException f9192q;

    /* renamed from: r  reason: collision with root package name */
    public int f9193r;

    /* renamed from: s  reason: collision with root package name */
    public Thread f9194s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9195t;

    /* renamed from: u  reason: collision with root package name */
    public volatile boolean f9196u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f9197v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, Looper looper, k kVar, i iVar, int i3, long j3) {
        super(looper);
        this.f9197v = nVar;
        this.f9189n = kVar;
        this.f9191p = iVar;
        this.f9188m = i3;
        this.f9190o = j3;
    }

    public final void a(boolean z3) {
        this.f9196u = z3;
        this.f9192q = null;
        if (hasMessages(1)) {
            this.f9195t = true;
            removeMessages(1);
            if (!z3) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f9195t = true;
                    this.f9189n.c();
                    Thread thread = this.f9194s;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z3) {
            this.f9197v.f9202n = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.f9191p;
            iVar.getClass();
            iVar.e(this.f9189n, elapsedRealtime, elapsedRealtime - this.f9190o, true);
            this.f9191p = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z3;
        if (this.f9196u) {
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            this.f9192q = null;
            n nVar = this.f9197v;
            ExecutorService executorService = nVar.f9201m;
            j jVar = nVar.f9202n;
            jVar.getClass();
            executorService.execute(jVar);
        } else if (i3 != 4) {
            this.f9197v.f9202n = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f9190o;
            i iVar = this.f9191p;
            iVar.getClass();
            if (this.f9195t) {
                iVar.e(this.f9189n, elapsedRealtime, j3, false);
                return;
            }
            int i4 = message.what;
            if (i4 != 2) {
                if (i4 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f9192q = iOException;
                    int i5 = this.f9193r + 1;
                    this.f9193r = i5;
                    C0255e c3 = iVar.c(this.f9189n, elapsedRealtime, j3, iOException, i5);
                    int i6 = c3.f5183a;
                    if (i6 == 3) {
                        this.f9197v.f9203o = this.f9192q;
                        return;
                    } else if (i6 != 2) {
                        if (i6 == 1) {
                            this.f9193r = 1;
                        }
                        long j4 = c3.f5184b;
                        if (j4 == -9223372036854775807L) {
                            j4 = Math.min((this.f9193r - 1) * 1000, 5000);
                        }
                        n nVar2 = this.f9197v;
                        if (nVar2.f9202n == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        AbstractC0123a.j(z3);
                        nVar2.f9202n = this;
                        if (j4 > 0) {
                            sendEmptyMessageDelayed(1, j4);
                            return;
                        }
                        this.f9192q = null;
                        nVar2.f9201m.execute(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            try {
                iVar.j(this.f9189n, elapsedRealtime, j3);
            } catch (RuntimeException e2) {
                AbstractC0123a.o("LoadTask", "Unexpected exception handling load completed", e2);
                this.f9197v.f9203o = new m(e2);
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            synchronized (this) {
                z3 = this.f9195t;
                this.f9194s = Thread.currentThread();
            }
            if (!z3) {
                Trace.beginSection("load:".concat(this.f9189n.getClass().getSimpleName()));
                try {
                    this.f9189n.b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f9194s = null;
                Thread.interrupted();
            }
            if (!this.f9196u) {
                sendEmptyMessage(2);
            }
        } catch (IOException e2) {
            if (!this.f9196u) {
                obtainMessage(3, e2).sendToTarget();
            }
        } catch (Exception e3) {
            if (!this.f9196u) {
                AbstractC0123a.o("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(3, new m(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            if (!this.f9196u) {
                AbstractC0123a.o("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(3, new m(e4)).sendToTarget();
            }
        } catch (Error e5) {
            if (!this.f9196u) {
                AbstractC0123a.o("LoadTask", "Unexpected error loading stream", e5);
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        }
    }
}

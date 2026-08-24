package K2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* renamed from: K2.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0093w extends G implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: v  reason: collision with root package name */
    public static final RunnableC0093w f866v;

    /* renamed from: w  reason: collision with root package name */
    public static final long f867w;

    /* JADX WARN: Type inference failed for: r0v0, types: [K2.G, K2.w, K2.H] */
    static {
        Long l3;
        ?? g3 = new G();
        f866v = g3;
        g3.k(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f867w = timeUnit.toNanos(l3.longValue());
    }

    @Override // K2.H
    public final Thread j() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // K2.G, K2.H
    public final void o() {
        debugStatus = 4;
        super.o();
    }

    @Override // K2.G
    public final void p(Runnable runnable) {
        if (debugStatus != 4) {
            super.p(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        boolean z4;
        boolean r3;
        h0.f834a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 != 2 && i3 != 3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (!r3) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long l3 = l();
                    if (l3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f867w + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            s();
                            if (!r()) {
                                j();
                                return;
                            }
                            return;
                        } else if (l3 > j4) {
                            l3 = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (l3 > 0) {
                        int i4 = debugStatus;
                        if (i4 != 2 && i4 != 3) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            _thread = null;
                            s();
                            if (!r()) {
                                j();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, l3);
                    }
                }
            }
        } finally {
            _thread = null;
            s();
            if (!r()) {
                j();
            }
        }
    }

    public final synchronized void s() {
        boolean z3;
        int i3 = debugStatus;
        if (i3 != 2 && i3 != 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            return;
        }
        debugStatus = 3;
        G.f789s.set(this, null);
        G.f790t.set(this, null);
        notifyAll();
    }
}

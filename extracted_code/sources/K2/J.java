package K2;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: classes.dex */
public final class J extends I implements InterfaceC0095y {

    /* renamed from: o  reason: collision with root package name */
    public final Executor f796o;

    public J(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f796o = executor;
        Method method2 = P2.c.f1477a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = P2.c.f1477a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f796o;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof J) && ((J) obj).f796o == this.f796o) {
            return true;
        }
        return false;
    }

    @Override // K2.AbstractC0089s
    public final void g(u2.i iVar, Runnable runnable) {
        try {
            this.f796o.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            P p3 = (P) iVar.d(C0090t.f856n);
            if (p3 != null) {
                p3.b(cancellationException);
            }
            B.f786b.g(iVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f796o);
    }

    @Override // K2.AbstractC0089s
    public final String toString() {
        return this.f796o.toString();
    }
}

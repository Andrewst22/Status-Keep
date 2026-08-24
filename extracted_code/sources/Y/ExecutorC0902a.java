package y;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: y.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0902a implements Executor {

    /* renamed from: m  reason: collision with root package name */
    public final Handler f9699m;

    public ExecutorC0902a(Handler handler) {
        this.f9699m = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f9699m;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}

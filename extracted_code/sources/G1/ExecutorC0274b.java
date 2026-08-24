package g1;

import java.util.concurrent.Executor;
/* renamed from: g1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0274b implements Executor {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5751m;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5751m) {
            case 0:
                runnable.run();
                return;
            default:
                return;
        }
    }
}

package a0;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final /* synthetic */ class I implements Executor {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Handler f3628m;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f3628m.post(runnable);
    }
}

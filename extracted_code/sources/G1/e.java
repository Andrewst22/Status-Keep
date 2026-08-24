package g1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5762m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Context f5763n;

    public /* synthetic */ e(Context context, int i3) {
        this.f5762m = i3;
        this.f5763n = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5762m) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f5763n, 1));
                return;
            default:
                d.s(this.f5763n, new ExecutorC0274b(0), d.f5752a, false);
                return;
        }
    }
}

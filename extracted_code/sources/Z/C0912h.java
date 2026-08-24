package z;

import android.os.Process;
/* renamed from: z.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912h extends Thread {

    /* renamed from: m  reason: collision with root package name */
    public final int f9763m;

    public C0912h(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f9763m = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f9763m);
        super.run();
    }
}

package z;

import java.util.concurrent.ThreadFactory;
/* renamed from: z.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0913i implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0912h(runnable);
    }
}

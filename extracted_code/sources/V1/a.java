package V1;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public int f2703a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int i3 = this.f2703a;
        this.f2703a = i3 + 1;
        sb.append(i3);
        thread.setName(sb.toString());
        return thread;
    }
}

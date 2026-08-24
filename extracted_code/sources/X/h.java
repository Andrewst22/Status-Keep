package X;

import g0.C0272c;
/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0272c f2941m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C0272c c0272c) {
        super("ExoPlayer:SimpleDecoder");
        this.f2941m = c0272c;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (this.f2941m.h());
    }
}

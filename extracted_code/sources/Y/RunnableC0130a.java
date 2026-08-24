package Y;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* renamed from: Y.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0130a extends BroadcastReceiver implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final D f3206m;

    /* renamed from: n  reason: collision with root package name */
    public final Handler f3207n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0131b f3208o;

    public RunnableC0130a(C0131b c0131b, Handler handler, D d3) {
        this.f3208o = c0131b;
        this.f3207n = handler;
        this.f3206m = d3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f3207n.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3208o.f3216a) {
            this.f3206m.f3021a.G(-1, 3, false);
        }
    }
}

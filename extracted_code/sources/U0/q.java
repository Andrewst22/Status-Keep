package u0;

import U.A;
import U.AbstractC0123a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
/* loaded from: classes.dex */
public final class q implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: q  reason: collision with root package name */
    public static final q f9400q = new q();

    /* renamed from: m  reason: collision with root package name */
    public volatile long f9401m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public final Handler f9402n;

    /* renamed from: o  reason: collision with root package name */
    public Choreographer f9403o;

    /* renamed from: p  reason: collision with root package name */
    public int f9404p;

    public q() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i3 = A.f2405a;
        Handler handler = new Handler(looper, this);
        this.f9402n = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f9401m = j3;
        Choreographer choreographer = this.f9403o;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return false;
                }
                Choreographer choreographer = this.f9403o;
                if (choreographer != null) {
                    int i4 = this.f9404p - 1;
                    this.f9404p = i4;
                    if (i4 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f9401m = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f9403o;
            if (choreographer2 != null) {
                int i5 = this.f9404p + 1;
                this.f9404p = i5;
                if (i5 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f9403o = Choreographer.getInstance();
        } catch (RuntimeException e2) {
            AbstractC0123a.B("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
        }
        return true;
    }
}

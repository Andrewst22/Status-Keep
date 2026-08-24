package k0;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    public final OutputStream f7682m;

    /* renamed from: n  reason: collision with root package name */
    public final HandlerThread f7683n;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f7684o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ y f7685p;

    public x(y yVar, OutputStream outputStream) {
        this.f7685p = yVar;
        this.f7682m = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f7683n = handlerThread;
        handlerThread.start();
        this.f7684o = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.f7684o;
        HandlerThread handlerThread = this.f7683n;
        Objects.requireNonNull(handlerThread);
        handler.post(new Z.d(handlerThread, 7));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}

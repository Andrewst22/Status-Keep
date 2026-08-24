package u0;

import U.A;
import U.AbstractC0123a;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
/* loaded from: classes.dex */
public final class n extends Surface {

    /* renamed from: p  reason: collision with root package name */
    public static int f9384p;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f9385q;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f9386m;

    /* renamed from: n  reason: collision with root package name */
    public final m f9387n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9388o;

    public n(m mVar, SurfaceTexture surfaceTexture, boolean z3) {
        super(surfaceTexture);
        this.f9387n = mVar;
        this.f9386m = z3;
    }

    public static synchronized boolean d(Context context) {
        boolean z3;
        String eglQueryString;
        boolean z4;
        int i3;
        synchronized (n.class) {
            try {
                z3 = true;
                if (!f9385q) {
                    int i4 = A.f2405a;
                    if (i4 >= 24 && ((i4 >= 26 || (!"samsung".equals(A.f2407c) && !"XT1650".equals(A.f2408d))) && ((i4 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                        String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        f9384p = i3;
                        f9385q = true;
                    }
                    i3 = 0;
                    f9384p = i3;
                    f9385q = true;
                }
                if (f9384p == 0) {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.HandlerThread, java.lang.Thread, android.os.Handler$Callback, java.lang.Object, u0.m] */
    public static n e(Context context, boolean z3) {
        boolean z4;
        int i3;
        boolean z5 = false;
        if (z3 && !d(context)) {
            z4 = false;
        } else {
            z4 = true;
        }
        AbstractC0123a.j(z4);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z3) {
            i3 = f9384p;
        } else {
            i3 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f9380n = handler;
        handlerThread.f9379m = new U.e(handler);
        synchronized (handlerThread) {
            handlerThread.f9380n.obtainMessage(1, i3, 0).sendToTarget();
            while (handlerThread.f9383q == null && handlerThread.f9382p == null && handlerThread.f9381o == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f9382p;
        if (runtimeException == null) {
            Error error = handlerThread.f9381o;
            if (error == null) {
                n nVar = handlerThread.f9383q;
                nVar.getClass();
                return nVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f9387n) {
            try {
                if (!this.f9388o) {
                    m mVar = this.f9387n;
                    mVar.f9380n.getClass();
                    mVar.f9380n.sendEmptyMessage(2);
                    this.f9388o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

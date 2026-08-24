package U;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
/* loaded from: classes.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f2429s = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: m  reason: collision with root package name */
    public final Handler f2430m;

    /* renamed from: n  reason: collision with root package name */
    public final int[] f2431n = new int[1];

    /* renamed from: o  reason: collision with root package name */
    public EGLDisplay f2432o;

    /* renamed from: p  reason: collision with root package name */
    public EGLContext f2433p;

    /* renamed from: q  reason: collision with root package name */
    public EGLSurface f2434q;

    /* renamed from: r  reason: collision with root package name */
    public SurfaceTexture f2435r;

    public e(Handler handler) {
        this.f2430m = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f2430m.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f2435r;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}

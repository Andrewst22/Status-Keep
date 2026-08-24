package u0;

import U.A;
import U.AbstractC0123a;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
/* loaded from: classes.dex */
public final class m extends HandlerThread implements Handler.Callback {

    /* renamed from: m  reason: collision with root package name */
    public U.e f9379m;

    /* renamed from: n  reason: collision with root package name */
    public Handler f9380n;

    /* renamed from: o  reason: collision with root package name */
    public Error f9381o;

    /* renamed from: p  reason: collision with root package name */
    public RuntimeException f9382p;

    /* renamed from: q  reason: collision with root package name */
    public n f9383q;

    public final void a(int i3) {
        boolean z3;
        boolean z4;
        boolean z5;
        EGLSurface eglCreatePbufferSurface;
        boolean z6;
        boolean z7 = true;
        this.f9379m.getClass();
        U.e eVar = this.f9379m;
        eVar.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.f("eglGetDisplay failed", z3);
        int[] iArr = new int[2];
        AbstractC0123a.f("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        eVar.f2432o = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, U.e.f2429s, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i4 = A.f2405a;
        AbstractC0123a.f(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z4);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(eVar.f2432o, eGLConfig, EGL14.EGL_NO_CONTEXT, i3 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        AbstractC0123a.f("eglCreateContext failed", z5);
        eVar.f2433p = eglCreateContext;
        EGLDisplay eGLDisplay = eVar.f2432o;
        if (i3 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i3 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            AbstractC0123a.f("eglCreatePbufferSurface failed", z6);
        }
        AbstractC0123a.f("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        eVar.f2434q = eglCreatePbufferSurface;
        int[] iArr3 = eVar.f2431n;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z8 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z8) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z8 = true;
        }
        if (!z8) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            eVar.f2435r = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eVar);
            SurfaceTexture surfaceTexture2 = this.f9379m.f2435r;
            surfaceTexture2.getClass();
            if (i3 == 0) {
                z7 = false;
            }
            this.f9383q = new n(this, surfaceTexture2, z7);
            return;
        }
        throw new Exception(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public final void b() {
        this.f9379m.getClass();
        U.e eVar = this.f9379m;
        eVar.f2430m.removeCallbacks(eVar);
        try {
            SurfaceTexture surfaceTexture = eVar.f2435r;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, eVar.f2431n, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = eVar.f2432o;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = eVar.f2432o;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = eVar.f2434q;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eVar.f2432o, eVar.f2434q);
            }
            EGLContext eGLContext = eVar.f2433p;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eVar.f2432o, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = eVar.f2432o;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(eVar.f2432o);
            }
            eVar.f2432o = null;
            eVar.f2433p = null;
            eVar.f2434q = null;
            eVar.f2435r = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        try {
            if (i3 != 1) {
                if (i3 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (U.f e2) {
                AbstractC0123a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.f9382p = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                AbstractC0123a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.f9381o = e3;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e4) {
                AbstractC0123a.o("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                this.f9382p = e4;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}

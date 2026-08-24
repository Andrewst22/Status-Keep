package W1;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
public final class l extends TextureView implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: m  reason: collision with root package name */
    public boolean f2868m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2869n;

    /* renamed from: o  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f2870o;

    /* renamed from: p  reason: collision with root package name */
    public Surface f2871p;

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f2870o;
        if (lVar2 != null) {
            lVar2.g();
        }
        this.f2870o = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f2870o == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f2869n = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f2870o != null) {
            if (getWindowToken() != null) {
                io.flutter.embedding.engine.renderer.l lVar = this.f2870o;
                if (lVar != null) {
                    lVar.g();
                    Surface surface = this.f2871p;
                    if (surface != null) {
                        surface.release();
                        this.f2871p = null;
                    }
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            this.f2870o = null;
            return;
        }
        Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        if (this.f2870o == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f2868m) {
            e();
        }
        this.f2869n = false;
    }

    public final void e() {
        if (this.f2870o != null && getSurfaceTexture() != null) {
            Surface surface = this.f2871p;
            if (surface != null) {
                surface.release();
                this.f2871p = null;
            }
            Surface surface2 = new Surface(getSurfaceTexture());
            this.f2871p = surface2;
            io.flutter.embedding.engine.renderer.l lVar = this.f2870o;
            boolean z3 = this.f2869n;
            if (!z3) {
                lVar.g();
            }
            lVar.f6111c = surface2;
            FlutterJNI flutterJNI = lVar.f6109a;
            if (z3) {
                flutterJNI.onSurfaceWindowChanged(surface2);
                return;
            } else {
                flutterJNI.onSurfaceCreated(surface2);
                return;
            }
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f2870o;
    }

    public void setRenderSurface(Surface surface) {
        this.f2871p = surface;
    }
}

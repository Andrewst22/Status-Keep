package W1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
/* loaded from: classes.dex */
public final class k implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f2867a;

    public k(l lVar) {
        this.f2867a = lVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
        l lVar = this.f2867a;
        boolean z3 = true;
        lVar.f2868m = true;
        if ((lVar.f2870o == null || lVar.f2869n) ? false : false) {
            lVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l lVar = this.f2867a;
        boolean z3 = false;
        lVar.f2868m = false;
        io.flutter.embedding.engine.renderer.l lVar2 = lVar.f2870o;
        if (lVar2 != null && !lVar.f2869n) {
            z3 = true;
        }
        if (z3) {
            if (lVar2 != null) {
                lVar2.g();
                Surface surface = lVar.f2871p;
                if (surface != null) {
                    surface.release();
                    lVar.f2871p = null;
                }
            } else {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
        }
        Surface surface2 = lVar.f2871p;
        if (surface2 != null) {
            surface2.release();
            lVar.f2871p = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
        l lVar = this.f2867a;
        io.flutter.embedding.engine.renderer.l lVar2 = lVar.f2870o;
        if (lVar2 != null && !lVar.f2869n) {
            if (lVar2 != null) {
                lVar2.f6109a.onSurfaceChanged(i3, i4);
                return;
            }
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

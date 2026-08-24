package Y;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
/* loaded from: classes.dex */
public final class D implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ G f3021a;

    public D(G g3) {
        this.f3021a = g3;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
        G g3 = this.f3021a;
        g3.getClass();
        Surface surface = new Surface(surfaceTexture);
        g3.D(surface);
        g3.f3039O = surface;
        g3.z(i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        G g3 = this.f3021a;
        g3.D(null);
        g3.z(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
        this.f3021a.z(i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        this.f3021a.z(i4, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        G g3 = this.f3021a;
        if (g3.f3041Q) {
            g3.D(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        G g3 = this.f3021a;
        if (g3.f3041Q) {
            g3.D(null);
        }
        g3.z(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

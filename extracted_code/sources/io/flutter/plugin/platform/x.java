package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
/* loaded from: classes.dex */
public final class x implements f {

    /* renamed from: a  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f6271a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f6272b;

    /* renamed from: c  reason: collision with root package name */
    public Surface f6273c;

    /* renamed from: d  reason: collision with root package name */
    public int f6274d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f6275e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6276f = false;

    public x(io.flutter.embedding.engine.renderer.i iVar) {
        w wVar = new w(this);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f6271a = iVar;
            this.f6272b = iVar.f6085b.surfaceTexture();
            iVar.f6087d = wVar;
            return;
        }
        throw new UnsupportedOperationException("Platform views cannot be displayed below API level 23You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
    }

    @Override // io.flutter.plugin.platform.f
    public final long a() {
        return this.f6271a.f6084a;
    }

    @Override // io.flutter.plugin.platform.f
    public final void b(int i3, int i4) {
        this.f6274d = i3;
        this.f6275e = i4;
        SurfaceTexture surfaceTexture = this.f6272b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i3, i4);
        }
    }

    @Override // io.flutter.plugin.platform.f
    public final int getHeight() {
        return this.f6275e;
    }

    @Override // io.flutter.plugin.platform.f
    public final Surface getSurface() {
        boolean isReleased;
        Surface surface = this.f6273c;
        if (surface == null || this.f6276f) {
            if (surface != null) {
                surface.release();
                this.f6273c = null;
            }
            this.f6273c = new Surface(this.f6272b);
            this.f6276f = false;
        }
        SurfaceTexture surfaceTexture = this.f6272b;
        if (surfaceTexture != null) {
            isReleased = surfaceTexture.isReleased();
            if (!isReleased) {
                return this.f6273c;
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.platform.f
    public final int getWidth() {
        return this.f6274d;
    }

    @Override // io.flutter.plugin.platform.f
    public final void release() {
        this.f6272b = null;
        Surface surface = this.f6273c;
        if (surface != null) {
            surface.release();
            this.f6273c = null;
        }
    }

    @Override // io.flutter.plugin.platform.f
    public final /* synthetic */ void scheduleFrame() {
    }
}

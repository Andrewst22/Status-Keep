package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
/* loaded from: classes.dex */
public final class i implements TextureRegistry$SurfaceTextureEntry, io.flutter.view.o {

    /* renamed from: a  reason: collision with root package name */
    public final long f6084a;

    /* renamed from: b  reason: collision with root package name */
    public final SurfaceTextureWrapper f6085b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6086c;

    /* renamed from: d  reason: collision with root package name */
    public io.flutter.view.o f6087d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f6088e;

    public i(l lVar, long j3, SurfaceTexture surfaceTexture) {
        this.f6088e = lVar;
        this.f6084a = j3;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new d(this, 1));
        this.f6085b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i iVar = i.this;
                if (!iVar.f6086c) {
                    l lVar2 = iVar.f6088e;
                    if (lVar2.f6109a.isAttached()) {
                        iVar.f6085b.markDirty();
                        lVar2.f6109a.scheduleFrame();
                    }
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f6086c) {
                return;
            }
            l lVar = this.f6088e;
            lVar.f6113e.post(new j(this.f6084a, lVar.f6109a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f6084a;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i3) {
        io.flutter.view.o oVar = this.f6087d;
        if (oVar != null) {
            oVar.onTrimMemory(i3);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f6086c) {
            return;
        }
        this.f6085b.release();
        l lVar = this.f6088e;
        lVar.f6109a.unregisterTexture(this.f6084a);
        lVar.f(this);
        this.f6086c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(io.flutter.view.o oVar) {
        this.f6087d = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f6085b.surfaceTexture();
    }
}

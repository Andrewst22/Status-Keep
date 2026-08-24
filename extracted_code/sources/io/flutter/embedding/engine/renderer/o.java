package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
/* loaded from: classes.dex */
public final class o implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final long f6117a;

    /* renamed from: b  reason: collision with root package name */
    public int f6118b;

    /* renamed from: c  reason: collision with root package name */
    public int f6119c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6120d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f6121e;

    /* renamed from: f  reason: collision with root package name */
    public final i f6122f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f6123g;

    /* renamed from: h  reason: collision with root package name */
    public final FlutterJNI f6124h;

    public o(long j3, Handler handler, FlutterJNI flutterJNI, i iVar) {
        this.f6117a = j3;
        this.f6123g = handler;
        this.f6124h = flutterJNI;
        this.f6122f = iVar;
    }

    public final void finalize() {
        try {
            if (this.f6120d) {
                return;
            }
            release();
            this.f6123g.post(new j(this.f6117a, this.f6124h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f6119c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        if (this.f6121e == null) {
            this.f6121e = new Surface(this.f6122f.f6085b.surfaceTexture());
        }
        return this.f6121e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f6122f.f6085b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f6118b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f6117a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f6122f.release();
        this.f6121e.release();
        this.f6121e = null;
        this.f6120d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f6124h.markTextureFrameAvailable(this.f6117a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i3, int i4) {
        this.f6118b = i3;
        this.f6119c = i4;
        this.f6122f.f6085b.surfaceTexture().setDefaultBufferSize(i3, i4);
    }
}

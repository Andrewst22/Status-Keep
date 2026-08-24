package io.flutter.plugin.platform;

import android.view.SurfaceView;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class B implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final SurfaceView f6183a;

    /* renamed from: b  reason: collision with root package name */
    public z f6184b;

    public B(SurfaceView surfaceView, z zVar) {
        this.f6183a = surfaceView;
        this.f6184b = zVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        z zVar = this.f6184b;
        if (zVar == null) {
            return;
        }
        zVar.run();
        this.f6184b = null;
        this.f6183a.post(new z(this, 1));
    }
}

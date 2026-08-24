package io.flutter.view;

import android.graphics.SurfaceTexture;
import d.InterfaceC0249a;
@InterfaceC0249a
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    void setOnFrameConsumedListener(n nVar);

    void setOnTrimMemoryListener(o oVar);

    SurfaceTexture surfaceTexture();
}

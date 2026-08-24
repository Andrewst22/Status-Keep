package io.flutter.view;

import android.view.Surface;
import d.InterfaceC0249a;
@InterfaceC0249a
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceProducer {
    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(p pVar);

    void setSize(int i3, int i4);
}

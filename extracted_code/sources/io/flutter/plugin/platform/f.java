package io.flutter.plugin.platform;

import android.view.Surface;
/* loaded from: classes.dex */
public interface f {
    long a();

    void b(int i3, int i4);

    int getHeight();

    Surface getSurface();

    int getWidth();

    void release();

    void scheduleFrame();
}

package u0;

import U.AbstractC0123a;
import android.view.Surface;
/* loaded from: classes.dex */
public abstract class p {
    public static void a(Surface surface, float f3) {
        int i3;
        if (f3 == 0.0f) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        try {
            surface.setFrameRate(f3, i3);
        } catch (IllegalStateException e2) {
            AbstractC0123a.o("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}

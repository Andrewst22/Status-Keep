package p2;

import W1.i;
import Y.G;
import Y.InterfaceC0147s;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
/* renamed from: p2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737a implements io.flutter.plugin.platform.e {

    /* renamed from: a  reason: collision with root package name */
    public final SurfaceView f8832a;

    public C0737a(Context context, InterfaceC0147s interfaceC0147s) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f8832a = surfaceView;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 == 28) {
            surfaceView.getHolder().addCallback(new i(interfaceC0147s, 1));
            return;
        }
        if (i3 <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        G g3 = (G) interfaceC0147s;
        g3.J();
        SurfaceHolder holder = surfaceView.getHolder();
        g3.J();
        if (holder == null) {
            g3.J();
            g3.B();
            g3.D(null);
            g3.z(0, 0);
            return;
        }
        g3.B();
        g3.f3041Q = true;
        g3.f3040P = holder;
        holder.addCallback(g3.f3077v);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            g3.D(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            g3.z(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        g3.D(null);
        g3.z(0, 0);
    }
}

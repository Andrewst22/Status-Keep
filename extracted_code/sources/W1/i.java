package W1;

import Y.G;
import Y.InterfaceC0147s;
import android.view.Surface;
import android.view.SurfaceHolder;
/* loaded from: classes.dex */
public final class i implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2861a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2862b;

    public /* synthetic */ i(Object obj, int i3) {
        this.f2861a = i3;
        this.f2862b = obj;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        switch (this.f2861a) {
            case 0:
                j jVar = (j) this.f2862b;
                io.flutter.embedding.engine.renderer.l lVar = jVar.f2865o;
                if (lVar != null && !jVar.f2864n) {
                    if (lVar != null) {
                        lVar.f6109a.onSurfaceChanged(i4, i5);
                        return;
                    }
                    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
                }
                return;
            default:
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f2861a) {
            case 0:
                j jVar = (j) this.f2862b;
                boolean z3 = true;
                jVar.f2863m = true;
                if ((jVar.f2865o == null || jVar.f2864n) ? false : false) {
                    jVar.e();
                    return;
                }
                return;
            default:
                Surface surface = surfaceHolder.getSurface();
                InterfaceC0147s interfaceC0147s = (InterfaceC0147s) this.f2862b;
                ((G) interfaceC0147s).E(surface);
                C0.e eVar = (C0.e) interfaceC0147s;
                eVar.getClass();
                eVar.i(1L, ((G) eVar).o());
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f2861a) {
            case 0:
                j jVar = (j) this.f2862b;
                boolean z3 = false;
                jVar.f2863m = false;
                io.flutter.embedding.engine.renderer.l lVar = jVar.f2865o;
                if (lVar != null && !jVar.f2864n) {
                    z3 = true;
                }
                if (z3) {
                    if (lVar != null) {
                        lVar.g();
                        return;
                    }
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
                return;
            default:
                ((G) ((InterfaceC0147s) this.f2862b)).E(null);
                return;
        }
    }

    private final void a(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
    }
}

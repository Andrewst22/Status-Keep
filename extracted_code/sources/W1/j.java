package W1;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
public final class j extends SurfaceView implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: m  reason: collision with root package name */
    public boolean f2863m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2864n;

    /* renamed from: o  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f2865o;

    /* renamed from: p  reason: collision with root package name */
    public final e f2866p;

    public j(d dVar, boolean z3) {
        super(dVar, null);
        this.f2863m = false;
        this.f2864n = false;
        i iVar = new i(this, 0);
        this.f2866p = new e(this, 1);
        if (z3) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(iVar);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f2865o;
        if (lVar2 != null) {
            lVar2.g();
            this.f2865o.f6109a.removeIsDisplayingFlutterUiListener(this.f2866p);
        }
        this.f2865o = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f2865o == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f2864n = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f2865o != null) {
            if (getWindowToken() != null) {
                io.flutter.embedding.engine.renderer.l lVar = this.f2865o;
                if (lVar != null) {
                    lVar.g();
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            setAlpha(0.0f);
            this.f2865o.f6109a.removeIsDisplayingFlutterUiListener(this.f2866p);
            this.f2865o = null;
            return;
        }
        Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        io.flutter.embedding.engine.renderer.l lVar = this.f2865o;
        if (lVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = lVar.f6109a;
        e eVar = this.f2866p;
        flutterJNI.addIsDisplayingFlutterUiListener(eVar);
        if (lVar.f6112d) {
            eVar.b();
        }
        if (this.f2863m) {
            e();
        }
        this.f2864n = false;
    }

    public final void e() {
        if (this.f2865o != null && getHolder() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f2865o;
            Surface surface = getHolder().getSurface();
            boolean z3 = this.f2864n;
            if (!z3) {
                lVar.g();
            }
            lVar.f6111c = surface;
            FlutterJNI flutterJNI = lVar.f6109a;
            if (z3) {
                flutterJNI.onSurfaceWindowChanged(surface);
                return;
            } else {
                flutterJNI.onSurfaceCreated(surface);
                return;
            }
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f2865o;
    }
}

package io.flutter.plugin.platform;

import android.app.Activity;
import android.os.IBinder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class A implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6180a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6181b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6182c;

    public A(SurfaceView surfaceView, k kVar) {
        this.f6181b = surfaceView;
        this.f6182c = kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f6180a) {
            case 0:
                z zVar = new z(this, 0);
                SurfaceView surfaceView = (SurfaceView) this.f6181b;
                surfaceView.getViewTreeObserver().addOnDrawListener(new B(surfaceView, zVar));
                surfaceView.removeOnAttachStateChangeListener(this);
                return;
            default:
                D2.i.e(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f6182c).get();
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                } else {
                    iBinder = null;
                }
                if (activity != null && iBinder != null) {
                    ((u1.h) this.f6181b).g(iBinder, activity);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6180a) {
            case 0:
                return;
            default:
                D2.i.e(view, "view");
                return;
        }
    }

    public A(u1.h hVar, Activity activity) {
        D2.i.e(hVar, "sidecarCompat");
        this.f6181b = hVar;
        this.f6182c = new WeakReference(activity);
    }

    private final void a(View view) {
    }
}

package io.flutter.plugin.platform;

import android.view.SurfaceView;
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f6277m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f6278n;

    public /* synthetic */ z(Object obj, int i3) {
        this.f6277m = i3;
        this.f6278n = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6277m) {
            case 0:
                A a3 = (A) this.f6278n;
                ((SurfaceView) a3.f6181b).postDelayed((k) a3.f6182c, 128L);
                return;
            default:
                B b3 = (B) this.f6278n;
                b3.f6183a.getViewTreeObserver().removeOnDrawListener(b3);
                return;
        }
    }
}

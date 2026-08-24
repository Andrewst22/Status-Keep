package io.flutter.view;

import android.hardware.display.DisplayManager;
/* loaded from: classes.dex */
public final class r implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6404a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayManager f6405b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6406c;

    public /* synthetic */ r(Object obj, DisplayManager displayManager, int i3) {
        this.f6404a = i3;
        this.f6406c = obj;
        this.f6405b = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i3) {
        int i4 = this.f6404a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i3) {
        switch (this.f6404a) {
            case 0:
                if (i3 == 0) {
                    float refreshRate = this.f6405b.getDisplay(0).getRefreshRate();
                    t tVar = (t) this.f6406c;
                    tVar.f6411a = (long) (1.0E9d / refreshRate);
                    tVar.f6412b.setRefreshRateFPS(refreshRate);
                    return;
                }
                return;
            default:
                if (i3 == 0) {
                    u0.r.a((u0.r) this.f6406c, this.f6405b.getDisplay(0));
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i3) {
        int i4 = this.f6404a;
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(int i3) {
    }

    private final void d(int i3) {
    }
}

package io.flutter.plugin.platform;

import android.app.Activity;
import android.hardware.display.VirtualDisplay;
import android.view.SurfaceView;
import p2.C0737a;
/* loaded from: classes.dex */
public final class C {

    /* renamed from: i  reason: collision with root package name */
    public static final y f6185i = new VirtualDisplay.Callback();

    /* renamed from: a  reason: collision with root package name */
    public SingleViewPresentation f6186a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f6187b;

    /* renamed from: c  reason: collision with root package name */
    public final C0322a f6188c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6189d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6190e;

    /* renamed from: f  reason: collision with root package name */
    public final f f6191f;

    /* renamed from: g  reason: collision with root package name */
    public final j f6192g;

    /* renamed from: h  reason: collision with root package name */
    public VirtualDisplay f6193h;

    public C(Activity activity, C0322a c0322a, VirtualDisplay virtualDisplay, C0737a c0737a, f fVar, j jVar, int i3) {
        this.f6187b = activity;
        this.f6188c = c0322a;
        this.f6191f = fVar;
        this.f6192g = jVar;
        this.f6190e = i3;
        this.f6193h = virtualDisplay;
        this.f6189d = activity.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(activity, this.f6193h.getDisplay(), c0737a, c0322a, i3, jVar);
        this.f6186a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final SurfaceView a() {
        SingleViewPresentation singleViewPresentation = this.f6186a;
        if (singleViewPresentation == null) {
            return null;
        }
        return ((C0737a) singleViewPresentation.getView()).f8832a;
    }
}

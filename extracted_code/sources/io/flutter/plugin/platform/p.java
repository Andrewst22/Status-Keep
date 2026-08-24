package io.flutter.plugin.platform;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public final class p extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    public final C0322a f6261m;

    /* renamed from: n  reason: collision with root package name */
    public final SurfaceView f6262n;

    public p(Context context, C0322a c0322a, SurfaceView surfaceView) {
        super(context);
        this.f6261m = c0322a;
        this.f6262n = surfaceView;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.k kVar = this.f6261m.f6196a;
        if (kVar == null) {
            return false;
        }
        return kVar.a(this.f6262n, view, accessibilityEvent);
    }
}

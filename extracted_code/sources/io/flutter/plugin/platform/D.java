package io.flutter.plugin.platform;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import j$.util.function.Consumer;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public final class D implements WindowManager {

    /* renamed from: m  reason: collision with root package name */
    public final WindowManager f6194m;

    /* renamed from: n  reason: collision with root package name */
    public final o f6195n;

    public D(WindowManager windowManager, o oVar) {
        this.f6194m = windowManager;
        this.f6195n = oVar;
    }

    @Override // android.view.WindowManager
    public final /* synthetic */ void addCrossWindowBlurEnabledListener(Consumer consumer) {
        addCrossWindowBlurEnabledListener(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f6195n;
        if (oVar == null) {
            Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            oVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.f6194m.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final Display getDefaultDisplay() {
        return this.f6194m.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.f6194m.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.f6194m.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public final /* synthetic */ void removeCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        removeCrossWindowBlurEnabledListener(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // android.view.ViewManager
    public final void removeView(View view) {
        o oVar = this.f6195n;
        if (oVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            oVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public final void removeViewImmediate(View view) {
        o oVar = this.f6195n;
        if (oVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        oVar.removeView(view);
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f6195n;
        if (oVar == null) {
            Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            oVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final /* synthetic */ void addCrossWindowBlurEnabledListener(Executor executor, java.util.function.Consumer consumer) {
        addCrossWindowBlurEnabledListener(executor, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final void removeCrossWindowBlurEnabledListener(j$.util.function.Consumer consumer) {
        this.f6194m.removeCrossWindowBlurEnabledListener(Consumer.Wrapper.convert(consumer));
    }

    public final void addCrossWindowBlurEnabledListener(j$.util.function.Consumer consumer) {
        this.f6194m.addCrossWindowBlurEnabledListener(Consumer.Wrapper.convert(consumer));
    }

    public final void addCrossWindowBlurEnabledListener(Executor executor, j$.util.function.Consumer consumer) {
        this.f6194m.addCrossWindowBlurEnabledListener(executor, Consumer.Wrapper.convert(consumer));
    }
}

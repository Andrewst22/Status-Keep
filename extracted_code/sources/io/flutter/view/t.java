package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static t f6409e;

    /* renamed from: f  reason: collision with root package name */
    public static r f6410f;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f6412b;

    /* renamed from: a  reason: collision with root package name */
    public long f6411a = -1;

    /* renamed from: c  reason: collision with root package name */
    public s f6413c = new s(this, 0);

    /* renamed from: d  reason: collision with root package name */
    public final a f6414d = new a(this);

    public t(FlutterJNI flutterJNI) {
        this.f6412b = flutterJNI;
    }

    public static t a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f6409e == null) {
            f6409e = new t(flutterJNI);
        }
        if (f6410f == null) {
            t tVar = f6409e;
            Objects.requireNonNull(tVar);
            r rVar = new r(tVar, displayManager, 0);
            f6410f = rVar;
            displayManager.registerDisplayListener(rVar, null);
        }
        if (f6409e.f6411a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f6409e.f6411a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f6409e;
    }
}

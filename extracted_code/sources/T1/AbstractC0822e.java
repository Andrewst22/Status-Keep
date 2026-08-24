package t1;

import C.F;
import C.H;
import C.I;
import C.J;
import C.S;
import D2.i;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import o1.C0703b;
import r1.C0760b;
import r1.C0761c;
import r1.j;
import r1.k;
import r1.n;
/* renamed from: t1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0822e {
    public static C0761c a(k kVar, FoldingFeature foldingFeature) {
        C0760b c0760b;
        C0760b c0760b2;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            c0760b = C0760b.f9008t;
        } else {
            c0760b = C0760b.f9007s;
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            c0760b2 = C0760b.f9006r;
        } else {
            c0760b2 = C0760b.f9005q;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        C0703b c0703b = new C0703b(bounds);
        Rect c3 = kVar.f9029a.c();
        if (c0703b.a() == 0 && c0703b.b() == 0) {
            return null;
        }
        if (c0703b.b() != c3.width() && c0703b.a() != c3.height()) {
            return null;
        }
        if (c0703b.b() < c3.width() && c0703b.a() < c3.height()) {
            return null;
        }
        if (c0703b.b() == c3.width() && c0703b.a() == c3.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        i.d(bounds2, "oemFeature.bounds");
        return new C0761c(new C0703b(bounds2), c0760b, c0760b2);
    }

    public static j b(Context context, WindowLayoutInfo windowLayoutInfo) {
        J f3;
        k kVar;
        Object systemService;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        i.e(windowLayoutInfo, "info");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            int i4 = n.f9033b;
            if (i3 >= 30) {
                systemService = context.getSystemService(WindowManager.class);
                WindowManager windowManager = (WindowManager) systemService;
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                S a3 = S.a(windowInsets, null);
                currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
                bounds = currentWindowMetrics2.getBounds();
                i.d(bounds, "wm.currentWindowMetrics.bounds");
                kVar = new k(bounds, a3);
            } else {
                Context context2 = context;
                while (context2 instanceof ContextWrapper) {
                    boolean z3 = context2 instanceof Activity;
                    if (!z3 && !(context2 instanceof InputMethodService)) {
                        ContextWrapper contextWrapper = (ContextWrapper) context2;
                        if (contextWrapper.getBaseContext() != null) {
                            context2 = contextWrapper.getBaseContext();
                            i.d(context2, "iterator.baseContext");
                        }
                    }
                    if (z3) {
                        kVar = n.a((Activity) context);
                    } else if (context2 instanceof InputMethodService) {
                        Object systemService2 = context.getSystemService("window");
                        i.c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                        Display defaultDisplay = ((WindowManager) systemService2).getDefaultDisplay();
                        i.d(defaultDisplay, "wm.defaultDisplay");
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        Rect rect = new Rect(0, 0, point.x, point.y);
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 30) {
                            f3 = new I();
                        } else if (i5 >= 29) {
                            f3 = new H();
                        } else {
                            f3 = new F();
                        }
                        S b3 = f3.b();
                        i.d(b3, "Builder().build()");
                        kVar = new k(rect, b3);
                    } else {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                }
                throw new IllegalArgumentException("Context " + context + " is not a UiContext");
            }
            return c(kVar, windowLayoutInfo);
        } else if (i3 >= 29 && (context instanceof Activity)) {
            int i6 = n.f9033b;
            return c(n.a((Activity) context), windowLayoutInfo);
        } else {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
    }

    public static j c(k kVar, WindowLayoutInfo windowLayoutInfo) {
        C0761c c0761c;
        i.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                i.d(foldingFeature, "feature");
                c0761c = a(kVar, foldingFeature);
            } else {
                c0761c = null;
            }
            if (c0761c != null) {
                arrayList.add(c0761c);
            }
        }
        return new j(arrayList);
    }
}

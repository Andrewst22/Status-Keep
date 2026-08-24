package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f6285a;

    public b(k kVar) {
        this.f6285a = kVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z3) {
        k kVar = this.f6285a;
        if (kVar.f6392u) {
            return;
        }
        boolean z4 = false;
        B1.e eVar = kVar.f6373b;
        if (z3) {
            a aVar = kVar.f6393v;
            eVar.f58p = aVar;
            ((FlutterJNI) eVar.f57o).setAccessibilityDelegate(aVar);
            ((FlutterJNI) eVar.f57o).setSemanticsEnabled(true);
        } else {
            kVar.i(false);
            eVar.f58p = null;
            ((FlutterJNI) eVar.f57o).setAccessibilityDelegate(null);
            ((FlutterJNI) eVar.f57o).setSemanticsEnabled(false);
        }
        C1.j jVar = kVar.f6390s;
        if (jVar != null) {
            boolean isTouchExplorationEnabled = kVar.f6374c.isTouchExplorationEnabled();
            W1.o oVar = (W1.o) jVar.f168n;
            if (!oVar.f2894t.f2977b.f6109a.getIsSoftwareRenderingEnabled()) {
                if (!z3 && !isTouchExplorationEnabled) {
                    z4 = true;
                }
                oVar.setWillNotDraw(z4);
                return;
            }
            oVar.setWillNotDraw(false);
        }
    }
}

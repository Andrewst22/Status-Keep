package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
/* loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f6286a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f6287b;

    public c(k kVar, AccessibilityManager accessibilityManager) {
        this.f6287b = kVar;
        this.f6286a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        k kVar = this.f6287b;
        if (kVar.f6392u) {
            return;
        }
        boolean z4 = false;
        if (!z3) {
            kVar.i(false);
            g gVar = kVar.f6386o;
            if (gVar != null) {
                kVar.g(gVar.f6343b, 256);
                kVar.f6386o = null;
            }
        }
        C1.j jVar = kVar.f6390s;
        if (jVar != null) {
            boolean isEnabled = this.f6286a.isEnabled();
            W1.o oVar = (W1.o) jVar.f168n;
            if (!oVar.f2894t.f2977b.f6109a.getIsSoftwareRenderingEnabled()) {
                if (!isEnabled && !z3) {
                    z4 = true;
                }
                oVar.setWillNotDraw(z4);
                return;
            }
            oVar.setWillNotDraw(false);
        }
    }
}

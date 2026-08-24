package u1;

import C2.l;
import androidx.window.sidecar.SidecarDisplayFeature;
/* loaded from: classes.dex */
public final class d extends D2.j implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final d f9441n = new D2.j(1);

    @Override // C2.l
    /* renamed from: a */
    public final Boolean b(SidecarDisplayFeature sidecarDisplayFeature) {
        D2.i.e(sidecarDisplayFeature, "$this$require");
        boolean z3 = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}

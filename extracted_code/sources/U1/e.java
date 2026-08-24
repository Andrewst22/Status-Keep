package u1;

import C2.l;
import androidx.window.sidecar.SidecarDisplayFeature;
/* loaded from: classes.dex */
public final class e extends D2.j implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final e f9442n = new D2.j(1);

    @Override // C2.l
    /* renamed from: a */
    public final Boolean b(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z3;
        D2.i.e(sidecarDisplayFeature, "$this$require");
        if (sidecarDisplayFeature.getRect().left != 0 && sidecarDisplayFeature.getRect().top != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}

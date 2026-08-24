package u1;

import C2.l;
import androidx.window.sidecar.SidecarDisplayFeature;
/* renamed from: u1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862b extends D2.j implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final C0862b f9439n = new D2.j(1);

    @Override // C2.l
    /* renamed from: a */
    public final Boolean b(SidecarDisplayFeature sidecarDisplayFeature) {
        D2.i.e(sidecarDisplayFeature, "$this$require");
        boolean z3 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}

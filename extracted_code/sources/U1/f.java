package u1;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r1.C0761c;
import t2.C0835l;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f9443a;

    public f() {
        D2.h.r("verificationMode", 3);
        this.f9443a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (D2.i.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState != null && sidecarDeviceState2 != null && AbstractC0861a.b(sidecarDeviceState) == AbstractC0861a.b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (D2.i.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return D2.i.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!b((SidecarDisplayFeature) list.get(i3), (SidecarDisplayFeature) list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (D2.i.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(AbstractC0861a.c(sidecarWindowLayoutInfo), AbstractC0861a.c(sidecarWindowLayoutInfo2));
    }

    public final ArrayList e(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0761c g3 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g3 != null) {
                arrayList.add(g3);
            }
        }
        return arrayList;
    }

    public final r1.j f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        D2.i.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new r1.j(C0835l.f9264m);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        AbstractC0861a.d(sidecarDeviceState2, AbstractC0861a.b(sidecarDeviceState));
        return new r1.j(e(AbstractC0861a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r6 == 4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r1.C0761c g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            D2.i.e(r5, r0)
            int r0 = r4.f9443a
            o1.h r0 = o1.C0702a.a(r0, r5)
            u1.b r1 = u1.C0862b.f9439n
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            o1.g r0 = r0.d(r2, r1)
            u1.c r1 = u1.c.f9440n
            java.lang.String r2 = "Feature bounds must not be 0"
            o1.g r0 = r0.d(r2, r1)
            u1.d r1 = u1.d.f9441n
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            o1.g r0 = r0.d(r2, r1)
            u1.e r1 = u1.e.f9442n
            java.lang.String r2 = "Feature be pinned to either left or top"
            o1.g r0 = r0.d(r2, r1)
            java.lang.Object r0 = r0.a()
            androidx.window.sidecar.SidecarDisplayFeature r0 = (androidx.window.sidecar.SidecarDisplayFeature) r0
            r1 = 0
            if (r0 != 0) goto L35
            return r1
        L35:
            int r0 = r0.getType()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L43
            if (r0 == r2) goto L40
            return r1
        L40:
            r1.b r0 = r1.C0760b.f9008t
            goto L45
        L43:
            r1.b r0 = r1.C0760b.f9007s
        L45:
            int r6 = u1.AbstractC0861a.b(r6)
            if (r6 == 0) goto L6e
            if (r6 == r3) goto L6e
            if (r6 == r2) goto L58
            r1.b r2 = r1.C0760b.f9005q
            r3 = 3
            if (r6 == r3) goto L5a
            r3 = 4
            if (r6 == r3) goto L6e
            goto L5a
        L58:
            r1.b r2 = r1.C0760b.f9006r
        L5a:
            r1.c r6 = new r1.c
            o1.b r1 = new o1.b
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            D2.i.d(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.f.g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):r1.c");
    }
}

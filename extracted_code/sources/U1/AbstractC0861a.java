package u1;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import t2.C0835l;
/* renamed from: u1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0861a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        D2.i.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                D2.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        D2.i.e(sidecarDeviceState, "sidecarDeviceState");
        int a3 = a(sidecarDeviceState);
        if (a3 < 0 || a3 > 4) {
            return 0;
        }
        return a3;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C0835l c0835l = C0835l.f9264m;
        D2.i.e(sidecarWindowLayoutInfo, "info");
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                if (list != null) {
                    return list;
                }
                return c0835l;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                D2.i.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return c0835l;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i3) {
        try {
            try {
                sidecarDeviceState.posture = i3;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i3));
        }
    }
}

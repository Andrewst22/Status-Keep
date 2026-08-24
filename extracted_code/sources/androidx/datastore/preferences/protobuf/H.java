package androidx.datastore.preferences.protobuf;

import java.util.Map;
/* loaded from: classes.dex */
public final class H {
    public static int a(int i3, Object obj, Object obj2) {
        G g3 = (G) obj;
        F f3 = (F) obj2;
        int i4 = 0;
        if (!g3.isEmpty()) {
            for (Map.Entry entry : g3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                f3.getClass();
                int y02 = C0188k.y0(i3);
                int a3 = F.a(f3.f4172a, key, value);
                i4 += C0188k.A0(a3) + a3 + y02;
            }
        }
        return i4;
    }

    public static G b(Object obj, Object obj2) {
        G g3 = (G) obj;
        G g4 = (G) obj2;
        if (!g4.isEmpty()) {
            if (!g3.f4174m) {
                g3 = g3.b();
            }
            g3.a();
            if (!g4.isEmpty()) {
                g3.putAll(g4);
            }
        }
        return g3;
    }

    public static void c(Object obj) {
        ((G) obj).f4174m = false;
    }
}

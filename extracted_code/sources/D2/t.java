package D2;

import s2.InterfaceC0802a;
/* loaded from: classes.dex */
public abstract class t {
    public static void a(int i3, Object obj) {
        if (obj != null && !b(i3, obj)) {
            String k3 = h.k("kotlin.jvm.functions.Function", i3);
            String name = obj.getClass().getName();
            ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + k3);
            i.f(classCastException, t.class.getName());
            throw classCastException;
        }
    }

    public static boolean b(int i3, Object obj) {
        int i4;
        if (!(obj instanceof InterfaceC0802a)) {
            return false;
        }
        if (obj instanceof f) {
            i4 = ((f) obj).f();
        } else if (obj instanceof C2.a) {
            i4 = 0;
        } else if (obj instanceof C2.l) {
            i4 = 1;
        } else if (obj instanceof C2.p) {
            i4 = 2;
        } else if (obj instanceof C2.q) {
            i4 = 3;
        } else {
            i4 = -1;
        }
        if (i4 != i3) {
            return false;
        }
        return true;
    }
}

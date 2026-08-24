package r1;

import androidx.window.extensions.layout.WindowLayoutComponent;
import n1.C0657a;
import t1.C0820c;
import t1.C0821d;
/* renamed from: r1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764f extends D2.j implements C2.a {

    /* renamed from: n  reason: collision with root package name */
    public static final C0764f f9019n = new D2.j(0);

    @Override // C2.a
    public final Object c() {
        C0763e c0763e;
        WindowLayoutComponent a3;
        Object obj;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            if (classLoader != null) {
                c0763e = new C0763e(classLoader, new C0657a(classLoader));
            } else {
                c0763e = null;
            }
            if (c0763e == null || (a3 = c0763e.a()) == null) {
                return null;
            }
            D2.i.d(classLoader, "loader");
            C0657a c0657a = new C0657a(classLoader);
            int a4 = o1.e.a();
            if (a4 >= 2) {
                obj = new C0821d(a3);
            } else if (a4 == 1) {
                obj = new C0820c(a3, c0657a);
            } else {
                obj = new Object();
            }
            return obj;
        } catch (Throwable unused) {
            C0765g c0765g = C0765g.f9020a;
            return null;
        }
    }
}

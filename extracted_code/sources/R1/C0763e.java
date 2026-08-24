package r1;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import n1.C0657a;
import n2.AbstractC0664g;
/* renamed from: r1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763e {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f9016a;

    /* renamed from: b  reason: collision with root package name */
    public final C0657a f9017b;

    /* renamed from: c  reason: collision with root package name */
    public final C0657a f9018c;

    public C0763e(ClassLoader classLoader, C0657a c0657a) {
        this.f9016a = classLoader;
        this.f9017b = c0657a;
        this.f9018c = new C0657a(classLoader);
    }

    public final WindowLayoutComponent a() {
        C0657a c0657a = this.f9018c;
        c0657a.getClass();
        boolean z3 = false;
        try {
            D2.i.d(c0657a.f8398a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (AbstractC0664g.x("WindowExtensionsProvider#getWindowExtensions is not valid", new O.d(c0657a, 2)) && AbstractC0664g.x("WindowExtensions#getWindowLayoutComponent is not valid", new C0762d(this, 3)) && AbstractC0664g.x("FoldingFeature class is not valid", new C0762d(this, 0))) {
                int a3 = o1.e.a();
                if (a3 == 1) {
                    z3 = b();
                } else if (2 <= a3 && a3 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0664g.x("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0762d(this, 2))) {
                        z3 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z3) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return AbstractC0664g.x("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0762d(this, 1));
    }
}

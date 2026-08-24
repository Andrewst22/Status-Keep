package r1;

import D2.r;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import n2.AbstractC0664g;
/* renamed from: r1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762d extends D2.j implements C2.a {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f9014n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0763e f9015o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0762d(C0763e c0763e, int i3) {
        super(0);
        this.f9014n = i3;
        this.f9015o = c0763e;
    }

    @Override // C2.a
    public final Object c() {
        Class<?> cls = null;
        C0763e c0763e = this.f9015o;
        boolean z3 = false;
        switch (this.f9014n) {
            case 0:
                Class<?> loadClass = c0763e.f9016a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                D2.i.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                D2.i.d(method, "getBoundsMethod");
                if (AbstractC0664g.k(method, r.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    D2.i.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0664g.k(method2, r.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        D2.i.d(method3, "getStateMethod");
                        if (AbstractC0664g.k(method3, r.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z3 = true;
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 1:
                try {
                    cls = c0763e.f9017b.b();
                } catch (ClassNotFoundException unused) {
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = c0763e.f9016a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                D2.i.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                D2.i.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    D2.i.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                Class<?> loadClass3 = c0763e.f9016a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                D2.i.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                D2.i.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    D2.i.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            default:
                Class<?> loadClass4 = c0763e.f9018c.f8398a.loadClass("androidx.window.extensions.WindowExtensions");
                D2.i.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = c0763e.f9016a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                D2.i.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                D2.i.d(method8, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }
}

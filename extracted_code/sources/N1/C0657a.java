package n1;

import D2.e;
import D2.i;
import android.app.Activity;
import java.lang.reflect.Proxy;
import o1.c;
import o1.d;
import t1.C0819b;
/* renamed from: n1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657a {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f8398a;

    public /* synthetic */ C0657a(ClassLoader classLoader) {
        this.f8398a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, C0819b c0819b) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f8398a, new Class[]{b()}, new c(eVar, c0819b));
        i.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f8398a.loadClass("java.util.function.Consumer");
        i.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}

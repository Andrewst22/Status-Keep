package L2;

import D2.i;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import n2.AbstractC0664g;
import s2.C0804c;
/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object f3;
        try {
            f3 = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            f3 = AbstractC0664g.f(th);
        }
        if (f3 instanceof C0804c) {
            f3 = null;
        }
        c cVar = (c) f3;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            i.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}

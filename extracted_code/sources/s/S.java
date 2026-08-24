package s;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: d  reason: collision with root package name */
    public static String f9065d;

    /* renamed from: g  reason: collision with root package name */
    public static Q f9068g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9069a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f9070b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9064c = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static HashSet f9066e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f9067f = new Object();

    public S(Context context) {
        this.f9069a = context;
        this.f9070b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return L.a(this.f9070b);
        }
        Context context = this.f9069a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i3), packageName)).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public final void b(String str, int i3) {
        this.f9070b.cancel(str, i3);
    }

    public final void c(String str, int i3, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f9070b;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            N n3 = new N(this.f9069a.getPackageName(), i3, str, notification);
            synchronized (f9067f) {
                try {
                    if (f9068g == null) {
                        f9068g = new Q(this.f9069a.getApplicationContext());
                    }
                    f9068g.f9061n.obtainMessage(0, n3).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            notificationManager.cancel(str, i3);
            return;
        }
        notificationManager.notify(str, i3, notification);
    }
}

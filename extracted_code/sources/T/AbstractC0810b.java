package t;

import android.content.Context;
/* renamed from: t.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0810b {
    public static int a(Context context, int i3) {
        return context.getColor(i3);
    }

    public static <T> T b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}

package w;

import android.graphics.drawable.Icon;
import android.net.Uri;
/* renamed from: w.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0884e {
    public static int a(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String b(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri d(Object obj) {
        return ((Icon) obj).getUri();
    }
}

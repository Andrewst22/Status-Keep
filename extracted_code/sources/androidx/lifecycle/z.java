package androidx.lifecycle;

import android.app.Activity;
/* loaded from: classes.dex */
public abstract class z {
    public static void a(Activity activity, k kVar) {
        D2.i.e(activity, "activity");
        D2.i.e(kVar, "event");
        if (activity instanceof r) {
            t a3 = ((r) activity).a();
            if (a3 instanceof t) {
                a3.d(kVar);
            }
        }
    }
}

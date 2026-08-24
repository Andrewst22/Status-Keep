package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
/* loaded from: classes.dex */
public abstract class w {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        D2.i.e(activity, "activity");
        D2.i.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}

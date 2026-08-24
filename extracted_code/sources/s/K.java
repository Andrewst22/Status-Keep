package s;

import android.app.Notification;
/* loaded from: classes.dex */
public abstract class K {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
        return builder.setAuthenticationRequired(z3);
    }

    public static Notification.Builder b(Notification.Builder builder, int i3) {
        return builder.setForegroundServiceBehavior(i3);
    }
}

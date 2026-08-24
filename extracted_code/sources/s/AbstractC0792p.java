package s;

import android.app.Notification;
/* renamed from: s.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0792p {
    public static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }
}

package s;

import android.app.Notification;
import android.app.Person;
/* renamed from: s.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0799x {
    public static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z3) {
        return messagingStyle.setGroupConversation(z3);
    }
}

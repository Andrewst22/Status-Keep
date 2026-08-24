package s;

import android.app.Notification;
import android.net.Uri;
/* renamed from: s.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0800y {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j3, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j3, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}

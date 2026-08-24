package s;

import android.app.Notification;
import android.app.Person;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class z {
    public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j3, Person person) {
        return new Notification.MessagingStyle.Message(charSequence, j3, person);
    }

    public static Parcelable a(Person person) {
        return person;
    }
}

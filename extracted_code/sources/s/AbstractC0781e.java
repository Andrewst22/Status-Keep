package s;

import android.app.AlarmManager;
import android.app.PendingIntent;
/* renamed from: s.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0781e {
    public static void a(AlarmManager alarmManager, int i3, long j3, PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i3, j3, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, int i3, long j3, PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i3, j3, pendingIntent);
    }
}

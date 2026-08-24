package s;

import android.app.AlarmManager;
import android.app.PendingIntent;
/* renamed from: s.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0780d {
    public static AlarmManager.AlarmClockInfo a(long j3, PendingIntent pendingIntent) {
        return new AlarmManager.AlarmClockInfo(j3, pendingIntent);
    }

    public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
        alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
    }
}

package h0;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public abstract class r {
    public static void a(j jVar, Z.m mVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        Z.l lVar = mVar.f3530b;
        lVar.getClass();
        LogSessionId logSessionId2 = lVar.f3528a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = jVar.f5848b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}

package a0;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public abstract class B {
    public static void a(AudioTrack audioTrack, Z.m mVar) {
        LogSessionId logSessionId;
        boolean equals;
        Z.l lVar = mVar.f3530b;
        lVar.getClass();
        LogSessionId logSessionId2 = lVar.f3528a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}

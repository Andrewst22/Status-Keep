package Y;

import U.AbstractC0123a;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
/* loaded from: classes.dex */
public abstract class A {
    public static Z.m a(Context context, G g3, boolean z3, String str) {
        PlaybackSession createPlaybackSession;
        Z.k kVar;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager b3 = Z.i.b(context.getSystemService("media_metrics"));
        if (b3 != null) {
            createPlaybackSession = b3.createPlaybackSession();
            kVar = new Z.k(context, createPlaybackSession);
        } else {
            kVar = null;
        }
        if (kVar == null) {
            AbstractC0123a.A("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new Z.m(logSessionId, str);
        }
        if (z3) {
            g3.getClass();
            Z.f fVar = g3.f3073r;
            fVar.getClass();
            fVar.f3481r.a(kVar);
        }
        sessionId = kVar.f3504c.getSessionId();
        return new Z.m(sessionId, str);
    }
}

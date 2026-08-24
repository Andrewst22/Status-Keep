package a0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
/* loaded from: classes.dex */
public abstract class x {
    /* JADX WARN: Type inference failed for: r0v2, types: [a0.k, java.lang.Object] */
    public static C0168l a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z3) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return C0168l.f3765d;
        }
        ?? obj = new Object();
        obj.f3762a = true;
        obj.f3764c = z3;
        return obj.a();
    }
}

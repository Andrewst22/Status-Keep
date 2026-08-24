package a0;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
/* loaded from: classes.dex */
public abstract class y {
    /* JADX WARN: Type inference failed for: r4v1, types: [a0.k, java.lang.Object] */
    public static C0168l a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z3) {
        int playbackOffloadSupport;
        boolean z4;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C0168l.f3765d;
        }
        ?? obj = new Object();
        if (U.A.f2405a > 32 && playbackOffloadSupport == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        obj.f3762a = true;
        obj.f3763b = z4;
        obj.f3764c = z3;
        return obj.a();
    }
}

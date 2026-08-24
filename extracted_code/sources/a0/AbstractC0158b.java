package a0;

import D1.q0;
import R.C0102e;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* renamed from: a0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0158b {
    public static D1.I a(C0102e c0102e) {
        boolean isDirectPlaybackSupported;
        D1.F i3 = D1.I.i();
        q0 it = C0161e.f3744e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (U.A.f2405a >= U.A.q(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) c0102e.a().f168n);
                if (isDirectPlaybackSupported) {
                    i3.a(num);
                }
            }
        }
        i3.a(2);
        return i3.g();
    }

    public static int b(int i3, int i4, C0102e c0102e) {
        boolean isDirectPlaybackSupported;
        for (int i5 = 10; i5 > 0; i5--) {
            int s3 = U.A.s(i5);
            if (s3 != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i4).setChannelMask(s3).build(), (AudioAttributes) c0102e.a().f168n);
                if (isDirectPlaybackSupported) {
                    return i5;
                }
            }
        }
        return 0;
    }
}

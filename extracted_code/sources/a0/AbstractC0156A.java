package a0;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
/* renamed from: a0.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0156A {
    public static void a(AudioTrack audioTrack, C0166j c0166j) {
        AudioDeviceInfo audioDeviceInfo;
        if (c0166j == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = c0166j.f3761a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}

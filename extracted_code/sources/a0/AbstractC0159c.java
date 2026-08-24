package a0;

import R.C0102e;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: a0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0159c {
    public static C0161e a(AudioManager audioManager, C0102e c0102e) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c0102e.a().f168n);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(android.support.v4.media.session.a.c(12)));
        for (int i3 = 0; i3 < directProfilesForAttributes.size(); i3++) {
            AudioProfile d3 = Z.j.d(directProfilesForAttributes.get(i3));
            encapsulationType = d3.getEncapsulationType();
            if (encapsulationType != 1) {
                format = d3.getFormat();
                if (U.A.I(format) || C0161e.f3744e.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        channelMasks2 = d3.getChannelMasks();
                        set.addAll(android.support.v4.media.session.a.c(channelMasks2));
                    } else {
                        Integer valueOf = Integer.valueOf(format);
                        channelMasks = d3.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(android.support.v4.media.session.a.c(channelMasks)));
                    }
                }
            }
        }
        D1.F i4 = D1.I.i();
        for (Map.Entry entry : hashMap.entrySet()) {
            i4.a(new C0160d(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C0161e(i4.g());
    }

    public static C0166j b(AudioManager audioManager, C0102e c0102e) {
        List audioDevicesForAttributes;
        try {
            audioManager.getClass();
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c0102e.a().f168n);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C0166j(D.b.f(audioDevicesForAttributes.get(0)));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}

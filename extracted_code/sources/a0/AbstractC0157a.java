package a0;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
/* renamed from: a0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0157a {
    /* JADX WARN: Type inference failed for: r3v0, types: [D1.L, D1.C] */
    private static D1.M a() {
        ?? c3 = new D1.C(4);
        Integer[] numArr = {8, 7};
        D1.r.c(2, numArr);
        c3.f(c3.f186b + 2);
        System.arraycopy(numArr, 0, c3.f185a, c3.f186b, 2);
        c3.f186b += 2;
        int i3 = U.A.f2405a;
        if (i3 >= 31) {
            Integer[] numArr2 = {26, 27};
            D1.r.c(2, numArr2);
            c3.f(c3.f186b + 2);
            System.arraycopy(numArr2, 0, c3.f185a, c3.f186b, 2);
            c3.f186b += 2;
        }
        if (i3 >= 33) {
            c3.a(30);
        }
        return c3.g();
    }

    public static boolean b(AudioManager audioManager, C0166j c0166j) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        int type;
        if (c0166j == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{c0166j.f3761a};
        }
        D1.M a3 = a();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            type = audioDeviceInfo.getType();
            if (a3.contains(Integer.valueOf(type))) {
                return true;
            }
        }
        return false;
    }
}

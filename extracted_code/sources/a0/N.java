package a0;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public abstract class N {
    public static void a(InterfaceC0174s interfaceC0174s, Object obj) {
        C0166j c0166j;
        AudioDeviceInfo f3 = D.b.f(obj);
        L l3 = (L) interfaceC0174s;
        if (f3 == null) {
            c0166j = null;
        } else {
            l3.getClass();
            c0166j = new C0166j(f3);
        }
        l3.f3666c0 = c0166j;
        C0165i c0165i = l3.f3696y;
        if (c0165i != null) {
            c0165i.b(f3);
        }
        AudioTrack audioTrack = l3.f3695w;
        if (audioTrack != null) {
            AbstractC0156A.a(audioTrack, l3.f3666c0);
        }
    }
}

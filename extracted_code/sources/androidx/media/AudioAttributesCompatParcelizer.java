package androidx.media;

import m1.AbstractC0617a;
import m1.c;
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0617a abstractC0617a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f4372a;
        if (abstractC0617a.e(1)) {
            cVar = abstractC0617a.h();
        }
        audioAttributesCompat.f4372a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0617a abstractC0617a) {
        abstractC0617a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4372a;
        abstractC0617a.i(1);
        abstractC0617a.l(audioAttributesImpl);
    }
}

package androidx.media;

import android.media.AudioAttributes;
import m1.AbstractC0617a;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC0617a abstractC0617a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4373a = (AudioAttributes) abstractC0617a.g(audioAttributesImplApi21.f4373a, 1);
        audioAttributesImplApi21.f4374b = abstractC0617a.f(audioAttributesImplApi21.f4374b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC0617a abstractC0617a) {
        abstractC0617a.getClass();
        abstractC0617a.k(audioAttributesImplApi21.f4373a, 1);
        abstractC0617a.j(audioAttributesImplApi21.f4374b, 2);
    }
}

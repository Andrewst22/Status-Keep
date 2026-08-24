package androidx.media;

import android.media.AudioAttributes;
import m1.AbstractC0617a;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC0617a abstractC0617a) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4373a = (AudioAttributes) abstractC0617a.g(audioAttributesImplApi26.f4373a, 1);
        audioAttributesImplApi26.f4374b = abstractC0617a.f(audioAttributesImplApi26.f4374b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC0617a abstractC0617a) {
        abstractC0617a.getClass();
        abstractC0617a.k(audioAttributesImplApi26.f4373a, 1);
        abstractC0617a.j(audioAttributesImplApi26.f4374b, 2);
    }
}

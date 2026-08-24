package androidx.media;

import m1.AbstractC0617a;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0617a abstractC0617a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4375a = abstractC0617a.f(audioAttributesImplBase.f4375a, 1);
        audioAttributesImplBase.f4376b = abstractC0617a.f(audioAttributesImplBase.f4376b, 2);
        audioAttributesImplBase.f4377c = abstractC0617a.f(audioAttributesImplBase.f4377c, 3);
        audioAttributesImplBase.f4378d = abstractC0617a.f(audioAttributesImplBase.f4378d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0617a abstractC0617a) {
        abstractC0617a.getClass();
        abstractC0617a.j(audioAttributesImplBase.f4375a, 1);
        abstractC0617a.j(audioAttributesImplBase.f4376b, 2);
        abstractC0617a.j(audioAttributesImplBase.f4377c, 3);
        abstractC0617a.j(audioAttributesImplBase.f4378d, 4);
    }
}

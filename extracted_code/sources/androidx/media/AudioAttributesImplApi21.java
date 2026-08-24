package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f4373a;

    /* renamed from: b  reason: collision with root package name */
    public int f4374b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f4373a.equals(((AudioAttributesImplApi21) obj).f4373a);
    }

    public final int hashCode() {
        return this.f4373a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4373a;
    }
}

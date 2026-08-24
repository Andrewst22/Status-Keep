package androidx.media;

import android.util.SparseIntArray;
import m1.c;
/* loaded from: classes.dex */
public class AudioAttributesCompat implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4371b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f4372a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f4372a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.f4372a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f4372a);
    }

    public final int hashCode() {
        return this.f4372a.hashCode();
    }

    public final String toString() {
        return this.f4372a.toString();
    }
}

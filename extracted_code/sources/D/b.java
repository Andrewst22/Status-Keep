package D;

import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import android.media.PlaybackParams;
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ AudioDeviceInfo f(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* synthetic */ PlaybackParams g() {
        return new PlaybackParams();
    }

    public static /* bridge */ /* synthetic */ boolean s(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}

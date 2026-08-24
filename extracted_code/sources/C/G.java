package C;

import android.media.MediaCodecInfo;
import android.view.WindowInsets;
/* loaded from: classes.dex */
public abstract /* synthetic */ class G {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f(int i3, int i4, int i5) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i3, i4, i5);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder h() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ void l() {
    }
}

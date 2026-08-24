package a0;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.os.Handler;
import android.view.Surface;
import h0.C0281a;
/* loaded from: classes.dex */
public abstract /* synthetic */ class D {
    public static /* bridge */ /* synthetic */ void D(MediaCodec mediaCodec, C0281a c0281a, Handler handler) {
        mediaCodec.setOnFrameRenderedListener(c0281a, handler);
    }

    public static /* synthetic */ AudioTrack.Builder e() {
        return new AudioTrack.Builder();
    }

    public static /* bridge */ /* synthetic */ void t(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }
}

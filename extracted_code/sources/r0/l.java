package r0;

import R.C0102e;
import R.C0113p;
import U.A;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Handler;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Spatializer f8955a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8956b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f8957c;

    /* renamed from: d  reason: collision with root package name */
    public C0758k f8958d;

    public l(Spatializer spatializer) {
        int immersiveAudioLevel;
        boolean z3;
        this.f8955a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        if (immersiveAudioLevel != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f8956b = z3;
    }

    public final boolean a(C0102e c0102e, C0113p c0113p) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(c0113p.f1974m);
        int i3 = c0113p.f1951A;
        if (equals && i3 == 16) {
            i3 = 12;
        }
        int s3 = A.s(i3);
        if (s3 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s3);
        int i4 = c0113p.f1952B;
        if (i4 != -1) {
            channelMask.setSampleRate(i4);
        }
        canBeSpatialized = this.f8955a.canBeSpatialized((AudioAttributes) c0102e.a().f168n, channelMask.build());
        return canBeSpatialized;
    }
}

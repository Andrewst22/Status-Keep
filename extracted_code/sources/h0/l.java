package h0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface l {
    int B();

    void C(int i3);

    void H(u0.k kVar, Handler handler);

    MediaFormat L();

    void a(Bundle bundle);

    void b(int i3, X.b bVar, long j3, int i4);

    void e(int i3, int i4, long j3, int i5);

    int f(MediaCodec.BufferInfo bufferInfo);

    void flush();

    void j(long j3, int i3);

    ByteBuffer l(int i3);

    void m(Surface surface);

    void r(int i3, boolean z3);

    void release();

    ByteBuffer v(int i3);

    boolean z(t tVar);
}

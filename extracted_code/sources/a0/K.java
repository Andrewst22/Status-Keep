package a0;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3630a = new Handler(Looper.myLooper());

    /* renamed from: b  reason: collision with root package name */
    public final J f3631b = new J(this);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ L f3632c;

    public K(L l3) {
        this.f3632c = l3;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.f3630a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new I(handler), this.f3631b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f3631b);
        this.f3630a.removeCallbacksAndMessages(null);
    }
}

package Y;

import android.media.AudioManager;
import android.os.Handler;
/* renamed from: Y.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133d implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0134e f3231b;

    public C0133d(C0134e c0134e, Handler handler) {
        this.f3231b = c0134e;
        this.f3230a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i3) {
        this.f3230a.post(new RunnableC0132c(i3, 0, this));
    }
}

package a0;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
/* renamed from: a0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163g extends AudioDeviceCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0165i f3747a;

    public C0163g(C0165i c0165i) {
        this.f3747a = c0165i;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0165i c0165i = this.f3747a;
        c0165i.a(C0161e.b(c0165i.f3751a, c0165i.f3759i, c0165i.f3758h));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (U.A.l(audioDeviceInfoArr, this.f3747a.f3758h)) {
            this.f3747a.f3758h = null;
        }
        C0165i c0165i = this.f3747a;
        c0165i.a(C0161e.b(c0165i.f3751a, c0165i.f3759i, c0165i.f3758h));
    }
}

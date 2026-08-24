package a0;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final AudioTrack f3625a;

    /* renamed from: b  reason: collision with root package name */
    public final C0165i f3626b;

    /* renamed from: c  reason: collision with root package name */
    public G f3627c = new AudioRouting.OnRoutingChangedListener() { // from class: a0.G
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            H.this.b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [a0.G] */
    public H(AudioTrack audioTrack, C0165i c0165i) {
        this.f3625a = audioTrack;
        this.f3626b = c0165i;
        audioTrack.addOnRoutingChangedListener(this.f3627c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        AudioDeviceInfo routedDevice2;
        if (this.f3627c != null) {
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                C0165i c0165i = this.f3626b;
                routedDevice2 = audioRouting.getRoutedDevice();
                c0165i.b(routedDevice2);
            }
        }
    }

    public void c() {
        G g3 = this.f3627c;
        g3.getClass();
        this.f3625a.removeOnRoutingChangedListener(g3);
        this.f3627c = null;
    }
}

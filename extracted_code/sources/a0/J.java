package a0;

import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class J extends AudioTrack.StreamEventCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f3629a;

    public J(K k3) {
        this.f3629a = k3;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i3) {
        L l3;
        C1.j jVar;
        Y.H h3;
        if (audioTrack.equals(this.f3629a.f3632c.f3695w) && (jVar = (l3 = this.f3629a.f3632c).f3691s) != null && l3.f3659Y && (h3 = ((O) jVar.f168n).f5900R) != null) {
            h3.a();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f3629a.f3632c.f3695w)) {
            return;
        }
        this.f3629a.f3632c.f3658X = true;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        L l3;
        C1.j jVar;
        Y.H h3;
        if (audioTrack.equals(this.f3629a.f3632c.f3695w) && (jVar = (l3 = this.f3629a.f3632c).f3691s) != null && l3.f3659Y && (h3 = ((O) jVar.f168n).f5900R) != null) {
            h3.a();
        }
    }
}

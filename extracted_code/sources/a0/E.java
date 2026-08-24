package a0;

import R.C0102e;
import R.C0113p;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public final C0113p f3609a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3610b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3611c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3612d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3613e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3614f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3615g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3616h;

    /* renamed from: i  reason: collision with root package name */
    public final S.a f3617i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3618j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f3619k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3620l;

    public E(C0113p c0113p, int i3, int i4, int i5, int i6, int i7, int i8, int i9, S.a aVar, boolean z3, boolean z4, boolean z5) {
        this.f3609a = c0113p;
        this.f3610b = i3;
        this.f3611c = i4;
        this.f3612d = i5;
        this.f3613e = i6;
        this.f3614f = i7;
        this.f3615g = i8;
        this.f3616h = i9;
        this.f3617i = aVar;
        this.f3618j = z3;
        this.f3619k = z4;
        this.f3620l = z5;
    }

    public static AudioAttributes c(C0102e c0102e, boolean z3) {
        if (z3) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) c0102e.a().f168n;
    }

    public final AudioTrack a(C0102e c0102e, int i3) {
        boolean z3;
        boolean z4;
        int i4 = this.f3611c;
        try {
            AudioTrack b3 = b(c0102e, i3);
            int state = b3.getState();
            if (state == 1) {
                return b3;
            }
            try {
                b3.release();
            } catch (Exception unused) {
            }
            if (i4 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            throw new C0173q(state, this.f3613e, this.f3614f, this.f3616h, this.f3609a, z4, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            if (i4 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            throw new C0173q(0, this.f3613e, this.f3614f, this.f3616h, this.f3609a, z3, e2);
        }
    }

    public final AudioTrack b(C0102e c0102e, int i3) {
        AudioTrack.Builder audioAttributes;
        AudioTrack.Builder audioFormat;
        AudioTrack.Builder transferMode;
        AudioTrack.Builder bufferSizeInBytes;
        AudioTrack.Builder sessionId;
        AudioTrack.Builder offloadedPlayback;
        AudioTrack build;
        int i4 = U.A.f2405a;
        boolean z3 = this.f3620l;
        int i5 = this.f3613e;
        int i6 = this.f3615g;
        int i7 = this.f3614f;
        if (i4 >= 29) {
            AudioFormat r3 = U.A.r(i5, i7, i6);
            audioAttributes = D.e().setAudioAttributes(c(c0102e, z3));
            audioFormat = audioAttributes.setAudioFormat(r3);
            transferMode = audioFormat.setTransferMode(1);
            bufferSizeInBytes = transferMode.setBufferSizeInBytes(this.f3616h);
            sessionId = bufferSizeInBytes.setSessionId(i3);
            boolean z4 = true;
            if (this.f3611c != 1) {
                z4 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z4);
            build = offloadedPlayback.build();
            return build;
        } else if (i4 >= 21) {
            return new AudioTrack(c(c0102e, z3), U.A.r(i5, i7, i6), this.f3616h, 1, i3);
        } else {
            c0102e.getClass();
            if (i3 == 0) {
                return new AudioTrack(3, this.f3613e, this.f3614f, this.f3615g, this.f3616h, 1);
            }
            return new AudioTrack(3, this.f3613e, this.f3614f, this.f3615g, this.f3616h, 1, i3);
        }
    }
}

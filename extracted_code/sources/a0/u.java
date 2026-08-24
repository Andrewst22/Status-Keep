package a0;

import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final C0175t f3789a;

    /* renamed from: b  reason: collision with root package name */
    public int f3790b;

    /* renamed from: c  reason: collision with root package name */
    public long f3791c;

    /* renamed from: d  reason: collision with root package name */
    public long f3792d;

    /* renamed from: e  reason: collision with root package name */
    public long f3793e;

    /* renamed from: f  reason: collision with root package name */
    public long f3794f;

    public u(AudioTrack audioTrack) {
        this.f3789a = new C0175t(audioTrack);
        a();
    }

    public final void a() {
        if (this.f3789a != null) {
            b(0);
        }
    }

    public final void b(int i3) {
        this.f3790b = i3;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 == 4) {
                        this.f3792d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f3792d = 10000000L;
                return;
            }
            this.f3792d = 10000L;
            return;
        }
        this.f3793e = 0L;
        this.f3794f = -1L;
        this.f3791c = System.nanoTime() / 1000;
        this.f3792d = 10000L;
    }
}

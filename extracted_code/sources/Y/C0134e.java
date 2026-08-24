package Y;

import R.C0102e;
import U.AbstractC0123a;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
/* renamed from: Y.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134e {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f3244a;

    /* renamed from: b  reason: collision with root package name */
    public final C0133d f3245b;

    /* renamed from: c  reason: collision with root package name */
    public D f3246c;

    /* renamed from: d  reason: collision with root package name */
    public C0102e f3247d;

    /* renamed from: e  reason: collision with root package name */
    public int f3248e;

    /* renamed from: f  reason: collision with root package name */
    public int f3249f;

    /* renamed from: g  reason: collision with root package name */
    public float f3250g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f3251h;

    public C0134e(Context context, Handler handler, D d3) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f3244a = audioManager;
        this.f3246c = d3;
        this.f3245b = new C0133d(this, handler);
        this.f3248e = 0;
    }

    public final void a() {
        int i3 = this.f3248e;
        if (i3 != 1 && i3 != 0) {
            int i4 = U.A.f2405a;
            AudioManager audioManager = this.f3244a;
            if (i4 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f3251h;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(this.f3245b);
        }
    }

    public final void b(C0102e c0102e) {
        int i3;
        if (!U.A.a(this.f3247d, c0102e)) {
            this.f3247d = c0102e;
            boolean z3 = false;
            if (c0102e == null) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            this.f3249f = i3;
            AbstractC0123a.d("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", (i3 == 1 || i3 == 0) ? true : true);
        }
    }

    public final void c(int i3) {
        float f3;
        if (this.f3248e == i3) {
            return;
        }
        this.f3248e = i3;
        if (i3 == 4) {
            f3 = 0.2f;
        } else {
            f3 = 1.0f;
        }
        if (this.f3250g == f3) {
            return;
        }
        this.f3250g = f3;
        D d3 = this.f3246c;
        if (d3 != null) {
            G g3 = d3.f3021a;
            g3.C(1, 2, Float.valueOf(g3.f3046V * g3.f3079y.f3250g));
        }
    }

    public final int d(int i3, boolean z3) {
        int requestAudioFocus;
        AudioFocusRequest.Builder k3;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        boolean z4 = false;
        if (i3 != 1 && this.f3249f == 1) {
            if (z3) {
                if (this.f3248e == 2) {
                    return 1;
                }
                int i4 = U.A.f2405a;
                AudioManager audioManager = this.f3244a;
                C0133d c0133d = this.f3245b;
                if (i4 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f3251h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            A.e.r();
                            k3 = A.e.g(this.f3249f);
                        } else {
                            A.e.r();
                            k3 = A.e.k(this.f3251h);
                        }
                        C0102e c0102e = this.f3247d;
                        if (c0102e != null && c0102e.f1885a == 1) {
                            z4 = true;
                        }
                        c0102e.getClass();
                        audioAttributes = k3.setAudioAttributes((AudioAttributes) c0102e.a().f168n);
                        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z4);
                        onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(c0133d);
                        build = onAudioFocusChangeListener.build();
                        this.f3251h = build;
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.f3251h);
                } else {
                    this.f3247d.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(c0133d, 3, this.f3249f);
                }
                if (requestAudioFocus == 1) {
                    c(2);
                    return 1;
                }
                c(1);
                return -1;
            }
            int i5 = this.f3248e;
            if (i5 == 1) {
                return -1;
            }
            if (i5 != 3) {
                return 1;
            }
            return 0;
        }
        a();
        c(0);
        return 1;
    }
}

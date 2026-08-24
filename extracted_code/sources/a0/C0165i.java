package a0;

import R.C0102e;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
/* renamed from: a0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3751a;

    /* renamed from: b  reason: collision with root package name */
    public final B0.a f3752b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f3753c;

    /* renamed from: d  reason: collision with root package name */
    public final C0163g f3754d;

    /* renamed from: e  reason: collision with root package name */
    public final U.q f3755e;

    /* renamed from: f  reason: collision with root package name */
    public final C0164h f3756f;

    /* renamed from: g  reason: collision with root package name */
    public C0161e f3757g;

    /* renamed from: h  reason: collision with root package name */
    public C0166j f3758h;

    /* renamed from: i  reason: collision with root package name */
    public C0102e f3759i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3760j;

    public C0165i(Context context, B0.a aVar, C0102e c0102e, C0166j c0166j) {
        C0163g c0163g;
        U.q qVar;
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f3751a = applicationContext;
        this.f3752b = aVar;
        this.f3759i = c0102e;
        this.f3758h = c0166j;
        int i3 = U.A.f2405a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f3753c = handler;
        int i4 = U.A.f2405a;
        if (i4 >= 23) {
            c0163g = new C0163g(this);
        } else {
            c0163g = null;
        }
        this.f3754d = c0163g;
        if (i4 >= 21) {
            qVar = new U.q(this, 1);
        } else {
            qVar = null;
        }
        this.f3755e = qVar;
        C0161e c0161e = C0161e.f3742c;
        String str = U.A.f2407c;
        if (!"Amazon".equals(str) && !"Xiaomi".equals(str)) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f3756f = uriFor != null ? new C0164h(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(C0161e c0161e) {
        r0.q qVar;
        String name;
        String name2;
        if (this.f3760j && !c0161e.equals(this.f3757g)) {
            this.f3757g = c0161e;
            L l3 = (L) this.f3752b.f25n;
            l3.getClass();
            Looper myLooper = Looper.myLooper();
            Looper looper = l3.f3678i0;
            if (looper != myLooper) {
                if (looper == null) {
                    name = "null";
                } else {
                    name = looper.getThread().getName();
                }
                if (myLooper == null) {
                    name2 = "null";
                } else {
                    name2 = myLooper.getThread().getName();
                }
                throw new IllegalStateException("Current looper (" + name2 + ") is not the playback looper (" + name + ")");
            } else if (!c0161e.equals(l3.x)) {
                l3.x = c0161e;
                C1.j jVar = l3.f3691s;
                if (jVar != null) {
                    O o3 = (O) jVar.f168n;
                    synchronized (o3.f3276m) {
                        qVar = o3.f3275C;
                    }
                    if (qVar != null) {
                        qVar.g();
                    }
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        C0166j c0166j = this.f3758h;
        C0166j c0166j2 = null;
        if (c0166j == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = c0166j.f3761a;
        }
        if (U.A.a(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            c0166j2 = new C0166j(audioDeviceInfo);
        }
        this.f3758h = c0166j2;
        a(C0161e.b(this.f3751a, this.f3759i, c0166j2));
    }
}

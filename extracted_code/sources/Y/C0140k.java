package Y;

import U.AbstractC0123a;
import java.util.HashMap;
/* renamed from: Y.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140k {

    /* renamed from: a  reason: collision with root package name */
    public final s0.e f3343a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3344b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3345c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3346d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3347e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3348f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3349g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f3350h;

    /* renamed from: i  reason: collision with root package name */
    public long f3351i;

    public C0140k() {
        s0.e eVar = new s0.e();
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f3343a = eVar;
        long j3 = 50000;
        this.f3344b = U.A.M(j3);
        this.f3345c = U.A.M(j3);
        this.f3346d = U.A.M(2500);
        this.f3347e = U.A.M(5000);
        this.f3348f = -1;
        this.f3349g = U.A.M(0);
        this.f3350h = new HashMap();
        this.f3351i = -1L;
    }

    public static void a(int i3, int i4, String str, String str2) {
        boolean z3;
        if (i3 >= i4) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.d(str + " cannot be less than " + str2, z3);
    }

    public final int b() {
        int i3 = 0;
        for (C0139j c0139j : this.f3350h.values()) {
            i3 += c0139j.f3332b;
        }
        return i3;
    }

    public final boolean c(N n3) {
        int i3;
        boolean z3;
        C0139j c0139j = (C0139j) this.f3350h.get(n3.f3144a);
        c0139j.getClass();
        s0.e eVar = this.f3343a;
        synchronized (eVar) {
            i3 = eVar.f9160d * eVar.f9158b;
        }
        if (i3 >= b()) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j3 = this.f3345c;
        long j4 = this.f3344b;
        float f3 = n3.f3146c;
        if (f3 > 1.0f) {
            j4 = Math.min(U.A.y(j4, f3), j3);
        }
        long max = Math.max(j4, 500000L);
        long j5 = n3.f3145b;
        if (j5 < max) {
            c0139j.f3331a = !z3;
            if (z3 && j5 < 500000) {
                AbstractC0123a.A("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j5 >= j3 || z3) {
            c0139j.f3331a = false;
        }
        return c0139j.f3331a;
    }

    public final void d() {
        if (this.f3350h.isEmpty()) {
            s0.e eVar = this.f3343a;
            synchronized (eVar) {
                if (eVar.f9157a) {
                    eVar.a(0);
                }
            }
            return;
        }
        this.f3343a.a(b());
    }
}

package u0;

import U.A;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final l f9389a;

    /* renamed from: b  reason: collision with root package name */
    public final r f9390b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9391c;

    /* renamed from: f  reason: collision with root package name */
    public long f9394f;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9397i;

    /* renamed from: d  reason: collision with root package name */
    public int f9392d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f9393e = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f9395g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f9396h = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    public float f9398j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public U.v f9399k = U.v.f2483a;

    public o(Context context, l lVar) {
        this.f9389a = lVar;
        this.f9390b = new r(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r10 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r6 > 100000) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011a, code lost:
        if (r27 >= r31) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0245 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r25, long r27, long r29, long r31, boolean r33, U2.c r34) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.o.a(long, long, long, long, boolean, U2.c):int");
    }

    public final void b(boolean z3) {
        this.f9397i = z3;
        this.f9399k.getClass();
        this.f9396h = SystemClock.elapsedRealtime() + 5000;
    }

    public final void c(int i3) {
        this.f9392d = Math.min(this.f9392d, i3);
    }

    public final void d() {
        this.f9391c = true;
        this.f9399k.getClass();
        this.f9394f = A.M(SystemClock.elapsedRealtime());
        r rVar = this.f9390b;
        rVar.f9408d = true;
        rVar.f9417m = 0L;
        rVar.f9420p = -1L;
        rVar.f9418n = -1L;
        io.flutter.view.r rVar2 = rVar.f9406b;
        if (rVar2 != null) {
            q qVar = rVar.f9407c;
            qVar.getClass();
            qVar.f9402n.sendEmptyMessage(2);
            Handler n3 = A.n(null);
            DisplayManager displayManager = rVar2.f6405b;
            displayManager.registerDisplayListener(rVar2, n3);
            r.a((r) rVar2.f6406c, displayManager.getDisplay(0));
        }
        rVar.d(false);
    }

    public final void e() {
        this.f9391c = false;
        this.f9396h = -9223372036854775807L;
        r rVar = this.f9390b;
        rVar.f9408d = false;
        io.flutter.view.r rVar2 = rVar.f9406b;
        if (rVar2 != null) {
            rVar2.f6405b.unregisterDisplayListener(rVar2);
            q qVar = rVar.f9407c;
            qVar.getClass();
            qVar.f9402n.sendEmptyMessage(3);
        }
        rVar.b();
    }

    public final void f(float f3) {
        r rVar = this.f9390b;
        rVar.f9410f = f3;
        C0858g c0858g = rVar.f9405a;
        c0858g.f9342a.c();
        c0858g.f9343b.c();
        c0858g.f9344c = false;
        c0858g.f9345d = -9223372036854775807L;
        c0858g.f9346e = 0;
        rVar.c();
    }
}

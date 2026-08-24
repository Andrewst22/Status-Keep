package u0;

import U.A;
import U.AbstractC0123a;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final C0858g f9405a;

    /* renamed from: b  reason: collision with root package name */
    public final io.flutter.view.r f9406b;

    /* renamed from: c  reason: collision with root package name */
    public final q f9407c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9408d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f9409e;

    /* renamed from: f  reason: collision with root package name */
    public float f9410f;

    /* renamed from: g  reason: collision with root package name */
    public float f9411g;

    /* renamed from: h  reason: collision with root package name */
    public float f9412h;

    /* renamed from: i  reason: collision with root package name */
    public float f9413i;

    /* renamed from: j  reason: collision with root package name */
    public int f9414j;

    /* renamed from: k  reason: collision with root package name */
    public long f9415k;

    /* renamed from: l  reason: collision with root package name */
    public long f9416l;

    /* renamed from: m  reason: collision with root package name */
    public long f9417m;

    /* renamed from: n  reason: collision with root package name */
    public long f9418n;

    /* renamed from: o  reason: collision with root package name */
    public long f9419o;

    /* renamed from: p  reason: collision with root package name */
    public long f9420p;

    /* renamed from: q  reason: collision with root package name */
    public long f9421q;

    /* JADX WARN: Type inference failed for: r0v0, types: [u0.g, java.lang.Object] */
    public r(Context context) {
        DisplayManager displayManager;
        io.flutter.view.r rVar;
        ?? obj = new Object();
        obj.f9342a = new C0857f();
        obj.f9343b = new C0857f();
        obj.f9345d = -9223372036854775807L;
        this.f9405a = obj;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            rVar = null;
        } else {
            rVar = new io.flutter.view.r(this, displayManager, 1);
        }
        this.f9406b = rVar;
        this.f9407c = rVar != null ? q.f9400q : null;
        this.f9415k = -9223372036854775807L;
        this.f9416l = -9223372036854775807L;
        this.f9410f = -1.0f;
        this.f9413i = 1.0f;
        this.f9414j = 0;
    }

    public static void a(r rVar, Display display) {
        rVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            rVar.f9415k = refreshRate;
            rVar.f9416l = (refreshRate * 80) / 100;
            return;
        }
        AbstractC0123a.A("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        rVar.f9415k = -9223372036854775807L;
        rVar.f9416l = -9223372036854775807L;
    }

    public final void b() {
        Surface surface;
        if (A.f2405a >= 30 && (surface = this.f9409e) != null && this.f9414j != Integer.MIN_VALUE && this.f9412h != 0.0f) {
            this.f9412h = 0.0f;
            p.a(surface, 0.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = U.A.f2405a
            r1 = 30
            if (r0 < r1) goto L8e
            android.view.Surface r0 = r9.f9409e
            if (r0 != 0) goto Lc
            goto L8e
        Lc:
            u0.g r0 = r9.f9405a
            u0.f r2 = r0.f9342a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3a
            u0.f r2 = r0.f9342a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            u0.f r2 = r0.f9342a
            long r4 = r2.f9338e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f9339f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3c
        L37:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3c
        L3a:
            float r2 = r9.f9410f
        L3c:
            float r4 = r9.f9411g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L43
            return
        L43:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L81
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L81
            u0.f r1 = r0.f9342a
            boolean r1 = r1.a()
            if (r1 == 0) goto L72
            u0.f r1 = r0.f9342a
            boolean r1 = r1.a()
            if (r1 == 0) goto L60
            u0.f r0 = r0.f9342a
            long r0 = r0.f9339f
            goto L65
        L60:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L65:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L72
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L74
        L72:
            r0 = 1065353216(0x3f800000, float:1.0)
        L74:
            float r1 = r9.f9411g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8e
            goto L88
        L81:
            if (r5 == 0) goto L84
            goto L88
        L84:
            int r0 = r0.f9346e
            if (r0 < r1) goto L8e
        L88:
            r9.f9411g = r2
            r0 = 0
            r9.d(r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.r.c():void");
    }

    public final void d(boolean z3) {
        Surface surface;
        float f3;
        if (A.f2405a >= 30 && (surface = this.f9409e) != null && this.f9414j != Integer.MIN_VALUE) {
            if (this.f9408d) {
                float f4 = this.f9411g;
                if (f4 != -1.0f) {
                    f3 = f4 * this.f9413i;
                    if (z3 && this.f9412h == f3) {
                        return;
                    }
                    this.f9412h = f3;
                    p.a(surface, f3);
                }
            }
            f3 = 0.0f;
            if (z3) {
            }
            this.f9412h = f3;
            p.a(surface, f3);
        }
    }
}

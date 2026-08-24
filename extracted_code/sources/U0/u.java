package u0;

import C.C0002c;
import U.A;
import Y.G;
import a0.C0171o;
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0171o f9434m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f9435n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f9436o;

    public /* synthetic */ u(C0171o c0171o, Object obj, long j3) {
        this.f9434m = c0171o;
        this.f9435n = obj;
        this.f9436o = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0171o c0171o = this.f9434m;
        c0171o.getClass();
        int i3 = A.f2405a;
        G g3 = c0171o.f3775c.f3021a;
        Z.f fVar = g3.f3073r;
        Z.a I3 = fVar.I();
        long j3 = this.f9436o;
        Object obj = this.f9435n;
        fVar.J(I3, 26, new B0.a(I3, obj, j3));
        if (g3.f3038N == obj) {
            g3.f3067l.e(26, new C0002c(10));
        }
    }
}

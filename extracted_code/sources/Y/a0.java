package Y;

import android.util.Pair;
import java.io.IOException;
import o0.C0701z;
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3209m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ o0.r f3210n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ l0.g f3211o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ IOException f3212p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ boolean f3213q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f3214r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f3215s;

    public /* synthetic */ a0(Object obj, Object obj2, o0.r rVar, l0.g gVar, IOException iOException, boolean z3, int i3) {
        this.f3209m = i3;
        this.f3214r = obj;
        this.f3215s = obj2;
        this.f3210n = rVar;
        this.f3211o = gVar;
        this.f3212p = iOException;
        this.f3213q = z3;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o0.D, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3209m) {
            case 0:
                Z.f fVar = ((d0) ((B1.a) this.f3214r).f51o).f3239h;
                Pair pair = (Pair) this.f3215s;
                fVar.q(((Integer) pair.first).intValue(), (C0701z) pair.second, this.f3210n, this.f3211o, this.f3212p, this.f3213q);
                return;
            default:
                d0.d dVar = (d0.d) this.f3214r;
                int i3 = dVar.f5148a;
                this.f3215s.q(i3, dVar.f5149b, this.f3210n, this.f3211o, this.f3212p, this.f3213q);
                return;
        }
    }
}

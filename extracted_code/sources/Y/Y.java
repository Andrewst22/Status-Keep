package Y;

import android.util.Pair;
import o0.C0701z;
/* loaded from: classes.dex */
public final /* synthetic */ class Y implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3197m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ B1.a f3198n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Pair f3199o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ l0.g f3200p;

    public /* synthetic */ Y(B1.a aVar, Pair pair, l0.g gVar, int i3) {
        this.f3197m = i3;
        this.f3198n = aVar;
        this.f3199o = pair;
        this.f3200p = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3197m) {
            case 0:
                Z.f fVar = ((d0) this.f3198n.f51o).f3239h;
                Pair pair = this.f3199o;
                int intValue = ((Integer) pair.first).intValue();
                C0701z c0701z = (C0701z) pair.second;
                c0701z.getClass();
                fVar.g(intValue, c0701z, this.f3200p);
                return;
            default:
                Z.f fVar2 = ((d0) this.f3198n.f51o).f3239h;
                Pair pair2 = this.f3199o;
                fVar2.i(((Integer) pair2.first).intValue(), (C0701z) pair2.second, this.f3200p);
                return;
        }
    }
}

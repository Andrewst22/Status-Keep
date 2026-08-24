package Y;

import android.util.Pair;
import o0.C0701z;
/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3201m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f3202n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f3203o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f3204p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ l0.g f3205q;

    public /* synthetic */ Z(Object obj, Object obj2, Object obj3, l0.g gVar, int i3) {
        this.f3201m = i3;
        this.f3202n = obj;
        this.f3203o = obj2;
        this.f3204p = obj3;
        this.f3205q = gVar;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [o0.D, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3201m) {
            case 0:
                Z.f fVar = ((d0) ((B1.a) this.f3202n).f51o).f3239h;
                Pair pair = (Pair) this.f3203o;
                fVar.h(((Integer) pair.first).intValue(), (C0701z) pair.second, (o0.r) this.f3204p, this.f3205q);
                return;
            case 1:
                Z.f fVar2 = ((d0) ((B1.a) this.f3202n).f51o).f3239h;
                Pair pair2 = (Pair) this.f3203o;
                fVar2.B(((Integer) pair2.first).intValue(), (C0701z) pair2.second, (o0.r) this.f3204p, this.f3205q);
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                Z.f fVar3 = ((d0) ((B1.a) this.f3202n).f51o).f3239h;
                Pair pair3 = (Pair) this.f3203o;
                fVar3.C(((Integer) pair3.first).intValue(), (C0701z) pair3.second, (o0.r) this.f3204p, this.f3205q);
                return;
            default:
                int i3 = ((d0.d) this.f3202n).f5148a;
                this.f3203o.g(i3, (C0701z) this.f3204p, this.f3205q);
                return;
        }
    }
}

package u0;

import C.C0002c;
import U.A;
import Y.G;
import a0.C0171o;
import o0.C0701z;
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f9432m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ C0171o f9433n;

    public /* synthetic */ t(C0171o c0171o, int i3, long j3) {
        this.f9432m = 1;
        this.f9433n = c0171o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0171o c0171o = this.f9433n;
        int i3 = this.f9432m;
        c0171o.getClass();
        switch (i3) {
            case 0:
                int i4 = A.f2405a;
                Z.f fVar = c0171o.f3775c.f3021a.f3073r;
                fVar.J(fVar.I(), 1016, new Z.c(22));
                return;
            case 1:
                int i5 = A.f2405a;
                Z.f fVar2 = c0171o.f3775c.f3021a.f3073r;
                fVar2.J(fVar2.G((C0701z) fVar2.f3479p.f3474e), 1018, new Z.c(7));
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                int i6 = A.f2405a;
                Z.f fVar3 = c0171o.f3775c.f3021a.f3073r;
                fVar3.J(fVar3.G((C0701z) fVar3.f3479p.f3474e), 1021, new Z.c(12));
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                int i7 = A.f2405a;
                Z.f fVar4 = c0171o.f3775c.f3021a.f3073r;
                fVar4.J(fVar4.I(), 1030, new C0002c(27));
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                int i8 = A.f2405a;
                G g3 = c0171o.f3775c.f3021a;
                g3.getClass();
                Z.f fVar5 = g3.f3073r;
                fVar5.J(fVar5.I(), 1015, new Z.c(18));
                return;
            default:
                int i9 = A.f2405a;
                Z.f fVar6 = c0171o.f3775c.f3021a.f3073r;
                fVar6.J(fVar6.I(), 1019, new Z.c(6));
                return;
        }
    }

    public /* synthetic */ t(C0171o c0171o, long j3, int i3) {
        this.f9432m = 2;
        this.f9433n = c0171o;
    }

    public /* synthetic */ t(C0171o c0171o, Object obj, int i3) {
        this.f9432m = i3;
        this.f9433n = c0171o;
    }

    public /* synthetic */ t(C0171o c0171o, String str, long j3, long j4) {
        this.f9432m = 0;
        this.f9433n = c0171o;
    }
}

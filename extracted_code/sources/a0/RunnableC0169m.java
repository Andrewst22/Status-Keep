package a0;

import C.C0002c;
import R.C0113p;
import Y.C0137h;
/* renamed from: a0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0169m implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3769m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ C0171o f3770n;

    public /* synthetic */ RunnableC0169m(C0171o c0171o, int i3, long j3, long j4) {
        this.f3769m = 1;
        this.f3770n = c0171o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0171o c0171o = this.f3770n;
        int i3 = this.f3769m;
        c0171o.getClass();
        switch (i3) {
            case 0:
                int i4 = U.A.f2405a;
                Z.f fVar = c0171o.f3775c.f3021a.f3073r;
                fVar.J(fVar.I(), 1031, new C0002c(12));
                return;
            case 1:
                int i5 = U.A.f2405a;
                Z.f fVar2 = c0171o.f3775c.f3021a.f3073r;
                fVar2.J(fVar2.I(), 1011, new Z.c(0));
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                int i6 = U.A.f2405a;
                Z.f fVar3 = c0171o.f3775c.f3021a.f3073r;
                fVar3.J(fVar3.I(), 1032, new C0002c(13));
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                int i7 = U.A.f2405a;
                Y.G g3 = c0171o.f3775c.f3021a;
                g3.getClass();
                Z.f fVar4 = g3.f3073r;
                fVar4.J(fVar4.I(), 1007, new C0002c(18));
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                int i8 = U.A.f2405a;
                Z.f fVar5 = c0171o.f3775c.f3021a.f3073r;
                fVar5.J(fVar5.I(), 1029, new Z.c(21));
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                int i9 = U.A.f2405a;
                Z.f fVar6 = c0171o.f3775c.f3021a.f3073r;
                fVar6.J(fVar6.I(), 1014, new Z.c(23));
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                int i10 = U.A.f2405a;
                Y.G g4 = c0171o.f3775c.f3021a;
                g4.getClass();
                Z.f fVar7 = g4.f3073r;
                fVar7.J(fVar7.I(), 1009, new Z.c(17));
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                int i11 = U.A.f2405a;
                Z.f fVar8 = c0171o.f3775c.f3021a.f3073r;
                fVar8.J(fVar8.I(), 1008, new Z.c(4));
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                int i12 = U.A.f2405a;
                Z.f fVar9 = c0171o.f3775c.f3021a.f3073r;
                fVar9.J(fVar9.I(), 1012, new C0002c(21));
                return;
            default:
                int i13 = U.A.f2405a;
                Z.f fVar10 = c0171o.f3775c.f3021a.f3073r;
                fVar10.J(fVar10.I(), 1010, new Z.c(2));
                return;
        }
    }

    public /* synthetic */ RunnableC0169m(C0171o c0171o, long j3) {
        this.f3769m = 9;
        this.f3770n = c0171o;
    }

    public /* synthetic */ RunnableC0169m(C0171o c0171o, C0113p c0113p, C0137h c0137h) {
        this.f3769m = 6;
        this.f3770n = c0171o;
    }

    public /* synthetic */ RunnableC0169m(C0171o c0171o, Object obj, int i3) {
        this.f3769m = i3;
        this.f3770n = c0171o;
    }

    public /* synthetic */ RunnableC0169m(C0171o c0171o, String str, long j3, long j4) {
        this.f3769m = 7;
        this.f3770n = c0171o;
    }
}

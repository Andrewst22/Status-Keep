package U2;

import C2.p;
import D2.j;
import D2.n;
import java.io.IOException;
import s2.C0808g;
/* loaded from: classes.dex */
public final class f extends j implements p {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ n f2597n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f2598o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ D2.p f2599p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ T2.p f2600q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ D2.p f2601r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ D2.p f2602s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, long j3, D2.p pVar, T2.p pVar2, D2.p pVar3, D2.p pVar4) {
        super(2);
        this.f2597n = nVar;
        this.f2598o = j3;
        this.f2599p = pVar;
        this.f2600q = pVar2;
        this.f2601r = pVar3;
        this.f2602s = pVar4;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        long j3;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            n nVar = this.f2597n;
            if (!nVar.f339m) {
                nVar.f339m = true;
                if (longValue >= this.f2598o) {
                    D2.p pVar = this.f2599p;
                    long j4 = pVar.f341m;
                    T2.p pVar2 = this.f2600q;
                    if (j4 == 4294967295L) {
                        j4 = pVar2.b();
                    }
                    pVar.f341m = j4;
                    D2.p pVar3 = this.f2601r;
                    long j5 = 0;
                    if (pVar3.f341m == 4294967295L) {
                        j3 = pVar2.b();
                    } else {
                        j3 = 0;
                    }
                    pVar3.f341m = j3;
                    D2.p pVar4 = this.f2602s;
                    if (pVar4.f341m == 4294967295L) {
                        j5 = pVar2.b();
                    }
                    pVar4.f341m = j5;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return C0808g.f9229a;
    }
}

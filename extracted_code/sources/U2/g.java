package U2;

import C2.p;
import D2.j;
import D2.q;
import java.io.IOException;
import s2.C0808g;
/* loaded from: classes.dex */
public final class g extends j implements p {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ T2.p f2603n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ q f2604o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ q f2605p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ q f2606q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(T2.p pVar, q qVar, q qVar2, q qVar3) {
        super(2);
        this.f2603n = pVar;
        this.f2604o = qVar;
        this.f2605p = qVar2;
        this.f2606q = qVar3;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        boolean z3;
        boolean z4;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            long j3 = 1;
            if (longValue >= 1) {
                T2.p pVar = this.f2603n;
                pVar.f(1L);
                byte d3 = pVar.f2387n.d();
                boolean z5 = true;
                if ((d3 & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((d3 & 2) == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((d3 & 4) != 4) {
                    z5 = false;
                }
                if (z3) {
                    j3 = 5;
                }
                if (z4) {
                    j3 += 4;
                }
                if (z5) {
                    j3 += 4;
                }
                if (longValue >= j3) {
                    if (z3) {
                        this.f2604o.f342m = Long.valueOf(pVar.a() * 1000);
                    }
                    if (z4) {
                        this.f2605p.f342m = Long.valueOf(pVar.a() * 1000);
                    }
                    if (z5) {
                        this.f2606q.f342m = Long.valueOf(pVar.a() * 1000);
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            } else {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
        return C0808g.f9229a;
    }
}

package T0;

import U.AbstractC0123a;
import U.t;
import java.util.HashMap;
import o0.C0701z;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements U.d, U.i {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2328m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ long f2329n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f2330o;

    public /* synthetic */ n(o oVar, long j3, int i3) {
        this.f2330o = oVar;
        this.f2329n = j3;
        this.f2328m = i3;
    }

    @Override // U.d
    public void accept(Object obj) {
        boolean z3;
        a aVar = (a) obj;
        o oVar = (o) this.f2330o;
        AbstractC0123a.k(oVar.f2338h);
        byte[] o3 = B1.b.o(aVar.f2297a, aVar.f2299c);
        t tVar = oVar.f2333c;
        tVar.getClass();
        tVar.E(o3, o3.length);
        oVar.f2331a.f(o3.length, tVar);
        long j3 = this.f2329n;
        long j4 = aVar.f2298b;
        if (j4 == -9223372036854775807L) {
            if (oVar.f2338h.f1979r == Long.MAX_VALUE) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.j(z3);
        } else {
            long j5 = oVar.f2338h.f1979r;
            if (j5 == Long.MAX_VALUE) {
                j3 += j4;
            } else {
                j3 = j4 + j5;
            }
        }
        long j6 = j3;
        oVar.f2331a.b(j6, this.f2328m, o3.length, 0, null);
    }

    @Override // U.i
    public void b(Object obj) {
        long longValue;
        Z.k kVar = (Z.k) obj;
        kVar.getClass();
        Z.a aVar = (Z.a) this.f2330o;
        C0701z c0701z = aVar.f3457d;
        if (c0701z != null) {
            String d3 = kVar.f3503b.d(aVar.f3455b, c0701z);
            HashMap hashMap = kVar.f3509h;
            Long l3 = (Long) hashMap.get(d3);
            HashMap hashMap2 = kVar.f3508g;
            Long l4 = (Long) hashMap2.get(d3);
            long j3 = 0;
            if (l3 == null) {
                longValue = 0;
            } else {
                longValue = l3.longValue();
            }
            hashMap.put(d3, Long.valueOf(longValue + this.f2329n));
            if (l4 != null) {
                j3 = l4.longValue();
            }
            hashMap2.put(d3, Long.valueOf(j3 + this.f2328m));
        }
    }

    public /* synthetic */ n(Z.a aVar, int i3, long j3, long j4) {
        this.f2330o = aVar;
        this.f2328m = i3;
        this.f2329n = j3;
    }
}

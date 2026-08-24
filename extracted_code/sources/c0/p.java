package c0;

import R.C0113p;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: j  reason: collision with root package name */
    public final B1.e f4773j;

    /* renamed from: k  reason: collision with root package name */
    public final B1.e f4774k;

    /* renamed from: l  reason: collision with root package name */
    public final long f4775l;

    public p(j jVar, long j3, long j4, long j5, long j6, long j7, List list, long j8, B1.e eVar, B1.e eVar2, long j9, long j10) {
        super(jVar, j3, j4, j5, j7, list, j8, j9, j10);
        this.f4773j = eVar;
        this.f4774k = eVar2;
        this.f4775l = j6;
    }

    @Override // c0.s
    public final j a(m mVar) {
        B1.e eVar = this.f4773j;
        if (eVar != null) {
            C0113p c0113p = mVar.f4761m;
            return new j(0L, -1L, eVar.R(c0113p.f1962a, 0L, c0113p.f1970i, 0L));
        }
        return this.f4780a;
    }

    @Override // c0.n
    public final long d(long j3) {
        List list = this.f4768f;
        if (list != null) {
            return list.size();
        }
        long j4 = this.f4775l;
        if (j4 != -1) {
            return (j4 - this.f4766d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.f4781b));
        BigInteger multiply2 = BigInteger.valueOf(this.f4767e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i3 = F1.a.f369a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // c0.n
    public final j h(k kVar, long j3) {
        long j4;
        long j5 = this.f4766d;
        List list = this.f4768f;
        if (list != null) {
            j4 = ((q) list.get((int) (j3 - j5))).f4776a;
        } else {
            j4 = (j3 - j5) * this.f4767e;
        }
        long j6 = j4;
        C0113p c0113p = kVar.f4761m;
        return new j(0L, -1L, this.f4774k.R(c0113p.f1962a, j3, c0113p.f1970i, j6));
    }
}

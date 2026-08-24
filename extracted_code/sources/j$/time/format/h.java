package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.chrono.AbstractC0335i;
import j$.time.temporal.TemporalAccessor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean m(t tVar, StringBuilder sb) {
        Long e2 = tVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor d3 = tVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d3.f(aVar) ? Long.valueOf(tVar.d().v(aVar)) : null;
        int i3 = 0;
        if (e2 == null) {
            return false;
        }
        long longValue = e2.longValue();
        int N3 = aVar.N(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j3 = longValue - 253402300800L;
            long d4 = j$.com.android.tools.r8.a.d(j3, 315569520000L) + 1;
            LocalDateTime c02 = LocalDateTime.c0(j$.com.android.tools.r8.a.i(j3, 315569520000L) - 62167219200L, 0, j$.time.y.f6649f);
            if (d4 > 0) {
                sb.append('+');
                sb.append(d4);
            }
            sb.append(c02);
            if (c02.V() == 0) {
                sb.append(":00");
            }
        } else {
            long j4 = longValue + 62167219200L;
            long j5 = j4 / 315569520000L;
            long j6 = j4 % 315569520000L;
            LocalDateTime c03 = LocalDateTime.c0(j6 - 62167219200L, 0, j$.time.y.f6649f);
            int length = sb.length();
            sb.append(c03);
            if (c03.V() == 0) {
                sb.append(":00");
            }
            if (j5 < 0) {
                if (c03.W() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j5 - 1));
                } else if (j6 == 0) {
                    sb.insert(length, j5);
                } else {
                    sb.insert(length + 1, Math.abs(j5));
                }
            }
        }
        if (N3 > 0) {
            sb.append('.');
            int i4 = 100000000;
            while (true) {
                if (N3 <= 0 && i3 % 3 == 0 && i3 >= -2) {
                    break;
                }
                int i5 = N3 / i4;
                sb.append((char) (i5 + 48));
                N3 -= i5 * i4;
                i4 /= 10;
                i3++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.f
    public final int o(q qVar, CharSequence charSequence, int i3) {
        int i4;
        int i5;
        p pVar = new p();
        pVar.a(DateTimeFormatter.f6503f);
        pVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        pVar.k(aVar, 2);
        pVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        pVar.k(aVar2, 2);
        pVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        pVar.k(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        pVar.b(aVar4);
        pVar.e('Z');
        e f3 = pVar.t().f();
        q c3 = qVar.c();
        int o3 = f3.o(c3, charSequence, i3);
        if (o3 < 0) {
            return o3;
        }
        long longValue = c3.i(j$.time.temporal.a.YEAR).longValue();
        int intValue = c3.i(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int intValue2 = c3.i(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int intValue3 = c3.i(aVar).intValue();
        int intValue4 = c3.i(aVar2).intValue();
        Long i6 = c3.i(aVar3);
        Long i7 = c3.i(aVar4);
        int i8 = 0;
        int intValue5 = i6 != null ? i6.intValue() : 0;
        int intValue6 = i7 != null ? i7.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            i5 = intValue5;
            i8 = 1;
            i4 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            qVar.o();
            i4 = intValue3;
            i5 = 59;
        } else {
            i4 = intValue3;
            i5 = intValue5;
        }
        try {
            LocalDateTime plusDays = LocalDateTime.a0(((int) longValue) % 10000, intValue, intValue2, i4, intValue4, i5, 0).plusDays(i8);
            j$.time.y yVar = j$.time.y.f6649f;
            plusDays.getClass();
            return qVar.n(aVar4, intValue6, i3, qVar.n(j$.time.temporal.a.INSTANT_SECONDS, j$.com.android.tools.r8.a.g(longValue / 10000, 315569520000L) + AbstractC0335i.o(plusDays, yVar), i3, o3));
        } catch (RuntimeException unused) {
            return ~i3;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}

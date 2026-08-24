package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC0328b;
import j$.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x implements TemporalAccessor {

    /* renamed from: b  reason: collision with root package name */
    ZoneId f6565b;

    /* renamed from: c  reason: collision with root package name */
    j$.time.chrono.m f6566c;

    /* renamed from: d  reason: collision with root package name */
    boolean f6567d;

    /* renamed from: e  reason: collision with root package name */
    private y f6568e;

    /* renamed from: f  reason: collision with root package name */
    private InterfaceC0328b f6569f;

    /* renamed from: g  reason: collision with root package name */
    private j$.time.k f6570g;

    /* renamed from: a  reason: collision with root package name */
    final HashMap f6564a = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    j$.time.s f6571h = j$.time.s.f6601d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int o(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.w r(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        if (this.f6564a.containsKey(sVar)) {
            return true;
        }
        InterfaceC0328b interfaceC0328b = this.f6569f;
        if (interfaceC0328b == null || !interfaceC0328b.f(sVar)) {
            j$.time.k kVar = this.f6570g;
            if (kVar == null || !kVar.f(sVar)) {
                return (sVar == null || (sVar instanceof j$.time.temporal.a) || !sVar.r(this)) ? false : true;
            }
            return true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        Objects.requireNonNull(sVar, "field");
        Long l3 = (Long) this.f6564a.get(sVar);
        if (l3 != null) {
            return l3.longValue();
        }
        InterfaceC0328b interfaceC0328b = this.f6569f;
        if (interfaceC0328b != null && interfaceC0328b.f(sVar)) {
            return this.f6569f.v(sVar);
        }
        j$.time.k kVar = this.f6570g;
        if (kVar != null && kVar.f(sVar)) {
            return this.f6570g.v(sVar);
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k()) {
            return this.f6565b;
        }
        if (tVar == j$.time.temporal.n.e()) {
            return this.f6566c;
        }
        if (tVar == j$.time.temporal.n.f()) {
            InterfaceC0328b interfaceC0328b = this.f6569f;
            if (interfaceC0328b != null) {
                return j$.time.g.P(interfaceC0328b);
            }
            return null;
        } else if (tVar == j$.time.temporal.n.g()) {
            return this.f6570g;
        } else {
            if (tVar == j$.time.temporal.n.h()) {
                Long l3 = (Long) this.f6564a.get(j$.time.temporal.a.OFFSET_SECONDS);
                if (l3 != null) {
                    return j$.time.y.W(l3.intValue());
                }
                ZoneId zoneId = this.f6565b;
                return zoneId instanceof j$.time.y ? zoneId : tVar.g(this);
            } else if (tVar == j$.time.temporal.n.j()) {
                return tVar.g(this);
            } else {
                if (tVar == j$.time.temporal.n.i()) {
                    return null;
                }
                return tVar.g(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(j$.time.format.y r24) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.x.k(j$.time.format.y):void");
    }

    private void E(j$.time.temporal.s sVar, j$.time.temporal.a aVar, Long l3) {
        Long l4 = (Long) this.f6564a.put(aVar, l3);
        if (l4 == null || l4.longValue() == l3.longValue()) {
            return;
        }
        throw new RuntimeException("Conflict found: " + aVar + " " + l4 + " differs from " + aVar + " " + l3 + " while resolving  " + sVar);
    }

    private void l() {
        HashMap hashMap = this.f6564a;
        if (hashMap.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f6565b;
            if (zoneId != null) {
                p(zoneId);
                return;
            }
            Long l3 = (Long) hashMap.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l3 != null) {
                p(j$.time.y.W(l3.intValue()));
            }
        }
    }

    private void p(ZoneId zoneId) {
        HashMap hashMap = this.f6564a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        ChronoZonedDateTime I3 = this.f6566c.I(Instant.R(((Long) hashMap.remove(aVar)).longValue()), zoneId);
        A(I3.c());
        E(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(I3.b().g0()));
    }

    private void A(InterfaceC0328b interfaceC0328b) {
        InterfaceC0328b interfaceC0328b2 = this.f6569f;
        if (interfaceC0328b2 != null) {
            if (interfaceC0328b == null || interfaceC0328b2.equals(interfaceC0328b)) {
                return;
            }
            InterfaceC0328b interfaceC0328b3 = this.f6569f;
            throw new RuntimeException("Conflict found: Fields resolved to two different dates: " + interfaceC0328b3 + " " + interfaceC0328b);
        } else if (interfaceC0328b != null) {
            if (!this.f6566c.equals(interfaceC0328b.a())) {
                j$.time.chrono.m mVar = this.f6566c;
                throw new RuntimeException("ChronoLocalDate must use the effective parsed chronology: " + mVar);
            }
            this.f6569f = interfaceC0328b;
        }
    }

    private void u() {
        HashMap hashMap = this.f6564a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (hashMap.containsKey(aVar)) {
            long longValue = ((Long) hashMap.remove(aVar)).longValue();
            y yVar = this.f6568e;
            if (yVar == y.STRICT || (yVar == y.SMART && longValue != 0)) {
                aVar.O(longValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            E(aVar, aVar2, Long.valueOf(longValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(aVar3)) {
            long longValue2 = ((Long) hashMap.remove(aVar3)).longValue();
            y yVar2 = this.f6568e;
            if (yVar2 == y.STRICT || (yVar2 == y.SMART && longValue2 != 0)) {
                aVar3.O(longValue2);
            }
            E(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (hashMap.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (hashMap.containsKey(aVar5)) {
                long longValue3 = ((Long) hashMap.remove(aVar4)).longValue();
                long longValue4 = ((Long) hashMap.remove(aVar5)).longValue();
                if (this.f6568e == y.LENIENT) {
                    E(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(j$.com.android.tools.r8.a.h(j$.com.android.tools.r8.a.g(longValue3, 12), longValue4)));
                } else {
                    aVar4.O(longValue3);
                    aVar5.O(longValue3);
                    E(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (hashMap.containsKey(aVar6)) {
            long longValue5 = ((Long) hashMap.remove(aVar6)).longValue();
            if (this.f6568e != y.LENIENT) {
                aVar6.O(longValue5);
            }
            E(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            E(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            E(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            E(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (hashMap.containsKey(aVar7)) {
            long longValue6 = ((Long) hashMap.remove(aVar7)).longValue();
            if (this.f6568e != y.LENIENT) {
                aVar7.O(longValue6);
            }
            E(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            E(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (hashMap.containsKey(aVar8)) {
            long longValue7 = ((Long) hashMap.remove(aVar8)).longValue();
            if (this.f6568e != y.LENIENT) {
                aVar8.O(longValue7);
            }
            E(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            E(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (hashMap.containsKey(aVar9)) {
            long longValue8 = ((Long) hashMap.remove(aVar9)).longValue();
            if (this.f6568e != y.LENIENT) {
                aVar9.O(longValue8);
            }
            E(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            E(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            E(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (hashMap.containsKey(aVar10)) {
            long longValue9 = ((Long) hashMap.remove(aVar10)).longValue();
            if (this.f6568e != y.LENIENT) {
                aVar10.O(longValue9);
            }
            E(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            E(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (hashMap.containsKey(aVar11)) {
            long longValue10 = ((Long) hashMap.get(aVar11)).longValue();
            y yVar3 = this.f6568e;
            y yVar4 = y.LENIENT;
            if (yVar3 != yVar4) {
                aVar11.O(longValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (hashMap.containsKey(aVar12)) {
                long longValue11 = ((Long) hashMap.remove(aVar12)).longValue();
                if (this.f6568e != yVar4) {
                    aVar12.O(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                E(aVar12, aVar11, Long.valueOf(longValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (hashMap.containsKey(aVar13)) {
                long longValue12 = ((Long) hashMap.remove(aVar13)).longValue();
                if (this.f6568e != yVar4) {
                    aVar13.O(longValue12);
                }
                E(aVar13, aVar11, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (hashMap.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (hashMap.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (hashMap.containsKey(aVar16) && hashMap.containsKey(aVar11)) {
                    s(((Long) hashMap.remove(aVar14)).longValue(), ((Long) hashMap.remove(aVar15)).longValue(), ((Long) hashMap.remove(aVar16)).longValue(), ((Long) hashMap.remove(aVar11)).longValue());
                }
            }
        }
    }

    private void s(long j3, long j4, long j5, long j6) {
        if (this.f6568e == y.LENIENT) {
            long h3 = j$.com.android.tools.r8.a.h(j$.com.android.tools.r8.a.h(j$.com.android.tools.r8.a.h(j$.com.android.tools.r8.a.g(j3, 3600000000000L), j$.com.android.tools.r8.a.g(j4, 60000000000L)), j$.com.android.tools.r8.a.g(j5, 1000000000L)), j6);
            x(j$.time.k.X(j$.com.android.tools.r8.a.i(h3, 86400000000000L)), j$.time.s.b((int) j$.com.android.tools.r8.a.d(h3, 86400000000000L)));
            return;
        }
        int N3 = j$.time.temporal.a.MINUTE_OF_HOUR.N(j4);
        int N4 = j$.time.temporal.a.NANO_OF_SECOND.N(j6);
        if (this.f6568e == y.SMART && j3 == 24 && N3 == 0 && j5 == 0 && N4 == 0) {
            x(j$.time.k.f6584g, j$.time.s.b(1));
        } else {
            x(j$.time.k.W(j$.time.temporal.a.HOUR_OF_DAY.N(j3), N3, j$.time.temporal.a.SECOND_OF_MINUTE.N(j5), N4), j$.time.s.f6601d);
        }
    }

    private void x(j$.time.k kVar, j$.time.s sVar) {
        j$.time.k kVar2 = this.f6570g;
        if (kVar2 != null) {
            if (!kVar2.equals(kVar)) {
                j$.time.k kVar3 = this.f6570g;
                throw new RuntimeException("Conflict found: Fields resolved to different times: " + kVar3 + " " + kVar);
            }
            j$.time.s sVar2 = this.f6571h;
            sVar2.getClass();
            j$.time.s sVar3 = j$.time.s.f6601d;
            if (sVar2 != sVar3 && sVar != sVar3 && !this.f6571h.equals(sVar)) {
                j$.time.s sVar4 = this.f6571h;
                throw new RuntimeException("Conflict found: Fields resolved to different excess periods: " + sVar4 + " " + sVar);
            }
            this.f6571h = sVar;
            return;
        }
        this.f6570g = kVar;
        this.f6571h = sVar;
    }

    private void g(TemporalAccessor temporalAccessor) {
        Iterator it = this.f6564a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.s sVar = (j$.time.temporal.s) entry.getKey();
            if (temporalAccessor.f(sVar)) {
                try {
                    long v3 = temporalAccessor.v(sVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (v3 != longValue) {
                        throw new RuntimeException("Conflict found: Field " + sVar + " " + v3 + " differs from " + sVar + " " + longValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f6564a);
        sb.append(',');
        sb.append(this.f6566c);
        if (this.f6565b != null) {
            sb.append(',');
            sb.append(this.f6565b);
        }
        if (this.f6569f != null || this.f6570g != null) {
            sb.append(" resolved to ");
            InterfaceC0328b interfaceC0328b = this.f6569f;
            if (interfaceC0328b != null) {
                sb.append(interfaceC0328b);
                if (this.f6570g != null) {
                    sb.append('T');
                    sb.append(this.f6570g);
                }
            } else {
                sb.append(this.f6570g);
            }
        }
        return sb.toString();
    }
}

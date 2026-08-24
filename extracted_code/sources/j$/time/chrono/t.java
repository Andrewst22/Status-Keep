package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class t extends AbstractC0327a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final t f6484d = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n L(int i3) {
        if (i3 != 0) {
            if (i3 == 1) {
                return u.CE;
            }
            throw new RuntimeException("Invalid era: " + i3);
        }
        return u.BCE;
    }

    private t() {
    }

    @Override // j$.time.chrono.m
    public final String l() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String u() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b E(int i3, int i4, int i5) {
        return j$.time.g.a0(i3, i4, i5);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b x(int i3, int i4) {
        return j$.time.g.d0(i3, i4);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b k(long j3) {
        return j$.time.g.c0(j3);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b p(TemporalAccessor temporalAccessor) {
        return j$.time.g.P(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC0327a, j$.time.chrono.m
    public final InterfaceC0331e s(LocalDateTime localDateTime) {
        return LocalDateTime.O(localDateTime);
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime I(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.N(instant, zoneId);
    }

    @Override // j$.time.chrono.AbstractC0327a
    public final InterfaceC0328b o() {
        return j$.time.g.P(j$.time.g.Z(j$.time.b.b()));
    }

    public static boolean O(long j3) {
        return (3 & j3) == 0 && (j3 % 100 != 0 || j3 % 400 == 0);
    }

    @Override // j$.time.chrono.m
    public final int g(n nVar, int i3) {
        if (nVar instanceof u) {
            return nVar == u.CE ? i3 : 1 - i3;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.m
    public final List J() {
        return j$.com.android.tools.r8.a.e(u.values());
    }

    @Override // j$.time.chrono.AbstractC0327a, j$.time.chrono.m
    public final InterfaceC0328b G(Map map, j$.time.format.y yVar) {
        return (j$.time.g) super.G(map, yVar);
    }

    @Override // j$.time.chrono.AbstractC0327a
    final void z(Map map, j$.time.format.y yVar) {
        long j3;
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.O(l3.longValue());
            }
            AbstractC0327a.m(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.i(l3.longValue(), j3)) + 1);
            AbstractC0327a.m(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.d(l3.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC0327a
    final InterfaceC0328b N(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.O(l3.longValue());
            }
            Long l4 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l4 == null) {
                j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
                Long l5 = (Long) map.get(aVar2);
                if (yVar != j$.time.format.y.STRICT) {
                    AbstractC0327a.m(map, aVar2, (l5 == null || l5.longValue() > 0) ? l3.longValue() : j$.com.android.tools.r8.a.j(1L, l3.longValue()));
                    return null;
                } else if (l5 != null) {
                    int i3 = (l5.longValue() > 0L ? 1 : (l5.longValue() == 0L ? 0 : -1));
                    long longValue = l3.longValue();
                    if (i3 <= 0) {
                        longValue = j$.com.android.tools.r8.a.j(1L, longValue);
                    }
                    AbstractC0327a.m(map, aVar2, longValue);
                    return null;
                } else {
                    map.put(aVar, l3);
                    return null;
                }
            } else if (l4.longValue() == 1) {
                AbstractC0327a.m(map, j$.time.temporal.a.YEAR, l3.longValue());
                return null;
            } else if (l4.longValue() == 0) {
                AbstractC0327a.m(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.j(1L, l3.longValue()));
                return null;
            } else {
                throw new RuntimeException("Invalid value for era: " + l4);
            }
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (map.containsKey(aVar3)) {
            aVar3.O(((Long) map.get(aVar3)).longValue());
            return null;
        }
        return null;
    }

    @Override // j$.time.chrono.AbstractC0327a
    final InterfaceC0328b A(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int N3 = aVar.N(((Long) map.remove(aVar)).longValue());
        boolean z3 = true;
        if (yVar == j$.time.format.y.LENIENT) {
            return j$.time.g.a0(N3, 1, 1).g0(j$.com.android.tools.r8.a.j(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).f0(j$.com.android.tools.r8.a.j(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int N4 = aVar2.N(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int N5 = aVar3.N(((Long) map.remove(aVar3)).longValue());
        if (yVar == j$.time.format.y.SMART) {
            if (N4 == 4 || N4 == 6 || N4 == 9 || N4 == 11) {
                N5 = Math.min(N5, 30);
            } else if (N4 == 2) {
                j$.time.m mVar = j$.time.m.FEBRUARY;
                long j3 = N3;
                int i3 = j$.time.v.f6641b;
                if ((3 & j3) != 0 || (j3 % 100 == 0 && j3 % 400 != 0)) {
                    z3 = false;
                }
                N5 = Math.min(N5, mVar.O(z3));
            }
        }
        return j$.time.g.a0(N3, N4, N5);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.w H(j$.time.temporal.a aVar) {
        return aVar.m();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}

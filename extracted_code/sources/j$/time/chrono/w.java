package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class w extends AbstractC0327a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final w f6487d = new w();
    private static final long serialVersionUID = 459996390165777884L;

    private w() {
    }

    @Override // j$.time.chrono.m
    public final String l() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String u() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b E(int i3, int i4, int i5) {
        return new y(j$.time.g.a0(i3, i4, i5));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b x(int i3, int i4) {
        return new y(j$.time.g.d0(i3, i4));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b k(long j3) {
        return new y(j$.time.g.c0(j3));
    }

    @Override // j$.time.chrono.AbstractC0327a
    public final InterfaceC0328b o() {
        return new y(j$.time.g.P(j$.time.g.Z(j$.time.b.b())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b p(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof y) {
            return (y) temporalAccessor;
        }
        return new y(j$.time.g.P(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final int g(n nVar, int i3) {
        if (!(nVar instanceof z)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        z zVar = (z) nVar;
        int V3 = (zVar.l().V() + i3) - 1;
        if (i3 == 1) {
            return V3;
        }
        if (V3 < -999999999 || V3 > 999999999 || V3 < zVar.l().V() || nVar != z.g(j$.time.g.a0(V3, 1, 1))) {
            throw new RuntimeException("Invalid yearOfEra value");
        }
        return V3;
    }

    @Override // j$.time.chrono.m
    public final n L(int i3) {
        return z.s(i3);
    }

    @Override // j$.time.chrono.m
    public final List J() {
        return j$.com.android.tools.r8.a.e(z.E());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.w H(j$.time.temporal.a aVar) {
        switch (v.f6486a[aVar.ordinal()]) {
            case 1:
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                throw new RuntimeException("Unsupported field: " + aVar);
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return j$.time.temporal.w.k(z.x(), 999999999 - z.k().l().V());
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.time.temporal.w.k(z.u(), j$.time.temporal.a.DAY_OF_YEAR.m().d());
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.time.temporal.w.j(y.f6489d.V(), 999999999L);
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return j$.time.temporal.w.j(z.f6493d.getValue(), z.k().getValue());
            default:
                return aVar.m();
        }
    }

    @Override // j$.time.chrono.AbstractC0327a, j$.time.chrono.m
    public final InterfaceC0328b G(Map map, j$.time.format.y yVar) {
        return (y) super.G(map, yVar);
    }

    @Override // j$.time.chrono.AbstractC0327a
    final InterfaceC0328b N(Map map, j$.time.format.y yVar) {
        y W2;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l3 = (Long) map.get(aVar);
        z s3 = l3 != null ? z.s(H(aVar).a(l3.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l4 = (Long) map.get(aVar2);
        int a3 = l4 != null ? H(aVar2).a(l4.longValue(), aVar2) : 0;
        if (s3 == null && l4 != null && !map.containsKey(j$.time.temporal.a.YEAR) && yVar != j$.time.format.y.STRICT) {
            s3 = z.E()[z.E().length - 1];
        }
        if (l4 != null && s3 != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return new y(j$.time.g.a0((s3.l().V() + a3) - 1, 1, 1)).T(j$.com.android.tools.r8.a.j(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).T(j$.com.android.tools.r8.a.j(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int a4 = H(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a5 = H(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (yVar != j$.time.format.y.SMART) {
                        j$.time.g gVar = y.f6489d;
                        j$.time.g a02 = j$.time.g.a0((s3.l().V() + a3) - 1, a4, a5);
                        if (a02.W(s3.l()) || s3 != z.g(a02)) {
                            throw new RuntimeException("year, month, and day not valid for Era");
                        }
                        return new y(s3, a3, a02);
                    } else if (a3 < 1) {
                        throw new RuntimeException("Invalid YearOfEra: " + a3);
                    } else {
                        int V3 = (s3.l().V() + a3) - 1;
                        try {
                            W2 = new y(j$.time.g.a0(V3, a4, a5));
                        } catch (j$.time.c unused) {
                            W2 = new y(j$.time.g.a0(V3, a4, 1)).W(new j$.time.temporal.q(0));
                        }
                        if (W2.S() == s3 || j$.time.temporal.n.a(W2, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || a3 <= 1) {
                            return W2;
                        }
                        throw new RuntimeException("Invalid YearOfEra for Era: " + s3 + " " + a3);
                    }
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (yVar == j$.time.format.y.LENIENT) {
                    return new y(j$.time.g.d0((s3.l().V() + a3) - 1, 1)).T(j$.com.android.tools.r8.a.j(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int a6 = H(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.g gVar2 = y.f6489d;
                j$.time.g d02 = a3 == 1 ? j$.time.g.d0(s3.l().V(), (s3.l().T() + a6) - 1) : j$.time.g.d0((s3.l().V() + a3) - 1, a6);
                if (d02.W(s3.l()) || s3 != z.g(d02)) {
                    throw new RuntimeException("Invalid parameters");
                }
                return new y(s3, a3, d02);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime I(Instant instant, ZoneId zoneId) {
        return l.O(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}

package j$.time;

import j$.time.chrono.AbstractC0335i;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC0328b;
import j$.time.chrono.InterfaceC0331e;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<g>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f6431a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6432b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneId f6433c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long M() {
        return AbstractC0335i.p(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isBefore(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC0335i.h(this, chronoZonedDateTime);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC0335i.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC0331e D() {
        return this.f6431a;
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        C0326a c0326a;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == y.f6649f) {
            c0326a = C0326a.f6434b;
        } else {
            c0326a = new C0326a(zoneId);
        }
        Objects.requireNonNull(c0326a, "clock");
        return N(Instant.Q(System.currentTimeMillis()), c0326a.a());
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.m a() {
        return ((g) c()).a();
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return O(localDateTime, zoneId, null);
    }

    public static ZonedDateTime of(int i3, int i4, int i5, int i6, int i7, int i8, int i9, ZoneId zoneId) {
        return O(LocalDateTime.a0(i3, i4, i5, i6, i7, i8, i9), zoneId, null);
    }

    public static ZonedDateTime O(LocalDateTime localDateTime, ZoneId zoneId, y yVar) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof y) {
            return new ZonedDateTime(localDateTime, zoneId, (y) zoneId);
        }
        j$.time.zone.f N3 = zoneId.N();
        List g3 = N3.g(localDateTime);
        if (g3.size() == 1) {
            yVar = (y) g3.get(0);
        } else if (g3.size() == 0) {
            j$.time.zone.b f3 = N3.f(localDateTime);
            localDateTime = localDateTime.e0(f3.q().r());
            yVar = f3.r();
        } else if (yVar == null || !g3.contains(yVar)) {
            yVar = (y) g3.get(0);
            Objects.requireNonNull(yVar, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, yVar);
    }

    public static ZonedDateTime N(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return A(instant.O(), instant.P(), zoneId);
    }

    private static ZonedDateTime A(long j3, int i3, ZoneId zoneId) {
        y d3 = zoneId.N().d(Instant.S(j3, i3));
        return new ZonedDateTime(LocalDateTime.c0(j3, i3, d3), zoneId, d3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.S(M(), b().T());
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, y yVar) {
        this.f6431a = localDateTime;
        this.f6432b = yVar;
        this.f6433c = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return (sVar instanceof j$.time.temporal.a) || (sVar != null && sVar.r(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) sVar).m();
            }
            return this.f6431a.r(sVar);
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = A.f6417a[((j$.time.temporal.a) sVar).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return this.f6432b.T();
                }
                return this.f6431a.o(sVar);
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return AbstractC0335i.e(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = A.f6417a[((j$.time.temporal.a) sVar).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return this.f6432b.T();
                }
                return this.f6431a.v(sVar);
            }
            return AbstractC0335i.p(this);
        }
        return sVar.q(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final y h() {
        return this.f6432b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId t() {
        return this.f6433c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f6433c.equals(zoneId) ? this : O(this.f6431a, zoneId, this.f6432b);
    }

    public final LocalDateTime R() {
        return this.f6431a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC0328b c() {
        return this.f6431a.g0();
    }

    public int getYear() {
        return this.f6431a.W();
    }

    public int getMonthValue() {
        return this.f6431a.T();
    }

    public int getDayOfMonth() {
        return this.f6431a.P();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f6431a.Q();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k b() {
        return this.f6431a.b();
    }

    public int getHour() {
        return this.f6431a.R();
    }

    public int getMinute() {
        return this.f6431a.S();
    }

    public int getSecond() {
        return this.f6431a.V();
    }

    public int getNano() {
        return this.f6431a.U();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(g gVar) {
        return O(LocalDateTime.b0(gVar, this.f6431a.b()), this.f6433c, this.f6432b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            int i3 = A.f6417a[aVar.ordinal()];
            ZoneId zoneId = this.f6433c;
            if (i3 != 1) {
                y yVar = this.f6432b;
                LocalDateTime localDateTime = this.f6431a;
                if (i3 != 2) {
                    return O(localDateTime.d(j3, sVar), zoneId, yVar);
                }
                y W2 = y.W(aVar.N(j3));
                return (W2.equals(yVar) || !zoneId.N().g(localDateTime).contains(W2)) ? this : new ZonedDateTime(localDateTime, zoneId, W2);
            }
            return A(j3, getNano(), zoneId);
        }
        return (ZonedDateTime) sVar.v(this, j3);
    }

    @Override // j$.time.temporal.m
    /* renamed from: P */
    public final ZonedDateTime e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
            int compareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
            y yVar = this.f6432b;
            ZoneId zoneId = this.f6433c;
            LocalDateTime localDateTime = this.f6431a;
            if (compareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return O(localDateTime.e(j3, uVar), zoneId, yVar);
            }
            LocalDateTime e2 = localDateTime.e(j3, uVar);
            Objects.requireNonNull(e2, "localDateTime");
            Objects.requireNonNull(yVar, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.N().g(e2).contains(yVar)) {
                return new ZonedDateTime(e2, zoneId, yVar);
            }
            return A(AbstractC0335i.o(e2, yVar), e2.U(), zoneId);
        }
        return (ZonedDateTime) uVar.m(this, j3);
    }

    public ZonedDateTime plusDays(long j3) {
        return O(this.f6431a.plusDays(j3), this.f6433c, this.f6432b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.f()) {
            return this.f6431a.g0();
        }
        return AbstractC0335i.m(this, tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            return this.f6431a.equals(zonedDateTime.f6431a) && this.f6432b.equals(zonedDateTime.f6432b) && this.f6433c.equals(zonedDateTime.f6433c);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6431a.hashCode() ^ this.f6432b.hashCode()) ^ Integer.rotateLeft(this.f6433c.hashCode(), 3);
    }

    public final String toString() {
        String localDateTime = this.f6431a.toString();
        y yVar = this.f6432b;
        String str = localDateTime + yVar.toString();
        ZoneId zoneId = this.f6433c;
        if (yVar != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    private Object writeReplace() {
        return new t((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(DataOutput dataOutput) {
        this.f6431a.k0(dataOutput);
        this.f6432b.Z(dataOutput);
        this.f6433c.R((ObjectOutput) dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZonedDateTime Q(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f6426c;
        g gVar = g.f6574d;
        LocalDateTime b02 = LocalDateTime.b0(g.a0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.e0(objectInput));
        y Y2 = y.Y(objectInput);
        ZoneId zoneId = (ZoneId) t.a(objectInput);
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof y) && !Y2.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(b02, zoneId, Y2);
    }
}

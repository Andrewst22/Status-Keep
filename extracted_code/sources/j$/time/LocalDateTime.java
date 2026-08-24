package j$.time;

import j$.time.chrono.AbstractC0335i;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC0328b;
import j$.time.chrono.InterfaceC0331e;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, InterfaceC0331e, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final LocalDateTime f6426c = b0(g.f6574d, k.f6582e);

    /* renamed from: d  reason: collision with root package name */
    public static final LocalDateTime f6427d = b0(g.f6575e, k.f6583f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a  reason: collision with root package name */
    private final g f6428a;

    /* renamed from: b  reason: collision with root package name */
    private final k f6429b;

    @Override // j$.time.chrono.InterfaceC0331e
    public final InterfaceC0328b c() {
        return this.f6428a;
    }

    @Override // j$.time.chrono.InterfaceC0331e
    public final j$.time.chrono.m a() {
        return ((g) c()).a();
    }

    public static LocalDateTime Z(int i3) {
        return new LocalDateTime(g.a0(i3, 12, 31), k.V(0));
    }

    public static LocalDateTime a0(int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return new LocalDateTime(g.a0(i3, i4, i5), k.W(i6, i7, i8, i9));
    }

    public static LocalDateTime b0(g gVar, k kVar) {
        Objects.requireNonNull(gVar, "date");
        Objects.requireNonNull(kVar, "time");
        return new LocalDateTime(gVar, kVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(((g) c()).w(), j$.time.temporal.a.EPOCH_DAY).d(b().f0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime c0(long j3, int i3, y yVar) {
        long T3;
        long j4;
        Objects.requireNonNull(yVar, "offset");
        long j5 = i3;
        j$.time.temporal.a.NANO_OF_SECOND.O(j5);
        return new LocalDateTime(g.c0(j$.com.android.tools.r8.a.d(j3 + yVar.T(), 86400)), k.X((((int) j$.com.android.tools.r8.a.i(T3, j4)) * 1000000000) + j5));
    }

    public static LocalDateTime O(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).R();
        }
        if (temporalAccessor instanceof q) {
            return ((q) temporalAccessor).Q();
        }
        try {
            return new LocalDateTime(g.P(temporalAccessor), k.P(temporalAccessor));
        } catch (c e2) {
            String name = temporalAccessor.getClass().getName();
            throw new RuntimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + name, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.h, java.lang.Object] */
    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.d(charSequence, new Object());
    }

    private LocalDateTime(g gVar, k kVar) {
        this.f6428a = gVar;
        this.f6429b = kVar;
    }

    private LocalDateTime j0(g gVar, k kVar) {
        return (this.f6428a == gVar && this.f6429b == kVar) ? this : new LocalDateTime(gVar, kVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar != null && sVar.r(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        return aVar.A() || aVar.P();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) sVar).P()) {
                k kVar = this.f6429b;
                kVar.getClass();
                return j$.time.temporal.n.d(kVar, sVar);
            }
            return this.f6428a.r(sVar);
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() ? this.f6429b.o(sVar) : this.f6428a.o(sVar);
        }
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() ? this.f6429b.v(sVar) : this.f6428a.v(sVar);
        }
        return sVar.q(this);
    }

    private int N(LocalDateTime localDateTime) {
        int N3 = this.f6428a.N(localDateTime.f6428a);
        return N3 == 0 ? this.f6429b.compareTo(localDateTime.f6429b) : N3;
    }

    public final g g0() {
        return this.f6428a;
    }

    public final int W() {
        return this.f6428a.V();
    }

    public final int T() {
        return this.f6428a.U();
    }

    public final int P() {
        return this.f6428a.R();
    }

    public final DayOfWeek Q() {
        return this.f6428a.S();
    }

    @Override // j$.time.chrono.InterfaceC0331e
    public final k b() {
        return this.f6429b;
    }

    public final int R() {
        return this.f6429b.R();
    }

    public final int S() {
        return this.f6429b.S();
    }

    public final int V() {
        return this.f6429b.U();
    }

    public final int U() {
        return this.f6429b.T();
    }

    public final LocalDateTime i0(g gVar) {
        return j0(gVar, this.f6429b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(g gVar) {
        return j0(gVar, this.f6429b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: h0 */
    public final LocalDateTime d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            boolean P3 = ((j$.time.temporal.a) sVar).P();
            k kVar = this.f6429b;
            g gVar = this.f6428a;
            if (P3) {
                return j0(gVar, kVar.d(j3, sVar));
            }
            return j0(gVar.d(j3, sVar), kVar);
        }
        return (LocalDateTime) sVar.v(this, j3);
    }

    @Override // j$.time.temporal.m
    /* renamed from: d0 */
    public final LocalDateTime e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (i.f6579a[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return f0(this.f6428a, 0L, 0L, 0L, j3);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    LocalDateTime plusDays = plusDays(j3 / 86400000000L);
                    return plusDays.f0(plusDays.f6428a, 0L, 0L, 0L, (j3 % 86400000000L) * 1000);
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    LocalDateTime plusDays2 = plusDays(j3 / 86400000);
                    return plusDays2.f0(plusDays2.f6428a, 0L, 0L, 0L, (j3 % 86400000) * 1000000);
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return e0(j3);
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return f0(this.f6428a, 0L, j3, 0L, 0L);
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return f0(this.f6428a, j3, 0L, 0L, 0L);
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    LocalDateTime plusDays3 = plusDays(j3 / 256);
                    return plusDays3.f0(plusDays3.f6428a, (j3 % 256) * 12, 0L, 0L, 0L);
                default:
                    return j0(this.f6428a.e(j3, uVar), this.f6429b);
            }
        }
        return (LocalDateTime) uVar.m(this, j3);
    }

    public LocalDateTime plusWeeks(long j3) {
        return j0(this.f6428a.h0(j3), this.f6429b);
    }

    public LocalDateTime plusDays(long j3) {
        return j0(this.f6428a.f0(j3), this.f6429b);
    }

    public final LocalDateTime e0(long j3) {
        return f0(this.f6428a, 0L, 0L, j3, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
    }

    private LocalDateTime f0(g gVar, long j3, long j4, long j5, long j6) {
        k kVar = this.f6429b;
        if ((j3 | j4 | j5 | j6) == 0) {
            return j0(gVar, kVar);
        }
        long j7 = j3 / 24;
        long j8 = j7 + (j4 / 1440) + (j5 / 86400) + (j6 / 86400000000000L);
        long j9 = 1;
        long j10 = ((j3 % 24) * 3600000000000L) + ((j4 % 1440) * 60000000000L) + ((j5 % 86400) * 1000000000) + (j6 % 86400000000000L);
        long f02 = kVar.f0();
        long j11 = (j10 * j9) + f02;
        long d3 = j$.com.android.tools.r8.a.d(j11, 86400000000000L) + (j8 * j9);
        long i3 = j$.com.android.tools.r8.a.i(j11, 86400000000000L);
        if (i3 != f02) {
            kVar = k.X(i3);
        }
        return j0(gVar.f0(d3), kVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.f()) {
            return this.f6428a;
        }
        return AbstractC0335i.l(this, tVar);
    }

    @Override // j$.time.chrono.InterfaceC0331e
    public final ChronoZonedDateTime n(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    @Override // java.lang.Comparable
    /* renamed from: C */
    public final int compareTo(InterfaceC0331e interfaceC0331e) {
        if (interfaceC0331e instanceof LocalDateTime) {
            return N((LocalDateTime) interfaceC0331e);
        }
        return AbstractC0335i.c(this, interfaceC0331e);
    }

    public final boolean X(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return N(localDateTime) > 0;
        }
        int i3 = (this.f6428a.w() > localDateTime.f6428a.w() ? 1 : (this.f6428a.w() == localDateTime.f6428a.w() ? 0 : -1));
        return i3 > 0 || (i3 == 0 && this.f6429b.f0() > localDateTime.f6429b.f0());
    }

    public final boolean Y(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return N(localDateTime) < 0;
        }
        int i3 = (this.f6428a.w() > localDateTime.f6428a.w() ? 1 : (this.f6428a.w() == localDateTime.f6428a.w() ? 0 : -1));
        return i3 < 0 || (i3 == 0 && this.f6429b.f0() < localDateTime.f6429b.f0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            return this.f6428a.equals(localDateTime.f6428a) && this.f6429b.equals(localDateTime.f6429b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6428a.hashCode() ^ this.f6429b.hashCode();
    }

    public final String toString() {
        String gVar = this.f6428a.toString();
        String kVar = this.f6429b.toString();
        return gVar + "T" + kVar;
    }

    private Object writeReplace() {
        return new t((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k0(DataOutput dataOutput) {
        this.f6428a.o0(dataOutput);
        this.f6429b.j0(dataOutput);
    }
}

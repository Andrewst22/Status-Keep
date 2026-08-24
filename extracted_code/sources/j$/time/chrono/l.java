package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
final class l implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a  reason: collision with root package name */
    private final transient C0333g f6462a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.y f6463b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ZoneId f6464c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long M() {
        return AbstractC0335i.p(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isBefore(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC0335i.h(this, chronoZonedDateTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int o(j$.time.temporal.s sVar) {
        return AbstractC0335i.e(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC0335i.m(this, tVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC0335i.d(this, chronoZonedDateTime);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoZonedDateTime N(ZoneId zoneId, j$.time.y yVar, C0333g c0333g) {
        Objects.requireNonNull(c0333g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof j$.time.y) {
            return new l(zoneId, (j$.time.y) zoneId, c0333g);
        }
        j$.time.zone.f N3 = zoneId.N();
        LocalDateTime O3 = LocalDateTime.O(c0333g);
        List g3 = N3.g(O3);
        if (g3.size() == 1) {
            yVar = (j$.time.y) g3.get(0);
        } else if (g3.size() == 0) {
            j$.time.zone.b f3 = N3.f(O3);
            c0333g = c0333g.Q(f3.q().r());
            yVar = f3.r();
        } else if (yVar == null || !g3.contains(yVar)) {
            yVar = (j$.time.y) g3.get(0);
        }
        Objects.requireNonNull(yVar, "offset");
        return new l(zoneId, yVar, c0333g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l O(m mVar, Instant instant, ZoneId zoneId) {
        j$.time.y d3 = zoneId.N().d(instant);
        Objects.requireNonNull(d3, "offset");
        return new l(zoneId, d3, (C0333g) mVar.s(LocalDateTime.c0(instant.O(), instant.P(), d3)));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) sVar).m();
            }
            return ((C0333g) D()).r(sVar);
        }
        return sVar.z(this);
    }

    static l A(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        String l3 = mVar.l();
        String l4 = lVar.a().l();
        throw new ClassCastException("Chronology mismatch, required: " + l3 + ", actual: " + l4);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = AbstractC0336j.f6460a[((j$.time.temporal.a) sVar).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return h().T();
                }
                return ((C0333g) D()).v(sVar);
            }
            return M();
        }
        return sVar.q(this);
    }

    private l(ZoneId zoneId, j$.time.y yVar, C0333g c0333g) {
        Objects.requireNonNull(c0333g, "dateTime");
        this.f6462a = c0333g;
        Objects.requireNonNull(yVar, "offset");
        this.f6463b = yVar;
        Objects.requireNonNull(zoneId, "zone");
        this.f6464c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.y h() {
        return this.f6463b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC0328b c() {
        return ((C0333g) D()).c();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.k b() {
        return ((C0333g) D()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC0331e D() {
        return this.f6462a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId t() {
        return this.f6464c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final m a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime i(ZoneId zoneId) {
        return N(zoneId, this.f6463b, this.f6462a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return (sVar instanceof j$.time.temporal.a) || (sVar != null && sVar.r(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            int i3 = AbstractC0337k.f6461a[aVar.ordinal()];
            if (i3 != 1) {
                ZoneId zoneId = this.f6464c;
                C0333g c0333g = this.f6462a;
                if (i3 == 2) {
                    j$.time.y W2 = j$.time.y.W(aVar.N(j3));
                    c0333g.getClass();
                    return O(a(), Instant.S(AbstractC0335i.o(c0333g, W2), c0333g.b().T()), zoneId);
                }
                return N(zoneId, this.f6463b, c0333g.d(j3, sVar));
            }
            return e(j3 - AbstractC0335i.p(this), j$.time.temporal.b.SECONDS);
        }
        return A(a(), sVar.v(this, j3));
    }

    @Override // j$.time.temporal.m
    /* renamed from: P */
    public final ChronoZonedDateTime e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return A(a(), this.f6462a.e(j3, uVar).A(this));
        }
        return A(a(), uVar.m(this, j3));
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f6462a);
        objectOutput.writeObject(this.f6463b);
        objectOutput.writeObject(this.f6464c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && AbstractC0335i.d(this, (ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.f6462a.hashCode() ^ this.f6463b.hashCode()) ^ Integer.rotateLeft(this.f6464c.hashCode(), 3);
    }

    public final String toString() {
        String c0333g = this.f6462a.toString();
        j$.time.y yVar = this.f6463b;
        String str = c0333g + yVar.toString();
        ZoneId zoneId = this.f6464c;
        if (yVar != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(j$.time.g gVar) {
        return A(a(), gVar.A(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return A(a(), j$.time.temporal.n.b(this, j3, bVar));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.S(M(), b().T());
    }
}

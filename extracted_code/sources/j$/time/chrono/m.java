package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public interface m extends Comparable {
    InterfaceC0328b E(int i3, int i4, int i5);

    InterfaceC0328b G(Map map, j$.time.format.y yVar);

    j$.time.temporal.w H(j$.time.temporal.a aVar);

    ChronoZonedDateTime I(Instant instant, ZoneId zoneId);

    List J();

    n L(int i3);

    boolean equals(Object obj);

    int g(n nVar, int i3);

    int hashCode();

    InterfaceC0328b k(long j3);

    String l();

    InterfaceC0328b p(TemporalAccessor temporalAccessor);

    InterfaceC0331e s(LocalDateTime localDateTime);

    String toString();

    String u();

    InterfaceC0328b x(int i3, int i4);
}

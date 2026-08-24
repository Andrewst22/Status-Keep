package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0328b;
/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC0328b> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    InterfaceC0331e D();

    long M();

    m a();

    j$.time.k b();

    InterfaceC0328b c();

    j$.time.y h();

    ChronoZonedDateTime i(ZoneId zoneId);

    boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime);

    ZoneId t();

    Instant toInstant();
}

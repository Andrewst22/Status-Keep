package j$.time.temporal;

import j$.time.Duration;
/* loaded from: classes2.dex */
public enum b implements u {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f6611a;

    static {
        Duration duration = Duration.f6420c;
        Duration.z(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.f6611a = str;
    }

    @Override // j$.time.temporal.u
    public final m m(m mVar, long j3) {
        return mVar.e(j3, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6611a;
    }
}

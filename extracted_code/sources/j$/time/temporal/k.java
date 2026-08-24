package j$.time.temporal;

import j$.time.chrono.AbstractC0335i;
import j$.time.format.y;
import java.util.HashMap;
/* loaded from: classes2.dex */
enum k implements s {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);
    
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a  reason: collision with root package name */
    private final transient String f6621a;

    /* renamed from: b  reason: collision with root package name */
    private final transient w f6622b;

    /* renamed from: c  reason: collision with root package name */
    private final transient long f6623c;

    @Override // j$.time.temporal.s
    public final boolean A() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j3) {
        this.f6621a = str;
        this.f6622b = w.j((-365243219162L) + j3, 365241780471L + j3);
        this.f6623c = j3;
    }

    @Override // j$.time.temporal.s
    public final w m() {
        return this.f6622b;
    }

    @Override // j$.time.temporal.s
    public final boolean r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.s
    public final w z(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.f(a.EPOCH_DAY)) {
            throw new RuntimeException("Unsupported field: " + this);
        }
        return this.f6622b;
    }

    @Override // j$.time.temporal.s
    public final long q(TemporalAccessor temporalAccessor) {
        return temporalAccessor.v(a.EPOCH_DAY) + this.f6623c;
    }

    @Override // j$.time.temporal.s
    public final m v(m mVar, long j3) {
        if (!this.f6622b.i(j3)) {
            throw new RuntimeException("Invalid value: " + this.f6621a + " " + j3);
        }
        return mVar.d(j$.com.android.tools.r8.a.j(j3, this.f6623c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.s
    public final TemporalAccessor o(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
        long longValue = ((Long) hashMap.remove(this)).longValue();
        j$.time.chrono.m q3 = AbstractC0335i.q(temporalAccessor);
        y yVar2 = y.LENIENT;
        long j3 = this.f6623c;
        if (yVar == yVar2) {
            return q3.k(j$.com.android.tools.r8.a.j(longValue, j3));
        }
        this.f6622b.b(longValue, this);
        return q3.k(longValue - j3);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6621a;
    }
}

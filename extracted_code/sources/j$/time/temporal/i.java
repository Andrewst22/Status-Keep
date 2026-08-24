package j$.time.temporal;

import j$.time.Duration;
/* loaded from: classes2.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f6616a;

    static {
        Duration duration = Duration.f6420c;
    }

    i(String str) {
        this.f6616a = str;
    }

    @Override // j$.time.temporal.u
    public final m m(m mVar, long j3) {
        int i3 = c.f6612a[ordinal()];
        if (i3 == 1) {
            s sVar = j.f6619c;
            return mVar.d(j$.com.android.tools.r8.a.h(mVar.o(sVar), j3), sVar);
        } else if (i3 == 2) {
            return mVar.e(j3 / 4, b.YEARS).e((j3 % 4) * 3, b.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6616a;
    }
}

package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.chrono.AbstractC0335i;
import j$.time.format.y;
import java.util.HashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class h implements s {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f6613a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ h[] f6614b;

    @Override // j$.time.temporal.s
    public final boolean A() {
        return true;
    }

    public /* synthetic */ TemporalAccessor o(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
        return null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f6614b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.s
            public final w m() {
                return w.k(90L, 92L);
            }

            @Override // j$.time.temporal.s
            public final boolean r(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(a.DAY_OF_YEAR) && temporalAccessor.f(a.MONTH_OF_YEAR) && temporalAccessor.f(a.YEAR)) {
                    s sVar = j.f6617a;
                    if (AbstractC0335i.q(temporalAccessor).equals(j$.time.chrono.t.f6484d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final w z(TemporalAccessor temporalAccessor) {
                if (!r(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                long v3 = temporalAccessor.v(h.QUARTER_OF_YEAR);
                if (v3 == 1) {
                    long v4 = temporalAccessor.v(a.YEAR);
                    j$.time.chrono.t.f6484d.getClass();
                    return j$.time.chrono.t.O(v4) ? w.j(1L, 91L) : w.j(1L, 90L);
                } else if (v3 == 2) {
                    return w.j(1L, 91L);
                } else {
                    if (v3 == 3 || v3 == 4) {
                        return w.j(1L, 92L);
                    }
                    return m();
                }
            }

            @Override // j$.time.temporal.s
            public final long q(TemporalAccessor temporalAccessor) {
                int[] iArr;
                if (!r(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: DayOfQuarter");
                }
                int o3 = temporalAccessor.o(a.DAY_OF_YEAR);
                int o4 = temporalAccessor.o(a.MONTH_OF_YEAR);
                long v3 = temporalAccessor.v(a.YEAR);
                iArr = h.f6613a;
                int i3 = (o4 - 1) / 3;
                j$.time.chrono.t.f6484d.getClass();
                return o3 - iArr[i3 + (j$.time.chrono.t.O(v3) ? 4 : 0)];
            }

            @Override // j$.time.temporal.s
            public final m v(m mVar, long j3) {
                long q3 = q(mVar);
                m().b(j3, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j3 - q3) + mVar.v(aVar), aVar);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.s
            public final TemporalAccessor o(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
                long j3;
                j$.time.g gVar;
                a aVar = a.YEAR;
                Long l3 = (Long) hashMap.get(aVar);
                s sVar = h.QUARTER_OF_YEAR;
                Long l4 = (Long) hashMap.get(sVar);
                if (l3 == null || l4 == null) {
                    return null;
                }
                int N3 = aVar.N(l3.longValue());
                long longValue = ((Long) hashMap.get(h.DAY_OF_QUARTER)).longValue();
                s sVar2 = j.f6617a;
                if (AbstractC0335i.q(temporalAccessor).equals(j$.time.chrono.t.f6484d)) {
                    if (yVar == y.LENIENT) {
                        gVar = j$.time.g.a0(N3, 1, 1).g0(j$.com.android.tools.r8.a.g(j$.com.android.tools.r8.a.j(l4.longValue(), 1L), 3));
                        j3 = j$.com.android.tools.r8.a.j(longValue, 1L);
                    } else {
                        j$.time.g a02 = j$.time.g.a0(N3, ((sVar.m().a(l4.longValue(), sVar) - 1) * 3) + 1, 1);
                        if (longValue < 1 || longValue > 90) {
                            if (yVar == y.STRICT) {
                                z(a02).b(longValue, this);
                            } else {
                                m().b(longValue, this);
                            }
                        }
                        j3 = longValue - 1;
                        gVar = a02;
                    }
                    hashMap.remove(this);
                    hashMap.remove(aVar);
                    hashMap.remove(sVar);
                    return gVar.f0(j3);
                }
                throw new RuntimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.s
            public final w m() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.s
            public final boolean r(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(a.MONTH_OF_YEAR)) {
                    s sVar = j.f6617a;
                    if (AbstractC0335i.q(temporalAccessor).equals(j$.time.chrono.t.f6484d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final long q(TemporalAccessor temporalAccessor) {
                if (!r(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.v(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.s
            public final w z(TemporalAccessor temporalAccessor) {
                if (!r(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: QuarterOfYear");
                }
                return m();
            }

            @Override // j$.time.temporal.s
            public final m v(m mVar, long j3) {
                long q3 = q(mVar);
                m().b(j3, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j3 - q3) * 3) + mVar.v(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.s
            public final w m() {
                return w.k(52L, 53L);
            }

            @Override // j$.time.temporal.s
            public final boolean r(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(a.EPOCH_DAY)) {
                    s sVar = j.f6617a;
                    if (AbstractC0335i.q(temporalAccessor).equals(j$.time.chrono.t.f6484d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final w z(TemporalAccessor temporalAccessor) {
                if (!r(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.R(j$.time.g.P(temporalAccessor));
            }

            @Override // j$.time.temporal.s
            public final long q(TemporalAccessor temporalAccessor) {
                if (!r(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.O(j$.time.g.P(temporalAccessor));
            }

            @Override // j$.time.temporal.s
            public final m v(m mVar, long j3) {
                m().b(j3, this);
                return mVar.e(j$.com.android.tools.r8.a.j(j3, q(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.h, j$.time.temporal.s
            public final TemporalAccessor o(HashMap hashMap, TemporalAccessor temporalAccessor, y yVar) {
                j$.time.g d3;
                long j3;
                long j4;
                s sVar = h.WEEK_BASED_YEAR;
                Long l3 = (Long) hashMap.get(sVar);
                a aVar = a.DAY_OF_WEEK;
                Long l4 = (Long) hashMap.get(aVar);
                if (l3 == null || l4 == null) {
                    return null;
                }
                int a3 = sVar.m().a(l3.longValue(), sVar);
                long longValue = ((Long) hashMap.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                s sVar2 = j.f6617a;
                if (AbstractC0335i.q(temporalAccessor).equals(j$.time.chrono.t.f6484d)) {
                    j$.time.g a02 = j$.time.g.a0(a3, 1, 4);
                    if (yVar == y.LENIENT) {
                        long longValue2 = l4.longValue();
                        if (longValue2 > 7) {
                            long j5 = longValue2 - 1;
                            a02 = a02.h0(j5 / 7);
                            j4 = j5 % 7;
                        } else {
                            j3 = 1;
                            if (longValue2 < 1) {
                                a02 = a02.h0(j$.com.android.tools.r8.a.j(longValue2, 7L) / 7);
                                j4 = (longValue2 + 6) % 7;
                            }
                            d3 = a02.h0(j$.com.android.tools.r8.a.j(longValue, j3)).d(longValue2, aVar);
                        }
                        j3 = 1;
                        longValue2 = j4 + 1;
                        d3 = a02.h0(j$.com.android.tools.r8.a.j(longValue, j3)).d(longValue2, aVar);
                    } else {
                        int N3 = aVar.N(l4.longValue());
                        if (longValue < 1 || longValue > 52) {
                            if (yVar == y.STRICT) {
                                h.R(a02).b(longValue, this);
                            } else {
                                m().b(longValue, this);
                            }
                        }
                        d3 = a02.h0(longValue - 1).d(N3, aVar);
                    }
                    hashMap.remove(this);
                    hashMap.remove(sVar);
                    hashMap.remove(aVar);
                    return d3;
                }
                throw new RuntimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.s
            public final w m() {
                return a.YEAR.m();
            }

            @Override // j$.time.temporal.s
            public final boolean r(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.f(a.EPOCH_DAY)) {
                    s sVar = j.f6617a;
                    if (AbstractC0335i.q(temporalAccessor).equals(j$.time.chrono.t.f6484d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.s
            public final long q(TemporalAccessor temporalAccessor) {
                int S3;
                if (!r(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                S3 = h.S(j$.time.g.P(temporalAccessor));
                return S3;
            }

            @Override // j$.time.temporal.s
            public final w z(TemporalAccessor temporalAccessor) {
                if (!r(temporalAccessor)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                return m();
            }

            @Override // j$.time.temporal.s
            public final m v(m mVar, long j3) {
                int T3;
                if (!r(mVar)) {
                    throw new RuntimeException("Unsupported field: WeekBasedYear");
                }
                int a3 = a.YEAR.m().a(j3, h.WEEK_BASED_YEAR);
                j$.time.g P3 = j$.time.g.P(mVar);
                a aVar = a.DAY_OF_WEEK;
                int o3 = P3.o(aVar);
                int O3 = h.O(P3);
                if (O3 == 53) {
                    T3 = h.T(a3);
                    if (T3 == 52) {
                        O3 = 52;
                    }
                }
                j$.time.g a02 = j$.time.g.a0(a3, 1, 4);
                return mVar.q(a02.f0(((O3 - 1) * 7) + (o3 - a02.o(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f6614b = new h[]{hVar, hVar2, hVar3, hVar4};
        f6613a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w R(j$.time.g gVar) {
        return w.j(1L, T(S(gVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int T(int i3) {
        j$.time.g a02 = j$.time.g.a0(i3, 1, 1);
        if (a02.S() != DayOfWeek.THURSDAY) {
            return (a02.S() == DayOfWeek.WEDNESDAY && a02.X()) ? 53 : 52;
        }
        return 53;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O(j$.time.g gVar) {
        int ordinal = gVar.S().ordinal();
        int i3 = 1;
        int T3 = gVar.T() - 1;
        int i4 = (3 - ordinal) + T3;
        int i5 = i4 - ((i4 / 7) * 7);
        int i6 = i5 - 3;
        if (i6 < -3) {
            i6 = i5 + 4;
        }
        if (T3 < i6) {
            return (int) w.j(1L, T(S(gVar.m0(180).i0(-1L)))).d();
        }
        int i7 = ((T3 - i6) / 7) + 1;
        if (i7 != 53 || i6 == -3 || (i6 == -2 && gVar.X())) {
            i3 = i7;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int S(j$.time.g gVar) {
        int V3 = gVar.V();
        int T3 = gVar.T();
        if (T3 <= 3) {
            return T3 - gVar.S().ordinal() < -2 ? V3 - 1 : V3;
        } else if (T3 >= 363) {
            return ((T3 - 363) - (gVar.X() ? 1 : 0)) - gVar.S().ordinal() >= 0 ? V3 + 1 : V3;
        } else {
            return V3;
        }
    }
}

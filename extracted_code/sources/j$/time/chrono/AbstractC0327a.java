package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* renamed from: j$.time.chrono.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0327a implements m {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f6448a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f6449b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f6450c = 0;

    public abstract /* synthetic */ InterfaceC0328b o();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return l().compareTo(((m) obj).l());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m r(AbstractC0327a abstractC0327a, String str) {
        String u3;
        m mVar = (m) f6448a.putIfAbsent(str, abstractC0327a);
        if (mVar == null && (u3 = abstractC0327a.u()) != null) {
            f6449b.putIfAbsent(u3, abstractC0327a);
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.chrono.m q(java.lang.String r4) {
        /*
            java.lang.String r0 = "id"
            java.util.Objects.requireNonNull(r4, r0)
        L5:
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.chrono.AbstractC0327a.f6448a
            java.lang.Object r1 = r0.get(r4)
            j$.time.chrono.m r1 = (j$.time.chrono.m) r1
            if (r1 != 0) goto L17
            j$.util.concurrent.ConcurrentHashMap r1 = j$.time.chrono.AbstractC0327a.f6449b
            java.lang.Object r1 = r1.get(r4)
            j$.time.chrono.m r1 = (j$.time.chrono.m) r1
        L17:
            if (r1 == 0) goto L1a
            return r1
        L1a:
            java.lang.String r1 = "ISO"
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L84
            j$.time.chrono.p r0 = j$.time.chrono.p.f6466o
            java.lang.String r2 = r0.l()
            r(r0, r2)
            j$.time.chrono.w r0 = j$.time.chrono.w.f6487d
            java.lang.String r2 = r0.l()
            r(r0, r2)
            j$.time.chrono.B r0 = j$.time.chrono.B.f6437d
            java.lang.String r2 = r0.l()
            r(r0, r2)
            j$.time.chrono.H r0 = j$.time.chrono.H.f6444d
            java.lang.String r2 = r0.l()
            r(r0, r2)
            r0 = 0
            j$.time.chrono.a[] r0 = new j$.time.chrono.AbstractC0327a[r0]     // Catch: java.lang.Throwable -> L79
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L79
        L51:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r0.next()
            j$.time.chrono.a r2 = (j$.time.chrono.AbstractC0327a) r2
            java.lang.String r3 = r2.l()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L51
            java.lang.String r3 = r2.l()
            r(r2, r3)
            goto L51
        L6f:
            j$.time.chrono.t r0 = j$.time.chrono.t.f6484d
            java.lang.String r1 = r0.l()
            r(r0, r1)
            goto L5
        L79:
            r4 = move-exception
            java.util.ServiceConfigurationError r0 = new java.util.ServiceConfigurationError
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1, r4)
            throw r0
        L84:
            java.lang.Class<j$.time.chrono.m> r0 = j$.time.chrono.m.class
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0)
            java.util.Iterator r0 = r0.iterator()
        L8e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            j$.time.chrono.m r1 = (j$.time.chrono.m) r1
            java.lang.String r2 = r1.l()
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lae
            java.lang.String r2 = r1.u()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L8e
        Lae:
            return r1
        Laf:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Unknown chronology: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.AbstractC0327a.q(java.lang.String):j$.time.chrono.m");
    }

    @Override // j$.time.chrono.m
    public InterfaceC0328b G(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return k(((Long) map.remove(aVar)).longValue());
        }
        z(map, yVar);
        InterfaceC0328b N3 = N(map, yVar);
        if (N3 != null) {
            return N3;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (map.containsKey(aVar2)) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                    return A(map, yVar);
                }
                j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar5)) {
                        int a3 = H(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (yVar == j$.time.format.y.LENIENT) {
                            long j3 = j$.com.android.tools.r8.a.j(((Long) map.remove(aVar3)).longValue(), 1L);
                            long j4 = j$.com.android.tools.r8.a.j(((Long) map.remove(aVar4)).longValue(), 1L);
                            return E(a3, 1, 1).e(j3, (j$.time.temporal.u) j$.time.temporal.b.MONTHS).e(j4, (j$.time.temporal.u) j$.time.temporal.b.WEEKS).e(j$.com.android.tools.r8.a.j(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                        }
                        int a4 = H(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        int a5 = H(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                        InterfaceC0328b e2 = E(a3, a4, 1).e((H(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((a5 - 1) * 7), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                        if (yVar != j$.time.format.y.STRICT || e2.o(aVar3) == a4) {
                            return e2;
                        }
                        throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int a6 = H(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (yVar == j$.time.format.y.LENIENT) {
                            return v(E(a6, 1, 1), j$.com.android.tools.r8.a.j(((Long) map.remove(aVar3)).longValue(), 1L), j$.com.android.tools.r8.a.j(((Long) map.remove(aVar4)).longValue(), 1L), j$.com.android.tools.r8.a.j(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int a7 = H(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        InterfaceC0328b j5 = E(a6, a7, 1).e((H(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.u) j$.time.temporal.b.DAYS).j(new j$.time.temporal.p(DayOfWeek.N(H(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (yVar != j$.time.format.y.STRICT || j5.o(aVar3) == a7) {
                            return j5;
                        }
                        throw new RuntimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                }
            }
            j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar7)) {
                int a8 = H(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (yVar == j$.time.format.y.LENIENT) {
                    return x(a8, 1).e(j$.com.android.tools.r8.a.j(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                }
                return x(a8, H(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(aVar8)) {
                j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(aVar9)) {
                    int a9 = H(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        long j6 = j$.com.android.tools.r8.a.j(((Long) map.remove(aVar8)).longValue(), 1L);
                        return x(a9, 1).e(j6, (j$.time.temporal.u) j$.time.temporal.b.WEEKS).e(j$.com.android.tools.r8.a.j(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                    }
                    int a10 = H(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
                    InterfaceC0328b e3 = x(a9, 1).e((H(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((a10 - 1) * 7), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                    if (yVar != j$.time.format.y.STRICT || e3.o(aVar2) == a9) {
                        return e3;
                    }
                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
                }
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar10)) {
                    int a11 = H(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return v(x(a11, 1), 0L, j$.com.android.tools.r8.a.j(((Long) map.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.j(((Long) map.remove(aVar10)).longValue(), 1L));
                    }
                    InterfaceC0328b j7 = x(a11, 1).e((H(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.u) j$.time.temporal.b.DAYS).j(new j$.time.temporal.p(DayOfWeek.N(H(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                    if (yVar != j$.time.format.y.STRICT || j7.o(aVar2) == a11) {
                        return j7;
                    }
                    throw new RuntimeException("Strict mode rejected resolved date as it is in a different year");
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public InterfaceC0331e s(LocalDateTime localDateTime) {
        try {
            return p(localDateTime).y(j$.time.k.P(localDateTime));
        } catch (j$.time.c e2) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e2);
        }
    }

    void z(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.O(l3.longValue());
            }
            InterfaceC0328b d3 = o().d(1L, (j$.time.temporal.s) j$.time.temporal.a.DAY_OF_MONTH).d(l3.longValue(), (j$.time.temporal.s) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            m(map, aVar2, d3.o(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            m(map, aVar3, d3.o(aVar3));
        }
    }

    InterfaceC0328b N(Map map, j$.time.format.y yVar) {
        int i3;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            Long l4 = (Long) map.remove(aVar2);
            if (yVar != j$.time.format.y.LENIENT) {
                i3 = H(aVar).a(l3.longValue(), aVar);
            } else {
                long longValue = l3.longValue();
                int i4 = (int) longValue;
                if (longValue != i4) {
                    throw new ArithmeticException();
                }
                i3 = i4;
            }
            if (l4 != null) {
                m(map, j$.time.temporal.a.YEAR, g(L(H(aVar2).a(l4.longValue(), aVar2)), i3));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar3)) {
                m(map, aVar3, g(x(H(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).B(), i3));
                return null;
            } else if (yVar == j$.time.format.y.STRICT) {
                map.put(aVar, l3);
                return null;
            } else {
                List J3 = J();
                if (J3.isEmpty()) {
                    m(map, aVar3, i3);
                    return null;
                }
                m(map, aVar3, g((n) J3.get(J3.size() - 1), i3));
                return null;
            }
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (map.containsKey(aVar4)) {
            H(aVar4).b(((Long) map.get(aVar4)).longValue(), aVar4);
            return null;
        }
        return null;
    }

    InterfaceC0328b A(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a3 = H(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (yVar == j$.time.format.y.LENIENT) {
            long j3 = j$.com.android.tools.r8.a.j(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return E(a3, 1, 1).e(j3, (j$.time.temporal.u) j$.time.temporal.b.MONTHS).e(j$.com.android.tools.r8.a.j(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a4 = H(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a5 = H(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (yVar == j$.time.format.y.SMART) {
            try {
                return E(a3, a4, a5);
            } catch (j$.time.c unused) {
                return E(a3, a4, 1).j(new j$.time.temporal.q(0));
            }
        }
        return E(a3, a4, a5);
    }

    static InterfaceC0328b v(InterfaceC0328b interfaceC0328b, long j3, long j4, long j5) {
        long j6;
        InterfaceC0328b e2 = interfaceC0328b.e(j3, (j$.time.temporal.u) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        InterfaceC0328b e3 = e2.e(j4, (j$.time.temporal.u) bVar);
        if (j5 > 7) {
            long j7 = j5 - 1;
            e3 = e3.e(j7 / 7, (j$.time.temporal.u) bVar);
            j6 = j7 % 7;
        } else {
            if (j5 < 1) {
                e3 = e3.e(j$.com.android.tools.r8.a.j(j5, 7L) / 7, (j$.time.temporal.u) bVar);
                j6 = (j5 + 6) % 7;
            }
            return e3.j(new j$.time.temporal.p(DayOfWeek.N((int) j5).getValue(), 0));
        }
        j5 = j6 + 1;
        return e3.j(new j$.time.temporal.p(DayOfWeek.N((int) j5).getValue(), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(Map map, j$.time.temporal.a aVar, long j3) {
        Long l3 = (Long) map.get(aVar);
        if (l3 != null && l3.longValue() != j3) {
            throw new RuntimeException("Conflict found: " + aVar + " " + l3 + " differs from " + aVar + " " + j3);
        }
        map.put(aVar, Long.valueOf(j3));
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0327a) && l().compareTo(((AbstractC0327a) obj).l()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ l().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return l();
    }
}

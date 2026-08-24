package j$.time;

import j$.time.temporal.TemporalAccessor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DayOfWeek implements TemporalAccessor, j$.time.temporal.o {
    public static final DayOfWeek FRIDAY;
    public static final DayOfWeek MONDAY;
    public static final DayOfWeek SATURDAY;
    public static final DayOfWeek SUNDAY;
    public static final DayOfWeek THURSDAY;
    public static final DayOfWeek TUESDAY;
    public static final DayOfWeek WEDNESDAY;

    /* renamed from: a  reason: collision with root package name */
    private static final DayOfWeek[] f6418a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ DayOfWeek[] f6419b;

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) f6419b.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v0, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    static {
        ?? r7 = new Enum("MONDAY", 0);
        MONDAY = r7;
        ?? r8 = new Enum("TUESDAY", 1);
        TUESDAY = r8;
        ?? r9 = new Enum("WEDNESDAY", 2);
        WEDNESDAY = r9;
        ?? r10 = new Enum("THURSDAY", 3);
        THURSDAY = r10;
        ?? r11 = new Enum("FRIDAY", 4);
        FRIDAY = r11;
        ?? r12 = new Enum("SATURDAY", 5);
        SATURDAY = r12;
        ?? r13 = new Enum("SUNDAY", 6);
        SUNDAY = r13;
        f6419b = new DayOfWeek[]{r7, r8, r9, r10, r11, r12, r13};
        f6418a = values();
    }

    public static DayOfWeek N(int i3) {
        if (i3 < 1 || i3 > 7) {
            throw new RuntimeException("Invalid value for DayOfWeek: " + i3);
        }
        return f6418a[i3 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.DAY_OF_WEEK : sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return sVar.m();
        }
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", sVar));
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.DAYS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}

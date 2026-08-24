package j$.time;

import j$.time.chrono.AbstractC0335i;
import j$.time.temporal.TemporalAccessor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m implements TemporalAccessor, j$.time.temporal.o {
    public static final m APRIL;
    public static final m AUGUST;
    public static final m DECEMBER;
    public static final m FEBRUARY;
    public static final m JANUARY;
    public static final m JULY;
    public static final m JUNE;
    public static final m MARCH;
    public static final m MAY;
    public static final m NOVEMBER;
    public static final m OCTOBER;
    public static final m SEPTEMBER;

    /* renamed from: a  reason: collision with root package name */
    private static final m[] f6591a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ m[] f6592b;

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f6592b.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, j$.time.m] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, j$.time.m] */
    static {
        ?? r12 = new Enum("JANUARY", 0);
        JANUARY = r12;
        ?? r13 = new Enum("FEBRUARY", 1);
        FEBRUARY = r13;
        ?? r14 = new Enum("MARCH", 2);
        MARCH = r14;
        ?? r15 = new Enum("APRIL", 3);
        APRIL = r15;
        ?? r9 = new Enum("MAY", 4);
        MAY = r9;
        ?? r8 = new Enum("JUNE", 5);
        JUNE = r8;
        ?? r7 = new Enum("JULY", 6);
        JULY = r7;
        ?? r6 = new Enum("AUGUST", 7);
        AUGUST = r6;
        ?? r5 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r5;
        ?? r4 = new Enum("OCTOBER", 9);
        OCTOBER = r4;
        ?? r3 = new Enum("NOVEMBER", 10);
        NOVEMBER = r3;
        ?? r22 = new Enum("DECEMBER", 11);
        DECEMBER = r22;
        f6592b = new m[]{r12, r13, r14, r15, r9, r8, r7, r6, r5, r4, r3, r22};
        f6591a = values();
    }

    public static m Q(int i3) {
        if (i3 < 1 || i3 > 12) {
            throw new RuntimeException("Invalid value for MonthOfYear: " + i3);
        }
        return f6591a[i3 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.MONTH_OF_YEAR : sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return sVar.m();
        }
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", sVar));
        }
        return sVar.q(this);
    }

    public final m R() {
        int i3 = ((int) 1) + 12;
        return f6591a[(i3 + ordinal()) % 12];
    }

    public final int O(boolean z3) {
        int i3 = l.f6590a[ordinal()];
        return i3 != 1 ? (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31 : z3 ? 29 : 28;
    }

    public final int P() {
        int i3 = l.f6590a[ordinal()];
        if (i3 != 1) {
            return (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int N(boolean z3) {
        switch (l.f6590a[ordinal()]) {
            case 1:
                return 32;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return (z3 ? 1 : 0) + 91;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return (z3 ? 1 : 0) + 152;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return (z3 ? 1 : 0) + 244;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return (z3 ? 1 : 0) + 305;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 1;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return (z3 ? 1 : 0) + 60;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return (z3 ? 1 : 0) + 121;
            case 9:
                return (z3 ? 1 : 0) + 182;
            case 10:
                return (z3 ? 1 : 0) + 213;
            case 11:
                return (z3 ? 1 : 0) + 274;
            default:
                return (z3 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.t.f6484d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        if (!AbstractC0335i.q(mVar).equals(j$.time.chrono.t.f6484d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        return mVar.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}

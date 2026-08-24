package j$.time;

import j$.time.chrono.AbstractC0335i;
import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Instant f6423c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a  reason: collision with root package name */
    private final long f6424a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6425b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int c3 = j$.com.android.tools.r8.a.c(this.f6424a, instant2.f6424a);
        return c3 != 0 ? c3 : this.f6425b - instant2.f6425b;
    }

    static {
        S(-31557014167219200L, 0L);
        S(31556889864403199L, 999999999L);
    }

    public static Instant R(long j3) {
        return N(j3, 0);
    }

    public static Instant S(long j3, long j4) {
        return N(j$.com.android.tools.r8.a.h(j3, j$.com.android.tools.r8.a.d(j4, 1000000000L)), (int) j$.com.android.tools.r8.a.i(j4, 1000000000L));
    }

    public static Instant Q(long j3) {
        long j4 = 1000;
        return N(j$.com.android.tools.r8.a.d(j3, j4), ((int) j$.com.android.tools.r8.a.i(j3, j4)) * 1000000);
    }

    private static Instant N(long j3, int i3) {
        if ((i3 | j3) == 0) {
            return f6423c;
        }
        if (j3 < -31557014167219200L || j3 > 31556889864403199L) {
            throw new RuntimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j3, i3);
    }

    private Instant(long j3, int i3) {
        this.f6424a = j3;
        this.f6425b = i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.NANO_OF_SECOND || sVar == j$.time.temporal.a.MICRO_OF_SECOND || sVar == j$.time.temporal.a.MILLI_OF_SECOND : sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = e.f6498a[((j$.time.temporal.a) sVar).ordinal()];
            int i4 = this.f6425b;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        return i4 / 1000000;
                    }
                    if (i3 == 4) {
                        j$.time.temporal.a.INSTANT_SECONDS.N(this.f6424a);
                    }
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
                }
                return i4 / 1000;
            }
            return i4;
        }
        return j$.time.temporal.n.d(this, sVar).a(sVar.q(this), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        int i3;
        if (sVar instanceof j$.time.temporal.a) {
            int i4 = e.f6498a[((j$.time.temporal.a) sVar).ordinal()];
            int i5 = this.f6425b;
            if (i4 != 1) {
                if (i4 == 2) {
                    i3 = i5 / 1000;
                } else if (i4 != 3) {
                    if (i4 == 4) {
                        return this.f6424a;
                    }
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
                } else {
                    i3 = i5 / 1000000;
                }
                return i3;
            }
            return i5;
        }
        return sVar.q(this);
    }

    public final long O() {
        return this.f6424a;
    }

    public final int P() {
        return this.f6425b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            aVar.O(j3);
            int i3 = e.f6498a[aVar.ordinal()];
            int i4 = this.f6425b;
            long j4 = this.f6424a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i5 = ((int) j3) * 1000;
                    if (i5 != i4) {
                        return N(j4, i5);
                    }
                } else if (i3 == 3) {
                    int i6 = ((int) j3) * 1000000;
                    if (i6 != i4) {
                        return N(j4, i6);
                    }
                } else if (i3 != 4) {
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
                } else {
                    if (j3 != j4) {
                        return N(j3, i4);
                    }
                }
            } else if (j3 != i4) {
                return N(j4, (int) j3);
            }
            return this;
        }
        return (Instant) sVar.v(this, j3);
    }

    @Override // j$.time.temporal.m
    /* renamed from: U */
    public final Instant e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (e.f6499b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return T(0L, j3);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return T(j3 / 1000000, (j3 % 1000000) * 1000);
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return T(j3 / 1000, (j3 % 1000) * 1000000);
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return T(j3, 0L);
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return T(j$.com.android.tools.r8.a.g(j3, 60), 0L);
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return T(j$.com.android.tools.r8.a.g(j3, 3600), 0L);
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return T(j$.com.android.tools.r8.a.g(j3, 43200), 0L);
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    return T(j$.com.android.tools.r8.a.g(j3, 86400), 0L);
                default:
                    throw new RuntimeException("Unsupported unit: " + uVar);
            }
        }
        return (Instant) uVar.m(this, j3);
    }

    private Instant T(long j3, long j4) {
        if ((j3 | j4) == 0) {
            return this;
        }
        return S(j$.com.android.tools.r8.a.h(j$.com.android.tools.r8.a.h(this.f6424a, j3), j4 / 1000000000), this.f6425b + (j4 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.f() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        return tVar.g(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(this.f6424a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f6425b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        int i3 = this.f6425b;
        long j3 = this.f6424a;
        if (j3 < 0 && i3 > 0) {
            return j$.com.android.tools.r8.a.h(j$.com.android.tools.r8.a.g(j3 + 1, 1000), (i3 / 1000000) - 1000);
        }
        return j$.com.android.tools.r8.a.h(j$.com.android.tools.r8.a.g(j3, 1000), i3 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.f6424a == instant.f6424a && this.f6425b == instant.f6425b;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f6424a;
        return (this.f6425b * 51) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f6504g.format(this);
    }

    private Object writeReplace() {
        return new t((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(DataOutput dataOutput) {
        dataOutput.writeLong(this.f6424a);
        dataOutput.writeInt(this.f6425b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(g gVar) {
        return (Instant) AbstractC0335i.a(gVar, this);
    }
}

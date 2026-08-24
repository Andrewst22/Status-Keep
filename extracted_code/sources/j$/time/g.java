package j$.time;

import j$.time.chrono.AbstractC0335i;
import j$.time.chrono.InterfaceC0328b;
import j$.time.chrono.InterfaceC0331e;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class g implements j$.time.temporal.m, j$.time.temporal.o, InterfaceC0328b, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final g f6574d = a0(-999999999, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    public static final g f6575e = a0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a  reason: collision with root package name */
    private final int f6576a;

    /* renamed from: b  reason: collision with root package name */
    private final short f6577b;

    /* renamed from: c  reason: collision with root package name */
    private final short f6578c;

    static {
        a0(1970, 1, 1);
    }

    public static g b0(int i3, m mVar, int i4) {
        j$.time.temporal.a.YEAR.O(i3);
        j$.time.temporal.a.DAY_OF_MONTH.O(i4);
        return O(i3, mVar.getValue(), i4);
    }

    public static g a0(int i3, int i4, int i5) {
        j$.time.temporal.a.YEAR.O(i3);
        j$.time.temporal.a.MONTH_OF_YEAR.O(i4);
        j$.time.temporal.a.DAY_OF_MONTH.O(i5);
        return O(i3, i4, i5);
    }

    public static g d0(int i3, int i4) {
        long j3 = i3;
        j$.time.temporal.a.YEAR.O(j3);
        j$.time.temporal.a.DAY_OF_YEAR.O(i4);
        j$.time.chrono.t.f6484d.getClass();
        boolean O3 = j$.time.chrono.t.O(j3);
        if (i4 == 366 && !O3) {
            throw new RuntimeException("Invalid date 'DayOfYear 366' as '" + i3 + "' is not a leap year");
        }
        m Q2 = m.Q(((i4 - 1) / 31) + 1);
        if (i4 > (Q2.O(O3) + Q2.N(O3)) - 1) {
            Q2 = Q2.R();
        }
        return new g(i3, Q2.getValue(), (i4 - Q2.N(O3)) + 1);
    }

    public static g c0(long j3) {
        long j4;
        j$.time.temporal.a.EPOCH_DAY.O(j3);
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j4 = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j4 = 0;
        }
        long j7 = ((j5 * 400) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (j7 * 365)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i3 = (int) j8;
        int i4 = ((i3 * 5) + 2) / 153;
        return new g(j$.time.temporal.a.YEAR.N(j7 + j4 + (i4 / 10)), ((i4 + 2) % 12) + 1, (i3 - (((i4 * 306) + 5) / 10)) + 1);
    }

    public static g P(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        g gVar = (g) temporalAccessor.z(j$.time.temporal.n.f());
        if (gVar != null) {
            return gVar;
        }
        String name = temporalAccessor.getClass().getName();
        throw new RuntimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    private static g O(int i3, int i4, int i5) {
        int i6 = 28;
        if (i5 > 28) {
            if (i4 != 2) {
                i6 = (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f6484d.getClass();
                if (j$.time.chrono.t.O(i3)) {
                    i6 = 29;
                }
            }
            if (i5 > i6) {
                if (i5 == 29) {
                    throw new RuntimeException("Invalid date 'February 29' as '" + i3 + "' is not a leap year");
                }
                String name = m.Q(i4).name();
                throw new RuntimeException("Invalid date '" + name + " " + i5 + "'");
            }
        }
        return new g(i3, i4, i5);
    }

    private static g j0(int i3, int i4, int i5) {
        if (i4 == 2) {
            j$.time.chrono.t.f6484d.getClass();
            i5 = Math.min(i5, j$.time.chrono.t.O((long) i3) ? 29 : 28);
        } else if (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11) {
            i5 = Math.min(i5, 30);
        }
        return new g(i3, i4, i5);
    }

    private g(int i3, int i4, int i5) {
        this.f6576a = i3;
        this.f6577b = (short) i4;
        this.f6578c = (short) i5;
    }

    public static g Z(b bVar) {
        Instant Q2 = Instant.Q(System.currentTimeMillis());
        ZoneId a3 = bVar.a();
        Objects.requireNonNull(Q2, "instant");
        Objects.requireNonNull(a3, "zone");
        return c0(j$.com.android.tools.r8.a.d(Q2.O() + a3.N().d(Q2).T(), 86400));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return AbstractC0335i.i(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            if (aVar.A()) {
                int i3 = f.f6500a[aVar.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return j$.time.temporal.w.j(1L, X() ? 366 : 365);
                    } else if (i3 == 3) {
                        return j$.time.temporal.w.j(1L, (m.Q(this.f6577b) != m.FEBRUARY || X()) ? 5L : 4L);
                    } else if (i3 != 4) {
                        return ((j$.time.temporal.a) sVar).m();
                    } else {
                        return j$.time.temporal.w.j(1L, this.f6576a <= 0 ? 1000000000L : 999999999L);
                    }
                }
                return j$.time.temporal.w.j(1L, Y());
            }
            throw new RuntimeException(d.a("Unsupported field: ", sVar));
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return Q(sVar);
        }
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (sVar == j$.time.temporal.a.EPOCH_DAY) {
                return w();
            }
            if (sVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return Q(sVar);
            }
            return ((this.f6576a * 12) + this.f6577b) - 1;
        }
        return sVar.q(this);
    }

    private int Q(j$.time.temporal.s sVar) {
        int i3;
        int i4 = f.f6500a[((j$.time.temporal.a) sVar).ordinal()];
        short s3 = this.f6578c;
        int i5 = this.f6576a;
        switch (i4) {
            case 1:
                return s3;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return T();
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                i3 = (s3 - 1) / 7;
                break;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return i5 >= 1 ? i5 : 1 - i5;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return S().getValue();
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                i3 = (s3 - 1) % 7;
                break;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((T() - 1) % 7) + 1;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                throw new RuntimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((T() - 1) / 7) + 1;
            case 10:
                return this.f6577b;
            case 11:
                throw new RuntimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i5;
            case 13:
                return i5 >= 1 ? 1 : 0;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", sVar));
        }
        return i3 + 1;
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.f6484d;
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final j$.time.chrono.n B() {
        return this.f6576a >= 1 ? j$.time.chrono.u.CE : j$.time.chrono.u.BCE;
    }

    public final int V() {
        return this.f6576a;
    }

    public final int U() {
        return this.f6577b;
    }

    public final int T() {
        return (m.Q(this.f6577b).N(X()) + this.f6578c) - 1;
    }

    public final int R() {
        return this.f6578c;
    }

    public final DayOfWeek S() {
        return DayOfWeek.N(((int) j$.com.android.tools.r8.a.i(w() + 3, 7)) + 1);
    }

    public final boolean X() {
        j$.time.chrono.t.f6484d.getClass();
        return j$.time.chrono.t.O(this.f6576a);
    }

    public final int Y() {
        short s3 = this.f6577b;
        return s3 != 2 ? (s3 == 4 || s3 == 6 || s3 == 9 || s3 == 11) ? 30 : 31 : X() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* renamed from: l0 */
    public final g q(j$.time.temporal.o oVar) {
        if (oVar instanceof g) {
            return (g) oVar;
        }
        return (g) oVar.A(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: k0 */
    public final g d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            aVar.O(j3);
            int i3 = f.f6500a[aVar.ordinal()];
            short s3 = this.f6578c;
            short s4 = this.f6577b;
            int i4 = this.f6576a;
            switch (i3) {
                case 1:
                    int i5 = (int) j3;
                    return s3 == i5 ? this : a0(i4, s4, i5);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return m0((int) j3);
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return h0(j3 - v(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    if (i4 < 1) {
                        j3 = 1 - j3;
                    }
                    return n0((int) j3);
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return f0(j3 - S().getValue());
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return f0(j3 - v(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return f0(j3 - v(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    return c0(j3);
                case 9:
                    return h0(j3 - v(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    int i6 = (int) j3;
                    if (s4 == i6) {
                        return this;
                    }
                    j$.time.temporal.a.MONTH_OF_YEAR.O(i6);
                    return j0(i4, i6, s3);
                case 11:
                    return g0(j3 - (((i4 * 12) + s4) - 1));
                case 12:
                    return n0((int) j3);
                case 13:
                    return v(j$.time.temporal.a.ERA) == j3 ? this : n0(1 - i4);
                default:
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
            }
        }
        return (g) sVar.v(this, j3);
    }

    public final g n0(int i3) {
        if (this.f6576a == i3) {
            return this;
        }
        j$.time.temporal.a.YEAR.O(i3);
        return j0(i3, this.f6577b, this.f6578c);
    }

    public final g m0(int i3) {
        return T() == i3 ? this : d0(this.f6576a, i3);
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final InterfaceC0328b F(j$.time.temporal.r rVar) {
        if (rVar instanceof s) {
            s sVar = (s) rVar;
            return g0(sVar.d()).f0(sVar.a());
        }
        Objects.requireNonNull(rVar, "amountToAdd");
        return (g) rVar.m(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: e0 */
    public final g e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (f.f6501b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return f0(j3);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return h0(j3);
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return g0(j3);
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return i0(j3);
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return i0(j$.com.android.tools.r8.a.g(j3, 10));
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return i0(j$.com.android.tools.r8.a.g(j3, 100));
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return i0(j$.com.android.tools.r8.a.g(j3, 1000));
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.com.android.tools.r8.a.h(v(aVar), j3), aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + uVar);
            }
        }
        return (g) uVar.m(this, j3);
    }

    public final g i0(long j3) {
        return j3 == 0 ? this : j0(j$.time.temporal.a.YEAR.N(this.f6576a + j3), this.f6577b, this.f6578c);
    }

    public final g g0(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = (this.f6576a * 12) + (this.f6577b - 1) + j3;
        long j5 = 12;
        return j0(j$.time.temporal.a.YEAR.N(j$.com.android.tools.r8.a.d(j4, j5)), ((int) j$.com.android.tools.r8.a.i(j4, j5)) + 1, this.f6578c);
    }

    public final g h0(long j3) {
        return f0(j$.com.android.tools.r8.a.g(j3, 7));
    }

    public final g f0(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = this.f6578c + j3;
        if (j4 > 0) {
            short s3 = this.f6577b;
            int i3 = this.f6576a;
            if (j4 <= 28) {
                return new g(i3, s3, (int) j4);
            }
            if (j4 <= 59) {
                long Y2 = Y();
                if (j4 <= Y2) {
                    return new g(i3, s3, (int) j4);
                }
                if (s3 < 12) {
                    return new g(i3, s3 + 1, (int) (j4 - Y2));
                }
                int i4 = i3 + 1;
                j$.time.temporal.a.YEAR.O(i4);
                return new g(i4, 1, (int) (j4 - Y2));
            }
        }
        return c0(j$.com.android.tools.r8.a.h(w(), j3));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this : AbstractC0335i.k(this, tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return AbstractC0335i.a(this, mVar);
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final InterfaceC0331e y(k kVar) {
        return LocalDateTime.b0(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final long w() {
        long j3;
        long j4 = this.f6576a;
        long j5 = this.f6577b;
        long j6 = 365 * j4;
        if (j4 >= 0) {
            j3 = ((j4 + 399) / 400) + (((3 + j4) / 4) - ((99 + j4) / 100)) + j6;
        } else {
            j3 = j6 - ((j4 / (-400)) + ((j4 / (-4)) - (j4 / (-100))));
        }
        long j7 = (((367 * j5) - 362) / 12) + j3 + (this.f6578c - 1);
        if (j5 > 2) {
            j7 = !X() ? j7 - 2 : j7 - 1;
        }
        return j7 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: K */
    public final int compareTo(InterfaceC0328b interfaceC0328b) {
        if (interfaceC0328b instanceof g) {
            return N((g) interfaceC0328b);
        }
        return AbstractC0335i.b(this, interfaceC0328b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int N(g gVar) {
        int i3 = this.f6576a - gVar.f6576a;
        if (i3 == 0) {
            int i4 = this.f6577b - gVar.f6577b;
            return i4 == 0 ? this.f6578c - gVar.f6578c : i4;
        }
        return i3;
    }

    public final boolean W(g gVar) {
        return gVar instanceof g ? N(gVar) < 0 : w() < gVar.w();
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && N((g) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final int hashCode() {
        int i3 = this.f6576a;
        return (((i3 << 11) + (this.f6577b << 6)) + this.f6578c) ^ (i3 & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final String toString() {
        int i3 = this.f6576a;
        int abs = Math.abs(i3);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i3 > 9999) {
                sb.append('+');
            }
            sb.append(i3);
        } else if (i3 < 0) {
            sb.append(i3 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i3 + 10000);
            sb.deleteCharAt(0);
        }
        short s3 = this.f6577b;
        sb.append(s3 < 10 ? "-0" : "-");
        sb.append((int) s3);
        short s4 = this.f6578c;
        sb.append(s4 < 10 ? "-0" : "-");
        sb.append((int) s4);
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f6576a);
        dataOutput.writeByte(this.f6577b);
        dataOutput.writeByte(this.f6578c);
    }
}

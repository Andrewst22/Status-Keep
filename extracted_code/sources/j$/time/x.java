package j$.time;

import j$.time.chrono.AbstractC0335i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class x implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a  reason: collision with root package name */
    private final int f6645a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6646b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        int i3 = this.f6645a - xVar.f6645a;
        return i3 == 0 ? this.f6646b - xVar.f6646b : i3;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        pVar.e('-');
        pVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.t();
    }

    private x(int i3, int i4) {
        this.f6645a = i3;
        this.f6646b = i4;
    }

    private x S(int i3, int i4) {
        return (this.f6645a == i3 && this.f6646b == i4) ? this : new x(i3, i4);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.YEAR || sVar == j$.time.temporal.a.MONTH_OF_YEAR || sVar == j$.time.temporal.a.PROLEPTIC_MONTH || sVar == j$.time.temporal.a.YEAR_OF_ERA || sVar == j$.time.temporal.a.ERA : sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f6645a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        return r(sVar).a(v(sVar), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = w.f6643a[((j$.time.temporal.a) sVar).ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    int i4 = this.f6645a;
                    if (i3 == 3) {
                        if (i4 < 1) {
                            i4 = 1 - i4;
                        }
                        return i4;
                    } else if (i3 != 4) {
                        if (i3 == 5) {
                            return i4 < 1 ? 0 : 1;
                        }
                        throw new RuntimeException(d.a("Unsupported field: ", sVar));
                    } else {
                        return i4;
                    }
                }
                return N();
            }
            return this.f6646b;
        }
        return sVar.q(this);
    }

    private long N() {
        return ((this.f6645a * 12) + this.f6646b) - 1;
    }

    @Override // j$.time.temporal.m
    /* renamed from: T */
    public final x d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            aVar.O(j3);
            int i3 = w.f6643a[aVar.ordinal()];
            int i4 = this.f6645a;
            if (i3 == 1) {
                int i5 = (int) j3;
                j$.time.temporal.a.MONTH_OF_YEAR.O(i5);
                return S(i4, i5);
            } else if (i3 != 2) {
                int i6 = this.f6646b;
                if (i3 == 3) {
                    if (i4 < 1) {
                        j3 = 1 - j3;
                    }
                    int i7 = (int) j3;
                    j$.time.temporal.a.YEAR.O(i7);
                    return S(i7, i6);
                } else if (i3 == 4) {
                    int i8 = (int) j3;
                    j$.time.temporal.a.YEAR.O(i8);
                    return S(i8, i6);
                } else if (i3 == 5) {
                    if (v(j$.time.temporal.a.ERA) == j3) {
                        return this;
                    }
                    int i9 = 1 - i4;
                    j$.time.temporal.a.YEAR.O(i9);
                    return S(i9, i6);
                } else {
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
                }
            } else {
                return P(j3 - N());
            }
        }
        return (x) sVar.v(this, j3);
    }

    @Override // j$.time.temporal.m
    /* renamed from: O */
    public final x e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (w.f6644b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return P(j3);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return Q(j3);
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return Q(j$.com.android.tools.r8.a.g(j3, 10));
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return Q(j$.com.android.tools.r8.a.g(j3, 100));
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return Q(j$.com.android.tools.r8.a.g(j3, 1000));
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.com.android.tools.r8.a.h(v(aVar), j3), aVar);
                default:
                    throw new RuntimeException("Unsupported unit: " + uVar);
            }
        }
        return (x) uVar.m(this, j3);
    }

    public final x Q(long j3) {
        return j3 == 0 ? this : S(j$.time.temporal.a.YEAR.N(this.f6645a + j3), this.f6646b);
    }

    public final x P(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = (this.f6645a * 12) + (this.f6646b - 1) + j3;
        long j5 = 12;
        return S(j$.time.temporal.a.YEAR.N(j$.com.android.tools.r8.a.d(j4, j5)), ((int) j$.com.android.tools.r8.a.i(j4, j5)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
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
        return mVar.d(N(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f6645a == xVar.f6645a && this.f6646b == xVar.f6646b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6646b << 27) ^ this.f6645a;
    }

    public final String toString() {
        int i3 = this.f6645a;
        int abs = Math.abs(i3);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i3);
        } else if (i3 < 0) {
            sb.append(i3 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i3 + 10000);
            sb.deleteCharAt(0);
        }
        int i4 = this.f6646b;
        sb.append(i4 < 10 ? "-0" : "-");
        sb.append(i4);
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(DataOutput dataOutput) {
        dataOutput.writeInt(this.f6645a);
        dataOutput.writeByte(this.f6646b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x R(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        byte readByte = objectInput.readByte();
        j$.time.temporal.a.YEAR.O(readInt);
        j$.time.temporal.a.MONTH_OF_YEAR.O(readByte);
        return new x(readInt, readByte);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(g gVar) {
        return (x) AbstractC0335i.a(gVar, this);
    }
}

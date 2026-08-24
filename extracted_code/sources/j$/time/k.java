package j$.time;

import j$.time.chrono.AbstractC0335i;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class k implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final k f6582e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f6583f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f6584g;

    /* renamed from: h  reason: collision with root package name */
    private static final k[] f6585h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a  reason: collision with root package name */
    private final byte f6586a;

    /* renamed from: b  reason: collision with root package name */
    private final byte f6587b;

    /* renamed from: c  reason: collision with root package name */
    private final byte f6588c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6589d;

    static {
        int i3 = 0;
        while (true) {
            k[] kVarArr = f6585h;
            if (i3 < kVarArr.length) {
                kVarArr[i3] = new k(i3, 0, 0, 0);
                i3++;
            } else {
                k kVar = kVarArr[0];
                f6584g = kVar;
                k kVar2 = kVarArr[12];
                f6582e = kVar;
                f6583f = new k(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static k V(int i3) {
        j$.time.temporal.a.HOUR_OF_DAY.O(i3);
        return f6585h[i3];
    }

    public static k W(int i3, int i4, int i5, int i6) {
        j$.time.temporal.a.HOUR_OF_DAY.O(i3);
        j$.time.temporal.a.MINUTE_OF_HOUR.O(i4);
        j$.time.temporal.a.SECOND_OF_MINUTE.O(i5);
        j$.time.temporal.a.NANO_OF_SECOND.O(i6);
        return O(i3, i4, i5, i6);
    }

    public static k Y(long j3) {
        j$.time.temporal.a.SECOND_OF_DAY.O(j3);
        int i3 = (int) (j3 / 3600);
        long j4 = j3 - (i3 * 3600);
        int i4 = (int) (j4 / 60);
        return O(i3, i4, (int) (j4 - (i4 * 60)), 0);
    }

    public static k X(long j3) {
        j$.time.temporal.a.NANO_OF_DAY.O(j3);
        int i3 = (int) (j3 / 3600000000000L);
        long j4 = j3 - (i3 * 3600000000000L);
        int i4 = (int) (j4 / 60000000000L);
        long j5 = j4 - (i4 * 60000000000L);
        int i5 = (int) (j5 / 1000000000);
        return O(i3, i4, i5, (int) (j5 - (i5 * 1000000000)));
    }

    public static k P(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        k kVar = (k) temporalAccessor.z(j$.time.temporal.n.g());
        if (kVar != null) {
            return kVar;
        }
        String name = temporalAccessor.getClass().getName();
        throw new RuntimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    private static k O(int i3, int i4, int i5, int i6) {
        if ((i4 | i5 | i6) == 0) {
            return f6585h[i3];
        }
        return new k(i3, i4, i5, i6);
    }

    private k(int i3, int i4, int i5, int i6) {
        this.f6586a = (byte) i3;
        this.f6587b = (byte) i4;
        this.f6588c = (byte) i5;
        this.f6589d = i6;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P();
        }
        return sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
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
            if (sVar == j$.time.temporal.a.NANO_OF_DAY) {
                return f0();
            }
            if (sVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return f0() / 1000;
            }
            return Q(sVar);
        }
        return sVar.q(this);
    }

    private int Q(j$.time.temporal.s sVar) {
        int i3 = j.f6580a[((j$.time.temporal.a) sVar).ordinal()];
        byte b3 = this.f6587b;
        int i4 = this.f6589d;
        byte b4 = this.f6586a;
        switch (i3) {
            case 1:
                return i4;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                throw new RuntimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return i4 / 1000;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                throw new RuntimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return i4 / 1000000;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return (int) (f0() / 1000000);
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f6588c;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return g0();
            case 9:
                return b3;
            case 10:
                return (b4 * 60) + b3;
            case 11:
                return b4 % 12;
            case 12:
                int i5 = b4 % 12;
                if (i5 % 12 == 0) {
                    return 12;
                }
                return i5;
            case 13:
                return b4;
            case 14:
                if (b4 == 0) {
                    return 24;
                }
                return b4;
            case 15:
                return b4 / 12;
            default:
                throw new RuntimeException(d.a("Unsupported field: ", sVar));
        }
    }

    public final int R() {
        return this.f6586a;
    }

    public final int S() {
        return this.f6587b;
    }

    public final int U() {
        return this.f6588c;
    }

    public final int T() {
        return this.f6589d;
    }

    @Override // j$.time.temporal.m
    /* renamed from: h0 */
    public final k d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            aVar.O(j3);
            int i3 = j.f6580a[aVar.ordinal()];
            byte b3 = this.f6587b;
            byte b4 = this.f6588c;
            int i4 = this.f6589d;
            byte b5 = this.f6586a;
            switch (i3) {
                case 1:
                    return i0((int) j3);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return X(j3);
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return i0(((int) j3) * 1000);
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return X(j3 * 1000);
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return i0(((int) j3) * 1000000);
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return X(j3 * 1000000);
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    int i5 = (int) j3;
                    if (b4 == i5) {
                        return this;
                    }
                    j$.time.temporal.a.SECOND_OF_MINUTE.O(i5);
                    return O(b5, b3, i5, i4);
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    return d0(j3 - g0());
                case 9:
                    int i6 = (int) j3;
                    if (b3 == i6) {
                        return this;
                    }
                    j$.time.temporal.a.MINUTE_OF_HOUR.O(i6);
                    return O(b5, i6, b4, i4);
                case 10:
                    return b0(j3 - ((b5 * 60) + b3));
                case 11:
                    return a0(j3 - (b5 % 12));
                case 12:
                    if (j3 == 12) {
                        j3 = 0;
                    }
                    return a0(j3 - (b5 % 12));
                case 13:
                    int i7 = (int) j3;
                    if (b5 == i7) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.O(i7);
                    return O(i7, b3, b4, i4);
                case 14:
                    if (j3 == 24) {
                        j3 = 0;
                    }
                    int i8 = (int) j3;
                    if (b5 == i8) {
                        return this;
                    }
                    j$.time.temporal.a.HOUR_OF_DAY.O(i8);
                    return O(i8, b3, b4, i4);
                case 15:
                    return a0((j3 - (b5 / 12)) * 12);
                default:
                    throw new RuntimeException(d.a("Unsupported field: ", sVar));
            }
        }
        return (k) sVar.v(this, j3);
    }

    public final k i0(int i3) {
        if (this.f6589d == i3) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.O(i3);
        return O(this.f6586a, this.f6587b, this.f6588c, i3);
    }

    @Override // j$.time.temporal.m
    /* renamed from: Z */
    public final k e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (j.f6581b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return c0(j3);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return c0((j3 % 86400000000L) * 1000);
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return c0((j3 % 86400000) * 1000000);
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return d0(j3);
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return b0(j3);
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return a0(j3);
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return a0((j3 % 2) * 12);
                default:
                    throw new RuntimeException("Unsupported unit: " + uVar);
            }
        }
        return (k) uVar.m(this, j3);
    }

    public final k a0(long j3) {
        if (j3 == 0) {
            return this;
        }
        return O(((((int) (j3 % 24)) + this.f6586a) + 24) % 24, this.f6587b, this.f6588c, this.f6589d);
    }

    public final k b0(long j3) {
        if (j3 == 0) {
            return this;
        }
        int i3 = (this.f6586a * 60) + this.f6587b;
        int i4 = ((((int) (j3 % 1440)) + i3) + 1440) % 1440;
        return i3 == i4 ? this : O(i4 / 60, i4 % 60, this.f6588c, this.f6589d);
    }

    public final k d0(long j3) {
        if (j3 == 0) {
            return this;
        }
        int i3 = (this.f6587b * 60) + (this.f6586a * 3600) + this.f6588c;
        int i4 = ((((int) (j3 % 86400)) + i3) + 86400) % 86400;
        return i3 == i4 ? this : O(i4 / 3600, (i4 / 60) % 60, i4 % 60, this.f6589d);
    }

    public final k c0(long j3) {
        if (j3 == 0) {
            return this;
        }
        long f02 = f0();
        long j4 = (((j3 % 86400000000000L) + f02) + 86400000000000L) % 86400000000000L;
        return f02 == j4 ? this : O((int) (j4 / 3600000000000L), (int) ((j4 / 60000000000L) % 60), (int) ((j4 / 1000000000) % 60), (int) (j4 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return this;
        }
        if (tVar == j$.time.temporal.n.f()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.g(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(f0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int g0() {
        return (this.f6587b * 60) + (this.f6586a * 3600) + this.f6588c;
    }

    public final long f0() {
        return (this.f6588c * 1000000000) + (this.f6587b * 60000000000L) + (this.f6586a * 3600000000000L) + this.f6589d;
    }

    @Override // java.lang.Comparable
    /* renamed from: N */
    public final int compareTo(k kVar) {
        int b3 = j$.com.android.tools.r8.a.b(this.f6586a, kVar.f6586a);
        if (b3 == 0) {
            int b4 = j$.com.android.tools.r8.a.b(this.f6587b, kVar.f6587b);
            if (b4 == 0) {
                int b5 = j$.com.android.tools.r8.a.b(this.f6588c, kVar.f6588c);
                return b5 == 0 ? j$.com.android.tools.r8.a.b(this.f6589d, kVar.f6589d) : b5;
            }
            return b4;
        }
        return b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f6586a == kVar.f6586a && this.f6587b == kVar.f6587b && this.f6588c == kVar.f6588c && this.f6589d == kVar.f6589d;
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(g gVar) {
        return (k) AbstractC0335i.a(gVar, this);
    }

    public final int hashCode() {
        long f02 = f0();
        return (int) (f02 ^ (f02 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b3 = this.f6586a;
        sb.append(b3 < 10 ? "0" : "");
        sb.append((int) b3);
        byte b4 = this.f6587b;
        sb.append(b4 < 10 ? ":0" : ":");
        sb.append((int) b4);
        byte b5 = this.f6588c;
        int i3 = this.f6589d;
        if (b5 > 0 || i3 > 0) {
            sb.append(b5 < 10 ? ":0" : ":");
            sb.append((int) b5);
            if (i3 > 0) {
                sb.append('.');
                if (i3 % 1000000 == 0) {
                    sb.append(Integer.toString((i3 / 1000000) + 1000).substring(1));
                } else if (i3 % 1000 == 0) {
                    sb.append(Integer.toString((i3 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i3 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j0(DataOutput dataOutput) {
        byte b3 = this.f6588c;
        byte b4 = this.f6586a;
        byte b5 = this.f6587b;
        int i3 = this.f6589d;
        if (i3 != 0) {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(b5);
            dataOutput.writeByte(b3);
            dataOutput.writeInt(i3);
        } else if (b3 != 0) {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(b5);
            dataOutput.writeByte(~b3);
        } else if (b5 == 0) {
            dataOutput.writeByte(~b4);
        } else {
            dataOutput.writeByte(b4);
            dataOutput.writeByte(~b5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    public static k e0(ObjectInput objectInput) {
        byte b3;
        int i3;
        byte b4;
        int readByte = objectInput.readByte();
        byte b5 = 0;
        if (readByte >= 0) {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r5 = ~readByte2;
                i3 = 0;
                b5 = r5;
                b3 = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    b5 = readByte2;
                    b4 = ~readByte3;
                } else {
                    int readInt = objectInput.readInt();
                    b3 = readByte3;
                    i3 = readInt;
                    b5 = readByte2;
                }
            }
            return W(readByte, b5, b3, i3);
        }
        readByte = ~readByte;
        b4 = 0;
        i3 = 0;
        b3 = b4;
        return W(readByte, b5, b3, i3);
    }
}

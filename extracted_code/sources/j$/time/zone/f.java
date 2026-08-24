package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.chrono.AbstractC0335i;
import j$.time.y;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final long[] f6674i = new long[0];

    /* renamed from: j  reason: collision with root package name */
    private static final e[] f6675j = new e[0];

    /* renamed from: k  reason: collision with root package name */
    private static final LocalDateTime[] f6676k = new LocalDateTime[0];

    /* renamed from: l  reason: collision with root package name */
    private static final b[] f6677l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f6678a;

    /* renamed from: b  reason: collision with root package name */
    private final y[] f6679b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f6680c;

    /* renamed from: d  reason: collision with root package name */
    private final LocalDateTime[] f6681d;

    /* renamed from: e  reason: collision with root package name */
    private final y[] f6682e;

    /* renamed from: f  reason: collision with root package name */
    private final e[] f6683f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeZone f6684g;

    /* renamed from: h  reason: collision with root package name */
    private final transient ConcurrentHashMap f6685h = new ConcurrentHashMap();

    public static f h(y yVar) {
        Objects.requireNonNull(yVar, "offset");
        return new f(yVar);
    }

    private f(long[] jArr, y[] yVarArr, long[] jArr2, y[] yVarArr2, e[] eVarArr) {
        this.f6678a = jArr;
        this.f6679b = yVarArr;
        this.f6680c = jArr2;
        this.f6682e = yVarArr2;
        this.f6683f = eVarArr;
        if (jArr2.length == 0) {
            this.f6681d = f6676k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < jArr2.length) {
                int i4 = i3 + 1;
                b bVar = new b(jArr2[i3], yVarArr2[i3], yVarArr2[i4]);
                if (bVar.A()) {
                    arrayList.add(bVar.o());
                    arrayList.add(bVar.m());
                } else {
                    arrayList.add(bVar.m());
                    arrayList.add(bVar.o());
                }
                i3 = i4;
            }
            this.f6681d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f6684g = null;
    }

    private f(y yVar) {
        this.f6679b = r0;
        y[] yVarArr = {yVar};
        long[] jArr = f6674i;
        this.f6678a = jArr;
        this.f6680c = jArr;
        this.f6681d = f6676k;
        this.f6682e = yVarArr;
        this.f6683f = f6675j;
        this.f6684g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(TimeZone timeZone) {
        this.f6679b = r0;
        y[] yVarArr = {i(timeZone.getRawOffset())};
        long[] jArr = f6674i;
        this.f6678a = jArr;
        this.f6680c = jArr;
        this.f6681d = f6676k;
        this.f6682e = yVarArr;
        this.f6683f = f6675j;
        this.f6684g = timeZone;
    }

    private static y i(int i3) {
        return y.W(i3 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f6684g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        long[] jArr = this.f6678a;
        objectOutput.writeInt(jArr.length);
        for (long j3 : jArr) {
            a.c(j3, objectOutput);
        }
        for (y yVar : this.f6679b) {
            a.d(yVar, objectOutput);
        }
        long[] jArr2 = this.f6680c;
        objectOutput.writeInt(jArr2.length);
        for (long j4 : jArr2) {
            a.c(j4, objectOutput);
        }
        for (y yVar2 : this.f6682e) {
            a.d(yVar2, objectOutput);
        }
        e[] eVarArr = this.f6683f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f6684g.getID());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f j(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        long[] jArr = f6674i;
        long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            jArr2[i3] = a.a(objectInput);
        }
        int i4 = readInt + 1;
        y[] yVarArr = new y[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            yVarArr[i5] = a.b(objectInput);
        }
        int readInt2 = objectInput.readInt();
        if (readInt2 != 0) {
            jArr = new long[readInt2];
        }
        long[] jArr3 = jArr;
        for (int i6 = 0; i6 < readInt2; i6++) {
            jArr3[i6] = a.a(objectInput);
        }
        int i7 = readInt2 + 1;
        y[] yVarArr2 = new y[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            yVarArr2[i8] = a.b(objectInput);
        }
        int readByte = objectInput.readByte();
        e[] eVarArr = readByte == 0 ? f6675j : new e[readByte];
        for (int i9 = 0; i9 < readByte; i9++) {
            eVarArr[i9] = e.b(objectInput);
        }
        return new f(jArr2, yVarArr, jArr3, yVarArr2, eVarArr);
    }

    public final y d(Instant instant) {
        TimeZone timeZone = this.f6684g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f6680c;
        if (jArr.length == 0) {
            return this.f6679b[0];
        }
        long O3 = instant.O();
        int length = this.f6683f.length;
        y[] yVarArr = this.f6682e;
        if (length > 0 && O3 > jArr[jArr.length - 1]) {
            b[] b3 = b(c(O3, yVarArr[yVarArr.length - 1]));
            b bVar = null;
            for (int i3 = 0; i3 < b3.length; i3++) {
                bVar = b3[i3];
                if (O3 < bVar.M()) {
                    return bVar.v();
                }
            }
            return bVar.r();
        }
        int binarySearch = Arrays.binarySearch(jArr, O3);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return yVarArr[binarySearch + 1];
    }

    public final List g(LocalDateTime localDateTime) {
        Object e2 = e(localDateTime);
        if (e2 instanceof b) {
            return ((b) e2).z();
        }
        return Collections.singletonList((y) e2);
    }

    public final b f(LocalDateTime localDateTime) {
        Object e2 = e(localDateTime);
        if (e2 instanceof b) {
            return (b) e2;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        y[] yVarArr = this.f6679b;
        int i3 = 0;
        TimeZone timeZone = this.f6684g;
        if (timeZone != null) {
            b[] b3 = b(localDateTime.W());
            if (b3.length == 0) {
                return i(timeZone.getOffset(AbstractC0335i.o(localDateTime, yVarArr[0]) * 1000));
            }
            int length = b3.length;
            while (i3 < length) {
                b bVar = b3[i3];
                Object a3 = a(localDateTime, bVar);
                if ((a3 instanceof b) || a3.equals(bVar.v())) {
                    return a3;
                }
                i3++;
                obj = a3;
            }
            return obj;
        } else if (this.f6680c.length == 0) {
            return yVarArr[0];
        } else {
            int length2 = this.f6683f.length;
            LocalDateTime[] localDateTimeArr = this.f6681d;
            if (length2 > 0 && localDateTime.X(localDateTimeArr[localDateTimeArr.length - 1])) {
                b[] b4 = b(localDateTime.W());
                int length3 = b4.length;
                while (i3 < length3) {
                    b bVar2 = b4[i3];
                    Object a4 = a(localDateTime, bVar2);
                    if ((a4 instanceof b) || a4.equals(bVar2.v())) {
                        return a4;
                    }
                    i3++;
                    obj = a4;
                }
                return obj;
            }
            int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
            y[] yVarArr2 = this.f6682e;
            if (binarySearch == -1) {
                return yVarArr2[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else if (binarySearch < localDateTimeArr.length - 1) {
                int i4 = binarySearch + 1;
                if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i4])) {
                    binarySearch = i4;
                }
            }
            if ((binarySearch & 1) == 0) {
                LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
                int i5 = binarySearch / 2;
                y yVar = yVarArr2[i5];
                y yVar2 = yVarArr2[i5 + 1];
                if (yVar2.T() > yVar.T()) {
                    return new b(localDateTime2, yVar, yVar2);
                }
                return new b(localDateTime3, yVar, yVar2);
            }
            return yVarArr2[(binarySearch / 2) + 1];
        }
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime o3 = bVar.o();
        if (bVar.A()) {
            if (localDateTime.Y(o3)) {
                return bVar.v();
            }
            return localDateTime.Y(bVar.m()) ? bVar : bVar.r();
        } else if (localDateTime.Y(o3)) {
            return localDateTime.Y(bVar.m()) ? bVar.v() : bVar;
        } else {
            return bVar.r();
        }
    }

    private b[] b(int i3) {
        long j3;
        Integer valueOf = Integer.valueOf(i3);
        ConcurrentHashMap concurrentHashMap = this.f6685h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f6684g;
        if (timeZone != null) {
            b[] bVarArr2 = f6677l;
            if (i3 < 1800) {
                return bVarArr2;
            }
            long o3 = AbstractC0335i.o(LocalDateTime.Z(i3 - 1), this.f6679b[0]);
            int offset = timeZone.getOffset(o3 * 1000);
            long j4 = 31968000 + o3;
            while (o3 < j4) {
                long j5 = 7776000 + o3;
                long j6 = o3;
                if (offset != timeZone.getOffset(j5 * 1000)) {
                    o3 = j6;
                    while (j5 - o3 > 1) {
                        int i4 = offset;
                        long j7 = j4;
                        long d3 = j$.com.android.tools.r8.a.d(j5 + o3, 2L);
                        if (timeZone.getOffset(d3 * 1000) == i4) {
                            o3 = d3;
                        } else {
                            j5 = d3;
                        }
                        offset = i4;
                        j4 = j7;
                    }
                    j3 = j4;
                    int i5 = offset;
                    if (timeZone.getOffset(o3 * 1000) == i5) {
                        o3 = j5;
                    }
                    y i6 = i(i5);
                    offset = timeZone.getOffset(o3 * 1000);
                    y i7 = i(offset);
                    if (c(o3, i7) == i3) {
                        bVarArr2 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr2[bVarArr2.length - 1] = new b(o3, i6, i7);
                    }
                } else {
                    j3 = j4;
                    o3 = j5;
                }
                j4 = j3;
            }
            if (1916 <= i3 && i3 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        e[] eVarArr = this.f6683f;
        b[] bVarArr3 = new b[eVarArr.length];
        for (int i8 = 0; i8 < eVarArr.length; i8++) {
            bVarArr3[i8] = eVarArr[i8].a(i3);
        }
        if (i3 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j3, y yVar) {
        return j$.time.g.c0(j$.com.android.tools.r8.a.d(j3 + yVar.T(), 86400)).V();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return Objects.equals(this.f6684g, fVar.f6684g) && Arrays.equals(this.f6678a, fVar.f6678a) && Arrays.equals(this.f6679b, fVar.f6679b) && Arrays.equals(this.f6680c, fVar.f6680c) && Arrays.equals(this.f6682e, fVar.f6682e) && Arrays.equals(this.f6683f, fVar.f6683f);
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f6684g) ^ Arrays.hashCode(this.f6678a)) ^ Arrays.hashCode(this.f6679b)) ^ Arrays.hashCode(this.f6680c)) ^ Arrays.hashCode(this.f6682e)) ^ Arrays.hashCode(this.f6683f);
    }

    public final String toString() {
        TimeZone timeZone = this.f6684g;
        if (timeZone != null) {
            String id = timeZone.getID();
            return "ZoneRules[timeZone=" + id + "]";
        }
        y[] yVarArr = this.f6679b;
        y yVar = yVarArr[yVarArr.length - 1];
        return "ZoneRules[currentStandardOffset=" + yVar + "]";
    }
}

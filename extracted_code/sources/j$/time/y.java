package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
/* loaded from: classes2.dex */
public final class y extends ZoneId implements TemporalAccessor, j$.time.temporal.o, Comparable {

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentHashMap f6647d = new ConcurrentHashMap(16, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap f6648e = new ConcurrentHashMap(16, 4);

    /* renamed from: f  reason: collision with root package name */
    public static final y f6649f = W(0);

    /* renamed from: g  reason: collision with root package name */
    public static final y f6650g = W(-64800);

    /* renamed from: h  reason: collision with root package name */
    public static final y f6651h = W(64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b  reason: collision with root package name */
    private final int f6652b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f6653c;

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.y U(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.y.f6648e
            java.lang.Object r0 = r0.get(r7)
            j$.time.y r0 = (j$.time.y) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = X(r7, r2, r3)
            int r1 = X(r7, r6, r2)
            int r2 = X(r7, r5, r2)
            goto L85
        L37:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = X(r7, r2, r3)
            int r1 = X(r7, r1, r3)
            int r2 = X(r7, r4, r3)
            goto L85
        L50:
            int r0 = X(r7, r2, r3)
            int r1 = X(r7, r6, r2)
        L58:
            r2 = 0
            goto L85
        L5a:
            int r0 = X(r7, r2, r3)
            int r1 = X(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = X(r7, r2, r3)
            r1 = 0
            goto L58
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.c r0 = new j$.time.c
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.y r7 = V(r7, r0, r1)
            return r7
        La8:
            j$.time.y r7 = V(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.y.U(java.lang.String):j$.time.y");
    }

    private static int X(String str, int i3, boolean z3) {
        if (z3 && str.charAt(i3 - 1) != ':') {
            throw new RuntimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char charAt = str.charAt(i3);
        char charAt2 = str.charAt(i3 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new RuntimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static y V(int i3, int i4, int i5) {
        if (i3 < -18 || i3 > 18) {
            throw new RuntimeException("Zone offset hours not in valid range: value " + i3 + " is not in the range -18 to 18");
        }
        if (i3 > 0) {
            if (i4 < 0 || i5 < 0) {
                throw new RuntimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i3 < 0) {
            if (i4 > 0 || i5 > 0) {
                throw new RuntimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i4 > 0 && i5 < 0) || (i4 < 0 && i5 > 0)) {
            throw new RuntimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i4 < -59 || i4 > 59) {
            throw new RuntimeException("Zone offset minutes not in valid range: value " + i4 + " is not in the range -59 to 59");
        } else if (i5 < -59 || i5 > 59) {
            throw new RuntimeException("Zone offset seconds not in valid range: value " + i5 + " is not in the range -59 to 59");
        } else if (Math.abs(i3) != 18 || (i4 | i5) == 0) {
            return W((i4 * 60) + (i3 * 3600) + i5);
        } else {
            throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static y W(int i3) {
        if (i3 < -64800 || i3 > 64800) {
            throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i3 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i3);
            ConcurrentHashMap concurrentHashMap = f6647d;
            y yVar = (y) concurrentHashMap.get(valueOf);
            if (yVar == null) {
                concurrentHashMap.putIfAbsent(valueOf, new y(i3));
                y yVar2 = (y) concurrentHashMap.get(valueOf);
                f6648e.putIfAbsent(yVar2.f6653c, yVar2);
                return yVar2;
            }
            return yVar;
        }
        return new y(i3);
    }

    private y(int i3) {
        String sb;
        this.f6652b = i3;
        if (i3 == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i3);
            StringBuilder sb2 = new StringBuilder();
            int i4 = abs / 3600;
            int i5 = (abs / 60) % 60;
            sb2.append(i3 < 0 ? "-" : "+");
            sb2.append(i4 < 10 ? "0" : "");
            sb2.append(i4);
            sb2.append(i5 < 10 ? ":0" : ":");
            sb2.append(i5);
            int i6 = abs % 60;
            if (i6 != 0) {
                sb2.append(i6 < 10 ? ":0" : ":");
                sb2.append(i6);
            }
            sb = sb2.toString();
        }
        this.f6653c = sb;
    }

    public final int T() {
        return this.f6652b;
    }

    @Override // j$.time.ZoneId
    public final String l() {
        return this.f6653c;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f N() {
        return j$.time.zone.f.h(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.OFFSET_SECONDS : sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f6652b;
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", sVar));
        }
        return j$.time.temporal.n.d(this, sVar).a(v(sVar), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f6652b;
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(d.a("Unsupported field: ", sVar));
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) ? this : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(this.f6652b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* renamed from: S */
    public final int compareTo(y yVar) {
        return yVar.f6652b - this.f6652b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f6652b == ((y) obj).f6652b;
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f6652b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f6653c;
    }

    private Object writeReplace() {
        return new t((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public final void R(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        Z(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z(DataOutput dataOutput) {
        int i3 = this.f6652b;
        int i4 = i3 % 900 == 0 ? i3 / 900 : 127;
        dataOutput.writeByte(i4);
        if (i4 == 127) {
            dataOutput.writeInt(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y Y(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? W(objectInput.readInt()) : W(readByte * 900);
    }
}

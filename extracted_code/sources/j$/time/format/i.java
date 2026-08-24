package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i implements f {

    /* renamed from: f  reason: collision with root package name */
    static final long[] f6518f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* renamed from: a  reason: collision with root package name */
    final Enum f6519a;

    /* renamed from: b  reason: collision with root package name */
    final int f6520b;

    /* renamed from: c  reason: collision with root package name */
    final int f6521c;

    /* renamed from: d  reason: collision with root package name */
    private final z f6522d;

    /* renamed from: e  reason: collision with root package name */
    final int f6523e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j$.time.temporal.s sVar, int i3, int i4, z zVar) {
        this.f6519a = (Enum) sVar;
        this.f6520b = i3;
        this.f6521c = i4;
        this.f6522d = zVar;
        this.f6523e = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i(j$.time.temporal.s sVar, int i3, int i4, z zVar, int i5) {
        this.f6519a = (Enum) sVar;
        this.f6520b = i3;
        this.f6521c = i4;
        this.f6522d = zVar;
        this.f6523e = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.temporal.s] */
    public i c() {
        return this.f6523e == -1 ? this : new i(this.f6519a, this.f6520b, this.f6521c, this.f6522d, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.temporal.s] */
    public i d(int i3) {
        ?? r12 = this.f6519a;
        int i4 = this.f6521c;
        z zVar = this.f6522d;
        return new i(r12, this.f6520b, i4, zVar, this.f6523e + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object, j$.time.temporal.s] */
    @Override // j$.time.format.f
    public boolean m(t tVar, StringBuilder sb) {
        ?? r02 = this.f6519a;
        Long e2 = tVar.e(r02);
        if (e2 == null) {
            return false;
        }
        long longValue = e2.longValue();
        w b3 = tVar.b();
        String l3 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l3.length();
        int i3 = this.f6521c;
        if (length > i3) {
            throw new RuntimeException("Field " + ((Object) r02) + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i3);
        }
        b3.getClass();
        int i4 = this.f6520b;
        z zVar = this.f6522d;
        if (longValue >= 0) {
            int i5 = c.f6513a[zVar.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    sb.append('+');
                }
            } else if (i4 < 19 && longValue >= f6518f[i4]) {
                sb.append('+');
            }
        } else {
            int i6 = c.f6513a[zVar.ordinal()];
            if (i6 == 1 || i6 == 2 || i6 == 3) {
                sb.append('-');
            } else if (i6 == 4) {
                throw new RuntimeException("Field " + ((Object) r02) + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i7 = 0; i7 < i4 - l3.length(); i7++) {
            sb.append('0');
        }
        sb.append(l3);
        return true;
    }

    boolean b(q qVar) {
        int i3 = this.f6523e;
        return i3 == -1 || (i3 > 0 && this.f6520b == this.f6521c && this.f6522d == z.NOT_NEGATIVE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f2, code lost:
        r2 = r16;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0137, code lost:
        if (r3 <= r8) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Enum, j$.time.temporal.s] */
    @Override // j$.time.format.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int o(j$.time.format.q r21, java.lang.CharSequence r22, int r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.o(j$.time.format.q, java.lang.CharSequence, int):int");
    }

    public String toString() {
        Enum r02 = this.f6519a;
        int i3 = this.f6521c;
        z zVar = this.f6522d;
        int i4 = this.f6520b;
        if (i4 == 1 && i3 == 19 && zVar == z.NORMAL) {
            return "Value(" + r02 + ")";
        } else if (i4 == i3 && zVar == z.NOT_NEGATIVE) {
            return "Value(" + r02 + "," + i4 + ")";
        } else {
            return "Value(" + r02 + "," + i4 + "," + i3 + "," + zVar + ")";
        }
    }
}

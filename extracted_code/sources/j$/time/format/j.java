package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j implements f {

    /* renamed from: d  reason: collision with root package name */
    static final String[] f6524d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e  reason: collision with root package name */
    static final j f6525e = new j("+HH:MM:ss", "Z");

    /* renamed from: f  reason: collision with root package name */
    static final j f6526f = new j("+HH:MM:ss", "0");

    /* renamed from: a  reason: collision with root package name */
    private final String f6527a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6528b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6529c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2) {
        int i3 = 0;
        while (true) {
            String[] strArr = f6524d;
            if (i3 < 22) {
                if (strArr[i3].equals(str)) {
                    this.f6528b = i3;
                    this.f6529c = i3 % 11;
                    this.f6527a = str2;
                    return;
                }
                i3++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.f
    public final boolean m(t tVar, StringBuilder sb) {
        Long e2 = tVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z3 = false;
        if (e2 == null) {
            return false;
        }
        long longValue = e2.longValue();
        int i3 = (int) longValue;
        if (longValue == i3) {
            String str = this.f6527a;
            if (i3 == 0) {
                sb.append(str);
            } else {
                int abs = Math.abs((i3 / 3600) % 100);
                int abs2 = Math.abs((i3 / 60) % 60);
                int abs3 = Math.abs(i3 % 60);
                int length = sb.length();
                sb.append(i3 < 0 ? "-" : "+");
                if (this.f6528b < 11 || abs >= 10) {
                    a(false, abs, sb);
                } else {
                    sb.append((char) (abs + 48));
                }
                int i4 = this.f6529c;
                if ((i4 >= 3 && i4 <= 8) || ((i4 >= 9 && abs3 > 0) || (i4 >= 1 && abs2 > 0))) {
                    a(i4 > 0 && i4 % 2 == 0, abs2, sb);
                    abs += abs2;
                    if (i4 == 7 || i4 == 8 || (i4 >= 5 && abs3 > 0)) {
                        if (i4 > 0 && i4 % 2 == 0) {
                            z3 = true;
                        }
                        a(z3, abs3, sb);
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(str);
                }
            }
            return true;
        }
        throw new ArithmeticException();
    }

    private static void a(boolean z3, int i3, StringBuilder sb) {
        sb.append(z3 ? ":" : "");
        sb.append((char) ((i3 / 10) + 48));
        sb.append((char) ((i3 % 10) + 48));
    }

    @Override // j$.time.format.f
    public final int o(q qVar, CharSequence charSequence, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int length = charSequence.length();
        int length2 = this.f6527a.length();
        if (length2 == 0) {
            if (i3 == length) {
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i3, i3);
            }
        } else if (i3 == length) {
            return ~i3;
        } else {
            if (qVar.r(charSequence, i3, this.f6527a, 0, length2)) {
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i3, i3 + length2);
            }
        }
        char charAt = charSequence.charAt(i3);
        if (charAt == '+' || charAt == '-') {
            int i8 = charAt == '-' ? -1 : 1;
            int i9 = this.f6529c;
            boolean z3 = i9 > 0 && i9 % 2 == 0;
            int i10 = this.f6528b;
            boolean z4 = i10 < 11;
            int[] iArr = new int[4];
            iArr[0] = i3 + 1;
            if (!qVar.k()) {
                if (z4) {
                    if (z3 || (i10 == 0 && length > (i7 = i3 + 3) && charSequence.charAt(i7) == ':')) {
                        i10 = 10;
                        z3 = true;
                    } else {
                        i10 = 9;
                    }
                } else if (z3 || (i10 == 11 && length > (i6 = i3 + 3) && (charSequence.charAt(i3 + 2) == ':' || charSequence.charAt(i6) == ':'))) {
                    i10 = 21;
                    z3 = true;
                } else {
                    i10 = 20;
                }
            }
            switch (i10) {
                case 0:
                case 11:
                    c(charSequence, z4, iArr);
                    break;
                case 1:
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                case 13:
                    c(charSequence, z4, iArr);
                    d(charSequence, z3, false, iArr);
                    break;
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                case 15:
                    c(charSequence, z4, iArr);
                    d(charSequence, z3, true, iArr);
                    break;
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                case 17:
                    c(charSequence, z4, iArr);
                    d(charSequence, z3, true, iArr);
                    b(charSequence, z3, 3, iArr);
                    break;
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                case 19:
                    c(charSequence, z4, iArr);
                    d(charSequence, z3, true, iArr);
                    if (!b(charSequence, z3, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence, z4, iArr);
                    if (b(charSequence, z3, 2, iArr)) {
                        b(charSequence, z3, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    e(charSequence, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence, 1, 6, iArr);
                    break;
            }
            int i11 = iArr[0];
            if (i11 > 0) {
                int i12 = iArr[1];
                if (i12 > 23 || (i4 = iArr[2]) > 59 || (i5 = iArr[3]) > 59) {
                    throw new RuntimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, ((i4 * 60) + (i12 * 3600) + i5) * i8, i3, i11);
            }
        }
        return length2 == 0 ? qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i3, i3) : ~i3;
    }

    private static void c(CharSequence charSequence, boolean z3, int[] iArr) {
        if (z3) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    private static void d(CharSequence charSequence, boolean z3, boolean z4, int[] iArr) {
        if (b(charSequence, z3, 2, iArr) || !z4) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    private static boolean b(CharSequence charSequence, boolean z3, int i3, int[] iArr) {
        int i4 = iArr[0];
        if (i4 < 0) {
            return true;
        }
        if (z3 && i3 != 1) {
            int i5 = i4 + 1;
            if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                return false;
            }
            i4 = i5;
        }
        int i6 = i4 + 2;
        if (i6 > charSequence.length()) {
            return false;
        }
        int i7 = i4 + 1;
        char charAt = charSequence.charAt(i4);
        char charAt2 = charSequence.charAt(i7);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i8 = (charAt2 - '0') + ((charAt - '0') * 10);
            if (i8 >= 0 && i8 <= 59) {
                iArr[i3] = i8;
                iArr[0] = i6;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        r12[0] = ~r12[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(java.lang.CharSequence r9, int r10, int r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.e(java.lang.CharSequence, int, int, int[]):void");
    }

    public final String toString() {
        String replace = this.f6527a.replace("'", "''");
        String str = f6524d[this.f6528b];
        return "Offset(" + str + ",'" + replace + "')";
    }
}

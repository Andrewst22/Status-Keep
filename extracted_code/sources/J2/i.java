package J2;
/* loaded from: classes.dex */
public abstract class i extends h {
    public static boolean Q(String str, String str2) {
        D2.i.e(str, "<this>");
        if (U(2, str, str2, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean R(String str, String str2, boolean z3) {
        D2.i.e(str, "<this>");
        if (!z3) {
            return str.endsWith(str2);
        }
        return X(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final int S(CharSequence charSequence) {
        D2.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int T(int i3, String str, String str2, boolean z3) {
        char upperCase;
        char upperCase2;
        D2.i.e(str, "<this>");
        D2.i.e(str2, "string");
        if (!z3) {
            return str.indexOf(str2, i3);
        }
        int length = str.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        G2.a aVar = new G2.a(i3, length, 1);
        boolean z4 = str instanceof String;
        int i4 = aVar.f387o;
        int i5 = aVar.f386n;
        int i6 = aVar.f385m;
        if (z4 && (str2 instanceof String)) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!X(0, i6, str2.length(), str2, str, z3)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
            return -1;
        }
        if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            loop1: while (true) {
                int length3 = str2.length();
                D2.i.e(str, "other");
                if (i6 >= 0 && str2.length() - length3 >= 0 && i6 <= str.length() - length3) {
                    for (int i7 = 0; i7 < length3; i7++) {
                        char charAt = str2.charAt(i7);
                        char charAt2 = str.charAt(i6 + i7);
                        if (charAt == charAt2 || (z3 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        }
                    }
                    break loop1;
                }
                if (i6 == i5) {
                    break;
                }
                i6 += i4;
            }
        }
        return -1;
    }

    public static /* synthetic */ int U(int i3, String str, String str2, boolean z3) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        return T(0, str, str2, z3);
    }

    public static int V(String str, char c3, boolean z3, int i3) {
        char upperCase;
        char upperCase2;
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        if (!z3) {
            return str.indexOf(c3, 0);
        }
        char[] cArr = {c3};
        if (!z3) {
            return str.indexOf(cArr[0], 0);
        }
        int S3 = S(str);
        if (S3 >= 0) {
            int i4 = 0;
            while (true) {
                char charAt = str.charAt(i4);
                char c4 = cArr[0];
                if (c4 != charAt && (!z3 || ((upperCase = Character.toUpperCase(c4)) != (upperCase2 = Character.toUpperCase(charAt)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                    if (i4 == S3) {
                        break;
                    }
                    i4++;
                }
            }
            return i4;
        }
        return -1;
    }

    public static boolean W(CharSequence charSequence) {
        D2.i.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            char charAt = charSequence.charAt(i3);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean X(int i3, int i4, int i5, String str, String str2, boolean z3) {
        D2.i.e(str, "<this>");
        D2.i.e(str2, "other");
        if (!z3) {
            return str.regionMatches(i3, str2, i4, i5);
        }
        return str.regionMatches(z3, i3, str2, i4, i5);
    }

    public static String Y(String str, String str2, String str3) {
        int T3 = T(0, str, str2, false);
        if (T3 >= 0) {
            int length = str2.length();
            int i3 = 1;
            if (length >= 1) {
                i3 = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i4 = 0;
                do {
                    sb.append((CharSequence) str, i4, T3);
                    sb.append(str3);
                    i4 = T3 + length;
                    if (T3 >= str.length()) {
                        break;
                    }
                    T3 = T(T3 + i3, str, str2, false);
                } while (T3 > 0);
                sb.append((CharSequence) str, i4, str.length());
                String sb2 = sb.toString();
                D2.i.d(sb2, "toString(...)");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static String Z(String str, String str2) {
        D2.i.e(str2, "delimiter");
        int U3 = U(6, str, str2, false);
        if (U3 != -1) {
            String substring = str.substring(str2.length() + U3, str.length());
            D2.i.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String a0(String str, String str2) {
        D2.i.e(str2, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, S(str));
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1, str.length());
            D2.i.d(substring, "substring(...)");
            return substring;
        }
        return str2;
    }
}

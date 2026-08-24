package M1;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f1054a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i3, char c3) {
        if (i3 < str.length() && str.charAt(i3) == c3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i3, int i4, String str) {
        int i5;
        int i6;
        if (i3 >= 0 && i4 <= str.length() && i3 <= i4) {
            if (i3 < i4) {
                i6 = i3 + 1;
                int digit = Character.digit(str.charAt(i3), 10);
                if (digit >= 0) {
                    i5 = -digit;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i3, i4));
                }
            } else {
                i5 = 0;
                i6 = i3;
            }
            while (i6 < i4) {
                int i7 = i6 + 1;
                int digit2 = Character.digit(str.charAt(i6), 10);
                if (digit2 >= 0) {
                    i5 = (i5 * 10) - digit2;
                    i6 = i7;
                } else {
                    throw new NumberFormatException("Invalid number: " + str.substring(i3, i4));
                }
            }
            return -i5;
        }
        throw new NumberFormatException(str);
    }
}

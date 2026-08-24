package b1;

import U.t;
import java.util.regex.Pattern;
/* renamed from: b1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212b {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f4636c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f4637d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    public final t f4638a = new t();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f4639b = new StringBuilder();

    public static String a(t tVar, StringBuilder sb) {
        boolean z3 = false;
        sb.setLength(0);
        int i3 = tVar.f2478b;
        int i4 = tVar.f2479c;
        while (i3 < i4 && !z3) {
            char c3 = (char) tVar.f2477a[i3];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && ((c3 < '0' || c3 > '9') && c3 != '#' && c3 != '-' && c3 != '.' && c3 != '_'))) {
                z3 = true;
            } else {
                i3++;
                sb.append(c3);
            }
        }
        tVar.H(i3 - tVar.f2478b);
        return sb.toString();
    }

    public static String b(t tVar, StringBuilder sb) {
        c(tVar);
        if (tVar.a() == 0) {
            return null;
        }
        String a3 = a(tVar, sb);
        if (!"".equals(a3)) {
            return a3;
        }
        return "" + ((char) tVar.u());
    }

    public static void c(t tVar) {
        while (true) {
            for (boolean z3 = true; tVar.a() > 0 && z3; z3 = false) {
                int i3 = tVar.f2478b;
                byte[] bArr = tVar.f2477a;
                byte b3 = bArr[i3];
                char c3 = (char) b3;
                if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                    int i4 = tVar.f2479c;
                    int i5 = i3 + 2;
                    if (i5 <= i4) {
                        int i6 = i3 + 1;
                        if (b3 == 47 && bArr[i6] == 42) {
                            while (true) {
                                int i7 = i5 + 1;
                                if (i7 >= i4) {
                                    break;
                                } else if (((char) bArr[i5]) == '*' && ((char) bArr[i7]) == '/') {
                                    i5 += 2;
                                    i4 = i5;
                                } else {
                                    i5 = i7;
                                }
                            }
                            tVar.H(i4 - tVar.f2478b);
                        }
                    }
                } else {
                    tVar.H(1);
                }
            }
            return;
        }
    }
}

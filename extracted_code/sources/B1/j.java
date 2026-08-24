package b1;

import R.H;
import U.A;
import U.t;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4683a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(t tVar) {
        tVar.getClass();
        String i3 = tVar.i(C1.d.f153c);
        if (i3 != null && i3.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i3 = A.f2405a;
        String[] split = str.split("\\.", 2);
        long j3 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j3 = (j3 * 60) + Long.parseLong(str2);
        }
        long j4 = j3 * 1000;
        if (split.length == 2) {
            j4 += Long.parseLong(split[1]);
        }
        return j4 * 1000;
    }

    public static void d(t tVar) {
        int i3 = tVar.f2478b;
        if (a(tVar)) {
            return;
        }
        tVar.G(i3);
        throw H.a(null, "Expected WEBVTT. Got " + tVar.i(C1.d.f153c));
    }
}

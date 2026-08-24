package k0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: k0.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539B {

    /* renamed from: c  reason: collision with root package name */
    public static final C0539B f7501c = new C0539B(0, -9223372036854775807L);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f7502d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a  reason: collision with root package name */
    public final long f7503a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7504b;

    public C0539B(long j3, long j4) {
        this.f7503a = j3;
        this.f7504b = j4;
    }

    public static C0539B a(String str) {
        long parseFloat;
        long parseFloat2;
        Matcher matcher = f7502d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = z.f7693a;
        if (matches) {
            String group = matcher.group(1);
            if (group != null) {
                int i3 = U.A.f2405a;
                if (group.equals("now")) {
                    parseFloat = 0;
                } else {
                    parseFloat = Float.parseFloat(group) * 1000.0f;
                }
                String group2 = matcher.group(2);
                if (group2 != null) {
                    try {
                        parseFloat2 = Float.parseFloat(group2) * 1000.0f;
                        if (parseFloat2 < parseFloat) {
                            throw R.H.b(str, null);
                        }
                    } catch (NumberFormatException e2) {
                        throw R.H.b(group2, e2);
                    }
                } else {
                    parseFloat2 = -9223372036854775807L;
                }
                return new C0539B(parseFloat, parseFloat2);
            }
            throw R.H.b(str, null);
        }
        throw R.H.b(str, null);
    }
}

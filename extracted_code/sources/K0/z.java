package k0;

import D1.I;
import D1.J;
import D1.b0;
import D1.q0;
import U.AbstractC0123a;
import android.net.Uri;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f7693a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f7694b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f7695c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f7696d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f7697e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f7698f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g  reason: collision with root package name */
    public static final String f7699g = new String(new byte[]{10});

    /* renamed from: h  reason: collision with root package name */
    public static final String f7700h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c3 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c3 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c3 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c3 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c3 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c3 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c3 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c3 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c3 = 11;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return 8;
            case 1:
                return 12;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return 7;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 9;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 11;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return 5;
            case '\t':
                return 10;
            case '\n':
                return 1;
            case 11:
                return 2;
            default:
                return 0;
        }
    }

    public static b0 b(String str) {
        if (str == null) {
            D1.G g3 = I.f197n;
            return b0.f231q;
        }
        D1.r.e("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i3 = U.A.f2405a;
        int i4 = 0;
        for (String str2 : str.split(",\\s?", -1)) {
            int a3 = a(str2);
            if (a3 != 0) {
                Integer valueOf = Integer.valueOf(a3);
                int i5 = i4 + 1;
                if (objArr.length < i5) {
                    objArr = Arrays.copyOf(objArr, D1.C.e(objArr.length, i5));
                }
                objArr[i4] = valueOf;
                i4 = i5;
            }
        }
        return I.h(i4, objArr);
    }

    public static E0.c c(String str) {
        long parseInt;
        Matcher matcher = f7696d.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            if (group2 != null) {
                try {
                    parseInt = Integer.parseInt(group2) * 1000;
                } catch (NumberFormatException e2) {
                    throw R.H.b(str, e2);
                }
            } else {
                parseInt = 60000;
            }
            return new E0.c(group, parseInt, 6);
        }
        throw R.H.b(str, null);
    }

    public static c0.t d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i3 = U.A.f2405a;
        String[] split = userInfo.split(":", 2);
        return new c0.t(1, split[0], split[1]);
    }

    public static U.r e(String str) {
        Matcher matcher = f7697e.matcher(str);
        String str2 = "";
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            if (group3 != null) {
                str2 = group3;
            }
            return new U.r(2, group, group2, str2);
        }
        Matcher matcher2 = f7698f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new U.r(1, group4, "", "");
        }
        throw R.H.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String authority = uri.getAuthority();
        authority.getClass();
        AbstractC0123a.e(authority.contains("@"));
        int i3 = U.A.f2405a;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }

    public static b0 g(C0538A c0538a) {
        boolean z3;
        if (c0538a.f7499c.c("CSeq") != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        D1.F f3 = new D1.F();
        f3.c(U.A.o("%s %s %s", h(c0538a.f7498b), c0538a.f7497a, "RTSP/1.0"));
        J a3 = c0538a.f7499c.a();
        q0 it = a3.e().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            I d3 = a3.d(str);
            for (int i3 = 0; i3 < d3.size(); i3++) {
                f3.c(U.A.o("%s: %s", str, d3.get(i3)));
            }
        }
        f3.c("");
        f3.c(c0538a.f7500d);
        return f3.g();
    }

    public static String h(int i3) {
        switch (i3) {
            case 1:
                return "ANNOUNCE";
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "DESCRIBE";
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "GET_PARAMETER";
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return "OPTIONS";
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return "PAUSE";
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "PLAY";
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "PLAY_NOTIFY";
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
